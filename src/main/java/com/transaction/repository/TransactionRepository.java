package com.transaction.repository;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.time.Instant;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.transaction.model.Statistics;
import com.transaction.model.Transaction;

@Component
public class TransactionRepository {
	private ConcurrentNavigableMap<Long, List<Transaction>> transactions = new ConcurrentSkipListMap<>();

	public void add(Transaction transaction) {
		Long transactionSecond = transaction.getTimeStamp();
		List<Transaction> transactionsAtthisSecond = transactions.getOrDefault(transactionSecond,
				new ArrayList<Transaction>());
		transactionsAtthisSecond.add(transaction);
		transactions.put(transactionSecond, transactionsAtthisSecond);

	}

	public List<Transaction> getRecentTransactions() {
		Long lastonMinuteepoch = Instant.now().minusSeconds(60L).getEpochSecond();
		
		

		List<Transaction> a = transactions.entrySet().stream().filter(x -> x.getKey() > lastonMinuteepoch)
				.map(x -> x.getValue()).flatMap(List::stream).collect(Collectors.toList());

		System.out.println("   " + a.size());

		return a;
	}

	public Statistics getstats() {

		List<Transaction> trans = getRecentTransactions();
		DoubleSummaryStatistics stats = trans.stream().mapToDouble(Transaction::getAmount).summaryStatistics();

		return new Statistics(stats.getMin(), stats.getMax(), stats.getAverage(), stats.getCount(), stats.getSum());

	}

}

package com.transaction.model;

public class Statistics {

	Double min;
	Double max;
	Double avg;
	Long count;
	Double sum;

	public Statistics(Double min, Double max, Double avg, Long count, Double sum) {
		super();
		this.min = min;
		this.max = max;
		this.avg = avg;
		this.count = count;
		this.sum = sum;
	}

	

	public Double getMin() {
		return min;
	}

	public void setMin(Double min) {
		this.min = min;
	}

	public Double getMax() {
		return max;
	}

	public void setMax(Double max) {
		this.max = max;
	}

	public Double getAvg() {
		return avg;
	}

	public void setAvg(Double avg) {
		this.avg = avg;
	}

	public Long getCount() {
		return count;
	}

	public void setCount(Long count) {
		this.count = count;
	}

	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}

}

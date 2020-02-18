package google;

import java.time.Instant;
import java.util.Date;

//
//import java.util.ArrayList;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//
public class ooptests {
	//
	//
	// public class library
	// {
	// private ArrayList<book> bks;
	// public library()
	// {
	// bks=new ArrayList<>();
	// }
	// public void add(book b)
	// {
	// bks.add(b);
	// }
	// }
	// public static class book
	// {
	// private String name;
	//
	// public String getName() {
	// return name;
	// }
	//
	// public void setName(String name) {
	// this.name = name;
	// }
	//
	// }
	//
	public static void main(String args[]) {
		Instant before=Instant.now() ;
		String s = "snehasnehasnehasnehasnehasnehasnehasnehasnehasnehasnehasnehasnehasnehasnehasnehasnehasnehasnehasnehasnehasnehasnehasnehasnehasnehasnehasnehasnehasnehasnehasnehasnehasnehasnehasnehasnehasnehasnehasnehasnehasnehasnehasnehasnehasnehasnehasnehasnehasnehasnehasnehasnehasneha";
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.substring(0, i+1));

		}
		Instant after=Instant.now();
		System.out.println(after);

	}
	//

}

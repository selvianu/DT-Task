package toDoTask;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Exceptions {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		checkedException_throws();

		uncheckedException_throw();
	}

	public static void uncheckedException_throw() {
		// unchecked exception - ArrayOutOfBounds, not handled and also not checked
		// during compile time.
		// all unchecked exception are subclass of RunTimeException
		int num1[] = { 5, 2, 9, 6 };
		try {
			System.out.println(num1[6]);
			throw new ArrayIndexOutOfBoundsException();
		} finally {
			System.out.println("exception using throw keyword");
		}
	}

	public static void checkedException_throws() throws SQLException {
		// checked exception - SQLException, ClassNotFoundException , either it has to
		// be declared by using throws keyword,
		// or it must be handled with try and catch.
		try {
			Class.forName("org.h2.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/Demo", "sa", "");
		System.out.println("Exception using throws keyword");
		System.out.println(con);
	}

}

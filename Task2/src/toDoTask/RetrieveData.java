package toDoTask;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class RetrieveData {

	public static void main(String[] args) throws SQLException {

		// Class.forName("org.h2.Driver");
		String url = "jdbc:h2:tcp://localhost/~/Demo";
		String username = "sa";
		String pass = "";
		String query = "select * from student";
		Connection con = DriverManager.getConnection(url, username, pass);
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery(query);
		ArrayList<Object> al=new ArrayList<>();
		System.out.println("the data from the database: ");
		while (rs.next()) {

			al.add(rs.getInt(1));
			al.add(rs.getString(2));
			for (Object o1 : al) {
				System.out.println(o1);
				
			}
		}
	}

}

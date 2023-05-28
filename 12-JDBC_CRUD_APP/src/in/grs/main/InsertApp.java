package in.grs.main;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import in.grs.util.JdbcUtil;


public class InsertApp {

	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement pstmt = null;
		Scanner scanner = null;

		try {
			connection = JdbcUtil.getJdbcConnection();

			String sqlInsertQuery = "insert into student1(`sname`,`sage`,`saddress`)values(?,?,?)";
			if (connection != null)
				pstmt = connection.prepareStatement(sqlInsertQuery);

			if (pstmt != null) {

				scanner = new Scanner(System.in);

				System.out.print("Enter the name of the student :: ");
				String sname = scanner.next();

				System.out.print("Enter the age of the student :: ");
				int sage = scanner.nextInt();

				System.out.print("Enter the address of the student :: ");
				String address = scanner.next();


				// use precompiled query to set the values
				pstmt.setString(1, sname);
				pstmt.setInt(2, sage);
				pstmt.setString(3, address);

				System.out.println(sqlInsertQuery);

				// execute the query
				int rowCount = pstmt.executeUpdate();
				System.out.println("No of rows updated is :: " + rowCount);
			}

		} catch (IOException ie) {
			ie.printStackTrace();
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				JdbcUtil.cleanUp(connection, pstmt, null);
				scanner.close();
				System.out.println("Closing the resource...");
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}
}

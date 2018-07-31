package databaseconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	public static void main(String[] args) throws SQLException {
		// ����ϰ��� �ϴ� ����̹� Ŭ������ �ε�
		// �����ͺ��̽� ������ ���� �ٸ�

		// �����ͺ��̽� ���� ���� ����
		// �ݵ�� close()�� ȣ���ؾ� �ϹǷ� finally���� close()�� ȣ��
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
			System.out.println(con);

		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} finally {
			// ������ �Ǿ� ������ �ݵ�� ���� ����
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
				}
			}
		}

	}

}

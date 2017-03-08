package kr.or.dgit.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	private static final ConnectionFactory instance = new ConnectionFactory();

	private ConnectionFactory() {
		try {
			Class.forName("com.mysql.jdbc.Driver"); 
			// mysql 아래 com.mysql 블라블라들 중에서 "com.mysql.jdbc.Driver"를 불러 온다.. 
			// DriverManager를 쓰기위해서 불러온 것...최신버전은 안 써도 사용가능
		} catch (ClassNotFoundException e) {
			System.err.println("MySQl Driver not Found!!");
			System.exit(-1);
		}
		
	}
	
	public static Connection getConnection(){
		return instance.createConnectioin();
	}

	private Connection createConnectioin() {
		Connection connection = null;
		String url="jdbc:mysql://localhost:3306/mybatis";
		String user = "user_mybatis";
		String password = "rootroot";
		try {
			connection = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			System.err.println("Error : Unable to Connection DataBase");
		}
		return connection;
	}
	
	
}

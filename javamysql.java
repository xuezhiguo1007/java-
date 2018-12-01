package com.runoob.test;

public class MySQLDemo {
	//JDBC驱动及数据库URL
	static final String JDBC_DRIVER="com.mysql.jdbc.Driver";
	static final String DB_URL="jdbc:mysql://localhost:3306/RUNOOB";
	//数据库的用户名与密码，需要自己设置
	static final String USER="root";
	static final String PASS="123456789";
	public static void main(String[] args) {
		Connection conn=null;
		Statement stmt=null;
		try {
			//注册JDBC驱动
			Class.forName("com.mysql.jdbc.Driver");
			//打开链接
			System.out.println("连接数据库...");
			conn=DriverManager.getConnection(DB_URL,USER,PASS);
			//执行查询
			System.out.println("实例化Statement对象...");
			stmt=conn
		}
	}
}

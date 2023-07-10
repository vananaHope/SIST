package frontWeb;

import java.sql.*;

//데이터 베이스 연결과 자원해제 예외 처리를 위한 클래스
/*
1. 이 클래스는 무엇을 위한 클래스인가
	데이터베이스를 연결하고 자원해제에 대한 
	예외를 처리해주기 위한 클래스(객체로 사용하기 위해서 정의)
	
2. DB 연결을 위해서 필요로 하는 순서는 무엇인가?
	드라이버 호출
	드라이버를 통해서 서버에 연결처리 Connection (java.sql.*)
	대화 객체(Statement) : sql 처리
	결과 객체(ResultSet) : 처리결과를 받는 객체(data)
	
3. jdbc는 어떤 역할을 하는 클래스이고, 이것을 실제 객체화를 위해서 어떤 처리를 하는가?
	jdbc(각 밴드-서버회사 공통된 코드를 만들어 컴파일시켜 압축 전달)
	이 클래스가 객체화된 내용을 통해서 서버에 접속하는데,
	서버에 접속할 핸들링하는 도구가(java.sql.*) 
	
4. DB연결에 필요로하는 정보는 무엇이고, 이것은 어떤 클래스에 의해 처리되는가?
	서버의 접속 정보 : 어떤 jdbc 드라이버를 이용해서 
	특정한 위치(ip-localhost), 구분되는 port,
	DB이름(데이터베이스 식별자), 계정, 비밀번호
	String info = "jdbc:oracle:thin:@localhost:1521:xe";
	con = DriverManager.getConnection(info,"scott","tiger");
	ex) jdbc 드라이버를 로봇이라고하면 java.sql.*이 로봇을
		작동하는 도구
		
5. 데이터베이스 처리를 위한 예외처리는 무엇을 해야하는가?
	   작은 범위 : SQLException
	    	순수하게 java.sql.* 패키지 사용을 하기 위한 예외 처리
	   중간 범위 : Class.for("")
	    	jdbc 드라이버를 사용하는 예외처리
	   큰 범위 : DB 처리 코드를 통해서 발생하는 모든 예외 처리
	    		Exception 
*/			

public class DB2 {
	// 연결 객체 선언
	public static Connection con() throws SQLException {
		Connection con = null;
	//	1. 메모리 로딩(ClassNotFoundException 처리)
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("jdbc드라이버 예외: "+e.getMessage());
		}
		
	// 	2. 연결정보 처리
		String info = "jdbc:oracle:thin:@localhost:1521:xe";
		con = DriverManager.getConnection(info,"scott","tiger");
		System.out.println("DB 접속 성공!!");
		return con;
	}
	// 자원해제 예외 처리
	public static void close(ResultSet rs, Statement stmt, Connection con) {
			try {
				if(rs != null)
					rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			try {
				if(stmt != null)
					stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			try {
				if(con != null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		System.out.println("자원해제 완료!");
	
	}
	public static void main(String[] args) {
		try {
			con();
		}catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(null,null,null);
		}
	}
}
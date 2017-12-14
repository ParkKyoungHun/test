package p17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

public class ConnectionExam {

	public static void main(String[] args) {
		String url = "jdbc:mariadb://localhost:3306/iot2";
		String user = "root";
		String password = "r1r2r3";
		Connection con = null;
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			con = DriverManager.getConnection(url, user, password);
			System.out.println("연결성공");
			String sql = "select * from user_info";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.executeQuery();
			ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			ResultSetMetaData  rsmd = rs.getMetaData();
			int max = rsmd.getColumnCount();
			for(int i=1;i<=max;i++) {
				String column = rsmd.getColumnName(i);
				String type = rsmd.getColumnTypeName(i);
				if(type.equals("INTEGER")) {
					type = "Integer";
				}else if(type.equals("VARCHAR")) {
					type = "String";
				}
				System.out.println("private " + type + " " + column + ";");
			}
			ArrayList<UserInfo> al = new ArrayList<UserInfo>();
			while(rs.next()) {
				UserInfo ui = new UserInfo();
				ui.setUserage(rs.getInt("userage"));
				ui.setUserno(rs.getInt("userno"));
				ui.setUsername(rs.getString("username"));
				ui.setUserid(rs.getString("userid"));
				ui.setUserpwd(rs.getString("userpwd"));
				al.add(ui);
			}
			for(UserInfo ui : al) {
				System.out.println(ui);
			}
			rs.close();
			rs = null;
			ps.close();
			ps = null;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				con = null;
			}
		}
	}
}

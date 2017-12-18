package p18;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

public class UserList {

	public static void main(String[] args) {
		Connector c = null;
		try {
			c = new Connector();
			Connection con = c.getConnection();
			String sql = "select * from class_info ci, user_info";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			String[] colNames = new String[rsmd.getColumnCount()];

			for(int i=0;i<colNames.length;i++) {
				colNames[i] = rsmd.getColumnLabel(i+1);
			}
			ArrayList<HashMap<String,Object>> objList 
			= new ArrayList<HashMap<String,Object>>();
			
			while(rs.next()) {
				HashMap<String,Object> hm = new HashMap<String,Object>();
				for(String colName : colNames) {
					hm.put(colName, rs.getString(colName));
				}
				objList.add(hm);
			}
			for(HashMap<String,Object>hm : objList) {
				System.out.println(hm);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(c!=null) {
				try {
					c.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

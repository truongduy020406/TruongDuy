/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChuongTrinhQuanLy;

/**
 *
 * @author Admin
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class KetNoiSQLServer {
    static String url = "jdbc:sqlserver://localhost:1433;"
            + "databaseName=QuanLySach;"
            + "integratedSecurity=true";
	static String user="sa";
	static String password="12345";
	public static Connection getConnection() {// connection function
		Connection connection=null;
		try {
			connection=DriverManager.getConnection(url,user,password);
		}catch(Exception ex) {
		ex.printStackTrace();
	}
		return connection;
}
	public static List<Sach>findAll(){
		List<Sach>SachtList= new ArrayList<>();
		String query="select*from Sach";
		try {
			Connection connection =getConnection();
			Statement stmt= connection.createStatement();
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next()) {
				Sach st=new Sach(rs.getString("MaSach"),rs.getString("TenSach"),rs.getInt("NamSuatBan"),
						rs.getString("NhaXuatBan"),rs.getDouble("Tien"),rs.getInt("TinhTrang"));
				SachtList.add(st);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return SachtList;
	}
	public static void insert(Sach st) {
		String query="insert into Sach(MaSach,TenSach,NamSuatBan,NhaXuatBan,tien,TinhTrang) values(?,?,?,?,?,?)";
		try {
			Connection connection =getConnection();
			PreparedStatement pstmt=connection.prepareStatement(query);
			pstmt.setString(1, st.getsmaSach());
			pstmt.setString(2, st.getName());
			pstmt.setInt(3, st.getNam());
			pstmt.setString(4, st.getNhaXuatBan());
			pstmt.setDouble(5, st.gettien());
                        pstmt.setInt(6, st.gettinhtrang());
			pstmt.execute();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static void delete(Sach st) {
		String query="delete from Sach where MaSach='"+st.getsmaSach()+"'";
		try {
			Connection connection =getConnection();
			PreparedStatement pstmt=connection.prepareStatement(query);
			pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static void Update(Sach st) {
		String query="Update Sach set MaSach=?,TenSach=?,NamSuatBan=?,NhaXuatBan=?,tien=?,TinhTrang=? where MaSach='"+st.getsmaSach()+"'";
		try {
			Connection connection=getConnection();
			PreparedStatement pstmt=connection.prepareStatement(query);
			pstmt.setString(1, st.getsmaSach());
			pstmt.setString(2, st.getName());
			pstmt.setInt(3, st.getNam());
			pstmt.setString(4, st.getNhaXuatBan());
			pstmt.setDouble(5, st.gettien());
                        pstmt.setInt(6, st.gettinhtrang());
			pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static List<Sach>findByName(Sach s) {
		List<Sach>Sach1  = new ArrayList<>();
		String query="select * from Sach where Sach.MaSach='"+s.getsmaSach()+"'";
		try {
			Connection connection =getConnection();
			Statement stmt= connection.createStatement();
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next()) {
				Sach st=new Sach(rs.getString("MaSach"),rs.getString("TenSach"),rs.getInt("NamSuatBan"),
						rs.getString("NhaXuatBan"),rs.getDouble("Tien"),rs.getInt("TinhTrang"));
				Sach1.add(st);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return Sach1;
	}
}



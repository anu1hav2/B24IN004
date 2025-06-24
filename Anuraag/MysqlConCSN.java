import java.sql.*;
class MysqlConCSN{
public static void main(String args[]){
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/SSIP","root","password");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from students");
			while(rs.next())
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "
			+rs.getString(3));
			con.close();
}catch(Exception e){System.out.println(e);}
}
}
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.Statement;

public class DBConnect {

	public int insert(String cname, String cemail, String cpass, int cid)
	{
		
		String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";//mysql driver name
		
		String URL = "jdbc:mysql://localhost:3306/database_Name?autoReconnect=true&useSSL=false";//mysql schema name
		String user = "root";// mysql workbench default user name
		String password = "root";//mysql workbenchdefault password
		
		int row_update = 0;
		
		try
		{
			Class.forName(DRIVER_NAME);// coming from ext lib

			Connection con = DriverManager.getConnection(URL, user, password);
			Statement stmt = con.createStatement();
			
			//insert quesry
			row_update = stmt.executeUpdate("insert into customer(cid,cname,cpass,cemail) values("+cid+",'"+cname+"','"+cpass+"','"+cemail+"')");
			//if row_update == 1 -> success | if row_update == 0 -> fails
			System.out.println("Row update:"+row_update);
			
			return row_update;
			
		}
		catch(Exception ex)
		{
			System.out.println("DB error :"+ex);
		}
		
	return row_update;
		
	}
	
	public int login(String uname , String pass)
	{
		String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";//mysql driver name
		
		String URL = "jdbc:mysql://localhost:3306/tta?autoReconnect=true&useSSL=false";//mysql schema name
		String user = "root";// mysql workbench user name
		String password = "root";//mysql workbench password
		
		int row_check = 0;
		
		try
		{
			Class.forName(DRIVER_NAME);// coming from ext lib

			Connection con = DriverManager.getConnection(URL, user, password);
			Statement stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery("select * from customer where cname='"+uname+"' and cpass='"+pass+"'");
			
			if(rs.next())
			{
				row_check = 1;
			}
			
		}
		catch(Exception ex)
		{
			System.out.println("DB error :"+ex);
		}
		return row_check;
	}
	
	
}

































import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Homework", "root", "ROOT-Password");
		Statement stmt = con.createStatement();
		// statement + prepared statement (when we pass variable values)
        String preparedQuery ="INSERT INTO Manager values(?,?,?,?)";
        int id;
        String name;
        String shift;
        Double salary;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your ID");
		id = sc.nextInt();
		System.out.println("Please enter your name");
		name = sc.next();
		System.out.println("Please enter your shift");
		shift = sc.next();
		System.out.println("Please enter your salary");
		salary = sc.nextDouble();
		PreparedStatement ps = con.prepareStatement(preparedQuery);
		ps.setString(1, name);
		ps.setString(2, shift);
		ps.setDouble(3, salary);
		ps.setInt(4, id);
		ps.executeUpdate();
		String query = "SELECT * FROM Manager";
        if(con != null) {
        	
        }
		ResultSet result = stmt.executeQuery(query);
		while(result.next())
		{
			System.out.println("Manager id : "+result.getInt("mid"));
			System.out.println("Manager name : "+result.getString("name"));
			System.out.println("Manager shift : "+result.getString("shift"));
			System.out.println("Manager salary : "+result.getDouble("salary"));
		}
		System.out.println("=====");
     
	}

}

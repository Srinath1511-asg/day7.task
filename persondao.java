package persondao;
import persondto.persondto;

import java.sql.*;

import persondto.persondto;

public class persondao {
	public static  Connection getconnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/maven1","root","srinath");
		return connection;
	}
	public static void insertperson(persondto person) throws SQLException, ClassNotFoundException {
		Connection connection=getconnection();
		PreparedStatement preparedStatement=connection.prepareStatement("insert into person values(?,?,?,?)");
		preparedStatement.setInt(1, person.getPersonid());
		preparedStatement.setString(2, person.getPersonname());
		preparedStatement.setInt(3, person.getPersonage());
		preparedStatement.setString(4, person.getPersonaddress());
		preparedStatement.execute();
		connection.close();
	}
	public static void deleteperson() throws ClassNotFoundException, SQLException {
		Connection con=getconnection();
		PreparedStatement preparedStatement=con.prepareStatement("delete from person where personname='srinath'");
		preparedStatement.execute();
		con.close();
		System.out.println("deleted successfully");
	}
	public static void updateperson(persondto person) throws ClassNotFoundException, SQLException {
		Connection connection=getconnection();
		PreparedStatement preparedStatement=connection.prepareStatement("update person set personname='kumar' where personname='bharath'");
		preparedStatement.execute();
		connection.close();
		System.out.println("ssss");
	
	}

}

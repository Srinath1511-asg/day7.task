package insertmain;
import java.sql.SQLException;
import java.util.*;

import persondao.persondao;
import persondto.persondto;

public class insertmain {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the personid");
		int id=scanner.nextInt();
		System.out.println("enter the person name");
		String name=scanner.next();
		System.out.println("enter the person age");
		int age=scanner.nextInt();
		System.out.println("enter the person address");
		String address=scanner.next();
		
		
		
		persondto person=new persondto();
		person.setPersonid(id);
		person.setPersonname(name);
		person.setPersonage(age);
		person.setPersonaddress(address);
		
		persondao person1=new persondao();
	person1.insertperson(person);
	System.out.println("successfully inserted");
		
		
	//	persondao.deleteperson();
	//	persondao.updateperson(person);
		
		
		
		
	}

}

package insertmain;

import java.sql.SQLException;

import persondao.persondao;
import persondto.persondto;

public class Update {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		persondao a=new persondao();
		
		persondto person=new persondto();
		a.updateperson(person);
	}

}

package insertmain;

import java.sql.SQLException;

import persondao.persondao;

public class Delete {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		persondao a=new persondao();
		a.deleteperson();
	}

}

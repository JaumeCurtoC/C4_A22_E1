package AppMain;
import vista.*;
import controllers.*;
import models.Clientes;
import models.ConexionSQL;

public class App 
{
    public static void main( String[] args )
    {
    	ConexionSQL csql = new ConexionSQL();
    	Clientes c = new Clientes();
    	
    	ControladorDB cdb = new ControladorDB(csql, c);
    	cdb.iniciarDB();
    	
    }
}

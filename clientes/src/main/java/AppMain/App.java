package AppMain;
import vista.*;
import controllers.*;

public class App 
{
    public static void main( String[] args )
    {
    	ControladorDB cdb = new ControladorDB();
    	cdb.iniciarDB();
    	
       ClienteFrame cf = new ClienteFrame();
    }
}

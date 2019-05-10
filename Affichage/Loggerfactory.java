package pack;
import java.util.*;
import java.util.logging.Logger;

public class Loggerfactory extends AbstractLoggerfactory {
   private boolean A;
    
    public Loggerfactory(boolean b) {
        // TODO Auto-generated constructor stub
        this.A=b;
    }

    @Override
    public Ilogger createLogger() {
        Ilogger B;
        if(A==true) {
            B=new ProduitConsole();
        }else {
            B=new ProduitText();
        }
        return B;
    }
    
   
        
       
    



    
    }

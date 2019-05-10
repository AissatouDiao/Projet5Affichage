package pack;

import java.io.IOException;

public class User {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
       AbstractLoggerfactory factory= new Loggerfactory(false);
       Ilogger yu=factory.createLogger();
     yu.service("hello");
    }

}

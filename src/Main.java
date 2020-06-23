import chp8.Interface.DnP.*;

public class Main{
   public static void main(String[] args) throws Exception{
       Driver driver = new Driver();
      
       driver.drive(new Bus());
       driver.drive(new Texi());
       
       Vehicle vehicle = new Bus();
       Bus bus = (Bus) vehicle;
       
       vehicle.run();
       bus.checkFare();
       }
}

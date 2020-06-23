package chp8.Interface.DnP;

public class Driver {
    public void drive(Vehicle v){
        if(v instanceof Bus){
            Bus bus = (Bus) v;
            bus.checkFare();
        }
        v.run();
    }
}

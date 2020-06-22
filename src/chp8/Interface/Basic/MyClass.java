package chp8.Interface.Basic;

public class MyClass {
    public RemoteControl rc = new smartTeleviosn();
    
    public MyClass(){}
    
    public MyClass(RemoteControl rc){
        this.rc = rc;
        rc.turnOn();
        rc.setVolume(5);
    }
    public void methodA(){
        RemoteControl rc = new Audio();
        rc.turnOn();
        rc.setVolume(8);
    }
    public void methodB(RemoteControl rc){
        rc.turnOn();
        rc.setVolume(7);
    }
    
}

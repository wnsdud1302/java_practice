package chp7;

public class Car {
    public Tire frontLeftTire = new Tire("앞왼쪽", 6);
    public Tire frontRightTire = new Tire("앞오른쪽", 2);
    public Tire backLeftTire = new Tire("뒷왼쪽", 3);
    public Tire backRightTire  = new Tire("뒷오른쪽", 4);
    
    public int run(){
        System.out.println("자동차가 달립니다");
        if(frontLeftTire.roll() == false){
            stop();
            return 1;
        }
        if(frontRightTire.roll() == false){
            stop();
            return 2;
        }
        if(backLeftTire.roll() == false){
            stop();
            return 3;
        }
        if(backRightTire.roll() == false){
            stop();
            return 4;
        }
        return 0;
    }
    
    public void stop(){
        System.out.println("자동차가 멈춥니다.");
    }
}

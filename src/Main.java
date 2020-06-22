import chp8.Interface.Basic.*;

public class Main{
   public static void main(String[] args) throws Exception{
       
       System.out.println("------------");
       
       MyClass m1 = new MyClass();
       m1.rc.turnOn();
       m1.rc.setVolume(6);
       
       System.out.println("------------");
       
       MyClass m2 = new MyClass(new Audio());
       
       System.out.println("------------");
       
       MyClass m3 = new MyClass();
       m3.methodA();
       
       System.out.println("------------");
       
       MyClass m4 = new MyClass();
       m4.methodB(new smartTeleviosn());
       
       System.out.println("------------");
       
       }
}

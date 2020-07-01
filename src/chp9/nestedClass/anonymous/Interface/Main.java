package chp9.nestedClass.anonymous.Interface;

public class Main {
   public static void main(String[] args) throws Exception{
       Anonymous anony = new Anonymous();
       
       anony.field.turnOn();
       
       anony.method1();
       
       anony.method2(
           new RemoteControl(){
               @Override
               public void turnOn(){
                   System.out.println("SmartTV를 킵니다.");
               }
               @Override
               public void turnOff(){
                   System.out.println("SmartTV를 끕니다.");
               }
           }
       );
       
       Window w = new Window();
       w.button1.touch();
       w.button2.touch();
       
       }
}

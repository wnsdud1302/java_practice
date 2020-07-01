import chp9.nestedClass.anonymous.Interface.*;

public class Main {
   public static void main(String[] args) throws Exception{
       Anonymous anony = new Anonymous();
       
       anony.field.turnOn();
       
       anony.method1();
       
       Window w = new Window();
       w.button1.touch();
       w.button2.touch();
       
       
       }
}

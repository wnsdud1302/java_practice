package chp6;

public class Printer {
    
    public void println(int i){
        System.out.printf("%d\n", i);
    }
    public void println(double d){
        System.out.printf("%f\n", d);
    }
    public void println(boolean b){
        if(b == true){
           System.out.printf("%s\n", b);
        }
        else{
            System.out.printf("%s\n", b);
        }
    }
    public void println(String s){
        System.out.printf("%s\n", s);
    }
}

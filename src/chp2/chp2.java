package chp2;

public class chp2 {
    public void LongExample(){
        long  var1 = 10;
        long var2 = 20L;
        long var3 = 10000000000L;
        
        System.out.println(var1 + " " + var2 + " " + var3);
    }
    public void CharExample(){
        char A1 = 'A';
        int A2 = 'A';
        System.out.println(A1 + " " + A2);
    }
    public void PrintfExample(){
        System.out.printf("이름 : %s\n", "박준영");
        System.out.printf("나이 : %d\n", 25);
        System.out.printf("이름 : %s, 나이 : %d\n", "박준영", 25);
    }
    public void KeycodeExample() throws Exception{
        int keycode;
        
        keycode= System.in.read();
        System.out.println("keycode : " + keycode);
        
        keycode = System.in.read();
        System.out.println("keycode : " + keycode);
        
    }
    
}

package chp2;
import java.util.Scanner;
public class chp2 {
    public void LongExample(){
        System.out.println("long 타입 예제");
        long  var1 = 10;
        long var2 = 20L;
        long var3 = 10000000000L;
        
        System.out.println(var1 + " " + var2 + " " + var3);
    }
    public void CharExample(){
        System.out.println("char형 예제");
        char A1 = 'A';
        int A2 = 'A';
        System.out.println(A1 + " " + A2);
    }
    public void PrintfExample(){
        System.out.println("print 예제");
        System.out.printf("이름 : %s\n", "박준영");
        System.out.printf("나이 : %d\n", 25);
        System.out.printf("이름 : %s, 나이 : %d\n", "박준영", 25);
    }
    public void KeycodeExample() throws Exception{
        System.out.println("키코드 예제");
        int keycode;
        System.out.println("키코드 변수 입력");
        keycode= System.in.read();
        System.out.println("keycode : " + keycode);
        
        keycode = System.in.read();
        System.out.println("keycode : " + keycode);
        
    }
    public void ContinueKeyCodeExample()throws Exception{
        System.out.println("키코드 예제(연속)");
        int keycode;
        
        while(true){
            keycode = System.in.read();
            System.out.println("keycode : " + keycode);
            if(keycode == 113) break;
        }
        System.out.println("종료");
    }
    public void ScannerExample()throws Exception{
        System.out.println("Scanner 클래스 예제");
        Scanner scanner = new Scanner(System.in);
        String input;
        
        while(true){
            input = scanner.nextLine();
            System.out.println("입력된 문자열: \"" + input + "\"");
        if(input.equals("q")) break;
        }
        System.out.println("종료");
    }
    
}

package chp3;

import java.io.PrintStream;
import java.util.Scanner;

public class chp3{
    public void ConditionalOperationExample(){
        int score = 85;
        char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
        System.out.println(score + "점은" + grade + "등급입니다.");
    }
    public void chp3_9(){
        Scanner scanner = new Scanner(System.in);
        double input1;
        double input2;
        while(true){
            System.out.print("첫번째 수: ");
            input1= scanner.nextDouble();
            System.out.print("두번째 수: ");
            input2 = scanner.nextDouble();
            if(input2 == 0){
                System.out.println("결과: 무한대");
                break;
            }
            else{
                System.out.println("결과: " + input1 / input2);
            }
        }
    }
}
package chp3;

public class chp3{
    public void ConditionalOperationExample(){
        int score = 85;
        char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
        System.out.println(score + "점은" + grade + "등급입니다.");
    }
}
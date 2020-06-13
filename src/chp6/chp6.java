package chp6;

public class chp6 {
    public chp6(){
        System.out.println();
        System.out.println("클래스를 생성합니다.");
    }
    public int sum1(int value[]){
        int sum = 0;
        for(int i = 0; i < value.length; i++){
            sum += i;
        }
        return sum;
    }
    public int sum2(int ... value){
        int sum = 0;
        for(int i = 0; i < value.length; i++){
            sum += i;
        }
        return sum;
    }
}

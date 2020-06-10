package chp5;

import javax.xml.ws.soap.AddressingFeature;

public class chp5 {
    public void ArrayExample(){
        int score[];
        score = new int[] {83, 90, 87};
        int sum1 = 0;
        for(int i = 0; i < 3; i++){
            sum1 += score[i];
        }
        System.out.println(sum1);
        int sum2 = add(new int[] {83, 90, 87});
        System.out.println(sum2);
        
    }
    private int add(int score[]){
        int sum = 0;
        for(int i = 0; i < 3; i++)
                sum += score[i];
        return sum;
    }
}

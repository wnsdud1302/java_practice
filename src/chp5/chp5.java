package chp5;

import java.util.Calendar;


public class chp5 {
    public enum Week{
        MONDAY, TUESDAY, WEDNSDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    }
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
    public void ArrayinArrayExample(){
        int score[][] = new int[2][];
        for(int i = 0; i <score.length; i++){
            score[i] = new int[3];
        }
        for(int i = 0; i < score.length; i++){
            for(int j = 0; j <score[i].length; j++){
                System.out.printf("%d ", score[i][j]);
            }
            System.out.println();
        }
        
    }
    public void ArrayCopyExample(){
        int oldar[] = {1,2,3};
        int newar[] = new int[5];
        for(int i = 0; i < oldar.length; i++){
            newar[i] = oldar[i];
        }
        for(int i = 0; i < newar.length; i++){
            System.out.printf("%d ", newar[i]);
            }
        System.out.println();
    }
    public void func_ArrayCopyExample(){
        int oldar[] = {1,2,3};
        int newar[] = new int[5];
        System.arraycopy(oldar, 0, newar, 0 ,oldar.length);
        for(int i = 0; i < newar.length; i++){
            System.out.printf("%d ", newar[i]);
            }
        System.out.println();
    }
    public void AdvancedForExample(){
        int scores[] = {95, 71, 84, 93, 87};
        int sum = 0;
        for(int score : scores)
            sum += score;
        System.out.println("점수총합: " +sum);
        double avg = (double) sum / scores.length;
        System.out.println("점수평균: " + avg);
    }
    public void EnumWeekExample(){
        Week today = null;
        Calendar cal = Calendar.getInstance();
        int week = cal.get(Calendar.DAY_OF_WEEK);
        switch(week){
            case 1:
                today = Week.SUNDAY;
                break;
            case 2:
                today = Week.MONDAY;
                break;
            case 3:
                today = Week.TUESDAY;
                break;
            case 4:
                today = Week.WEDNSDAY;
                break;
            case 5:
                today = Week.THURSDAY;
                break;
            case 6:
                today = Week.FRIDAY;
                break;
            case 7:
                today = Week.SATURDAY;
                break;
        }
        System.out.println("오늘 요일: " + today);
        if(today == Week.SUNDAY){
            System.out.println("일요일에는 냉동을 먹습니다.");
        }
        else{
            System.out.println("짬밥을 먹습니다.");    
        }
    }
 /*   public static void main(String[] args){
        if(args.length != 2){
            System.out.println("값의 수가 부족합니다.");
            exit(0);
        }
        String str1 = args[0];
        String str2 = args[2];
        
        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);
        
        int result = num1 + num2;
        System.out.println(result);
    }
    */
}



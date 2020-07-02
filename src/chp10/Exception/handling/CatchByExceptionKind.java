package chp10.Exception.handling;

public class CatchByExceptionKind {
    public static void main(String[] args){
        try{
            String data1 = null;
            String data2 = null;
            data1 = args[0];
            data2 = args[1];
            int value1 = Integer.parseInt(data1);
            int value2 = Integer.parseInt(data2);
            int result = value1 + value2;
            System.out.println(result);
    /*}catch(Exception e){ //상위 클래스는 아래로!!
            System.out.println("실행완료!");*/ 
   }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("실행 매개값이 부족합니다.");
    }catch(Exception e){
            System.out.println("코드를 다시짜세요.");
    }finally{
            System.out.println("다시 실행하세요");
        }
    }

}

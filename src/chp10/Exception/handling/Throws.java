package chp10.Exception.handling;

public class Throws {
    public static void main(String[] args){
        try{
            findclass();
        }catch(ClassNotFoundException e){
            System.out.println("클래스가 존재하지 않습니다.");
        }
    }
    public static void findclass() throws ClassNotFoundException{
        class clazz = class.forName("java.lang.String2");
    }
}

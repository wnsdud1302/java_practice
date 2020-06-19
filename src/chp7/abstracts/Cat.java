package chp7.abstracts;

public class Cat extends Animal{
    public Cat(){
        super("고양이");
    }
    
    @Override
    public void sound(){
        System.out.println("냐옹");
    }
}
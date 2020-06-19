import chp7.*;
import chp7.abstracts.*;

public class Main{
   public static void main(String[] args) throws Exception{
       Dog dog = new Dog();
       Cat cat = new Cat();
       Main m = new Main();
       Animal animal = null;
       
       m.sounds(dog, cat);
       animal = new Dog();
       animal.sound();
       animal = new Cat();
       animal.sound();
       System.out.println("-----------");
       
       m.animalSound(new Dog());
       m.animalSound(new Cat());

   } 
    
    void carRepair(Car car){
               for(int i = 0; i <= 5; i++){
           int problemLocation = car.run();
           switch(problemLocation){
               case 1:
                   System.out.println("앞왼쪽 HankookTire로 교체");
                   car.frontLeftTire = new HankookTire("안왼쪽", 15);
                   break;
               case 2:
                   System.out.println("앞오른쪽 KumhoTire로 교체");
                   car.frontRightTire = new KumhoTire("앞오른쪽", 13);
                   break;
               case 3:
                   System.out.println("뒤왼쪽 HankookTire로 교체");
                   car.backLeftTire = new HankookTire("뒤왼쪽", 14);
                   break;
               case 4:
                   System.out.println("뒤오른쪽 KumhoTire로 교체");
                   car.backRightTire = new KumhoTire("뒤오른쪽", 17);
           }
           System.out.println("------------------------");
        
        }
    }
    void sounds(Dog d, Cat c){
        d.sound();
        c.sound();
        System.out.println("-----------");
    }
    void animalSound(Animal a){
        a.sound();
    }
}

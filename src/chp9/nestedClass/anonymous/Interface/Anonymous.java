package chp9.nestedClass.anonymous.Interface;

public class Anonymous {
    public RemoteControl field = new RemoteControl(){
        @Override
        public void turnOn(){
            System.out.println("TV를 켭니다.");
        }
        @Override
        public void turnOff(){
            System.out.println("TV를 끕니다.");
        }
    };
    
    public void method1(){
        RemoteControl localVar = new RemoteControl(){
            @Override
            public void turnOn(){
                System.out.println("Audio를 킵니다.");
            }
            @Override
            public void turnOff(){
                System.out.println("Audio를 끕니다.");
            }
        };
        localVar.turnOn();
    }
    
    public void method2(RemoteControl rc){
        rc.turnOn();
    }
}

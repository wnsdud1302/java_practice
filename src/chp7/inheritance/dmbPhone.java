package chp7;


public class dmbPhone extends cellPhone {
    public int channel;
    public static final int SAMSUNG = 1;
    public static final int LG = 2;
    
    public int bootMode = SAMSUNG;
    
    public dmbPhone(String model, String color, int channel){
        super(model, color);
        this.channel = channel;
    }
    public void bootingLogo(){
        if(bootMode == LG){
            System.out.println("LG폰입니다.");
        }
        System.out.println("SAMSUNG폰입니다.");
    }
    
    @Override
    public void powerOn(){
        System.out.println("DMB폰을 켭니다.");
        super.powerOn();
    }
    public void turnOndmb(){ 
        System.out.println("채널" + channel + "번 채널을 틉니다.");
    }
    public void changeChanneldmb(int channel){
        this.channel = channel;
        System.out.println("채널" + channel + "번으로 바꿉니다.");
    }
    public void turnOffdmb(){
        System.out.println("DMB를 끕니다");
    }
    
    
}

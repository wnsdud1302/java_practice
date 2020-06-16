import chp7.*;
public class Main{
   public static void main(String[] args) throws Exception{
       dmbPhone Phone1 = new dmbPhone("samsung", "black", 10);
       System.out.println("모델 : " + Phone1.model);
       System.out.println("색깔: " + Phone1.color);
       System.out.println("채널: " + Phone1.channel);
       
       Phone1.bootingLogo();
       Phone1.bootMode = dmbPhone.LG;
       Phone1.bootingLogo();
       Phone1.bootMode = dmbPhone.SAMSUNG;
       Phone1.powerOn();
       Phone1.bell();
       Phone1.sendVoice("hello world!");
       Phone1.recieveVoice("hello java");
       Phone1.hangUp();
       
       Phone1.turnOndmb();
       Phone1.changeChanneldmb(5);
       Phone1.turnOffdmb();
       Phone1.powerOff();
       
    }
}

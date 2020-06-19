package chp7;

public class cellPhone {
    public String model;
    public String color;
    
    cellPhone(String model, String color){
        this.model = model;
        this.color = color;
    }
    public void powerOn() { System.out.println("전원을 켭니다."); }
    public void powerOff() { System.out.println("전원을 끕니다."); }
    public final void bell() { System.out.println("벨이 울립니다."); }
    public void sendVoice(String message){ System.out.println(message); }
    public void recieveVoice(String messge){ System.out.println(messge); }
    public void hangUp(){ System.out.println("전화를 끊습니다."); }
}

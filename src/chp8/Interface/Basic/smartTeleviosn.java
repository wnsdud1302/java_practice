package chp8.Interface.Basic;

public class smartTeleviosn implements RemoteControl, Searchable {
    private int volume;
    
    public void turnOn(){
        System.out.println("TV를 킵니다.");
    }
    public void turnOff(){
        System.out.println("TV를 끕니다.");
    }
    public void setVolume(int volume){
        if(volume>RemoteControl.MAX_VOLUME){
            this.volume = RemoteControl.MAX_VOLUME;
        }
        else if(volume < RemoteControl.MIN_VOLUME){
            this.volume = RemoteControl.MIN_VOLUME;
        }
        else{
        this.volume = volume;
        }
        System.out.println("현재 TV volume: " + this.volume);
    }
    public void search(String url){
        System.out.println(url + "을 겁색합니다.");
    }
}

package chp9.nestedClass.anonymous.Interface;

public class Button {
    OnClickListener listener;
    
    void setOnClickListener(OnClickListener listener){
        this.listener = listener;
    }
    
    public void touch(){
        listener.onClick();
    }
    
    static interface OnClickListener{
        void onClick();
    }
}

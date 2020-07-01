package chp9.nestedClass.anonymous.Interface;

public class Window {
    public Button button1 = new Button();
    public Button button2 = new Button();
    
    Button.OnClickListener listener = new Button.OnClickListener(){
        @Override
        public void onClick(){
            System.out.println("전화를 겁니다.");
        }
    };
    
    public Window(){
        button1.setOnClickListener(listener);
        button2.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(){
                System.out.println("메세지를 보냅니다.");
            }
        });
    }
    
}

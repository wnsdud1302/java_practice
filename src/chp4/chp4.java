package chp4;

import java.util.Scanner;

public class chp4 {
    public void IfDiceExample(){
        int num = (int) (Math.random() * 6) + 1;
        
        if(num == 1){
            System.out.println("1번이 나왔습니다.");
        }
        else if(num == 2){
            System.out.println("2번이 나왔습니다.");
        }
        else if(num ==3){
            System.out.println("3번에 니왔습니다.");
        }
        else if(num ==4){
            System.out.println("4번이 나왔습니다.");
        }
        else if(num == 5){
            System.out.println("5번이 나왔습니다.");
        }
        else if(num == 6){
            System.out.println("6번이 나왔습니다");
        }
    }
    public void SwitchDiceExample(){
        int num = (int) (Math.random() *6) + 1;
        
        switch(num){
            case 1:
                System.out.println("1번이 나왔습니다.");
                break;
            case 2:
                System.out.println("2번이 나왔습니다.");
                break;
            case 3:
                System.out.println("3번에 니왔습니다.");
                break;
            case 4:
                System.out.println("4번이 나왔습니다.");
                break;
            case 5:
                System.out.println("5번이 나왔습니다.");
                break;
            case 6:
                System.out.println("6번이 나왔습니다");
                break;
        }
    }
    public void ForSumExample(){
        int sum = 0;
        for(int i = 0, j = 100; i < 50 && j > 50; i++, j--){
            sum += i * j;
        }
        System.out.println(sum + "입니다.");
    }
    public void ForMultiTableeample(){
        for(int i = 2; i < 10; i++){
            for(int j = 1; j < 10; j++){
                System.out.printf("%d ", i * j);
            }
            System.out.println();
        }
    }
    public void BreakOutterEaxmple(){
        Outter: for(char upper = 'A'; upper < 'Z'; upper++){
            for(char lower = 'a'; lower < 'z'; lower++){
                System.out.println(upper + "-" + lower);
                if(lower == 'g')
                    break Outter;
            }
        }
        System.out.println("프로그램 종료");
    }
    public void Chp4_2(){
        int sum = 0;
        for(int i = 1; i <= 100; i++){
            if(i % 3 == 0)
                sum += i;
        }
        System.out.println(sum + "입니다.");
    }
    public void Chp4_3(){
        while(true){
            int num1 = (int) (Math.random() * 6) + 1;
            int num2 = (int) (Math.random() * 6) + 1;
            if(num1 + num2 == 5){
                System.out.println("두 주사위 눈의 합이 5입니다.");
                System.out.println(num1 + ", " + num2);
                break;
            }
            System.out.println(num1 + ", " + num2);
        }
    }
    public void chp4_4(){
        for(int i = 1; i <= 10; i++){
            for(int j = 1; j <= 10; j++){
                if(4*i + 5*j == 60){
                    System.out.println("(" + i + ", "+ j + ")");
                }
            }
        }
    }
    public void chp4_6(){
        for(int i = 0; i < 4; i++){
            for(int j = 3; j >= 0; j--){
                if(j > i){
                    System.out.printf(" ");
                }
                else{
                    System.out.printf("*");
                }
            }
            System.out.println();
        }
    }
    public void chp4_7(){
        boolean run = true;
        int balance = 0;
        int money;
        Scanner scanner = new Scanner(System.in);
        while(run){
            System.out.println("----------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("----------------------------------");
            System.out.print("선택>");
            int menu = Integer.parseInt(scanner.nextLine());
            if(menu == 4) break;
            switch(menu){
                case 1:
                    System.out.print("예금액>");
                    money = Integer.parseInt((scanner.nextLine()));
                    balance += money;
                    System.out.println();
                    break;
                case 2:
                    System.out.print("출금액>");
                    money = Integer.parseInt((scanner.nextLine()));
                    balance -= money;
                    System.out.println();
                    break;
                case 3:
                    System.out.println("잔고>" + balance);
                    break;
            }
        }
        System.out.println("프로그램 종료");
    }
}

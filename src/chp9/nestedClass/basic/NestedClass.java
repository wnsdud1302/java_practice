package chp9.nestedClass.basic;


public class NestedClass {
    NestedClass(){
        System.out.println("nestedClass 객체가 생성됨");
    }
    
    public void method1(final int arg){
        final int localVariable = 1;
        //arg = 100;
        //localVariable = 100;
        class Inner{
            public void method(){
                int result = arg + localVariable;
            }
        }
    }
    
    public void method2(int arg){
        int localVariable = 1;
        //arg = 100;
        //localVariable = 100;
        class Inner{
            void method(){
                int result = arg + localVariable;
            }
        }
    }
    
    class B{
        B(){
            System.out.println("B 객체가 생성됨");
        }
        int field1;
        //static int field2;
        void method1(){};
        //static void method2(){};
        
    }
    
    static class C{
        C(){
            System.out.println("C 객체가 생성됨");
        }
        int field1;
        static int field2;
        void method1(){}
        static void method2(){}
    }
    
    void method(){
        class D{
            D(){
                System.out.println("D객체가 생성됨");
            }
            int field1;
            //static int field2;
            void method1(){}
            //static void method2(){}
        }
        D d = new D();
        d.field1 = 3;
        d.method1();
        
    }
    
}

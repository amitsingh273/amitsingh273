package Basics;

public class Objects {
    Objects() {
        System.out.println("Object class constructor");
    }

    public static void main(String args[]){
        A a = new B();
        a.prints();

//        B b = new B();
//        b.prints();
    }
}

class A {
    A(){
        System.out.println("A class constructor");
    }
    {
        System.out.println("A class block");
    }
    void prints(){
        System.out.println("A method");
    }
}

class B extends A{
    B(){
        System.out.println("B class constructor");
    }
    {
        System.out.println("B class block");
    }
    void prints(){
        System.out.println("B method");
    }
}

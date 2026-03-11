import java.util.*;

class Parent {
    void run() {
        System.out.println("HOI");
    }
}

class Child extends Parent {
    void run() {
        System.out.println("hoi jguyggg ");
    }
}

class MainClass {
    public static void main(String args[]) {
        
        Parent parent = new Parent();
        parent.run(); // This will call the run method from Child
    }
}

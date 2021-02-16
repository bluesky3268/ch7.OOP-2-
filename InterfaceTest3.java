class A2 {
    void methodA() {
        I2 i = InstanceManager.getInstance();
        i.methodB2();
        System.out.println(i.toString());
    }
}

interface I2 {
    public abstract void methodB2();
}

class B2 implements I2 {
    public void methodB2() {
        System.out.println("methodB in B class.");
    }

    public String toString() {
        return "B class.";
    }
}

class InstanceManager {
    public static I2 getInstance() {
        return new B2();
    }
}

public class InterfaceTest3 {
    public static void main(String[] args) {
        A2 a = new A2();
        a.methodA();
    }

}

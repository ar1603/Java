public class ClassObject {
    public static void main(String args[]) {
        DemoClass demoClass = new DemoClass();
        System.out.println(demoClass.getNumber());
        demoClass.increment();
        demoClass.increment();
        System.out.println(demoClass.getNumber());
        demoClass.increment();
        System.out.println(demoClass.getNumber());
    }
}

class DemoClass {
    private int a;

    DemoClass() {
        this.a = 0;
    }

    void increment() {
        this.a++;
    }

    int getNumber() {
        return this.a;
    }
}
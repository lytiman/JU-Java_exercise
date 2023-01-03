public abstract class  Main {
    void animals() {
        System.out.println("all are animals");
    }
    abstract void run();

    public static void main(String[] args) {
        System.out.println("Hello world!");
      // Main horse = new Main();
        // question number 2 we cannot instantiate object for abstract class.
Tiger t=new Tiger();
t.animals();
t.eat();
t.sound();
t.run();

    }
}
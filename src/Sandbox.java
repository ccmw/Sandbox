public class Sandbox {

    public static void main(String[] args) {
        Sandbox entryPoint = new Sandbox();
    }

    public Sandbox() {
        System.out.println("Welcome to the Sandbox!");
        DecisionModule decision = new DecisionModule();
    }
}

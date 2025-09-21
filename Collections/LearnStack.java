import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();
        animals.push("Lion");
        animals.push("Tiger");
        animals.push("Cheetah");
        System.out.println(animals);

        System.out.println(animals.peek());

        System.out.println(animals);
        animals.pop();
        System.out.println(animals.peek());
        System.out.println(animals);
    }
}

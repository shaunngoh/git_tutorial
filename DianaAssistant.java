import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DianaAssistant {
    public void interact() {
        System.out.println("Hello, I am Diana!\nWhat can I do for you?");
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        String name;
        while (true) {
            name = scanner.nextLine();
            if ("bye".equals(name)) {
                break;
            }
            System.out.println("added: " + name);
            list.add(name);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ". " + list.get(i));
        }
        System.out.println("Bye! Hope to see you again soon.");
        scanner.close();
    }
}
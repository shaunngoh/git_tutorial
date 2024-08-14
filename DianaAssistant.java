import java.util.Scanner;

public class DianaAssistant {
    public void interact() {
        System.out.println("Hello, I am Diana!\nWhat can I do for you?");
        Scanner scanner = new Scanner(System.in);
        String[] list = new String[100];
        int i = 0;

        // Reading a string
        String name = null;
        while (!"bye".equals(name) && i < 100) {
            name = scanner.nextLine();
            if (!"bye".equals(name)) {
                System.out.println("added: " + name + "\n");
                list[i] = name;
            }
            i++;
        }
        int j = 1;
        while (j < i) {
            System.out.println(j + ". " + list[j - 1]);
            j++;
        }
        System.out.println("Bye! Hope to see you again soon.");
    }
}
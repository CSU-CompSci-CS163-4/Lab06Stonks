import java.util.Scanner;

public class StonksAppView {

        private final Scanner scanner = new Scanner(System.in);

        public void printMenu() {
            System.out.println("Welcome to the stonk market.");
            System.out.println("Type \"X\" to exit at any time.");
            System.out.println("[S]ell stonks");
            System.out.println("[B]uy stonks");
            System.out.println("Do [N]othing");
            System.out.println();
        }

        public String getAction() {
            return scanner.nextLine().toLowerCase();
        }

}

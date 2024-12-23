package Tasks;
import java.util.Scanner;
public interface shopinterface {
    Scanner scanner = new Scanner(System.in);
    static String readString() {
        return scanner.nextLine();
    }
    static int readInt() {
        return scanner.nextInt();
    }
    static double readDouble() {
        return scanner.nextDouble();
    }
}

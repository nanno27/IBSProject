package tasks;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        final int N = scanner.nextInt();

        CharSequence result = seqString(string, N);

        System.out.println(result);
    }

    static StringBuilder seqString(CharSequence charString, int N) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            stringBuilder.append(charString);
        }
        return stringBuilder;
    }
}

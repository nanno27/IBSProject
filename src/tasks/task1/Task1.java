package tasks.task1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public void run() {
        Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("Введите строку: ");
                String string = scanner.nextLine();
                System.out.println("Количество повторов: ");
                final int N = scanner.nextInt();
                if (N <= 0) {
                    throw new IllegalArgumentException("Количество повторов должно быть больше 0");
                }
                CharSequence result = seqString(string, N);
                System.out.println(result);

            } catch (InputMismatchException e) {
                System.out.println("Введено некорректное значение");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } finally {
                scanner.close();
            }

    }

    static StringBuilder seqString(CharSequence charString, int N) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            stringBuilder.append(charString);
        }
        return stringBuilder;
    }
}

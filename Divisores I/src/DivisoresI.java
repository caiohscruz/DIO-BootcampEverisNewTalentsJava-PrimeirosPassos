import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisoresI {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        try {
            int N = leitor.nextInt();
            for (int i = 1; i <= (N / 2); i++) {
                if (N % i == 0) System.out.println(i);
            }
            System.out.println(N);
        } catch (InputMismatchException e) {
            System.out.println("Entrada inesperada - Esperado uma entrada do tipo Int");
        }
    }
}

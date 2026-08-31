// ler um angulo em graus e exibir o valor correspondente em radianos
import java.util.Scanner;

public class AnguloRadiano {
    public static void main(String[] args) {
        double grau, radiano;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o angulo em graus: ");
        grau = scanner.nextDouble();

        radiano = (grau * Math.PI) / 180;

        System.out.printf("%.2f\u00B0 correspondem a %.3f radianos\n", grau, radiano);

        scanner.close();
    }
}

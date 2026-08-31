// ler as coordenadas de dois pontos (P1, P2) e calcular e exibir a distancia entre eles.
import java.util.Scanner;

public class Distancia {
    public static void main(String[] args) {
        double x1, x2, y1, y2, d;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a abscissa do ponto 1: ");
        x1 = scanner.nextDouble();
        System.out.print("Digite a ordenada do ponto 1: ");
        y1 = scanner.nextDouble();

        System.out.print("Digite a abscissa do ponto 2: ");
        x2 = scanner.nextDouble();
        System.out.print("Digite a ordenada do ponto 2: ");
        y2 = scanner.nextDouble();

        d = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));

        System.out.printf("A distância entre os pontos é: %.2f\n", d);

        scanner.close();
    }
}

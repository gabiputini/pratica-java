// ler o valor de um saque e calcular a quantidade de notas de 100, 50 e 20 necessárias para realizar o saque
import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        int saque, d100, r100, d50, r50, d20, r20;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do saque: ");
        saque = scanner.nextInt();

        d100 = saque / 100;
        r100 = saque % 100;

        d50 = r100 / 50;
        r50 = r100 % 50;

        d20 = r50 / 20;
        r20 = r50 % 20;

        System.out.println("Notas de 100: " + d100);
        System.out.println("Notas de 50: " + d50);
        System.out.println("Notas de 20: " + d20); 

        scanner.close();
    }
}

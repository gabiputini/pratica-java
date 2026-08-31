// ler a altura e o peso de uma pessoa e calcular o IMC
import java.util.Scanner;

public class CalculoImc {
    public static void main(String[] args){

        double altura, peso, imc;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua altura em metros: ");
        altura = scanner.nextDouble();

        System.out.print("Digite seu peso em kg: ");
        peso = scanner.nextDouble();

        imc = peso / (altura * altura);

        System.out.printf("Seu IMC é: %.2f\n", imc);

        scanner.close();
    }
}

// ler o valor total de uma compra, calcular desconto de 10%, valor de cada parcela  3 vezes sem juros, e calcular a comissão do vendedor (5% sobre o valor da compra a vista e 5% sobre o valor da compra parcelada)
import java.util.Scanner;

public class Comissao {
    public static void main(String[] args) {
        double valorCompra, valorDesconto, valorParcela, comissaoAvista, comissaoParcelado;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor total da compra: ");
        valorCompra = scanner.nextDouble();

        valorDesconto = valorCompra * 0.90;
        valorParcela = valorCompra / 3; 
        comissaoAvista = valorDesconto * 0.05;
        comissaoParcelado = valorCompra * 0.05;

        System.out.printf("Valor da compra com desconto de 10%%: R$ %.2f\n", valorDesconto);
        System.out.printf("Valor de cada parcela: R$ %.2f\n", valorParcela);
        System.out.printf("Valor da comissão à vista: R$ %.2f\n", comissaoAvista);
        System.out.printf("Valor da comissão parcelada: R$ %.2f\n", comissaoParcelado);

        scanner.close();
    }
}

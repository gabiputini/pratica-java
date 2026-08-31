// ler um valor em segundos e exibir em horas/minutos/segundos
import java.util.Scanner;

public class Segundos {
    public static void main(String[] args) {
        int tempoSeg, h, min, seg;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor em segundos: ");
        tempoSeg = scanner.nextInt();

        h = tempoSeg / 3600;
        min = (tempoSeg % 3600) / 60;
        seg = tempoSeg % 60;

        System.out.printf("Tempo: %02d:%02d:%02d\n", h, min, seg);

        scanner.close();
    }
}

import java.util.Scanner;
public class questao4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int populacaoA = 80000;
        double crescimentoA = 0.03;
        int populacaoB = 200000;
        double crescimentoB = 0.015;
        int anos = 0;
        while (populacaoA < populacaoB) {
            populacaoA += populacaoA * crescimentoA;
            populacaoB += populacaoB * crescimentoB;
            anos++;
        }
            System.out.println("Número de anos necessários para que a população de A ultrapasse ou iguale a população de B: " + anos + " Número de habitantes " + populacaoA);
            scanner.close(); 
        }
}

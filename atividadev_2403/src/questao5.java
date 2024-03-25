import java.util.Scanner;
public class questao5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int populacaoA, populacaoB;
         double crescimentoA , crescimentoB;
        int anos =0;

        System.out.println("Digite a populacao do pais A: ");
        populacaoA = sc.nextInt();
        System.out.println("Digite a taxa de crescimento do pais A: ");
        crescimentoA = sc.nextDouble();
        crescimentoA = crescimentoA/100;
        System.out.println("Digite a populcao do pais B: ");
        populacaoB = sc.nextInt();
        System.out.println("Digite a taxa de crescimento do pais B: ");
        crescimentoB = sc.nextDouble();
        crescimentoB = crescimentoB/100;
        while (populacaoA < populacaoB) {
        populacaoA += populacaoA * crescimentoA;
        populacaoB += populacaoB * crescimentoB;
        anos++;
        }
        System.out.println("A populacao A sera maior que a populacaoB em "+anos+" , e o numero de habitantes será: " +populacaoA); 
        sc.close();
    }
    
}

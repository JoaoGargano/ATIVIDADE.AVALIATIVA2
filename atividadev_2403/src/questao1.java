import java.util.Scanner;
public class questao1 {
        public static void main(String[] args){
          Scanner sc = new Scanner (System.in);
          double nota;
          boolean notaValida = false; 
          do{
            System.out.println("Entre com o valor da nota: ");
            nota = sc.nextDouble();
            if (nota >= 0 && nota <= 10){
                 notaValida = true; 
                 System.out.println("O valor digitado é: " + nota); 
            }else{
            System.out.println("Voce digitou uma nota "+nota+" inválida, digite novamente");
            }
        }while(!notaValida);
        sc.close();
        }
    
    
}

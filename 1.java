import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int vtr = 5;
        int[] vetor = new int[vtr];
        
        for (int i = 0; i < vtr; i++) {
            System.out.print("Digite um número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }
        
        System.out.println("Números informados:");
        for (int i = 0; i < vtr; i++) {
            System.out.println(vetor[i]);
        }
        
        scanner.close();
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int vtr = 10;
        double[] vetor = new double[vtr];
        
        for (int i = 0; i < vtr; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            vetor[i] = scanner.nextDouble();
        }
        
        System.out.println("Números em ordem inversa:");
        for (int i = vtr - 1; i >= 0; i--) {
            System.out.println(vetor[i]);
        }
        
        scanner.close();
    }
}


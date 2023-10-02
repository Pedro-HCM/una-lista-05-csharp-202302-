import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vtr = 20;
        int[] numeros = new int[vtr];
        int[] par = new int[vtr];
        int[] impar = new int[vtr];
        int countPar = 0;
        int countImpar = 0;

        for (int i = 0; i < vtr; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();

            if (numeros[i] % 2 == 0) {
                par[countPar] = numeros[i];
                countPar++;
            } else {
                impar[countImpar] = numeros[i];
                countImpar++;
            }
        }

        System.out.println("Números digitados:");
        for (int i = 0; i < vtr; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        System.out.println("Números pares:");
        for (int i = 0; i < countPar; i++) {
            System.out.print(par[i] + " ");
        }
        System.out.println();

        System.out.println("Números ímpares:");
        for (int i = 0; i < countImpar; i++) {
            System.out.print(impar[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}


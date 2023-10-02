import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nAlunos = 10;
        double[] medias = new double[nAlunos];
        int countAlunosAprovados = 0;

        for (int i = 0; i < nAlunos; i++) {
            System.out.println("Digite as quatro notas do aluno " + (i + 1) + ":");
            double somaNotas = 0;
            for (int j = 0; j < 4; j++) {
                System.out.print("Nota " + (j + 1) + ": ");
                double nota = scanner.nextDouble();
                somaNotas += nota;
            }
            medias[i] = somaNotas / 4;

            if (medias[i] >= 7.0) {
                countAlunosAprovados++;
            }
        }

        System.out.println("Médias dos alunos:");

        for (int i = 0; i < nAlunos; i++) {
            System.out.println("Aluno " + (i + 1) + ": " + medias[i]);
        }

        System.out.println("Número de alunos com média maior ou igual a 7.0: " + countAlunosAprovados);

        scanner.close();
    }
}

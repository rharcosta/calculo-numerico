package interpolacao;

import java.util.Scanner;

public class Interpolacao {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int I, K, N;
        double X[], Y[], XIN, YIN, L;
        X = new double[50];
        Y = new double[50];

        System.out.print("Dê o número total de pontos disponíveis: ");
        N = leitura.nextInt();

        for (I = 0; I <= N - 1; I++) {
            System.out.println("\nDê um valor de X e o correspondente "
                    + "valor de Y:");
            System.out.print("X: ");
            X[I] = leitura.nextDouble();
            System.out.print("Y: ");
            Y[I] = leitura.nextDouble();
        }

        System.out.print("\nDê o valor de X para a Interpolação: ");
        XIN = leitura.nextDouble();
        YIN = 0;

        for (K = 0; K <= N - 1; K++) {
            L = 1;
            for (I = 0; I <= N - 1; I++) {
                if (I != K) {
                    L = L * ((XIN - X[I]) / (X[K] - X[I]));
                }
            }
            YIN = (L * Y[K]) + YIN;
        }
        System.out.println("\nQuando X = " + XIN);
        System.out.println("Y = " + YIN);
    }
}

package regressaolinear;

import java.util.Scanner;

public class RegressaoLinear {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int i, n;
        double SOMAX = 0, SOMAY = 0, SOMAXX = 0, SOMAXY = 0, a, b;
        double x[] = new double[30];
        double y[] = new double[30];

        System.out.println("Esse programa calcula uma regressão linear!");
        System.out.print("\nDê o número de pontos tabelados: ");
        n = leitura.nextInt();

        for (i = 0; i < n; i++) {
            System.out.println("\nDê um valor de x e um valor de y tabelados");
            System.out.print("X: ");
            x[i] = leitura.nextDouble();
            System.out.print("Y: ");
            y[i] = leitura.nextDouble();
            SOMAX = SOMAX + x[i];
            SOMAY = SOMAY + y[i];
            SOMAXX = SOMAXX + (x[i] * x[i]);
            SOMAXY = SOMAXY + (x[i] * y[i]);
        }
        a = ((n * SOMAXY) - (SOMAX * SOMAY)) / ((n * SOMAXX) - (SOMAX * SOMAX));
        b = (SOMAY - (a * SOMAX)) / n;
        System.out.println("\nA reta que melhor ajusta os pontos é " + a + "x + "
                + b + " = 0");
    }
}

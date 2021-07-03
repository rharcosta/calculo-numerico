package metodosimpson;

import java.util.Scanner;

public class MetodoSimpson {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int n;
        double ac = 0, area, h;
        double Y[], X[];
        Y = new double[50];
        X = new double[50];

        System.out.println("Cálculo da área usando o Método de Simpson");
        System.out.print("\nDigite o número de pontos tabelados: ");
        n = leitura.nextInt();

        for (int j = 0; j < (n + 1); j++) {
            System.out.println("Digite o valor de X e o valor de Y, "
                    + "respectivamente:");
            System.out.print("X: ");
            X[j] = leitura.nextDouble();
            System.out.print("Y: ");
            Y[j] = leitura.nextDouble();
            System.out.println("");
        }

        for (int i = 0; i < n; i++) {
            if ((i == 0) || (i == n)) {
                ac = ac + Y[i];
            }
            if (i % 2 == 0) {
                ac = ac + (2 * Y[i]);
            } else {
                ac = ac + (4 * Y[i]);
            }
        }

        h = (X[n] - X[0]) / n;
        area = (h * ac) / 3;
        System.out.println("\nÁrea: " + area + " unidades de medida.");
    }
}

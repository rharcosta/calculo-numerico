package metodosecantes;

import java.util.Scanner;

public class MetodoSecantes {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        double prec, erro = 1, x0, x1, xnovo = 0;

        System.out.println("Programa para calcular o Método das Secantes feito por Rubia Helena Archanjo");
        System.out.println("Raíz da equação do 3o grau: x^3 + 5x - 6");
        System.out.print("\nInsira a precisão desejada: ");
        prec = Scanner.nextDouble();
        System.out.print("Insira a solução inicial: ");
        x0 = Scanner.nextDouble();
        System.out.print("Insira a segunda solução inicial: ");
        x1 = Scanner.nextDouble();

        while (erro >= prec) {
            xnovo = x1 - (((x1 - x0) * (Math.pow(x1, 3) + 5 * x1 - 6)) / ((Math.pow(x1, 3) + 5 * x1 - 6) - (Math.pow(x0, 3) + 5 * x0 - 6)));
            erro = (Math.abs(xnovo - x1)) / (Math.abs(xnovo));
            x0 = x1;
            x1 = xnovo;
        }
        System.out.printf("\nA solução que satisfaz a precisão desejada é: %.6f %n", xnovo);
    }
}

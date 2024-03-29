package metodotangentes;

import java.util.Scanner;

public class MetodoTangentes {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        double prec, erro = 1, x0, xnovo = 0;

        System.out.println("Programa para calcular o Método das Tangentes feito por Rubia Helena Archanjo");
        System.out.println("Raíz da equação do 3o grau: x^3 + 5x - 6");
        System.out.print("\nInsira a precisão desejada: ");
        prec = Scanner.nextDouble();
        System.out.print("Insira a solução inicial: ");
        x0 = Scanner.nextDouble();

        while (erro >= prec) {
            xnovo = x0 - ((Math.pow(x0, 3) + 10 * x0 - 28) / (3 * Math.pow(x0, 2) + 10));
            erro = (Math.abs(xnovo - x0)) / (Math.abs(xnovo));
            x0 = xnovo;
        }
        System.out.println("\nA solução que satisfaz a precisão desejada é: " + xnovo);
    }
}

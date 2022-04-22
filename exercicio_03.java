//Leia dois valores (A e B) e informe a soma.

import java.util.Scanner;

public class exercicio_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor");
        double num1 = sc.nextDouble();

        System.out.println("Digite o segundo valor");
        double num2 = sc.nextDouble();

        double soma = num1 + num2;

        System.out.printf("%.2f + %.2f: %.2f", num1,num2,soma);
    }
}

//Leia três valores (A, B e C). Informe média

import java.util.Scanner;

public class exercicio_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro valor");
        double a = sc.nextDouble();

        System.out.println("Informe o segundo valor");
        double b = sc.nextDouble();

        System.out.println("Informe o terceiro valor");
        double c = sc.nextDouble();

        double media = (a + b + c) / 3;

        System.out.printf("A média dos valores é %.2f", media);
    }
}


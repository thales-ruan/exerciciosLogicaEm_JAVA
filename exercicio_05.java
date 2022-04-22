/* Faça um algoritmo para uma loja de 1,99. Leia
quantos itens foram vendidos. Conceda um desconto
de 5% e informe o valor final.*/

import java.util.Scanner;

public class exercicio_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double valueProduct = 1.99;

        System.out.println("quantos itens foram vendindos?");
        double quantidade = sc.nextDouble();

        double valorCompra = valueProduct * quantidade;
        double descont = 5.0 / 100.0;
        double valorFinal = valorCompra - (descont * valorCompra);

        System.out.printf("o valor da conta com 5 Porcento de desconto ficou %.2f$ ", valorFinal);
    }
}

/*Sabendo que cada cavalo precisa de 4 ferraduras e
que cada unidade custa 9,90, pergunte quantos
cavalos precisam de ferraduras. Depois calcule e
informe o valor final.*/

import java.util.Scanner;

public class exercicio_02 {
    public static void main(String[] args) {
        Scanner qtd = new Scanner(System.in);


        System.out.println("Quantos cavalos precisam de ferradura?");
        int ferradura = qtd.nextInt();

        double valor = 9.90 * 4;
        double result = ferradura * valor;
        int qtdferradura = ferradura * 4;

        System.out.printf("Voce vai precisar de %d Ferraduras Cada uma custa 9,90$ e o valor total fica %.2f$ ", qtdferradura,result);


    }
}

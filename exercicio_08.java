/* Uma fábrica de refrigerantes vende seu produto em
três formatos: lata de 350 ml, garrafa de 600 ml e
garrafa de 2 litros. Se um comerciante compra uma
determinada quantidade de cada formato, faça um
algoritmo para calcular quantos litros de refrigerante
ele comprou. */

import java.util.Scanner;

public class exercicio_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas latas de refrigerante voce comprou?");
        double qtdLata = sc.nextDouble();

        System.out.println("Quantas garrafas de refrigerante voce comprou?");
        double qtdGarrafa = sc.nextDouble();

        System.out.println("Quantos litros de refrigerante voce comprou?");
        double qtdLitro = sc.nextDouble();

        double totalLata = qtdLata * 0.350;
        double totalGarrafa = qtdGarrafa * 0.600;
        double totalLitro = qtdLitro * 2.0;
        double totalComprado  = totalLata + totalGarrafa + totalLitro;

        System.out.println("Ao total foram comprado: " + totalComprado + " L de refrigerante");


    }
}

/*Sabendo que cada unidade de ferradura custa 9,90,
pergunte quantos cavalos precisam de (4) ferraduras.
Se o custo total for maior que 100,00 aplique um
desconto de 10%. Depois informe o valor final. */

import java.util.Scanner;

public class exercicios_11 {
    public static void main(String[] args) {
        Scanner qtd = new Scanner(System.in);



        System.out.println("Quantos cavalos precisam de ferradura?");
        int ferradura = qtd.nextInt();

        double valor = 9.90 * 4;
        double result = ferradura * valor;
        int qtdferradura = ferradura * 4;
        double percentual = 10.0 / 100.0;
        double valor_final = result - (percentual * result);

        if(result > 100){
            System.out.println("Voce vai precisar de "+qtdferradura+" Ferraduras Cada uma custa 9,90$ e o valor total fica "+valor_final+"$");
        }else{
            System.out.println("Voce vai precisar de "+qtdferradura+" Ferraduras Cada uma custa 9,90$ e o valor total fica "+result+"$");
        }
    }
}

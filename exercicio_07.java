/*Pedrinho tem um cofrinho com muitas moedas, e
deseja saber quantos reais conseguiu poupar. Faça
um algoritmo para ler a quantidade de cada tipo de
moeda, e imprimir o valor total economizado, em
reais. Considere que existam moedas de 1, 5, 10, 25
e 50 centavos, e ainda moedas de 1 real.*/

import java.util.Scanner;

public class exercicio_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//


        System.out.println("Quantas moedas de 001 centavos voce economizou");
        double qtdMoeda001 = sc.nextDouble();

        System.out.println("Quantas moedas de 005 centavos voce economizou");
        double qtdMoeda005 = sc.nextDouble();

        System.out.println("Quantas moedas de 010 centavos voce economizou");
        double qtdMoeda010 = sc.nextDouble();

        System.out.println("Quantas moedas de 025 centavos voce economizou");
        double qtdMoeda025 = sc.nextDouble();

        System.out.println("Quantas moedas de 050 centavos voce economizou");
        double qtdMoeda050 = sc.nextDouble();

        System.out.println("Quantas moedas de 1 real voce economizou");
        double qtdMoeda1 = sc.nextDouble();

        double moeda01_centav = 0.01 * qtdMoeda001;
        double moeda05_centav = 0.05 * qtdMoeda005;
        double moeda10_centav = 0.10 * qtdMoeda010;
        double moeda25_centav = 0.25 * qtdMoeda025;
        double moeda50_centav = 0.50 * qtdMoeda050;
        double moeda1_real = 1.00 * qtdMoeda1;

        double valorTotal = moeda01_centav + moeda05_centav + moeda10_centav + moeda25_centav + moeda50_centav + moeda1_real;

        System.out.println("voce economizou: " + valorTotal + "$");
    }
}

/* Crie um algoritmo que peça a altura e o peso de uma
pessoa. Calcule e informe o IMC.
Considere a fórmula: IMC = peso / ( altura )²*/

import java.util.Scanner;

public class exercicio_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua altura");
        double altura = sc.nextDouble();

        System.out.println("Digite seu peso");
        int peso = sc.nextInt();

        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC é %.1f", imc);
    }
}

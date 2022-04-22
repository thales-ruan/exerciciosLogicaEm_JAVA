// Leia as medidas(b, h) de um retângulo. Escreva a área calculada.

import java.util.Scanner;

public class exercicio_01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a altura do retangulo");
        double a = sc.nextDouble();

        System.out.println("Digite a largura do retangulo");
        double b = sc.nextDouble();

        double c = a * b;

        System.out.println("A area do retangulo é: " + c);
    }
}
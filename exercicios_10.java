/*Leia as medidas(b, h) de um retângulo. Informe a
área calculada e se é um quadrado ou não.*/

import java.util.Scanner;

public class exercicios_10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a altura do retangulo");
        double a = sc.nextDouble();

        System.out.println("Digite a largura do retangulo");
        double b = sc.nextDouble();

        double c = a * b;

        System.out.println("A area é: " + c);

        if(a == b){

            System.out.println("È um quadrado ");
        } else{

            System.out.println("È um retangulo");
        }

    }
}

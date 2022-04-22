/*Leia três valores (A, B e C). Informe se A+B é maior
do que C.*/

import java.util.Scanner;

public class exercicios_13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro valor");
        double a = sc.nextDouble();

        System.out.println("Informe o segundo valor");
        double b = sc.nextDouble();

        System.out.println("Informe o terceiro valor");
        double c = sc.nextDouble();

        if(a + b > c){
            System.out.println("A soma do valor 1 com o valor 2 é maior do que o valor 3");
        } else{
            System.out.println("A soma do valor 1 com o valor 2 é menor do que o valor 3");
        }

    }
}
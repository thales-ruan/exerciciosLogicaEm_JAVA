/* Leia um número de 1 a 10, calcule e mostre a
tabuada.*/

import java.util.Scanner;

public class exercicios_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quer saber a tabuada de qual numero?");
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "X" + i + "=" + num * i);
        }
    }
}

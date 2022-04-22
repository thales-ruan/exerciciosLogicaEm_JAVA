/*Pergunte qual o valor da compra e a forma de
pagamento, se for a vista dê 10% de desconto, caso
contrário dê 5%.*/

import java.util.Scanner;

public class exercicios_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o valor da compra?");
        double valor = sc.nextDouble();

        System.out.println("Forma de pagamento \n 1 - a vista  \n 2- outros");
        int pag = sc.nextInt();

        double avista = 10.0 / 100.0;
        double outros = 5.0 / 100.0;

        double valor_avista = valor - (avista * valor);
        double valor_outros = valor - (outros * valor);

        if (pag == 1) {
            System.out.println("Valor da compra fica " + valor_avista);
        } else {
            System.out.println("Valor da compra fica " + valor_outros);
        }
    }
}

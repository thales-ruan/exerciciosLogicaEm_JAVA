import java.util.Scanner;

/*Leia dois valores (A e B) e informe qual é o maior
valor.*/
public class exercicios_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor");
        double num1 = sc.nextDouble();

        System.out.println("Digite o segundo valor");
        double num2 = sc.nextDouble();

        if(num1 > num2){
            System.out.println("O primeiro valor é maior");
        } else{
            System.out.println("O segundo valor é maior");
        }
    }
}


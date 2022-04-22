/*Tendo como dados de entrada a altura e o sexo de
uma pessoa, construa um algoritmo que calcule seu
peso ideal, utilizando as seguintes fórmulas:*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicios_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua altura");
        double altura = sc.nextDouble();

        System.out.println("Digite seu peso");
        int peso = sc.nextInt();

        double imc = peso / (altura * altura );

        DecimalFormat deci = new DecimalFormat("0.0");

        String ese = deci.format(imc);

        if (imc <=  18.5) {
            System.out.println("IMC: "+ deci.format(imc) + " Abaixo do peso");
        }
        else if(imc >= 18.5 && imc <24.9){
            System.out.println("IMC: "+ deci.format(imc) + " Peso normal");
        }
        else if(imc >= 25 && imc <=29.9){
            System.out.println("IMC: "+ deci.format(imc) + " Sobre peso");
        }
        else if(imc >= 30 && imc <=34.9){
            System.out.println("IMC: "+ deci.format(imc) + " Obesidade I");
        }
        else if(imc >= 35 && imc <=39.9){
            System.out.println("IMC: "+ deci.format(imc) + " Obesidade II");
        }
        else{
            System.out.println("IMC: "+ deci.format(imc) + " Obesidade III");
        }
    }
}


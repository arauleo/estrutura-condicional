package estruturacondicional;

import java.util.Scanner;

public class EstruturaCondicional {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número dentro da categoria dos inteiros:");
        int numero1 = scan.nextInt();

        System.out.println("Digite outro número também inteiro: ");

        int numero2 = scan.nextInt();

        int maior = Math.max(numero1,numero2);

        if (numero1 == numero2) {
            System.out.println("Números iguais.");
        }
        else{
            System.out.println("o maior numero é " + maior);
        }
        System.out.println("Fim do codigo.");


    }
        
}

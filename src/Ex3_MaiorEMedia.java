import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int numero;
        int maior = 0;
        int soma = 0;
        
        int count = 0;

        do{
            System.out.println("Numero: ");
            numero = scan.nextInt();

            soma = soma + numero;

            if(numero > maior)
                maior = numero;
                        
            count++;

        }while(count < 5);

        System.out.println("\nNúmero maior: " + maior);
        System.out.println("Media dos números: " + (soma / 5));

    }
}

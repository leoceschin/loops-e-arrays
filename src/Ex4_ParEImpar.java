import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qtdeNumeros;

        int qtdePares = 0, qtdeImpares = 0;

        int count = 0;

        System.out.println("Insira a quantidade de numeros: ");
        qtdeNumeros = scan.nextInt();

        do {
            System.out.println("Insira um numero: ");
            int numero = scan.nextInt();

            if ((numero % 2) == 0) {
                qtdePares++;
            } else {
                qtdeImpares++;
            }

            count++;
        } while (count < qtdeNumeros);

        System.out.println("Quantidade de números pares: " + qtdePares);
        System.out.println("Quantidade de números impares: " + qtdeImpares);

    }
}

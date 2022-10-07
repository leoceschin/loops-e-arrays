import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira um numero para calcular o seu fatorial: ");
        int numero = scan.nextInt();

        int fatorial = 1;

        for (int i = numero; i >= 1; i--){
            fatorial = fatorial * i;
        }

        System.out.println(numero+"! = " + fatorial);
    }
}

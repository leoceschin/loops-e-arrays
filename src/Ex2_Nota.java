import java.util.Scanner;

public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;
        
        System.out.println("Insira uma nota entre zero e dez");
        nota = scan.nextInt();

        while (nota < 0 || nota > 10) {
            System.out.println("Insira a nota correta!");
            nota = scan.nextInt();

        }

    }
}

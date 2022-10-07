import java.util.Scanner;

public class Ex1_NomeEIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while (true) {
            System.out.println("Insira seu nome: ");
            nome = scan.next();
            if (nome.equals("0"))
                break;

            System.out.println("Insira sua idade: ");
            idade = scan.nextInt();

        }

        System.out.println("Continua aqui...\n");
    }
}

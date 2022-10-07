import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;

        System.out.println("Insira o número que deseja ver: ");
        numero = scan.nextInt();

        System.out.println("Tabuada de "+ numero +":");
        
        for(int i = 1; i <= 10; i++){
            int resultado = numero * i;
            
            System.out.println(numero + " X " + i + " = " + resultado); 
        }

    }
}

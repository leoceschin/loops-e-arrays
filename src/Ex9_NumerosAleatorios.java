import java.util.Random;

public class Ex9_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numeros = new int[20];
        
        // versao em do-while
        /* int count = 0;
         * do{
         * numeros[count] = random.nextInt(100);
         * count++;
         * }while(count < numeros.length);
         */

        // versao em for
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100);
        }

        System.out.println("Numeros e sucessores: ");
        for (int numero : numeros) {
            System.out.println("Numero: " + numero + ", sucessor: " + (numero + 1));
        }

    }
}

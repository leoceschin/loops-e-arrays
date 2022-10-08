import java.util.Random;

public class Ex10_ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] matrizM = new int[4][4];

        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM[i].length; j++) {
                matrizM[i][j] = random.nextInt(9);
            }
        }

        System.out.println("Matriz M: ");
        for (int[] linha : matrizM) {
            for (int coluna : linha) {
                System.out.print(coluna+" ");
            }
            System.out.println();
        }

    }
}

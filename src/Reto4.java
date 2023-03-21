import java.util.Scanner;

public class Reto4 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Por favor digita el tamaño del Sudoku ");
        int tSudoku = leer.nextInt();
        
        int[][] sudoku = new int[tSudoku][tSudoku];
        
        System.out.println("Digita los valores que se guardaran en el Sudoku");

        for (int i = 0; i < tSudoku; i++) {
            for (int j = 0; j < tSudoku; j++) {
                sudoku[i][j] = leer.nextInt();
            }
        }
        
        System.out.println("El Sudoku quedó así: ");

        for (int i = 0; i < tSudoku; i++) {
            for (int j = 0; j < tSudoku; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
        
       
        int sum = 0;
        for (int i = 0; i < tSudoku; i++) {
            sum += sudoku[0][i];
        }
        boolean gana = true;
        for (int i = 1; i < tSudoku; i++) {
            int tempSum = 0;
            for (int j = 0; j < tSudoku; j++) {
                tempSum += sudoku[i][j];
            }
            if (tempSum != sum) {
                gana = false;
                break;
            }
        }
        if (gana) {
            System.out.println("Has ganado,La suma de los lados del Sudoku es igual a "+ sum);
        } else {
            System.out.println("Perdiste, la suma de los lados del Sudoku no es igual.");
        }
        leer.close();
    }

}

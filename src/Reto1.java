import java.util.Scanner;
public class Reto1{
    public static void main(String[] args) {

        Scanner lectura=new Scanner(System.in);

        System.out.println("Por favor, digita el número de competidores: ");

        int numComp=lectura.nextInt();
        
        double[] tiemCompetidor=new double[numComp];

        String[] nomCompetidor=new String[numComp];
        
        for (int i = 0; i < numComp; i++) {

            System.out.print("Digita el nombre del competidor "+(i+1)+ ": ");

            nomCompetidor[i] = lectura.next();

            System.out.print("Digita el tiempo del competidor "+(i+1)+ ": ");

            tiemCompetidor[i] = lectura.nextDouble();
        }
        
        System.out.println("Estos son los tiempos de los competidores: "); 

        for (int i=0; i<numComp; i++) {
            
            System.out.println(nomCompetidor[i]+ ": " +tiemCompetidor[i]);
        }
        
        int ganador = 0;

        for (int i = 1; i < numComp; i++) {

            if (tiemCompetidor[i] < tiemCompetidor[ganador]) {

                ganador = i;
            }
        }
        
        System.out.println("El ganador es " + nomCompetidor[ganador] + " con un tiempo de " + tiemCompetidor[ganador] + " segundos.");

        lectura.close();
    }
    
}
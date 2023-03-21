/*construya un programa que solicite la cantidad de notas a evaluar en una materia
 y el valor de cada una de dichas notas. Calcule el promedio de dichas de notas para 
 obtener la nota final y agregue las siguientes anotaciones según corresponda:
 ✓ Si la nota es menor que 3 Reprobaste.
 ✓ Si la nota está entre 3 y 4.0 Pasaste Raspando.
 ✓ Si la nota es mayor que 4.0 Aprobaste con buenos resultados.
 */

import java.util.Scanner;
public class Reto2{                /*definimos clase */
    public static void main(String[] args) {       /*definimos main */

        Scanner lectura=new Scanner(System.in);    /*instanciamos */

        System.out.print("Digita la cantidad de notas para calcular el promedio: ");

        int nCal=lectura.nextInt();

        double[] notas = new double[nCal];

        for (int i=0; i<nCal; i++) {

            System.out.print("Por favor, digita la nota " + (i + 1) + ": ");

            notas[i]=lectura.nextDouble();   /*arreglo */
        }

        double prom = 0.0;
        for (int i=0; i<nCal; i++) {
            prom += notas[i];    /*ultima iteracion ya tiene las notas almacenadas   */
        }
        prom /= nCal;

        System.out.println("El promedio de las notas ingresadas es: " + prom);

        if (prom<3.0) {

            System.out.println("Reprobaste");

        } else if (prom>= 3.0 && prom<= 4.0) {

            System.out.println("Pasaste raspando");

        } else {

            System.out.println("Aprobaste con buenos resultados");
        }
        lectura.close();
    }
}

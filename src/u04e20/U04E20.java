
package u04e20;

import java.util.Scanner;
public class U04E20 {

    public static void main(String[] args) {
       int cant, nota, sumanota=0, i;
       float promedio;
       Scanner entrada = new Scanner(System.in);
       System.out.print("Ingrese la cantidad de notas: ");
       cant = entrada.nextInt();
       for (i=1; i<=cant; i++){
           System.out.print("Ingrese la nota nro. "+i+":" );
           nota=entrada.nextInt();
           sumanota = sumanota+nota;
       }
       promedio = (sumanota/cant);
       System.out.print("El promedio de las notas es: "+promedio);
    }
}
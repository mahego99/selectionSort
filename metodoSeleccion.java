package estructuradatos;

import java.util.Scanner;

/**
 * NOMBRE DEL ALUMNO: HERNANDEZ GOMEZ MARISOL
 * MATRICULA:9068
 * MATERIA: ESTRUCTURA DE DATOS
 * NOMBRE DEL PROFESOR: VELEZ GERARDO
 * ESCUELA: CETYS UNIVERSIDAD
 * CARRERA: INGENIERIA DE SOFTWARE
 * NOMBRE DE LA PRACTICA: 1) METODO DE SELECCION
 * OBJETIVO: ORDENAMIENTO DE UNA SERIE DE NUMEROS
 */
public class metodoSeleccion 
{
   public static void main(String[] args)
    {  
        /**
         * DECLARAR SCANNER, ARREGLO, VARIABLE AUXILIAR Y VARIABLE QUE 
         * ALMACENARA LOS NUMEROS
         */
        Scanner input = new Scanner(System.in);
        double hjelp=0;
        /**
         * MENSAJE MOSTRADO EN LA CONSOLA QUE DETERMINARA 
         * EL TAMAÑO DEL ARRAY PARA ALMACENAR LOS NUMEROS
         */
        System.out.println("ORDENAMIENTO DE SELECCION");
        System.out.println("Ingrese el número de elementos");
        int gemNumber = input.nextInt();
        double liste [] = new double[gemNumber];
        
        /**
         * MANDAR EL METODO PARA EL ORDENAMIENTO DE SELECCION
         */
        double seleccionMetodo = metodoSeleccion(gemNumber, liste);

    }

   /**
    * METODO DE ORDENAMIENTO DE SELECCION
    * @param gemNumber
    * @param liste
    * @return 
    */
    public static double metodoSeleccion(double gemNumber, double liste[])
    {
        
        Scanner input = new Scanner(System.in);
        double hjelp = 0;
        /**
         * FOR QUE GUARDA LOS NUMEROS INGRESADOS POR EL USUARIO DEPENDIENDO EL TAMAÑO DEL ARRAY
         */
        for(int i = 0; i<gemNumber; i++)
        {
            System.out.println((i+1)+ ". Ingrese un número");
            liste[i] = input.nextInt();
        }
        /**
         * FOR QUE RECORRERA EL ARRAY
         */
        for(int i = 0; i<(liste.length-1); i++)
        {
            int numberIndexMenor = i;
            /**
            * FOR PARA ORDENAR LOS NUMEROS
            */ 
            for(int j = i+1; j<(liste.length); j++)
            {
                if(liste[j]<liste[numberIndexMenor])
                {
                    numberIndexMenor = j;
                }
            }

            /**
             * IF QUE COMPARA LOS NUMEROS Y LOS ORDENA
             */
            if(i!=numberIndexMenor)
            {
               hjelp = liste[i]; 
               liste[i] = liste[numberIndexMenor];
               liste[numberIndexMenor] = hjelp; 

            }
        }
        /**
         * MANDAR A LLAMAR EL METODO DESCENDENTE PARA IMPRIMIR LOS NUMEROS ORDENADOS
         */
        double descendenteMetodo = metodoDescendente(gemNumber, liste);
        
        return 0;
    }
    
    /**
     * METODO QUE ORDENA LOS NUMEROS DE MANERA ASCENDENTE
     * @param gemNumber
     * @param liste
     * @return 
     */
    public static double metodoAscendente(double gemNumber, double liste[])
    {
            
        System.out.println("Ascendente"); 
        for(int i=0; i<gemNumber; i++)
        {
            System.out.print(liste[i] + "|");
        }
        return 0;
    }
    
    /**
     * METODO QUE ORDENAMIENTO DESCENDENTE
     * @param gemNumber
     * @param liste
     * @return 
     */
    public static double metodoDescendente(double gemNumber, double liste[])
    {
        /**
         * MANDAR A LLAMAR EL METODO DE ORDENAMIENTO ASCENDENTE 
         * NO IMPORTA QUE METODO LLAME PRIMERO SIEMPRE ESTARAN ORDENADOS
         */
        metodoAscendente(gemNumber, liste);
        System.out.println("\n" + "Descendente"); 
        for(int i = (int) (gemNumber-1); i>=0; i--)
        {
            System.out.print(liste[i] + "|");
        }
        return 0;
    }

} 


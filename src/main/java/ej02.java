/*
Escribe un programa para leer la altura de un número determinado de personas y 
calcular la altura media. El número de personas se pide por teclado y debe ser 
entero un entero mayor que cero. Posteriormente el programa irá pidiendo la 
altura, en cm, de cada una de las personas y las guardará en una estructura de 
almacenamiento. Si la altura leída no es positiva, el programa la pasará a 
número positivo. También es necesario saber cuántas personas tienen una altura 
superior a la media e inferior a la media. 
*/

import java.util.Scanner;
/**
 *
 * @author aleja
 */
public class ej02 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        boolean repetir = true;
        
        int personas, mayor=0, menor=0;
        double media, suma=0;
        
        do{
            System.out.println("¿Cuantas personas?");
                String respuesta = teclado.nextLine();
                personas = Integer.parseInt(respuesta);
        }while(personas==0);
        
        double [] array = new double [personas];
        
        for(int i=0; i<=personas; i++){
            System.out.println("Altura de la persona " + (i+1));
            array[i]= teclado.nextDouble();
            
            if(array[i]<0){
                array[i] = array[i]*(-1);
                System.out.println("El numero se ha cambiado a: " + array[i]);
            }
            
            //hacemos una suma total de las alturas
            suma = suma + array[i];
        }
        
        //Aqui calculamos la media
        media = suma / personas;
        System.out.println("La media de la altura es: " + media + " cm");
        
        for(int i=0; i<personas; i++){
            //depuramos cada una de los array
            if(array[i]<media){
                menor++;//si es menor se suma uno a "menor"
            }else{
                mayor++;//si no se suma 1 a "mayor"
            }
        
        }
        //mostramos por pantalla el numero de personas mayor y menos a la media
            System.out.println("Hay " + menor + " personas menor a la media y "
            + mayor + " personas que superan la media.");
    }
    
}

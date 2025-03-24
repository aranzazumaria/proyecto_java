
package aplicacioncalculadora;

import javax.swing.JOptionPane;
public class AplicacionCalculadora {

    public static void main(String[] args) {
       int sumar_numeros=0;
    //visualiza una ventana para introducir un número.
    int numero=Integer.parseInt(JOptionPane.showInputDialog(" introduce un número "
            + "para calcular la suma de todos los números "
            + "enteros desde 1 hasta el número ingresado. "
            + "El número ingresado debe ser menor que 100\""));
     if(numero <100){
       
       for (int i=1; i<=numero; ++i)
        {  
            sumar_numeros+=i;
             
        }
       
          JOptionPane.showMessageDialog(null, sumar_numeros); 
          
          //Condicional
    } 
          
    else
      JOptionPane.showMessageDialog(null, "el número introducido no es menor que 100"); 
     
     sumar(2,3);
    
    }  
    //vamos a crear una funcion
    public static void  sumar(int numero1, int numero2)
    {   int suma=numero1+numero2;
        System.out.println(numero1  + "+" + numero2 + "=" + suma);
    }
}

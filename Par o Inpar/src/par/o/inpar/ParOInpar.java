/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package par.o.inpar; 

import java.util.Scanner; 

/**
 *
 * @author herna
 */
public class ParOInpar {
     public static void main(String[] args) {
        // TODO code applicationystem.in) ;logic here
        Scanner reader= new Scanner (System.in); 
        int numero , resto;
        System.out.print("introdusca un numero entero: ");
       
       
        try{
            numero=reader.nextInt();
            resto=numero/3;
         for (int i=1; i<=10; i++){    
        System.out.println(numero+"x"+i+"="+resto/3);   
        
           
        } 
        }
        catch (Exception exception){
            System.out.println("por favor, introdusca un numero entero, Gracias");
            System.out.println(exception.getMessage());
            
        }
    }
     }


   
   
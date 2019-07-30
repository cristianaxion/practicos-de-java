/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restoran.todo.en.uno;

import java.util.Scanner;
public class RESTORANTodoEnUno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner teclado=new Scanner(System.in);
            
      int dia,almorzar,menu;
       boolean error;
      String Opcion;
       
      do{
      System.out.println("INDIQUE EL DIA QUE INGRESARA AL RESTORANT:");
   do{
      System.out.println("INGRESE 1, PARA MARTES.");
      System.out.println("INGRESE 2, PARA MIERCOLES.");
      System.out.println("INGRESE 3, PARA JUEVES.");
      System.out.println("INGRESE 4, PARA VIERNES.");
      System.out.println("INGRESE 5, PARA SABADO.");
      System.out.println("INGRESE 6, PARA DOMINGO."); 
      dia=teclado.nextInt();
      
      if (dia==1) { 
      System.out.println("ingreso martes ");  
      error=false;
      break;
    } else if (dia==2){
      System.out.println("ingreso miercoles ");
      error=false;
      break;
    } else if (dia==3){
      System.out.println("ingreso jueves ");
      error=false;
      break;
    } else if (dia==4){
      System.out.println("ingreso viernes ");
      error=false;
      break;
    } else if (dia==5){
      System.out.println("ingreso -sabado ");
      error=false;
      break;
    } else if (dia==6){
      System.out.println("ingreso domingo ");
       error=false;
       break;
    }
         error=true;
      System.out.println(" ERROR -Ingrese Nuevamente un Numero- GRACIAS");  
      
   } while (error);
      
      System.out.println("---------------------------------------------------");
    
    
      System.out.println("HORARIO DE ATENCION DE 11:00hs A 00:30hs "); 
      do{
      System.out.println("INGRESE 1, PARA ALMORZAR - 2 PARA CENAR."); 
      almorzar=teclado.nextInt();
      
      if (almorzar==1) { 
      System.out.println("Descuento 7% PARA EL MENU DEL DIA ");  
      error=false;
      break;
      } else if (almorzar==2){
      System.out.println(" DESCUNTO 0% ");
      error=false;
      break;
    }
       error=true;
      System.out.println(" ERROR -Ingrese Nuevamente un Numero- GRACIAS");  
      } while (error);
      
      System.out.println("---------------------------------------------------");
    
      System.out.println("INDIQUE SU MENU:");
       do {
      System.out.println("INGRESE 1, PARA EL MENU DEL DIA- POLLO CON PAPAS.");
      System.out.println("INGRESE 2, PARA EL MENU- BIFE DE CHORIZO CON PURE.");
      System.out.println("INGRESE 3, PARA EL MENU- TALLARINES CON SALSA DE CHAMPINIONG.");
      menu=teclado.nextInt();
      
      if (menu==1) { 
      System.out.println("MENU ELEJIDO: POLLO CON PAPAS.");  
      error=false;
              break;
    } else if (menu==2){
      System.out.println("MENU ELEJIDO: BIFE DE CHORIZO CON PURE.");
      error=false;
              break;
    } else if (menu==3){
      System.out.println("MENU ELEJIDO: TALLARINES CON SALSA DE CHAMPINIONG.");
      error=false;
              break;
    } error=true;
      System.out.println(" ERROR -Ingrese Nuevamente un Numero- GRACIAS");  
       } while (error);
        
      System.out.println("si quiere repetir precione Y sino N");
      Opcion = teclado.next();
    }
      while (Opcion.equals("Y")||Opcion.equals("y")); 
    }     
  }



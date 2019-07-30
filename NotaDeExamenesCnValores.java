/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nota.de.examenes.cn.valores;

import java.util.Scanner;

/**
 *
 * @author herna
 */
public class NotaDeExamenesCnValores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner leerteclado=new Scanner(System.in);
        
       String alumno, curso;
        float  nota1,nota2,nota3,nota4;
        float resultado;
         String Opcion;
        
     
      
     do{
         do{ 
             
      System.out.println("INGRESE Nombre y Apellido del ALUMNO:");
      alumno=leerteclado.next();
      System.out.println("---------------------------------------------------");
     
      System.out.println("INGRESE Nombre del Cuso:");
      curso=leerteclado.next();
      System.out.println("---------------------------------------------------");
      
      System.out.println("si quiere repetir precione Y sino N");
      Opcion = leerteclado.next();
      }
      while (Opcion.equals("Y")||Opcion.equals("y")); 
     
     
      System.out.println("INGRESE: Nota del primer examen" );
             nota1=leerteclado.nextFloat();  
      System.out.println("INGRESE: Nota del segundo examen" );
             nota2=leerteclado.nextFloat();  
      System.out.println("INGRESE: Nota del tercer examen" );
             nota3=leerteclado.nextFloat();  
      System.out.println("INGRESE: Nota del cuarto examen" );
             nota4=leerteclado.nextFloat();  
             
               resultado= (nota1+nota2+nota3+nota4)/4;
               System.out.println("Su Promedio es :"+resultado);
          
      if (resultado<=4||resultado<=4.9) { 
      System.out.println("INSUFICIENTE");  
      } 
       else if (resultado==5||resultado<=5.9){
      System.out.println("REGULAR "); 
      }
      else if (resultado==6||resultado<=6.9){
      System.out.println("REGULAR "); 
      }
      else if (resultado==7||resultado<=7.9){
      System.out.println("BUENO "); 
      }
      else if (resultado==8||resultado<=8.9){
      System.out.println("MUY BUENO "); 
      }
      else if (resultado==9||resultado<=9.9){
      System.out.println("EXELENTE "); 
      }
      else if (resultado==10){
      System.out.println("SOBRESALIENTE "); 
      }
       System.out.println("si quiere repetir precione Y sino N");
      Opcion = leerteclado.next();
      }
      while (Opcion.equals("Y")||Opcion.equals("y")); 
    }    
}


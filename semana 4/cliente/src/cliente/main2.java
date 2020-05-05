/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import java.util.Scanner;

/**
 *
 * @author Mauricio
 */
public class main2 {
     public static void main(String[] args) {

     Scanner sc= new Scanner(System.in);
      
        Cliente v[];
        int n, acuEdadMascota=0,contAmbiMayor=0;
        
       
                
        System.out.println("ingrese el numero de cliente a generar");
        n = sc.nextInt();
        
        v = new Cliente[n];
         
        
        for (int i = 0; i < v.length; i++) {
            v[i]=new Cliente();        
                    
            System.out.println("ingrese el numero del cliente (" + (i+1) + ")"  );
            v[i].setNroCliente(sc.nextInt()); 
            
            System.out.println("ingrese el nombre del cliente (" + (i+1) + ")"  );
             v[i].setNombreCliente(sc.next());
             
             System.out.println("ingrese la antiguedad del cliente (" + (i+1) + ")"  );
             v[i].setAntiguedad(sc.nextInt());
             
             
             Mascota  masco = new Mascota ();
             
             System.out.println("ingrese el nombre de mascota del cliente (" + (i+1) + ")"  );
             masco.setNombre(sc.next());
             
              System.out.println("ingrese la edad de la mascota del cliente (" + (i+1) + ")"  );
             masco.setEdad(sc.nextInt());
             
             v[i].setMasco(masco);
             
           
            
}
        // Mostrar la cantidad de clientes
         System.out.println("la cantidad de clientes son " + v.length ) ;
        
         
         
         for (int i = 0; i < v.length; i++) {
             
             acuEdadMascota = acuEdadMascota+ v[i].getMasco().getEdad();
             // 
               
             if (v[i].getAntiguedad() >= 5){
                 contAmbiMayor++;
             }
           
         }
        double promedioEdad = acuEdadMascota /v.length;
         System.out.println("el promedio edad de las mascotas es " +promedioEdad );
         
         System.out.println("Hay " +contAmbiMayor+" clientes con antiguedad mayor igual a 5 ");
         
         
         
        
     }
}

     
        


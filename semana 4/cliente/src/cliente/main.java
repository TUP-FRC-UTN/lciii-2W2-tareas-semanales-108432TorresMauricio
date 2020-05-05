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
public class main {
     public static void main(String[] args) {

     Scanner sc= new Scanner(System.in);
      
        Cliente v[];
        int suma , n ,cliNro,cliAntiguedad,mascoEdad, acuEdadMascota=0,contAmbiMayor=0;
        String cliNombre,mascoNombre;
        Mascota cliMascota;
                
        System.out.println("ingrese el numero de cliente a generar");
        n = sc.nextInt();
        
        v = new Cliente[n];
         
        
        for (int i = 0; i < v.length; i++) {
            System.out.println("ingrese el numero del cliente (" + (i+1) + ")"  );
            cliNro = sc.nextInt();
            
            System.out.println("ingrese el nombre del cliente (" + (i+1) + ")"  );
             cliNombre = sc.next();
             
             System.out.println("ingrese la antiguedad del cliente (" + (i+1) + ")"  );
             cliAntiguedad = sc.nextInt();
             
             System.out.println("ingrese el nombre de mascota del cliente (" + (i+1) + ")"  );
             mascoNombre = sc.next();
             
              System.out.println("ingrese la edad de la mascota del cliente (" + (i+1) + ")"  );
             mascoEdad = sc.nextInt();
             
             
             Mascota m = new Mascota (mascoNombre, mascoEdad) ;
             Cliente c = new Cliente (cliNro, cliNombre,  cliAntiguedad, m) ;
             
             
             v[i] = c;
            
}
        // Mostrar la cantidad de clientes
         System.out.println("la cantidad de clientes son " + v.length ) ;
        
         
         
         for (int i = 0; i < v.length; i++) {
             Cliente cliente = v[i];
             Mascota masco = cliente.getMasco();
             acuEdadMascota = acuEdadMascota+ masco.getEdad();
             // 
             int clienteAmbi = cliente.getAntiguedad();
             if (clienteAmbi >= 5){
                 contAmbiMayor++;
             }
           
         }
        double promedioEdad = acuEdadMascota /v.length;
         System.out.println("el promedio edad de las mascotas es " +promedioEdad );
         
         System.out.println("Hay " +contAmbiMayor+" clientes con antiguedad mayor igual a 5 ");
         
         
         
        
     }
}

     
        


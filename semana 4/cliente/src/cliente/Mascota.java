
package cliente;




public class Mascota {

 
    
   String nombre; 
   private int edad;

   
 
   
   
     public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
      
    }
       public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public Mascota(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

  public Mascota(){
      nombre="";
      edad =0;
              
  }
    
}

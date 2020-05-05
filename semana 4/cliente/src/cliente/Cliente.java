/*
 un numero de cliente, un
nombre, una antigüedad (hace cuánto que son clientes de la veterinaria) y una
Mascota. De la Mascota se dispone los siguientes datos: el nombre y la edad.*/

package cliente;




public class Cliente {

    private int  nroCliente;
    private String nombreCliente;
    private int antiguedad;
    private Mascota masco;

    public int getNroCliente() {
        return nroCliente;
    }

    public void setNroCliente(int nroCliente) {
        this.nroCliente = nroCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public Mascota getMasco() {
        return masco;
    }

    public void setMasco(Mascota masco) {
        this.masco = masco;
    }
    
    
    public Cliente(int nroCliente, String nombreCliente, int antiguedad , Mascota m) {
        this.nroCliente = nroCliente;
        this.nombreCliente = nombreCliente;
        this.antiguedad = antiguedad;
        masco = m;
        
    }
    
    public Cliente (){
        nroCliente = 0;
        nombreCliente = "";
        antiguedad =0;
        masco = new Mascota();
    }
  
   
    
       
  }
     
    
    


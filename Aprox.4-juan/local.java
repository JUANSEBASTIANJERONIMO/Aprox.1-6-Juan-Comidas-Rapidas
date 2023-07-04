
public class local
{
    private final String nit;
    private String nombrelocal;
    private String direccion;
    private Comida[] comida;
    private int numComidas;
    
    public local(String nit,String nombrelocal,String direccion){
        if(nit != null) this.nit = nit;
        else this.nit = ""; 
        setNombrelocal(nombrelocal);
        setDireccion(direccion);        
        comida = new Comida[20];
        numComidas = 0;
    }
    
    public String getNit(){
        return nit;
    }
    
    public String getNombrelocal(){
        return nombrelocal;
    }
    public void setNombrelocal(String nombrelocal){
        if(nombrelocal != null){
            this.nombrelocal = nombrelocal;
        }else{
            this.nombrelocal = "";
        }        
    }
    
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion){
        if(direccion != null){
            this.direccion = direccion;
        }else{
            this.direccion = "";
        }        
    }
    
    public int getNumComidas(){
        return numComidas;
    }
    
    public double calcularPromedioGeneral(){
        double promedio = 0;
        for(int i = 0; i < numComidas; i++){
            promedio = promedio + comida [i].calcularPromedio() / numComidas;
        }
        return promedio;
    }
    
    public void adicionarProducto(String nombreproducto, double precioproducto, double lunes, double martes, double miercoles, double jueves, double viernes, double sabado, double domingo ){
        Comida e = new Comida(nombreproducto, precioproducto, lunes, martes, miercoles, jueves, viernes, sabado, domingo );
        comida[numComidas] = e;
        numComidas++;
    }
}   
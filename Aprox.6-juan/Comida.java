public class Comida {
    private final String nombreproducto;
    private double precioproducto;
    
    double calcularPromedio(){
        return 0;
    }

    public String getNombreproducto(){
        return nombreproducto;
    }
    
    public double getPrecioproducto(){
        return precioproducto;
    }
    public void setPrecioproducto(double precioproducto){
        if(precioproducto >= 0) this.precioproducto = precioproducto;
        else this.precioproducto = 0;
    }
    
    public Comida(String nombreproducto,double precioproducto){
        if (nombreproducto != null)this.nombreproducto = nombreproducto;
        else this.nombreproducto = "";
        this.precioproducto = precioproducto;
    }
}
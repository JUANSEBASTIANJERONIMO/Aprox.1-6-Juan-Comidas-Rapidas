public class perrocalienteespecial{
    private final String nombreproducto;
    private double lunes;
    private double martes;
    private double miercoles;
    private double jueves;
    private double viernes;
    private double sabado;
    private double domingo;
    
    public String getNombreProducto(){
        return nombreproducto;
    }
    
    public double getLunes(){
        return lunes;
    }
    public void setLunes(double lunes){
        if(lunes >=0) this.lunes = lunes;
        else this.lunes = 0;
    }
    
    public double getMartes(){
        return martes;
    }
    public void setMartes(double martes){
        if(martes >= 0) this.martes = martes;
        else this.martes = 0;
    }
    
    public double getMiercoles(){
        return miercoles;
    }
    public void setMiercoles(double miercoles){
        if(miercoles >= 0) this. miercoles = miercoles;
        else this.miercoles = 0;
    }
    
    public double getJueves(){
        return jueves;
    }
    public void setJueves(double jueves){
        if(jueves >= 0) this.jueves = jueves;
        else this.jueves = 0;
    }
    
    public double getViernes(){
        return viernes;
    }
    public void setViernes(double viernes){
        if(viernes >= 0) this.viernes = viernes;
        else this.viernes = 0;
    }
    
    public double getSabado(){
        return sabado;
    }
    public void setSabado(double sabado){
        if(sabado >= 0) this.sabado = sabado;
        else this.sabado = 0;
    }
    public void setDomingo(double domingo){
        if(domingo >= 0) this.domingo = domingo;
        else this.domingo = 0;
    }
    
    perrocalienteespecial(String nombreproducto, double lunes, double martes, double miercoles, double jueves, double viernes, double sabado, double domingo){
        if(nombreproducto != null) this.nombreproducto = nombreproducto;
        else this.nombreproducto = "";
        setLunes(lunes);
        setMartes(martes);
        setMiercoles(miercoles);
        setJueves(jueves);
        setViernes(viernes);
        setSabado(sabado);
        setDomingo(domingo);
    }
    
    double calcularPromedio(){
        return (lunes + martes + miercoles + jueves + viernes + sabado + domingo) / 7;
    }
}


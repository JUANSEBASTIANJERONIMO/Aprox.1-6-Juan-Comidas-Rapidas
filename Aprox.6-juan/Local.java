public class Local
{
    private final String nit;
    private String nombreLocal;
    private String direccion;
    private PerroCalienteEspecial[]PerroCaliente;
    private HamburguesaEspecial[] Hamburguesa;
    private SalchipapaEspecial[] Salchipapa;    
    private int numPerroCaliente;
    private int numHamburguesa;
    private int numSalchipapa;    
    
    public Local(String nit,String nombreLocal,String direccion){
        if(nit != null) this.nit = nit;
        else this.nit = ""; 
        setNombreLocal(nombreLocal);
        setDireccion(direccion);        
        PerroCaliente = new PerroCalienteEspecial[50];
        Hamburguesa = new HamburguesaEspecial[50];
        Salchipapa = new  SalchipapaEspecial[50];        
        numPerroCaliente = 0;
        numHamburguesa = 0;
        numSalchipapa = 0;        
    }
    
    public String getNit(){
        return nit;
    }
    
    public String getNombreLocal(){
        return nombreLocal;
    }
    public void setNombreLocal(String nombrelocal){
        if(nombreLocal!= null){
            this.nombreLocal = nombreLocal;
        }else{
            this.nombreLocal = "";
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
    
    public int getNumPerroCaliente(){
        return numPerroCaliente;
    }
    
    public int getNumHamburguesa(){
        return numHamburguesa;
    }
    
    public int getNumSalchipapa(){
        return numSalchipapa;
    }    
    
    public double calcularPromedioGeneral(){
        double promedio = 0;
        for(int i = 0; i < numPerroCaliente; i++){
            promedio = promedio + PerroCaliente [i].calcularPromedio() / numPerroCaliente;
        }
        for(int i = 0; i < numHamburguesa; i++){
            promedio = promedio + Hamburguesa[i].calcularPromedio() / numHamburguesa;
        }
        for(int i = 0; i < numSalchipapa; i++){
            promedio = promedio + Salchipapa[i].calcularPromedio() / numSalchipapa;
        }
        return promedio / 7;
    }
    public void adicionarPerroCalienteEspecial(String nombreproducto,double precioproducto, double lunes, double martes, double miercoles, double jueves, double viernes, double sabado, double domingo){
        PerroCaliente[numPerroCaliente] = new PerroCalienteEspecial(nombreproducto , precioproducto, lunes, martes, miercoles, jueves, viernes, sabado, domingo);
        numPerroCaliente++;
    }
    
    public void adicionarHamburguesaEspecial(String nombreproducto,double precioproducto, double lunes, double martes, double miercoles, double jueves, double viernes, double sabado, double domingo){
        Hamburguesa[numHamburguesa] = new HamburguesaEspecial(nombreproducto , precioproducto, lunes, martes, miercoles, jueves, viernes, sabado, domingo);
        numHamburguesa++;
    }
    
    public void adicionarSalchipapaEspecial(String nombreproducto,double precioproducto, double lunes, double martes, double miercoles, double jueves, double viernes, double sabado, double domingo){
        Salchipapa[numSalchipapa] = new SalchipapaEspecial(nombreproducto , precioproducto, lunes, martes, miercoles, jueves, viernes, sabado, domingo);
        numSalchipapa++;
    }
} 
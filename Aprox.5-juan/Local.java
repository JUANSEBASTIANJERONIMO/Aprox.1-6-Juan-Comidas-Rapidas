public class Local
{
    private final String nit;
    private String nombreLocal;
    private String direccion;
    private salchipapaespecial[] Salchipapa;
    private hamburguesaespecial[] Hamburguesa;
    private perrocalienteespecial[] PerroCaliente;
    private int numSalchipapa;
    private int numHamburguesa;
    private int numPerroCaliente;
    
    public Local(String nit, String nombreLocal, String direccion) {
        if (nit != null) {
            this.nit = nit;
        } else {
            this.nit = ""; 
        }
        
        setNombrelocal(nombreLocal);
        setDireccion(direccion);        
        Salchipapa = new salchipapaespecial[50];
        Hamburguesa = new hamburguesaespecial[50];
        PerroCaliente = new perrocalienteespecial[50];
        numSalchipapa = 0;
        numHamburguesa = 0;
        numPerroCaliente = 0;        
    }
    
    public String getNit() {
        return nit;
    }
    
    public String getNombreLocal() {
        return nombreLocal;
    }
    
    public void setNombrelocal(String nombrelocal) {
        if (nombrelocal != null) {
            this.nombreLocal = nombrelocal;
        } else {
            this.nombreLocal = "";
        }        
    }
    
    public String getDireccion() {
        return direccion;
    }
    
    public void setDireccion(String direccion) {
        if (direccion != null) {
            this.direccion = direccion;
        } else {
            this.direccion = "";
        }        
    }
    
    public int getNumSalchipapa() {
        return numSalchipapa;
    }
    
    public int getNumHamburguesa() {
        return numHamburguesa;
    }
    
    public int getNumPerroCaliente() {
        return numPerroCaliente;
    }    
    
    public double calcularPromedioGeneral() {
        double promedio = 0;
        
        for (int i = 0; i < numSalchipapa; i++) {
            promedio = promedio + Salchipapa[i].calcularPromedio() / numSalchipapa;
        }
        
        for (int i = 0; i < numHamburguesa; i++) {
            promedio = promedio + Hamburguesa[i].calcularPromedio() / numHamburguesa;
        }
        
        for (int i = 0; i < numPerroCaliente; i++) {
            promedio = promedio + PerroCaliente[i].calcularPromedio() / numPerroCaliente;
        }
        
        return promedio / 7;
    }
    
    public void adicionarsalchipapaespecial(String nombreproducto, double lunes, double martes, double miercoles, double jueves, double viernes, double sabado, double domingo) {
        Salchipapa[numSalchipapa] = new salchipapaespecial(nombreproducto, lunes, martes, miercoles, jueves, viernes, sabado, domingo);
        numSalchipapa++;
    }
    
    public void adicionarhamburguesaespecial (String nombreproducto, double lunes, double martes, double miercoles, double jueves, double viernes, double sabado, double domingo) {
        Hamburguesa[numHamburguesa] = new hamburguesaespecial(nombreproducto, lunes, martes, miercoles, jueves, viernes, sabado, domingo);
        numHamburguesa++;
    }
    
    public void adicionarperrocalienteespecial(String nombreproducto, double lunes, double martes, double miercoles, double jueves, double viernes, double sabado, double domingo) {
        PerroCaliente[numPerroCaliente]  = new perrocalienteespecial(nombreproducto, lunes, martes, miercoles, jueves, viernes, sabado, domingo);
        numPerroCaliente++;
    }
}

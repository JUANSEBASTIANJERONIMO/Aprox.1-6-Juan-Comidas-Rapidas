public class ComidaRapida
{
    
    double precioproducto;
    String nombreproducto;
    double gastosmateriaprima;
    double ventalunes;
    double ventamartes;
    double ventamiercoles;
    double ventajueves;
    double ventaviernes;
    double ventasabado;
    double ventadomingo;
ComidaRapida( double precioproducto, double gastosmateriaprima, double ventauno, double ventados, double ventatres, double ventacuatro, double ventacinco, double ventaseis, double ventasiete){
        this.precioproducto = precioproducto;
        this.gastosmateriaprima = gastosmateriaprima;
        this.ventalunes = ventalunes;
        this.ventamartes = ventamartes;
        this.ventamiercoles = ventamiercoles;
        this.ventajueves = ventajueves;
        this.ventaviernes = ventaviernes;
        this.ventasabado = ventasabado;
        this.ventadomingo = ventadomingo;
    }
    
    double calcularpromedioventas(){
        return (ventalunes + ventamartes + ventamiercoles + ventajueves + ventaviernes + ventasabado + ventadomingo - gastosmateriaprima) / 4;
    }
}
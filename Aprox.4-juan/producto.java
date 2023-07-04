import java.util.Scanner;
public class producto{
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        int numComidas;
        local miLocal = new local("122820","La vencindad del chavo","Bosa");
        String nombreproducto;
        double precioproducto,lunes, martes, miercoles, jueves, viernes, sabado, domingo;
        double promedio = 0;
        
        System.out.println("Digite el numero de productos: ");
        numComidas = sc.nextInt();
        
        for(int i = 0; i < numComidas; i++){
            System.out.println("Digite el nombre del producto: ");
            nombreproducto = sc.next();
            System.out.println("Digite el precio del producto: ");
            precioproducto = sc.nextDouble();
            System.out.println("Digite la venta del dia lunes: ");
            lunes = sc.nextDouble();
            System.out.println("Digite la venta del dia martes: ");
            martes = sc.nextDouble();
            System.out.println("Digite la venta del dia miercoles: ");
            miercoles = sc.nextDouble();            
            System.out.println("Digite la venta del dia jueves: ");
            jueves = sc.nextDouble();
            System.out.println("Digite la venta del dia viernes: ");
            viernes = sc.nextDouble();
            System.out.println("Digite la venta del dia sabado: ");
            sabado = sc.nextDouble();
            System.out.println("Digite la venta del dia domingo: ");
            domingo = sc.nextDouble();
            miLocal.adicionarProducto(nombreproducto, precioproducto, lunes, martes, miercoles, jueves, viernes, sabado, domingo);
        }
        
        promedio = miLocal.calcularPromedioGeneral();        
        System.out.println("\n El promedio de ventas es: " + promedio); 
    }
}

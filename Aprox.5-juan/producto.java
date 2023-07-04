import java.util.Scanner;

public class producto{
    public static void main(String Args[]) throws Exception{
        Scanner sc = new Scanner(System.in);        
        Local miLocal = new Local("122820","La vecindad del chavo","Bosa");
        String nombreproducto;
        
        double promedio = 0;
        
        System.out.println("Digite el numero de pedido de salchipapaespecial: ");
        int numSalchipapa = sc.nextInt();
        for(int i = 0; i < numSalchipapa; i++){
            double lunes, martes, miercoles, jueves, viernes, sabado, domingo;
            System.out.println("Digite el nombre del producto: ");
            nombreproducto = sc.next();
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
            miLocal.adicionarsalchipapaespecial(nombreproducto, lunes, martes, miercoles, jueves, viernes, sabado, domingo);
        }
                
        System.out.println("Digite el numero de pedido de hamburguesaespecial: ");
        int numHamburguesa = sc.nextInt();
        for(int i = 0; i < numHamburguesa; i++){
            double lunes, martes, miercoles, jueves, viernes, sabado, domingo;
            System.out.println("Digite el nombre del producto: ");
            nombreproducto = sc.next();
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
            miLocal.adicionarhamburguesaespecial(nombreproducto, lunes, martes, miercoles, jueves, viernes, sabado, domingo);
        }
        
        System.out.println("Digite el numero de pedido de perrocalienteespecial: ");
        int numPerroCaliente = sc.nextInt();
        for(int i = 0; i < numPerroCaliente; i++){
            double lunes, martes, miercoles, jueves, viernes, sabado, domingo;
            System.out.println("Digite el nombre del producto: ");
            nombreproducto = sc.next();
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
            miLocal.adicionarperrocalienteespecial(nombreproducto, lunes, martes, miercoles, jueves, viernes, sabado, domingo);
        }
        
        promedio = miLocal.calcularPromedioGeneral();
        System.out.println("\n El promedio de ventas es: " + promedio); 
    }
}

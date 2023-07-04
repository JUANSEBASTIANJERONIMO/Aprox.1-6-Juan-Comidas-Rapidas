import java.util.Scanner;

public class producto{
    public static void main(String Args[]) throws Exception{
        Scanner sc = new Scanner(System.in);        
        Local miLocal = new Local("122820","La vecindad del chavo","Bosa");
        String nombreproducto;
        double precioproducto = 0;
        double promedio = 0;

        System.out.println("Digite el numero de pedido de perro caliente especial: ");
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
            miLocal.adicionarPerroCalienteEspecial(nombreproducto, precioproducto, lunes, martes, miercoles, jueves, viernes, sabado, domingo);
        }

        System.out.println("Digite el numero de pedido de Hamburguesa: ");
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
            miLocal.adicionarHamburguesaEspecial(nombreproducto, precioproducto, lunes, martes, miercoles, jueves, viernes, sabado, domingo);
        }

        System.out.println("Digite el numero de pedido de Salchipapa: ");
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
            miLocal.adicionarSalchipapaEspecial(nombreproducto, precioproducto, lunes, martes, miercoles, jueves, viernes, sabado, domingo);
        }

        promedio = miLocal.calcularPromedioGeneral();
        System.out.println("\n El promedio de ventas es: " + promedio); 
    }
}

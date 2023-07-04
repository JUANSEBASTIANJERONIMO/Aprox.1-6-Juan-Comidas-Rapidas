import java.util.Scanner;

public class promedio{
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        int numComidas;
        Comida[] lasComidas = new Comida[50];
        String nombreproducto;
        double precioproducto, lunes, martes, miercoles, jueves, viernes, sabado, domingo;
        double promedio = 0;
        
        System.out.println("Digite el numero de ventas: ");
        numComidas = sc.nextInt();
        
        for(int i = 0; i < numComidas; i++){
            System.out.println("Digite el nombre del producto: ");
            nombreproducto = sc.next();
            System.out.println("Digite el precio del producto: ");
            precioproducto = sc.nextDouble();
            System.out.println("indique el numero de productos vendidos el dia lunes: ");
            lunes = sc.nextDouble();
            System.out.println("indique el numero de productos vendidos el dia martes: ");
            martes = sc.nextDouble();
            System.out.println("indique el numero de productos vendidos el dia miercoles: ");
            miercoles = sc.nextDouble();
            System.out.println("indique el numero de productos vendidos el dia jueves: ");
            jueves = sc.nextDouble();            
            System.out.println("indique el numero de productos vendidos el dia viernes: ");
            viernes = sc.nextDouble();
            System.out.println("indique el numero de productos vendidos el dia sabado: ");
            sabado = sc.nextDouble();
            System.out.println("indique el numero de productos vendidos el dia domingo: ");
            domingo = sc.nextDouble();
            Comida unpedido = new Comida(nombreproducto, precioproducto, lunes, martes, miercoles, jueves, viernes, sabado, domingo);
            lasComidas[i] = unpedido;
        }
        for(int i = 0; i < numComidas; i++)
            promedio = promedio + lasComidas[i].calcularPromedio() /numComidas;
        
        System.out.println("\n El promedio de ventas es: " + promedio); 
    }
}

import java.util.Scanner;
public class pormedioventas
{
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int numcomidarapida;
            comidarapida[] lascomidas = new comidarapida[20];
            String  nombreproducto;
            double precioproducto,lunes, martes, miercoles, jueves, viernes, sabado, domingo;
            double promedio = 0; 
            System.out.println("Digite la cantidad de producto: ");
            numcomidarapida = sc.nextInt();
            
            for(int i = 0; i < numcomidarapida; i++){
                System.out.println("Digite nombre del prodcuto: ");
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
                
                comidarapida unComida= new comidarapida();
                unComida.nombreproducto= nombreproducto;
                unComida.precioproducto = precioproducto;
                unComida.lunes = lunes;
                unComida.martes = martes;
                unComida.miercoles = miercoles;
                unComida.jueves = jueves;
                unComida.viernes = viernes;
                unComida.sabado = sabado;
                unComida.domingo = domingo;
                lascomidas[i] = unComida;
            }
            for(int i = 0; i < promedio; i++){
                double sum =(lascomidas[i].lunes +lascomidas[i].martes +lascomidas[i].miercoles +lascomidas[i].jueves + lascomidas[i].viernes + lascomidas[i].sabado + lascomidas[i].domingo)/3;
                promedio = promedio + sum / promedio;
            }
            System.out.println("El promedio de ventas es: "+ promedio);
    }
}
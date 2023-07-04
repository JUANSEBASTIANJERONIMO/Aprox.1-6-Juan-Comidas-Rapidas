import java.util.Scanner;
public class venta
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numero = 0, opcionMenu = 0;
        ComidaRapida[] lascomidas = new ComidaRapida[20];
        String  nombreproducto;
        double precioproducto,gastosmateriaprima,ventalunes, ventamartes, ventamiercoles,ventajueves, ventaviernes, ventasabado, ventadomingo;
        double promedioventas = 0;
        while(opcionMenu != 4){
            System.out.println("\nMenu de Opciones: ");
            System.out.println("1. calcular Promedio de ventas - Hamburguesa: ");
            System.out.println("2. calcular Promedio de ventas - Perro caliente: ");
            System.out.println("3. calcular Promedio de ventas - Salchipapas ");
            System.out.println("4. salir");
            System.out.println("Escoja una opcion.... ");
            opcionMenu = sc.nextInt();
            if(opcionMenu== 1){
                System.out.println("Digite el gasto en materia prima : ");
                gastosmateriaprima = sc.nextDouble();
                System.out.println("Digite el precio del producto: ");
                precioproducto = sc.nextDouble();
                System.out.println("indique el numero de productos vendidos el dia lunes: ");
                ventalunes = sc.nextDouble();
                System.out.println("indique el numero de productos vendidos el dia martes: ");
                ventamartes = sc.nextDouble();
                System.out.println("indique el numero de productos vendidos el dia miercoles: ");
                ventamiercoles = sc.nextDouble();
                System.out.println("indique el numero de productos vendidos el dia jueves: ");
                ventajueves = sc.nextDouble();
                System.out.println("indique el numero de productos vendidos el dia viernes: ");
                ventaviernes = sc.nextDouble();
                System.out.println("indique el numero de productos vendidos el dia sabado: ");
                ventasabado = sc.nextDouble();
                System.out.println("indique el numero de productos vendidos el dia domingo: ");
                ventadomingo = sc.nextDouble();
                
            }
            if(opcionMenu==2){
                  System.out.println("Digite el gasto en materia prima : ");
                gastosmateriaprima = sc.nextDouble();
                System.out.println("Digite el precio del producto: ");
                precioproducto = sc.nextDouble();
                System.out.println("indique el numero de productos vendidos el dia lunes: ");
                ventalunes = sc.nextDouble();
                System.out.println("indique el numero de productos vendidos el dia martes: ");
                ventamartes = sc.nextDouble();
                System.out.println("indique el numero de productos vendidos el dia miercoles: ");
                ventamiercoles = sc.nextDouble();
                System.out.println("indique el numero de productos vendidos el dia jueves: ");
                ventajueves = sc.nextDouble();
                System.out.println("indique el numero de productos vendidos el dia viernes: ");
                ventaviernes = sc.nextDouble();
                System.out.println("indique el numero de productos vendidos el dia sabado: ");
                ventasabado = sc.nextDouble();
                System.out.println("indique el numero de productos vendidos el dia domingo: ");
                ventadomingo = sc.nextDouble();
            }
            if(opcionMenu==3){
                System.out.println("Digite el gasto en materia prima : ");
                gastosmateriaprima = sc.nextDouble();
                System.out.println("Digite el precio del producto: ");
                precioproducto = sc.nextDouble();
                System.out.println("indique el numero de productos vendidos el dia lunes: ");
                ventalunes = sc.nextDouble();
                System.out.println("indique el numero de productos vendidos el dia martes: ");
                ventamartes = sc.nextDouble();
                System.out.println("indique el numero de productos vendidos el dia miercoles: ");
                ventamiercoles = sc.nextDouble();
                System.out.println("indique el numero de productos vendidos el dia jueves: ");
                ventajueves = sc.nextDouble();
                System.out.println("indique el numero de productos vendidos el dia viernes: ");
                ventaviernes = sc.nextDouble();
                System.out.println("indique el numero de productos vendidos el dia sabado: ");
                ventasabado = sc.nextDouble();
                System.out.println("indique el numero de productos vendidos el dia domingo: ");
                ventadomingo = sc.nextDouble();
                ComidaRapida unComidas = new ComidaRapida(gastosmateriaprima,precioproducto,ventalunes,ventamartes,ventamiercoles,ventajueves,ventaviernes,ventasabado,ventadomingo);
                lascomidas[numero] = unComidas;
                numero++;
            }
            else if(opcionMenu==4){
                for(int i = 0; i < promedioventas; i++){
                    promedioventas = promedioventas + lascomidas[i].calcularpromedioventas() /numero;       
                }
                System.out.println("\n El Promedio de ventas es: "+ promedioventas);
            }
        }
    
    }

}
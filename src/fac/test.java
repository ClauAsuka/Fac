package fac;

import java.util.Scanner;

public class test {
 static String direc,nom,tel;
       static int cantidad,id, habitaciones;
       static double costo;
        static double iva, total;
        static double tot;
        static String personas;
 
    public static void main(String[] args) {
   
       Scanner sc= new Scanner (System.in);
         System.out.println("digite nombre: ");
               nom=sc.next();
               System.out.println("");
        System.out.println("digite direccion: ");
        direc=sc.next();
        System.out.println("");
        System.out.println("digite telefono: ");
        tel=sc.next();
        System.out.println("");
        System.out.println("digite identificacion: ");
        id=sc.nextInt();  
        System.out.println("");
       System.out.println("digite cantidad");
        cantidad=sc.nextInt();
        System.out.println("");
        while(cantidad<1){
            System.out.println("digite valores validos " );
            cantidad=sc.nextInt();
        }
        System.out.println("digite costo unidad");
        costo=sc.nextInt();
        System.out.println("");
     
        while(costo<1){
            System.out.println("digite valores validos " );
            costo=sc.nextInt();
        }
       factura();
       calcularIva();
    }

    public static void factura(){
   

 
    System.out.println("su factura es: " + "\n" + "\n" +" nombre "  + nom + "\n" + "\n" + "direccion " + direc + "\n" + "\n" + "telefono " + tel + "\n" + "\n" + "idenficacion " + id + "\n" + "\n" + "costo unidad "+ costo +"\n");
 }
    public static void calcularIva(){
         total = costo*cantidad;
        iva=(total*19)/100;
        tot=total+iva;
        System.out.println("costo total " + tot);

	}
}
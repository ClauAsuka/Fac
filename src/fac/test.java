package fac;

import java.io.IOException;
import java.util.Scanner;

public class test {

	static String direc,nom,tel, producto;
    static int cantidad,id;
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
        System.out.println("digite nombre del producto");
        producto=sc.next();
        System.out.println("");
        System.out.println("digite costo unidad");
        costo=sc.nextInt();
        System.out.println("");
     
        	while(costo<1){
        		System.out.println("digite valores validos " );
        			costo=sc.nextInt();
        	}
            System.out.println("");
			try {
				System.in.close();
			} catch (IOException e) {
				e.printStackTrace();
				
			}
        	factura();
       calcularIva();
    }
    
    
    public static void factura(){

    	java.util.Date fechaActual = new java.util.Date();
    	System.out.println(fechaActual);
    	System.out.println("");    	
   
    	System.out.println("Almacenes la Meteo");
    	System.out.println("");

        System.out.println("su factura es " + "\n" + "\n" +"nombre:        "  + nom + "\n" + "direccion:     " + direc + "\n" + "telefono:      " + tel + "\n" + "idenficacion:  " + id + "\n" + "producto:      " + producto + "      " + "x" + (cantidad));
  }
    
    public static void calcularIva(){
        total = costo*cantidad;
        iva=(total*19)/100;
        tot=total+iva;
    	System.out.println("______________________________");
    	System.out.println("");
        System.out.println("costo unidad:  "+ costo +"\n" + "Iva:           " + iva);
    	System.out.println("______________________________");
    	System.out.println("costo total:   " + tot);
        
	}

}
package fact;
import java.io.IOException; 
import java.io.InputStreamReader;
import java.io.BufferedReader; 

public class fatu {

	public static void main(String[] args) throws IOException 
	{ 
		InputStreamReader isr=new InputStreamReader(System.in); 
		BufferedReader leer=new BufferedReader(isr); 

		System.out.println("Cantidad de artículos:"); 
		int articulos=Integer.parseInt(leer.readLine());
		
		System.out.println("Nombre del artículo:"); 
		String nombreArticulo=(leer.readLine());
				
		System.out.println("Introduzca el precio unitario del artículo:"); 
		double precio=Double.parseDouble(leer.readLine()); 

		double subtotal=articulos*precio; 
		double iva=subtotal*.19; 
		double total=subtotal+iva;
		
		System.out.println("Subtotal: "+subtotal); 
		System.out.println("Iva: "+iva);
		System.out.println("Total: "+total);  
		} 
}
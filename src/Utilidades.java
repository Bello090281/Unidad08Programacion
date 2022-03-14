import java.io.File;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * 
 * @author Mario Bello García
 * @version Unidad8 Programación (DAM)
 * 
 */
public class Utilidades implements Serializable {

	Programa p=new Programa();
	//Método array de la Piezas
	public ArrayList<Piezas>leerPiezas (String filename){
		
		try {
		File fichero=new File ("Piezas.csv");//Fichero que debemos leer
		Scanner entrada=new Scanner(fichero);
		String cadena="";
		String linea[];
		entrada.nextLine();
		while(entrada.hasNext()) {
			cadena=entrada.nextLine();
			//Leemos los lineas que componen el fichero mencionado anteriormente y separamos los campos
			linea=cadena.split(";");
			System.out.print(linea[0]);
			System.out.print(linea[1]);
			System.out.print(linea[2]);
			System.out.print(linea[3]);
			
			
			
			//Añadimos las lineas a un nuevo Array.
			p.listadoPiezas.add(new Piezas(Integer.parseInt(linea[0]),linea[1],Integer.parseInt(linea[2]),Double.parseDouble(linea[3])));
			System.out.println();
			
		}
		entrada.close();
		
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
		return p.listadoPiezas;
		
	}
	

	
	
	
	//Método Array de los provedores
	
	public ArrayList<Proveedor>leerProveedor (String filename){
		
		try {
			File fichero=new File ("Proveedor.csv");//Fichero que debemos leer
			Scanner entrada=new Scanner(fichero);
			String cadena="";
			String linea[];
			entrada.nextLine();
			while(entrada.hasNext()) {
				cadena=entrada.nextLine();
				//Leemos el fichero por linea mencionado anteriormente y separamos los campos
				linea=cadena.split(";");
				System.out.print(linea[0]);
				System.out.print(linea[1]);
				System.out.print(linea[2]);
		
				
				
				
				//Añadimos los campos a un nuevo Array
				p.listadoProveedor.add(new Proveedor(Integer.parseInt(linea[0]),linea[1],linea[2]));
				System.out.println();
				
			}
			entrada.close();
			
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}
		return p.listadoProveedor;
		
	}

}

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;
/**
 * 
 * @author Mario Bello García
 * @version Unidad8 Programación (DAM)
 * 
 */
public class Programa  implements Serializable {

	//Constructor sin parametros
	public Programa() {
		
	}
	
	//Arrayslist con los datos leidos de los ficheros
	  ArrayList<Piezas> listadoPiezas=new ArrayList<>();
	  ArrayList<Proveedor> listadoProveedor=new ArrayList<>();

	//Métodos get y set de los Arraylist
	public ArrayList<Piezas> getListadoPiezas() {
		return listadoPiezas;
	}

	public void setListadoPiezas(ArrayList<Piezas> listadoPiezas) {
		this.listadoPiezas = listadoPiezas;
	}

	public ArrayList<Proveedor> getListadoProveedor() {
		return listadoProveedor;
	}

	public void setListadoProveedor(ArrayList<Proveedor> listadoProveedor) {
		this.listadoProveedor = listadoProveedor;
	}

	//Método generarFichero
	public void generarFichero (String filename) {
		try {
			FileOutputStream fichero=new FileOutputStream(filename);
			PrintWriter escritura=new PrintWriter(fichero);
			
			for(int i=0; i<listadoProveedor.size();i++) {
				
				escritura.println("El proveedor "+listadoProveedor.get(i).getNombreProveedor()+" suministra");
				System.out.println("El proveedor "+listadoProveedor.get(i).getNombreProveedor()+" suministra");
				
				for(int j=0;j<listadoPiezas.size();j++) {
					
					if(listadoProveedor.get(i).getCodProveedor()==listadoPiezas.get(j).getProveedor()) {
						escritura.println(listadoPiezas.get(j).nombrePieza);
						System.out.println(listadoPiezas.get(j).nombrePieza);
					}
				}
			}
			
			escritura.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
		
	}
	
	public static void main(String[] args) {
		
		Programa p=new Programa();
		Utilidades u=new Utilidades();
		System.out.println("\n"
						 + "###############################################################################\n"
						 + "############################ Lista de piezas ##################################\n"
						 + "###############################################################################\n"
						 + "");
		p.setListadoPiezas(u.leerPiezas("piezas.csv"));
		System.out.println("\n"
						 + "###############################################################################\n"
						 + "########################### Lista de productores ##############################\n"
						 + "###############################################################################\n"
						 + "");
		p.setListadoProveedor(u.leerProveedor("proveedor.csv"));
		
		System.out.println("\n"
						 + "###############################################################################\n"
						 + "############ Lista de proveedores y piezas que suministran ####################\n"
						 + "###############################################################################\n"
						 + "");
		p.generarFichero("proveedoresPiezas.txt");
	
		
		
	}
	
	

}

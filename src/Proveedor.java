import java.io.Serializable;
/**
 * 
 * @author Mario Bello García
 * @version Unidad8 Programación (DAM)
 * 
 */
public class Proveedor  implements Serializable  {
	//Variables
int  codProveedor;
String nombreProveedor;
String localidad;

//Constructor clase Proveedor
public Proveedor(int codProveedor, String nombreProveedor, String localidad) {
	this.codProveedor = codProveedor;
	this.nombreProveedor = nombreProveedor;
	this.localidad = localidad;
}
//Método get y set de las variables
public int getCodProveedor() {
	return codProveedor;
}
public void setCodProveedor(int codProveedor) {
	this.codProveedor = codProveedor;
}
public String getNombreProveedor() {
	return nombreProveedor;
}
public void setNombreProveedor(String nombreProveedor) {
	this.nombreProveedor = nombreProveedor;
}
public String getLocalidad() {
	return localidad;
}
public void setLocalidad(String localidad) {
	this.localidad = localidad;
}
//Método toString de la clase Proveedor
@Override
public String toString() {
	return "El proveedor " + nombreProveedor + ":";
}

}

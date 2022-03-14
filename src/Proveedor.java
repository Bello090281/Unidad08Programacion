import java.io.Serializable;
/**
 * 
 * @author Mario Bello Garc�a
 * @version Unidad8 Programaci�n (DAM)
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
//M�todo get y set de las variables
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
//M�todo toString de la clase Proveedor
@Override
public String toString() {
	return "El proveedor " + nombreProveedor + ":";
}

}

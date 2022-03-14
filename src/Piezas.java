import java.io.Serializable;

/**
 * 
 * @author Mario Bello García
 * @version Unidad8 Programación (DAM)
 * 
 */
public class Piezas  implements Serializable  {
	//Variables
int codPieza;
String nombrePieza;
int proveedor;
double peso;

//Constructor clase Pieza
public Piezas(int codPieza, String nombrePieza, int proveedor, double peso) {
	this.codPieza = codPieza;
	this.nombrePieza = nombrePieza;
	this.proveedor = proveedor;
	this.peso = peso;
}
//Métodos get y set de las variables
public int getCodPieza() {
	return codPieza;
}
public void setCodPieza(int codPieza) {
	this.codPieza = codPieza;
}
public String getNombrePieza() {
	return nombrePieza;
}
public void setNombrePieza(String nombrePieza) {
	this.nombrePieza = nombrePieza;
}
public int getProveedor() {
	return proveedor;
}
public void setProveedor(int proveedor) {
	this.proveedor = proveedor;
}
public double getPeso() {
	return peso;
}
public void setPeso(double peso) {
	this.peso = peso;
}

//Método toString de la clase Pieza
@Override
public String toString() {
	return "" + nombrePieza + "";
}


}

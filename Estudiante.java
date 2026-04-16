package actividad6Martinez;

public class Estudiante extends Persona {
 private String Legajo;
 private int codigoestudiante;
 private float notafinal;
 private int añodeingreso;
 private String Carreraquecursa;
 private int Cantidaddemateriasaprobadas;
 
 protected Estudiante(String nombre, String apellido, int edad, String email, String telefono, String dirrecion,
		              String legajo, int codigoestudiante, float notafinal, int añodeingreso, String carreraquecursa,
		              int cantidaddemateriasaprobadas) {
	 
	super(nombre, apellido, edad, email, telefono, dirrecion);
	
	this.Legajo = legajo;
	this.codigoestudiante = codigoestudiante;
	this.notafinal = notafinal;
	this.añodeingreso = añodeingreso;
	this.Carreraquecursa = carreraquecursa;
	this.Cantidaddemateriasaprobadas = cantidaddemateriasaprobadas;
 }
 
 @Override
public String toString() {
	return "Estudiante [ Nombre =" + getNombre() + ", Apellido=" + getApellido() + ", Edad =" + getEdad() + ", Email =" + getEmail()
			+ ", Telefono =" + getTelefono() + ", Dirrecion =" + getDirrecion() + ", legajo=" + Legajo + ", codigoestudiante=" + codigoestudiante 
			+ ", notafinal=" + notafinal + ", añodeingreso=" + añodeingreso + ", Carreraquecursa=" + Carreraquecursa + ", Cantidaddemateriasaprobadas=" 
			+ Cantidaddemateriasaprobadas + "]";
}

 public void mostrarDatos() {
		System.out.println( toString()  );
	}

 
}


public class Docente extends Persona{

	//atributos
	private String cedula, nombre, ciudad;
	
	//metodos
	
	//metodos constructores
	public Docente() {
		
	}
	
	public Docente(String pCedula, String pNombre, String pCiudad) {
		this.cedula=pCedula;
		this.nombre=pNombre;
		this.ciudad=pCiudad;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
}

import java.util.ArrayList;
import java.util.Scanner;

public class Ies {

	/* Atributos*/
	private String nit, direccion, nombre;
	private int numEmpleados;
	private float patrimonioInicial;
	
	
	/* Implementacion de la relacion entre IES y personas*/
	/* personas en un arreglo dinamico (ArrayList) que guarda objetos de clase *persona <Persona> */
	Scanner lectorConsola=new Scanner(System.in);
	private ArrayList<Estudiante> estudiantes= new ArrayList<>();
	private ArrayList<Docente> docentes= new ArrayList<>();
	
	
	/* Metodos constructores*/ 
	
	public Ies() {
		
	}
	
	public Ies(String pNit, String pDireccion, String pNombre) {
		this.nit= pNit;
		this.nombre=pNombre;
		this.direccion=pDireccion;
	}

	/*Metodos de Consulta y modificacion (getter / setters) */
	
	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getNumEmpleados() {
		return numEmpleados;
	}

	public void setNumEmpleados(int numEmpleados) {
		this.numEmpleados = numEmpleados;
	}
	
	public float getPatrimonioInicial() {
		return patrimonioInicial;
	}

	public void setPatrimonioInicial(float patrimonioInicial) {
		this.patrimonioInicial = patrimonioInicial;
	}
	
	/*Agregar nuevo estudiante a la lista de estudiante
	 * @param nuevo estudiante*/
	public void matricularEstudiante(Estudiante nuevoEstudiante) {
		estudiantes.add(nuevoEstudiante);	
	}
	
	/*Agregar nuevo estudiante a la lista de estudiante
	 * @param nuevo estudiante*/
	public void vincularDocente(Docente nuevoDocente) {
		docentes.add(nuevoDocente);
	}
	
	public int contarEstudiantesCiudad(String cualCiudad) {
		int conteo=0;
		for(int i=0;i<estudiantes.size();i++) {
			System.out.println("Diguite el nombre de la ciudad");
			cualCiudad=lectorConsola.next();
			estudiantes.add(new Estudiante("554455445","Andres", cualCiudad));
			conteo++;
		}
		return conteo;
	}
	
	public int contarDocentesCiudad(String cualCiudad) {
		int conteo=0;
		for(int i=0;i<estudiantes.size();i++) {
			System.out.println("Diguite el nombre de la ciudad");
			cualCiudad=lectorConsola.next();
			docentes.add(new Docente("554455445","Andres", cualCiudad));
			conteo++;
		}
		return conteo;
	}

}

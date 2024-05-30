package UserInterface;

import javax.swing.JFrame;

//Clase de ventana principal que extiende o hereda de "JFrame"
public class VentanaPrincipal extends JFrame {
	public static void main(String[] args)
	{
		//Inicializar la ventana principal llamada como objeto "miVentana"
		VentanaPrincipal miVentana = new VentanaPrincipal();
		//hacer el objeto "miVentana" visible
		miVentana.setVisible(true);		
	}	
	
	//constructor donde se le pasan valores a hacer
	public VentanaPrincipal()
	{
		//mostrar con estas especificaciones en resolucion
		this.setSize(800, 600);
		//titulo de la ventana
		this.setTitle("Mi primera ventana en JFrame");		
		
		//inicializacion de la clase llamada como "miPanelIzquierdo"
		PanelSeleccionArchivo miPanelIzquierdo = new PanelSeleccionArchivo();
		//agregar en la funcion de la ventana principal
		this.add(miPanelIzquierdo);
		
	}
}

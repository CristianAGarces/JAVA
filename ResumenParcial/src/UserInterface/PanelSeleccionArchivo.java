package UserInterface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import javax.swing.*;

//Clase que hereda de la clase abtracta "JPanel" implementando la Interfaz de "ActionListener"
public class PanelSeleccionArchivo extends JPanel implements ActionListener {
	JFileChooser selectorArchivo;
	
	//Constructor 
	public PanelSeleccionArchivo()
	{
		
		//botón para activar el JFileChooser:
		JButton btn_selectorArchivo = new JButton("Abrir Archivo");
		
		//adicionar el action Listener al boton para que la funcion del actionListener sepa que hacer
		btn_selectorArchivo.addActionListener(this);
		//SetActionComman como id de identificador para dar funcionalidad al boton 
		btn_selectorArchivo.setActionCommand("ABRIR_ARCHIVO");
		
		//boton de seleccion de archivo:
		selectorArchivo = new JFileChooser();
		
		//agregar boton al constructor de la clase
		this.add(btn_selectorArchivo);
	}
	
	//Funcion de cargarInformacion del archivo plano
	public void cargarInformacion(String rutaArchivo)
	{
		//bloque de codigo para intentar cargar el archivo que se seleccione tipo "plano"
		try 
		{
			String linea = "";
			//BufferedReader para leer el archivo plano que se selecciono
			BufferedReader br = new BufferedReader(new FileReader(rutaArchivo));
			//loop para leer caracter por caracter y linea por linea el archivo hasta que sea null
			while( (linea = br.readLine()) != null  )
			{
				System.out.println(linea);
			}
			
		} 
		/*catch para las excepciones que puedan pasar al cargar el archivo
		ejemplo.... interferencia al subir, archivo eliminado etc*/
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			System.out.println("El error fue controlado...");
		}
	}
	
	//Funcion de ejecucion de que hacer al abrir el archivo
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String rutaArchivoSelect="";
		switch(e.getActionCommand())
		{
			case "ABRIR_ARCHIVO":
				System.out.println("Vamos a seleccionar el archivo");
				this.selectorArchivo.showOpenDialog(this);
				//obtener ruta del archivo:
				rutaArchivoSelect = selectorArchivo.getSelectedFile().toPath().toString();
				System.out.print(rutaArchivoSelect);
				
				//llamar función para abrir archivo y cargar información:
				cargarInformacion(rutaArchivoSelect);				
				
		}
	}		
}
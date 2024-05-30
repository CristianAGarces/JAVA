package modelo;

import java.util.Date;

public class Libros extends Material {
	//atributos: 
			private String titulo, ISBN, editorial,genero, autores;
			private int anioPublicacion;	
			
			public Libros(String codigo, Date fechaPrestamo, Date fechaEntrega, boolean disponible, int numEjemplares, String titulo, String autores, String ISBN, String editorial) {
				super(codigo, fechaPrestamo, fechaEntrega, disponible, numEjemplares);
				// TODO Auto-generated constructor stub
				this.titulo=titulo;
				this.ISBN=ISBN;
				this.editorial=editorial;
				this.genero=genero;
				this.autores=autores;
			}			
		

		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public String getISBN() {
			return ISBN;
		}

		public void setISBN(String iSBN) {
			ISBN = iSBN;
		}

		public String getEditorial() {
			return editorial;
		}

		public void setEditorial(String editorial) {
			this.editorial = editorial;
		}

		public String getGenero() {
			return genero;
		}

		public void setGenero(String genero) {
			this.genero = genero;
		}

		public String getAutores() {
			return autores;
		}

		public void setAutores(String autores) {
			this.autores = autores;
		}

		public int getAnioPublicacion() {
			return anioPublicacion;
		}

		public void setAnioPublicacion(int anioPublicacion) {
			this.anioPublicacion = anioPublicacion;
		}
}

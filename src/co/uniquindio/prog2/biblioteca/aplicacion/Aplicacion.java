package co.uniquindio.prog2.biblioteca.aplicacion;
import javax.swing.JOptionPane;

import co.uniquindio.prog2.biblioteca.model.Biblioteca;
/**
	 * 
	 * @author Solenka Saire
	 *
	 */
	public class Aplicacion {

		/**
		 * Metodo principal
		 * 
		 * @param args Argumentos de la linea de comandos
		 */
		public static void main(String args[]) {
			String nombre;
			int id, edad;		
			boolean sexo=false;
	        nombre = JOptionPane.showInputDialog("Ingrese el nombre");
	        id =  Integer.parseInt(JOptionPane.showInputDialog("Ingrese su id"));
	        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));

			Biblioteca miBiblioteca; 
			miBiblioteca = new Biblioteca();
		
			
		}
	
	
	}

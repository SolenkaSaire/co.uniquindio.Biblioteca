package co.uniquindio.prog2.biblioteca.model;

public class Biblioteca {
	/**
	 * 
	 * @author Solenka Saire
	 *
	 */
	/**
	 * Son los atributos 
	 */
	private int id, edad;
	private String nombre;
	private boolean sexo=false;

	/**
	 * Metodo modificador
	 * @param base Es la base del triangulo
	 */
	public void id(int id) {
		this.id = id;
}
	
	public void edad(int edad) {
		this.edad = edad;
}
	
	public void nombre(String nombre) {
		this.nombre = nombre;
}
	
	public void sexo(boolean sexo) {
		this.sexo = sexo;
}
	
	/**
	 * Permite calcular el area del triangulo
	 * @return el area
	 */
	public double solicitarPrestamo() {
		double area;
		area = id;
		return area;
		
	}
	
	public boolean entregarLibro() {
		boolean area;
		area = sexo;
		return area;
		
	}
	

	

}

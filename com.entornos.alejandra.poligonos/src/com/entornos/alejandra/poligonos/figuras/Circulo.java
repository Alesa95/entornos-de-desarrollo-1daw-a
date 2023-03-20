package com.entornos.alejandra.poligonos.figuras;

import java.util.Random;

/**
 * Representa un circulo. Contiene constructores para crear un circulo
 * dado el radio y para crear un circulo con un radio aleatorio entero
 * entre 1 y 10. Contiene metodos para calcular el area y el perimetro.
 * 
 * @version 1.0
 * 
 * @author Alejandra
 *
 */
public class Circulo {

	int radio;
	
	/**
	 * Crea un circulo con el radio indicado.
	 * 
	 * @param radio		el radio del circulo
	 */
	public Circulo (int radio) {
		this.radio = radio;
	}
	
	/**
	 * Crea un circulo con el radio aleatorio. El radio sera un valor 
	 * entero entre 1 y 10.
	 * 
	 * @see java.util.Random
	 */
	public Circulo () {
		Random numeroAleatorio = new Random();
		this.radio = numeroAleatorio.nextInt(10)+1;
	}
	
	/**
	 * Devuelve el area del circulo.
	 * 
	 * @return	el area del circulo.
	 */
	public double getArea () {
		return Math.PI * Math.pow(radio, 2);
	}
	
	/**
	 * Devuelve el perimetro del circulo.
	 * 
	 * @return	el perimetro del circulo.
	 */
	public double getPerimetro () {
		return 2 * Math.PI * radio;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}
}

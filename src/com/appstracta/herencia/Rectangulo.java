package com.appstracta.herencia;

import com.appstracta.interfaces.Dibujable;
import com.appstracta.interfaces.Imprimible;

public class Rectangulo extends Figura implements Imprimible, Dibujable {

	public Rectangulo(double dim1, double dim2) {
		super(dim1, dim2);
		this.nombre = "Rectangulo";
	}

	@Override
	public double area() {
		return this.getDim1() * this.getDim2();
	}

	@Override
	public void dibujar() {
		System.out.
				println(String.format("Se dibuja %s de color %s", this.nombre, Dibujable.COLOR));
	}

	@Override
	public void imprimir() {
		System.out.println("Se imprime el rectangulo");
	}
}

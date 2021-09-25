package com.appstracta.herencia;

import com.appstracta.interfaces.Dibujable;
import com.appstracta.interfaces.Imprimible;

public class Triangulo extends Figura implements Imprimible, Dibujable {

	public Triangulo(double dim1, double dim2) {
		super(dim1, dim2);
		this.nombre = "Triangulo";
	}

	@Override
	public double area() {
		return (this.getDim1() * this.getDim2()) / 2;
	}

	@Override
	public void dibujar() {
		System.out.
				println(String.format("Se dibuja el %s de color %s", this.nombre, Dibujable.COLOR));
	}

	@Override
	public void imprimir() {
		System.out.println("Se imprime el triangulo");
	}

}

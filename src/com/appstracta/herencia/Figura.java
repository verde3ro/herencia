package com.appstracta.herencia;

// Clase padre abstracta
public abstract class Figura {
	private double dim1;
	private double dim2;
	protected String nombre;

	public Figura(double dim1, double dim2) {
		this.dim1 = dim1;
		this.dim2 = dim2;
	}

	// Debe haber por lo menos un metodo abstracto y eso solo es la firma
	public abstract double area();

	public double getDim1() {
		return dim1;
	}

	public void setDim1(double dim1) {
		this.dim1 = dim1;
	}

	public double getDim2() {
		return dim2;
	}

	public void setDim2(double dim2) {
		this.dim2 = dim2;
	}

	@Override
	public String toString() {
		return "Figura{" +
				"dim1=" + dim1 +
				", dim2=" + dim2 +
				", nombre='" + nombre + '\'' +
				'}';
	}

}

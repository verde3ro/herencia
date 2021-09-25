package com.appstracta.herencia;

import com.appstracta.interfaces.Imprimible;

public class Email extends Mensaje implements Imprimible {
	@Override
	public void enviar() {
		System.out.println("Se envía mensaje");
	}

	@Override
	public void imprimir() {
		System.out.println("Imprimiendo email");
		System.out.println(this.getMensaje());
	}

}

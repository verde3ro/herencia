package com.appstracta;

import com.appstracta.herencia.Email;
import com.appstracta.herencia.Figura;
import com.appstracta.herencia.Rectangulo;
import com.appstracta.herencia.Triangulo;

public class Main {

	public static void main(String[] args) {
		// Polimorfismo
		Figura[] figuras = {new Rectangulo(12, 12), new Triangulo(26, 6)};

		for (Figura figura : figuras) {
			System.out.println("\n ** Figura ** \n");
			System.out.println(figura);
			System.out.println("area :: " + figura.area());

			if (figura instanceof Rectangulo) {
				// Cast
				((Rectangulo) figura).imprimir();
				((Rectangulo) figura).dibujar();
			}

			if (figura instanceof Triangulo) {
				// Cast
				Triangulo tringulo = (Triangulo) figura;

				tringulo.imprimir();
				tringulo.dibujar();
			}
		}


		System.out.println("\n\n ** Email**");
		Email email = new Email();
		StringBuffer mensaje = new StringBuffer();
		mensaje.append("Este es un menjae\n");
		mensaje.append("De hola mundo\n");
		mensaje.append("Hasta luego");
		email.setMensaje(mensaje.toString());
		System.out.println("\n ** Se imprime mensaje**");
		email.imprimir();
		System.out.println("\n ** Se envia mensaje**");
		email.enviar();

	}

}

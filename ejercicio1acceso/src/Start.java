import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entradaDeDatos = new Scanner(System.in);// en esta linea introducimos la clase Scanner que le damos un
														// nombre, para que la maquina le pregunte al usuario
		String nombre = ""; // creamos las variables, iniciadas, con nombre y vacias.
		String apellidos = "";
		String usuario;
		String idioma;
		String contrasenya;
		String ruta = "./info/fichero.txt";
		String texto = "";
		boolean tipo = true;
		Scanner sc_usuario = new Scanner(ruta);

		Persona p1 = new Persona();// creo a las 5 personas
		Persona p2 = new Persona();
		Persona p3 = new Persona();
		Persona p4 = new Persona();
		Persona p5 = new Persona();

		System.out.println("****************************************************"); // realizo un s.out.print, para que
		System.out.println("******************Ejercicio 1************************");																			// salga en consola esta información
		System.out.println("****************************************************");

		System.out.println("************Datos persona 1***************: ");
		System.out.print(" Introduzca Nombre: ");
		texto = entradaDeDatos.nextLine();
		p1.setNombre(texto);
		
		System.out.print(" Introduzca Apellidos: ");
		texto = entradaDeDatos.nextLine();
		p1.setApellidos(texto);

		System.out.print(" Introduzca Idioma: ");
		texto = entradaDeDatos.nextLine();
		p1.setIdioma(texto);
		
		System.out.print(" Introduzca Usuario: ");
		texto = entradaDeDatos.next();
		p1.setUsuario(texto);
		
		System.out.print(" Introduzca Contraseña: ");
		texto = entradaDeDatos.next();
		p1.setContrasenya(texto);
		
		System.out.println("************Datos persona 2***************: ");
		System.out.print(" Introduzca Nombre: ");
		texto = entradaDeDatos.next();
		p2.setNombre(texto);
		
		System.out.print(" Introduzca Apellidos: ");
		texto = entradaDeDatos.next();
		p2.setApellidos(texto);
		
		System.out.print(" Introduzca Idioma: ");
		texto = entradaDeDatos.next();
		p2.setIdioma(texto);
		
		System.out.print(" Introduzca Usuario: ");
		texto = entradaDeDatos.next();
		p2.setUsuario(texto);
		
		System.out.print(" Introduzca Contraseña: ");
		texto = entradaDeDatos.next();
		p2.setContrasenya(texto);
		
		System.out.println("************Datos persona 3***************: ");
		System.out.print(" Introduzca Nombre: ");
		texto = entradaDeDatos.next();
		p3.setNombre(texto);
		
		System.out.print(" Introduzca Apellidos: ");
		texto = entradaDeDatos.next();
		p3.setApellidos(texto);
		
		System.out.print(" Introduzca Idioma: ");
		texto = entradaDeDatos.next();
		p3.setIdioma(texto);
		

		System.out.print(" Introduzca Usuario: ");
		texto = entradaDeDatos.next();
		p3.setUsuario(texto);
		

		System.out.print(" Introduzca Contraseña: ");
		texto = entradaDeDatos.next();
		p3.setContrasenya(texto);
		

		System.out.println("************Datos persona 4***************: ");
		System.out.print(" Introduzca Nombre: ");
		texto = entradaDeDatos.next();
		p4.setNombre(texto);
		

		System.out.print(" Introduzca Apellidos: ");
		texto = entradaDeDatos.next();
		p4.setApellidos(texto);
		
		System.out.print(" Introduzca Idioma: ");
		texto = entradaDeDatos.next();
		p4.setIdioma(texto);
		

		System.out.print(" Introduzca Usuario: ");
		texto = entradaDeDatos.next();
		p4.setUsuario(texto);
		
		System.out.print(" Introduzca Contraseña: ");
		texto = entradaDeDatos.next();
		p4.setContrasenya(texto);
		

		System.out.println("************Datos persona 5***************: ");
		System.out.print(" Introduzca Nombre: ");
		texto = entradaDeDatos.next();
		p5.setNombre(texto);
		
		System.out.print(" Introduzca Apellidos: ");
		texto = entradaDeDatos.next();
		p5.setApellidos(texto);
		

		System.out.print(" Introduzca Idioma: ");
		texto = entradaDeDatos.next();
		p5.setIdioma(texto);
		
		System.out.print(" Introduzca Usuario: ");
		texto = entradaDeDatos.next();
		p5.setUsuario(texto);
		
		System.out.print(" Introduzca Contraseña: ");
		texto = entradaDeDatos.next();
		p5.setContrasenya(texto);
		
		
		
		
		p1.print(); /// le decimos a p1,p2,p3,p4 y p5 que llame al metodo print de persona
		p2.print();
		p3.print();
		p4.print();
		p5.print();
	}
}

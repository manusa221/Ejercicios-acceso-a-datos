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
		
		Scanner entradaDeDatos = new Scanner(System.in);//en esta linea introducimos la clase Scanner que le damos un nombre, para que la maquina le pregunte al usuario
		String nombre="";		//creamos las variables, iniciadas, con nombre y vacias.
		String apellidos="";
		String idioma;
		String usuario;
		String contrasenya;
		String ruta="./info/fichero.txt";
		String texto="";
		boolean tipo=true;
		
		System.out.println("****************************************************");   //realizo un s.out.print, para que salga en consola esta información
		System.out.println("******************Ejercicio 2************************");
		System.out.println("****************************************************");
		
		Persona p1 = new Persona();//creo a las 5 personas
		Persona p2 = new Persona();
		Persona p3 = new Persona();
		Persona p4 = new Persona();
		Persona p5 = new Persona();
		
		System.out.println("************Datos persona 1***************: ");
		System.out.print(" Introduzca Nombre: ");
		texto=entradaDeDatos.nextLine(); 
		p1.setNombre(texto);
		p1.EscribirFicheroTexto(ruta, texto, tipo);//añado el metodo de la clase persona EscribirFicheroTexto, le paso la ruta del fichero, 
													//el texto que escriba el usuario por consola y el tipo de escritura en este caso con valor true
		p1.LeerFicheroTexto(ruta);					//añado el metodo de la clase persona LeerFicheroTexto, le paso la ruta del fichero, y podra acceder y leer el contenido 
													
		
		System.out.print(" Introduzca Apellidos: ");
		texto=entradaDeDatos.nextLine(); 
		p1.setApellidos(texto);
		p1.EscribirFicheroTexto(ruta, texto, tipo);
		p1.LeerFicheroTexto(ruta);
		
		System.out.print(" Introduzca Idioma: ");
		texto=entradaDeDatos.nextLine();
		p1.setIdioma(texto);
		p1.EscribirFicheroTexto(ruta, texto, tipo);
		p1.LeerFicheroTexto(ruta);
		
		System.out.print(" Introduzca Usuario: ");
		texto=entradaDeDatos.nextLine();
		p1.setUsuario(texto);
		p1.EscribirFicheroTexto(ruta, texto, tipo);
		p1.LeerFicheroTexto(ruta);
		
		System.out.print(" Introduzca Contraseña: ");
		texto=entradaDeDatos.nextLine();
		p1.setContrasenya(texto);
		p1.EscribirFicheroTexto(ruta, texto, tipo);
		p1.LeerFicheroTexto(ruta);
		
		System.out.println("************Datos persona 2***************: ");
		System.out.print(" Introduzca Nombre: ");
		texto=entradaDeDatos.nextLine(); 
		p2.setNombre(texto);
		p2.EscribirFicheroTexto(ruta, texto, tipo);
		p2.LeerFicheroTexto(ruta);
		
		System.out.print(" Introduzca Apellidos: ");
		texto=entradaDeDatos.nextLine(); 
		p2.setApellidos(texto);
		p2.EscribirFicheroTexto(ruta, texto, tipo);
		p2.LeerFicheroTexto(ruta);
		
		System.out.print(" Introduzca Idioma: ");
		texto=entradaDeDatos.nextLine();
		p2.setIdioma(texto);
		p2.EscribirFicheroTexto(ruta, texto, tipo);
		p2.LeerFicheroTexto(ruta);
		
		System.out.print(" Introduzca Usuario: ");
		texto=entradaDeDatos.nextLine();
		p2.setUsuario(texto);
		p2.EscribirFicheroTexto(ruta, texto, tipo);
		p2.LeerFicheroTexto(ruta);
		
		System.out.print(" Introduzca Contraseña: ");
		texto=entradaDeDatos.nextLine();
		p2.setContrasenya(texto);
		p2.EscribirFicheroTexto(ruta, texto, tipo);
		p2.LeerFicheroTexto(ruta);
		
		System.out.println("************Datos persona 3***************: ");
		System.out.print(" Introduzca Nombre: ");
		texto=entradaDeDatos.nextLine(); 
		p3.setNombre(texto);
		p3.EscribirFicheroTexto(ruta, texto, tipo);
		p3.LeerFicheroTexto(ruta);
		
		System.out.print(" Introduzca Apellidos: ");
		texto=entradaDeDatos.nextLine(); 
		p3.setApellidos(texto);
		p3.EscribirFicheroTexto(ruta, texto, tipo);
		p3.LeerFicheroTexto(ruta);
		
		System.out.print(" Introduzca Idioma: ");
		texto=entradaDeDatos.nextLine();
		p3.setIdioma(texto);
		p3.EscribirFicheroTexto(ruta, texto, tipo);
		p3.LeerFicheroTexto(ruta);
		
		System.out.print(" Introduzca Usuario: ");
		texto=entradaDeDatos.nextLine();
		p3.setUsuario(texto);
		p3.EscribirFicheroTexto(ruta, texto, tipo);
		p3.LeerFicheroTexto(ruta);
		
		System.out.print(" Introduzca Contraseña: ");
		texto=entradaDeDatos.nextLine();
		p3.setContrasenya(texto);
		p3.EscribirFicheroTexto(ruta, texto, tipo);
		p3.LeerFicheroTexto(ruta);
		
		
		
		System.out.println("************Datos persona 4***************: ");
		System.out.print(" Introduzca Nombre: ");
		texto=entradaDeDatos.nextLine(); 
		p4.setNombre(texto);
		p4.EscribirFicheroTexto(ruta, texto, tipo);
		p4.LeerFicheroTexto(ruta);
		
		System.out.print(" Introduzca Apellidos: ");
		texto=entradaDeDatos.nextLine(); 
		p4.setApellidos(texto);
		p4.EscribirFicheroTexto(ruta, texto, tipo);
		p4.LeerFicheroTexto(ruta);
		
		System.out.print(" Introduzca Idioma: ");
		texto=entradaDeDatos.nextLine();
		p4.setIdioma(texto);
		p4.EscribirFicheroTexto(ruta, texto, tipo);
		p4.LeerFicheroTexto(ruta);
		
		System.out.print(" Introduzca Usuario: ");
		texto=entradaDeDatos.nextLine();
		p4.setUsuario(texto);
		p4.EscribirFicheroTexto(ruta, texto, tipo);
		p4.LeerFicheroTexto(ruta);
		
		System.out.print(" Introduzca Contraseña: ");
		texto=entradaDeDatos.nextLine();
		p4.setContrasenya(texto);
		p4.EscribirFicheroTexto(ruta, texto, tipo);
		p4.LeerFicheroTexto(ruta);
		
		System.out.println("************Datos persona 5***************: ");
		System.out.print(" Introduzca Nombre: ");
		texto=entradaDeDatos.nextLine(); 
		p5.setNombre(texto);
		p5.EscribirFicheroTexto(ruta, texto, tipo);
		p5.LeerFicheroTexto(ruta);
		
		System.out.print(" Introduzca Apellidos: ");
		texto=entradaDeDatos.nextLine(); 
		p5.setApellidos(texto);
		p5.EscribirFicheroTexto(ruta, texto, tipo);
		p5.LeerFicheroTexto(ruta);
		
		System.out.print(" Introduzca Idioma: ");
		texto=entradaDeDatos.nextLine();
		p5.setIdioma(texto);
		p5.EscribirFicheroTexto(ruta, texto, tipo);
		p5.LeerFicheroTexto(ruta);
		
		System.out.print(" Introduzca Usuario: ");
		texto=entradaDeDatos.nextLine();
		p5.setUsuario(texto);
		p5.EscribirFicheroTexto(ruta, texto, tipo);
		p5.LeerFicheroTexto(ruta);
		
		System.out.print(" Introduzca Contraseña: ");
		texto=entradaDeDatos.nextLine();
		p5.setContrasenya(texto);
		p5.EscribirFicheroTexto(ruta, texto, tipo);
		p5.LeerFicheroTexto(ruta);
		
	    p1.print();	///le decimos a p1 que llame al metodo print de persona
	    p2.print();
	    p3.print();
	    p4.print();
	    p5.print();
		
	}

}

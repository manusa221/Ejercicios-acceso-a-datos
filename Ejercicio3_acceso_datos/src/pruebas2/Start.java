package pruebas2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Start{
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

     File f = new File("./info/fichero.txt");
    Scanner sc = new Scanner(System.in);
    Persona p1 = new Persona();//creamos los objetos de las personas
     Persona p2 = new Persona();
     Persona p3 = new Persona();
     Persona p4 = new Persona();
     Persona p5 = new Persona();
     String ruta="./info/fichero.txt";
    
   
    Persona.introducirDatos();//llamamo el metodo introducir datos de la clase persona
    Persona.leerDatos();      //llamamos al metodo leerdatos de la clase persona
 
}
}


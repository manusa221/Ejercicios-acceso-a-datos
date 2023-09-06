import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Persona {

	protected String nombre;      //creo los atributos con la variable String, le doy nombre y el metodo sera protegido para la clase persona
	protected String apellidos;
	protected String idioma;
	protected String usuario;
	private   String contrasenya;	//este atributo sera privado para esta clase, no podra ser modificado
	
public Persona() {
	//creo el constructor, en vacio
	this.nombre="";			
	this.apellidos="";
	this.idioma="";
	this.usuario="";
	this.contrasenya="";
}
// creo los setters/getters
public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getApellidos() {
	return apellidos;
}

public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}

public String getIdioma() {
	return idioma;
}

public void setIdioma(String idioma) {
	this.idioma = idioma;
}

public String getUsuario() {
	return usuario;
}

public void setUsuario(String usuario) {
	this.usuario = usuario;
}

public String getContrasenya() {
	return contrasenya;
}

public void setContrasenya(String contrasenya) {
	this.contrasenya = contrasenya;
}//creo un propio metodo print que devolvera la información que he introducido
public void print() {
	
	System.out.println("Nombre: " + this.getNombre() +  " - " + "Apellido: " + this.getApellidos() + " - " + "Idioma: " +
	this.getIdioma() + " - " + "Usuario: " + this.getUsuario() + " - " + "Contraseña: " + this.getContrasenya());
	
}

}


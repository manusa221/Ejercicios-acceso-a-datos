import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

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
public static void EscribirFicheroTexto(String url,String texto, boolean tipo) {

	FileWriter f = null;
	PrintWriter pw = null;

	try {
		f = new FileWriter(url, tipo);// indicamos la ruta(url)y el tipo de booleano(true (añade),false(machaca))
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	pw = new PrintWriter(f);
	pw.println(texto);

	// cerramos fichero
	try {
		f.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
public static String LeerFicheroTexto(String url) {

	String totalLineas = "";
	String lineaTextoFichero = "";// creamos dos variables
	File f2 = null;
	FileReader fr = null;// abre fichero en modo lectura
	BufferedReader br = null;// Captura linea a linea el contenido del fichero

	f2 = new File(url);// indicamos la ruta del fichero para leer con el string (url)

	try {
		fr = new FileReader(f2);// abrimos fichero en modo lectura y indicamos la ruta
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	br = new BufferedReader(fr);

	try {
		while ((lineaTextoFichero = br.readLine()) != null)// a lineaTextoFichero le asignamos lo que lea linea a
															// linea, hasta que no tenga nada que leer.
		{
			totalLineas = totalLineas + " " + lineaTextoFichero;// aqui almacenaremos en el string(totalLineas) las
																// lineasTextoFichero que vaya almacenando
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();

	}

	try {
		fr.close();
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}

	return totalLineas;
}
}

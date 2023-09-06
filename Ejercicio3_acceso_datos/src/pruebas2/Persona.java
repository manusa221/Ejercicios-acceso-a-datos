package pruebas2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Persona {// creo los atributos con la variable String, le doy nombre y el metodo sera protegido para la clase persona
	protected String nombre;  
	protected String apellidos;
	protected String idioma;
	protected String usuario;
	private String contrasenya; // este atributo sera privado para esta clase, no podra ser modificado

	public Persona() {
		// creo el constructor, en vacio
		this.nombre = "";
		this.apellidos = "";
		this.idioma = "";
		this.usuario = "";
		this.contrasenya = "";
	}

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
	}

	static File f = new File("./info/fichero.txt");
	static Scanner sc = new Scanner(System.in);
	public static Persona p1 = new Persona();// creamos los objetos de las personas
	public static Persona p2 = new Persona();
	public static Persona p3 = new Persona();
	public static Persona p4 = new Persona();
	public static Persona p5 = new Persona();

	public static void introducirDatos() throws IOException {  //creo el metodo introducirdatos
		BufferedWriter bw = new BufferedWriter(new FileWriter(f));//el bufferedwriter escribe linea linea y lo mete en el fichero

		System.out.println("Introduce los nombres de las personas: ");//preguntamos al usuario que introduzca lon nombres
		p1.setNombre(sc.nextLine());//llamamos a cada persona y le introducimos un dato que lo dara el usuario por pantalla. con la clase scanner
		p2.setNombre(sc.nextLine());
		p3.setNombre(sc.nextLine());
		p4.setNombre(sc.nextLine());
		p5.setNombre(sc.nextLine());
		System.out.println("Introduce los apellidos de la personas: ");
		p1.setApellidos(sc.nextLine());
		p2.setApellidos(sc.nextLine());
		p3.setApellidos(sc.nextLine());
		p4.setApellidos(sc.nextLine());
		p5.setApellidos(sc.nextLine());
		System.out.println("Introduce el idioma de las personas: ");
		p1.setIdioma(sc.nextLine());
		p2.setIdioma(sc.nextLine());
		p3.setIdioma(sc.nextLine());
		p4.setIdioma(sc.nextLine());
		p5.setIdioma(sc.nextLine());
		System.out.println("Introduce el usuario de las personas: ");
		p1.setUsuario(sc.nextLine());
		p2.setUsuario(sc.nextLine());
		p3.setUsuario(sc.nextLine());
		p4.setUsuario(sc.nextLine());
		p5.setUsuario(sc.nextLine());
		System.out.println("Introduce la contraseña de las personas: ");
		p1.setContrasenya(sc.nextLine());
		p2.setContrasenya(sc.nextLine());
		p3.setContrasenya(sc.nextLine());
		p4.setContrasenya(sc.nextLine());
		p5.setContrasenya(sc.nextLine());

		//creamos 5 arrays Strings a la que llamaremos a todos los datos de la persona
		String[] us1 = { p1.getNombre(), p1.getApellidos(), p1.getIdioma(), p1.getUsuario(), p1.getContrasenya() };
		String[] us2 = { p2.getNombre(), p2.getApellidos(), p2.getIdioma(), p2.getUsuario(), p2.getContrasenya() };
		String[] us3 = { p3.getNombre(), p3.getApellidos(), p3.getIdioma(), p3.getUsuario(), p3.getContrasenya() };
		String[] us4 = { p4.getNombre(), p4.getApellidos(), p4.getIdioma(), p4.getUsuario(), p4.getContrasenya() };
		String[] us5 = { p5.getNombre(), p5.getApellidos(), p5.getIdioma(), p5.getUsuario(), p5.getContrasenya() };
		
		//con el bufferwriter introduciremos la informacion a us1
		bw.write("\r\n");
		bw.write(("us1"));
		bw.write("\r\n");
		bw.write("\r\n");
		for (int j = 0; j < us1.length; j++) {//aqui recorremos la longitud del array
			bw.write(us1[j]);
			bw.write("\r\n");
		}

		bw.write("\r\n");
		bw.write(("us2"));
		bw.write("\r\n");
		bw.write("\r\n");
		for (int k = 0; k < us2.length; k++) {
			bw.write(us2[k]);
			bw.write("\r\n");
		}

		bw.write("\r\n");
		bw.write(("us3"));
		bw.write("\r\n");
		bw.write("\r\n");
		for (int l = 0; l < us3.length; l++) {
			bw.write(us3[l]);
			bw.write("\r\n");
		}

		bw.write("\r\n");
		bw.write(("us4"));
		bw.write("\r\n");
		bw.write("\r\n");
		for (int l = 0; l < us4.length; l++) {
			bw.write(us4[l]);
			bw.write("\r\n");
		}

		bw.write("\r\n");
		bw.write(("us5"));
		bw.write("\r\n");
		bw.write("\r\n");
		for (int l = 0; l < us5.length; l++) {
			bw.write(us5[l]);
			bw.write("\r\n");
		}

		bw.close();
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

	public static void EscribirFicheroTexto(String url, String texto, boolean tipo) {

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

	public static void leerDatos() throws IOException {//creamos el metodo leer ficheros
		
		
		BufferedReader lector = new BufferedReader(new FileReader(f));//aqui capturamos la informacion linea a linea
		String linea;
		System.out.println("Introduce la persona que quieres leer:(Indica us + nº de persona) ");//le pedimos al usuario que introduzca la persona a buscar
		String persona;
		do {
			persona = sc.nextLine();//aqui le decimos que persona sera lo que vaya introduciendo el usuario
			//con el while haremos una comparacion, comparamos persona con cada persona
		} while (!persona.equals("us1") && !persona.equals("us2") && !persona.equals("us3") && !persona.equals("us4")
				&& !persona.equals("us5"));

		while ((linea = lector.readLine()) != null) {

			if (linea.contains(persona)) {//con un decimos que si la linea contiene persona
				for (int i = 0; i < 5; i++) {//con un bucle for le decimos que lea hasta 5 personas
					linea = lector.readLine();
					System.out.println(linea);
				}
			}
		}
		lector.close();
	}

}

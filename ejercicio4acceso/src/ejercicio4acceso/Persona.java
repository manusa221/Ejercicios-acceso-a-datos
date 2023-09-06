package ejercicio4acceso;


import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
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

	
	
	static File f = new File("./info/datos.dat");
    static Scanner sc = new Scanner(System.in);

    public static Persona p1 = new Persona();
    public static Persona p2 = new Persona();
    public static Persona p3 = new Persona();
    public static Persona p4 = new Persona();
    public static Persona p5 = new Persona();

    public static void escribirFicheroBinario() throws IOException
    {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream(f));

        System.out.println("Introduce los usuarios: ");
        p1.setUsuario(sc.nextLine());
        p2.setUsuario(sc.nextLine());
        p3.setUsuario(sc.nextLine());
        p4.setUsuario(sc.nextLine());
        p5.setUsuario(sc.nextLine());

        System.out.println("Introduce las contrase�as: ");
        p1.setContrasenya(sc.nextLine());
        p2.setContrasenya(sc.nextLine());
        p3.setContrasenya(sc.nextLine());
        p4.setContrasenya(sc.nextLine());
        p5.setContrasenya(sc.nextLine());

        dos.writeUTF("us1: ");
        dos.writeUTF("\r\n");
        dos.writeUTF(p1.getUsuario());
        dos.writeUTF("\r\n");
        dos.writeUTF(p1.getContrasenya());
        dos.writeUTF("\r\n");
        dos.writeUTF("\r\n");

        dos.writeUTF("us2: ");
        dos.writeUTF("\r\n");
        dos.writeUTF(p2.getUsuario());
        dos.writeUTF("\r\n");
        dos.writeUTF(p2.getContrasenya());
        dos.writeUTF("\r\n");
        dos.writeUTF("\r\n");

        dos.writeUTF("us3: ");
        dos.writeUTF("\r\n");
        dos.writeUTF(p3.getUsuario());
        dos.writeUTF("\r\n");
        dos.writeUTF(p3.getContrasenya());
        dos.writeUTF("\r\n");
        dos.writeUTF("\r\n");

        dos.writeUTF("us4: ");
        dos.writeUTF("\r\n");
        dos.writeUTF(p4.getUsuario());
        dos.writeUTF("\r\n");
        dos.writeUTF(p4.getContrasenya());
        dos.writeUTF("\r\n");
        dos.writeUTF("\r\n");

        dos.writeUTF("us5: ");
        dos.writeUTF("\r\n");
        dos.writeUTF(p5.getUsuario());
        dos.writeUTF("\r\n");
        dos.writeUTF(p5.getContrasenya());
        dos.writeUTF("\r\n");
        dos.writeUTF("\r\n");

        dos.close();
    }

}
	

	


		


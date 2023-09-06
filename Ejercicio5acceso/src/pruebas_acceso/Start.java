package pruebas_acceso;

import java.io.IOException;
import java.util.Scanner;

public class Start {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int opcion;
        do
        {//creamos un pequeño menu para poder escoger las opciones a realizar.
            System.out.println("");
            System.out.println("Elegir opción: ");
            System.out.println("1.- Editar fichero");
            System.out.println("2.- Leer datos del fichero");
            System.out.println("3.- Salir");
            System.out.println("");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion)//utilizamos el switch para seleccionar una opcion a elegir, entre parentesis ponemos la variable opcion que sera la opcion que elija el usuario
            {
                case 1:
                    Persona.escribirFicheroBinario();//en el caso que el usuario pulse 1, le daremos la orden que llame a la clase persona, a la función escribirFicheroBinario
                    break;
                case 2:
                    Persona.leerFichero();//si el usuario marca la opcion 2 accedera a la clase persona, funcion leerFicheo
                    break;
                default:
                    break;
            }
        }
        while(opcion != 3);//si le da a la opcion 3 el programa terminara
        System.out.println("Gracias por utilizar el programa!!!!! ");
    }
}


		
	
	

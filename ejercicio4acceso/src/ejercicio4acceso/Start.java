package ejercicio4acceso;

import java.io.IOException;
import java.util.Scanner;
public class Start {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int opcion;
        do
        {//creamos un peque�o menu para poder escoger las opciones a realizar.
            System.out.println("");
            System.out.println("Elegir opci�n: ");
            System.out.println("1.- Editar fichero");
            System.out.println("2.- Salir");
            System.out.println("");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion)//utilizamos el switch para seleccionar una opcion a elegir, entre parentesis ponemos la variable opcion que sera la opcion que elija el usuario
            {
                case 1:
                    Persona.escribirFicheroBinario();//en el caso que el usuario pulse 1, le daremos la orden que llame a la clase persona, a la funci�n escribirFicheroBinario
                    break;
               
                default:
                    break;
            }
        }
        while(opcion != 2);//si le da a la opcion 2 el programa terminara
        System.out.println("Gracias por utilizar el programa!!!!! ");
    }
}
		
		
	

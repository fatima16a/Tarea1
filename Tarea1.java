import java.util.ArrayList;
import java.util.Scanner;
import java.lang.StackWalker.Option;
import java.awt.List;

public class Tarea1{
    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        // algunas variables es mejor acercarlas a donde se usa.
        // Eso de definir las variables arriba es mala practica.
        String  numero;
        String nombre;
        String opcion;
        String mail;

        // Bien! Aca si no mal recuerdo hubo ayuda de Mati, no?
        String [] contactosNo = new String [256];
        String [] contactosNu = new String [256];
        String [] contactosM = new String [256];

        int cantidadContactos = 0;
       
        // No esta bueno agregar datos inventados en la app que subimos a github.

        do{
            System.out.println("-----------------------------------AGENDA-----------------------------------");
            System.out.println("¿Queres [I]ngresar un nuevo contacto o [C]onsultar un contacto ya existente?");
            System.out.println("¿Deseas [S]alir?");
            System.out.println("----------------------------------------------------------------------------");
            opcion = tec.nextLine();
            // boolean dSalir = false;
            switch(opcion.toUpperCase()){
                case "I":
                // aca para forzar que de un valor podes usar
                System.out.println("Ingrese el Nombre:");
                do {
                  nombre = tec.nextLine();
                } while (nombre.isEmpty());
                
                System.out.println("Ingrese el Email de "+ nombre);
                mail = tec.nextLine();
                System.out.println("Ingresa el numero:");
                numero = tec.nextLine();
                // mas sencillo con una variable auxiliar `cantidadContactos`
                contactosNo [cantidadContactos] = nombre;
                contactosM [cantidadContactos] = mail;
                contactosNu [cantidadContactos] = numero;
                cantidadContactos += 1;
                break;

                case "C":
                System.out.println("ingrese el nombre del el contacto que deseas consultar");
                nombre = tec.nextLine();
                
                // asi no vas a recorrer siempre los 256 contactos.
                for (int i = 0; i < cantidadContactos; i++){
                    if(contactosNo[i].equals(nombre)){
                        System.out.println(contactosNo[i]);
                        System.out.println(contactosNu[i]);
                        System.out.println(contactosM[i]);
                        break;
                    }
                }
                break;

                default:
                System.out.println("Esta opcion no es valida");
                break;

            }

        } while (opcion != "S");
    }

}
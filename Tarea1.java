import java.util.ArrayList;
import java.util.Scanner;
import java.lang.StackWalker.Option;
import java.awt.List;

public class Tarea1{
    public static void main(String[] args) {

        Scanner tec= new Scanner(System.in);
        String  numero;
        String nombre;
        String opcion;
        String mail;
        String [] contactosNo = new String [256];
        String [] contactosNu = new String [256];
        String [] contactosM = new String [256];
       
        contactosNo [0] = ("JuaN");
        contactosNo [1] = ("Ariana");
        contactosNo [2] = ("Ana");
        contactosNo [3] = ("Raquel");
        contactosNo [4] = ("Daniela");
        contactosNo [5] = ("Bruno");
        contactosNo [6] = ("Joshua");
        contactosNo [7] = ("Artemis");
        contactosNo [8] = ("Ares");
        contactosNo [9] = ("Apolo");
        contactosNo [10] = ("Emmanuel");
        
        contactosNu [0] = ("099456387");
        contactosNu [1] = ("904567298");
        contactosNu [2] = ("092365849");
        contactosNu [3] = ("091234567");
        contactosNu [4] = ("09436812");
        contactosNu [5] = ("0916943232");
        contactosNu [6] = ("099955451");
        contactosNu [7] = ("096574839");
        contactosNu [8] = ("098765432");
        contactosNu [9] = ("093987126");
        contactosNu [10] = ("092567119");

        contactosM [0] = ("juan@gmail.com");
        contactosM [1] = ("ariana@gmail.com");
        contactosM [2] = ("ana@gmaail.com");
        contactosM [3] = ("raquel@gamil.com");
        contactosM [4] = ("daniel@gamil.com");
        contactosM [5] = ("bruno@gamil.com");
        contactosM [6] = ("joshua@gmail.com");
        contactosM [7] = ("artemis@gmail.com");
        contactosM [8] = ("ares@gmail.com");
        contactosM [9] = ("apolo@gamil.com");
        contactosM [10] = ("emmanuel@gmail.com");

        do{
            System.out.println("-----------------------------------AGENDA-----------------------------------");
            System.out.println("¿Queres [I]ngresar un nuevo contacto o [C]onsultar un contacto ya existente?");
            System.out.println("¿Deseas [S]alir?");
            System.out.println("----------------------------------------------------------------------------");
            opcion = tec.nextLine();
            // boolean dSalir = false;
            switch(opcion.toUpperCase()){
                case "I":
                System.out.println("Ingrese el Nombre:");
                nombre = tec.nextLine();
                System.out.println("Ingrese el Email de "+ nombre);
                mail = tec.nextLine();
                System.out.println("Ingresa el numero:");
                numero = tec.nextLine();
                
                for (int i = 0; i < contactosNo.length; i++){
                    if(contactosNo[i]==null){
                        contactosNo [i] = nombre;
                        contactosM [i] = mail;
                        contactosNu [i] = numero;
                    }
                }
                break;

                case "C":
                System.out.println("ingrese el nombre del el contacto que deseas consultar");
                nombre = tec.nextLine();
                for (int i = 0; i < contactosNo.length; i++){
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

        }while(opcion != "S");
    }

}
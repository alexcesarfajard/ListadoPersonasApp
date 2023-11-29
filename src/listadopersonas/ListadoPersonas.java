package listadopersonas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListadoPersonas {

    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println("Hello!!");

        Scanner sc = new Scanner(System.in);
        //Definimos la lista que contendrán nuestras personas
        List<Persona> personas = new ArrayList<>();
        
        //Agregamos personas para que ya aparezcan desde un inicio de la aplicacion
        personas.add(new Persona("Alex", "5544998877", "alex@mail.com"));
        personas.add(new Persona("Joss", "8877665544", "joss@mail.com"));
        personas.add(new Persona("Juan", "2255887744", "juan@mail.com"));
        
        
        boolean salir = false;
        int opc = 0;

        do {
            funcMostrarMenu();
            try {
                opc = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                funcMostrarMensaje("Ha ocurrido un error: ", e.getMessage());
                sc.nextLine();
            }

            switch (opc) {
                case 1: //Opcion para agregar persona
                    
                    //pedimos los datos de la nueva persona
                    funcMostrarMensaje("Digite el nombre: ", "");
                    String nombre = sc.nextLine();
                    funcMostrarMensaje("Digite el telefono: ", "");
                    String telefono = sc.nextLine();
                    funcMostrarMensaje("Digite el correo electronico: ", "");
                    String email = sc.nextLine();
                    
                    //creamos el objeto de tipo persona
                    Persona p = new Persona(nombre, telefono, email);
                    
                    //lo agregamos a la lista
                    personas.add(p);
                    
                    //Confirmamos que la persona se ha agregado a la lista
                    funcMostrarMensaje("Persona agregada con exito!! Personas en la lista: " + personas.size(),
                            "\nPresione enter para continuar...");
                    sc.nextLine();
                    break;
                case 2: //Opcion para mostrar las personas en la lista
                    funcMostrarMensaje("\n\n*** Pesonas en la lista ***", "\n\n");
                    personas.forEach(System.out::println);
                    funcMostrarMensaje("\n\nEstas son las personas en lista", "\nPresione enter para continuar...");
                    sc.nextLine();
                    break;
                case 3:
                    funcMostrarMensaje("Saliendo de la aplicacion!", "\nPresione enter para salir...");
                    sc.nextLine();
                    salir = true;
                    break;
                default:
                    funcMostrarMensaje("Opcion incorrecta", "\nPresione enter para continuar...");
                    sc.nextLine();
                    break;
            }//termina switch
        } while (!salir); // termina el while
    } // termina el main principal

    //funcion para mostrar el menu
    private static void funcMostrarMenu() {
        System.out.print("*** Listado de personas ****\n"
                + "1. Agregar persona\n"
                + "2. Ver personas\n"
                + "3. Salir\n"
                + "Por favor digite una opcion: ");
    }

    //funcion para mostrar mensajes
    private static void funcMostrarMensaje(String mensaje, String mensaje2) {
        System.out.print(mensaje + mensaje2);
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListadoPersonasApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        //Definimos la lista fuera del ciclo while
        List<Persona> personas = new ArrayList<>();
        // Menu
        var salir = false;
        while(!salir){
            mostrarMenu();
            try{
                salir = ejecutarOperacion(consola, personas);
            } catch (Exception e){
                System.out.println("Ocurrio un Error: " + e.getMessage());
            }
            System.out.println();
        }
    }
    private static void mostrarMenu(){
        // Mostrar Menu
        System.out.print("""
            *** Listado Personas App***
            1. Agregar
            2. Listar
            3. Salir
            """);
        System.out.print("Proporciona la opcion desada: ");
    }

    private static boolean ejecutarOperacion(Scanner consola, List<Persona> personas){
        var opcion = Integer.parseInt(consola.nextLine());
        var salir = false;
        // Revisamos la opcion proporcionada
        switch (opcion){
            case 1 -> {//Agregar persona a la lista
                System.out.print("Proporciona el nombre: ");
                var nombre = consola.nextLine();
                System.out.print("Proporciona el tel: ");
                var tel = consola.nextLine();
                System.out.print("Proporciona el email: ");
                var email = consola.nextLine();
                //Crear el objeto Persona
                var persona = new Persona(nombre, tel, email);
                //lo agregamos a la lista
                personas.add(persona);
                System.out.println("La lista tiene: " + personas.size() + " elementos");
            }// fin caso 1
            case 2 -> { // Listar las personas
                System.out.println("Listado de Personas: ");
                // Mejora usando lambda y metodo de referencia
                //personas.forEach((persona) -> System.out.println(persona));
                personas.forEach(System.out::println);
            }//fin caso 2
            case 3 -> { //salir del ciclo
                System.out.println("Hasta Pronto...");
                salir = true;
            }
            default -> System.out.println("Opcion erronea: " + opcion);
        }//fin swicht
        return salir;
    }
}


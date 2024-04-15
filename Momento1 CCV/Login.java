import java.util.Scanner;

public class Login {

    // Definir arrays para guardar datos
    static String[] usuarios = new String[100];
    static String[] contrasenas = new String[100];
    static int contadorUsuarios = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        // Menú
        while (!salir) {
            System.out.println("Bienvenido al programa");
            System.out.println("1. Registrarse");
            System.out.println("2. Iniciar sesión");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea después del nextInt()

            switch (opcion) {
                case 1:
                    registrarUsuario(scanner);
                    break;
                case 2:
                    iniciarSesion(scanner);
                    break;
                case 3:
                    salir = true;
                    System.out.println("Gracias por usar el programa.");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        }
    }

    // Registrar un nuevo usuario
    static void registrarUsuario(Scanner scanner) {
        System.out.print("Ingrese su nombre de usuario: ");
        String usuario = scanner.nextLine();
        System.out.print("Ingrese su contraseña: ");
        String contrasena = scanner.nextLine();

        usuarios[contadorUsuarios] = usuario;
        contrasenas[contadorUsuarios] = contrasena;
        contadorUsuarios++;

        System.out.println("Usuario registrado exitosamente.");
    }

    // Método para iniciar sesión
    static void iniciarSesion(Scanner scanner) {
        System.out.print("Ingrese su nombre de usuario: ");
        String usuario = scanner.nextLine();
        System.out.print("Ingrese su contraseña: ");
        String contrasena = scanner.nextLine();

        boolean encontrado = false;
        for (int i = 0; i < contadorUsuarios; i++) {
            if (usuarios[i].equals(usuario) && contrasenas[i].equals(contrasena)) {
                encontrado = true;
                System.out.println("Inicio de sesión exitoso.");
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Nombre de usuario o contraseña incorrectos.");
        }
    }
}


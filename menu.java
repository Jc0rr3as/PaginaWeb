import java.util.Scanner;
import java.util.Stack;

public class menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        metodos m = new metodos();
        Stack<objPagina> paginas = new Stack<>();
        boolean continuar = true;
        while (continuar) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Registrar páginas");
            System.out.println("2. Retroceder a la página anterior");
            System.out.println("3. Mostrar páginas");
            System.out.println("4. Salir");
            int opt = sc.nextInt();
            sc.nextLine();

            switch (opt) {
                case 1:
                    paginas = m.registro();
                    break;
                case 2:
                    paginas = m.Retroceder(paginas);
                    break;
                case 3:
                    // Mostrar páginas
                    break;
                case 4:
                    System.out.println("Vuelva Pronto");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        }
    }
}

import java.util.Scanner;
import java.util.Stack;

public class metodos {
    Stack<objPagina> paginas = new Stack<>();
    Scanner sc = new Scanner(System.in);

    public Stack<objPagina> registro() {
        boolean continuar = true;
        while (continuar) {
            System.out.print("Ingrese la URL de la página: ");
            String url = sc.nextLine();
            System.out.print("Ingrese el título de la página: ");
            String titulo = sc.nextLine();
            System.out.print("Ingrese la fecha de acceso (formato: dd/mm/aaaa): ");
            String fechaAcceso = sc.nextLine();

            objPagina pagina = new objPagina(url, titulo, fechaAcceso);
            paginas.push(pagina);

            System.out.print("¿Desea agregar otra página? (s/n): ");
            String respuesta = sc.nextLine();
            if (respuesta.equalsIgnoreCase("n")) {
                continuar = false;
            }
        }
        return paginas;
    }

    public Stack<objPagina> Retroceder(Stack<objPagina> paginas) {
        if (!paginas.isEmpty()) {
            paginas.pop();
            objPagina paginaActual = paginas.peek();
            // objPagina paginaActual = paginas.pop();
            System.out.println("Página actual: " + paginaActual.getTitulo());
        } else {
            System.out.println("No hay páginas para retroceder.");
        }
        return paginas;
    }
}

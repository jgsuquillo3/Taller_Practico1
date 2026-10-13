package Ejercicio3;
 
/**
 * Clase Libro: gestiona el prestamo de libros en una biblioteca.
 */
public class Libro {
    //Atributos
    String titulo, autor, estado;
    int paginas;
 
    //Constructores
    public Libro() {
    }
 
    public Libro(String titulo, String autor, int paginas, String estado) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.estado = estado;
    }
 
    //Metodos
    public void prestar() {
        if (estado.equalsIgnoreCase("disponible")) {
            estado = "prestado";
            System.out.println("Prestamo exitoso del libro \"" + titulo + "\"");
        } else {
            System.out.println("No se puede prestar, el libro esta " + estado);
        }
    }
 
    public void devolver() {
        if (estado.equalsIgnoreCase("prestado")) {
            estado = "disponible";
            System.out.println("Devolucion exitosa del libro \"" + titulo + "\"");
        } else {
            System.out.println("No se puede devolver, el libro esta " + estado);
        }
    }
 
    public void mostrarInfo() {
        System.out.println("---Informacion del Libro---");
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Paginas: " + paginas);
        System.out.println("Estado: " + estado);
    }
}
 
package Model;

public interface IEntradas {

    void cargarEntradas(Entradas elemento);
    int venderEntradas(String tipo);
    String mostrarEntradasVendidas();
    String mostrarEntradasDisponibles();
    double verTotalRecaudado();
    String mostrarEntradas();

}

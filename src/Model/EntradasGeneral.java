package Model;

public class EntradasGeneral extends Entradas{

    private String Campo;
    private String Platea;
    private String Codo;

    public EntradasGeneral(int ID, String disponible, String campo, String platea, String codo) {
        super(ID, disponible);
        obtenerPrecioTotal();
        obtenerTipo();
        Campo = campo;
        Platea = platea;
        Codo = codo;
    }

    public String getCampo() {
        return Campo;
    }

    public void setCampo(String campo) {
        Campo = campo;
    }

    public String getPlatea() {
        return Platea;
    }

    public void setPlatea(String platea) {
        Platea = platea;
    }

    public String getCodo() {
        return Codo;
    }

    public void setCodo(String codo) {
        Codo = codo;
    }

    @Override
    public void obtenerTipo() {
        Tipo="General";
    }

    @Override
    public void obtenerPrecioTotal() {
        Precio=PRECIO;
    }

    @Override
    public String toString() {
        return super.toString()+"{" +
                "Campo='" + Campo + '\'' +
                ", Platea='" + Platea + '\'' +
                ", Codo='" + Codo + '\'' +
                '}';
    }
}

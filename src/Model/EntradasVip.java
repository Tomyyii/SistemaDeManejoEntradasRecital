package Model;

public class EntradasVip extends Entradas{

    private String Beneficio;

    public EntradasVip(int ID, String disponible, String beneficio) {
        super(ID, disponible);
        obtenerPrecioTotal();
        Beneficio = beneficio;
        obtenerTipo();
    }

    public String getBeneficio() {
        return Beneficio;
    }

    public void setBeneficio(String beneficio) {
        Beneficio = beneficio;
    }


    @Override
    public void obtenerTipo() {
        Tipo="Vip";
    }

    @Override
    public void obtenerPrecioTotal() {
        Precio=PRECIO+(PRECIO*0.5);
    }

    @Override
    public String toString() {
        return super.toString()+"{" +
                "Beneficio='" + Beneficio + '\'' +
                '}';
    }
}

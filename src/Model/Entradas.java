package Model;

public abstract class Entradas{
    final double PRECIO=500;
    protected int ID;
    protected double Precio;
    protected String Disponible;
    protected String Tipo;

    public Entradas(int ID, String disponible) {
        this.ID = ID;
        Disponible = disponible;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    public String getDisponible() {
        return Disponible;
    }

    public void setDisponible(String disponible) {
        Disponible = disponible;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    @Override
    public String toString() {
        return "\nEntradas{" +
                "ID=" + ID +
                ", Precio=" + Precio +
                ", Disponible='" + Disponible + '\'' +
                ", Tipo='" + Tipo + '\'' +
                '}';
    }

    public boolean equals(Object obj)
    {
        boolean SonIguales=false;
        if(obj!=null)
        {
            if(obj instanceof Entradas)
            {
                Entradas entradaAcomparar= (Entradas) obj;
                if(getID()==entradaAcomparar.getID())
                {
                    SonIguales=true;
                }
            }
        }
        return SonIguales;
    }

    public abstract void obtenerTipo();
    public abstract void obtenerPrecioTotal();

}

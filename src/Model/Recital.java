package Model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class Recital implements IEntradas{

    private String Nombre;
    private String Lugar;
    private String Fecha;
    private HashMap<String, HashSet<Entradas>> MapaEntradas;

    public Recital(String nombre, String lugar, String fecha) {
        this.Nombre = nombre;
        this.Lugar = lugar;
        this.Fecha = fecha;
        MapaEntradas = new HashMap<>();
    }

    public Recital() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String lugar) {
        this.Lugar = lugar;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String fecha) {
        this.Fecha = fecha;
    }

    @Override
    public String toString() {
        return "Recital{" +
                "nombre='" + Nombre + '\'' +
                ", lugar='" + Lugar + '\'' +
                ", fecha='" + Fecha + '\'' +
                '}';
    }

    @Override
    public void cargarEntradas(Entradas elemento) {
        HashSet<Entradas>entradasVip=MapaEntradas.getOrDefault("Vip",new HashSet<>());
        HashSet<Entradas>entradasGeneral=MapaEntradas.getOrDefault("General",new HashSet<>());
        if(elemento.getTipo().equals("Vip"))
        {
            entradasVip.add(elemento);
        }
        else if(elemento.getTipo().equals("General"))
        {
            entradasGeneral.add(elemento);
        }
        MapaEntradas.put("Vip",entradasVip);
        MapaEntradas.put("General",entradasGeneral);
    }

    @Override
    public int venderEntradas(String tipo) {
        HashSet<Entradas>entradaSolicitada=MapaEntradas.get(tipo);
        int idVendido=0;
        Iterator<Entradas> iterator=entradaSolicitada.iterator();
        boolean flag=true;
        while (iterator.hasNext() && flag==true)
        {
            Entradas elemento=iterator.next();
            if(elemento.getDisponible().equals("Disponible"))
            {
                elemento.setDisponible("No Disponible");
                idVendido=elemento.getID();
                flag=false;
            }
        }
        return idVendido;
    }

    @Override
    public String mostrarEntradasVendidas() {
        StringBuilder Mostrar= new StringBuilder();
        for (String tipo: MapaEntradas.keySet())
        {
            Mostrar.append("\nENTRADAS "+tipo+ " VENDIDAS:");
            for(Entradas entrada: MapaEntradas.get(tipo))
            {
                if(entrada.getDisponible().equals("No Disponible"))
                {
                    Mostrar.append(entrada.toString());
                }
            }
        }
        return Mostrar.toString();
    }

    @Override
    public String mostrarEntradasDisponibles() {
        StringBuilder Mostrar= new StringBuilder();
        for (String tipo: MapaEntradas.keySet())
        {
            Mostrar.append("\nENTRADAS: "+tipo+" DISPONIBLES");
            for(Entradas entrada: MapaEntradas.get(tipo))
            {
                if(entrada.getDisponible().equals("Disponible"))
                {
                    Mostrar.append(entrada.toString());
                }
            }
        }
        return Mostrar.toString();
    }

    @Override
    public double verTotalRecaudado() {
        double Total=0;
        for (String tipo: MapaEntradas.keySet())
        {
            for(Entradas entrada: MapaEntradas.get(tipo))
            {
                if(entrada.getDisponible().equals("No Disponible"))
                {
                    Total=Total+entrada.getPrecio();
                }
            }
        }
        return Total;
    }

    @Override
    public String mostrarEntradas() {
        StringBuilder Mostrar= new StringBuilder();
        for (String tipo: MapaEntradas.keySet())
        {
            Mostrar.append("\nENTRADAS: "+tipo);
            for(Entradas entrada: MapaEntradas.get(tipo))
            {
                    Mostrar.append(entrada.toString());
            }
        }
        return Mostrar.toString();
    }
}

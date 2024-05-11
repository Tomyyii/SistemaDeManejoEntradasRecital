import Model.Entradas;
import Model.EntradasGeneral;
import Model.EntradasVip;
import Model.Recital;

public class Main {
    public static void main(String[] args) {


        Recital recital=new Recital("Ricky Martin","Estadio Velez","11/05/2024");
        Entradas entrada1=new EntradasGeneral(1,"Disponible","Estadio Velez","Alta","GOD");
        Entradas entrada2=new EntradasGeneral(2,"No Disponible","Estadio Velez","Alta","GOD");
        Entradas entrada3=new EntradasGeneral(3,"Disponible","Estadio Velez","Baja","GOD");
        Entradas entrada4=new EntradasGeneral(4,"No Disponible","Estadio Velez","Alta","GOD");
        Entradas entrada5=new EntradasGeneral(5,"Disponible","Estadio Velez","Baja","GOD");

        Entradas entrada6=new EntradasVip(6,"Disponible","Palco");
        Entradas entrada7=new EntradasVip(7,"Disponible","Palco");
        Entradas entrada8=new EntradasVip(8,"No Disponible","Palco");
        Entradas entrada9=new EntradasVip(9,"No Disponible","Palco");
        Entradas entrada10=new EntradasVip(10,"No Disponible","Palco");


        recital.cargarEntradas(entrada1);
        recital.cargarEntradas(entrada2);
        recital.cargarEntradas(entrada3);
        recital.cargarEntradas(entrada4);
        recital.cargarEntradas(entrada5);
        recital.cargarEntradas(entrada6);
        recital.cargarEntradas(entrada7);
        recital.cargarEntradas(entrada8);
        recital.cargarEntradas(entrada9);
        recital.cargarEntradas(entrada10);

        System.out.println(recital.mostrarEntradas());
        System.out.println(recital.mostrarEntradasVendidas());
        System.out.println(recital.mostrarEntradasDisponibles());
        System.out.println();

        System.out.println("TOTAL: "+recital.verTotalRecaudado());

        System.out.println();
        System.out.println();

        int idVendido=recital.venderEntradas("General");
        System.out.println("ENTRADA VENDIDA CON ID: "+idVendido);

        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println(recital.mostrarEntradas());


    }
}
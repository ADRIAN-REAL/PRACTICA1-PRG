import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //cliente
        Cliente carlos = new Cliente ( 1, "Carlos",  "Peres",  "Vargas");


        //ciudad
        Ciudad cochabamba = new Ciudad( 1,  "Cochabamba");
        Ciudad santaCruz = new Ciudad(  2,  "Santa Cruz");
        Ciudad tarija = new Ciudad( 3, "Tarija");

        //Categoria
        Categoria turista = new Categoria( 1,  "Turista");

        //aeropuerto
        Aeropuerto jorgeWilstermann = new Aeropuerto(  "JW",  "Jorge Wilstermann Camacho",cochabamba);
        Aeropuerto viruViru = new Aeropuerto(  "VV",  "Viru Viru", santaCruz);
        Aeropuerto oriellea = new Aeropuerto(  "01" ,  "Oriel Lea Plaza", tarija);


        //vuelo
        List<Vuelo> vuelos = new ArrayList<>();
        Vuelo cochabambaSantaCruz = new Vuelo("Boa-158", Calendar.getInstance().getTime(),jorgeWilstermann, viruViru);
        vuelos.add(cochabambaSantaCruz);
        Vuelo santaCruzTarija = new Vuelo("BOA-159", Calendar.getInstance().getTime(), viruViru, oriellea);
        vuelos.add(santaCruzTarija);


        //billete


        Billete billete = new Billete (1,Calendar.getInstance().getTime(),  650.5, carlos, cochabamba, tarija, turista,vuelos );

        System.out.println("Billete");
        System.out.println("=======");
        System.out.println("Id: " + billete.getIdBillete());
        System.out.println("Fecha: " + billete.getFechaEmision());
        System.out.println("Precio total: " + billete.getPrecioTotal());
        System.out.println("Cliente: " + billete.getCliente().getNombre());
        System.out.println("Origen: " + billete.getOrigen().getNombre());
        System.out.println("Destino: "+ billete.getDestino().getNombre());
        System.out.println("Categoria: " + billete.getCategoria().getNombre());
        System.out.println("Vuelo:" );
        for (Vuelo vuelo:billete.getVuelos()) {
            System.out.println("Codigo vuelo: " + vuelo.getCodigoVuelo() + " | Salida:" + vuelo.getSalida() + " | Origen_ " + vuelo.getOrigen().getNombre());
        }
    }

}


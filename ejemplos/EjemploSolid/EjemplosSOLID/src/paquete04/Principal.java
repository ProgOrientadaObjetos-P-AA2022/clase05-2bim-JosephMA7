/*
 * O — Open/closed principle (Principio abierto/cerrado)
 */
package paquete04;
//Cambios 8 - julio-2022

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        TransporteBus bus = new TransporteBus();
        bus.establecerCooperativaBus("24 Mayo");
        bus.establecerTarifa();
        
        TransporteTaxi taxi = new TransporteTaxi();
        taxi.establecerCooperativaTaxi("Yahuarcuna");
        taxi.establecerTarifa();
        
        TransporteTransvia transvia = new TransporteTransvia();
        transvia.establecerCooperativaTransvia("Cariamanga");
        transvia.establecerTarifa();
        
        TiposTransporte tipos = new TiposTransporte();
        ArrayList<Transporte>transportes =new ArrayList<>();
        transportes.add(bus);
        transportes.add(taxi);
        transportes.add(transvia);
        
        tipos.establecerTransportes(transportes);
        tipos.establecerPromedioTarifas();
        
        System.out.printf("Promedio de Tarifas: %.2f", 
                tipos.obtenerPromedioTarifas());
        
    }
}

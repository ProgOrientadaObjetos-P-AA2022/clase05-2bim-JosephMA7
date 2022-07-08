
package paquete04;

public class TransporteTransvia extends Transporte{
    
    private String cooperativaTransvia;

    public void establecerCooperativaTransvia(String c) {
        cooperativaTransvia = c;
    }

    @Override
    public void establecerTarifa() {
        tarifa = 1.45 + 0.30;
    }

    public String obtenerCooperativaBus() {
        return cooperativaTransvia;
    }
    
}
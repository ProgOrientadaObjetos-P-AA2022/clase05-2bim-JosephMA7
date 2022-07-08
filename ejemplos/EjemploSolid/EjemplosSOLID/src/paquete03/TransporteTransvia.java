
package paquete03;

/**
 *
 * @author Usuario
 */
public class TransporteTransvia {
    private String CoperativaTransvia;
    private double tarifa;

    public void establecerCoperativaTransvia(String c) {
        CoperativaTransvia = c;
    }
    public void establecerTarifa() {
        tarifa = 1.40 + 0.40;
    }
    public String obtenerCoperativaTransvia() {
        return CoperativaTransvia;
    }

    public double obtenerTarifa() {
        return tarifa;
    }
    
}

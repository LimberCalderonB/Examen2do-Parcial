import java.util.Date;

public class Factura {
    int numeroEntrada;
    Date fecha;
    int numeroFactura;
    String proveedor;
    int totalBienes;
    int valorTotal;

    public Factura(int numeroEntrada, Date fecha, int numeroFactura, String proveedor, int totalBienes, int valorTotal) {
        this.numeroEntrada = numeroEntrada;
        this.fecha = fecha;
        this.numeroFactura = numeroFactura;
        this.proveedor = proveedor;
        this.totalBienes = totalBienes;
        this.valorTotal = valorTotal;
    }
}

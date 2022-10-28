import java.util.Date;

public class Bien {
    String codUniversal;
    Date Fecha;
    String Ubicacion;
    String Empleado;

    public Bien(String codUniversal, Date fecha, String ubicacion, String empleado) {
        this.codUniversal = codUniversal;
        Fecha = fecha;
        Ubicacion = ubicacion;
        Empleado = empleado;
    }
}

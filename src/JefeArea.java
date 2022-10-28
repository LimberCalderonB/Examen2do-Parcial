public class JefeArea extends Empleado{
    Empleado empleado;

    public JefeArea(String nombre, int CI, String primerApellido, String segundoApellido, Empleado empleado) {
        super(nombre, CI, primerApellido, segundoApellido);
        this.empleado = empleado;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
}

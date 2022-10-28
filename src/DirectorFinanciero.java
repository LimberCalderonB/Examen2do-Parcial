public class DirectorFinanciero extends JefeArea{
    JefeArea jefeArea;

    public DirectorFinanciero(String nombre, int CI, String primerApellido, String segundoApellido, Empleado empleado, JefeArea jefeArea) {
        super(nombre, CI, primerApellido, segundoApellido, empleado);
        this.jefeArea = jefeArea;
    }

    public JefeArea getJefeArea() {
        return jefeArea;
    }

    public void setJefeArea(JefeArea jefeArea) {
        this.jefeArea = jefeArea;
    }
}

public class CocheKm0 extends Coche implements Alquilable {

    public CocheKm0(String matricula, String color, String modelo, double precio, int kilometros) {
        super(matricula, color, modelo, precio, kilometros);
    }

    @Override
    public void alquilar() {
        System.out.println("El coche Km0 con matrícula " + getMatricula() + " se ha alquilado.");
    }

    @Override
    public String toString() {
        return "Coche Km0 -> " + super.toString();
    }
}

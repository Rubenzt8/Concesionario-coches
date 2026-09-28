public class CocheSegundaMano extends Coche implements Vendible {
    private String antiguoPropietario;

    public CocheSegundaMano(String matricula, String color, String modelo, double precio, int kilometros, String antiguoPropietario) {
        super(matricula, color, modelo, precio, kilometros);
        this.antiguoPropietario = antiguoPropietario;
    }

    public String getAntiguoPropietario() { return antiguoPropietario; }
    public void setAntiguoPropietario(String antiguoPropietario) { this.antiguoPropietario = antiguoPropietario; }

    @Override
    public void vender() {
        System.out.println("El coche de Segunda Mano con matrícula " + getMatricula() + " se ha vendido.");
    }

    @Override
    public String toString() {
        return "Coche Segunda Mano -> " + super.toString() + ", Antiguo Propietario: " + antiguoPropietario;
    }
}

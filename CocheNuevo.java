public class CocheNuevo extends Coche implements Vendible {
    private int garantiaMeses;

    public CocheNuevo(String matricula, String color, String modelo, double precio, int kilometros, int garantiaMeses) {
        super(matricula, color, modelo, precio, kilometros);
        this.garantiaMeses = garantiaMeses;
    }

    public int getGarantiaMeses() { return garantiaMeses; }
    public void setGarantiaMeses(int garantiaMeses) { this.garantiaMeses = garantiaMeses; }

    @Override
    public void vender() {
        System.out.println("El coche Nuevo con matrícula " + getMatricula() + " se ha vendido.");
    }

    @Override
    public String toString() {
        return "Coche Nuevo -> " + super.toString() + ", Garantía: " + garantiaMeses + " meses";
    }
}

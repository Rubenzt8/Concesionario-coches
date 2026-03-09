public abstract class Coche {
    private String matricula;
    private String color;
    private String modelo;
    private double precio;
    private int kilometros;

    protected static int numCochesStock = 0;

    public Coche(String matricula, String color, String modelo, double precio, int kilometros) {
        this.matricula = matricula;
        this.color = color;
        this.modelo = modelo;
        this.precio = precio;
        this.kilometros = kilometros;
        numCochesStock++;
    }

    // Getters y Setters
    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    public int getKilometros() { return kilometros; }
    public void setKilometros(int kilometros) { this.kilometros = kilometros; }

    public static int getNumCochesStock() { return numCochesStock; }

    @Override
    public String toString() {
        return "Matrícula: " + matricula + ", Color: " + color + ", Modelo: " + modelo +
                ", Precio: " + precio + "€, Kilómetros: " + kilometros;
    }
}

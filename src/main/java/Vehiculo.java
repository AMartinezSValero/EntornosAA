public class Vehiculo {

    private String modelo;
    private String matricula;
    private float precio;
    private String color;
    private int numeroPlazas;

    public Vehiculo(String modelo, String matricula, float precio, String color, int numeroPlazas) {
        this.modelo = modelo;
        this.matricula = matricula;
        this.precio = precio;
        this.color = color;
        this.numeroPlazas = numeroPlazas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehiculo vehiculo = (Vehiculo) o;
        return modelo.equals(vehiculo.modelo) && matricula.equals(vehiculo.matricula);
    }

    public String getModelo() {
        return modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public float getPrecio() {
        return precio;
    }

    public String getColor() {
        return color;
    }

    public int getNumeroPlazas() {
        return numeroPlazas;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumeroPlazas(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }
}
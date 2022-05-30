public class Parking {

    private int numeroPlazasAparcamiento;
    private String nombre;
    private String direccion;
    private float superficie;
    private String ciudad;

    public Parking(int numeroPlazasAparcamiento, String nombre, String direccion, float superficie, String ciudad) {
        this.numeroPlazasAparcamiento = numeroPlazasAparcamiento;
        this.nombre = nombre;
        this.direccion = direccion;
        this.superficie = superficie;
        this.ciudad = ciudad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parking parking = (Parking) o;
        return nombre.equals(parking.nombre) && direccion.equals(parking.direccion) && ciudad.equals(parking.ciudad);
    }

    public int getNumeroPlazasAparcamiento() {
        return numeroPlazasAparcamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public float getSuperficie() {
        return superficie;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setNumeroPlazasAparcamiento(int numeroPlazasAparcamiento) {
        this.numeroPlazasAparcamiento = numeroPlazasAparcamiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setSuperficie(float superficie) {
        this.superficie = superficie;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }




}
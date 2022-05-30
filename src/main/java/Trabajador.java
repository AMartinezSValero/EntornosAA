public class Trabajador {

    //Atributos
    private String nombre;
    private String apellido;
    private String dni;
    float sueldo;
    int edad;

    //Constructor

    public Trabajador(String nombre, String apellido, String dni, float sueldo, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.sueldo = sueldo;
        this.edad = edad;
    }
    // Método equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trabajador that = (Trabajador) o;
        return nombre.equals(that.nombre) && apellido.equals(that.apellido) && dni.equals(that.dni);
    }

    //Métodos

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public float getSueldo() {
        return sueldo;
    }

    public int getEdad() {
        return edad;
    }
}
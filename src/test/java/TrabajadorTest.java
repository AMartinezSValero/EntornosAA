import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrabajadorTest {

    public Trabajador trabajador;
    public String nombre = "Pepe";
    public String apellido = "Lopez";
    public String dni = "123456A";
    public float sueldo = 1000.00f;
    public int edad = 40;

    @Test
    public void nombreTrabajadorTest() {
        Trabajador trabajador = new Trabajador(nombre, apellido, dni, sueldo, edad);
        String nombreTrabajador = trabajador.getNombre();
        assertEquals("Pepe", nombreTrabajador);

    }

    @Test
    public void apellidoTrabajadorTest() {
        Trabajador trabajador = new Trabajador(nombre, apellido, dni, sueldo, edad);
        String apellidoTrabajador = trabajador.getApellido();
        assertEquals("Lopez", apellidoTrabajador);

    }
    @Test
    public void dniTrabajadorTest() {
        Trabajador trabajador = new Trabajador(nombre, apellido, dni, sueldo, edad);
        String dniTrabajador = trabajador.getDni();
        assertEquals("123456A", dniTrabajador);

    }
    @Test
    public void sueldoTrabajadorTest() {
        Trabajador trabajador = new Trabajador(nombre, apellido, dni, sueldo, edad);
        float sueldoTrabajador = trabajador.getSueldo();
        assertEquals(1000.00f, sueldoTrabajador);

    }
    @Test
    public void edadTrabajadorTest() {
        Trabajador trabajador = new Trabajador(nombre, apellido, dni, sueldo, edad);
        int edadTrabajador = trabajador.getEdad();
        assertEquals(40, edadTrabajador);

    }
}


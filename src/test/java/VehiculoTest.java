import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VehiculoTest {

    private String modelo = "Lamborghini Aventador";
    private String matricula = "1111BBB";
    private float precio = 80000.00f;
    private String color = "Negro";
    private int numeroPlazas = 2;

    @Test
    public void modeloTest() {
        Vehiculo vehiculo = new Vehiculo(modelo, matricula, precio, color, numeroPlazas);
        String modeloVehiculo = vehiculo.getModelo();
        assertEquals("Lamborghini Aventador", modeloVehiculo);

    }

    @Test
    public void matriculaTest() {
        Vehiculo vehiculo = new Vehiculo(modelo, matricula, precio, color, numeroPlazas);
        String matriculaVehiculo = vehiculo.getMatricula();
        assertEquals("1111BBB", matriculaVehiculo);

    }
    @Test
    public void colorTest() {
        Vehiculo vehiculo = new Vehiculo(modelo, matricula, precio, color, numeroPlazas);
        String colorVehiculo = vehiculo.getColor();
        assertEquals("Negro", colorVehiculo);

    }
    @Test
    public void numeroPlazasTest() {
        Vehiculo vehiculo = new Vehiculo(modelo, matricula, precio, color, numeroPlazas);
        int numeroPlazasVehiculo = vehiculo.getNumeroPlazas();
        assertEquals(2, numeroPlazasVehiculo);

    }
    @Test
    public void precioTest() {
        Vehiculo vehiculo = new Vehiculo(modelo, matricula, precio, color, numeroPlazas);
        float precioVehiculo = vehiculo.getPrecio();
        assertEquals(80000.00f, precioVehiculo);

    }
}

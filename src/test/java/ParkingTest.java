import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParkingTest {

    private int numeroPlazasAparcamiento = 50;
    private String nombre = "Parking de Lujo";
    private String direccion = "Calle Mayor, nº3 , Bajo A";
    private float superficie = 1000.00f;
    private String ciudad = "Roma";

    @Test
    public void nombreTest() {
        Parking parking = new Parking(numeroPlazasAparcamiento, nombre, direccion, superficie, ciudad);
        String nombreParking = parking.getNombre();
        assertEquals("Parking de Lujo", nombreParking);

    }

    @Test
    public void direccionTest() {
        Parking parking = new Parking(numeroPlazasAparcamiento, nombre, direccion, superficie, ciudad);
        String direccionParking = parking.getDireccion();
        assertEquals("Calle Mayor, nº3 , Bajo A", direccionParking);

    }
    @Test
    public void ciudadTest() {
        Parking parking = new Parking(numeroPlazasAparcamiento, nombre, direccion, superficie, ciudad);
        String ciudadParking = parking.getCiudad();
        assertEquals("Roma", ciudadParking);

    }
    @Test
    public void superficieTest() {
        Parking parking = new Parking(numeroPlazasAparcamiento, nombre, direccion, superficie, ciudad);
        float superficieParking = parking.getSuperficie();
        assertEquals(1000.00f, superficieParking);

    }
    @Test
    public void numeroPlazasAparcamientoTest() {
        Parking parking = new Parking(numeroPlazasAparcamiento, nombre, direccion, superficie, ciudad);
        int numeroPlazasAparcamiento = parking.getNumeroPlazasAparcamiento();
        assertEquals(50, numeroPlazasAparcamiento);

    }
}


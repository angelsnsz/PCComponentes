package dominio;

public class Almacenamiento {
    private String Marca;
    private String Capacidad;
    private String Conexion;

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(String capacidad) {
        Capacidad = capacidad;
    }

    public String getConexion() {
        return Conexion;
    }

    public void setConexion(String conexion) {
        Conexion = conexion;
    }
}

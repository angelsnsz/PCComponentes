package dominio;

public class FuenteAlimentacion {
    private String Marca;
    private String Certificacion;
    private String Voltaje;

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getCertificacion() {
        return Certificacion;
    }

    public void setCertificacion(String certificacion) {
        Certificacion = certificacion;
    }

    public String getVoltaje() {
        return Voltaje;
    }

    public void setVoltaje(String voltaje) {
        Voltaje = voltaje;
    }
}

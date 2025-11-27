import dominio.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Me creo un procesador en blanco
        CPU cpu = new CPU();

        //Asigno los valores
        cpu.setTipo("AMD");
        cpu.setGeneracion("7");
        cpu.setNucleo("i7");
        cpu.setMemCache("2Mb");
        cpu.setVelocidad("3.6Ghz");

        CPU cpu2= new CPU();
        cpu2.setTipo("Intel");
        System.out.println(cpu2.getTipo());
        //Visualizo los valores en
        System.out.println(cpu.getTipo());
        System.out.println(cpu.getGeneracion());
        System.out.println(cpu.getNucleo());
        System.out.println(cpu.getMemCache());
        System.out.println(cpu.getVelocidad());

        //Me creo una memoria en blanco
        Memoria memoria=new Memoria();

        //Asigno los valores
        memoria.setTipo("DDR5");
        memoria.setCapacidad("16GB");
        memoria.setVelocidad("6400MHz");

        //Imprimo los valores
        System.out.println(memoria.getTipo());
        System.out.println(memoria.getCapacidad());
        System.out.println(memoria.getVelocidad());

        //Me creo una placa base en blanco
        PlacaBase placaBase=new PlacaBase();

        //Asigno los valores
        placaBase.setSocket("LGA");
        placaBase.setPci("Pci x4");
        placaBase.setMarca("MSI");
        placaBase.setFactorForma("ATX");

        //Imprimo los valores
        System.out.println(placaBase.getSocket());
        System.out.println(placaBase.getPci());
        System.out.println(placaBase.getMarca());
        System.out.println(placaBase.getFactorForma());

        //Me creo un almacenamiento en blanco
        Almacenamiento almacenamiento=new Almacenamiento();

        //Asigno los valores
        almacenamiento.setMarca("Kingston");
        almacenamiento.setCapacidad("1 TB");
        almacenamiento.setConexion("SATA");

        //Imprimo los valores
        System.out.println(almacenamiento.getMarca());
        System.out.println(almacenamiento.getCapacidad());
        System.out.println(almacenamiento.getConexion());

        //Me creo una Fuente de alimentacion en blanco
        FuenteAlimentacion fuenteAlimentacion=new FuenteAlimentacion();

        //Asigno los valores
        fuenteAlimentacion.setMarca("Corsair");
        fuenteAlimentacion.setCertificacion("80 Gold");
        fuenteAlimentacion.setVoltaje("650 W");

        //Imprimo los valores
        System.out.println(fuenteAlimentacion.getMarca());
        System.out.println(fuenteAlimentacion.getCertificacion());
        System.out.println(fuenteAlimentacion.getVoltaje());
    }
}
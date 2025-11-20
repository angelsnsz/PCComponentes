import dominio.CPU;

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
        //Visualizo los valoresen
        System.out.println(cpu.getTipo());
        System.out.println(cpu.getGeneracion());
        System.out.println(cpu.getNucleo());
        System.out.println(cpu.getMemCache());
        System.out.println(cpu.getVelocidad());
    }
}
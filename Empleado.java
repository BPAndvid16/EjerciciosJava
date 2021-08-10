import java.util.Scanner;

public class Empleado {
    private int id;
    public String nombre;
    public String apellido;
    public int comision;
    public int horasExtra;
    public double salario;
    public static double nomina = 0.0;

    public Empleado(String nombre, String apellido, int comision, int horasExtra, int salario) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.comision = comision;
        this.horasExtra = horasExtra;
        this.salario = salario;

    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre= nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public int getComision(){
        return comision;
    }

    public void setComision(int comision){
        this.comision = comision;
    }

    public int getHorasextra(){
        return horasExtra;
    }

    public void setHorasextra(int horasExtra){
        this.horasExtra = horasExtra;
    }

    public int getSalario(){
        return horasExtra;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public static double calcularMiNomina(Empleado empleado){
        
        nomina = empleado.getComision() + empleado.getHorasextra() + empleado.salario;
        double total = nomina - 2 * (nomina * 0.04);
        System.out.print("Nomina " + total);
        return total;
    }

    

    public static void main(String[] args) {

        Scanner usuario = new Scanner(System.in);
        String id = usuario.nextLine();
        String nombre = usuario.nextLine();
        String apellido = usuario.nextLine();
        String comision = usuario.nextLine();
        String horasExtra = usuario.nextLine();

        Empleado.nomina = calcularMiNomina(null);

        usuario.close();

        
    }

    
}

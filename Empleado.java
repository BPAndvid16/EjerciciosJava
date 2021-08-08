import java.util.Scanner;

public class Empleado {
    private int id;
    private final String nombre;
    private final String apellido;
    private final int comision;
    private final int horasExtra;
    private final double salario;

    public Empleado(String nombre, String apellido, int comision, int horasExtra, int salario){

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
            this.nombre = nombre;
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
        
        nomina = 0.0;

    }

    public static double calcularMiNomina(Empleado empleado){
        
        nomina = empleado.getComision() + empleado.getHorasextra() + salario;
        total = nomina - 2 * (nomina * 0.04);
        System.out.print("Nomina " + total);
        return total;
    }

    

    public static void public static void main(String[] args) {

        Scanner usuario = new Scanner(System.in);
        int id = Empleado.setId(usuario).nextLine();
        String nombre = Empleado.setNombre(usuario).nextLine();
        String apellido = Empleado.setApellido(usuario).nextLine();
        int comision = Empleado.setComision(usuario).nextLine();
        int horasExtra = Empleado.setHorasextra(usuario).nextLine();

        Empleado.nomina = calcularMiNomina()


        
    }

    
}


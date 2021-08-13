import java.util.ArrayList;
import java.util.Scanner;

public class Empleado {
    private int id;
    private final String nombre;
    private final String apellido;
    private static ArrayList<Auto> autos = new ArrayList<>();
    
    private final int salario;
    static double nomina = 0.0;

    
    

    public Empleado(String nombre, String apellido,int salario) {

        this.nombre = nombre;
        this.apellido = apellido;
        
        this.salario = salario;
        

        

    }

    public static double calcularMiNomina(Empleado empleado, Auto auto){
        
        nomina = empleado.salario + Auto.Bono(auto);
        double total = nomina - 2 * (nomina * 0.04);
        
        
        
        return total;
    }

    

    public static void main(String[] args) {

        Scanner usuario = new Scanner(System.in);

        System.out.println("Id");
        int id = usuario.nextInt();

        System.out.println("Nombre");
        String nombre = usuario.nextLine();

        System.out.println("Apellido");
        String apellido = usuario.nextLine();


        System.out.println("Digite la marca: ");

        String marca = usuario.nextLine();

       
        int salario = 1875000;

        
        


        Empleado Liquidacion = new Empleado(nombre, apellido,salario);
        Auto carac = new Auto(marca, 1);
        
        System.out.println("El salario de " + Liquidacion.nombre + Liquidacion.apellido +  " es " + calcularMiNomina(Liquidacion,carac));
        usuario.close();

        System.out.println(autos);

        
    }

    

    
}

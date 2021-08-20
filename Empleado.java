import java.util.ArrayList;
import java.util.Scanner;

public class Empleado {
    private int id;
    private final String nombre;
    private final String apellido;
    private static ArrayList<Auto> autos = new ArrayList<>();
    private static  int salario ;
    
    static double nomina = 0.0;

    
    

    public Empleado(String nombre, String apellido,int salario) {

        this.nombre = nombre;
        this.apellido = apellido;
        
        this.salario = salario;
        
       
        
    }

    public void setAutos(ArrayList<Auto> autos)
    {
        this.autos = autos;

    }

    


    public static double calcularMiNomina(Empleado empleado){

        int saldoAutos = 0;
        salario = 1875000;
        empleado.setAutos(autos);
        

        for (int i = 0; i < autos.size(); i++) {

            saldoAutos += Auto.Bono(autos.get(i));
            System.out.println(Auto.Bono(autos.get(i)));

          }
        
        nomina = empleado.salario + saldoAutos;
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


        Boolean autoSelect = true;
       

        while(autoSelect){

        System.out.println("Digite la marca: ");

        String marca = usuario.nextLine();

        System.out.println("Seleccione el tipo de auto: ");
        System.out.println("1. Deportivo o camioneta ");
        System.out.println("2. Auto eléctrico ");
        System.out.println("3. Auto tradicional");

        int tipoAuto = usuario.nextInt();

        Auto userAutos = new Auto(marca, tipoAuto);
        autos.add(userAutos); 
        
        

        System.out.println("¿Ha adquirido otro vehiculo?");
        System.out.println("1. Si");
        System.out.println("2. No");

        int autoBucle = usuario.nextInt();
        if (autoBucle == 1){

            autoSelect = true;
        } else {

           autoSelect = false;
        }
    

        }
           
           
           Empleado Liquidacion = new Empleado(nombre, apellido,salario);
           System.out.print("El salario de " + Liquidacion.nombre + Liquidacion.apellido + " es de " + calcularMiNomina(Liquidacion) );
           autoSelect = false;
           usuario.close();

        

        
    }

    

    
}

import java.text.ParseException;
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
        
        
        
        
        return nomina;
    }

    

    

    public static void main(String[] args) throws ParseException {

        

        Scanner usuario = new Scanner(System.in);

        System.out.println("Id");
        int id = usuario.nextInt();

        System.out.println("Nombre");
        String nombre = usuario.nextLine();

        System.out.println("Apellido");
        String apellido = usuario.nextLine();

        System.out.println("Ingrese el año de inicio: ");
        int anioInicio = usuario.nextInt();

        System.out.println("Ingrese el mes de inicio: ");
        int mesInicio = usuario.nextInt();

        System.out.println("Ingrese el dia de inicio: ");
        int diaInicio = usuario.nextInt();

        System.out.println("Ingrese el año final: ");
        int anioFinal = usuario.nextInt();

        System.out.println("Ingrese el mes final: ");
        int mesFinal = usuario.nextInt();

        System.out.println("Ingrese el dia final: ");
        int diaFinal = usuario.nextInt();


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

           System.out.print(Concesionario.calcularPagos(Liquidacion, Integer.toString(anioInicio) +"-"+ Integer.toString(mesInicio) +"-"+ Integer.toString(diaInicio), Integer.toString(anioFinal) + "-" + Integer.toString(mesFinal) + "-" + Integer.toString(diaFinal)));
           System.out.print(Concesionario.calcularDeducciones(Liquidacion, Integer.toString(anioInicio) +"-"+ Integer.toString(mesInicio) +"-"+ Integer.toString(diaInicio), Integer.toString(anioFinal) + "-" + Integer.toString(mesFinal) + "-" + Integer.toString(diaFinal)));
           System.out.print("El salario de " + Liquidacion.nombre + Liquidacion.apellido + " es de " + calcularMiNomina(Liquidacion) );
           autoSelect = false;
           usuario.close();

        

        
    }

    

    
}

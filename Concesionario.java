import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;

class Concesionario {
    private ArrayList<Auto> autos = new ArrayList<>();
    private ArrayList<Empleado> empleados = new ArrayList<>();



    public static double calcularPagos(Empleado empleado, String ingreso, String retiro){

        double nomina = Empleado.calcularMiNomina(empleado);


        return 0;

    }

    public static double calcularDeducciones(Empleado empleado, String ingreso, String retiro) {

        double nomina = Empleado.calcularMiNomina(empleado);
        
        

        double total = nomina - 2 * (nomina * 0.04);
      //  System.out.println(fechaInicial);
        //System.out.println(fechaFinal);
        return 0;
    }

}
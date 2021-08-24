
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

class Concesionario {
    private ArrayList<Auto> autos = new ArrayList<>();
    private ArrayList<Empleado> empleados = new ArrayList<>();



    public static double calcularPagos(Empleado empleado, String ingreso, String retiro) {

        Calendar inicio = new GregorianCalendar();
        Calendar fin = new GregorianCalendar();
        double nomina = Empleado.calcularMiNomina(empleado);
        int salario = 1875000;
        try {
            inicio.setTime(new SimpleDateFormat("yyyy-MM-dd").parse(ingreso));
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            fin.setTime(new SimpleDateFormat("yyyy-MM-dd").parse(retiro));
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        int difA = fin.get(Calendar.YEAR) - inicio.get(Calendar.YEAR);
        int difM = difA * 12 + fin.get(Calendar.MONTH) - inicio.get(Calendar.MONTH);
        
        double nominaNormal = salario * difM ;
        double nominaBonos = nomina - salario;

        double total = nominaNormal + nominaBonos;

        return total;

    }

    public static double calcularDeducciones(Empleado empleado, String ingreso, String retiro)  {

        double nomina = Empleado.calcularMiNomina(empleado);
        Calendar inicio = new GregorianCalendar();
        Calendar fin = new GregorianCalendar();
        int salario = 1875000;
        try {
            inicio.setTime(new SimpleDateFormat("yyyy-MM-dd").parse(ingreso));
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            fin.setTime(new SimpleDateFormat("yyyy-MM-dd").parse(retiro));
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        int difA = fin.get(Calendar.YEAR) - inicio.get(Calendar.YEAR);
        int difM = difA * 12 + fin.get(Calendar.MONTH) - inicio.get(Calendar.MONTH);

        

        double deducciones =  2 * (salario * 0.04) * difM ;
        double deduccionesAutos = 2 * ((nomina-salario) * 0.04);
       

        double total =  deducciones + deduccionesAutos;
        
        System.out.println(ingreso);
        System.out.println(retiro);
      
        return total;
    }

    
}
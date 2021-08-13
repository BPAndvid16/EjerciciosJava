
public class Auto {

    private String marca;
    private int tipo;

    
    public Auto (String marca, int tipo){
        this.marca = marca;
        this.tipo = tipo;
    }

    
     
    public static double Bono (Auto auto){
        double ganancia = 0;
        switch(auto.tipo)
        {
            case 1:
                ganancia += 750000;
                
            case 2:
                ganancia += 500000;
                
            case 3:
                ganancia += 350000;
                

        }
        
        return ganancia;
    }
    
}


public class Auto {

    private String marca;
    private int tipo;

    
    public Auto (String marca, int tipo){
        this.marca = marca;
        this.tipo = tipo;
        
    }

    
     
    public static double Bono (Auto auto){
        int ganancia = 0;
        int caso =  auto.tipo;


        switch(caso)
        {
            case 1:
                ganancia = 750000;
                break;
                
            case 2:
                ganancia = 500000;
                break;
                
            case 3:
                ganancia = 350000;
                break;
                

        }

       
        
        return ganancia;
    }
    
}

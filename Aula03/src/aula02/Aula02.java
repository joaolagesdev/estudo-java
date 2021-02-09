package aula02;

public class Aula02 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        
        // public
        c1.modelo = "BIC Cristal";
        c1.cor = "Azul";
        
        // private
        // c1.ponta = 0.5f;
        
        // protected
        c1.carga = 80;
        
        c1.destampar();
        c1.status();
        c1.rabiscar();
    }
    
}

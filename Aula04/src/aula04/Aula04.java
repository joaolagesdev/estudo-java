package aula04;

public class Aula04 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta("Modelo A", 0.7f, "Vermelha");
        c1.status();
        
        Caneta c2 = new Caneta ("Modelo B", 1.0f, "Azul");
        c2.setTampada(false);
        c2.status();
    }
}

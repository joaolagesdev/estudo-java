package aula07;
public class Aula07 {
    public static void main(String[] args) {
      Lutador lista[] = new Lutador[6];
      
      lista[0] = new Lutador("Pretty Boy", "França", 1.75f, 68.9f, 31, 11, 2, 1);
      lista[1] = new Lutador("Putscript", "Brasil", 1.68f, 57.8f, 29, 14, 2, 3);
      lista[2] = new Lutador("Snapshadow", "EUA", 1.65f, 80.9f, 35, 12, 2, 1);
      lista[3] = new Lutador("Dead Code", "Austrália", 1.93f, 81.6f, 28, 13, 0, 2);
      lista[4] = new Lutador("UFOCobol", "Brasil", 1.70f, 119.3f, 37, 5, 4, 3);
      lista[5] = new Lutador("Nerdaart", "EUA", 1.81f, 105.7f, 30, 12, 2, 4);
      
      lista[3].ganharLuta();
      lista[3].perderLuta();
      lista[3].status();
    }
    
}

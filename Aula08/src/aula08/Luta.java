package aula08;

import java.util.Random;

public class Luta {
    // Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    // Métodos públicos
    public void marcarLuta(Lutador l1, Lutador l2 ){
        if(l1.getCategoria().equals(l2.getCategoria())
            && l1 != l2) {
            this.aprovada=true;
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        } else {
            this.aprovada=false;
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }
    
    public void lutar() {
        if (aprovada) {
            System.out.println("### DESAFIADO ### ");
            this.desafiado.apresentar();
            System.out.println("-----------------------------------------------------------");
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            System.out.println("-----------------------------------------------------------");
            switch(vencedor) {
                case 0:
                    System.out.println("Empatou!");
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println("Vitória do " + this.desafiado.getNome());
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println("Vitória do " + this.desafiante.getNome());
                    desafiado.perderLuta();
                    desafiante.ganharLuta();
                    break;
            }
        } else {
            System.out.println("A luta não pode acontecer");
        }
        System.out.println("-----------------------------------------------------------");
    }
    
    // Métodos Especiais
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    
    
}

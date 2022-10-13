package luta;

import java.util.Random;

public class Luta {
    //ATRIBUTOS
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

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

    public void setRounds(int ro) {

        this.rounds = ro;
    }

    public boolean getAprovada() {

        return aprovada;
    }

    public void setAprovada(boolean ap) {

        this.aprovada = ap;
    }

    //MÉTODOS ESPECIAIS
    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }

    }
    public void lutar() {
        if (this.aprovada) {
            System.out.println("#####Desafiado#####");
            this.desafiado.apresentar();
            System.out.println("#####Desafiante#####");
            this.desafiante.apresentar();

            Random resultado = new Random();

            int gerar = resultado.nextInt(3);

            switch (gerar) {
                case 0:
                    System.out.println("Empatou!!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println("");
                    System.out.println("###Resultado###");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    System.out.println("O desafiado " + this.desafiado.getNome() + " Venceu a luta e agora possui um total de " + this.desafiado.getVitorias() + " vitórias, " + this.desafiado.getDerrotas() + " derrotas e " + this.desafiado.getEmpates() + " empates");
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("###Resultado###");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    System.out.println("O desafiante " + this.desafiante.getNome() + " Venceu a luta e agora possui um total de " + this.desafiante.getVitorias() + " vitórias, " + this.desafiante.getDerrotas() + " derrotas e " + this.desafiante.getEmpates() + " empates");
                    break;
            }


        } else {
            System.out.println("Luta não pode acontecer.");
        }


    }


}

package luta;

public class Lutador {
    //Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    //metodos
    public Lutador (String no, String na, int id, float al, float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String no) {
        this.nome = no;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String na) {
        this.nacionalidade = na;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int id) {
        this.idade = id;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float al) {
        this.altura = al;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float pe) {
        this.peso = pe;
        setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {

        if (this.getPeso() < 52.2) {
            this.categoria ="Inválido";
        } else if (this.getPeso() <= 70.3) {
            this.categoria = "Peso Leve";
        } else if (this.getPeso() <= 83.9) {
            this.categoria = "Peso Médio";
        } else if (this.getPeso() <= 120.2) {
            this.categoria = "Peso Pesado";
        } else  {
            this.categoria = "Categoria inválida.";
        }
    }
    //metodos especiais
    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public void apresentar() {
        System.out.println("luta.Lutador: " + this.getNome());
        System.out.println("Origem: " + this.getNacionalidade());
        System.out.println(this.getIdade() + " anos de idade");
        System.out.println("Com " + this.getAltura() + " de altura");
        System.out.println("Na categoria " + this.getCategoria() +", pesando " + this.getPeso() + " quilos");
        if (this.getDerrotas() == 0 && this.getEmpates() == 0){
            System.out.println("invícto com um Total de " + this.getVitorias() + " vitórias");
        }else {
            System.out.println("Total de " + this.getVitorias() + " vitórias");
            System.out.println("Total de " + this.getDerrotas() + " derrotas");
            System.out.println("E " + this.getEmpates() + " empates");
        }
    }

    public void status() {
        System.out.println(this.getNome());
        System.out.println(this.getNacionalidade());
        System.out.println(this.getIdade() + " anos");
        System.out.println(this.getAltura());
        System.out.println(this.getCategoria());
        System.out.println(this.getVitorias() + " vitórias");
        System.out.println(this.getDerrotas() + " Derrotas");
        System.out.println(this.getEmpates() + " empates");
        System.out.println("--------------------------------");

    }

    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);

    }

    public void perderLuta() {

        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);

    }
}

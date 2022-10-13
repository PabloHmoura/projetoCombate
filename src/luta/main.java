package luta;

public class main {
    public static void main(String[] args) {
        Lutador l [] =  new Lutador[6];

        l[0] = new Lutador("Preety Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1 );

        l[1] = new Lutador ("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);


        Luta luta1 = new Luta();
        luta1.marcarLuta(l[0] , l[1]);
        luta1.lutar();
        l[0].status();
        l[1].status();



    }
}

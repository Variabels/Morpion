public class SimulateurDePuissance4 {

    public static void main(String[] args)
    {

        //JAPuissance4 j1 = new JAPuissance4(1);
        //JAPuissance4 j2 = new JAPuissance4(2);
        JHPuissance4 j1 = new JHPuissance4(1);
        JHPuissance4 j2 = new JHPuissance4(2);
        JeuDePuissance4 jeu = new JeuDePuissance4(j1, j2);
        jeu.jouerPartie();



    }
}
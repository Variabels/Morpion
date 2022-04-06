public class SimulateurDeMorpion {

    public static void main(String[] args)
    {
        /*Tool t = new Tool();
        Plateau jeu = new Plateau(3, 3);

        jeu.initialiser();
        System.out.println(jeu.toString());

        Coup c = new Coup(2,2);
        jeu.appliquerCoup(c,1);
        System.out.println(jeu.toString());

        JoueurAleatoire j = new JoueurAleatoire(2);
        Coup c1 = j.getCoup(jeu);
        jeu.appliquerCoup(c1, 2);
        System.out.println(jeu.toString());*/

        //JoueurHumain j1 = new JoueurHumain(1);
        //JoueurHumain j2 = new JoueurHumain(2);

        JHMorpion j1 = new JHMorpion(1);
        JHMorpion j2 = new JHMorpion(2);
        JeuDeMorpion jeu = new JeuDeMorpion(j1, j2);
        jeu.jouerPartie();



    }
}

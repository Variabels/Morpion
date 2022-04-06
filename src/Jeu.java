public abstract class Jeu {
    public Plateau plateau;
    public Joueur joueurs[];
    protected int joueurCourrant;

    public Jeu(Joueur Joueur1, Joueur Joueur2, Plateau p)
    {
        joueurCourrant = 0;
        plateau = p;
        joueurs = new Joueur[2];
        joueurs[0] = Joueur1;
        joueurs[1] = Joueur2;
        plateau.initialiser();
    }

    public abstract boolean partieTerminee();

    protected Joueur joueurSuivant()
    {
        if(joueurCourrant == 0)
        {
            joueurCourrant = 1;
            return joueurs[0];
        }
        else
        {
            joueurCourrant = 0;
            return joueurs[1];
        }
    }

    public boolean coupPossible(Coup coup)
    {
        if(plateau.etatIdPlateau[coup.x][coup.y] == 0)
            return true;
        else
            return false;
    }

    public Joueur jouerPartie()
    {
        Joueur retour = null;
        while(!partieTerminee())
        {
            retour = joueurSuivant();
            Coup c = retour.getCoup(plateau);
            if(coupPossible(c))
                plateau.appliquerCoup(c, retour.getId());
            else
            {
                System.err.println("Erreur :(");
                System.exit(1);
            }
            System.out.println(plateau.toString());
        }
        return retour;
    }
}

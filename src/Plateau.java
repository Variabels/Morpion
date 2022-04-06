public abstract class Plateau {

    public int longueur, largeur;
    public int[][] etatIdPlateau;

    public Plateau(int _longueur, int _largeur)
    {
        this.longueur = _longueur;
        this.largeur = _largeur;
    }

    public void initialiser()
    {
        this.etatIdPlateau = new int[longueur][largeur];
        for(int i=0; i<longueur; i++)
        {
            for(int j=0; j<largeur; j++)
            {
                this.etatIdPlateau[i][j] = 0;
            }
        }
    }

    public void appliquerCoup(Coup coup, int id)
    {
        etatIdPlateau[coup.x][coup.y] = id;
    }

    @Override
    public String toString()
    {
        String jeu = " ";
        for(int i=0; i<longueur; i++)
        {
            for(int j=0; j<largeur; j++)
            {
                jeu = jeu + etatIdPlateau[i][j] + " ";
            }
            jeu = jeu + "\n ";
        }
        return jeu;
    }
}

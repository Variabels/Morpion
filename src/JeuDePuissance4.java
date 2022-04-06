public class JeuDePuissance4 extends Jeu{

    public JeuDePuissance4(Joueur j1, Joueur j2)
    {
        super(j1, j2, new PlateauPuissance4());
    }

    @Override
    public boolean partieTerminee()
    {
        for(int i=0; i<plateau.largeur; i++)
        {
            for (int j=0; i< plateau.longueur; i++)
            {
                if(plateau.etatIdPlateau[i][j] != 0)
                {
                    if((j< 4)
                            &&(plateau.etatIdPlateau[i][j+1] == plateau.etatIdPlateau[i][j])
                        && (plateau.etatIdPlateau[i][j+2] == plateau.etatIdPlateau[i][j])
                        && (plateau.etatIdPlateau[i][j+3] == plateau.etatIdPlateau[i][j]))
                        return true;
                }
            }
        }

        for(int i=0; i< plateau.longueur; i++)
        {
            for(int j=0; j< plateau.largeur; j++)
            {
                if(plateau.etatIdPlateau[i][j] == 0)
                    return false;
            }
        }
        System.out.println("partie terminee");
        return true;
    }
}

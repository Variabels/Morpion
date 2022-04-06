public class JeuDeMorpion extends Jeu{

    /*public Plateau plateau;
    public Joueur joueurs[];
    private int joueurCourrant;*/

    public JeuDeMorpion(Joueur Joueur1, Joueur Joueur2)
    {
        super(Joueur1, Joueur2, new PlateauMorpion());
    }

    @Override
    public boolean partieTerminee()
    {
        //horizontal
        if((plateau.etatIdPlateau[0][0] == plateau.etatIdPlateau[0][1])
        && (plateau.etatIdPlateau[0][0] == plateau.etatIdPlateau[0][2])
        && plateau.etatIdPlateau[0][0] != 0)
            return true;
        if((plateau.etatIdPlateau[1][0] == plateau.etatIdPlateau[1][1])
                && (plateau.etatIdPlateau[1][0] == plateau.etatIdPlateau[1][2])
                && plateau.etatIdPlateau[1][0] != 0)
            return true;
        if((plateau.etatIdPlateau[2][0] == plateau.etatIdPlateau[2][1])
                && (plateau.etatIdPlateau[2][0] == plateau.etatIdPlateau[2][2])
                && plateau.etatIdPlateau[2][0] != 0)
            return true;

        //vertical
        if((plateau.etatIdPlateau[0][0] == plateau.etatIdPlateau[1][0])
                && (plateau.etatIdPlateau[0][0] == plateau.etatIdPlateau[2][0])
                && plateau.etatIdPlateau[0][0] != 0)
            return true;
        if((plateau.etatIdPlateau[0][1] == plateau.etatIdPlateau[1][1])
                && (plateau.etatIdPlateau[0][1] == plateau.etatIdPlateau[2][1])
                && plateau.etatIdPlateau[0][1] != 0)
            return true;
        if((plateau.etatIdPlateau[0][2] == plateau.etatIdPlateau[1][2])
                && (plateau.etatIdPlateau[0][2] == plateau.etatIdPlateau[2][2])
                && plateau.etatIdPlateau[0][2] != 0)
            return true;

        if((plateau.etatIdPlateau[0][0] == plateau.etatIdPlateau[1][1])
                && (plateau.etatIdPlateau[0][0] == plateau.etatIdPlateau[2][2])
                && plateau.etatIdPlateau[0][0] != 0)
            return true;

        //diagonal
        if((plateau.etatIdPlateau[0][2] == plateau.etatIdPlateau[1][1])
                && (plateau.etatIdPlateau[0][2] == plateau.etatIdPlateau[2][0])
                && plateau.etatIdPlateau[0][2] != 0)
            return true;

        for(int i=0; i< plateau.largeur; i++)
        {
            for(int j=0; j< plateau.longueur; j++)
            {
                if(plateau.etatIdPlateau[i][j] == 0)
                    return false;
            }
        }
        System.out.println("partie terminee");
        return true;
    }


}

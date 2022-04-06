public class JAMorpion extends JoueurAleatoire{

    public JAMorpion(int _id)
    {
        super(_id);
    }

    @Override
    public Coup getCoup(Plateau _etatJeu) {
        Tool t = new Tool();
        int i, j;
        do {
            i = t.monRandom(0,_etatJeu.largeur-1);
            j = t.monRandom(0,_etatJeu.longueur-1);
        }
        while(_etatJeu.etatIdPlateau[i][j] != 0);
        return new CoupMorpion(i,j);
    }
}

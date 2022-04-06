public class JAPuissance4 extends JoueurAleatoire{

    public JAPuissance4(int _id)
    {
        super(_id);
    }

    @Override
    public Coup getCoup(Plateau _etatJeu) {
        Tool t = new Tool();
        int i, j;
        do {
            i = t.monRandom(0,_etatJeu.longueur-1);
            j = t.monRandom(0,_etatJeu.largeur-1);
        }
        while(_etatJeu.etatIdPlateau[i][j] != 0);
        return new CoupPuissance4(i,j);
    }
}

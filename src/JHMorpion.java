import java.util.Scanner;

public class JHMorpion extends JoueurHumain{

    public JHMorpion(int _id)
    {
        super(_id);
    }

    @Override
    public Coup getCoup(Plateau _etatJeu) {
        int i, j;
        do {
            Scanner s = new Scanner(System.in);
            System.out.println("Entrer ligne:");
            i = s.nextInt();
            System.out.println("Entrer colonne:");
            j = s.nextInt();
        }while((_etatJeu.longueur < i && _etatJeu.largeur < j) && _etatJeu.etatIdPlateau[i][j] != 0);
        return new CoupMorpion(i, j);
    }
}

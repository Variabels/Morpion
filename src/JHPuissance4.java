import java.util.Scanner;

public class JHPuissance4 extends JoueurHumain{

    public JHPuissance4(int _id)
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
        return new CoupPuissance4(i, j);
    }
}

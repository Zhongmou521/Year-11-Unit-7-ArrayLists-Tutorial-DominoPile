import java.util.ArrayList;
import java.util.Random;

public class DominoPile {
    private ArrayList<Domino> pile;

    public DominoPile()
    {
        pile = new ArrayList<Domino>();
    }

    public void newStack6()
    {
        for (int i = 0; i <= 6; i++)
        {
            for (int j = i; j <= 6; j++)
            {
                pile.add(new Domino(i,j));
            }
        }
    }

    public void shuffle()
    {
        Random rand = new Random();
        int upperbound;
        int length = pile.size();
        ArrayList<Domino> newPile = new ArrayList();
        int randomIndex;

        while(pile.size() != 0)
        {
            upperbound = pile.size();
            randomIndex = rand.nextInt(upperbound);
            newPile.add(pile.get(randomIndex));
            pile.remove(randomIndex);

        }
        pile = newPile;

    }
    public ArrayList<Domino> getPile()
    {
        return pile;
    }



}
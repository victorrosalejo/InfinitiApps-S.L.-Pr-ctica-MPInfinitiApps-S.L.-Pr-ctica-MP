
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class Ranking {
    public List<Character> Ranking(List<Character> characters){
        if(characters.size()>1) {
            quickSort(characters, 0, characters.size() - 1);
        }
        return characters;
    }

    public static void quickSort(List<Character> characters, int izq, int der) {

        int pivote=characters.get(izq).getWins();
        int i=izq +1;
        int j=der;
        Character aux;

        while(i < j){
            while(characters.get(i).getWins() <= pivote && i < j) i++;
            while(characters.get(j).getWins() > pivote) j--;
            if (i < j) {
                aux= characters.get(i);
                characters.add(i, characters.get(j));
                characters.add(j,aux);
            }
        }
        aux = characters.remove(izq);
        characters.add(izq, characters.remove(j-1));
        characters.add(j,aux);

        if(izq < j-1)
            quickSort(characters,izq,j-1);
        if(j+1 < der)
            quickSort(characters,j+1,der);

    }

}

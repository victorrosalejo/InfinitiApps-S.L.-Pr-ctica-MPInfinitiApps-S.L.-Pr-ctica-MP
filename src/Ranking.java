import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class Ranking implements Comparator<Character> {
    public List<Character> Ranking(List<Character> characters){
        Comparator<Character> charWin = Comparator.comparingInt(Character::getWins);
        characters.sort(charWin);
        return characters;
    }

    @Override
    public int compare(Character o1, Character o2) {
        return 0;
    }

    @Override
    public Comparator<Character> reversed() {
        return Comparator.super.reversed();
    }

    @Override
    public Comparator<Character> thenComparing(Comparator<? super Character> other) {
        return Comparator.super.thenComparing(other);
    }

    @Override
    public <U> Comparator<Character> thenComparing(Function<? super Character, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
        return Comparator.super.thenComparing(keyExtractor, keyComparator);
    }

    @Override
    public <U extends Comparable<? super U>> Comparator<Character> thenComparing(Function<? super Character, ? extends U> keyExtractor) {
        return Comparator.super.thenComparing(keyExtractor);
    }

    @Override
    public Comparator<Character> thenComparingInt(ToIntFunction<? super Character> keyExtractor) {
        return Comparator.super.thenComparingInt(keyExtractor);
    }

    @Override
    public Comparator<Character> thenComparingLong(ToLongFunction<? super Character> keyExtractor) {
        return Comparator.super.thenComparingLong(keyExtractor);
    }

    @Override
    public Comparator<Character> thenComparingDouble(ToDoubleFunction<? super Character> keyExtractor) {
        return Comparator.super.thenComparingDouble(keyExtractor);
    }
}

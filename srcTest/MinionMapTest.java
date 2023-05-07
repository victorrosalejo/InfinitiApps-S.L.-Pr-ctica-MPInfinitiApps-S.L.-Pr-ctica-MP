import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MinionMapTest {

    @Test
    void minionMap() {
        Character character = new Character();

        Minion minion = new Minion();

        minion.setName("loocoooo");
        minion.setTipominion(TMinion.HUMAN);
        minion.setHitPoints(4);


       character.getMinionMap().add(minion);


        assertEquals("loocoooo",character.getMinionMap().get(0).getName());
        assertEquals(4,character.getMinionMap().get(0).getHitPoints());
        assertEquals(TMinion.HUMAN,character.getMinionMap().get(0).getTipominion());







    }
}
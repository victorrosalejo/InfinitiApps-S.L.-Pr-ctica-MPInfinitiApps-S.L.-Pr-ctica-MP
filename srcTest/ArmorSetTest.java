import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ArmorSetTest {

    @Test
    void armorSet() {

    Character character = new Character();

    Armor armor = new Armor();

    armor.setName("paco");
    armor.setDefense(2);
    armor.setAttack(2);
    armor.setActive(false);
    character.getArmorSet().add(armor);

    assertEquals("paco",character.getArmorSet().get(0).getName());
    assertEquals(2,character.getArmorSet().get(0).getAttack());
    assertEquals(2,character.getArmorSet().get(0).getDefense());


    }
}
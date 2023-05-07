import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ModifierListTest {

    @Test
    void modifierList() {

        DatabaseManager databaseManager = new DatabaseManager();
        Map<String, Character> databaseC = new HashMap<>();
        Character character = new Character();

        Modifiers modifiers = new Modifiers();

        modifiers.setName("loocoooo");
        modifiers.setValue(2);
        modifiers.setBuff(true);
        modifiers.setActive(false);

        character.getModifiersList().add(modifiers);


        assertEquals("loocoooo",character.getModifiersList().get(0).getName());
        assertEquals(2,character.getModifiersList().get(0).getValue());
        assertEquals(true,character.getModifiersList().get(0).isBuff());
        assertEquals(false,character.getWeaponSet().get(0).isActive());


    }
}
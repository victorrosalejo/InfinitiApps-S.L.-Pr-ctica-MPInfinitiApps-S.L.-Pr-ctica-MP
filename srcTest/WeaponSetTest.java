import org.junit.jupiter.api.Test;
import org.testng.Assert;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class WeaponSetTest {

    @Test
    void weaponSet() {

            DatabaseManager databaseManager = new DatabaseManager();
            Map<String, Character> databaseC = new HashMap<>();
            Character character = new Character();
            Weapon weapon = new Weapon();
            WeaponSet weaponSet = new WeaponSet();
            List<Weapon> setdearmas = new ArrayList<>(1);

            weapon.setHands(1);
            weapon.setActive(false);
            weapon.setDefence(0);
            weapon.setAttack(1);
            weapon.setName("The Throngler");
            setdearmas.add(weapon);
            character.setWeaponSet(setdearmas);

            String[] entradas = {"1","1","Malmortius"};
            String ch = String.join(System.lineSeparator(), entradas) + System.lineSeparator();

            InputStream in = new ByteArrayInputStream(ch.getBytes());
            System.setIn(in);

            character = weaponSet.WeaponSet(character);

            assertEquals("Malmortius" , character.getWeaponSet().get(0).getName() );

















        }

}
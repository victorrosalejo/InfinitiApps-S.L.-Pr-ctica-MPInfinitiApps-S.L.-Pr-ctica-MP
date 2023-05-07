import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AddMinionTest {

    @Test
    public void AddMinion() {
            List<Minion> minionList = new ArrayList<>();
            AddMinion addMinion = new AddMinion();

            // Test adding a human minion
            String name = "John";
            int hitPoints = 2;
            String type = "Humano";
            String[] inputs = {"a",name,Integer.toString(hitPoints), "Humano"};
            System.setIn(new java.io.ByteArrayInputStream(String.join(System.lineSeparator(), inputs).getBytes()));
            minionList = addMinion.AddMinion(minionList);
            assertEquals(1, minionList.size());
            assertEquals(name, minionList.get(0).getName());
            assertEquals(hitPoints, minionList.get(0).getHitPoints());
            assertEquals(TMinion.HUMAN, minionList.get(0).getTipominion());

            // Test adding a ghoul minion
            name = "Ghoul";
            hitPoints = 3;
            type = "Ghoul";
            inputs = new String[]{"a",name, Integer.toString(hitPoints), type};
            System.setIn(new java.io.ByteArrayInputStream(String.join(System.lineSeparator(), inputs).getBytes()));
            minionList = addMinion.AddMinion(minionList);
            assertEquals(2, minionList.size());
            assertEquals(name, minionList.get(1).getName());
            assertEquals(hitPoints, minionList.get(1).getHitPoints());
            assertEquals(TMinion.GHOUL, minionList.get(1).getTipominion());

        // Test adding a demon minion
            name = "Demon";
            hitPoints = 1;
            type = "Demonio";
            String pacto = "Pacto";
            String minionName = "Demonminion";
            int minionHitPoints = 2;
            inputs = new String[]{"a",name, Integer.toString(hitPoints), type, pacto, "S", "s", minionName, Integer.toString(minionHitPoints), type, "N"};
            System.setIn(new java.io.ByteArrayInputStream(String.join(System.lineSeparator(), inputs).getBytes()));
            minionList = addMinion.AddMinion(minionList);
            assertEquals(4, minionList.size());
            assertEquals(name, minionList.get(2).getName());
            assertEquals(hitPoints, minionList.get(2).getHitPoints());
            assertEquals(TMinion.DEMON, minionList.get(2).getTipominion());
            assertEquals(pacto, ((Demon)minionList.get(2)).getPact());
            assertEquals(1, ((Demon)minionList.get(2)).getMinionList().size());
            assertEquals(minionName, ((Demon)minionList.get(2)).getMinionList().get(0).getName());
            assertEquals(minionHitPoints, ((Demon)minionList.get(2)).getMinionList().get(0).getHitPoints());
            assertEquals(TMinion.DEMON, ((Demon)minionList.get(2)).getMinionList().get(0).getTipominion());
        }
    }
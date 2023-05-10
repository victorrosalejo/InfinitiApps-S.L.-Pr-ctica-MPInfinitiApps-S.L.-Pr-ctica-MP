import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class FightTest {

    @Test
    void endFight() {
        Map<String, History> databaseH = new HashMap<>();
        Map<String, User> databaseU = new HashMap<>();
        DatabaseManager databaseManager = new DatabaseManager();
        User user = new User();
        User user1 = new User();
        Character fighter = new Character();
        Character fighter1 = new Character();
        Combat combat = new Combat();
        Match match = new Match();
        Fight fight = new Fight();
        History history = new History();

        user.setRegisterNumber("BBBB");
        user.setRegisterNumber("CCCC");
        fighter.setGoldValue(1000);
        fighter1.setGoldValue(1000);



        combat.setState(State.VDEFIANT);
        combat.setGoldBet(50);
        combat.setRounds(10);


        Method metodo = null;
        try {
            metodo = fight.getClass().getDeclaredMethod("endCombat" , Combat.class, State.class, User.class, User.class);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }

        metodo.setAccessible(true);





        databaseH = databaseManager.obtainDatabaseH();
        databaseU = databaseManager.obtainDatabaseU();

        history.appendMatch(match);

        databaseH.put(user.getRegisterNumber(), history);
        databaseH.put(user1.getRegisterNumber(), history);




        databaseU.put(user.getRegisterNumber(), user);
        databaseU.put(user1.getRegisterNumber(), user1);

        //Assertions.assertEquals();
















        databaseH.put(user.getRegisterNumber(), history);






















    }
}
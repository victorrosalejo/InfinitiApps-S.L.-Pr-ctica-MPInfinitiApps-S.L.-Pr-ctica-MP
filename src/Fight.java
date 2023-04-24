import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.*;

public class Fight implements Serializable {


    private Round roundFight = new Round();
    private Combat combat = new Combat();
    private DatabaseManager databaseManager = new DatabaseManager();
    private Map<String, Character> databaseC = new HashMap<>();
    private Map<String, History> databaseH = new HashMap<>();



    // Implementar luego
    public void Fight(User udefiant, User udefied, Integer gold) {
        databaseC = databaseManager.obtainDatabaseC();
        Character pdefiant = databaseC.get(udefiant.getRegisterNumber());
        Character pdefied = databaseC.get(udefiant.getRegisterNumber());

        Fighter defiant = (Fighter) pdefiant;
        Fighter defied = (Fighter) pdefied;

        fighter(defiant);
        fighter(defied);
        Random random = new Random();
        List<Integer> resultado = new ArrayList<>(2);
        int attackAnt, attackEd, defAnt, defEd;
        int hpAnt = defiant.getFighterHP();
        int hpEd = defied.getFighterHP();
        int rondas = combat.getRounds();
        rondas += 1;
        combat.setRounds(rondas);


        // Defiant
        resultado = RoundBalance(defiant, random);

        attackAnt = resultado.get(0);
        defAnt = resultado.get(1);

        // Defied

        resultado = RoundBalance(defied, random);


        attackEd = resultado.get(0);
        defEd = resultado.get(1);

        List<Integer> list = new ArrayList<>();

        if (attackAnt >= defEd){
            hpEd -= 1;
            list.add(0,1);
        }else {
            list.add(0,0);
        }
        if (attackEd >= defAnt){
            hpAnt -= 1;
            list.add(1,1);
        }else{
            list.add(1,0);
        }
        roundFight.setDamageDealt(list);

        roundFight.setDefiantInfo(defiant);
        roundFight.setDefiedInfo(defied);
        List<Round> listarondas = combat.getRoundList();
        listarondas.add(roundFight);
        combat.setGoldBet(gold);


        // Comprobacion de final de partida

        if (hpAnt == 0 || hpEd == 0){
            if (hpAnt == 0 && hpEd == 0) {
                endCombat(combat, State.DRAW, udefiant,udefied);
            }
            else if (hpAnt == 0){
                endCombat(combat, State.VDEFIED, udefiant, udefied );
                int oroperd = pdefiant.getGoldValue();
                oroperd -= gold;
                pdefiant.setGoldValue(oroperd);
                int orogan = pdefied.getGoldValue();
                orogan += gold;
                pdefied.setGoldValue(orogan);




            }
            else {
                endCombat(combat, State.VDEFIANT, udefiant, udefied);
                int orogan = pdefiant.getGoldValue();
                orogan -= gold;
                pdefiant.setGoldValue(orogan);
                int oroperd = pdefied.getGoldValue();
                oroperd += gold;
                pdefied.setGoldValue(oroperd);
            }
        }

        nextFight(roundFight, combat, udefiant, udefied);


    }

    private List<Integer> RoundBalance(Fighter f, Random random){
        int exitosA = 0;
        int exitosD = 0;
        List<Integer> listaresult = new ArrayList<>(2);
        for (int i = 0; i < f.getAttackPower(); i++) {
            if (random.nextInt(1, 7) >= 5) {
                exitosA += 1;
            }
        }
        for (int x = 0 ; x < f.getDefensePower(); x++){
            if (random.nextInt(1, 7) >= 5) {
                exitosD += 1;
            }


        }
        listaresult.add(exitosA);
        listaresult.add(exitosD);


        return listaresult;
    }


    private void nextFight(Round roundFight, Combat combat, User defiant, User defied) {

        Fight(defiant, defied, combat.getGoldBet());

    }
    private void endCombat(Combat combat, State state, User udefiant, User udefied){

         History history = databaseH.remove(udefiant.getRegisterNumber());
         History history2 = databaseH.remove(udefied.getRegisterNumber());
         Match nuevapartida = new Match();
         Character perAnt = databaseC.get(udefiant.getRegisterNumber());
         Character perEd = databaseC.get(udefied.getRegisterNumber());
         State winner = state;
         List<Round> rondas= combat.getRoundList();
         Round rondafinal = rondas.get(rondas.size()-1);


         LocalDateTime date = LocalDateTime.now();
         nuevapartida.setDefiant(perAnt);
         nuevapartida.setDefied(perEd);
         nuevapartida.setRounds(combat.getRounds());

         switch (winner){
             case VDEFIANT -> {
                 nuevapartida.setWinner(perAnt);
                 if ( rondafinal.getDefiantInfo().getFighterHP() - rondafinal.getDefiantInfo().getMinionHP() > 0 ) {
                     nuevapartida.setMinionsLeft(true);

                 }
                 else {
                     nuevapartida.setMinionsLeft(false);
                 }

             }
             case VDEFIED -> {
                 nuevapartida.setWinner(perEd);
                 if ( (rondafinal.getDefiedInfo().getFighterHP() - rondafinal.getDefiedInfo().getMinionHP()) > 0 )
                     nuevapartida.setMinionsLeft(true);
                 else {
                     nuevapartida.setMinionsLeft(false);
                 }
             }
             case DRAW -> {
                 nuevapartida.setWinner(null);
                 nuevapartida.setMinionsLeft(false);
             }
         }



         nuevapartida.setGoldBet(combat.getGoldBet());
         nuevapartida.setDate(date);
         history.appendMatch(nuevapartida, udefiant);
         history2.appendMatch(nuevapartida, udefied);

         databaseH.put(udefiant.getRegisterNumber() , history);
         databaseH.put(udefied.getRegisterNumber() , history2);
         databaseManager.saveDatabaseH(databaseH);



         result(combat, udefied);



    }

    public Round getRoundFight() {
        return roundFight;
    }

    public void setRoundFight(Round roundFight) {
        this.roundFight = roundFight;
    }

    public Combat getCombat() {
        return combat;
    }

    public void setCombat(Combat combat) {
        this.combat = combat;
    }


    public void fighter(Fighter f) {
        Fighter fighter = new Fighter();
        fighter.Figther(f);

    }
    public void result(Combat c, User user){
        Result result = new Result();
        result.showResult(c,user);
    }

}

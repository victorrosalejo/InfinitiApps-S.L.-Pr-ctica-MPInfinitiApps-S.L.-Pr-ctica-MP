import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Fight {


    private Round roundFight = new Round();
    private Combat combat = new Combat();




    // Implementar luego
    public void Fight(Fighter defiant, Fighter defied, Integer gold) {
        fighter(defiant);
        fighter(defied);
        Random random = new Random();
        List<Integer> resultado = new ArrayList<>(2);
        int attackAnt, attackEd, defAnt, defEd;
        int hpAnt = defiant.getFighterHP();
        int hpEd = defied.getFighterHP();


        // Defiant
        resultado = RoundBalance(defiant, random);

        attackAnt = resultado.get(0);
        defAnt = resultado.get(1);

        // Defied

        resultado = RoundBalance(defied, random);


        attackEd = resultado.get(0);
        defEd = resultado.get(1);

        List<Integer> list = new ArrayList<>(2);

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

        // Comprobacion de final de partida

        if (hpAnt == 0 || hpEd == 0){
            if (hpAnt == 0 && hpEd == 0) {
                endCombat(combat, State.DRAW);
            }
            else if (hpAnt == 0){
                endCombat(combat, State.VDEFIED);
            }
            else {
                endCombat(combat, State.VDEFIANT);
            }
        }

        nextFight(roundFight, combat);


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


    private void nextFight(Round roundFight, Combat combat) {

        Fight();

    }
    private void endCombat(Combat combat, State state){

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

}

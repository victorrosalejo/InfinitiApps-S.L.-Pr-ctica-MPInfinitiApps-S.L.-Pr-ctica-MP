public class Fighter extends Character implements Cloneable{
    private int fighterHP;
    private int minionHP;
    private boolean defiant;
    private int attackPower;
    private int defensePower;



    public void Figther(Fighter f){
        TCharacter tipo;
        tipo = f.getType();
        int attPot, defPot;
        f.minionHP = 0;
            switch (tipo){
                case VAMPIRE:
                    attPot = f.getPower() + f.getSpecialAbility().getAttack();
                    defPot = f.getPower() + f.getSpecialAbility().getDefense();

                    //armadura
                    for (Armor armor : f.getArmorSet()){
                        if (armor.isActive() == true){
                            defPot += armor.getDefense();
                            attPot += armor.getAttack();
                        }
                    }

                    // armas
                    for (Weapon weapon : f.getWeaponSet()){
                        if (weapon.isActive() == true){
                            attPot += weapon.getAttack();
                            defPot += weapon.getDefence();
                        }
                    }
                    // habilidad
                    int blood = f.getTypeAttack();
                        if (blood >= 5){
                            attPot += 2;
                            defPot += 2;
                            blood -= f.getSpecialAbility().getSpecialValue();

                        }
                    f.setDefensePower(defPot);
                    f.setAttackPower(attPot);
                    break;
                case WEREWOLF:
                    attPot = f.getPower() + f.getSpecialAbility().getAttack();
                    defPot = f.getPower() + f.getSpecialAbility().getDefense();
                    // armaduras

                    for (Armor armor : f.getArmorSet()){
                        if (armor.isActive() == true){
                            defPot += armor.getDefense();
                            attPot += armor.getAttack();
                        }
                    }



                    // armas
                    for (Weapon weapon : f.getWeaponSet()){
                        if (weapon.isActive() == true){
                            attPot += weapon.getAttack();
                        }
                    }



                    // habilidad
                    int rage = f.getTypeAttack();
                    if (rage > f.getSpecialAbility().getSpecialValue()) {
                        attPot += rage;
                        defPot += rage;

                    }
                    f.setDefensePower(defPot);
                    f.setAttackPower(attPot);
                    break;
                case HUNTER:
                    attPot = f.getPower() + f.getSpecialAbility().getAttack() + f.getTypeAttack();
                    defPot = f.getPower() + f.getSpecialAbility().getDefense() + f.getTypeAttack();



                    // armaduras
                    for (Armor armor : f.getArmorSet()){
                        if (armor.isActive() == true){
                            defPot += armor.getDefense();
                            attPot += armor.getAttack();
                        }
                    }

                    // armas
                    for (Weapon weapon : f.getWeaponSet()){
                        if (weapon.isActive() == true){
                            attPot += weapon.getAttack();
                            defPot += weapon.getDefence();

                        }
                    }
                    f.setDefensePower(defPot);
                    f.setAttackPower(attPot);
                    break;
            }
    //CALCULO DE SALUD

        for (Minion minion : f.getMinionMap()){
            f.minionHP += minion.getHitPoints();
            checkDemonList(minion, f);

        }


    }

    private void checkDemonList (Minion minion, Fighter f){
        if (minion.getTipominion() == TMinion.DEMON) {
            Demon demon = (Demon) minion;
            for (Minion subminion : demon.getMinionList()) {
                f.minionHP += subminion.getHitPoints();
                checkDemonList(subminion, f);
            }
        }

    }




    public int getFighterHP() {
        return fighterHP;
    }

    public void setFighterHP(int fighterHP) {
        this.fighterHP = fighterHP;
    }

    public int getMinionHP() {
        return minionHP;
    }

    public void setMinionHP(int minionHP) {
        this.minionHP = minionHP;
    }

    public boolean isDefiant() {
        return defiant;
    }

    public void setDefiant(boolean defiant) {
        this.defiant = defiant;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getDefensePower() {
        return defensePower;
    }

    public void setDefensePower(int defensePower) {
        this.defensePower = defensePower;
    }
}


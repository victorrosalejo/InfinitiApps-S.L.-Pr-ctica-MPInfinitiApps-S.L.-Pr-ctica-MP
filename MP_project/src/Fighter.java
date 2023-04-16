public class Fighter extends Character{
    private int fighterHP;
    private int minionHP;
    private boolean defiant;
    private int attackPower;
    private int defensePower;

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

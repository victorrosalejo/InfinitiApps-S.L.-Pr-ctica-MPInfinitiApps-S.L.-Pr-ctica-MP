public class Ability {
    private  TAbility type;
    private int defense;
    private int attack;
    private int specialValue;

    public TAbility getType() {
        return type;
    }

    public void setType(TCharacter type) {

        if (type == TCharacter.VAMPIRE){
            this.type = TAbility.DISCIPLINE;
            setSpecialValue(3);
        } else if (type == TCharacter.WEREWOLF) {
            this.type = TAbility.GIFT;
            setSpecialValue(3);
        }else{
            this.type = TAbility.TALENT;
            setSpecialValue(0);
        }
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getSpecialValue() {
        return specialValue;
    }

    public void setSpecialValue(int specialValue) {
        this.specialValue = specialValue;
    }

}

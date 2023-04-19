import java.lang.reflect.Modifier;
import java.util.*;

public class Character {
    private String name;
    private String description;
    private TCharacter type;
    private List<Weapon> weaponSet = new ArrayList<>();
    private List<Armor> armorSet = new ArrayList<>();
    private int hP = 5;
    private int power;
    private List<Minion> minionMap = new ArrayList<>();
    private Ability specialAbility = new Ability();
    private  int goldValue;
    private List<Modifiers> modifierList = new ArrayList<>();
    private int wins;
    private int typeAttack;
    private boolean fighting;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TCharacter getType() {
        return type;
    }

    public void setType(String type) {

        if (type =="Vampiro"){
            this.type = TCharacter.VAMPIRE;
        } else if (type == "Licántropo") {
            this.type = TCharacter.WEREWOLF;
        }else {
            this.type = TCharacter.HUNTER;
        }
    }

    public List<Weapon> getWeaponSet() {
        return weaponSet;
    }

    public void setWeaponSet(List<Weapon> weaponSet) {
        this.weaponSet = weaponSet;
    }

    public List<Armor> getArmorSet() {
        return armorSet;
    }

    public void setArmorSet(List<Armor> armorSet) {
        this.armorSet = armorSet;
    }

    public List<Minion> getMinionMap() {
        return minionMap;
    }

    public void setMinionMap(List<Minion> minionMap) {
        this.minionMap = minionMap;
    }

    public int gethP() {
        return hP;
    }

    public void sethP(int hP) {
        this.hP = hP;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public Ability getSpecialAbility() {
        return specialAbility;
    }

    public void setSpecialAbility(Ability ability) {
            this.specialAbility = ability;
    }

    public int getGoldValue() {
        return goldValue;
    }

    public void setGoldValue(int goldValue) {
        this.goldValue = goldValue;
    }

    public List<Modifiers> getModifierList() {
        return modifierList;
    }

    public void setModifierList(List<Modifiers> modifierList) {
        this.modifierList = modifierList;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getTypeAttack() {
        return typeAttack;
    }

    public void setTypeAttack(int typeAttack) {
        this.typeAttack = typeAttack;
    }

    public boolean isFighting() {
        return fighting;
    }

    public void setFighting(boolean fighting) {
        this.fighting = fighting;
    }

    public void setType(TCharacter type) {
        this.type = type;
    }
}


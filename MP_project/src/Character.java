import java.lang.reflect.Modifier;
import java.util.*;

public abstract class Character {
    private String name;
    private String description;
    private TCharacter type;
    private Map<String,Weapon> weaponSet = new HashMap<>();
    private Map<String,Armor> armorSet = new HashMap<>();
    private final int hP = 5;
    private int power;
    private Map<String,Minion> minionMap = new HashMap<>();
    private Ability specialAbility;
    private  int goldValue;
    private List<Modifiers> modifierList = new ArrayList<>();
    private Set<Weapon> activeWeapons = new HashSet<>();
    private int activeArmor;
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

    public void setType(TCharacter type) {
        this.type = type;
    }

    public Map<String, Weapon> getWeaponSet() {
        return weaponSet;
    }

    public void setWeaponSet(Map<String, Weapon> weaponSet) {
        this.weaponSet = weaponSet;
    }

    public Map<String, Armor> getArmorSet() {
        return armorSet;
    }

    public void setArmorSet(Map<String, Armor> armorSet) {
        this.armorSet = armorSet;
    }

    public int gethP() {
        return hP;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public Map<String, Minion> getMinionMap() {
        return minionMap;
    }

    public void setMinionMap(Map<String, Minion> minionMap) {
        this.minionMap = minionMap;
    }

    public Ability getSpecialAbility() {
        return specialAbility;
    }

    public void setSpecialAbility(Ability specialAbility) {
        this.specialAbility = specialAbility;
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

    public Set<Weapon> getActiveWeapons() {
        return activeWeapons;
    }

    public void setActiveWeapons(Set<Weapon> activeWeapons) {
        this.activeWeapons = activeWeapons;
    }

    public int getActiveArmor() {
        return activeArmor;
    }

    public void setActiveArmor(int activeArmor) {
        this.activeArmor = activeArmor;
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
}


package character;

public abstract class Fighter extends Character {
    protected int hp;
    protected int power;
    protected int defence;
    protected String type;
    protected int strength;
    protected int dexterity;
    protected int wisdom;
    protected int darkness;
    protected int holiness;

    public int getStrength() {return strength;}

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getDarkness() {
        return darkness;
    }

    public void setDarkness(int darkness) {
        this.darkness = darkness;
    }

    public int getHoliness() {
        return holiness;
    }

    public void setHoliness(int holiness) {
        this.holiness = holiness;
    }
    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "defence=" + defence +
                ", hp=" + hp +
                ", power=" + power +
                ", type=" + type +
                '}';
    }
}

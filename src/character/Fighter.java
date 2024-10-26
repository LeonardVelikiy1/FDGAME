package character;

public abstract class Fighter extends Character {
    protected int hp;
    protected int power;
    protected int defence;

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

    @Override
    public String toString() {
        return "Fighter{" +
                "defence=" + defence +
                ", hp=" + hp +
                ", power=" + power +
                '}';
    }
}

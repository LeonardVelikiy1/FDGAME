package character;

public class Player extends Fighter {
    private int intelligence;

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(Integer intelligence) {
        this.intelligence = intelligence;
    }

    @Override
    public String toString() {
        return "Player{" +
                "intelligence=" + intelligence +
                ", hp=" + hp +
                ", power=" + power +
                ", defence=" + defence +
                ", name='" + name + '\'' +
                '}';
    }
}

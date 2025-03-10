package generic.test.ex3.unit;

public class BioUnit {
    private String name;
    private int Hp;

    public BioUnit(String name, int hp) {
        this.name = name;
        Hp = hp;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return Hp;
    }

    @Override
    public String toString() {
        return "BioUnit{" +
                "name='" + name + '\'' +
                ", Hp=" + Hp +
                '}';
    }
}

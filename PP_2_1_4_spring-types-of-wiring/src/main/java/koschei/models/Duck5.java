package koschei.models;

public class Duck5 {
    private Egg6 egg;

    public void setEgg(Egg6 egg) {
        this.egg = egg;
    }

    @Override
    public String toString() {
        return "в зайце — утка, " + egg.toString();
    }
}
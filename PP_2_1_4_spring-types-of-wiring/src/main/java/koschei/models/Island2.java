package koschei.models;

public class Island2 {
    private Wood3 wood;

    public void setWood(Wood3 wood) {
        this.wood = wood;
    }

    @Override
    public String toString() {
        return "на том острове дуб стоит, " + wood.toString();
    }
}
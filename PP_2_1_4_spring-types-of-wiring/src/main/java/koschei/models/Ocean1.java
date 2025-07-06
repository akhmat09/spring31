package koschei.models;

public class Ocean1 {
    private Island2 island;

    public void setIsland(Island2 island) {
        this.island = island;
    }

    @Override
    public String toString() {
        return "на море на океане есть остров, " + island.toString();
    }
}
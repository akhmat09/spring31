package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;

public class Egg6 {
    private Needle7 needle;

    @Autowired  // Добавьте эту аннотацию
    public void setNeedle(Needle7 needle) {
        this.needle = needle;
    }

    @Override
    public String toString() {
        return "в утке — яйцо, " + needle.toString();
    }
}
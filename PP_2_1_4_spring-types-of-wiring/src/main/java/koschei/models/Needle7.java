package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Needle7 {
    private final Death8 death;

    @Autowired
    public Needle7(Death8 death) {
        this.death = death;
    }

    @Override
    public String toString() {
        return "в яйце — игла, " + death.toString();
    }
}
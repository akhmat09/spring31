package koschei;

import koschei.models.Ocean1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class KoscheiTheDeathless {
    private Ocean1 ocean;

    @Autowired
    public void setOcean(Ocean1 ocean) {
        this.ocean = ocean;
    }

    public String getRulesByDeth() {
        return ocean.toString();
    }
}
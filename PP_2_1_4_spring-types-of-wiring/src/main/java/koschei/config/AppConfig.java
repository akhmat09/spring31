package koschei.config;

import koschei.models.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "koschei")
public class AppConfig {

    @Bean
    public Ocean1 getOcean(Island2 island) {
        Ocean1 ocean = new Ocean1();
        ocean.setIsland(island);
        return ocean;
    }

    @Bean
    public Island2 getIsland(Wood3 wood) {
        Island2 island = new Island2();
        island.setWood(wood);
        return island;
    }

    @Bean
    public Duck5 getDuck(Egg6 egg) {
        Duck5 duck = new Duck5();
        duck.setEgg(egg);
        return duck;
    }

    @Bean
    public Egg6 getEgg(Needle7 needle) {
        Egg6 egg = new Egg6();
        egg.setNeedle(needle);
        return egg;
    }
}
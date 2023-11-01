package moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Stat;

public class Facade extends PhysicalMove {

    public Facade() {
        super(Type.NORMAL, 70, 100);
    }

    @Override
    protected String describe() {
        return "наносит урон";
    }

    @Override
    public void applyOppDamage(Pokemon pok, double damage) {
        Status condition = pok.getCondition();
        if (condition.equals(Status.BURN) || condition.equals(Status.POISON) || condition.equals(Status.PARALYZE)) {
            pok.setMod(Stat.HP, (int) Math.round(damage * 2));
        }
    }

}

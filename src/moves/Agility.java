package moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Agility extends StatusMove {

    public Agility() {
        super(Type.PSYCHIC, 70, 90);
    }

    @Override
    protected String describe() {
        return "увеличивает свою скорость";
    }

    @Override
    public void applySelfEffects(Pokemon pok) {
        pok.setMod(Stat.SPEED, +2);
    }

}

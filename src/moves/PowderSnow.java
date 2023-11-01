package moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class PowderSnow extends SpecialMove {

    public PowderSnow() {
        super(Type.ICE, 40, 100);
    }

    @Override
    protected String describe() {
        return "ударяет снежным порывом";
    }

    @Override
    public void applyOppEffects(Pokemon pok) {
        if (Math.random() < 0.1) {
            Effect.freeze(pok);
        }
    }

}

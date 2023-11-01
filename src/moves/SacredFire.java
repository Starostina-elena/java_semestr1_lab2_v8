package moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class SacredFire extends PhysicalMove {

    public SacredFire() {
        super(Type.FIRE, 100, 95);
    }

    @Override
    protected String describe() {
        return "обжигает";
    }

    @Override
    public void applyOppEffects(Pokemon pok) {
        if (Math.random() < 0.5) {
            Effect.burn(pok);
        }
    }

}

package moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;


public class RockSlide extends PhysicalMove{

    public RockSlide() {
        super(Type.ROCK, 75, 90);
    }

    @Override
    protected String describe() {
        return "бросается большими валунами";
    }

    @Override
    public void applyOppEffects(Pokemon pok) {
        if (Math.random() < 0.3) {
            Effect.flinch(pok);
        }
    }

}

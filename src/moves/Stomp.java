package moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Stomp extends PhysicalMove {

    public Stomp() {
        super(Type.NORMAL, 65, 100);
    }

    @Override
    protected String describe() {
        return "наступает на врага";
    }

    @Override
    public void applyOppEffects(Pokemon pok) {
        if (Math.random() < 0.3) {
            Effect.flinch(pok);
        }
    }

}

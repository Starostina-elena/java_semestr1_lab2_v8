package moves;

import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Status;

public class Rest extends StatusMove {

    public Rest() {
        super(Type.PSYCHIC, 70, 90);
    }

    @Override
    protected String describe() {
        return "засыпает на два хода и полностью восстанавливается";
    }

    @Override
    public void applySelfEffects(Pokemon pok) {
        pok.restore();
        Effect eff = new Effect();
        eff.turns(2);
        eff.condition(Status.SLEEP);
        pok.addEffect(eff);
    }

}

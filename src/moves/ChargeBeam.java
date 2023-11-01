package moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;


public class ChargeBeam extends SpecialMove {

    public ChargeBeam() {
        super(Type.ELECTRIC, 50, 90);
    }

    @Override
    protected String describe() {
        return "запускает концентрированный пучок электричества";
    }

    @Override
    public void applySelfEffects(Pokemon pok) {
        if (Math.random() < 0.7) {
            pok.setMod(Stat.SPECIAL_ATTACK, +1);
        }
    }

}

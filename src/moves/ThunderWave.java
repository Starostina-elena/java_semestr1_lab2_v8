package moves;

import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class ThunderWave extends StatusMove {

    public ThunderWave() {
        super(Type.ELECTRIC, 70, 90);
    }

    @Override
    protected String describe() {
        return "парализует оппонента";
    }


}

package pockemons;

import moves.ChargeBeam;
import moves.Facade;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Pichu extends Pokemon {

    public Pichu(String name, int level) {
        super(name, level);
        setType(Type.ELECTRIC);
        setStats(20, 40, 15, 35, 35, 60);
        setMove(new Facade(), new ChargeBeam());
    }

}

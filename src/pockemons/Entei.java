package pockemons;

import moves.FireFang;
import moves.SacredFire;
import moves.Stomp;
import moves.StoneEdge;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Entei extends Pokemon {

    public Entei(String name, int level) {
        super(name, level);
        setType(Type.FIRE);
        setStats(115, 115, 85, 90, 75, 100);
        setMove(new StoneEdge(), new FireFang(), new SacredFire(), new Stomp());
    }

}

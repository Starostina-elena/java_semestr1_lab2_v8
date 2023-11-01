package pockemons;

import moves.Rest;

public class Raichu extends Pikachu{

    public Raichu(String name, int level) {
        super(name, level);
        setStats(60, 90, 55, 90, 80, 110);
        addMove(new Rest());
    }

}

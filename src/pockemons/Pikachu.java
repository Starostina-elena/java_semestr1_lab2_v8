package pockemons;

import moves.Agility;

public class Pikachu extends Pichu {

    public Pikachu(String name, int level) {
        super(name, level);
        setStats(35, 55, 40, 50, 50, 90);
        addMove(new Agility());
    }

}

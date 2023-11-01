import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;
import pockemons.*;

public class Main {

    public static void main(String[] args) {

        Battle b = new Battle();
        Pokemon p1 = new Entei("Первый", 1);
        Pokemon p2 = new Amaura("Второй", 1);
        Pokemon p3 = new Aurorus("Третий", 1);
        Pokemon p4 = new Pichu("Четвертый", 1);
        Pokemon p5 = new Pikachu("Пятый", 1);
        Pokemon p6 = new Raichu("Шестой", 1);
        b.addAlly(p1);
        b.addAlly(p3);
        b.addAlly(p5);
        b.addFoe(p2);
        b.addFoe(p4);
        b.addFoe(p6);
        b.go();

    }

}
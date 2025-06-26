import org.junit.Test;
import org.tondeuse.Orientation;
import org.tondeuse.Position;
import org.tondeuse.Tondeuse;

import static org.junit.Assert.assertEquals;

public class TondeuseTest {

    @Test
    public void testRotationDroite() {
        Orientation o = Orientation.N;
        assertEquals(Orientation.E, o.turnRight());
    }

    @Test
    public void testRotationGauche() {
        Orientation o = Orientation.N;
        assertEquals(Orientation.W, o.turnLeft());
    }

    @Test
    public void testAvancerDansLimite() {
        Position p = new Position(1, 2, Orientation.N);
        Tondeuse t = new Tondeuse(p, 5, 5);
        t.processInstructions("A");
        assertEquals("1 3 N", t.getTondeusePosition().toString());
    }

    @Test
    public void testAvancerAuDelaGrille() {
        Position p = new Position(0, 0, Orientation.S);
        Tondeuse t = new Tondeuse(p, 5, 5);
        t.processInstructions("A");
        assertEquals("0 0 S", t.getTondeusePosition().toString());
    }

    @Test
    public void testInstructionsLamdaUn() {
        Position p = new Position(1, 2, Orientation.N);
        Tondeuse t = new Tondeuse(p, 5, 5);
        t.processInstructions("GAGAGAGAA");
        assertEquals("1 3 N", t.getTondeusePosition().toString());
    }

}

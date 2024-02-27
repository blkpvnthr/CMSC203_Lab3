import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {
    private GradeBook gradeBook1;
    private GradeBook gradeBook2;

    @BeforeEach
    public void setUp() {
        gradeBook1 = new GradeBook(5);
        gradeBook2 = new GradeBook(5);

        gradeBook1.addScore(90);
        gradeBook1.addScore(85);

        gradeBook2.addScore(75);
        gradeBook2.addScore(80);
    }

    @AfterEach
    public void tearDown() {
        gradeBook1 = null;
        gradeBook2 = null;
    }

    @Test
    public void testAddScore() {;
        assertTrue(gradeBook1.addScore(100)); 
        assertTrue(gradeBook1.addScore(100));
        assertTrue(gradeBook1.addScore(100));
        assertFalse(gradeBook1.addScore(100));
    }


    @Test
    public void testToString() {
        assertEquals("90.0 85.0", gradeBook1.toString());
        assertEquals("75.0 80.0", gradeBook2.toString());
    }

    @Test
    public void testSum() {
        assertEquals(175, gradeBook1.sum(), 0.01);
        assertEquals(155, gradeBook2.sum(), 0.01);
    }

    @Test
    public void testMinimum() {
        assertEquals(85, gradeBook1.minimum(), 0.01);
        assertEquals(75, gradeBook2.minimum(), 0.01);
    }

    @Test
    public void testFinalScore() {
        assertEquals(90, gradeBook1.finalScore(), 0.01);
        assertEquals(80, gradeBook2.finalScore(), 0.01);
    }
}

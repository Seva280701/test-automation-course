import com.bootcampexcercise.module9.activity.Person;
import junit.framework.TestCase;

/**
 * Class: PersonTest
 *
 * Unit tests for Person class
 */
public class PersonTest extends TestCase {

    private Person person;

    // setup
    protected void setUp() {
        person = new Person();
    }

    // teardown
    protected void tearDown() {
        person = null;
    }

    // test getters and setters
    public void testGettersAndSetters() {
        person.setWeight(70);
        person.setHeight(1.75f);

        assertEquals(70, person.getWeight());
        assertEquals(1.75f, person.getHeight());
    }

    // test BMI method
    public void testGetBodyMassIndex() {

        String result = person.getBodyMassIndex(1.75f, 70);

        assertEquals("Normal", result);
    }

    // test invalid input
    public void testInvalidInput() {

        String result = person.getBodyMassIndex(0, 70);

        assertTrue(result.contains("Invalid"));
    }
}
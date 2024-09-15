import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)

public class LionWithParametersTest {

    private final String lionSex;
    private final boolean haveMane;
    private Lion lion;
    private Feline feline;

    public LionWithParametersTest(String lionSex, boolean haveMane) {
        this.lionSex = lionSex;
        this.haveMane = haveMane;
    }

    @Parameterized.Parameters
    public static Object[][] getParameters() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Before
    public void createAnimal() throws Exception {
        lion = new Lion(lionSex, feline);
    }

    @Test
    public void testLionDoesHaveMane() throws Exception {
        Assert.assertEquals(haveMane, lion.doesHaveMane());
    }
}

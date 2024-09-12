import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    Cat cat;
    String expectedSound = "Мяу";

    @Mock
    Feline feline;

    @Before
    public void createCat() {
        cat = new Cat(feline);
    }

    @Test
    public void testCatGetSound() {
        String actualSound = cat.getSound();
        Assert.assertEquals(expectedSound, actualSound);
    }

    @Test
    public void testCatFood() throws Exception {
        cat.getFood();
        Mockito.verify(feline).eatMeat();
    }
}
import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)

public class LionTest {

    Lion lion;

    @Mock
    Feline feline;

    @Test
    public void testLionGetKittens() throws Exception {
        lion = new Lion("Самец", feline);
        lion.getKittens();
        Mockito.verify(feline).getKittens();
    }

    @Test
    public void testLionDoesHaveMane() throws Exception {
        lion = new Lion("Самка", feline);
        Assert.assertFalse(lion.doesHaveMane());
    }

    @Test
    public void testLionException() {
        Assert.assertThrows(Exception.class, () -> new Lion("гибрид", feline));
    }

    @Test
    public void testLionGetFood() throws Exception {
        lion = new Lion("Самец", feline);
        lion.getFood();
        Mockito.verify(feline).getFood("Хищник");
    }
}
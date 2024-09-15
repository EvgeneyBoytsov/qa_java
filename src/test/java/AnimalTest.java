import com.example.Animal;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class AnimalTest {
    Animal animal;
    String expectedFamily = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";

    @Before
    public void createAnimal() {
        animal = new Animal();
    }

    @Test
    public void testAnimalGetFood() throws Exception {
        Assert.assertEquals(List.of("Трава", "Различные растения"), animal.getFood("Травоядное"));
    }

    @Test
    public void testAnimalException() {
        Assert.assertThrows(Exception.class, () -> animal.getFood("Гибрид"));
    }

    @Test
    public void testAnimalGetFamily() {
        String actualFamily = animal.getFamily();
        Assert.assertEquals(expectedFamily,actualFamily);
    }
}
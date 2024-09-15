import com.example.Animal;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

@RunWith(Parameterized.class)

public class AnimalWithParametersTest {

private final String animalKind;
private final List<String> food;
private static final List<String> FOOD_HERBIVORE = List.of("Трава", "Различные растения");
private static final List<String> FOOD_PREDATOR = List.of("Животные", "Птицы", "Рыба");
private Animal animal;

    public AnimalWithParametersTest(String animalKind, List<String> food) {
        this.animalKind = animalKind;
        this.food = food;
    }

    @Parameterized.Parameters
    public static Object[][] getParams() {
        return new Object[][] {
                {"Травоядное", FOOD_HERBIVORE},
                {"Хищник", FOOD_PREDATOR},
        };
    }
    @Before
    public void createAnimal() {
        animal = new Animal();
    }

    @Test
    public void testAnimalGetFoodWithParams() throws Exception {
        List<String> actual = animal.getFood(animalKind);
        Assert.assertEquals(food,actual);
    }
}

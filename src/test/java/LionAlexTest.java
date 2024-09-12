import com.example.Feline;
import com.example.LionAlex;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;


public class LionAlexTest {
    Feline feline;
    LionAlex lionAlex;
    int expectedKittensCount = 0;
    List<String> expectedAlexFriends = List.of("Марти", "Глория", "Мелмон");
    String expectedAlexPlaceOfLiving = "Нью-Йоркский зоопарк";

    @Before
    public void createLionAlex() throws Exception {
        lionAlex = new LionAlex(feline);
    }

    @Test
    public void testLionAlexGetKittens() {
        int actualKittensCount = lionAlex.getKittens();
        Assert.assertEquals(expectedKittensCount,actualKittensCount);
    }

    @Test
    public void testLionAlexGetPlaceOfLiving() {
        String actualAlexPlaceOfLiving = lionAlex.getPlaceOfLiving();
        Assert.assertEquals(expectedAlexPlaceOfLiving,actualAlexPlaceOfLiving);
    }

    @Test
    public void testLionAlexGetFriends() {
        List<String> actualAlexFriends = lionAlex.getFriends();
        Assert.assertEquals(expectedAlexFriends,actualAlexFriends);
    }
}
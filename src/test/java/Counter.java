import org.testng.Assert;
import org.testng.annotations.Test;

public class Counter {

    OriginalCounter originalCounter = new OriginalCounter();
    @Test(priority = 1)
    public void testCountLetters1(){
        String test1 = "How are you";
        Assert.assertEquals(originalCounter.countLetters(test1, 'o'), 2);
    }

    @Test(priority = 1)
    public void testCountLetters2(){
        String test1 = "I am Ok";
        Assert.assertEquals(originalCounter.countLetters(test1, 'i'), 1);
    }

    @Test(priority = 0)
    public void testCountLetters3(){
        String test1 = "AAaaFFaa";
        Assert.assertEquals(originalCounter.countLetters(test1, 'a'), 6);
    }

    @Test(priority = 0)
    public void testCountLetters4(){
        String test1 = "AAaaFFaa";
        Assert.assertEquals(originalCounter.countLetters(test1, 'h'), 0);
    }
}

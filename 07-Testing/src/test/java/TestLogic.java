import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestLogic {

  @Test
  public void testFindMax() {
    Assertions.assertEquals(4, MainClass.findMax(new int[]{1,2,3,4}));
    Assertions.assertEquals(5, MainClass.findMax(new int[]{4,5,2,3}));
    Assertions.assertNotEquals(5, MainClass.findMax(new int[]{5,6,7,4}));
  }

  @Test
  public void findMinTest() {
    Assertions.assertEquals(1, MainClass.findMin(new int[]{3,2,4,5,1}));
    Assertions.assertEquals(3, MainClass.findMin(new int[]{4,6,5,3,8}));
    Assertions.assertNotEquals(1, MainClass.findMin(new int[]{3,4,2,1,6,0}));
  }
}

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class CalcTest {
    Calculator calc = new Calculator();

    @Test
    public void testCalculation(){
        int finalWallArea = 100;
        int finalExtraArea = 15;
        int finalArea = finalWallArea - finalExtraArea;

        Assertions.assertEquals(85, finalArea, "The calculation is incorrect");
    }
}

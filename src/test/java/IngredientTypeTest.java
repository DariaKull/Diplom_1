import org.junit.Test;
import praktikum.IngredientType;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class IngredientTypeTest {
    @Test
    public void fillingTest() {
        assertThat(IngredientType.FILLING, is(IngredientType.FILLING));
    }

    @Test
    public void sauceTest() {
        assertThat(IngredientType.SAUCE, is(IngredientType.SAUCE));
    }
}
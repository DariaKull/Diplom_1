import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Ingredient;
import praktikum.IngredientType;

@RunWith(Parameterized.class)
public class IngredientTest {

    private final IngredientType type;
    private final String name;
    private final float price;
    private Ingredient ingredient;

    public IngredientTest(IngredientType type, String name, float price) {
        this.type = type;
        this.name = name;
        this.price = price;
    }

    @Parameterized.Parameters(name = "Создание бургеров. Тестовые данные {0}, {1}, {2}")
    public static Object[][] getParameters() {
        return new Object[][]{
                {IngredientType.SAUCE, "Брусничный соус", 25},
                {IngredientType.FILLING, "Котлета из говядины", 95}
        };
    }

    @Before
    public void setUp() {
        ingredient = new Ingredient(type, name, price);
    }

    @Test
    public void getPrice() {
        float tmpPrice = ingredient.getPrice();
        Assert.assertEquals("Цена ингридиента не соответсвует созданному", price, tmpPrice, 0);
    }

    @Test
    public void getName() {
        Assert.assertEquals("Имя ингридиента не соответствует созданному", name, ingredient.getName());
    }

    @Test
    public void getType() {
        Assert.assertEquals("Тип ингридиента не соответствует созданному", type, ingredient.getType());
    }
}
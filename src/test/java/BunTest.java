import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Bun;


@RunWith(Parameterized.class)
public class BunTest {
    private final String name;
    private final float price;
    private Bun bun;

    public BunTest(String name, float price) {
        this.name = name;
        this.price = price;
    }

    @Parameterized.Parameters(name = "Получение названия и цены булки. Тестовые данные: {0}, {1}")
    public static Object[][] getTestData() {
        return new Object[][]{
                {"red bun", 100},
                {"", 200},
                {"white bun white bun white bun white bun white bun white bun white bun white bun", 100},
                {null, 100},
                {"red&bun!", 300},
                {"black bun", -100},
                {"white bun", 0},
                {"red bun", 100.1f}
        };
    }

    @Before
    public void setUp() {
        bun = new Bun(name, price);
    }

    @Test
    public void getNameTest() {
        Assert.assertEquals(name, bun.getName());
    }

    @Test
    public void getPriceTest() {
        Assert.assertEquals(price, bun.getPrice(), 0);
    }
}
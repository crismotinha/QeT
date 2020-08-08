package tests;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;

public class OpenSiteTest {
    private WebDriver driver;

    @Before
    public void setUp() throws Exception{
        System.setProperty("webdriver.chrome.driver", "/home/crismotinha/Documents/UFF-QeT/chromedriver");
        driver = new ChromeDriver();
    }
    @After
    public void tearDown() throws Exception{
        driver.quit();
    }
    @Test
    public void test() throws InterruptedException {
        String url = "http://marcelodebittencourt.com/demopages/demosimplesearch/";
        driver.get(url);

        String expectedTitle = "Demo Simple Search using JavaScript";
        String actualTitle = driver.getTitle();
        Assert.assertTrue("Título da página difere do esperado", actualTitle.contentEquals(expectedTitle));

        Thread.sleep(3000);
    }
}

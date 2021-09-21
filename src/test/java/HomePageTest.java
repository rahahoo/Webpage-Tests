import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.Browser;

public class HomePageTest {

    @BeforeMethod
    public void setup(){
        Browser.setUp();
    }
    @AfterMethod
    public void quit(){
        Browser.quit();
    }
    @Test
    public void goToHomePage(){
        HomePage.goToPage();
    }
}

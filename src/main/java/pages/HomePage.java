package pages;

import utils.Browser;

public class HomePage {

    public static void goToPage(){
        Browser.driver.get("https://www.endava.com/");
    }
}

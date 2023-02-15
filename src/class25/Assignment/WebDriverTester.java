package class25.Assignment;

public class WebDriverTester {
    public static void main(String[] args) {
        WebDriver[] webDrivers={new ChromeDriver(), new FirefoxDriver()};
        for(WebDriver w:webDrivers){
            w.openBrowser();
            w.maximizeWindow();
            w.findElement();
            w.closeBrowser();
        }
    }
}

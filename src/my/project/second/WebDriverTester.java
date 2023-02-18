package my.project.second;
public class WebDriverTester {
    public static void main(String[] args) {
        WebDriver[] webDrivers={new ChromeDriver(),new FirefoxDriver(),new SafariDriver()};
        for(WebDriver w:webDrivers){
            w.open();
            System.out.println(w.getTitle());
            w.close();


        TakesScreenShot[] takesScreenShots={new ChromeDriver(),new FirefoxDriver(),new SafariDriver()};
        for(TakesScreenShot t:takesScreenShots){
            t.getScreenShot();
        }

            //navigate() is not available
            //TakesScreenShort() is not available

        }
    }
}


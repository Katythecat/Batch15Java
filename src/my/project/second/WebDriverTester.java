package my.project.second;

import class24.File;

public class WebDriverTester {
    public static void main(String[] args) {
        WebDriver[] webDrivers = {new ChromeDriver(), new FirefoxDriver(), new SafariDriver()};
        for (WebDriver w : webDrivers) {
            w.open();
            System.out.println(w.getTitle());
            w.close();

            System.out.println("----------");

            TakesScreenShot[] takesScreenShots = {new ChromeDriver(), new FirefoxDriver(), new SafariDriver()};
            for (TakesScreenShot t : takesScreenShots) {
                t.getScreenShot();
            }


            System.out.println("----------");
            //navigate() is not available

            ChromeDriver chromeDriver=new ChromeDriver();
            FirefoxDriver firefoxDriver=new FirefoxDriver();
            SafariDriver safariDriver=new SafariDriver();

            chromeDriver.open();
            chromeDriver.getScreenShot();
            System.out.println(chromeDriver.getTitle());
            chromeDriver.navigate();
            chromeDriver.close();

            firefoxDriver.open();
            firefoxDriver.getScreenShot();
            System.out.println(firefoxDriver.getTitle());
            firefoxDriver.navigate();
            firefoxDriver.close();

            safariDriver.open();
            safariDriver.getScreenShot();
            System.out.println(safariDriver.getTitle());
            safariDriver.navigate();
            safariDriver.close();
        }
    }
}



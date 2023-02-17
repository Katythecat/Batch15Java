package my.project.second;
public class Test {
    public static void main(String[] args) {
        WebDriver[] webDrivers={new ChromeDriver(),new FirefoxDriver(),new SafariDriver()};
        for(WebDriver w:webDrivers){
            w.open();
            System.out.println(w.getTitle());
            w.close();
            //navigate() is not available
            //TakesScreenShort Interface is not extends ????

        }
    }
}


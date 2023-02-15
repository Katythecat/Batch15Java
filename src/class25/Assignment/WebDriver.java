package class25.Assignment;

public interface WebDriver {
    void openBrowser();
    void maximizeWindow();
    void findElement();
    void closeBrowser();

}

class ChromeDriver implements WebDriver {

    @Override
    public void openBrowser() {
        System.out.println("Open ChromeDriver browser");

    }
    @Override
    public void maximizeWindow() {
        System.out.println("Maximize window in ChromeDriver");
    }

    @Override
    public void findElement() {
        System.out.println("Find element in ChromeDriver");
    }
    @Override
    public void closeBrowser() {
        System.out.println("Close ChromeDriver browser");
    }
}

class FirefoxDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Open FirefoxDriver browser");

    }
    @Override
    public void maximizeWindow() {
        System.out.println("Maximize window in FirefoxDriver");
    }

    @Override
    public void findElement() {
        System.out.println("Find element in FirefoxDriver");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close FirefoxDriver browser");
    }
}
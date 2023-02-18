package my.project.second;

public interface WebDriver {
    void open();
    void close();
    String getTitle();
}
interface TakesScreenShot {
    void getScreenShot();
}

interface RemoteWebDriver extends WebDriver, TakesScreenShot{
    void navigate();
}
class ChromeDriver implements RemoteWebDriver {
    @Override
    public void open() {
        System.out.println("Open Chrome browser");
    }
    @Override
    public void close() {
        System.out.println("Close Chrome browser");
    }
    @Override
    public String getTitle() {
        return null;
    }
    @Override
    public void navigate() {
        System.out.println("Navigate chrome driver");
    }

    @Override
    public void getScreenShot() {
        System.out.println("Get screen shot Chrome browser");
    }
}

class FirefoxDriver implements RemoteWebDriver{
    @Override
    public void open() {
        System.out.println("Open Firefox browser");
    }
    @Override
    public void close() {
        System.out.println("Close Firefox browser");
    }
    @Override
    public String getTitle() {
        return null;
    }
    @Override
    public void navigate() {
        System.out.println("Navigate Firefox driver");
    }

    @Override
    public void getScreenShot() {
        System.out.println("Get screen shot Firefox browser");
    }
}

class SafariDriver implements RemoteWebDriver{
    @Override
    public void open() {
        System.out.println("Open Safari browser");
    }
    @Override
    public void close() {
        System.out.println("Close Safari browser");
    }
    @Override
    public String getTitle() {
        return null;
    }
    @Override
    public void navigate() {
        System.out.println("Navigate Safari driver");
    }

    @Override
    public void getScreenShot() {
        System.out.println("Get screen shot Safari browser");
    }
}
package class23;

public class WebDriver {
    public void startBrowser(){
        System.out.println("Starting the browser");
    }
    public void openURL(){
        System.out.println("Opening a url");
    }
    public void testLoginPage(){
        System.out.println("Checking if login page works");
    }
    public void closeBrowser(){
        System.out.println("Closing the browser");
    }
}

class Chrome extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("Starting Google Chrome");
    }
    @Override
    public void openURL() {
        System.out.println("Opening a url in Google Chrome");
    }
    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page in Chrome");
    }
    @Override
    public void closeBrowser() {
        System.out.println("Closing the Google Chrome ");
    }
}


class Safari extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("Starting Safari");
    }

    @Override
    public void openURL() {
        System.out.println("Opening a url in Safari");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page in Safari");
    }
    @Override
    public void closeBrowser() {
        System.out.println("Closing the Safari browser");
    }
}

class FireFox extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("Starting FireFox");
    }

    @Override
    public void openURL() {
        System.out.println("Opening a url in FireFox");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page in FireFox");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the FireFox browser");
    }
}



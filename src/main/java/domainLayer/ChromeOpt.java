package domainLayer;

import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOpt {

    public ChromeOptions setBrowser() {
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        options.addArguments("start-maximized");
        return options;
    }
}


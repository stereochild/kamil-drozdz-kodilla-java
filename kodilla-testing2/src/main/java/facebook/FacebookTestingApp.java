package facebook;

import config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_NAME = "//*[@id=\"u_0_i\"]";
    public static final String XPATH_LASTNAME = "//*[@id=\"u_0_k\"]";
    public static final String XPATH_SELECT_DAY = "//div[@class=\"_5k_5\"]/span/span/select[1]";
    public static final String XPATH_SELECT_MONTH = "//div[@class=\"_5k_5\"]/span/span/select[2]";
    public static final String XPATH_SELECT_YEAR = "//div[@class=\"_5k_5\"]/span/span/select[3]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement searchName = driver.findElement(By.xpath(XPATH_NAME));
        searchName.sendKeys("Andrzej");

        WebElement searchLastname = driver.findElement(By.xpath(XPATH_LASTNAME));
        searchLastname.sendKeys("Gołota");

        WebElement searchMail = driver.findElement(By.name("reg_email__"));
        searchMail.sendKeys("andrzej.golota@gmail.com");

        WebElement searchMail2 = driver.findElement(By.name("reg_email_confirmation__"));
        searchMail2.sendKeys("andrzej.golota@gmail.com");

        WebElement searchPass = driver.findElement(By.id("u_0_u"));
        searchPass.sendKeys("********");

        WebElement selectDay = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select selectTheDay = new Select(selectDay);
        selectTheDay.selectByIndex(5);

        WebElement selectMonth = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectTheMonth = new Select(selectMonth);
        selectTheMonth.selectByIndex(1);

        WebElement selectYear = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectTheYear = new Select(selectYear);
        selectTheYear.selectByIndex(50);

        WebElement radioButtonSex = driver.findElement(By.cssSelector("input[value='2'"));
        radioButtonSex.click();
    }
}

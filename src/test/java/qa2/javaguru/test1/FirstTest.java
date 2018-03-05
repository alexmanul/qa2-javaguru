package qa2.javaguru.test1;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

    @Test
    public void javaGuruTest1() {
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.javaguru.lv/");

        WebElement element1 = driver.findElement(By.className("course"));
        element1.click();

        WebElement element2 = driver.findElement(By.className("registrationCourse"));
        element2.click();

        driver.quit();
    }

    @Test
    public void javaGuruTest2() {
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://docs.google.com/forms/d/e/1FAIpQLSeu7sETvyNgltLvhYL1nhHfSRTax2mM637oVDG2c0zG5KquKg/viewform");

        WebElement element1 = driver.findElement(By.id("entry_1000000"));
        element1.sendKeys("Студенты QA тестируют Ваш сайт!");

        WebElement element2 = driver.findElement(By.id("entry_1000001"));
        element2.sendKeys("Студенты QA тестируют Ваш сайт!");

        WebElement element3 = driver.findElement(By.id("entry_1000002"));
        element3.sendKeys("Студенты QA тестируют Ваш сайт!");

        WebElement element4 = driver.findElement(By.id("entry_1000003"));
        element4.sendKeys("Студенты QA тестируют Ваш сайт!");

        WebElement element5 = driver.findElement(By.id("group_738971122_2"));
        element5.click();

        WebElement element6 = driver.findElement(By.id("entry_1000004"));
        element6.sendKeys("Студенты QA тестируют Ваш сайт!");

        WebElement element7 = driver.findElement(By.id("group_1887084786_2"));
        element7.click();

        WebElement element8 = driver.findElement(By.id("entry_1696450117"));
        element8.sendKeys("Студенты QA тестируют Ваш сайт!");

        WebElement element9 = driver.findElement(By.id("entry_1000006"));
        element9.sendKeys("Студенты QA тестируют Ваш сайт!");

        WebElement element10 = driver.findElement(By.id("entry_1091055623"));
        element10.sendKeys("Студенты QA тестируют Ваш сайт!");

        WebElement element15 = driver.findElement(By.id("ss-submit"));
//        element15.click();

        driver.quit();
    }
}
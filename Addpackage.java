import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.*;

public class Addpackage {
    public static void main(String[] args) throws InterruptedException, AWTException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ecspro-qa.kloudship.com");
        Thread.sleep(5000);

        //login
        driver.findElement(By.xpath("//input[@id='login-email']")).sendKeys("kloudship.qa.automation@mailinator.com");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys("Password1");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@id='login-btn']")).click();
        Thread.sleep(8000);

        //select package types
        driver.findElement(By.xpath("//div[@class='row count-card-wrapper']//mat-card[8]")).click();
        Thread.sleep(5000);

        //add package
        driver.findElement(By.xpath("//button[@class='mat-focus-indicator button-disabled mat-icon-button mat-button-base ng-star-inserted']")).click();
        Thread.sleep(5000);
        //add name
        driver.findElement(By.xpath("//div[contains(@class, 'mat-form-field-infix')]//input[@formcontrolname='name']")).sendKeys("Ritu_Sharma");
       //add length
        WebElement length = driver.findElement(By.xpath("//div[contains(@class, 'mat-form-field-infix')]//input[@formcontrolname='length']"));
        length.clear();
        Thread.sleep(1000); // Ensure field is cleared before input
        length.sendKeys("16");
        Thread.sleep(3000);
        //add width
        WebElement width = driver.findElement(By.xpath("//div[contains(@class, 'mat-form-field-infix')]//input[@formcontrolname='width']"));
        width.clear();
        Thread.sleep(1000); // Ensure field is cleared before input
        width.sendKeys("16");
        Thread.sleep(3000);
        //add height
        WebElement height = driver.findElement(By.xpath("//div[contains(@class, 'mat-form-field-infix')]//input[@formcontrolname='height']"));
        height.clear();
        Thread.sleep(1000); // Ensure field is cleared before input
        height.sendKeys("16");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//mat-icon[@class='mat-icon notranslate material-icons mat-ligature-font mat-icon-no-color'][normalize-space()='check']")).click();
        Thread.sleep(4000);

        //logout
        driver.findElement(By.xpath("//mat-icon[normalize-space()='more_vert']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[contains(@class, 'mat-menu-content')]//button[contains(@class, 'mat-menu-item')]//mat-icon[normalize-space()='power_settings_new']")).click();


    }
}



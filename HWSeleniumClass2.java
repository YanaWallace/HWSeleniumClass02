package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWSeleniumClass2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[text()='Create new account']")).click();
        Thread.sleep(1000);

        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys("Yaya");

        WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
        lastName.sendKeys("Wallace");

        WebElement email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
        email.sendKeys("onecallnevada@gmail.com");

        WebElement confirmEmail = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
        confirmEmail.sendKeys("onecallnevada@gmail.com");

        WebElement password = driver.findElement(By.xpath("//input[@id='password_step_input']"));
        password.sendKeys("999pass");

        WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
        month.sendKeys("May");

        WebElement birthDay = driver.findElement(By.xpath("//select[@id='day']"));
        birthDay.sendKeys("28");

        WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
        year.sendKeys("1977");

        WebElement gender = driver.findElement(By.xpath("//label[text()='female']"));
        gender.click();

        //closes the popUp
        WebElement signUp = driver.findElement(By.xpath("//button[text()='Sign Up']"));
        signUp.click();

        //slowing down execution of the program to see the SignUp button clicked
        Thread.sleep(1000);

        //closes the browser
        driver.quit();

    }

    }


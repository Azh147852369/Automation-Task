package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Registration_steps {

    WebDriver driver;

    @Given("Open chrome and navigate to codenboxautomationlab.com")
    public void open_the_Chrome_and_launch_the_application() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://codenboxautomationlab.com/registration-form/");

//        WebElement SignUp= driver.findElement(By.id("menu-item-202"));
//        Select selectOption= new Select(SignUp);
//        Thread.sleep(3000);
//
//        selectOption.selectByVisibleText("Registration Form");

//        driver.findElement(By.id("menu-item-202")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.linkText("Registration Form")).click();

    }

//    @When("Enter First Name and Last Name")
//    public void enter_the_FirstName_and_LastName()  {
//        WebElement FirstName= driver.findElement(By.id("nf-field-17"));
//        FirstName.click();
//        FirstName.sendKeys("Mahmoud");
//
//        driver.findElement(By.name("lname")).sendKeys("ElAzhary");
//
//    }

    @When("Enter First Name and Last Name.")
    public void enter_first_name_and_last_name() {
        WebElement FirstName = driver.findElement(By.id("nf-field-17"));
        FirstName.click();
        FirstName.sendKeys("Mahmoud");

        driver.findElement(By.name("lname")).sendKeys("ElAzhary");


    }


//    @And("Enter a valid Mobile Number")
//    public void enter_the_MobileNumber() throws InterruptedException {
//        driver.findElement(By.name("nf-field-20")).sendKeys("01140545950");
//        Thread.sleep(3000);
//    }

    @When("Enter a valid Mobile Number.")
    public void enter_a_valid_mobile_number() {
        WebElement Mobile = driver.findElement(By.id("nf-field-20"));
        Mobile.click();
        Mobile.sendKeys("01140545950");

    }
//
//    @And("Enter a valid E-mail that should be unique for every user")
//    public void enter_the_EmailAdress () throws InterruptedException {
//        driver.findElement(By.name("email")).sendKeys("mahmoudelazhary1@gmail.com");
//        Thread.sleep(3000);
//    }

    @When("Enter a valid E-mail that should be unique for every user.")
    public void enter_a_valid_e_mail_that_should_be_unique_for_every_user() throws InterruptedException {
        WebElement Email = driver.findElement(By.id("nf-field-19"));
        Email.click();
        Email.sendKeys("mahmoudelazhary1@gmail.com");

    }

//
//    //    dropdown
//    @And("Select any option from the drop-down list-Course")
//    public void Select_An_Option_From_DropdownList_Course() throws InterruptedException {
//        WebElement dropDownMenuCourse= driver.findElement(By.id("nf-field-22"));
//        Select selectOption= new Select(dropDownMenuCourse);
//        Thread.sleep(3000);
//
//        selectOption.selectByValue("selenium-automation");
//        Thread.sleep(3000);
//    }
//
@When("Select any option from the drop-down list-Course.")
public void select_any_option_from_the_drop_down_list_course() {
    WebElement dropDownMenuCourse = driver.findElement(By.id("nf-field-22"));
    Select selectOption = new Select(dropDownMenuCourse);
//        Thread.sleep(3000);

    selectOption.selectByValue("selenium-automation");
//        Thread.sleep(3000);

}

//    @And("Select any option from the drop-down list-Month")
//    public void Select_An_Option_From_DropdownList_Month() throws InterruptedException {
//        WebElement dropDownMenuMonth= driver.findElement(By.id("nf-field-24"));
//        Select selectOption= new Select(dropDownMenuMonth);
//        Thread.sleep(3000);
//
//        selectOption.selectByValue("june");
//        Thread.sleep(3000);
//    }
//
@When("Select any option from the drop-down list-Month.")
public void select_any_option_from_the_drop_down_list_month() {
    WebElement dropDownMenuMonth= driver.findElement(By.id("nf-field-24"));
        Select selectOption= new Select(dropDownMenuMonth);
//        Thread.sleep(3000);
//
        selectOption.selectByValue("june");
//        Thread.sleep(3000);

}


//    @And("Select any radio button")
//    public void Select_A_RadioButton() throws InterruptedException {
//       driver.findElement(By.id("radio-button-1")).click();
//       Thread.sleep(3000);
//    }

    @When("Select any radio button.")
    public void select_any_radio_button() throws InterruptedException {
//        WebElement Radio = driver.findElement(By.id("nf-field-23-1"));
//        Radio.click();

        Actions actions= new Actions(driver);

        actions.moveToElement(driver.findElement(By.id("nf-field-23-1"))).click().perform();

    }

//
//    @And("Click the Register button")
//    public void Register() throws InterruptedException {
//        driver.findElement(By.id("nf-field-15")).click();
//
//    }

    @When("Click the Register button.")
    public void click_the_register_button() throws InterruptedException {
        WebElement Register = driver.findElement(By.id("nf-field-15"));
        Register.click();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(10000);
    }

//
//    // assert
//    @Then("blabla")
//    public void blabla()
//    {
//        WebElement RegistrationComplete= driver.findElement(By.id("nf-form-3-cont"));
//        String Test= RegistrationComplete.getText();
//        System.out.println(Test);
//        Assert.assertEquals(Test,"Your registration is completed. We will contact with you soon. Thank you !");
//    }

    @Then("Confirm registration is complete")
    public void blabla() {
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement RegistrationComplete= driver.findElement(By.xpath("//*[@id=\"nf-form-3-cont\"]/div/div[1]"));
        String Test= RegistrationComplete.getText();
        System.out.println(Test);
        Assert.assertEquals(Test,"Your registration is completed. We will contact with you soon. Thank you !");

    }

}


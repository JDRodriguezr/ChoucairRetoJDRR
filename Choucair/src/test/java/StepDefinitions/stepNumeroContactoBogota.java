package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class stepNumeroContactoBogota {
    WebDriver driver = null;

    @Given("que Andres se encuentra en la pagina de empleos de Choucair testing")
    public void que_Andres_se_encuentra_en_la_pagina_de_empleos_de_Choucair_testing() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\julia\\IdeaProjects\\Choucair\\src\\webdrivers\\Chrome\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.choucairtesting.com/empleos-testing/");
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    }
    @When("busque la informacion de contacto de la empresa en la pagina")
    public void busque_la_informacion_de_contacto_de_la_empresa_en_la_pagina() {

        WebElement elementoNumeroBogota = driver.findElement(By.xpath("//div[contains(text(),'(57)(1) 256 94 55')]"));
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementoNumeroBogota);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


    }
    @Then("se mostrara la informacion correcta para cada forma de contacto con la empresa")
    public void se_mostrara_la_informacion_correcta_para_cada_forma_de_contacto_con_la_empresa() throws InterruptedException{

        driver.getPageSource().contains("(57)(1) 256 94 55");
        Thread.sleep(3000);
        if (driver != null) {
            driver.quit();
        }
    }

}

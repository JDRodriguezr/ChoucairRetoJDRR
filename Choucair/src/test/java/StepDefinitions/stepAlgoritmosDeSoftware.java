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

public class stepAlgoritmosDeSoftware {
    WebDriver driver = null;

    @Given("que Oscar se encuentra en la pagina de empleos de Choucair testing")
    public void que_oscar_se_encuentra_en_la_pagina_de_empleos_de_choucair_testing() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\julia\\IdeaProjects\\Choucair\\src\\webdrivers\\Chrome\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.choucairtesting.com/empleos-testing/");
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    }
    @When("seleccione Algoritmos de software")
    public void seleccione_algoritmos_de_software() {

        WebElement elementoAlgoritmosDeSoftware = driver.findElement(By.linkText("Algoritmos de software"));
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementoAlgoritmosDeSoftware);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        elementoAlgoritmosDeSoftware.click();

    }
    @Then("debe ser dirigido a la pagina de Algoritmos de software")
    public void debe_ser_dirigido_a_la_pagina_de_algoritmos_de_software() throws InterruptedException{

        driver.getPageSource().contains("Curso");
        Thread.sleep(3000);
        if (driver != null) {
            driver.quit();
        }
    }

}

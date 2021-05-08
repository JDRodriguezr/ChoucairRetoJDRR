package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class stepTablaBuscarEmpleos {

    WebDriver driver;

    @Given("que Julian se encuentra en la pagina de empleos de Choucair testing")
    public void que_julian_se_encuentra_en_la_pagina_de_empleos_de_choucair_testing() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\julia\\IdeaProjects\\Choucair\\src\\webdrivers\\Chrome\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.choucairtesting.com/empleos-testing/");
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    }
    @When("Julian ingrese texto en la textbox de palabras clave")
    public void julian_ingrese_texto_en_la_textbox_de_palabras_clave() throws InterruptedException{

        WebElement elementoInput = driver.findElement(By.id("search_keywords"));
        elementoInput.sendKeys("Performance");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Actions a = new Actions(driver); //Scroll para tener visibilidad del link haciendo uso de la clase Actions
        a.moveToElement(elementoInput);
        a.perform();

        driver.findElement(By.xpath("//input[@type='submit']")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Thread.sleep(6000);
        driver.findElement(By.xpath("//h3[contains(.,'Performance')]")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Thread.sleep(6000);

    }
    @Then("se visualizan los trabajos relacionados con la palabra clave")
    public void se_visualizan_los_trabajos_relacionados_con_la_palabra_clave() throws InterruptedException{

        driver.getPageSource().contains("Performance");
        Thread.sleep(3000);
        if (driver != null) {
            driver.quit();
        }
    }
}

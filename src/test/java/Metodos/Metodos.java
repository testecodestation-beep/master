package Metodos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {
	
	WebDriver driver;
	
	public void clicar(By elemento) {
		driver.findElement(elemento).click();
		
	}
	public void preencherCampo(String texto,By elemento) {
	driver.findElement(elemento).sendKeys(texto);
	
	
	
	}
	public void abrirNavegador(String url) {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	public void pausa(int tempo) throws InterruptedException {
		Thread.sleep(tempo);
	}

}

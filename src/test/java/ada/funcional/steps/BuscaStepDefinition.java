package ada.funcional.steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;

public class BuscaStepDefinition {

    WebDriver driver;

    @Dado("que usuario acessa página home")
    public void que_usuario_acessa_página_home() {
        //WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\igor.dantas\\Cursos-Projetos\\Curso-Java\\ModeloAulas\\simulacao\\src\\test\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
    }

    @Quando("digitar {string}")
    public void digitar(String palavra) {
        driver.findElement(By.name("q")).sendKeys(palavra);
    }

    @Quando("clicar no botão pesquisar")
    public void clicar_no_botão() throws InterruptedException {
        //String xpath = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).getText();
        Thread.sleep(2000);
        driver.findElement(By.className("gNO89b")).click();
    }

    @Entao("deve retornar {string}")
    public void deve_retornar(String palavra) throws InterruptedException {
        Thread.sleep(2000);
        String titulo = driver.getTitle();
        Assertions.assertTrue(titulo.contains(palavra));
        //String nomeResultado = driver.findElement(By.className("SPZz6b")).getText();
        //Assertions.assertEquals(palavra.toUpperCase(),nomeResultado.toUpperCase());
    }

    @Quando("submeter formulario")
    @E("teclar enter")
    public void submeter() {
        driver.findElement(By.className("gNO89b")).submit();
    }
}

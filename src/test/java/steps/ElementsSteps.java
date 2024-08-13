package steps;

import common.PageManager;
import io.cucumber.java.en.*;
import tests.BaseTest;

import static org.assertj.core.api.Assertions.assertThat;

public class ElementsSteps extends BaseTest {
    PageManager pageManager = new PageManager();

    @Given("Open the Elements page")
    public void openElementsPage() {
        pageManager.elementsPage.open();
    }

    @When("Click on 'Button' button")
    public void clickOnButton() {
        pageManager.elementsPage.btnButton.click();
    }

    @When("Click on 'Click Me' button")
    public void clickOnClickMeButton() {
        pageManager.elementsPage.btnClickMe.click();
    }

    @Then("See the message {string}")
    public void verifyClickMessage(String expectedMessage) {
        assertThat(pageManager.elementsPage.getClickMessage()).isEqualTo(expectedMessage);
    }
}

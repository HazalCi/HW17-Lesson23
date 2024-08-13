package steps;

import common.PageManager;
import io.cucumber.java.en.*;
import tests.BaseTest;

import static org.assertj.core.api.Assertions.assertThat;

public class WebTablesSteps extends BaseTest {
    PageManager pageManager = new PageManager();

    @Given("Open the WebTables page")
    public void openWebTablesPage() {

        pageManager.webTablesPage.open();
    }

    @When("Add a new record with {string}, {string}, {string}, {string}, {string} and {string}")
    public void addNewRecord(String firstName, String lastName, String email, String age, String salary, String department) {
        pageManager.webTablesPage.addRecord(firstName, lastName, email, Integer.parseInt(age), Integer.parseInt(salary), department);
    }

    @When("Change the age of the record to {int}")
    public void changeAgeRecord(int age) {
        pageManager.webTablesPage.changeAgeRecord(age);
    }

    @Then("See the age of the record as {string}")
    public void verifyAgeRecord(String expectedAge) {
        assertThat(pageManager.webTablesPage.getAgeRecord()).isEqualTo(expectedAge);
    }
}

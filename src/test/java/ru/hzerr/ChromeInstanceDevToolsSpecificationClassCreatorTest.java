package ru.hzerr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.hzerr.cdp.creator.model.ChromeDevToolsSpecification;
import ru.hzerr.cdp.creator.ChromeInstanceDevToolsSpecificationClassCreator;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ChromeInstanceDevToolsSpecificationClassCreatorTest {

    private static final Path SPECIFICATION_PATH = Paths.get("C:\\Innova\\devtools-specification.json");

    @Test
    public void readChromeDevToolsSpecificationTest() {
        ChromeInstanceDevToolsSpecificationClassCreator creator = new ChromeInstanceDevToolsSpecificationClassCreator();
        creator.setChromeDevToolsSpecificationPath(SPECIFICATION_PATH);

        ChromeDevToolsSpecification chromeDevToolsSpecification = Assertions.assertDoesNotThrow(creator::createChromeDevToolsSpecification);
        System.out.println("ChromeDevToolsSpecification: " + chromeDevToolsSpecification);
    }

    @Test
    public void createChromeDevToolsSpecificationTypesTest() {
        ChromeInstanceDevToolsSpecificationClassCreator creator = new ChromeInstanceDevToolsSpecificationClassCreator();
        creator.setChromeDevToolsSpecificationPath(SPECIFICATION_PATH);

        Assertions.assertDoesNotThrow(creator::createTypes);
    }

    @Test
    public void createChromeDevToolsSpecificationEventsTest() {
        ChromeInstanceDevToolsSpecificationClassCreator creator = new ChromeInstanceDevToolsSpecificationClassCreator();
        creator.setChromeDevToolsSpecificationPath(SPECIFICATION_PATH);

        Assertions.assertDoesNotThrow(creator::createEvents);
    }
}

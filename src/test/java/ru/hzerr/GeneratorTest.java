package ru.hzerr;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;
import ru.hzerr.generator.ChromeDevToolsSpecificationObject;
import ru.hzerr.generator.SpecClassBuilder;
import ru.hzerr.utils.JsonUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class GeneratorTest {

    private static final String SPECIFICATION_PATH = "C:\\Innova\\devtools-specification.json";

    @Test
    public void readObjectTest() throws IOException {
        ChromeDevToolsSpecificationObject chromeDevToolsSpecificationObject = JsonUtils.readValue(FileUtils.readFileToString(new File(SPECIFICATION_PATH), StandardCharsets.UTF_8), ChromeDevToolsSpecificationObject.class);
        System.out.println("ChromeDevToolsSpecificationObject: " + chromeDevToolsSpecificationObject);
    }

    @Test
    public void generateTest() throws IOException {
        ChromeDevToolsSpecificationObject chromeDevToolsSpecificationObject = JsonUtils.readValue(FileUtils.readFileToString(new File(SPECIFICATION_PATH), StandardCharsets.UTF_8), ChromeDevToolsSpecificationObject.class);
        System.out.println("ChromeDevToolsSpecificationObject: " + chromeDevToolsSpecificationObject);

        File output = new File("C:\\Users\\HZERR\\IdeaProjects\\HiddenOfficalChromeAutomation\\src\\main\\java\\ru\\hzerr\\generated");

        SpecClassBuilder specClassBuilder = new SpecClassBuilder();
        specClassBuilder.generateDomains(output, chromeDevToolsSpecificationObject);
    }
}

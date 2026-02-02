package ru.hzerr.cdp.creator;

import ru.hzerr.cdp.creator.model.ChromeDevToolsSpecification;

public interface IChromeInstanceDevToolsSpecificationClassCreator {

    ChromeDevToolsSpecification createChromeDevToolsSpecification();
    void createTypes();
    void createRequests();
    void createEvents();
}

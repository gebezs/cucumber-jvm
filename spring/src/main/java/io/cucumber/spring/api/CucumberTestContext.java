package io.cucumber.spring.api;

public final class CucumberTestContext {
    public static final String SCOPE_CUCUMBER_GLUE = "cucumber-glue";

    // Suppress default constructor for noninstantiability
    private CucumberTestContext() {
        throw new AssertionError();
    }
}

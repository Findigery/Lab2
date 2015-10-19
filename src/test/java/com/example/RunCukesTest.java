package com.example;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty","html:build/cucumber-html-report"},
features = "src/test/resources",
glue = "com.example")
public class RunCukesTest {
}
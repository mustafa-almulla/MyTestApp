package io.github.jhipster.application.mytest.app.cucumber.stepdefs;

import io.github.jhipster.application.mytest.app.MyTestApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = MyTestApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}

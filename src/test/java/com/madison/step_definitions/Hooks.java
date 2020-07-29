package com.madison.step_definitions;

import com.madison.utilities.Driver;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.*;


import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void setUp(){
        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.get().manage().window().fullscreen();
    }

    @After
    public void tearDown(Scenario scenario){
        Driver.closeDriver();
    }
}

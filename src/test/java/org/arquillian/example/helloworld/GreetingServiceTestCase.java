package org.arquillian.example.helloworld;

import javax.inject.Inject;
import org.arquillian.autodeployer.EnableMavenBuildDeployment;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Arquillian.class)
@EnableMavenBuildDeployment
public class GreetingServiceTestCase {

    @Inject
    private GreetingService service;

    @Test
    public void shouldGreetTheWorld() throws Exception {
        Assert.assertEquals("Hello, World!",
            service.greet("World"));
    }
}

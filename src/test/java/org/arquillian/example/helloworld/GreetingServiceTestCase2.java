package org.arquillian.example.helloworld;

import javax.inject.Inject;
import org.arquillian.autodeployer.EnableFileDeployment;
import org.jboss.arquillian.container.test.api.BeforeDeployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.Archive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Arquillian.class)
@EnableFileDeployment("target/arquillian-example-helloworld-0.0.1-SNAPSHOT.war")
public class GreetingServiceTestCase2 {

    @BeforeDeployment
    public static Archive printArchive(Archive archive) {
        System.out.println(archive.toString(true));
        return archive;
    }

    @Inject
    private GreetingService service;

    @Test
    public void shouldGreetTheWorld() throws Exception {
        Assert.assertEquals("Hello, World!",
            service.greet("World"));
    }
}
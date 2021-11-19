package com.gachokaerick.eshop.notification;

import com.gachokaerick.eshop.notification.NotificationApp;
import com.gachokaerick.eshop.notification.config.TestSecurityConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { NotificationApp.class, TestSecurityConfiguration.class })
public @interface IntegrationTest {
}

package io.gary.bestshop.notification.config;

import io.gary.bestshop.notification.messaging.MessagingChannels;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBinding(MessagingChannels.class)
public class StreamBindingConfig {

}

package io.gary.bestshop.notification.messaging;


import io.gary.bestshop.messaging.event.order.OrderCancelledEvent;
import io.gary.bestshop.messaging.event.order.OrderCompletedEvent;
import io.gary.bestshop.messaging.event.order.OrderCreatedEvent;
import io.gary.bestshop.messaging.event.order.OrderDeliveredEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;


@Slf4j
@Component
public class OrderEventListener {

    @StreamListener(MessagingChannels.ORDER_CREATED_INPUT)
    public void handleOrderCreatedEvent(OrderCreatedEvent event) {

        log.info("Order created: {}", event.getOrder());
    }

    @StreamListener(MessagingChannels.ORDER_DELIVERED_INPUT)
    public void handleOrderDeliveredEvent(OrderDeliveredEvent event) {

        log.info("Order delivered: {}", event.getOrder());
    }

    @StreamListener(MessagingChannels.ORDER_CANCELLED_INPUT)
    public void handleOrderCancelledEvent(OrderCancelledEvent event) {

        log.info("Order cancelled: {}", event.getOrder());
    }

    @StreamListener(MessagingChannels.ORDER_COMPLETED_INPUT)
    public void handleOrderCompletedEvent(OrderCompletedEvent event) {

        log.info("Order completed: {}", event.getOrder());
    }
}

package io.gary.bestshop.notification.messaging;

import io.gary.bestshop.messaging.event.product.ProductCreatedEvent;
import io.gary.bestshop.messaging.event.product.ProductDeletedEvent;
import io.gary.bestshop.messaging.event.product.ProductReviewAddedEvent;
import io.gary.bestshop.messaging.event.product.ProductUpdatedEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ProductEventListener {

    @StreamListener(MessagingChannels.PRODUCT_CREATED_INPUT)
    public void handleProductCreatedEvent(ProductCreatedEvent event) {

        log.info("Product created: {}", event.getNewProduct());
    }

    @StreamListener(MessagingChannels.PRODUCT_UPDATED_INPUT)
    public void handleProductUpdatedEvent(ProductUpdatedEvent event) {

        log.info("Product updated: {}", event.getUpdatedProduct());
    }

    @StreamListener(MessagingChannels.PRODUCT_DELETED_INPUT)
    public void handleProductDeletedEvent(ProductDeletedEvent event) {

        log.info("Product deleted: {}", event.getDeletedProduct());
    }

    @StreamListener(MessagingChannels.PRODUCT_REVIEW_ADDED_INPUT)
    public void handleProductReviewAddedEvent(ProductReviewAddedEvent event) {

        log.info("Product review added: productId={}, review={}", event.getProduct().getId(), event.getNewReview());
    }
}

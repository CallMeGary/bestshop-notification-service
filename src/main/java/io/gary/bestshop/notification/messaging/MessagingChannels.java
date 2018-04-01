package io.gary.bestshop.notification.messaging;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface MessagingChannels {

    String PROFILE_CREATED_INPUT = "profileCreatedInput";
    @Input(PROFILE_CREATED_INPUT)
    MessageChannel profileCreatedInput();


    String PROFILE_UPDATED_INPUT = "profileUpdatedInput";
    @Input(PROFILE_UPDATED_INPUT)
    MessageChannel profileUpdatedInput();


    String PROFILE_DELETED_INPUT = "profileDeletedInput";
    @Input(PROFILE_DELETED_INPUT)
    MessageChannel profileDeletedInput();


    String PRODUCT_CREATED_INPUT = "productCreatedInput";
    @Input(PRODUCT_CREATED_INPUT)
    MessageChannel productCreatedInput();


    String PRODUCT_UPDATED_INPUT = "productUpdatedInput";
    @Input(PRODUCT_UPDATED_INPUT)
    MessageChannel productUpdatedInput();


    String PRODUCT_DELETED_INPUT = "productDeletedInput";
    @Input(PRODUCT_DELETED_INPUT)
    MessageChannel productDeletedInput();


    String PRODUCT_REVIEW_ADDED_INPUT = "productReviewAddedInput";
    @Input(PRODUCT_REVIEW_ADDED_INPUT)
    MessageChannel productReviewAddedInput();


    String ORDER_CREATED_INPUT = "orderCreatedInput";
    @Input(ORDER_CREATED_INPUT)
    MessageChannel orderCreatedInput();


    String ORDER_CANCELLED_INPUT = "orderCancelledInput";
    @Input(ORDER_CANCELLED_INPUT)
    MessageChannel orderCancelledInput();


    String ORDER_DELIVERED_INPUT = "orderDeliveredInput";
    @Input(ORDER_DELIVERED_INPUT)
    MessageChannel orderDeliveredInput();


    String ORDER_COMPLETED_INPUT = "orderCompletedInput";
    @Input(ORDER_COMPLETED_INPUT)
    MessageChannel orderCompletedInput();

}

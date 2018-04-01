package io.gary.bestshop.notification.messaging;

import io.gary.bestshop.messaging.event.profile.ProfileCreatedEvent;
import io.gary.bestshop.messaging.event.profile.ProfileDeletedEvent;
import io.gary.bestshop.messaging.event.profile.ProfileUpdatedEvent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class ProfileEventListener {

    @StreamListener(MessagingChannels.PROFILE_CREATED_INPUT)
    public void handleProfileCreatedEvent(ProfileCreatedEvent event) {

        log.info("Profile created: {}", event.getNewProfile());
    }

    @StreamListener(MessagingChannels.PROFILE_UPDATED_INPUT)
    public void handleProfileUpdatedEvent(ProfileUpdatedEvent event) {

        log.info("Profile updated: {}", event.getUpdatedProfile());
    }

    @StreamListener(MessagingChannels.PROFILE_DELETED_INPUT)
    public void handleProfileDeletedEvent(ProfileDeletedEvent event) {

        log.info("Profile deleted: {}", event.getDeletedProfile());
    }
}

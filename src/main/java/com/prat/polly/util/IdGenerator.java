package com.prat.polly.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class IdGenerator {

    private static String POLL_ID_PREFIX = "POLL-";
    private static final Logger LOGGER = LoggerFactory.getLogger(IdGenerator.class);

    //TODO : Custom Id generator.
    public String getPollId() {
        return POLL_ID_PREFIX + getUniqueId();
    }

    private String getUniqueId() {
        String uniqueId = UUID.randomUUID().toString();
        return uniqueId;
    }

}

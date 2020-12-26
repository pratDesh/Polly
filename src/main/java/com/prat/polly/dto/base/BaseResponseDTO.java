package com.prat.polly.dto.base;

import org.apache.commons.collections4.CollectionUtils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class BaseResponseDTO<T> implements Serializable {

    private final T payload;
    private boolean success = Boolean.TRUE;
    private List<String> messages = new ArrayList<>();

    public BaseResponseDTO(T payload) {
        super();
        this.payload = payload;
    }

    public T getPayload() {
        return payload;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<String> getMessages() {
        return messages;
    }

    public void setMessages(List<String> messages) {
        if (CollectionUtils.isNotEmpty(messages)) {
            this.setSuccess(false);
            this.messages = messages;
        }
    }
}

package com.example.common.message;

import lombok.ToString;

/**
 * <p>五种类型级别消息：由低到高</p>
 * <p>SUCCESS<INFO<WARN<ERROR<DANGER</p>
 */
@ToString
public enum StandardResultMessageType implements ResultMessageType {
    SUCCESS("success"), INFO("info"), @Deprecated WARN("warn"), ERROR("error"), DANGER("danger");

    private final String type;

    @Override
    public String getType() {
        return this.type;
    }

    private StandardResultMessageType(String type) {
        this.type = type;
    }
}

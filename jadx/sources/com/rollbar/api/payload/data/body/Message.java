package com.rollbar.api.payload.data.body;

import com.rollbar.api.json.JsonSerializable;
import com.rollbar.api.truncation.TruncationHelper;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class Message implements BodyContent, JsonSerializable {
    private static final long serialVersionUID = 1729529829545820666L;
    private final String body;
    private final Map<String, Object> metadata;

    public static final class Builder {
        private String body;
        private Map<String, Object> metadata;

        public Builder() {
        }

        public Builder body(String str) {
            this.body = str;
            return this;
        }

        public Message build() {
            return new Message(this);
        }

        public Builder metadata(Map<String, Object> map) {
            this.metadata = map;
            return this;
        }

        public Builder(Message message) {
            this.body = message.body;
        }
    }

    @Override // com.rollbar.api.json.JsonSerializable
    public Object asJson() {
        HashMap map = new HashMap();
        Map<String, Object> map2 = this.metadata;
        if (map2 != null) {
            map.putAll(map2);
        }
        map.put("body", this.body);
        return map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Message message = (Message) obj;
            String str = this.body;
            if (str == null ? message.body != null : !str.equals(message.body)) {
                return false;
            }
            Map<String, Object> map = this.metadata;
            Map<String, Object> map2 = message.metadata;
            if (map != null) {
                return map.equals(map2);
            }
            if (map2 == null) {
                return true;
            }
        }
        return false;
    }

    public String getBody() {
        return this.body;
    }

    @Override // com.rollbar.api.payload.data.body.BodyContent
    public String getKeyName() {
        return "message";
    }

    public Map<String, Object> getMetadata() {
        return this.metadata;
    }

    public int hashCode() {
        String str = this.body;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, Object> map = this.metadata;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "Message{body='" + this.body + "', metadata='" + this.metadata + "'}";
    }

    private Message(Builder builder) {
        this.body = builder.body;
        this.metadata = builder.metadata != null ? Collections.unmodifiableMap(new HashMap(builder.metadata)) : null;
    }

    @Override // com.rollbar.api.truncation.StringTruncatable
    /* JADX INFO: renamed from: truncateStrings, reason: merged with bridge method [inline-methods] */
    public BodyContent truncateStrings2(int i10) {
        return (this.metadata == null && this.body == null) ? this : new Builder(this).metadata(TruncationHelper.truncateStringsInMap(this.metadata, i10)).body(TruncationHelper.truncateString(getBody(), i10)).build();
    }
}

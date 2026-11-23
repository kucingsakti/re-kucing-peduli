package com.rollbar.api.payload;

import com.rollbar.api.json.JsonSerializable;
import com.rollbar.api.payload.data.Data;
import com.rollbar.api.truncation.StringTruncatable;
import com.rollbar.api.truncation.TruncationHelper;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class Payload implements JsonSerializable, StringTruncatable<Payload> {
    private static final long serialVersionUID = 3054041443735286159L;
    private final String accessToken;
    private final Data data;
    public final String json;
    private int sendAttemptCount;

    public static class Builder {
        private String accessToken;
        private Data data;

        public Builder() {
        }

        public Builder accessToken(String str) {
            this.accessToken = str;
            return this;
        }

        public Payload build() {
            return new Payload(this);
        }

        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        public Builder(Payload payload) {
            this.accessToken = payload.accessToken;
            this.data = payload.data;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Payload payload = (Payload) obj;
            String str = this.accessToken;
            if (str == null ? payload.accessToken != null : !str.equals(payload.accessToken)) {
                return false;
            }
            Data data = this.data;
            Data data2 = payload.data;
            if (data != null) {
                return data.equals(data2);
            }
            if (data2 == null) {
                return true;
            }
        }
        return false;
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public Data getData() {
        return this.data;
    }

    public int getSendAttemptCount() {
        return this.sendAttemptCount;
    }

    public int hashCode() {
        String str = this.accessToken;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Data data = this.data;
        return iHashCode + (data != null ? data.hashCode() : 0);
    }

    public void incrementSendAttemptCount() {
        this.sendAttemptCount++;
    }

    public String toString() {
        return "Payload{accessToken='" + this.accessToken + "', data=" + this.data + '}';
    }

    private Payload(Builder builder) {
        this.accessToken = builder.accessToken;
        this.data = builder.data;
        this.json = null;
        this.sendAttemptCount = 0;
    }

    @Override // com.rollbar.api.json.JsonSerializable
    public Map<String, Object> asJson() {
        HashMap map = new HashMap();
        String str = this.accessToken;
        if (str != null) {
            map.put("access_token", str);
        }
        Data data = this.data;
        if (data != null) {
            map.put(JsonStorageKeyNames.DATA_KEY, data);
        }
        return map;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.rollbar.api.truncation.StringTruncatable
    /* JADX INFO: renamed from: truncateStrings */
    public Payload truncateStrings2(int i10) {
        return this.data == null ? this : new Builder(this).data((Data) TruncationHelper.truncateStringsInObject(this.data, i10)).build();
    }

    public Payload(String str) {
        this.accessToken = null;
        this.data = null;
        this.json = str;
        this.sendAttemptCount = 0;
    }
}

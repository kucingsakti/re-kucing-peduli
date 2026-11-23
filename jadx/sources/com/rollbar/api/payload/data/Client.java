package com.rollbar.api.payload.data;

import com.rollbar.api.json.JsonSerializable;
import com.rollbar.api.truncation.StringTruncatable;
import com.rollbar.api.truncation.TruncationHelper;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class Client implements JsonSerializable, StringTruncatable<Client> {
    private static final long serialVersionUID = 1975664872679919021L;
    private final Map<String, Map<String, Object>> data;
    private final Map<String, Object> topLevelData;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Client client = (Client) obj;
            Map<String, Map<String, Object>> map = this.data;
            if (map == null ? client.data != null : !map.equals(client.data)) {
                return false;
            }
            Map<String, Object> map2 = this.topLevelData;
            if (map2 != null) {
                return map2.equals(client.topLevelData);
            }
            if (client.topLevelData == null) {
                return true;
            }
        }
        return false;
    }

    public Map<String, Map<String, Object>> getData() {
        return this.data;
    }

    public Map<String, Object> getTopLevelData() {
        return this.topLevelData;
    }

    public int hashCode() {
        Map<String, Map<String, Object>> map = this.data;
        int iHashCode = (map != null ? map.hashCode() : 0) * 31;
        Map<String, Object> map2 = this.topLevelData;
        return iHashCode + (map2 != null ? map2.hashCode() : 0);
    }

    public String toString() {
        return "Client{topLevelData='" + this.topLevelData + "', data='" + this.data + "'}";
    }

    private Client(Builder builder) {
        this((Map<String, Map<String, Object>>) builder.data, (Map<String, Object>) builder.topLevelData);
    }

    @Override // com.rollbar.api.json.JsonSerializable
    public Map<String, Object> asJson() {
        HashMap map = new HashMap();
        map.putAll(this.data);
        map.putAll(this.topLevelData);
        return map;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.rollbar.api.truncation.StringTruncatable
    public Client truncateStrings(int i10) {
        return new Client(TruncationHelper.truncateStringsInNestedMap(this.data, i10), TruncationHelper.truncateStringsInMap(this.topLevelData, i10));
    }

    public static final class Builder {
        private Map<String, Map<String, Object>> data;
        private Map<String, Object> topLevelData;

        public Builder() {
            this.data = new HashMap();
            this.topLevelData = new HashMap();
        }

        public Builder addClient(String str, String str2, Object obj) {
            Map<String, Object> map = this.data.get(str);
            if (map == null) {
                map = new HashMap<>();
            }
            map.put(str2, obj);
            this.data.put(str, map);
            return this;
        }

        public Builder addTopLevel(String str, Object obj) {
            this.topLevelData.put(str, obj);
            return this;
        }

        public Client build() {
            return new Client(this);
        }

        public Builder(Client client) {
            this.data = client.data;
            this.topLevelData = client.topLevelData;
        }

        public Builder addClient(String str, Map<String, Object> map) {
            Map<String, Object> map2 = this.data.get(str);
            if (map2 == null) {
                map2 = new HashMap<>();
            }
            map2.putAll(map);
            this.data.put(str, map2);
            return this;
        }
    }

    private Client(Map<String, Map<String, Object>> map, Map<String, Object> map2) {
        this.data = Collections.unmodifiableMap(new HashMap(map));
        this.topLevelData = Collections.unmodifiableMap(new HashMap(map2));
    }
}

package com.rollbar.api.payload.data;

import com.rollbar.api.json.JsonSerializable;
import com.rollbar.api.truncation.StringTruncatable;
import com.rollbar.api.truncation.TruncationHelper;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class Person implements JsonSerializable, StringTruncatable<Person> {
    private static final long serialVersionUID = -1589474813294741393L;
    private final String email;
    private final String id;
    private final Map<String, Object> metadata;
    private final String username;

    public static final class Builder {
        private String email;
        private String id;
        private Map<String, Object> metadata;
        private String username;

        public Builder() {
        }

        public Person build() {
            return new Person(this);
        }

        public Builder email(String str) {
            this.email = str;
            return this;
        }

        public Builder id(String str) {
            this.id = str;
            return this;
        }

        public Builder metadata(Map<String, Object> map) {
            this.metadata = map;
            return this;
        }

        public Builder username(String str) {
            this.username = str;
            return this;
        }

        public Builder(Person person) {
            this.id = person.id;
            this.username = person.username;
            this.email = person.email;
            this.metadata = person.metadata;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Person person = (Person) obj;
            String str = this.id;
            if (str == null ? person.id != null : !str.equals(person.id)) {
                return false;
            }
            String str2 = this.username;
            if (str2 == null ? person.username != null : !str2.equals(person.username)) {
                return false;
            }
            Map<String, Object> map = this.metadata;
            if (map == null ? person.metadata != null : !map.equals(person.metadata)) {
                return false;
            }
            String str3 = this.email;
            String str4 = person.email;
            if (str3 != null) {
                return str3.equals(str4);
            }
            if (str4 == null) {
                return true;
            }
        }
        return false;
    }

    public String getEmail() {
        return this.email;
    }

    public String getId() {
        return this.id;
    }

    public Map<String, Object> getMetadata() {
        return this.metadata;
    }

    public String getUsername() {
        return this.username;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.username;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.email;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Map<String, Object> map = this.metadata;
        return iHashCode3 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "Person{id='" + this.id + "', username='" + this.username + "', email='" + this.email + "', metadata='" + this.metadata + "'}";
    }

    private Person(Builder builder) {
        this.id = builder.id;
        this.username = builder.username;
        this.email = builder.email;
        this.metadata = builder.metadata != null ? Collections.unmodifiableMap(new HashMap(builder.metadata)) : null;
    }

    @Override // com.rollbar.api.json.JsonSerializable
    public Map<String, Object> asJson() {
        HashMap map = new HashMap();
        Map<String, Object> map2 = this.metadata;
        if (map2 != null) {
            map.putAll(map2);
        }
        String str = this.id;
        if (str != null) {
            map.put("id", str);
        }
        String str2 = this.username;
        if (str2 != null) {
            map.put("username", str2);
        }
        String str3 = this.email;
        if (str3 != null) {
            map.put("email", str3);
        }
        return map;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.rollbar.api.truncation.StringTruncatable
    public Person truncateStrings(int i10) {
        return new Builder(this).metadata(TruncationHelper.truncateStringsInMap(this.metadata, i10)).id(TruncationHelper.truncateString(this.id, i10)).username(TruncationHelper.truncateString(this.username, i10)).email(TruncationHelper.truncateString(this.email, i10)).build();
    }
}

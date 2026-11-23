package com.rollbar.api.payload.data;

import com.rollbar.api.json.JsonSerializable;
import com.rollbar.api.truncation.StringTruncatable;
import com.rollbar.api.truncation.TruncationHelper;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class Server implements JsonSerializable, StringTruncatable<Server> {
    private static final long serialVersionUID = -9135498029274932688L;
    private final String branch;
    private final String codeVersion;
    private final String host;
    private final Map<String, Object> metadata;
    private final String root;

    public static final class Builder {
        private String branch;
        private String codeVersion;
        private String host;
        private Map<String, Object> metadata;
        private String root;

        public Builder() {
        }

        public Builder branch(String str) {
            this.branch = str;
            return this;
        }

        public Server build() {
            return new Server(this);
        }

        public Builder codeVersion(String str) {
            this.codeVersion = str;
            return this;
        }

        public Builder host(String str) {
            this.host = str;
            return this;
        }

        public Builder metadata(Map<String, Object> map) {
            this.metadata = map;
            return this;
        }

        public Builder root(String str) {
            this.root = str;
            return this;
        }

        public Builder(Server server) {
            this.host = server.host;
            this.root = server.root;
            this.branch = server.branch;
            this.codeVersion = server.codeVersion;
            this.metadata = server.metadata;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Server server = (Server) obj;
            String str = this.host;
            if (str == null ? server.host != null : !str.equals(server.host)) {
                return false;
            }
            String str2 = this.root;
            if (str2 == null ? server.root != null : !str2.equals(server.root)) {
                return false;
            }
            String str3 = this.branch;
            if (str3 == null ? server.branch != null : !str3.equals(server.branch)) {
                return false;
            }
            Map<String, Object> map = this.metadata;
            if (map == null ? server.metadata != null : !map.equals(server.metadata)) {
                return false;
            }
            String str4 = this.codeVersion;
            String str5 = server.codeVersion;
            if (str4 != null) {
                return str4.equals(str5);
            }
            if (str5 == null) {
                return true;
            }
        }
        return false;
    }

    public String getBranch() {
        return this.branch;
    }

    public String getCodeVersion() {
        return this.codeVersion;
    }

    public String getHost() {
        return this.host;
    }

    public Map<String, Object> getMetadata() {
        return this.metadata;
    }

    public String getRoot() {
        return this.root;
    }

    public int hashCode() {
        String str = this.host;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.root;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.branch;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.codeVersion;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Map<String, Object> map = this.metadata;
        return iHashCode4 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "Server{host='" + this.host + "', root='" + this.root + "', branch='" + this.branch + "', codeVersion='" + this.codeVersion + "', metadata='" + this.metadata + "'}";
    }

    private Server(Builder builder) {
        this.host = builder.host;
        this.root = builder.root;
        this.branch = builder.branch;
        this.codeVersion = builder.codeVersion;
        this.metadata = builder.metadata != null ? Collections.unmodifiableMap(new HashMap(builder.metadata)) : null;
    }

    @Override // com.rollbar.api.json.JsonSerializable
    public Map<String, Object> asJson() {
        HashMap map = new HashMap();
        Map<String, Object> map2 = this.metadata;
        if (map2 != null) {
            map.putAll(map2);
        }
        String str = this.host;
        if (str != null) {
            map.put("host", str);
        }
        String str2 = this.root;
        if (str2 != null) {
            map.put("root", str2);
        }
        String str3 = this.branch;
        if (str3 != null) {
            map.put("branch", str3);
        }
        String str4 = this.codeVersion;
        if (str4 != null) {
            map.put("code_version", str4);
        }
        return map;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.rollbar.api.truncation.StringTruncatable
    public Server truncateStrings(int i10) {
        return new Builder(this).metadata(TruncationHelper.truncateStringsInMap(this.metadata, i10)).host(TruncationHelper.truncateString(this.host, i10)).root(TruncationHelper.truncateString(this.root, i10)).branch(TruncationHelper.truncateString(this.branch, i10)).codeVersion(TruncationHelper.truncateString(this.codeVersion, i10)).build();
    }
}

package com.rollbar.api.payload.data;

import com.rollbar.api.json.JsonSerializable;
import com.rollbar.api.truncation.StringTruncatable;
import com.rollbar.api.truncation.TruncationHelper;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class Request implements JsonSerializable, StringTruncatable<Request> {
    private static final long serialVersionUID = 3552594955980476301L;
    private final String body;
    private final Map<String, List<String>> get;
    private final Map<String, String> headers;
    private final Map<String, Object> metadata;
    private final String method;
    private final Map<String, String> params;
    private final Map<String, Object> post;
    private final String queryString;
    private final String url;
    private final String userIp;

    public static final class Builder {
        private String body;
        private Map<String, List<String>> get;
        private Map<String, String> headers;
        private Map<String, Object> metadata;
        private String method;
        private Map<String, String> params;
        private Map<String, Object> post;
        private String queryString;
        private String url;
        private String userIp;

        public Builder() {
        }

        public Builder body(String str) {
            this.body = str;
            return this;
        }

        public Request build() {
            return new Request(this);
        }

        public Builder get(Map<String, List<String>> map) {
            this.get = map;
            return this;
        }

        public Builder headers(Map<String, String> map) {
            this.headers = map;
            return this;
        }

        public Builder metadata(Map<String, Object> map) {
            this.metadata = map;
            return this;
        }

        public Builder method(String str) {
            this.method = str;
            return this;
        }

        public Builder params(Map<String, String> map) {
            this.params = map;
            return this;
        }

        public Builder post(Map<String, Object> map) {
            this.post = map;
            return this;
        }

        public Builder queryString(String str) {
            this.queryString = str;
            return this;
        }

        public Builder url(String str) {
            this.url = str;
            return this;
        }

        public Builder userIp(String str) {
            this.userIp = str;
            return this;
        }

        public Builder(Request request) {
            this.url = request.url;
            this.method = request.method;
            this.headers = request.headers;
            this.params = request.params;
            this.get = request.get;
            this.queryString = request.queryString;
            this.post = request.post;
            this.body = request.body;
            this.userIp = request.userIp;
            this.metadata = request.metadata;
        }
    }

    private Map<String, Object> processGetParams(Map<String, List<String>> map) {
        HashMap map2 = new HashMap();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            if (value.size() == 1) {
                map2.put(key, value.get(0));
            } else {
                map2.put(key, value);
            }
        }
        return map2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Request request = (Request) obj;
            String str = this.url;
            if (str == null ? request.url != null : !str.equals(request.url)) {
                return false;
            }
            String str2 = this.method;
            if (str2 == null ? request.method != null : !str2.equals(request.method)) {
                return false;
            }
            Map<String, String> map = this.headers;
            if (map == null ? request.headers != null : !map.equals(request.headers)) {
                return false;
            }
            Map<String, String> map2 = this.params;
            if (map2 == null ? request.params != null : !map2.equals(request.params)) {
                return false;
            }
            Map<String, List<String>> map3 = this.get;
            if (map3 == null ? request.get != null : !map3.equals(request.get)) {
                return false;
            }
            String str3 = this.queryString;
            if (str3 == null ? request.queryString != null : !str3.equals(request.queryString)) {
                return false;
            }
            Map<String, Object> map4 = this.post;
            if (map4 == null ? request.post != null : !map4.equals(request.post)) {
                return false;
            }
            String str4 = this.body;
            if (str4 == null ? request.body != null : !str4.equals(request.body)) {
                return false;
            }
            Map<String, Object> map5 = this.metadata;
            if (map5 == null ? request.metadata != null : !map5.equals(request.metadata)) {
                return false;
            }
            String str5 = this.userIp;
            String str6 = request.userIp;
            if (str5 != null) {
                return str5.equals(str6);
            }
            if (str6 == null) {
                return true;
            }
        }
        return false;
    }

    public String getBody() {
        return this.body;
    }

    public Map<String, List<String>> getGet() {
        return this.get;
    }

    public Map<String, String> getHeaders() {
        return this.headers;
    }

    public Map<String, Object> getMetadata() {
        return this.metadata;
    }

    public String getMethod() {
        return this.method;
    }

    public Map<String, String> getParams() {
        return this.params;
    }

    public Map<String, Object> getPost() {
        return this.post;
    }

    public String getQueryString() {
        return this.queryString;
    }

    public String getUrl() {
        return this.url;
    }

    public String getUserIp() {
        return this.userIp;
    }

    public int hashCode() {
        String str = this.url;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.method;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Map<String, String> map = this.headers;
        int iHashCode3 = (iHashCode2 + (map != null ? map.hashCode() : 0)) * 31;
        Map<String, String> map2 = this.params;
        int iHashCode4 = (iHashCode3 + (map2 != null ? map2.hashCode() : 0)) * 31;
        Map<String, List<String>> map3 = this.get;
        int iHashCode5 = (iHashCode4 + (map3 != null ? map3.hashCode() : 0)) * 31;
        String str3 = this.queryString;
        int iHashCode6 = (iHashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Map<String, Object> map4 = this.post;
        int iHashCode7 = (iHashCode6 + (map4 != null ? map4.hashCode() : 0)) * 31;
        String str4 = this.body;
        int iHashCode8 = (iHashCode7 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.userIp;
        int iHashCode9 = (iHashCode8 + (str5 != null ? str5.hashCode() : 0)) * 31;
        Map<String, Object> map5 = this.metadata;
        return iHashCode9 + (map5 != null ? map5.hashCode() : 0);
    }

    public String toString() {
        return "Request{url='" + this.url + "', method='" + this.method + "', headers=" + this.headers + ", params=" + this.params + ", get=" + this.get + ", queryString='" + this.queryString + "', post=" + this.post + ", body='" + this.body + "', userIp='" + this.userIp + "', metadata='" + this.metadata + "'}";
    }

    private Request(Builder builder) {
        this.url = builder.url;
        this.method = builder.method;
        this.headers = builder.headers;
        this.params = builder.params;
        this.get = builder.get;
        this.queryString = builder.queryString;
        this.post = builder.post;
        this.body = builder.body;
        this.userIp = builder.userIp;
        this.metadata = builder.metadata != null ? Collections.unmodifiableMap(new HashMap(builder.metadata)) : null;
    }

    @Override // com.rollbar.api.json.JsonSerializable
    public Map<String, Object> asJson() {
        HashMap map = new HashMap();
        Map<String, Object> map2 = this.metadata;
        if (map2 != null) {
            map.putAll(map2);
        }
        String str = this.url;
        if (str != null) {
            map.put("url", str);
        }
        String str2 = this.method;
        if (str2 != null) {
            map.put("method", str2);
        }
        Map<String, String> map3 = this.headers;
        if (map3 != null) {
            map.put("headers", map3);
        }
        Map<String, String> map4 = this.params;
        if (map4 != null) {
            map.put("params", map4);
        }
        Map<String, List<String>> map5 = this.get;
        if (map5 != null) {
            map.put("get", processGetParams(map5));
        }
        String str3 = this.queryString;
        if (str3 != null) {
            map.put("query_string", str3);
        }
        Map<String, Object> map6 = this.post;
        if (map6 != null) {
            map.put("post", map6);
        }
        String str4 = this.body;
        if (str4 != null) {
            map.put("body", str4);
        }
        String str5 = this.userIp;
        if (str5 != null) {
            map.put("user_ip", str5);
        }
        return map;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.rollbar.api.truncation.StringTruncatable
    public Request truncateStrings(int i10) {
        return new Builder(this).metadata(TruncationHelper.truncateStringsInMap(this.metadata, i10)).url(TruncationHelper.truncateString(this.url, i10)).method(TruncationHelper.truncateString(this.method, i10)).headers(TruncationHelper.truncateStringsInStringMap(this.headers, i10)).params(TruncationHelper.truncateStringsInStringMap(this.params, i10)).get(TruncationHelper.truncateStringsInStringListMap(this.get, i10)).queryString(TruncationHelper.truncateString(this.queryString, i10)).post(TruncationHelper.truncateStringsInMap(this.post, i10)).body(TruncationHelper.truncateString(this.body, i10)).userIp(TruncationHelper.truncateString(this.userIp, i10)).build();
    }
}

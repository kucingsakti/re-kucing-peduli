package com.rollbar.api.payload.data.body;

import E0.a;
import com.rollbar.api.json.JsonSerializable;
import com.rollbar.api.truncation.StringTruncatable;
import com.rollbar.api.truncation.TruncationHelper;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ExceptionInfo implements JsonSerializable, StringTruncatable<ExceptionInfo> {
    private static final long serialVersionUID = -2271411217988417830L;
    private final String className;
    private final String description;
    private final String message;

    public static final class Builder {
        private String className;
        private String description;
        private String message;

        public Builder() {
        }

        public ExceptionInfo build() {
            return new ExceptionInfo(this);
        }

        public Builder className(String str) {
            this.className = str;
            return this;
        }

        public Builder description(String str) {
            this.description = str;
            return this;
        }

        public Builder message(String str) {
            this.message = str;
            return this;
        }

        public Builder(ExceptionInfo exceptionInfo) {
            this.className = exceptionInfo.className;
            this.message = exceptionInfo.message;
            this.description = exceptionInfo.description;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ExceptionInfo exceptionInfo = (ExceptionInfo) obj;
            String str = this.className;
            if (str == null ? exceptionInfo.className != null : !str.equals(exceptionInfo.className)) {
                return false;
            }
            String str2 = this.message;
            if (str2 == null ? exceptionInfo.message != null : !str2.equals(exceptionInfo.message)) {
                return false;
            }
            String str3 = this.description;
            String str4 = exceptionInfo.description;
            if (str3 != null) {
                return str3.equals(str4);
            }
            if (str4 == null) {
                return true;
            }
        }
        return false;
    }

    public String getClassName() {
        return this.className;
    }

    public String getDescription() {
        return this.description;
    }

    public String getMessage() {
        return this.message;
    }

    public int hashCode() {
        String str = this.className;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.message;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.description;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ExceptionInfo{classname='");
        sb.append(this.className);
        sb.append("', message='");
        sb.append(this.message);
        sb.append("', description='");
        return a.l(sb, this.description, "'}");
    }

    private ExceptionInfo(Builder builder) {
        this.className = builder.className;
        this.message = builder.message;
        this.description = builder.description;
    }

    @Override // com.rollbar.api.json.JsonSerializable
    public Map<String, Object> asJson() {
        HashMap map = new HashMap();
        String str = this.className;
        if (str != null) {
            map.put("class", str);
        }
        String str2 = this.message;
        if (str2 != null) {
            map.put("message", str2);
        }
        String str3 = this.description;
        if (str3 != null) {
            map.put("description", str3);
        }
        return map;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.rollbar.api.truncation.StringTruncatable
    /* JADX INFO: renamed from: truncateStrings */
    public ExceptionInfo truncateStrings2(int i10) {
        return (this.className == null && this.message == null && this.description == null) ? this : new Builder(this).className(TruncationHelper.truncateString(this.className, i10)).message(TruncationHelper.truncateString(this.message, i10)).description(TruncationHelper.truncateString(this.description, i10)).build();
    }
}

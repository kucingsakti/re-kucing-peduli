package com.rollbar.api.payload.data.body;

import E0.a;
import com.rollbar.api.json.JsonSerializable;
import com.rollbar.api.truncation.TruncationHelper;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class CrashReport implements BodyContent, JsonSerializable {
    private static final long serialVersionUID = -958856299336011192L;
    private final String raw;

    public static final class Builder {
        private String raw;

        public Builder() {
        }

        public CrashReport build() {
            return new CrashReport(this);
        }

        public Builder raw(String str) {
            this.raw = str;
            return this;
        }

        public Builder(CrashReport crashReport) {
            this.raw = crashReport.raw;
        }
    }

    @Override // com.rollbar.api.json.JsonSerializable
    public Object asJson() {
        HashMap map = new HashMap();
        if (this.raw != null) {
            map.put("raw", getRaw());
        }
        return map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            String str = this.raw;
            String str2 = ((CrashReport) obj).raw;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    @Override // com.rollbar.api.payload.data.body.BodyContent
    public String getKeyName() {
        return "crash_report";
    }

    public String getRaw() {
        return this.raw;
    }

    public int hashCode() {
        String str = this.raw;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return a.l(new StringBuilder("CrashReport{raw='"), this.raw, "'}");
    }

    private CrashReport(Builder builder) {
        this.raw = builder.raw;
    }

    @Override // com.rollbar.api.truncation.StringTruncatable
    /* JADX INFO: renamed from: truncateStrings */
    public BodyContent truncateStrings2(int i10) {
        return new Builder(this).raw(TruncationHelper.truncateString(getRaw(), i10)).build();
    }
}

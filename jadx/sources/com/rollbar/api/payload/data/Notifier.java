package com.rollbar.api.payload.data;

import E0.a;
import com.rollbar.api.json.JsonSerializable;
import com.rollbar.api.truncation.StringTruncatable;
import com.rollbar.api.truncation.TruncationHelper;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class Notifier implements JsonSerializable, StringTruncatable<Notifier> {
    private static final long serialVersionUID = -2605608164795462842L;
    private final String name;
    private final String version;

    public static final class Builder {
        private String name;
        private String version;

        public Builder() {
        }

        public Notifier build() {
            return new Notifier(this);
        }

        public Builder name(String str) {
            this.name = str;
            return this;
        }

        public Builder version(String str) {
            this.version = str;
            return this;
        }

        public Builder(Notifier notifier) {
            this.name = notifier.name;
            this.version = notifier.version;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Notifier notifier = (Notifier) obj;
            String str = this.name;
            if (str == null ? notifier.name != null : !str.equals(notifier.name)) {
                return false;
            }
            String str2 = this.version;
            String str3 = notifier.version;
            if (str2 != null) {
                return str2.equals(str3);
            }
            if (str3 == null) {
                return true;
            }
        }
        return false;
    }

    public String getName() {
        return this.name;
    }

    public String getVersion() {
        return this.version;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.version;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Notifier{name='");
        sb.append(this.name);
        sb.append("', version='");
        return a.l(sb, this.version, "'}");
    }

    private Notifier(Builder builder) {
        this.name = builder.name;
        this.version = builder.version;
    }

    @Override // com.rollbar.api.json.JsonSerializable
    public Map<String, Object> asJson() {
        HashMap map = new HashMap();
        String str = this.name;
        if (str != null) {
            map.put(MediationMetaData.KEY_NAME, str);
        }
        String str2 = this.version;
        if (str2 != null) {
            map.put(MediationMetaData.KEY_VERSION, str2);
        }
        return map;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.rollbar.api.truncation.StringTruncatable
    /* JADX INFO: renamed from: truncateStrings */
    public Notifier truncateStrings2(int i10) {
        return (this.name == null && this.version == null) ? this : new Builder(this).name(TruncationHelper.truncateString(this.name, i10)).version(TruncationHelper.truncateString(this.version, i10)).build();
    }
}

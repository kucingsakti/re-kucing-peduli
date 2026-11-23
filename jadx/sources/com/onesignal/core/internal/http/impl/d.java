package com.onesignal.core.internal.http.impl;

import androidx.datastore.preferences.protobuf.AbstractC0487g;
import p210v8.e;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    private final String cacheKey;
    private final String jwt;
    private final Integer retryCount;
    private final String rywToken;
    private final Long sessionDuration;

    public d() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ d copy$default(d dVar, String str, String str2, Integer num, Long l4, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = dVar.cacheKey;
        }
        if ((i10 & 2) != 0) {
            str2 = dVar.rywToken;
        }
        if ((i10 & 4) != 0) {
            num = dVar.retryCount;
        }
        if ((i10 & 8) != 0) {
            l4 = dVar.sessionDuration;
        }
        if ((i10 & 16) != 0) {
            str3 = dVar.jwt;
        }
        String str4 = str3;
        Integer num2 = num;
        return dVar.copy(str, str2, num2, l4, str4);
    }

    public final String component1() {
        return this.cacheKey;
    }

    public final String component2() {
        return this.rywToken;
    }

    public final Integer component3() {
        return this.retryCount;
    }

    public final Long component4() {
        return this.sessionDuration;
    }

    public final String component5() {
        return this.jwt;
    }

    public final d copy(String str, String str2, Integer num, Long l4, String str3) {
        return new d(str, str2, num, l4, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return i.a(this.cacheKey, dVar.cacheKey) && i.a(this.rywToken, dVar.rywToken) && i.a(this.retryCount, dVar.retryCount) && i.a(this.sessionDuration, dVar.sessionDuration) && i.a(this.jwt, dVar.jwt);
    }

    public final String getCacheKey() {
        return this.cacheKey;
    }

    public final String getJwt() {
        return this.jwt;
    }

    public final Integer getRetryCount() {
        return this.retryCount;
    }

    public final String getRywToken() {
        return this.rywToken;
    }

    public final Long getSessionDuration() {
        return this.sessionDuration;
    }

    public int hashCode() {
        String str = this.cacheKey;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.rywToken;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.retryCount;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Long l4 = this.sessionDuration;
        int iHashCode4 = (iHashCode3 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str3 = this.jwt;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("OptionalHeaders(cacheKey=");
        sb.append(this.cacheKey);
        sb.append(", rywToken=");
        sb.append(this.rywToken);
        sb.append(", retryCount=");
        sb.append(this.retryCount);
        sb.append(", sessionDuration=");
        sb.append(this.sessionDuration);
        sb.append(", jwt=");
        return AbstractC0487g.j(sb, this.jwt, ')');
    }

    public d(String str, String str2, Integer num, Long l4, String str3) {
        this.cacheKey = str;
        this.rywToken = str2;
        this.retryCount = num;
        this.sessionDuration = l4;
        this.jwt = str3;
    }

    public /* synthetic */ d(String str, String str2, Integer num, Long l4, String str3, int i10, e eVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : num, (i10 & 8) != 0 ? null : l4, (i10 & 16) != 0 ? null : str3);
    }
}

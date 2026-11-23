package com.google.android.gms.internal.measurement;

import androidx.datastore.preferences.protobuf.AbstractC0487g;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class zzad {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final A3.F f8453d = A3.F.q(3, 3, "_syn", "_err", "_el");
    public String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f8454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f8455c;

    public zzad(String str, long j, HashMap map) {
        this.a = str;
        this.f8454b = j;
        HashMap map2 = new HashMap();
        this.f8455c = map2;
        if (map != null) {
            map2.putAll(map);
        }
    }

    public static Object a(String str, Object obj, Object obj2) {
        if (f8453d.contains(str) && (obj2 instanceof Double)) {
            return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
        }
        if (str.startsWith("_")) {
            if (!(obj instanceof String) && obj != null) {
                return obj;
            }
        } else {
            if (obj instanceof Double) {
                return obj2;
            }
            if (obj instanceof Long) {
                return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
            }
            if (obj instanceof String) {
                return obj2.toString();
            }
        }
        return obj2;
    }

    public final /* synthetic */ Object clone() {
        return new zzad(this.a, this.f8454b, new HashMap(this.f8455c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzad)) {
            return false;
        }
        zzad zzadVar = (zzad) obj;
        if (this.f8454b == zzadVar.f8454b && this.a.equals(zzadVar.a)) {
            return this.f8455c.equals(zzadVar.f8455c);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        long j = this.f8454b;
        return this.f8455c.hashCode() + ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        String str = this.a;
        String strValueOf = String.valueOf(this.f8455c);
        StringBuilder sbM = AbstractC0487g.m("Event{name='", str, "', timestamp=");
        sbM.append(this.f8454b);
        sbM.append(", params=");
        sbM.append(strValueOf);
        sbM.append("}");
        return sbM.toString();
    }
}

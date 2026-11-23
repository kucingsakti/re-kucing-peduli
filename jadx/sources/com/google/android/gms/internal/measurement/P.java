package com.google.android.gms.internal.measurement;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class P {
    public final Context a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z3.d f8355b;

    public P(Context context, z3.d dVar) {
        this.a = context;
        this.f8355b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof P) {
            P p10 = (P) obj;
            if (this.a.equals(p10.a)) {
                z3.d dVar = p10.f8355b;
                z3.d dVar2 = this.f8355b;
                if (dVar2 != null ? dVar2.equals(dVar) : dVar == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        z3.d dVar = this.f8355b;
        return iHashCode ^ (dVar == null ? 0 : dVar.hashCode());
    }

    public final String toString() {
        return "FlagsContext{context=" + String.valueOf(this.a) + ", hermeticFileOverrides=" + String.valueOf(this.f8355b) + "}";
    }
}

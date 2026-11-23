package com.google.gson;

/* JADX INFO: loaded from: classes.dex */
public final class n extends l {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.google.gson.internal.k f10158s = new com.google.gson.internal.k(false);

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof n) && ((n) obj).f10158s.equals(this.f10158s);
        }
        return true;
    }

    public final int hashCode() {
        return this.f10158s.hashCode();
    }
}

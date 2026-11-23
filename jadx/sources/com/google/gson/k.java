package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class k extends l implements Iterable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayList f10156s = new ArrayList();

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof k) && ((k) obj).f10156s.equals(this.f10156s);
        }
        return true;
    }

    public final int hashCode() {
        return this.f10156s.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f10156s.iterator();
    }
}

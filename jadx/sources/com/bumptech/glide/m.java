package com.bumptech.glide;

import U1.n;

/* JADX INFO: loaded from: classes.dex */
public abstract class m implements Cloneable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public S1.d f7670s = S1.b.f4507t;

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final m clone() {
        try {
            return (m) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof m) {
            return n.b(this.f7670s, ((m) obj).f7670s);
        }
        return false;
    }

    public int hashCode() {
        S1.d dVar = this.f7670s;
        if (dVar != null) {
            return dVar.hashCode();
        }
        return 0;
    }
}

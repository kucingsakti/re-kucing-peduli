package com.google.gson.internal;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Iterator {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public j f10105s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public j f10106t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f10107u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ k f10108v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f10109w;

    public h(k kVar, int i10) {
        this.f10109w = i10;
        this.f10108v = kVar;
        this.f10105s = kVar.f10127x.f10116v;
        this.f10107u = kVar.f10126w;
    }

    public final Object a() {
        return b();
    }

    public final j b() {
        j jVar = this.f10105s;
        k kVar = this.f10108v;
        if (jVar == kVar.f10127x) {
            throw new NoSuchElementException();
        }
        if (kVar.f10126w != this.f10107u) {
            throw new ConcurrentModificationException();
        }
        this.f10105s = jVar.f10116v;
        this.f10106t = jVar;
        return jVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f10105s != this.f10108v.f10127x;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.f10109w) {
            case 1:
                return b().f10118x;
            default:
                return a();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        j jVar = this.f10106t;
        if (jVar == null) {
            throw new IllegalStateException();
        }
        k kVar = this.f10108v;
        kVar.c(jVar, true);
        this.f10106t = null;
        this.f10107u = kVar.f10126w;
    }
}

package com.google.gson.internal.bind;

import com.google.gson.v;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f10063b = new a(Date.class);
    public final Class a;

    public b(Class cls) {
        this.a = cls;
    }

    public final v a(int i10, int i11) {
        DefaultDateTypeAdapter defaultDateTypeAdapter = new DefaultDateTypeAdapter(this, i10, i11);
        v vVar = e.a;
        return new TypeAdapters$31(this.a, defaultDateTypeAdapter);
    }

    public abstract Date b(Date date);
}

package com.bumptech.glide;

import A1.s;
import A1.t;
import android.content.Context;
import android.content.ContextWrapper;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f extends ContextWrapper {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f7594k = new a();
    public final B1.g a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f7595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p230x9.d f7596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final za.c f7597d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f7598e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p212w.e f7599f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f7600g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final P0.d f7601h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f7602i;
    public Q1.e j;

    public f(Context context, B1.g gVar, p195u1.b bVar, p230x9.d dVar, za.c cVar, p212w.e eVar, List list, t tVar, P0.d dVar2) {
        super(context.getApplicationContext());
        this.a = gVar;
        this.f7596c = dVar;
        this.f7597d = cVar;
        this.f7598e = list;
        this.f7599f = eVar;
        this.f7600g = tVar;
        this.f7601h = dVar2;
        this.f7602i = 4;
        this.f7595b = new s(bVar);
    }

    public final h a() {
        return (h) this.f7595b.get();
    }
}

package p139o3;

import D3.b;
import android.graphics.Typeface;
import p091j3.C0666a;

/* JADX INFO: loaded from: classes.dex */
public final class a extends b {
    public final Typeface a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p081i3.b f13707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13708c;

    public a(p081i3.b bVar, Typeface typeface) {
        this.a = typeface;
        this.f13707b = bVar;
    }

    @Override // D3.b
    public final void y(int i10) {
        if (this.f13708c) {
            return;
        }
        C0666a c0666a = (C0666a) this.f13707b.f12212t;
        if (c0666a.j(this.a)) {
            c0666a.h(false);
        }
    }

    @Override // D3.b
    public final void z(Typeface typeface, boolean z6) {
        if (this.f13708c) {
            return;
        }
        C0666a c0666a = (C0666a) this.f13707b.f12212t;
        if (c0666a.j(typeface)) {
            c0666a.h(false);
        }
    }
}

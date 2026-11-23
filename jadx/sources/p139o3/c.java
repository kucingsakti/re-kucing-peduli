package p139o3;

import D3.b;
import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* JADX INFO: loaded from: classes.dex */
public final class c extends b {
    public final /* synthetic */ Context a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextPaint f13711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f13712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f13713d;

    public c(d dVar, Context context, TextPaint textPaint, b bVar) {
        this.f13713d = dVar;
        this.a = context;
        this.f13711b = textPaint;
        this.f13712c = bVar;
    }

    @Override // D3.b
    public final void y(int i10) {
        this.f13712c.y(i10);
    }

    @Override // D3.b
    public final void z(Typeface typeface, boolean z6) {
        this.f13713d.g(this.a, this.f13711b, typeface);
        this.f13712c.z(typeface, z6);
    }
}

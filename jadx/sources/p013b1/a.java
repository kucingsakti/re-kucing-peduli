package p013b1;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.b;
import androidx.fragment.app.e;
import p156q0.H;

/* JADX INFO: loaded from: classes.dex */
public final class a extends H {
    public final /* synthetic */ b a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f7242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f7243c;

    public a(e eVar, b bVar, FrameLayout frameLayout) {
        this.f7243c = eVar;
        this.a = bVar;
        this.f7242b = frameLayout;
    }

    @Override // p156q0.H
    public final void onFragmentViewCreated(e eVar, b bVar, View view, Bundle bundle) {
        if (bVar == this.a) {
            eVar.g0(this);
            FrameLayout frameLayout = this.f7242b;
            this.f7243c.getClass();
            e.m(view, frameLayout);
        }
    }
}

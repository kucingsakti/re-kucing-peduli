package p045e7;

import A1.J;
import K7.b;
import K7.e;
import P0.d;
import T7.j;
import T7.n;
import T7.r;
import V.h;
import Y1.c;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import c2.f;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.Serializable;
import p027c7.a;
import p068ga.l;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class g implements DialogInterface.OnShowListener {
    public final /* synthetic */ h a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f10720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f10721c;

    public g(h hVar, View view, BottomSheetBehavior bottomSheetBehavior) {
        this.a = hVar;
        this.f10720b = view;
        this.f10721c = bottomSheetBehavior;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        View view = this.f10720b;
        if (view != null) {
            int height = view.getHeight();
            BottomSheetBehavior bottomSheetBehavior = this.f10721c;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.H(height);
            }
        }
        h hVar = this.a;
        f fVar = hVar.f10730R0;
        if (fVar == null) {
            i.n("authManager");
            throw null;
        }
        Bundle bundle = hVar.f6656y;
        Serializable serializable = bundle != null ? bundle.getSerializable("crypto") : null;
        if (!(serializable instanceof a)) {
            serializable = null;
        }
        a aVar = (a) serializable;
        J j = hVar.f10729Q0;
        if (j == null) {
            i.n("cancellationSignal");
            throw null;
        }
        c cVar = new c(fVar, j, aVar, 6);
        int i10 = J7.c.a;
        E0.a.m(5, "mode is null");
        T7.f fVar2 = new T7.f(cVar, 0);
        e eVar = b.a;
        if (eVar == null) {
            throw new NullPointerException("scheduler == null");
        }
        int i11 = J7.c.a;
        if (i11 <= 0) {
            throw new IllegalArgumentException(AbstractC0487g.g(i11, "bufferSize > 0 required but it was "));
        }
        T7.f fVar3 = new T7.f(new n(new T7.i(new r(fVar2, eVar, i11), new d(hVar)), f.f10717s), 2);
        U7.a aVar2 = new U7.a(new d(this, 26), new h(this, 22));
        try {
            fVar3.a(new j(aVar2, 0));
            hVar.f10731S0.a(aVar2);
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th) {
            l.n(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }
}

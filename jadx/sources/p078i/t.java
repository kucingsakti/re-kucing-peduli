package p078i;

import android.view.Window;
import p.InterfaceC0700e0;
import p136o.l;
import p136o.w;

/* JADX INFO: loaded from: classes.dex */
public final class t implements InterfaceC0700e0, w {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ D f12118s;

    public /* synthetic */ t(D d3) {
        this.f12118s = d3;
    }

    @Override // p136o.w
    public void c(l lVar, boolean z6) {
        C c10;
        l lVarK = lVar.k();
        int i10 = 0;
        boolean z10 = lVarK != lVar;
        if (z10) {
            lVar = lVarK;
        }
        D d3 = this.f12118s;
        C[] cArr = d3.f11947d0;
        int length = cArr != null ? cArr.length : 0;
        while (true) {
            if (i10 < length) {
                c10 = cArr[i10];
                if (c10 != null && c10.f11910h == lVar) {
                    break;
                } else {
                    i10++;
                }
            } else {
                c10 = null;
                break;
            }
        }
        if (c10 != null) {
            if (!z10) {
                d3.s(c10, z6);
            } else {
                d3.p(c10.a, c10, lVarK);
                d3.s(c10, true);
            }
        }
    }

    @Override // p136o.w
    public boolean l(l lVar) {
        Window.Callback callback;
        if (lVar != lVar.k()) {
            return true;
        }
        D d3 = this.f12118s;
        if (!d3.f11942X || (callback = d3.f11923D.getCallback()) == null || d3.f11951i0) {
            return true;
        }
        callback.onMenuOpened(108, lVar);
        return true;
    }
}

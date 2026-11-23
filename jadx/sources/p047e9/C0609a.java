package p047e9;

import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import h9.b;
import h9.c;
import h9.e;
import h9.i;
import h9.j;
import org.chromium.net.UrlRequest;
import p104k9.AbstractC0673b;
import p104k9.C0676e;
import p104k9.C0678g;

/* JADX INFO: renamed from: e9.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0609a extends AbstractC0673b {
    public final /* synthetic */ int a;

    public /* synthetic */ C0609a(int i10) {
        this.a = i10;
    }

    @Override // p104k9.u
    public final Object a(C0676e c0676e, C0678g c0678g) {
        switch (this.a) {
            case 0:
                return new C0615g(c0676e, c0678g);
            case 1:
                return new C0613e(c0676e, c0678g);
            case 2:
                return new C0612d(c0676e, c0678g);
            case 3:
                return new C0618j(c0676e, c0678g);
            case 4:
                return new C0620l(c0676e, c0678g);
            case 5:
                return new C0622n(c0676e, c0678g);
            case 6:
                return new r(c0676e, c0678g);
            case 7:
                return new C0627t(c0676e, c0678g);
            case 8:
                return new C0630w(c0676e, c0678g);
            case 9:
                return new C0632y(c0676e, c0678g);
            case 10:
                return new C(c0676e, c0678g);
            case 11:
                return new E(c0676e, c0678g);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return new G(c0676e, c0678g);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return new K(c0676e, c0678g);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new J(c0676e);
            case 15:
                return new L(c0676e);
            case 16:
                return new Q(c0676e, c0678g);
            case 17:
                return new O(c0676e, c0678g);
            case 18:
                return new T(c0676e, c0678g);
            case 19:
                return new W(c0676e, c0678g);
            case 20:
                return new X(c0676e, c0678g);
            case MobileAdsBridge.CODE_21 /* 21 */:
                return new Z(c0676e, c0678g);
            case 22:
                return new d0(c0676e);
            case 23:
                return new e0(c0676e, c0678g);
            case 24:
                return new b(c0676e);
            case 25:
                return new c(c0676e);
            case 26:
                return new e(c0676e, c0678g);
            case 27:
                return new j(c0676e, c0678g);
            default:
                return new i(c0676e);
        }
    }
}

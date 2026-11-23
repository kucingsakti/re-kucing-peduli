package ya;

import A1.C0099h;
import X9.C0456b;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class I {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final char[] f16149l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Pattern f16150m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X9.y f16151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f16152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public X9.x f16153d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Fa.e f16154e = new Fa.e(11);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final M1.c f16155f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public X9.A f16156g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f16157h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C0099h f16158i;
    public final o1.e j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public X9.J f16159k;

    public I(String str, X9.y yVar, String str2, X9.w wVar, X9.A a, boolean z6, boolean z10, boolean z11) {
        this.a = str;
        this.f16151b = yVar;
        this.f16152c = str2;
        this.f16156g = a;
        this.f16157h = z6;
        if (wVar != null) {
            this.f16155f = wVar.g();
        } else {
            this.f16155f = new M1.c(3);
        }
        if (z10) {
            this.j = new o1.e();
            return;
        }
        if (z11) {
            C0099h c0099h = new C0099h(29);
            this.f16158i = c0099h;
            X9.A a10 = X9.C.f5437f;
            p210v8.i.f(a10, com.onesignal.inAppMessages.internal.display.impl.k.EVENT_TYPE_KEY);
            if (!a10.f5433b.equals("multipart")) {
                throw new IllegalArgumentException(p210v8.i.k(a10, "multipart != ").toString());
            }
            c0099h.f104u = a10;
        }
    }

    public final void a(String str, String str2, boolean z6) {
        o1.e eVar = this.j;
        if (z6) {
            eVar.getClass();
            p210v8.i.f(str, MediationMetaData.KEY_NAME);
            ((ArrayList) eVar.f13627t).add(C0456b.b(str, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", 83));
            ((ArrayList) eVar.f13628u).add(C0456b.b(str2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", 83));
            return;
        }
        eVar.getClass();
        p210v8.i.f(str, MediationMetaData.KEY_NAME);
        ((ArrayList) eVar.f13627t).add(C0456b.b(str, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", 91));
        ((ArrayList) eVar.f13628u).add(C0456b.b(str2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", 91));
    }

    public final void b(String str, String str2) {
        if (!"Content-Type".equalsIgnoreCase(str)) {
            this.f16155f.a(str, str2);
            return;
        }
        try {
            Pattern pattern = X9.A.f5431d;
            this.f16156g = p068ga.d.k(str2);
        } catch (IllegalArgumentException e10) {
            throw new IllegalArgumentException(E0.a.h("Malformed content type: ", str2), e10);
        }
    }

    public final void c(X9.w wVar, X9.J j) {
        C0099h c0099h = this.f16158i;
        c0099h.getClass();
        p210v8.i.f(j, "body");
        if (wVar.e("Content-Type") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Type");
        }
        if (wVar.e("Content-Length") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Length");
        }
        ((ArrayList) c0099h.f105v).add(new X9.B(wVar, j));
    }

    public final void d(String str, String str2, boolean z6) {
        String str3 = this.f16152c;
        if (str3 != null) {
            X9.y yVar = this.f16151b;
            X9.x xVarF = yVar.f(str3);
            this.f16153d = xVarF;
            if (xVarF == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + yVar + ", Relative: " + this.f16152c);
            }
            this.f16152c = null;
        }
        if (z6) {
            X9.x xVar = this.f16153d;
            xVar.getClass();
            p210v8.i.f(str, "encodedName");
            if (xVar.f5653g == null) {
                xVar.f5653g = new ArrayList();
            }
            ArrayList arrayList = xVar.f5653g;
            p210v8.i.c(arrayList);
            arrayList.add(C0456b.b(str, 0, 0, " \"'<>#&=", 211));
            ArrayList arrayList2 = xVar.f5653g;
            p210v8.i.c(arrayList2);
            arrayList2.add(str2 != null ? C0456b.b(str2, 0, 0, " \"'<>#&=", 211) : null);
            return;
        }
        X9.x xVar2 = this.f16153d;
        xVar2.getClass();
        p210v8.i.f(str, MediationMetaData.KEY_NAME);
        if (xVar2.f5653g == null) {
            xVar2.f5653g = new ArrayList();
        }
        ArrayList arrayList3 = xVar2.f5653g;
        p210v8.i.c(arrayList3);
        arrayList3.add(C0456b.b(str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", 219));
        ArrayList arrayList4 = xVar2.f5653g;
        p210v8.i.c(arrayList4);
        arrayList4.add(str2 != null ? C0456b.b(str2, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", 219) : null);
    }
}

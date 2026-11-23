package p188t1;

import T3.c;
import com.aheaditec.talsec_security.security.Natives;
import java.util.LinkedList;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import p086i8.C;
import p102k7.e;
import p181s3.d;
import p204v1.f;
import p204v1.i;

/* JADX INFO: renamed from: t1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0839b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f15007d = 0;
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f15008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedList f15009c = new LinkedList();

    static {
        System.loadLibrary(C.a(C.c("036EBDCB")));
    }

    public C0839b(f fVar, String str, i iVar) {
        this.a = str;
        this.f15008b = fVar;
        Executors.newSingleThreadScheduledExecutor().scheduleAtFixedRate(new d(this, 1), 1L, 5L, TimeUnit.SECONDS);
    }

    public final void a(h0 h0Var) {
        try {
            e eVar = (e) this.f15008b.f15394c;
            String string = h0Var.a().toString();
            if (C.a(C.c("1267B8CC0BF6C0")).equals(C.a(C.c("0467B6DC0D")))) {
                C.a(C.c("2C4D93"));
                return;
            }
            String strA = ((f) eVar.f12743s).a ? C.a(C.c("0876A0D919BF8AE897620A1A82037520CACDABF64098311257ADB1382FE43F4B")) : C.a(C.c("0876A0D919BF8AE897620A1A82037520CACDABF64098311257ADB1383BE43F4B"));
            String str = this.a;
            String str2 = String.format(C.a(C.c("33469F8423E1C0A9927E09019E5F2E7486DA")), (String) ((c) h0Var.f15039c.f14981v).f4662g);
            p210v8.i.f(string, C.a(C.c("0463A0C8")));
            Natives.a.e(string, strA, str, str2);
        } catch (JSONException unused) {
        }
    }
}

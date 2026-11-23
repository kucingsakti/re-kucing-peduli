package p014b2;

import android.os.Build;
import c2.c;
import c2.d;
import c2.j;
import c2.l;
import com.google.android.gms.internal.measurement.S;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.TimeZone;
import org.chromium.net.UrlRequest;
import p076h8.f;
import p086i8.s;
import p086i8.t;
import p200u8.a;
import p210v8.i;
import p210v8.k;

/* JADX INFO: loaded from: classes.dex */
public final class w extends k implements a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f7266s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ x f7267t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(x xVar, int i10) {
        super(0);
        this.f7266s = i10;
        this.f7267t = xVar;
    }

    @Override // p200u8.a
    public final Object invoke() {
        Object objInvoke;
        Object objInvoke2;
        String strValueOf;
        String displayName;
        switch (this.f7266s) {
            case 0:
                Z1.a aVar = new Z1.a(this.f7267t.a, 2);
                Object objInvoke3 = t.f12329s;
                try {
                    objInvoke3 = aVar.invoke();
                    break;
                } catch (Exception unused) {
                }
                return new F((Map) objInvoke3);
            case 1:
                Z1.a aVar2 = new Z1.a(this.f7267t.a, 3);
                Object objInvoke4 = c.f7436c;
                try {
                    objInvoke4 = aVar2.invoke();
                    break;
                } catch (Exception unused2) {
                }
                return new G((c) objInvoke4);
            case 2:
                try {
                    objInvoke = new d(this.f7267t.f7305m, 1).invoke();
                    break;
                } catch (Exception unused3) {
                    objInvoke = "";
                }
                return new H((String) objInvoke);
            case 3:
                try {
                    objInvoke2 = new d(this.f7267t.f7305m, 2).invoke();
                    break;
                } catch (Exception unused4) {
                    objInvoke2 = "";
                }
                return new I((String) objInvoke2);
            case 4:
                return new C0549m(Build.VERSION.SDK_INT >= 28 ? this.f7267t.f7304l.c("rtt_calling_mode") : "", 3);
            case 5:
                return new J(this.f7267t.f7304l.d("screen_off_timeout"));
            case 6:
                p230x9.d dVar = this.f7267t.f7301h;
                try {
                    strValueOf = String.valueOf(Build.VERSION.SDK_INT);
                    break;
                } catch (Exception unused5) {
                    strValueOf = "";
                }
                return new K(strValueOf);
            case 7:
                S s9 = this.f7267t.j;
                RandomAccess randomAccess = s.f12328s;
                try {
                    Provider[] providers = Security.getProviders();
                    i.e(providers, "getProviders()");
                    ArrayList arrayList = new ArrayList(providers.length);
                    for (Provider provider : providers) {
                        String name = provider.getName();
                        String info = provider.getInfo();
                        if (info == null) {
                            info = "";
                        }
                        arrayList.add(new f(name, info));
                    }
                    randomAccess = arrayList;
                } catch (Exception unused6) {
                }
                return new L((List) randomAccess);
            case 8:
                c2.a aVar3 = new c2.a(this.f7267t.f7296c, 5);
                Object objInvoke5 = s.f12328s;
                try {
                    objInvoke5 = aVar3.invoke();
                    break;
                } catch (Exception unused7) {
                }
                return new M((List) objInvoke5);
            case 9:
                l lVar = new l(this.f7267t.f7303k, 1);
                Object objInvoke6 = s.f12328s;
                try {
                    objInvoke6 = lVar.invoke();
                    break;
                } catch (Exception unused8) {
                }
                return new N((List) objInvoke6);
            case 10:
                return new C0549m(this.f7267t.f7304l.d("auto_punctuate"), 4);
            case 11:
                return new C0549m(this.f7267t.f7304l.d("auto_replace"), 5);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return new O(this.f7267t.f7304l.d("time_12_24"));
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                Y1.c cVar = this.f7267t.f7305m;
                try {
                    displayName = TimeZone.getDefault().getDisplayName();
                    i.e(displayName, "getDefault().displayName");
                    break;
                } catch (Exception unused9) {
                    displayName = "";
                }
                return new P(displayName);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Object objInvoke7 = 0L;
                try {
                    objInvoke7 = new j(this.f7267t.f7294b, 0).invoke();
                    break;
                } catch (Exception unused10) {
                }
                return new Q(((Number) objInvoke7).longValue());
            case 15:
                Object objInvoke8 = 0L;
                try {
                    objInvoke8 = new j(this.f7267t.f7294b, 1).invoke();
                    break;
                } catch (Exception unused11) {
                }
                return new S(((Number) objInvoke8).longValue());
            case 16:
                return new T(this.f7267t.f7304l.c("touch_exploration_enabled"));
            case 17:
                return new U(this.f7267t.f7304l.b("transition_animation_scale"));
            default:
                return new V(this.f7267t.f7304l.b("window_animation_scale"));
        }
    }
}

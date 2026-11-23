package p014b2;

import V.h;
import Y1.c;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import c2.e;
import c2.l;
import com.kcstream.cing.MainApp;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import java.util.List;
import java.util.Locale;
import org.chromium.net.UrlRequest;
import p086i8.s;
import p200u8.a;
import p204v1.g;
import p210v8.i;
import p210v8.k;
import p230x9.d;

/* JADX INFO: renamed from: b2.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0557v extends k implements a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f7264s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ x f7265t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0557v(x xVar, int i10) {
        super(0);
        this.f7264s = i10;
        this.f7265t = xVar;
    }

    @Override // p200u8.a
    public final Object invoke() {
        String str;
        String str2;
        Object objInvoke;
        int intExtra;
        Object objInvoke2;
        String str3;
        Object objInvoke3;
        String str4;
        String str5;
        switch (this.f7264s) {
            case 0:
                g gVar = this.f7265t.a;
                try {
                    str = Build.SUPPORTED_ABIS[0];
                    i.e(str, "Build.SUPPORTED_ABIS[0]");
                    break;
                } catch (Exception unused) {
                    str = "";
                }
                return new C0537a(str);
            case 1:
                return new C0538b(this.f7265t.f7304l.c("accessibility_enabled"));
            case 2:
                return new C0539c(this.f7265t.f7304l.b("adb_enabled"));
            case 3:
                return new C0540d(this.f7265t.f7304l.d("alarm_alert"));
            case 4:
                d dVar = this.f7265t.f7301h;
                try {
                    i.e(Build.VERSION.RELEASE, "RELEASE");
                    str2 = Build.VERSION.RELEASE;
                    break;
                } catch (Exception unused2) {
                    str2 = "";
                }
                return new C0541e(str2);
            case 5:
                l lVar = new l(this.f7265t.f7303k, 0);
                Object objInvoke4 = s.f12328s;
                try {
                    objInvoke4 = lVar.invoke();
                    break;
                } catch (Exception unused3) {
                }
                return new C0542f((List) objInvoke4, 0);
            case 6:
                Object objInvoke5 = new String[0];
                try {
                    objInvoke5 = new c2.d(this.f7265t.f7305m, 0).invoke();
                    break;
                } catch (Exception unused4) {
                }
                return new C0543g(p086i8.i.H((String[]) objInvoke5));
            case 7:
                try {
                    objInvoke = new c2.a(this.f7265t.f7298e, 0).invoke();
                    break;
                } catch (Exception unused5) {
                    objInvoke = "";
                }
                return new C0544h((String) objInvoke);
            case 8:
                Intent intentRegisterReceiver = ((MainApp) this.f7265t.f7298e.f3811t).registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                String str6 = "";
                if (intentRegisterReceiver != null && (intExtra = intentRegisterReceiver.getIntExtra("health", -1)) != -1) {
                    switch (intExtra) {
                        case 2:
                            str6 = "good";
                            break;
                        case 3:
                            str6 = "overheat";
                            break;
                        case 4:
                            str6 = "dead";
                            break;
                        case 5:
                            str6 = "over voltage";
                            break;
                        case 6:
                            str6 = "unspecified failure";
                            break;
                        case 7:
                            str6 = "cold";
                            break;
                        default:
                            str6 = "unknown";
                            break;
                    }
                }
                return new C0545i(str6);
            case 9:
                Z1.a aVar = new Z1.a(this.f7265t.f7299f, 1);
                Object objInvoke6 = s.f12328s;
                try {
                    objInvoke6 = aVar.invoke();
                    break;
                } catch (Exception unused6) {
                }
                return new C0546j((List) objInvoke6);
            case 10:
                h hVar = this.f7265t.f7302i;
                Object objInvoke7 = s.f12328s;
                try {
                    objInvoke7 = new c2.a(hVar, 1).invoke();
                    break;
                } catch (Exception unused7) {
                }
                return new C0547k((List) objInvoke7);
            case 11:
                g gVar2 = this.f7265t.a;
                Integer numValueOf = 0;
                try {
                    numValueOf = Integer.valueOf(Runtime.getRuntime().availableProcessors());
                    break;
                } catch (Exception unused8) {
                }
                return new C0548l(numValueOf.intValue());
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return new C0549m(this.f7265t.f7304l.b("data_roaming"), 0);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return new C0550n(this.f7265t.f7304l.d("date_format"));
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new C0551o(this.f7265t.f7304l.c("default_input_method"));
            case 15:
                c cVar = this.f7265t.f7305m;
                String language = Locale.getDefault().getLanguage();
                i.e(language, "getDefault().language");
                return new C0552p(language);
            case 16:
                return new C0553q(this.f7265t.f7304l.b("development_settings_enabled"));
            case 17:
                try {
                    objInvoke2 = new e(this.f7265t.j, 0).invoke();
                    break;
                } catch (Exception unused9) {
                    objInvoke2 = "";
                }
                return new r((String) objInvoke2);
            case 18:
                return new C0554s(this.f7265t.f7304l.d("end_button_behavior"));
            case 19:
                c2.a aVar2 = new c2.a(this.f7265t.f7306n, 2);
                Object objInvoke8 = c2.g.UNKNOWN;
                try {
                    objInvoke8 = aVar2.invoke();
                    break;
                } catch (Exception unused10) {
                }
                return new C0555t(((c2.g) objInvoke8).f7447s);
            case 20:
                d dVar2 = this.f7265t.f7301h;
                try {
                    i.e(Build.FINGERPRINT, "FINGERPRINT");
                    str3 = Build.FINGERPRINT;
                    break;
                } catch (Exception unused11) {
                    str3 = "";
                }
                return new C0549m(str3, 1);
            case MobileAdsBridge.CODE_21 /* 21 */:
                return new y(this.f7265t.f7304l.d("font_scale"));
            case 22:
                try {
                    objInvoke3 = new c2.a(this.f7265t.f7300g, 3).invoke();
                    break;
                } catch (Exception unused12) {
                    objInvoke3 = "";
                }
                return new z((String) objInvoke3);
            case 23:
                return new C0549m(this.f7265t.f7304l.b("http_proxy"), 2);
            case 24:
                c2.a aVar3 = new c2.a(this.f7265t.f7297d, 4);
                Object objInvoke9 = s.f12328s;
                try {
                    objInvoke9 = aVar3.invoke();
                    break;
                } catch (Exception unused13) {
                }
                return new A((List) objInvoke9);
            case 25:
                c2.a aVar4 = new c2.a(this.f7265t.f7297d, 4);
                Object objInvoke10 = s.f12328s;
                try {
                    objInvoke10 = aVar4.invoke();
                    break;
                } catch (Exception unused14) {
                }
                return new C0542f((List) objInvoke10, 1);
            case 26:
                e eVar = new e(this.f7265t.j, 1);
                Object objInvoke11 = Boolean.FALSE;
                try {
                    objInvoke11 = eVar.invoke();
                    break;
                } catch (Exception unused15) {
                }
                return new B(((Boolean) objInvoke11).booleanValue());
            case 27:
                String str7 = "";
                d dVar3 = this.f7265t.f7301h;
                try {
                    String property = System.getProperty("os.version");
                    if (property != null) {
                        str7 = property;
                    }
                } catch (Exception unused16) {
                }
                return new C(str7);
            case 28:
                d dVar4 = this.f7265t.f7301h;
                try {
                    i.e(Build.MANUFACTURER, "MANUFACTURER");
                    str4 = Build.MANUFACTURER;
                    break;
                } catch (Exception unused17) {
                    str4 = "";
                }
                return new D(str4);
            default:
                d dVar5 = this.f7265t.f7301h;
                try {
                    i.e(Build.MODEL, "MODEL");
                    str5 = Build.MODEL;
                    break;
                } catch (Exception unused18) {
                    str5 = "";
                }
                return new E(str5);
        }
    }
}

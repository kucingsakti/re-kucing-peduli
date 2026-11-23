package F4;

import A1.RunnableC0094c;
import C0.p;
import C0.r;
import C0.t;
import C0.u;
import C0.v;
import E4.B;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.os.Handler;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import androidx.preference.SwitchPreferenceCompat;
import com.kcstream.cing.R;
import kotlin.Metadata;
import o1.k;
import p078i.AbstractActivityC0655l;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LF4/f;", "LC0/r;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class f extends r {

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public SharedPreferences f1500B0;

    @Override // androidx.fragment.app.b
    public final void A(int i10, int i11, Intent intent) {
        if (i10 == 1 && i11 == -1) {
            SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) g0("security_lock_app");
            i.c(switchPreferenceCompat);
            switchPreferenceCompat.C(false);
        }
        super.A(i10, i11, intent);
    }

    @Override // C0.r
    public final void h0(String str) {
        Preference preferenceC;
        v vVar = this.f877u0;
        if (vVar == null) {
            throw new RuntimeException("This should be called after super.onCreate.");
        }
        Context contextX = X();
        vVar.f899e = true;
        u uVar = new u(contextX, vVar);
        XmlResourceParser xml = contextX.getResources().getXml(R.xml.root_preferences);
        try {
            PreferenceGroup preferenceGroupC = uVar.c(xml);
            xml.close();
            PreferenceScreen preferenceScreen = (PreferenceScreen) preferenceGroupC;
            preferenceScreen.p(vVar);
            SharedPreferences.Editor editor = vVar.f898d;
            if (editor != null) {
                editor.apply();
            }
            vVar.f899e = false;
            PreferenceScreen preferenceScreen2 = preferenceScreen;
            if (str != null) {
                preferenceC = preferenceScreen.C(str);
                if (!(preferenceC instanceof PreferenceScreen)) {
                    preferenceScreen2 = preferenceC;
                    throw new IllegalArgumentException(E0.a.i("Preference object with key ", str, " is not a PreferenceScreen"));
                }
            }
            preferenceScreen2 = preferenceC;
            PreferenceScreen preferenceScreen3 = preferenceScreen2;
            v vVar2 = this.f877u0;
            PreferenceScreen preferenceScreen4 = vVar2.f901g;
            if (preferenceScreen3 != preferenceScreen4) {
                if (preferenceScreen4 != null) {
                    preferenceScreen4.s();
                }
                vVar2.f901g = preferenceScreen3;
                if (preferenceScreen3 != null) {
                    this.f879w0 = true;
                    if (this.f880x0) {
                        p pVar = this.f882z0;
                        if (!pVar.hasMessages(1)) {
                            pVar.obtainMessage(1).sendToTarget();
                        }
                    }
                }
            }
            Context contextM = m();
            if (contextM != null) {
                SharedPreferences sharedPreferences = contextM.getSharedPreferences(v.a(contextM), 0);
                i.e(sharedPreferences, "getDefaultSharedPreferences(...)");
                this.f1500B0 = sharedPreferences;
            }
            Preference preferenceG0 = g0("tentang_app");
            if (preferenceG0 != null) {
                preferenceG0.f6837x = new a(this, 0);
            }
            SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) g0("notification_alert");
            if (switchPreferenceCompat != null) {
                switchPreferenceCompat.f6836w = new D3.i(5);
            }
            SwitchPreferenceCompat switchPreferenceCompat2 = (SwitchPreferenceCompat) g0("security_lock_app");
            if (switchPreferenceCompat2 != null) {
                switchPreferenceCompat2.f6836w = new B(switchPreferenceCompat2, 1, this);
            }
            SwitchPreferenceCompat switchPreferenceCompat3 = (SwitchPreferenceCompat) g0("security_lock_fingerprint");
            if (switchPreferenceCompat3 != null) {
                AbstractActivityC0655l abstractActivityC0655lF = f();
                i.d(abstractActivityC0655lF, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                p027c7.b kVar = Build.VERSION.SDK_INT >= 28 ? new k(abstractActivityC0655lF) : new p045e7.b(abstractActivityC0655lF);
                if (kVar.c()) {
                    if (!kVar.d() && switchPreferenceCompat3.f6817O) {
                        switchPreferenceCompat3.f6817O = false;
                        t tVar = switchPreferenceCompat3.f6826Y;
                        if (tVar != null) {
                            Handler handler = tVar.f889h;
                            RunnableC0094c runnableC0094c = tVar.f890i;
                            handler.removeCallbacks(runnableC0094c);
                            handler.post(runnableC0094c);
                        }
                    }
                } else if (switchPreferenceCompat3.f6817O) {
                    switchPreferenceCompat3.f6817O = false;
                    t tVar2 = switchPreferenceCompat3.f6826Y;
                    if (tVar2 != null) {
                        Handler handler2 = tVar2.f889h;
                        RunnableC0094c runnableC0094c2 = tVar2.f890i;
                        handler2.removeCallbacks(runnableC0094c2);
                        handler2.post(runnableC0094c2);
                    }
                }
                switchPreferenceCompat3.f6836w = new a(this, 1);
            }
            SwitchPreferenceCompat switchPreferenceCompat4 = (SwitchPreferenceCompat) g0("disguise_app");
            if (switchPreferenceCompat4 != null) {
                switchPreferenceCompat4.f6836w = new a(this, 2);
            }
            Preference preferenceG1 = g0("disguise_icon");
            if (preferenceG1 != null) {
                preferenceG1.f6837x = new a(this, 3);
            }
            Preference preferenceG2 = g0("storage_delete_cache");
            if (preferenceG2 != null) {
                preferenceG2.f6837x = new a(this, 4);
            }
            Preference preferenceG3 = g0("storage_delete_all_files");
            if (preferenceG3 != null) {
                preferenceG3.f6837x = new a(this, 5);
            }
            Preference preferenceG4 = g0("restore_bookmark");
            if (preferenceG4 != null) {
                preferenceG4.f6837x = new a(this, 6);
            }
            Preference preferenceG5 = g0("backup_bookmark");
            if (preferenceG5 == null) {
                return;
            }
            preferenceG5.f6837x = new a(this, 7);
        } catch (Throwable th) {
            xml.close();
            throw th;
        }
    }
}

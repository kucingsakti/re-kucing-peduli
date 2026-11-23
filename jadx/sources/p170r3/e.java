package p170r3;

import A1.E;
import A1.m;
import A9.AbstractC0151y;
import A9.S;
import A9.T;
import A9.b0;
import C0.l;
import E4.B;
import G9.p;
import H0.d;
import L8.P;
import N6.i;
import U.C0437x;
import V1.a;
import V3.c;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import com.google.android.gms.stats.zzd;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.components.ComponentRegistrar;
import com.kcstream.cing.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.ILoggerFactory;
import p136o.w;
import p199u7.b;

/* JADX INFO: loaded from: classes.dex */
public class e implements a, l, d, Continuation, zzd, N7.a, c, i, com.google.gson.internal.l, w, ILoggerFactory, b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static e f14467t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static e f14468u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static e f14469v;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f14470s;

    public /* synthetic */ e(int i10) {
        this.f14470s = i10;
    }

    public static S e(P p10, Z8.a aVar, o1.e eVar, AbstractC0151y abstractC0151y) {
        p210v8.i.f(aVar, "typeAttr");
        p210v8.i.f(eVar, "typeParameterUpperBoundEraser");
        if (!aVar.f5906c) {
            aVar = aVar.b(1);
        }
        int iD = p239z.e.d(aVar.f5905b);
        if (iD != 0 && iD != 1) {
            if (iD == 2) {
                return new T(1, abstractC0151y);
            }
            throw new NoWhenBranchMatchedException();
        }
        int iJ0 = p10.j0();
        boolean z6 = true;
        if (iJ0 != 1) {
            if (iJ0 == 2) {
                z6 = false;
            } else if (iJ0 != 3) {
                throw null;
            }
        }
        if (!z6) {
            return new T(1, p165q9.d.e(p10).n());
        }
        List listU = abstractC0151y.D().u();
        p210v8.i.e(listU, "erasedUpperBound.constructor.parameters");
        return !listU.isEmpty() ? new T(3, abstractC0151y) : b0.k(p10, aVar);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object C(Task task) {
        if (task.k()) {
            return null;
        }
        task.f();
        return null;
    }

    @Override // org.slf4j.ILoggerFactory
    public va.a a(String str) {
        return xa.a.f15796s;
    }

    @Override // C0.l
    public CharSequence b(Preference preference) {
        EditTextPreference editTextPreference = (EditTextPreference) preference;
        return TextUtils.isEmpty(editTextPreference.f6791l0) ? editTextPreference.f6832s.getString(R.string.not_set) : editTextPreference.f6791l0;
    }

    @Override // H0.d
    public void d(int i10, Serializable serializable) {
        if (i10 == 6 || i10 == 7 || i10 == 8) {
        }
    }

    @Override // V3.c
    public V3.a f(za.c cVar, JSONObject jSONObject) throws JSONException {
        long jCurrentTimeMillis;
        jSONObject.optInt("settings_version", 0);
        int iOptInt = jSONObject.optInt("cache_duration", 3600);
        double dOptDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double dOptDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int iOptInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        p pVar = jSONObject.has("session") ? new p(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8)) : new p(new JSONObject().optInt("max_custom_exception_events", 8));
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        m mVar = new m(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false));
        long j = iOptInt;
        if (jSONObject.has("expires_at")) {
            jCurrentTimeMillis = jSONObject.optLong("expires_at");
        } else {
            jCurrentTimeMillis = (j * 1000) + System.currentTimeMillis();
        }
        return new V3.a(jCurrentTimeMillis, pVar, mVar, dOptDouble, dOptDouble2, iOptInt2);
    }

    public List g(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (I3.b bVar : componentRegistrar.getComponents()) {
            String str = bVar.a;
            if (str != null) {
                B b3 = new B(str, 20, bVar);
                bVar = new I3.b(str, bVar.f2018b, bVar.f2019c, bVar.f2020d, bVar.f2021e, b3, bVar.f2023g);
            }
            arrayList.add(bVar);
        }
        return arrayList;
    }

    @Override // N6.i
    public void j(View view, float f10) {
        switch (this.f14470s) {
            case 15:
                view.setCameraDistance(20000.0f);
                if (f10 < -1.0f) {
                    view.setAlpha(0.0f);
                } else if (f10 <= 0.0f) {
                    view.setAlpha(1.0f);
                    view.setPivotX(view.getWidth());
                    view.setRotationY(Math.abs(f10) * 90.0f);
                } else if (f10 <= 1.0f) {
                    view.setAlpha(1.0f);
                    view.setPivotX(0.0f);
                    view.setRotationY(Math.abs(f10) * (-90.0f));
                } else {
                    view.setAlpha(0.0f);
                }
                if (Math.abs(f10) <= 0.5d) {
                    view.setScaleY(Math.max(0.4f, 1.0f - Math.abs(f10)));
                } else if (Math.abs(f10) <= 1.0f) {
                    view.setScaleY(Math.max(0.4f, Math.abs(f10)));
                }
                break;
            case 16:
                view.setTranslationX((-f10) * view.getWidth());
                view.setPivotX(0.0f);
                view.setPivotY(view.getHeight() / 2);
                view.setCameraDistance(20000.0f);
                if (f10 < -1.0f) {
                    view.setAlpha(0.0f);
                } else if (f10 <= 0.0f) {
                    view.setAlpha(1.0f);
                    view.setRotationY(Math.abs(f10) * (-120.0f));
                } else if (f10 > 1.0f) {
                    view.setAlpha(0.0f);
                } else {
                    view.setAlpha(1.0f);
                    view.setRotationY(Math.abs(f10) * 120.0f);
                }
                break;
        }
    }

    @Override // p136o.w
    public boolean l(p136o.l lVar) {
        return false;
    }

    @Override // com.google.gson.internal.l
    public Object n() {
        switch (this.f14470s) {
            case 19:
                return new LinkedHashSet();
            default:
                return new LinkedHashMap();
        }
    }

    @Override // V1.a
    public Object o() {
        return new E();
    }

    public String toString() {
        switch (this.f14470s) {
            case 10:
                return "EmptyAction";
            default:
                return super.toString();
        }
    }

    public e(p247z9.l lVar) {
        this.f14470s = 26;
        String str = p247z9.l.f16334d;
        new ConcurrentHashMap(3, 1.0f, 2);
    }

    public e(View view) {
        this.f14470s = 11;
        if (Build.VERSION.SDK_INT >= 30) {
            new C0437x(view, 11);
        } else {
            new p053f4.e(view, 11);
        }
    }

    @Override // N7.a
    /* JADX INFO: renamed from: run */
    public void mo0run() {
    }

    private final void h(View view, float f10) {
    }

    @Override // p136o.w
    public void c(p136o.l lVar, boolean z6) {
    }
}

package p204v1;

import E4.C0187a;
import K0.g;
import X9.C0460f;
import X9.C0461g;
import Y9.c;
import android.net.Uri;
import androidx.recyclerview.widget.s;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.internal.measurement.S;
import com.google.android.material.tabs.TabLayout;
import com.kcstream.cing.activity.Browser2Activity;
import java.io.IOException;
import ma.v;
import p102k7.e;
import p188t1.C0839b;
import p188t1.G;
import p195u1.b;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile f f15392f;
    public boolean a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f15393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f15394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f15395d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f15396e;

    public f(G g8, S s9, String str, f fVar, i iVar) {
        this.f15393b = g8;
        this.a = str != null;
        this.f15394c = s9;
        this.f15395d = fVar;
        this.f15396e = new C0839b(fVar, str, iVar);
    }

    public void a() {
        synchronized (((C0461g) this.f15396e)) {
            if (this.a) {
                return;
            }
            this.a = true;
            c.d((v) this.f15394c);
            try {
                ((g) this.f15393b).c();
            } catch (IOException unused) {
            }
        }
    }

    public void b() {
        TabLayout tabLayout = (TabLayout) this.f15393b;
        tabLayout.i();
        s sVar = (s) this.f15396e;
        if (sVar != null) {
            int iA = sVar.a();
            for (int i10 = 0; i10 < iA; i10++) {
                p206v3.f fVarH = tabLayout.h();
                C0187a c0187a = (C0187a) this.f15395d;
                int i11 = Browser2Activity.f10164X;
                String host = Uri.parse((String) ((Browser2Activity) c0187a.f1398t).f10165Q.get(i10)).getHost();
                if (host == null) {
                    host = "No Title";
                }
                fVarH.a(host);
                tabLayout.b(fVarH, false);
            }
            if (iA > 0) {
                int iMin = Math.min(((ViewPager2) this.f15394c).getCurrentItem(), tabLayout.getTabCount() - 1);
                if (iMin != tabLayout.getSelectedTabPosition()) {
                    tabLayout.j(tabLayout.g(iMin), true);
                }
            }
        }
    }

    public f(b bVar) {
        this.f15394c = new e(this);
        this.f15395d = new e(this);
        this.f15396e = new e(this);
        this.f15393b = bVar;
        this.a = bVar.f15289t;
    }

    public f(TabLayout tabLayout, ViewPager2 viewPager2, C0187a c0187a) {
        this.f15393b = tabLayout;
        this.f15394c = viewPager2;
        this.f15395d = c0187a;
    }

    public f(C0461g c0461g, g gVar) {
        i.f(c0461g, "this$0");
        this.f15396e = c0461g;
        this.f15393b = gVar;
        v vVarJ = gVar.j(1);
        this.f15394c = vVarJ;
        this.f15395d = new C0460f(c0461g, this, vVarJ);
    }
}

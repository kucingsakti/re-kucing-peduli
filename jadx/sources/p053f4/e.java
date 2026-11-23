package p053f4;

import A1.m;
import C8.InterfaceC0175c;
import E1.A;
import E1.C0185g;
import E1.r;
import E1.s;
import E1.x;
import G9.p;
import H0.d;
import H1.B;
import H1.C;
import N1.g;
import N6.i;
import P3.c;
import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.media.MediaMetadataRetriever;
import android.view.View;
import androidx.lifecycle.N;
import androidx.lifecycle.Q;
import androidx.lifecycle.T;
import com.google.android.gms.internal.stats.zze;
import com.google.android.material.tabs.TabLayout;
import com.google.gson.internal.l;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import k2.b;
import org.json.JSONObject;
import p169r2.a;
import p206v3.h;

/* JADX INFO: loaded from: classes.dex */
public class e implements s, d, C, zze, g, c, V3.c, T, i, l, b, a, p199u7.b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f11437s;

    public /* synthetic */ e(int i10) {
        this.f11437s = i10;
    }

    public static RectF o(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (tabLayout.f9835V || !(view instanceof h)) {
            return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        h hVar = (h) view;
        int contentWidth = hVar.getContentWidth();
        int contentHeight = hVar.getContentHeight();
        int iE = (int) p091j3.C.e(hVar.getContext(), 24);
        if (contentWidth < iE) {
            contentWidth = iE;
        }
        int right = (hVar.getRight() + hVar.getLeft()) / 2;
        int bottom = (hVar.getBottom() + hVar.getTop()) / 2;
        int i10 = contentWidth / 2;
        return new RectF(right - i10, bottom - (contentHeight / 2), i10 + right, (right / 2) + bottom);
    }

    public static V3.a p(za.c cVar) {
        return new V3.a(System.currentTimeMillis() + ((long) 3600000), new p(8), new m(true, false, false), 10.0d, 1.2d, 60);
    }

    @Override // E1.s
    public r D(x xVar) {
        return new A(xVar.b(C0185g.class, InputStream.class), 1);
    }

    @Override // N1.g
    public void b(N1.i iVar) {
        iVar.e();
    }

    @Override // H1.C
    public void c(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        mediaMetadataRetriever.setDataSource(new B((ByteBuffer) obj));
    }

    @Override // androidx.lifecycle.T
    public Q e(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    @Override // V3.c
    public V3.a f(za.c cVar, JSONObject jSONObject) {
        return p(cVar);
    }

    @Override // androidx.lifecycle.T
    public Q g(InterfaceC0175c interfaceC0175c, u0.b bVar) {
        return i(p068ga.d.o(interfaceC0175c), bVar);
    }

    @Override // javax.inject.Provider
    public Object get() {
        e eVar = new e(26);
        HashMap map = new HashMap();
        p051f2.d dVar = p051f2.d.f11424s;
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        map.put(dVar, new p138o2.b(30000L, 86400000L, set));
        p051f2.d dVar2 = p051f2.d.f11426u;
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        map.put(dVar2, new p138o2.b(1000L, 86400000L, set));
        p051f2.d dVar3 = p051f2.d.f11425t;
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(p138o2.d.f13683t)));
        if (setUnmodifiableSet == null) {
            throw new NullPointerException("Null flags");
        }
        map.put(dVar3, new p138o2.b(86400000L, 86400000L, setUnmodifiableSet));
        if (map.keySet().size() < p051f2.d.values().length) {
            throw new IllegalStateException("Not all priorities have been configured");
        }
        new HashMap();
        return new p138o2.a(eVar, map);
    }

    @Override // P3.c
    public String h() {
        return null;
    }

    @Override // androidx.lifecycle.T
    public Q i(Class cls, u0.b bVar) {
        return new N();
    }

    @Override // N6.i
    public void j(View view, float f10) {
        switch (this.f11437s) {
            case 15:
                view.setCameraDistance(20000.0f);
                if (f10 < -1.0f) {
                    view.setAlpha(0.0f);
                } else if (f10 <= 0.0f) {
                    view.setAlpha(1.0f);
                    view.setPivotX(view.getWidth());
                    view.setRotationY(Math.abs(f10) * 90.0f);
                } else if (f10 > 1.0f) {
                    view.setAlpha(0.0f);
                } else {
                    view.setAlpha(1.0f);
                    view.setPivotX(0.0f);
                    view.setRotationY(Math.abs(f10) * (-90.0f));
                }
                break;
            case 16:
                view.setTranslationX((-f10) * view.getWidth());
                if (f10 < -1.0f || f10 > 1.0f) {
                    view.setAlpha(0.0f);
                } else if (f10 <= 0.0f || f10 <= 1.0f) {
                    view.setAlpha(f10 <= 0.0f ? f10 + 1.0f : 1.0f - f10);
                } else if (f10 == 0.0f) {
                    view.setAlpha(1.0f);
                }
                break;
            case 17:
                view.setTranslationX((-f10) * view.getWidth());
                if (Math.abs(f10) < 0.5d) {
                    view.setVisibility(0);
                    view.setScaleX(1.0f - Math.abs(f10));
                    view.setScaleY(1.0f - Math.abs(f10));
                } else if (Math.abs(f10) > 0.5d) {
                    view.setVisibility(8);
                }
                break;
            default:
                if (f10 < -1.0f) {
                    view.setAlpha(0.0f);
                } else if (f10 > 1.0f) {
                    view.setAlpha(0.0f);
                } else {
                    view.setScaleX(Math.max(0.65f, 1.0f - Math.abs(f10)));
                    view.setScaleY(Math.max(0.65f, 1.0f - Math.abs(f10)));
                    view.setAlpha(Math.max(0.3f, 1.0f - Math.abs(f10)));
                }
                break;
        }
    }

    @Override // p169r2.a
    public long k() {
        return System.currentTimeMillis();
    }

    @Override // com.google.gson.internal.l
    public Object n() {
        switch (this.f11437s) {
            case 19:
                return new TreeSet();
            default:
                return new TreeMap();
        }
    }

    public boolean q(CharSequence charSequence) {
        return false;
    }

    public void r(TabLayout tabLayout, View view, View view2, float f10, Drawable drawable) {
        RectF rectFO = o(tabLayout, view);
        RectF rectFO2 = o(tabLayout, view2);
        drawable.setBounds(R2.a.c((int) rectFO.left, f10, (int) rectFO2.left), drawable.getBounds().top, R2.a.c((int) rectFO.right, f10, (int) rectFO2.right), drawable.getBounds().bottom);
    }

    public /* synthetic */ e(Object obj, int i10) {
        this.f11437s = i10;
    }

    public e(int[] iArr, ValueAnimator valueAnimator) {
        this.f11437s = 22;
    }

    @Override // P3.c
    public void a() {
    }

    @Override // N1.g
    public void l(N1.i iVar) {
    }

    @Override // H0.d
    public void d(int i10, Serializable serializable) {
    }

    @Override // P3.c
    public void m(String str, long j) {
    }
}

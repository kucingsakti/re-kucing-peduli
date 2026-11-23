package com.kcstream.cing.activity;

import A0.r;
import D3.b;
import E4.C0187a;
import E4.v;
import J4.d;
import K4.f;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.lifecycle.A;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.textview.MaterialTextView;
import com.kcstream.cing.R;
import com.kcstream.cing.model.SearchListGenres;
import com.kcstream.cing.model.Updater;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import p.b1;
import p068ga.l;
import p076h8.j;
import p078i.C0645b;
import p086i8.q;
import p210v8.i;
import wa.a;
import y0.B;
import y0.u;
import y0.x;
import y0.z;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/kcstream/cing/activity/MainActivity;", "LK4/f;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MainActivity extends f {
    public static final /* synthetic */ int c0 = 0;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public b1 f10193V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public SearchListGenres f10194W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public Updater f10195X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean f10196Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public C0645b f10197Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f10198a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final j f10199b0 = b.s(new r(this, 6));

    public final void A() {
        int iM = b.m(this, R.attr.colorSurface);
        getWindow().setStatusBarColor(iM);
        b1 b1Var = this.f10193V;
        if (b1Var != null) {
            ((MaterialToolbar) b1Var.f14043z).setBackgroundColor(iM);
        } else {
            i.n("binding");
            throw null;
        }
    }

    @Override // p031d.m, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        b1 b1Var = this.f10193V;
        if (b1Var == null) {
            i.n("binding");
            throw null;
        }
        View viewF = ((DrawerLayout) b1Var.f14039v).f(8388611);
        if (viewF != null ? DrawerLayout.o(viewF) : false) {
            b1 b1Var2 = this.f10193V;
            if (b1Var2 == null) {
                i.n("binding");
                throw null;
            }
            ((DrawerLayout) b1Var2.f14039v).d();
        }
        b1 b1Var3 = this.f10193V;
        if (b1Var3 == null) {
            i.n("binding");
            throw null;
        }
        View viewF2 = ((DrawerLayout) b1Var3.f14039v).f(8388611);
        if (viewF2 != null ? DrawerLayout.o(viewF2) : false) {
            return;
        }
        if (this.f10196Y) {
            finish();
        } else {
            Toast.makeText(this, "Tekan back sekali lagi untuk keluar", 0).show();
        }
        this.f10196Y = true;
        new Handler().postDelayed(new v(this, 0), 2000L);
    }

    @Override // K4.f, p078i.AbstractActivityC0655l, p031d.m, I.AbstractActivityC0247k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10193V = b1.c(getLayoutInflater());
        View viewInflate = getLayoutInflater().inflate(R.layout.drawer_activity_main, (ViewGroup) null, false);
        int i10 = R.id.drawer_menu_name;
        if (((MaterialTextView) oa.b.c(viewInflate, R.id.drawer_menu_name)) != null) {
            i10 = R.id.drawer_menu_version;
            if (((MaterialTextView) oa.b.c(viewInflate, R.id.drawer_menu_version)) != null) {
                b1 b1Var = this.f10193V;
                if (b1Var == null) {
                    i.n("binding");
                    throw null;
                }
                setContentView((DrawerLayout) b1Var.f14037t);
                b1 b1Var2 = this.f10193V;
                if (b1Var2 == null) {
                    i.n("binding");
                    throw null;
                }
                v((MaterialToolbar) b1Var2.f14043z);
                J7.j jVarL = l();
                if (jVarL != null) {
                    jVarL.H(true);
                    jVarL.M();
                }
                b1 b1Var3 = this.f10193V;
                if (b1Var3 == null) {
                    i.n("binding");
                    throw null;
                }
                ((AppBarLayout) b1Var3.f14038u).bringToFront();
                getWindow().getDecorView().setSystemUiVisibility(1280);
                SharedPreferences.Editor editorEdit = y().edit();
                editorEdit.remove("is_splash");
                editorEdit.apply();
                new Handler().postDelayed(new v(this, 1), 1000L);
                ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
                i.e(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
                executorServiceNewSingleThreadExecutor.execute(new v(this, 2));
                b1 b1Var4 = this.f10193V;
                if (b1Var4 == null) {
                    i.n("binding");
                    throw null;
                }
                b.t((ImageView) b1Var4.f14041x, Integer.valueOf(R.drawable.neko_loading));
                b1 b1Var5 = this.f10193V;
                if (b1Var5 == null) {
                    i.n("binding");
                    throw null;
                }
                C0645b c0645b = new C0645b(this, (DrawerLayout) b1Var5.f14039v, (MaterialToolbar) b1Var5.f14043z);
                this.f10197Z = c0645b;
                b1 b1Var6 = this.f10193V;
                if (b1Var6 == null) {
                    i.n("binding");
                    throw null;
                }
                ((DrawerLayout) b1Var6.f14039v).a(c0645b);
                b1 b1Var7 = this.f10193V;
                if (b1Var7 == null) {
                    i.n("binding");
                    throw null;
                }
                ((NavigationView) b1Var7.f14042y).setNavigationItemSelectedListener(new C0187a(this, 1));
                N4.b bVar = (N4.b) this.f10199b0.getValue();
                if (bundle == null) {
                    bVar.a();
                    return;
                } else {
                    bVar.getClass();
                    return;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        i.f(menuItem, "item");
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            b1 b1Var = this.f10193V;
            if (b1Var != null) {
                ((DrawerLayout) b1Var.f14039v).s();
                return true;
            }
            i.n("binding");
            throw null;
        }
        if (itemId == R.id.action_download_list) {
            new d().n0(m(), "downloading");
            return true;
        }
        if (itemId != R.id.action_search) {
            return super.onOptionsItemSelected(menuItem);
        }
        startActivity(new Intent(this, (Class<?>) SearchActivity.class));
        return true;
    }

    @Override // p078i.AbstractActivityC0655l, android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        C0645b c0645b = this.f10197Z;
        if (c0645b != null) {
            c0645b.e();
        } else {
            i.n("drawerToggle");
            throw null;
        }
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) {
        i.f(bundle, "savedInstanceState");
        ((N4.b) this.f10199b0.getValue()).a();
    }

    @Override // p078i.AbstractActivityC0655l
    public final boolean u() {
        Intent intent;
        int i10 = 0;
        A a = ((N4.b) this.f10199b0.getValue()).f3318b;
        if (a == null) {
            return false;
        }
        Object obj = a.f6709e;
        if (obj == A.f6705k) {
            obj = null;
        }
        B b3 = (B) obj;
        if (b3 == null) {
            return false;
        }
        if (b3.g() != 1) {
            if (b3.f15839g.isEmpty()) {
                return false;
            }
            x xVarF = b3.f();
            i.c(xVarF);
            return b3.n(xVarF.f16002z, true);
        }
        Activity activity = b3.f15834b;
        Bundle extras = (activity == null || (intent = activity.getIntent()) == null) ? null : intent.getExtras();
        if ((extras != null ? extras.getIntArray("android-support-nav:controller:deepLinkIds") : null) == null) {
            x xVarF2 = b3.f();
            i.c(xVarF2);
            int i11 = xVarF2.f16002z;
            for (z zVar = xVarF2.f15996t; zVar != null; zVar = zVar.f15996t) {
                if (zVar.f16008D != i11) {
                    Bundle bundle = new Bundle();
                    if (activity != null && activity.getIntent() != null && activity.getIntent().getData() != null) {
                        bundle.putParcelable("android-support-nav:controller:deepLinkIntent", activity.getIntent());
                        z zVarJ = b3.j(b3.f15839g);
                        Intent intent2 = activity.getIntent();
                        i.e(intent2, "activity!!.intent");
                        y0.v vVarQ = zVarJ.q(new a(intent2), true, zVarJ);
                        if ((vVarQ != null ? vVarQ.f15986t : null) != null) {
                            bundle.putAll(vVarQ.f15985s.e(vVarQ.f15986t));
                        }
                    }
                    p140o4.r rVar = new p140o4.r(b3);
                    int i12 = zVar.f16002z;
                    ArrayList arrayList = (ArrayList) rVar.f13785w;
                    arrayList.clear();
                    arrayList.add(new u(i12, null));
                    if (((z) rVar.f13784v) != null) {
                        rVar.C();
                    }
                    ((Intent) rVar.f13783u).putExtra("android-support-nav:controller:deepLinkExtras", bundle);
                    rVar.f().e();
                    if (activity != null) {
                        activity.finish();
                    }
                    return true;
                }
                i11 = zVar.f16002z;
            }
            return false;
        }
        if (!b3.f15838f) {
            return false;
        }
        i.c(activity);
        Intent intent3 = activity.getIntent();
        Bundle extras2 = intent3.getExtras();
        i.c(extras2);
        int[] intArray = extras2.getIntArray("android-support-nav:controller:deepLinkIds");
        i.c(intArray);
        ArrayList arrayListJ = p086i8.i.J(intArray);
        ArrayList parcelableArrayList = extras2.getParcelableArrayList("android-support-nav:controller:deepLinkArgs");
        if (arrayListJ.size() < 2) {
            return false;
        }
        int iIntValue = ((Number) q.K(arrayListJ)).intValue();
        if (parcelableArrayList != null) {
        }
        x xVarD = B.d(iIntValue, b3.h(), null, false);
        if (xVarD instanceof z) {
            int i13 = z.f16006F;
            iIntValue = l.e((z) xVarD).f16002z;
        }
        x xVarF3 = b3.f();
        if (xVarF3 == null || iIntValue != xVarF3.f16002z) {
            return false;
        }
        p140o4.r rVar2 = new p140o4.r(b3);
        Bundle bundleB = com.bumptech.glide.d.b(new p076h8.f("android-support-nav:controller:deepLinkIntent", intent3));
        Bundle bundle2 = extras2.getBundle("android-support-nav:controller:deepLinkExtras");
        if (bundle2 != null) {
            bundleB.putAll(bundle2);
        }
        ((Intent) rVar2.f13783u).putExtra("android-support-nav:controller:deepLinkExtras", bundleB);
        for (Object obj2 : arrayListJ) {
            int i14 = i10 + 1;
            if (i10 < 0) {
                p086i8.l.G();
                throw null;
            }
            ((ArrayList) rVar2.f13785w).add(new u(((Number) obj2).intValue(), parcelableArrayList != null ? (Bundle) parcelableArrayList.get(i10) : null));
            if (((z) rVar2.f13784v) != null) {
                rVar2.C();
            }
            i10 = i14;
        }
        rVar2.f().e();
        activity.finish();
        return true;
    }

    public final void z() {
        b1 b1Var = this.f10193V;
        if (b1Var != null) {
            ((ImageView) b1Var.f14040w).setVisibility(8);
        } else {
            i.n("binding");
            throw null;
        }
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle, PersistableBundle persistableBundle) {
        super.onPostCreate(bundle);
        C0645b c0645b = this.f10197Z;
        if (c0645b != null) {
            c0645b.e();
        } else {
            i.n("drawerToggle");
            throw null;
        }
    }
}

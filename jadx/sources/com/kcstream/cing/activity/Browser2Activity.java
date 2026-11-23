package com.kcstream.cing.activity;

import A0.r;
import A1.C0099h;
import E4.C0187a;
import E4.C0189c;
import E4.C0193g;
import Fa.e;
import J4.m;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.s;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.kcstream.cing.R;
import com.kcstream.cing.activity.Browser2Activity;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import kotlin.Metadata;
import oa.b;
import p013b1.c;
import p078i.AbstractActivityC0655l;
import p204v1.f;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/kcstream/cing/activity/Browser2Activity;", "Li/l;", "<init>", "()V", "E4/c", "E4/g", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Browser2Activity extends AbstractActivityC0655l {

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final /* synthetic */ int f10164X = 0;
    public e P;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public C0189c f10166R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public Bundle f10167S;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public File f10169U;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final ArrayList f10165Q = new ArrayList();

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public String f10168T = "";

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final String f10170V = "1";

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final StringBuilder f10171W = new StringBuilder();

    @Override // p031d.m, android.app.Activity
    public final void onBackPressed() {
        C0193g c0193g;
        boolean zA;
        C0189c c0189c = this.f10166R;
        if (c0189c != null) {
            e eVar = this.P;
            if (eVar == null) {
                i.n("binding");
                throw null;
            }
            c0193g = (C0193g) c0189c.f1402n.get(Integer.valueOf(((ViewPager2) eVar.f1663x).getCurrentItem()));
        } else {
            c0193g = null;
        }
        if (c0193g != null) {
            C0099h c0099h = c0193g.f1416x0;
            zA = i.a(c0099h != null ? Boolean.valueOf(((WebView) c0099h.f105v).canGoBack()) : null, Boolean.TRUE);
        } else {
            zA = false;
        }
        if (!zA) {
            super.onBackPressed();
            return;
        }
        C0099h c0099h2 = c0193g.f1416x0;
        if (c0099h2 != null) {
            ((WebView) c0099h2.f105v).goBack();
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:50:0x0117  */
    /* JADX WARN: Code duplicated, block: B:52:0x0124  */
    /* JADX WARN: Code duplicated, block: B:54:0x013a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0142  */
    /* JADX WARN: Code duplicated, block: B:58:0x017d  */
    /* JADX WARN: Code duplicated, block: B:60:0x018e  */
    /* JADX WARN: Code duplicated, block: B:62:0x019f  */
    /* JADX WARN: Code duplicated, block: B:64:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:66:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:68:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:70:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:72:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:74:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:76:0x01cd  */
    @Override // p078i.AbstractActivityC0655l, p031d.m, I.AbstractActivityC0247k, android.app.Activity
    public final void onCreate(Bundle bundle) throws IOException {
        Intent intent;
        Bundle extras;
        C0189c c0189c;
        e eVar;
        f fVar;
        e eVar2;
        TabLayout tabLayout;
        ViewPager2 viewPager2;
        s adapter;
        e eVar3;
        e eVar4;
        e eVar5;
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_browser2, (ViewGroup) null, false);
        int i10 = R.id.btn_browser;
        ImageButton imageButton = (ImageButton) b.c(viewInflate, R.id.btn_browser);
        if (imageButton != null) {
            i10 = R.id.btn_close_activity;
            ImageButton imageButton2 = (ImageButton) b.c(viewInflate, R.id.btn_close_activity);
            if (imageButton2 != null) {
                i10 = R.id.btn_refresh;
                ImageButton imageButton3 = (ImageButton) b.c(viewInflate, R.id.btn_refresh);
                if (imageButton3 != null) {
                    i10 = R.id.tabLayout;
                    TabLayout tabLayout2 = (TabLayout) b.c(viewInflate, R.id.tabLayout);
                    if (tabLayout2 != null) {
                        i10 = R.id.toolbar;
                        if (((Toolbar) b.c(viewInflate, R.id.toolbar)) != null) {
                            i10 = R.id.viewPager;
                            ViewPager2 viewPager3 = (ViewPager2) b.c(viewInflate, R.id.viewPager);
                            if (viewPager3 != null) {
                                RelativeLayout relativeLayout = (RelativeLayout) viewInflate;
                                this.P = new e(relativeLayout, imageButton, imageButton2, imageButton3, tabLayout2, viewPager3, 2);
                                setContentView(relativeLayout);
                                File file = new File(getCacheDir(), "adFile");
                                this.f10169U = file;
                                String str = this.f10170V;
                                if (file.exists()) {
                                    File file2 = this.f10169U;
                                    if (file2 == null) {
                                        i.n("adFile");
                                        throw null;
                                    }
                                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                                    while (true) {
                                        try {
                                            try {
                                                try {
                                                    String line = bufferedReader.readLine();
                                                    i.c(line);
                                                    boolean zA = i.a(str, "0");
                                                    StringBuilder sb = this.f10171W;
                                                    if (zA) {
                                                        sb.append(line);
                                                        sb.append("\n");
                                                    }
                                                    if (i.a(str, "1")) {
                                                        sb.append(":::::" + line);
                                                        sb.append("\n");
                                                    }
                                                } catch (Exception e10) {
                                                    e10.printStackTrace();
                                                    bufferedReader.close();
                                                    bufferedReader.close();
                                                    intent = getIntent();
                                                    if (intent != null) {
                                                        extras = intent.getExtras();
                                                    } else {
                                                        extras = null;
                                                    }
                                                    i.c(extras);
                                                    this.f10167S = extras;
                                                    String strValueOf = String.valueOf(extras.getString("link"));
                                                    this.f10168T = strValueOf;
                                                    ArrayList arrayList = this.f10165Q;
                                                    arrayList.add(strValueOf);
                                                    c0189c = new C0189c(this, this, arrayList);
                                                    this.f10166R = c0189c;
                                                    eVar = this.P;
                                                    if (eVar != null) {
                                                        i.n("binding");
                                                        throw null;
                                                    }
                                                    ((ViewPager2) eVar.f1663x).setAdapter(c0189c);
                                                    eVar2 = this.P;
                                                    if (eVar2 != null) {
                                                        i.n("binding");
                                                        throw null;
                                                    }
                                                    C0187a c0187a = new C0187a(this, 0);
                                                    tabLayout = (TabLayout) eVar2.f1662w;
                                                    viewPager2 = (ViewPager2) eVar2.f1663x;
                                                    fVar = new f(tabLayout, viewPager2, c0187a);
                                                    if (!fVar.a) {
                                                        throw new IllegalStateException("TabLayoutMediator is already attached");
                                                    }
                                                    adapter = viewPager2.getAdapter();
                                                    fVar.f15396e = adapter;
                                                    if (adapter != null) {
                                                        throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
                                                    }
                                                    fVar.a = true;
                                                    ((ArrayList) viewPager2.f7198u.f7244b).add(new p206v3.i(tabLayout));
                                                    tabLayout.a(new m(viewPager2, 2));
                                                    ((s) fVar.f15396e).a.registerObserver(new c(fVar, 1));
                                                    fVar.b();
                                                    tabLayout.l(viewPager2.getCurrentItem(), 0.0f, true, true, true);
                                                    eVar3 = this.P;
                                                    if (eVar3 != null) {
                                                        i.n("binding");
                                                        throw null;
                                                    }
                                                    final int i11 = 0;
                                                    ((ImageButton) eVar3.f1660u).setOnClickListener(new View.OnClickListener(this) { // from class: E4.b

                                                        /* JADX INFO: renamed from: t, reason: collision with root package name */
                                                        public final /* synthetic */ Browser2Activity f1400t;

                                                        {
                                                            this.f1400t = this;
                                                        }

                                                        @Override // android.view.View.OnClickListener
                                                        public final void onClick(View view) {
                                                            C0099h c0099h;
                                                            Browser2Activity browser2Activity = this.f1400t;
                                                            switch (i11) {
                                                                case 0:
                                                                    int i12 = Browser2Activity.f10164X;
                                                                    p210v8.i.f(browser2Activity, "this$0");
                                                                    browser2Activity.finish();
                                                                    return;
                                                                default:
                                                                    int i13 = Browser2Activity.f10164X;
                                                                    C0189c c0189c2 = browser2Activity.f10166R;
                                                                    C0193g c0193g = null;
                                                                    if (c0189c2 != null) {
                                                                        Fa.e eVar6 = browser2Activity.P;
                                                                        if (eVar6 == null) {
                                                                            p210v8.i.n("binding");
                                                                            throw null;
                                                                        }
                                                                        c0193g = (C0193g) c0189c2.f1402n.get(Integer.valueOf(((ViewPager2) eVar6.f1663x).getCurrentItem()));
                                                                    }
                                                                    if (c0193g == null || (c0099h = c0193g.f1416x0) == null) {
                                                                        return;
                                                                    }
                                                                    ((WebView) c0099h.f105v).reload();
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    eVar4 = this.P;
                                                    if (eVar4 != null) {
                                                        i.n("binding");
                                                        throw null;
                                                    }
                                                    final int i12 = 1;
                                                    ((ImageButton) eVar4.f1661v).setOnClickListener(new View.OnClickListener(this) { // from class: E4.b

                                                        /* JADX INFO: renamed from: t, reason: collision with root package name */
                                                        public final /* synthetic */ Browser2Activity f1400t;

                                                        {
                                                            this.f1400t = this;
                                                        }

                                                        @Override // android.view.View.OnClickListener
                                                        public final void onClick(View view) {
                                                            C0099h c0099h;
                                                            Browser2Activity browser2Activity = this.f1400t;
                                                            switch (i12) {
                                                                case 0:
                                                                    int i13 = Browser2Activity.f10164X;
                                                                    p210v8.i.f(browser2Activity, "this$0");
                                                                    browser2Activity.finish();
                                                                    return;
                                                                default:
                                                                    int i14 = Browser2Activity.f10164X;
                                                                    C0189c c0189c2 = browser2Activity.f10166R;
                                                                    C0193g c0193g = null;
                                                                    if (c0189c2 != null) {
                                                                        Fa.e eVar6 = browser2Activity.P;
                                                                        if (eVar6 == null) {
                                                                            p210v8.i.n("binding");
                                                                            throw null;
                                                                        }
                                                                        c0193g = (C0193g) c0189c2.f1402n.get(Integer.valueOf(((ViewPager2) eVar6.f1663x).getCurrentItem()));
                                                                    }
                                                                    if (c0193g == null || (c0099h = c0193g.f1416x0) == null) {
                                                                        return;
                                                                    }
                                                                    ((WebView) c0099h.f105v).reload();
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    eVar5 = this.P;
                                                    if (eVar5 != null) {
                                                        D3.b.e((ImageButton) eVar5.f1659t, new r(this, 5));
                                                        return;
                                                    } else {
                                                        i.n("binding");
                                                        throw null;
                                                    }
                                                }
                                            } catch (Throwable th) {
                                                bufferedReader.close();
                                                throw th;
                                            }
                                        } catch (Throwable th2) {
                                            try {
                                                throw th2;
                                            } catch (Throwable th3) {
                                                com.bumptech.glide.c.c(bufferedReader, th2);
                                                throw th3;
                                            }
                                        }
                                    }
                                }
                                intent = getIntent();
                                if (intent != null) {
                                    extras = intent.getExtras();
                                } else {
                                    extras = null;
                                }
                                i.c(extras);
                                this.f10167S = extras;
                                String strValueOf2 = String.valueOf(extras.getString("link"));
                                this.f10168T = strValueOf2;
                                ArrayList arrayList2 = this.f10165Q;
                                arrayList2.add(strValueOf2);
                                c0189c = new C0189c(this, this, arrayList2);
                                this.f10166R = c0189c;
                                eVar = this.P;
                                if (eVar != null) {
                                    i.n("binding");
                                    throw null;
                                }
                                ((ViewPager2) eVar.f1663x).setAdapter(c0189c);
                                eVar2 = this.P;
                                if (eVar2 != null) {
                                    i.n("binding");
                                    throw null;
                                }
                                C0187a c0187a2 = new C0187a(this, 0);
                                tabLayout = (TabLayout) eVar2.f1662w;
                                viewPager2 = (ViewPager2) eVar2.f1663x;
                                fVar = new f(tabLayout, viewPager2, c0187a2);
                                if (!fVar.a) {
                                    throw new IllegalStateException("TabLayoutMediator is already attached");
                                }
                                adapter = viewPager2.getAdapter();
                                fVar.f15396e = adapter;
                                if (adapter != null) {
                                    throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
                                }
                                fVar.a = true;
                                ((ArrayList) viewPager2.f7198u.f7244b).add(new p206v3.i(tabLayout));
                                tabLayout.a(new m(viewPager2, 2));
                                ((s) fVar.f15396e).a.registerObserver(new c(fVar, 1));
                                fVar.b();
                                tabLayout.l(viewPager2.getCurrentItem(), 0.0f, true, true, true);
                                eVar3 = this.P;
                                if (eVar3 != null) {
                                    i.n("binding");
                                    throw null;
                                }
                                final int i13 = 0;
                                ((ImageButton) eVar3.f1660u).setOnClickListener(new View.OnClickListener(this) { // from class: E4.b

                                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                                    public final /* synthetic */ Browser2Activity f1400t;

                                    {
                                        this.f1400t = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        C0099h c0099h;
                                        Browser2Activity browser2Activity = this.f1400t;
                                        switch (i13) {
                                            case 0:
                                                int i14 = Browser2Activity.f10164X;
                                                p210v8.i.f(browser2Activity, "this$0");
                                                browser2Activity.finish();
                                                return;
                                            default:
                                                int i15 = Browser2Activity.f10164X;
                                                C0189c c0189c2 = browser2Activity.f10166R;
                                                C0193g c0193g = null;
                                                if (c0189c2 != null) {
                                                    Fa.e eVar6 = browser2Activity.P;
                                                    if (eVar6 == null) {
                                                        p210v8.i.n("binding");
                                                        throw null;
                                                    }
                                                    c0193g = (C0193g) c0189c2.f1402n.get(Integer.valueOf(((ViewPager2) eVar6.f1663x).getCurrentItem()));
                                                }
                                                if (c0193g == null || (c0099h = c0193g.f1416x0) == null) {
                                                    return;
                                                }
                                                ((WebView) c0099h.f105v).reload();
                                                return;
                                        }
                                    }
                                });
                                eVar4 = this.P;
                                if (eVar4 != null) {
                                    i.n("binding");
                                    throw null;
                                }
                                final int i14 = 1;
                                ((ImageButton) eVar4.f1661v).setOnClickListener(new View.OnClickListener(this) { // from class: E4.b

                                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                                    public final /* synthetic */ Browser2Activity f1400t;

                                    {
                                        this.f1400t = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        C0099h c0099h;
                                        Browser2Activity browser2Activity = this.f1400t;
                                        switch (i14) {
                                            case 0:
                                                int i15 = Browser2Activity.f10164X;
                                                p210v8.i.f(browser2Activity, "this$0");
                                                browser2Activity.finish();
                                                return;
                                            default:
                                                int i16 = Browser2Activity.f10164X;
                                                C0189c c0189c2 = browser2Activity.f10166R;
                                                C0193g c0193g = null;
                                                if (c0189c2 != null) {
                                                    Fa.e eVar6 = browser2Activity.P;
                                                    if (eVar6 == null) {
                                                        p210v8.i.n("binding");
                                                        throw null;
                                                    }
                                                    c0193g = (C0193g) c0189c2.f1402n.get(Integer.valueOf(((ViewPager2) eVar6.f1663x).getCurrentItem()));
                                                }
                                                if (c0193g == null || (c0099h = c0193g.f1416x0) == null) {
                                                    return;
                                                }
                                                ((WebView) c0099h.f105v).reload();
                                                return;
                                        }
                                    }
                                });
                                eVar5 = this.P;
                                if (eVar5 != null) {
                                    D3.b.e((ImageButton) eVar5.f1659t, new r(this, 5));
                                    return;
                                } else {
                                    i.n("binding");
                                    throw null;
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }
}

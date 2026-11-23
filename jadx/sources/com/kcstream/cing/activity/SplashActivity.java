package com.kcstream.cing.activity;

import E4.P;
import E4.Q;
import J.a;
import K4.f;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.kcstream.cing.R;
import com.kcstream.cing.model.Updater;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.UnityAds;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import o1.c;
import oa.b;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u0082 ¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/kcstream/cing/activity/SplashActivity;", "LK4/f;", "Lcom/unity3d/ads/IUnityAdsInitializationListener;", "<init>", "()V", "", "zcw74mhTmloHZTHbzET2", "()Ljava/lang/String;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SplashActivity extends f implements IUnityAdsInitializationListener {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final /* synthetic */ int f10231Z = 0;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public c f10232V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public Updater f10233W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public Q f10234X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final ExecutorService f10235Y;

    public SplashActivity() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        i.e(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
        this.f10235Y = executorServiceNewSingleThreadExecutor;
    }

    private final native String zcw74mhTmloHZTHbzET2();

    @Override // K4.f, p078i.AbstractActivityC0655l, p031d.m, I.AbstractActivityC0247k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_splash, (ViewGroup) null, false);
        ImageView imageView = (ImageView) b.c(viewInflate, R.id.iv_splash);
        if (imageView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.iv_splash)));
        }
        this.f10232V = new c((ConstraintLayout) viewInflate, 4, imageView);
        super.onCreate(bundle);
        c cVar = this.f10232V;
        if (cVar == null) {
            i.n("binding");
            throw null;
        }
        setContentView((ConstraintLayout) cVar.f13623t);
        SharedPreferences.Editor editorEdit = y().edit();
        editorEdit.putBoolean("is_splash", true);
        editorEdit.apply();
        getWindow().setFlags(1024, 1024);
        if (y().contains("disguise_app") && y().getBoolean("disguise_app", true)) {
            c cVar2 = this.f10232V;
            if (cVar2 == null) {
                i.n("binding");
                throw null;
            }
            ((ImageView) cVar2.f13624u).setImageDrawable(a.b(this, R.mipmap.ic_disguise_round));
        } else {
            c cVar3 = this.f10232V;
            if (cVar3 == null) {
                i.n("binding");
                throw null;
            }
            ((ImageView) cVar3.f13624u).setImageDrawable(a.b(this, R.mipmap.ic_launcher_round));
        }
        Context applicationContext = getApplicationContext();
        byte[] bArrDecode = Base64.decode(zcw74mhTmloHZTHbzET2(), 0);
        i.e(bArrDecode, "decode(...)");
        UnityAds.initialize(applicationContext, new String(bArrDecode, L9.a.a), this);
        this.f10235Y.execute(new P(this, 0));
    }

    @Override // com.unity3d.ads.IUnityAdsInitializationListener
    public final void onInitializationComplete() {
        Ha.a.a.getClass();
        za.c.h(new Object[0]);
        SharedPreferences.Editor editorEdit = y().edit();
        editorEdit.putBoolean("isReady", true);
        editorEdit.apply();
    }

    @Override // com.unity3d.ads.IUnityAdsInitializationListener
    public final void onInitializationFailed(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
        Ha.a.a.getClass();
        za.c.k(new Object[0]);
        SharedPreferences.Editor editorEdit = y().edit();
        editorEdit.putBoolean("isReady", false);
        editorEdit.apply();
    }

    @Override // p078i.AbstractActivityC0655l, android.app.Activity
    public final void onStart() {
        super.onStart();
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                registerReceiver(this.f10234X, new IntentFilter("com.kcstream.cing.broadcast.guard"), 2);
            } else {
                registerReceiver(this.f10234X, new IntentFilter("com.kcstream.cing.broadcast.guard"));
            }
        } catch (Exception unused) {
            Ha.a.a.getClass();
            za.c.h(new Object[0]);
        }
    }
}

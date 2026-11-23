package com.kcstream.cing.activity;

import A0.m;
import E4.B;
import E4.C0187a;
import J7.a;
import K4.f;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textview.MaterialTextView;
import com.kcstream.cing.R;
import com.mukesh.OtpView;
import kotlin.Metadata;
import o1.k;
import oa.b;
import p040e1.j;
import p068ga.l;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/kcstream/cing/activity/PasscodeActivity;", "LK4/f;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PasscodeActivity extends f {

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final /* synthetic */ int f10200W = 0;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public j f10201V;

    @Override // p031d.m, android.app.Activity
    public final void onBackPressed() {
        if (getIntent().hasExtra("is_setup_passcode")) {
            Intent intent = new Intent();
            intent.putExtra("no_passcode_set", true);
            setResult(-1, intent);
            super.onBackPressed();
        }
    }

    @Override // K4.f, p078i.AbstractActivityC0655l, p031d.m, I.AbstractActivityC0247k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_passcode, (ViewGroup) null, false);
        int i10 = R.id.passcode;
        OtpView otpView = (OtpView) b.c(viewInflate, R.id.passcode);
        if (otpView != null) {
            i10 = R.id.tv_enter_pin;
            if (((MaterialTextView) b.c(viewInflate, R.id.tv_enter_pin)) != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                this.f10201V = new j(12, otpView, constraintLayout);
                setContentView(constraintLayout);
                getWindow().setNavigationBarColor(D3.b.m(this, R.attr.backgroundColor));
                getWindow().setFlags(1024, 1024);
                Intent intent = getIntent();
                if (!y().contains("is_biometric") || !y().getBoolean("is_biometric", true)) {
                    Intent intent2 = getIntent();
                    j jVar = this.f10201V;
                    if (jVar != null) {
                        ((OtpView) jVar.f10697t).setOtpCompletionListener(new B(intent2, 0, this));
                        return;
                    } else {
                        i.n("bindingPasscode");
                        throw null;
                    }
                }
                if (intent.hasExtra("is_setup_passcode")) {
                    Toast.makeText(this, "Silahkan matikan Autentikasi dengan Fingerprint", 0).show();
                    finish();
                    return;
                }
                a aVarB = (Build.VERSION.SDK_INT >= 28 ? new k(this) : new p045e7.b(this)).b();
                R7.a aVar = new R7.a(new C0187a(new m(this, 5), 3), 0, new C0187a(this, 2));
                aVarB.getClass();
                try {
                    aVarB.u(aVar);
                    return;
                } catch (NullPointerException e10) {
                    throw e10;
                } catch (Throwable th) {
                    l.n(th);
                    J7.j.y(th);
                    NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
                    nullPointerException.initCause(th);
                    throw nullPointerException;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }
}

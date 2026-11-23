package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.b;
import androidx.fragment.app.e;
import androidx.fragment.app.f;
import androidx.fragment.app.strictmode.GetRetainInstanceUsageViolation;
import androidx.fragment.app.strictmode.GetTargetFragmentRequestCodeUsageViolation;
import androidx.fragment.app.strictmode.SetRetainInstanceUsageViolation;
import androidx.fragment.app.strictmode.SetUserVisibleHintViolation;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import p167r0.c;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public final class SupportFragmentWrapper extends IFragmentWrapper.Stub {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f8290b;

    public SupportFragmentWrapper(b bVar) {
        this.f8290b = bVar;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void B(boolean z6) {
        this.f8290b.d0(z6);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void F(IObjectWrapper iObjectWrapper) {
        View view = (View) ObjectWrapper.i0(iObjectWrapper);
        Preconditions.i(view);
        this.f8290b.getClass();
        view.setOnCreateContextMenuListener(null);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void M(boolean z6) {
        b bVar = this.f8290b;
        bVar.getClass();
        p167r0.b bVar2 = c.a;
        c.b(new SetRetainInstanceUsageViolation(bVar, "Attempting to set retain instance for fragment " + bVar));
        c.a(bVar).getClass();
        bVar.f6630W = z6;
        e eVar = bVar.f6622N;
        if (eVar == null) {
            bVar.f6631X = true;
        } else if (z6) {
            eVar.f6675O.d(bVar);
        } else {
            eVar.f6675O.f(bVar);
        }
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void Q(int i10, Intent intent) {
        this.f8290b.b(i10, intent);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void U(Intent intent) {
        this.f8290b.f0(intent);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void Y(boolean z6) {
        b bVar = this.f8290b;
        bVar.getClass();
        p167r0.b bVar2 = c.a;
        c.b(new SetUserVisibleHintViolation(bVar, "Attempting to set user visible hint to " + z6 + " for fragment " + bVar));
        c.a(bVar).getClass();
        boolean z10 = false;
        if (!bVar.f6637e0 && z6 && bVar.f6650s < 5 && bVar.f6622N != null && bVar.v() && bVar.f6640i0) {
            e eVar = bVar.f6622N;
            f fVarG = eVar.g(bVar);
            b bVar3 = fVarG.f6701c;
            if (bVar3.f6636d0) {
                if (eVar.f6676b) {
                    eVar.f6671K = true;
                } else {
                    bVar3.f6636d0 = false;
                    fVarG.k();
                }
            }
        }
        bVar.f6637e0 = z6;
        if (bVar.f6650s < 5 && !z6) {
            z10 = true;
        }
        bVar.f6636d0 = z10;
        if (bVar.f6651t != null) {
            bVar.f6654w = Boolean.valueOf(z6);
        }
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final int a() {
        return this.f8290b.f6625R;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final int c() {
        b bVar = this.f8290b;
        bVar.getClass();
        p167r0.b bVar2 = c.a;
        c.b(new GetTargetFragmentRequestCodeUsageViolation(bVar, "Attempting to get target request code from fragment " + bVar));
        c.a(bVar).getClass();
        return bVar.f6610B;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final Bundle d() {
        return this.f8290b.f6656y;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final IFragmentWrapper e() {
        b bVar = this.f8290b.f6624Q;
        if (bVar != null) {
            return new SupportFragmentWrapper(bVar);
        }
        return null;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean e0() {
        return this.f8290b.y();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final IFragmentWrapper f() {
        b bVarS = this.f8290b.s(true);
        if (bVarS != null) {
            return new SupportFragmentWrapper(bVarS);
        }
        return null;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final ObjectWrapper g() {
        return new ObjectWrapper(this.f8290b.q());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final ObjectWrapper h() {
        return new ObjectWrapper(this.f8290b.c0);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final String i() {
        return this.f8290b.f6627T;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final ObjectWrapper j() {
        return new ObjectWrapper(this.f8290b.f());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean k() {
        return this.f8290b.f6613E;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean m() {
        return this.f8290b.v();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean n() {
        return this.f8290b.f6650s >= 7;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean p() {
        return this.f8290b.f6629V;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean q() {
        return this.f8290b.w();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean r() {
        b bVar = this.f8290b;
        bVar.getClass();
        p167r0.b bVar2 = c.a;
        c.b(new GetRetainInstanceUsageViolation(bVar, "Attempting to get retain instance for fragment " + bVar));
        c.a(bVar).getClass();
        return bVar.f6630W;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean s() {
        return this.f8290b.f6617I;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean t() {
        return this.f8290b.f6637e0;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void w(boolean z6) {
        this.f8290b.c0(z6);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void z(IObjectWrapper iObjectWrapper) {
        View view = (View) ObjectWrapper.i0(iObjectWrapper);
        Preconditions.i(view);
        b bVar = this.f8290b;
        bVar.getClass();
        view.setOnCreateContextMenuListener(bVar);
    }
}

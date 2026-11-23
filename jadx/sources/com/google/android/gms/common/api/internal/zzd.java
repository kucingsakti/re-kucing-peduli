package com.google.android.gms.common.api.internal;

import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import p212w.e;

/* JADX INFO: loaded from: classes.dex */
public final class zzd extends androidx.fragment.app.b implements LifecycleFragment {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final Map f8025t0 = Collections.synchronizedMap(new e(0));

    static {
        new WeakHashMap();
    }

    @Override // androidx.fragment.app.b
    public final void A(int i10, int i11, Intent intent) {
        super.A(i10, i11, intent);
        Iterator it = this.f8025t0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).c(i10, i11, intent);
        }
    }

    @Override // androidx.fragment.app.b
    public final void C(Bundle bundle) {
        super.C(bundle);
        for (Map.Entry entry : this.f8025t0.entrySet()) {
            ((LifecycleCallback) entry.getValue()).d(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // androidx.fragment.app.b
    public final void F() {
        this.f6634a0 = true;
        Iterator it = this.f8025t0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).e();
        }
    }

    @Override // androidx.fragment.app.b
    public final void N() {
        this.f6634a0 = true;
        Iterator it = this.f8025t0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).f();
        }
    }

    @Override // androidx.fragment.app.b
    public final void O(Bundle bundle) {
        for (Map.Entry entry : this.f8025t0.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).g(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // androidx.fragment.app.b
    public final void P() {
        this.f6634a0 = true;
        Iterator it = this.f8025t0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).h();
        }
    }

    @Override // androidx.fragment.app.b
    public final void Q() {
        this.f6634a0 = true;
        Iterator it = this.f8025t0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).i();
        }
    }

    @Override // androidx.fragment.app.b
    public final void i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.i(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.f8025t0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).a(str, fileDescriptor, printWriter, strArr);
        }
    }
}

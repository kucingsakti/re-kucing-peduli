package com.google.android.gms.dynamic;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
@SuppressLint({"NewApi"})
public final class FragmentWrapper extends IFragmentWrapper.Stub {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Fragment f8288b;

    public FragmentWrapper(Fragment fragment) {
        this.f8288b = fragment;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void B(boolean z6) {
        this.f8288b.setMenuVisibility(z6);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void F(IObjectWrapper iObjectWrapper) {
        View view = (View) ObjectWrapper.i0(iObjectWrapper);
        Preconditions.i(view);
        this.f8288b.unregisterForContextMenu(view);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void M(boolean z6) {
        this.f8288b.setRetainInstance(z6);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void Q(int i10, Intent intent) {
        this.f8288b.startActivityForResult(intent, i10);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void U(Intent intent) {
        this.f8288b.startActivity(intent);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void Y(boolean z6) {
        this.f8288b.setUserVisibleHint(z6);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final int a() {
        return this.f8288b.getId();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final int c() {
        return this.f8288b.getTargetRequestCode();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final Bundle d() {
        return this.f8288b.getArguments();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final IFragmentWrapper e() {
        Fragment parentFragment = this.f8288b.getParentFragment();
        if (parentFragment != null) {
            return new FragmentWrapper(parentFragment);
        }
        return null;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean e0() {
        return this.f8288b.isVisible();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final IFragmentWrapper f() {
        Fragment targetFragment = this.f8288b.getTargetFragment();
        if (targetFragment != null) {
            return new FragmentWrapper(targetFragment);
        }
        return null;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final ObjectWrapper g() {
        return new ObjectWrapper(this.f8288b.getResources());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final ObjectWrapper h() {
        return new ObjectWrapper(this.f8288b.getView());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final String i() {
        return this.f8288b.getTag();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final ObjectWrapper j() {
        return new ObjectWrapper(this.f8288b.getActivity());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean k() {
        return this.f8288b.isRemoving();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean m() {
        return this.f8288b.isAdded();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean n() {
        return this.f8288b.isResumed();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean p() {
        return this.f8288b.isDetached();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean q() {
        return this.f8288b.isHidden();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean r() {
        return this.f8288b.getRetainInstance();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean s() {
        return this.f8288b.isInLayout();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean t() {
        return this.f8288b.getUserVisibleHint();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void w(boolean z6) {
        this.f8288b.setHasOptionsMenu(z6);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void z(IObjectWrapper iObjectWrapper) {
        View view = (View) ObjectWrapper.i0(iObjectWrapper);
        Preconditions.i(view);
        this.f8288b.registerForContextMenu(view);
    }
}

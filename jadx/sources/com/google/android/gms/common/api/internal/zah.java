package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.tasks.TaskCompletionSource;
import p224x2.q;

/* JADX INFO: loaded from: classes.dex */
public final class zah extends q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ListenerHolder.ListenerKey f8019c;

    public zah(ListenerHolder.ListenerKey listenerKey, TaskCompletionSource taskCompletionSource) {
        super(taskCompletionSource);
        this.f8019c = listenerKey;
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final /* bridge */ /* synthetic */ void d(zaad zaadVar, boolean z6) {
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final boolean f(zabq zabqVar) {
        if (((zaci) zabqVar.f7996g.get(this.f8019c)) == null) {
            return false;
        }
        throw null;
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final Feature[] g(zabq zabqVar) {
        if (((zaci) zabqVar.f7996g.get(this.f8019c)) == null) {
            return null;
        }
        throw null;
    }

    @Override // p224x2.q
    public final void h(zabq zabqVar) {
        if (((zaci) zabqVar.f7996g.remove(this.f8019c)) != null) {
            throw null;
        }
        this.f15772b.d(Boolean.FALSE);
    }
}

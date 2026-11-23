package com.google.android.gms.common.api;

import N2.a;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.GoogleApiAvailability;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;
import p212w.e;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class GoogleApiClient {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Set f7862s = Collections.newSetFromMap(new WeakHashMap());

    @Deprecated
    public static final class Builder {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f7864c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f7865d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Context f7867f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Looper f7870i;
        public final HashSet a = new HashSet();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final HashSet f7863b = new HashSet();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final e f7866e = new e(0);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final e f7868g = new e(0);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f7869h = -1;
        public final GoogleApiAvailability j = GoogleApiAvailability.f7832d;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final a f7871k = com.google.android.gms.signin.zad.a;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final ArrayList f7872l = new ArrayList();

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final ArrayList f7873m = new ArrayList();

        public Builder(Context context) {
            this.f7867f = context;
            this.f7870i = context.getMainLooper();
            this.f7864c = context.getPackageName();
            this.f7865d = context.getClass().getName();
        }
    }

    @Deprecated
    public interface ConnectionCallbacks extends com.google.android.gms.common.api.internal.ConnectionCallbacks {
    }

    @Deprecated
    public interface OnConnectionFailedListener extends com.google.android.gms.common.api.internal.OnConnectionFailedListener {
    }

    public abstract boolean a();

    public abstract void connect();

    public abstract void disconnect();
}

package com.google.android.gms.common.internal;

import android.accounts.Account;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.signin.SignInOptions;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p212w.e;
import p212w.f;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public final class ClientSettings {
    public final Account a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f8076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f8077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f8078d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f8079e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f8080f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SignInOptions f8081g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Integer f8082h;

    @KeepForSdk
    public static final class Builder {
        public Account a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public f f8083b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f8084c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f8085d;
    }

    public ClientSettings(Account account, Set set, e eVar, String str, String str2, SignInOptions signInOptions) {
        this.a = account;
        Set setUnmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.f8076b = setUnmodifiableSet;
        Map map = eVar == null ? Collections.EMPTY_MAP : eVar;
        this.f8078d = map;
        this.f8079e = str;
        this.f8080f = str2;
        this.f8081g = signInOptions == null ? SignInOptions.f9365s : signInOptions;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((zab) it.next()).getClass();
            hashSet.addAll(null);
        }
        this.f8077c = Collections.unmodifiableSet(hashSet);
    }
}

package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.internal.HashAccumulator;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
@SafeParcelable.Class
@Deprecated
public class GoogleSignInOptions extends AbstractSafeParcelable implements Api.ApiOptions.Optional, ReflectedParcelable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final Scope f7753C;
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final Scope f7754D;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final ArrayList f7755A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final String f7756B;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f7757s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f7758t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Account f7759u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f7760v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f7761w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f7762x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f7763y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final String f7764z;

    public static final class Builder {
        public final HashSet a = new HashSet();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final HashMap f7765b = new HashMap();

        public final void a() {
            HashSet hashSet = this.a;
            if (hashSet.contains(GoogleSignInOptions.f7754D)) {
                Scope scope = GoogleSignInOptions.f7753C;
                if (hashSet.contains(scope)) {
                    hashSet.remove(scope);
                }
            }
            new GoogleSignInOptions(3, new ArrayList(hashSet), null, false, false, false, null, null, this.f7765b, null);
        }
    }

    static {
        Scope scope = new Scope(1, "profile");
        new Scope(1, "email");
        Scope scope2 = new Scope(1, "openid");
        Scope scope3 = new Scope(1, "https://www.googleapis.com/auth/games_lite");
        f7753C = scope3;
        f7754D = new Scope(1, "https://www.googleapis.com/auth/games");
        Builder builder = new Builder();
        builder.a.add(scope2);
        builder.a.add(scope);
        builder.a();
        Builder builder2 = new Builder();
        HashSet hashSet = builder2.a;
        hashSet.add(scope3);
        hashSet.addAll(Arrays.asList(new Scope[0]));
        builder2.a();
        CREATOR = new zae();
    }

    public GoogleSignInOptions(int i10, ArrayList arrayList, Account account, boolean z6, boolean z10, boolean z11, String str, String str2, HashMap map, String str3) {
        this.f7757s = i10;
        this.f7758t = arrayList;
        this.f7759u = account;
        this.f7760v = z6;
        this.f7761w = z10;
        this.f7762x = z11;
        this.f7763y = str;
        this.f7764z = str2;
        this.f7755A = new ArrayList(map.values());
        this.f7756B = str3;
    }

    public final boolean equals(Object obj) {
        String str = this.f7763y;
        ArrayList arrayList = this.f7758t;
        if (obj == null) {
            return false;
        }
        try {
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
            ArrayList arrayList2 = googleSignInOptions.f7758t;
            String str2 = googleSignInOptions.f7763y;
            Account account = googleSignInOptions.f7759u;
            if (this.f7755A.isEmpty() && googleSignInOptions.f7755A.isEmpty() && arrayList.size() == new ArrayList(arrayList2).size() && arrayList.containsAll(new ArrayList(arrayList2))) {
                Account account2 = this.f7759u;
                if (account2 == null) {
                    if (account != null) {
                        return false;
                    }
                } else if (!account2.equals(account)) {
                    return false;
                }
                if (TextUtils.isEmpty(str)) {
                    if (!TextUtils.isEmpty(str2)) {
                        return false;
                    }
                } else if (!str.equals(str2)) {
                    return false;
                }
                return this.f7762x == googleSignInOptions.f7762x && this.f7760v == googleSignInOptions.f7760v && this.f7761w == googleSignInOptions.f7761w && TextUtils.equals(this.f7756B, googleSignInOptions.f7756B);
            }
            return false;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f7758t;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(((Scope) arrayList2.get(i10)).f7875t);
        }
        Collections.sort(arrayList);
        HashAccumulator hashAccumulator = new HashAccumulator();
        hashAccumulator.a(arrayList);
        hashAccumulator.a(this.f7759u);
        hashAccumulator.a(this.f7763y);
        hashAccumulator.a = (((((hashAccumulator.a * 31) + (this.f7762x ? 1 : 0)) * 31) + (this.f7760v ? 1 : 0)) * 31) + (this.f7761w ? 1 : 0);
        hashAccumulator.a(this.f7756B);
        return hashAccumulator.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = SafeParcelWriter.i(parcel, 20293);
        SafeParcelWriter.k(parcel, 1, 4);
        parcel.writeInt(this.f7757s);
        SafeParcelWriter.h(parcel, 2, new ArrayList(this.f7758t));
        SafeParcelWriter.d(parcel, 3, this.f7759u, i10);
        SafeParcelWriter.k(parcel, 4, 4);
        parcel.writeInt(this.f7760v ? 1 : 0);
        SafeParcelWriter.k(parcel, 5, 4);
        parcel.writeInt(this.f7761w ? 1 : 0);
        SafeParcelWriter.k(parcel, 6, 4);
        parcel.writeInt(this.f7762x ? 1 : 0);
        SafeParcelWriter.e(parcel, 7, this.f7763y);
        SafeParcelWriter.e(parcel, 8, this.f7764z);
        SafeParcelWriter.h(parcel, 9, this.f7755A);
        SafeParcelWriter.e(parcel, 10, this.f7756B);
        SafeParcelWriter.j(parcel, i11);
    }
}

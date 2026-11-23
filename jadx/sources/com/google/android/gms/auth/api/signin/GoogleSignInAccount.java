package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.DefaultClock;
import java.util.ArrayList;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@SafeParcelable.Class
@Deprecated
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new zab();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final String f7740A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final ArrayList f7741B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final String f7742C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final String f7743D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final HashSet f7744E = new HashSet();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f7745s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f7746t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f7747u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f7748v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f7749w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Uri f7750x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f7751y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final long f7752z;

    static {
        DefaultClock defaultClock = DefaultClock.a;
    }

    public GoogleSignInAccount(int i10, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, ArrayList arrayList, String str7, String str8) {
        this.f7745s = i10;
        this.f7746t = str;
        this.f7747u = str2;
        this.f7748v = str3;
        this.f7749w = str4;
        this.f7750x = uri;
        this.f7751y = str5;
        this.f7752z = j;
        this.f7740A = str6;
        this.f7741B = arrayList;
        this.f7742C = str7;
        this.f7743D = str8;
    }

    public static GoogleSignInAccount T(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(1, jSONArray.getString(i10)));
        }
        String strOptString2 = jSONObject.optString("id");
        String strOptString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String strOptString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String strOptString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String strOptString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String strOptString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        Preconditions.e(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, strOptString2, strOptString3, strOptString4, strOptString5, uri, null, j, string, new ArrayList(hashSet), strOptString6, strOptString7);
        googleSignInAccount.f7751y = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    public final HashSet K() {
        HashSet hashSet = new HashSet(this.f7741B);
        hashSet.addAll(this.f7744E);
        return hashSet;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f7740A.equals(this.f7740A) && googleSignInAccount.K().equals(K());
    }

    public final int hashCode() {
        return ((this.f7740A.hashCode() + 527) * 31) + K().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = SafeParcelWriter.i(parcel, 20293);
        SafeParcelWriter.k(parcel, 1, 4);
        parcel.writeInt(this.f7745s);
        SafeParcelWriter.e(parcel, 2, this.f7746t);
        SafeParcelWriter.e(parcel, 3, this.f7747u);
        SafeParcelWriter.e(parcel, 4, this.f7748v);
        SafeParcelWriter.e(parcel, 5, this.f7749w);
        SafeParcelWriter.d(parcel, 6, this.f7750x, i10);
        SafeParcelWriter.e(parcel, 7, this.f7751y);
        SafeParcelWriter.k(parcel, 8, 8);
        parcel.writeLong(this.f7752z);
        SafeParcelWriter.e(parcel, 9, this.f7740A);
        SafeParcelWriter.h(parcel, 10, this.f7741B);
        SafeParcelWriter.e(parcel, 11, this.f7742C);
        SafeParcelWriter.e(parcel, 12, this.f7743D);
        SafeParcelWriter.j(parcel, i11);
    }
}

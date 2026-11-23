package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzo {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Uri f8182d = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f8184c;

    public zzo(String str, boolean z6) {
        Preconditions.e(str);
        this.a = str;
        Preconditions.e("com.google.android.gms");
        this.f8183b = "com.google.android.gms";
        this.f8184c = z6;
    }

    public final Intent a(Context context) {
        Bundle bundleCall;
        Intent intent = null;
        String str = this.a;
        if (str == null) {
            return new Intent().setComponent(null);
        }
        if (this.f8184c) {
            Bundle bundle = new Bundle();
            bundle.putString("serviceActionBundleKey", str);
            try {
                bundleCall = context.getContentResolver().call(f8182d, "serviceIntentCall", (String) null, bundle);
            } catch (IllegalArgumentException e10) {
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e10.toString()));
                bundleCall = null;
            }
            intent = bundleCall != null ? (Intent) bundleCall.getParcelable("serviceResponseIntentKey") : null;
            if (intent == null) {
                Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(str)));
            }
        }
        return intent == null ? new Intent(str).setPackage(this.f8183b) : intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzo)) {
            return false;
        }
        zzo zzoVar = (zzo) obj;
        return Objects.a(this.a, zzoVar.a) && Objects.a(this.f8183b, zzoVar.f8183b) && Objects.a(null, null) && this.f8184c == zzoVar.f8184c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.f8183b, null, 4225, Boolean.valueOf(this.f8184c)});
    }

    public final String toString() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        Preconditions.i(null);
        throw null;
    }
}

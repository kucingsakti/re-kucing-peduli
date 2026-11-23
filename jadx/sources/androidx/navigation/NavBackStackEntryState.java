package androidx.navigation;

import T2.b;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.EnumC0519n;
import kotlin.Metadata;
import p210v8.i;
import y0.C0872j;
import y0.C0878p;
import y0.x;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/navigation/NavBackStackEntryState;", "Landroid/os/Parcelable;", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"BanParcelableUsage"})
public final class NavBackStackEntryState implements Parcelable {
    public static final Parcelable.Creator<NavBackStackEntryState> CREATOR = new b(7);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f6778s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f6779t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Bundle f6780u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Bundle f6781v;

    public NavBackStackEntryState(C0872j c0872j) {
        i.f(c0872j, "entry");
        this.f6778s = c0872j.f15932x;
        this.f6779t = c0872j.f15928t.f16002z;
        this.f6780u = c0872j.b();
        Bundle bundle = new Bundle();
        this.f6781v = bundle;
        c0872j.f15924A.g(bundle);
    }

    public final C0872j a(Context context, x xVar, EnumC0519n enumC0519n, C0878p c0878p) {
        i.f(enumC0519n, "hostLifecycleState");
        Bundle bundle = this.f6780u;
        if (bundle != null) {
            bundle.setClassLoader(context.getClassLoader());
        } else {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        String str = this.f6778s;
        i.f(str, "id");
        return new C0872j(context, xVar, bundle2, enumC0519n, c0878p, str, this.f6781v);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        i.f(parcel, "parcel");
        parcel.writeString(this.f6778s);
        parcel.writeInt(this.f6779t);
        parcel.writeBundle(this.f6780u);
        parcel.writeBundle(this.f6781v);
    }

    public NavBackStackEntryState(Parcel parcel) {
        String string = parcel.readString();
        i.c(string);
        this.f6778s = string;
        this.f6779t = parcel.readInt();
        this.f6780u = parcel.readBundle(NavBackStackEntryState.class.getClassLoader());
        Bundle bundle = parcel.readBundle(NavBackStackEntryState.class.getClassLoader());
        i.c(bundle);
        this.f6781v = bundle;
    }
}

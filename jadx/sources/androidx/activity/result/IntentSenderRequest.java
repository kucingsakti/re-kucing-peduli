package androidx.activity.result;

import T2.b;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/activity/result/IntentSenderRequest;", "Landroid/os/Parcelable;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"BanParcelableUsage"})
public final class IntentSenderRequest implements Parcelable {
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new b(4);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final IntentSender f6033s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Intent f6034t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f6035u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f6036v;

    public IntentSenderRequest(IntentSender intentSender, Intent intent, int i10, int i11) {
        this.f6033s = intentSender;
        this.f6034t = intent;
        this.f6035u = i10;
        this.f6036v = i11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        i.f(parcel, "dest");
        parcel.writeParcelable(this.f6033s, i10);
        parcel.writeParcelable(this.f6034t, i10);
        parcel.writeInt(this.f6035u);
        parcel.writeInt(this.f6036v);
    }
}

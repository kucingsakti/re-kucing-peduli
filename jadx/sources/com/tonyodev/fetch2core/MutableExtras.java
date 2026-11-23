package com.tonyodev.fetch2core;

import android.os.Parcel;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import p163q7.k;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/tonyodev/fetch2core/MutableExtras;", "Lcom/tonyodev/fetch2core/Extras;", "Ljava/io/Serializable;", "CREATOR", "q7/k", "fetch2core_release"}, k = 1, mv = {1, 4, 0})
public class MutableExtras extends Extras implements Serializable {
    public static final k CREATOR = new k();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final LinkedHashMap f10375u;

    public MutableExtras(LinkedHashMap linkedHashMap) {
        super(linkedHashMap);
        this.f10375u = linkedHashMap;
    }

    @Override // com.tonyodev.fetch2core.Extras, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.tonyodev.fetch2core.Extras
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj != null ? obj.getClass() : null) || !super.equals(obj)) {
            return false;
        }
        if (obj != null) {
            return i.a(this.f10375u, ((MutableExtras) obj).f10375u);
        }
        throw new TypeCastException("null cannot be cast to non-null type com.tonyodev.fetch2core.MutableExtras");
    }

    @Override // com.tonyodev.fetch2core.Extras
    public final int hashCode() {
        return this.f10375u.hashCode() + (this.f10374s.hashCode() * 31);
    }

    @Override // com.tonyodev.fetch2core.Extras
    public final String toString() {
        return a();
    }

    @Override // com.tonyodev.fetch2core.Extras, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        i.g(parcel, "dest");
        parcel.writeSerializable(new HashMap(this.f10375u));
    }
}

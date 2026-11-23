package com.tonyodev.fetch2core;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import org.json.JSONObject;
import p086i8.t;
import p086i8.y;
import p163q7.e;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/tonyodev/fetch2core/Extras;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "CREATOR", "q7/e", "fetch2core_release"}, k = 1, mv = {1, 4, 0})
public class Extras implements Parcelable, Serializable {
    public static final e CREATOR = new e();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Extras f10373t = new Extras(t.f12329s);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Map f10374s;

    public Extras(Map map) {
        this.f10374s = map;
    }

    public final String a() {
        Map map = this.f10374s;
        if (map.isEmpty()) {
            return "{}";
        }
        String string = new JSONObject(y.A(map)).toString();
        i.b(string, "JSONObject(map).toString()");
        return string;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            return i.a(this.f10374s, ((Extras) obj).f10374s);
        }
        throw new TypeCastException("null cannot be cast to non-null type com.tonyodev.fetch2core.Extras");
    }

    public int hashCode() {
        return this.f10374s.hashCode();
    }

    public String toString() {
        return a();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        i.g(parcel, "dest");
        parcel.writeSerializable(new HashMap(this.f10374s));
    }
}

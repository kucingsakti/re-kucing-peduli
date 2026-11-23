package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.EnumC0519n;
import p156q0.F;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new a(4);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final boolean f6593A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final boolean f6594B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final boolean f6595C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int f6596D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final String f6597E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final int f6598F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final boolean f6599G;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f6600s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f6601t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f6602u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f6603v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f6604w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f6605x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f6606y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f6607z;

    public FragmentState(b bVar) {
        this.f6600s = bVar.getClass().getName();
        this.f6601t = bVar.f6655x;
        this.f6602u = bVar.f6616H;
        this.f6603v = bVar.f6618J;
        this.f6604w = bVar.f6625R;
        this.f6605x = bVar.f6626S;
        this.f6606y = bVar.f6627T;
        this.f6607z = bVar.f6630W;
        this.f6593A = bVar.f6613E;
        this.f6594B = bVar.f6629V;
        this.f6595C = bVar.f6628U;
        this.f6596D = bVar.f6642k0.ordinal();
        this.f6597E = bVar.f6609A;
        this.f6598F = bVar.f6610B;
        this.f6599G = bVar.f6637e0;
    }

    public final b a(F f10) {
        b bVarA = f10.a(this.f6600s);
        bVarA.f6655x = this.f6601t;
        bVarA.f6616H = this.f6602u;
        bVarA.f6618J = this.f6603v;
        bVarA.f6619K = true;
        bVarA.f6625R = this.f6604w;
        bVarA.f6626S = this.f6605x;
        bVarA.f6627T = this.f6606y;
        bVarA.f6630W = this.f6607z;
        bVarA.f6613E = this.f6593A;
        bVarA.f6629V = this.f6594B;
        bVarA.f6628U = this.f6595C;
        bVarA.f6642k0 = EnumC0519n.values()[this.f6596D];
        bVarA.f6609A = this.f6597E;
        bVarA.f6610B = this.f6598F;
        bVarA.f6637e0 = this.f6599G;
        return bVarA;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f6600s);
        sb.append(" (");
        sb.append(this.f6601t);
        sb.append(")}:");
        if (this.f6602u) {
            sb.append(" fromLayout");
        }
        if (this.f6603v) {
            sb.append(" dynamicContainer");
        }
        int i10 = this.f6605x;
        if (i10 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i10));
        }
        String str = this.f6606y;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f6607z) {
            sb.append(" retainInstance");
        }
        if (this.f6593A) {
            sb.append(" removing");
        }
        if (this.f6594B) {
            sb.append(" detached");
        }
        if (this.f6595C) {
            sb.append(" hidden");
        }
        String str2 = this.f6597E;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.f6598F);
        }
        if (this.f6599G) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f6600s);
        parcel.writeString(this.f6601t);
        parcel.writeInt(this.f6602u ? 1 : 0);
        parcel.writeInt(this.f6603v ? 1 : 0);
        parcel.writeInt(this.f6604w);
        parcel.writeInt(this.f6605x);
        parcel.writeString(this.f6606y);
        parcel.writeInt(this.f6607z ? 1 : 0);
        parcel.writeInt(this.f6593A ? 1 : 0);
        parcel.writeInt(this.f6594B ? 1 : 0);
        parcel.writeInt(this.f6595C ? 1 : 0);
        parcel.writeInt(this.f6596D);
        parcel.writeString(this.f6597E);
        parcel.writeInt(this.f6598F);
        parcel.writeInt(this.f6599G ? 1 : 0);
    }

    public FragmentState(Parcel parcel) {
        this.f6600s = parcel.readString();
        this.f6601t = parcel.readString();
        this.f6602u = parcel.readInt() != 0;
        this.f6603v = parcel.readInt() != 0;
        this.f6604w = parcel.readInt();
        this.f6605x = parcel.readInt();
        this.f6606y = parcel.readString();
        this.f6607z = parcel.readInt() != 0;
        this.f6593A = parcel.readInt() != 0;
        this.f6594B = parcel.readInt() != 0;
        this.f6595C = parcel.readInt() != 0;
        this.f6596D = parcel.readInt();
        this.f6597E = parcel.readString();
        this.f6598F = parcel.readInt();
        this.f6599G = parcel.readInt() != 0;
    }
}

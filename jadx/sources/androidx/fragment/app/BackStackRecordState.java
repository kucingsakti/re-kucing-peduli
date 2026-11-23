package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.lifecycle.EnumC0519n;
import java.util.ArrayList;
import java.util.Objects;
import p156q0.C0742a;
import p156q0.P;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator<BackStackRecordState> CREATOR = new a(0);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final CharSequence f6562A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final int f6563B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final CharSequence f6564C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final ArrayList f6565D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final ArrayList f6566E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final boolean f6567F;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int[] f6568s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f6569t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int[] f6570u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int[] f6571v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f6572w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f6573x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f6574y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f6575z;

    public BackStackRecordState(C0742a c0742a) {
        int size = c0742a.a.size();
        this.f6568s = new int[size * 6];
        if (!c0742a.f14299g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f6569t = new ArrayList(size);
        this.f6570u = new int[size];
        this.f6571v = new int[size];
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            P p10 = (P) c0742a.a.get(i11);
            int i12 = i10 + 1;
            this.f6568s[i10] = p10.a;
            ArrayList arrayList = this.f6569t;
            b bVar = p10.f14269b;
            arrayList.add(bVar != null ? bVar.f6655x : null);
            int[] iArr = this.f6568s;
            iArr[i12] = p10.f14270c ? 1 : 0;
            iArr[i10 + 2] = p10.f14271d;
            iArr[i10 + 3] = p10.f14272e;
            int i13 = i10 + 5;
            iArr[i10 + 4] = p10.f14273f;
            i10 += 6;
            iArr[i13] = p10.f14274g;
            this.f6570u[i11] = p10.f14275h.ordinal();
            this.f6571v[i11] = p10.f14276i.ordinal();
        }
        this.f6572w = c0742a.f14298f;
        this.f6573x = c0742a.f14301i;
        this.f6574y = c0742a.f14311t;
        this.f6575z = c0742a.j;
        this.f6562A = c0742a.f14302k;
        this.f6563B = c0742a.f14303l;
        this.f6564C = c0742a.f14304m;
        this.f6565D = c0742a.f14305n;
        this.f6566E = c0742a.f14306o;
        this.f6567F = c0742a.f14307p;
    }

    public final void a(C0742a c0742a) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int[] iArr = this.f6568s;
            boolean z6 = true;
            if (i10 >= iArr.length) {
                c0742a.f14298f = this.f6572w;
                c0742a.f14301i = this.f6573x;
                c0742a.f14299g = true;
                c0742a.j = this.f6575z;
                c0742a.f14302k = this.f6562A;
                c0742a.f14303l = this.f6563B;
                c0742a.f14304m = this.f6564C;
                c0742a.f14305n = this.f6565D;
                c0742a.f14306o = this.f6566E;
                c0742a.f14307p = this.f6567F;
                return;
            }
            P p10 = new P();
            int i12 = i10 + 1;
            p10.a = iArr[i10];
            if (e.K(2)) {
                Objects.toString(c0742a);
                int i13 = iArr[i12];
            }
            p10.f14275h = EnumC0519n.values()[this.f6570u[i11]];
            p10.f14276i = EnumC0519n.values()[this.f6571v[i11]];
            int i14 = i10 + 2;
            if (iArr[i12] == 0) {
                z6 = false;
            }
            p10.f14270c = z6;
            int i15 = iArr[i14];
            p10.f14271d = i15;
            int i16 = iArr[i10 + 3];
            p10.f14272e = i16;
            int i17 = i10 + 5;
            int i18 = iArr[i10 + 4];
            p10.f14273f = i18;
            i10 += 6;
            int i19 = iArr[i17];
            p10.f14274g = i19;
            c0742a.f14294b = i15;
            c0742a.f14295c = i16;
            c0742a.f14296d = i18;
            c0742a.f14297e = i19;
            c0742a.b(p10);
            i11++;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.f6568s);
        parcel.writeStringList(this.f6569t);
        parcel.writeIntArray(this.f6570u);
        parcel.writeIntArray(this.f6571v);
        parcel.writeInt(this.f6572w);
        parcel.writeString(this.f6573x);
        parcel.writeInt(this.f6574y);
        parcel.writeInt(this.f6575z);
        TextUtils.writeToParcel(this.f6562A, parcel, 0);
        parcel.writeInt(this.f6563B);
        TextUtils.writeToParcel(this.f6564C, parcel, 0);
        parcel.writeStringList(this.f6565D);
        parcel.writeStringList(this.f6566E);
        parcel.writeInt(this.f6567F ? 1 : 0);
    }

    public BackStackRecordState(Parcel parcel) {
        this.f6568s = parcel.createIntArray();
        this.f6569t = parcel.createStringArrayList();
        this.f6570u = parcel.createIntArray();
        this.f6571v = parcel.createIntArray();
        this.f6572w = parcel.readInt();
        this.f6573x = parcel.readString();
        this.f6574y = parcel.readInt();
        this.f6575z = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f6562A = (CharSequence) creator.createFromParcel(parcel);
        this.f6563B = parcel.readInt();
        this.f6564C = (CharSequence) creator.createFromParcel(parcel);
        this.f6565D = parcel.createStringArrayList();
        this.f6566E = parcel.createStringArrayList();
        this.f6567F = parcel.readInt() != 0;
    }
}

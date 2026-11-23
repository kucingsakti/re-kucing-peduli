package X0;

import android.os.Parcel;
import android.util.SparseIntArray;
import p212w.e;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseIntArray f5373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Parcel f5374e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f5375f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f5376g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f5377h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f5378i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f5379k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new e(0), new e(0), new e(0));
    }

    @Override // X0.a
    public final b a() {
        Parcel parcel = this.f5374e;
        int iDataPosition = parcel.dataPosition();
        int i10 = this.j;
        if (i10 == this.f5375f) {
            i10 = this.f5376g;
        }
        return new b(parcel, iDataPosition, i10, E0.a.l(new StringBuilder(), this.f5377h, "  "), this.a, this.f5371b, this.f5372c);
    }

    @Override // X0.a
    public final boolean e(int i10) {
        while (this.j < this.f5376g) {
            int i11 = this.f5379k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            int i12 = this.j;
            Parcel parcel = this.f5374e;
            parcel.setDataPosition(i12);
            int i13 = parcel.readInt();
            this.f5379k = parcel.readInt();
            this.j += i13;
        }
        return this.f5379k == i10;
    }

    @Override // X0.a
    public final void h(int i10) {
        int i11 = this.f5378i;
        SparseIntArray sparseIntArray = this.f5373d;
        Parcel parcel = this.f5374e;
        if (i11 >= 0) {
            int i12 = sparseIntArray.get(i11);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i12);
            parcel.writeInt(iDataPosition - i12);
            parcel.setDataPosition(iDataPosition);
        }
        this.f5378i = i10;
        sparseIntArray.put(i10, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i10);
    }

    public b(Parcel parcel, int i10, int i11, String str, e eVar, e eVar2, e eVar3) {
        super(eVar, eVar2, eVar3);
        this.f5373d = new SparseIntArray();
        this.f5378i = -1;
        this.f5379k = -1;
        this.f5374e = parcel;
        this.f5375f = i10;
        this.f5376g = i11;
        this.j = i10;
        this.f5377h = str;
    }
}

package ma;

import com.unity3d.services.core.device.reader.JsonStorageKeyNames;

/* JADX INFO: loaded from: classes.dex */
public final class s {
    public final byte[] a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f13217d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f13218e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public s f13219f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public s f13220g;

    public s() {
        this.a = new byte[8192];
        this.f13218e = true;
        this.f13217d = false;
    }

    public final s a() {
        s sVar = this.f13219f;
        if (sVar == this) {
            sVar = null;
        }
        s sVar2 = this.f13220g;
        p210v8.i.c(sVar2);
        sVar2.f13219f = this.f13219f;
        s sVar3 = this.f13219f;
        p210v8.i.c(sVar3);
        sVar3.f13220g = this.f13220g;
        this.f13219f = null;
        this.f13220g = null;
        return sVar;
    }

    public final void b(s sVar) {
        p210v8.i.f(sVar, "segment");
        sVar.f13220g = this;
        sVar.f13219f = this.f13219f;
        s sVar2 = this.f13219f;
        p210v8.i.c(sVar2);
        sVar2.f13220g = sVar;
        this.f13219f = sVar;
    }

    public final s c() {
        this.f13217d = true;
        return new s(this.a, this.f13215b, this.f13216c, true);
    }

    public final void d(s sVar, int i10) {
        p210v8.i.f(sVar, "sink");
        if (!sVar.f13218e) {
            throw new IllegalStateException("only owner can write");
        }
        int i11 = sVar.f13216c;
        int i12 = i11 + i10;
        byte[] bArr = sVar.a;
        if (i12 > 8192) {
            if (sVar.f13217d) {
                throw new IllegalArgumentException();
            }
            int i13 = sVar.f13215b;
            if (i12 - i13 > 8192) {
                throw new IllegalArgumentException();
            }
            p086i8.i.o(0, i13, i11, bArr, bArr);
            sVar.f13216c -= sVar.f13215b;
            sVar.f13215b = 0;
        }
        int i14 = sVar.f13216c;
        int i15 = this.f13215b;
        p086i8.i.o(i14, i15, i15 + i10, this.a, bArr);
        sVar.f13216c += i10;
        this.f13215b += i10;
    }

    public s(byte[] bArr, int i10, int i11, boolean z6) {
        p210v8.i.f(bArr, JsonStorageKeyNames.DATA_KEY);
        this.a = bArr;
        this.f13215b = i10;
        this.f13216c = i11;
        this.f13217d = z6;
        this.f13218e = false;
    }
}

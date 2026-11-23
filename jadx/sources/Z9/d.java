package Z9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import ma.w;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f5926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f5927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f5928d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f5929e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f5930f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public K0.g f5931g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5932h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f5933i;
    public final /* synthetic */ g j;

    public d(g gVar, String str) {
        i.f(gVar, "this$0");
        i.f(str, "key");
        this.j = gVar;
        this.a = str;
        this.f5926b = new long[2];
        this.f5927c = new ArrayList();
        this.f5928d = new ArrayList();
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i10 = 0; i10 < 2; i10++) {
            sb.append(i10);
            this.f5927c.add(new File(this.j.f5954s, sb.toString()));
            sb.append(".tmp");
            this.f5928d.add(new File(this.j.f5954s, sb.toString()));
            sb.setLength(length);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [ma.b] */
    /* JADX WARN: Type inference failed for: r1v9 */
    public final e a() {
        byte[] bArr = Y9.c.a;
        if (!this.f5929e) {
            return null;
        }
        g gVar = this.j;
        if (!gVar.f5946B && (this.f5931g != null || this.f5930f)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        long[] jArr = (long[]) this.f5926b.clone();
        int i10 = 0;
        while (i10 < 2) {
            int i11 = i10 + 1;
            try {
                File file = (File) this.f5927c.get(i10);
                i.f(file, "file");
                ?? D2 = p068ga.d.D(file);
                if (!gVar.f5946B) {
                    this.f5932h++;
                    D2 = new c(D2, gVar, this);
                }
                arrayList.add(D2);
                i10 = i11;
            } catch (FileNotFoundException unused) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Y9.c.d((w) it.next());
                }
                try {
                    gVar.t(this);
                    return null;
                } catch (IOException unused2) {
                    return null;
                }
            }
        }
        return new e(this.j, this.a, this.f5933i, arrayList, jArr);
    }
}

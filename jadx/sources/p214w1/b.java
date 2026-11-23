package p214w1;

import K0.g;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f15515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File[] f15516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File[] f15517d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15518e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public g f15519f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c f15520g;

    public b(c cVar, String str) {
        this.f15520g = cVar;
        this.a = str;
        int i10 = cVar.f15533y;
        this.f15515b = new long[i10];
        this.f15516c = new File[i10];
        this.f15517d = new File[i10];
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i11 = 0; i11 < cVar.f15533y; i11++) {
            sb.append(i11);
            File[] fileArr = this.f15516c;
            String string = sb.toString();
            File file = cVar.f15527s;
            fileArr[i11] = new File(file, string);
            sb.append(".tmp");
            this.f15517d[i11] = new File(file, sb.toString());
            sb.setLength(length);
        }
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        for (long j : this.f15515b) {
            sb.append(' ');
            sb.append(j);
        }
        return sb.toString();
    }
}

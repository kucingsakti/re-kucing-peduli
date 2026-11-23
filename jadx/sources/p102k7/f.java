package p102k7;

import E.g;
import Fa.e;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import com.tonyodev.fetch2.Download;
import com.tonyodev.fetch2.database.DownloadInfo;
import com.tonyodev.fetch2.exception.FetchException;
import com.tonyodev.fetch2core.DownloadBlockInfo;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import o1.k;
import p076h8.j;
import p086i8.C;
import p086i8.y;
import p122m7.b;
import p143o7.a;
import p163q7.c;
import p163q7.d;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class f implements b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public double f12744A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final g f12745B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final DownloadBlockInfo f12746C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int f12747D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final e f12748E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final Download f12749F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final d f12750G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final p163q7.f f12751H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final a f12752I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final k f12753J;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile boolean f12754s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile boolean f12755t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public b f12756u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public volatile long f12757v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public volatile boolean f12758w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public volatile long f12759x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f12760y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final j f12761z;

    public f(Download download, d dVar, p163q7.f fVar, a aVar, k kVar) {
        i.g(dVar, "downloader");
        i.g(fVar, "logger");
        this.f12749F = download;
        this.f12750G = dVar;
        this.f12751H = fVar;
        this.f12752I = aVar;
        this.f12753J = kVar;
        this.f12757v = -1L;
        this.f12760y = -1L;
        this.f12761z = D3.b.s(new d(this, 1));
        this.f12745B = new g(5);
        this.f12746C = (DownloadBlockInfo) new d(this, 0).invoke();
        this.f12747D = 1;
        this.f12748E = new e(this);
    }

    public final long a() {
        double d3 = this.f12744A;
        if (d3 < 1) {
            return 0L;
        }
        return (long) Math.ceil(d3);
    }

    public final DownloadInfo b() {
        return (DownloadInfo) this.f12761z.getValue();
    }

    public final e c() {
        LinkedHashMap linkedHashMapC = y.C(((DownloadInfo) this.f12749F).f10366y);
        linkedHashMapC.put("Range", "bytes=" + this.f12759x + '-');
        DownloadInfo downloadInfo = (DownloadInfo) this.f12749F;
        int i10 = downloadInfo.f10360s;
        String str = downloadInfo.f10362u;
        String str2 = downloadInfo.f10363v;
        Uri uriV = C3.b.v(str2);
        DownloadInfo downloadInfo2 = (DownloadInfo) this.f12749F;
        return new e(i10, str, linkedHashMapC, str2, uriV, downloadInfo2.f10351F, downloadInfo2.f10353H, "GET", downloadInfo2.f10355J, "", 1);
    }

    public final boolean d() {
        return ((this.f12759x > 0 && this.f12757v > 0) || this.f12758w) && this.f12759x >= this.f12757v;
    }

    public final void e() {
        if (this.f12754s || this.f12755t || !d()) {
            return;
        }
        this.f12757v = this.f12759x;
        b().f10367z = this.f12759x;
        b().f10346A = this.f12757v;
        this.f12746C.f10372w = this.f12759x;
        this.f12746C.f10371v = this.f12757v;
        if (this.f12755t || this.f12754s) {
            return;
        }
        b bVar = this.f12756u;
        if (bVar != null) {
            bVar.e(b());
        }
        b bVar2 = this.f12756u;
        if (bVar2 != null) {
            bVar2.a(b(), this.f12746C, this.f12747D);
        }
        b().f10358M = this.f12760y;
        b().f10359N = a();
        DownloadInfo downloadInfoB = b();
        downloadInfoB.getClass();
        DownloadInfo downloadInfo = new DownloadInfo();
        C.z(downloadInfoB, downloadInfo);
        b bVar3 = this.f12756u;
        if (bVar3 != null) {
            bVar3.c(b(), b().f10358M, b().f10359N);
        }
        b().f10358M = -1L;
        b().f10359N = -1L;
        b bVar4 = this.f12756u;
        if (bVar4 == null || bVar4.a) {
            return;
        }
        downloadInfo.f10347B = h7.f.COMPLETED;
        bVar4.f13141b.b(downloadInfo);
        bVar4.f13142c.b(downloadInfo);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00ea  */
    public final void f(BufferedInputStream bufferedInputStream, D6.a aVar, int i10) throws IOException {
        long j = this.f12759x;
        byte[] bArr = new byte[i10];
        long jNanoTime = System.nanoTime();
        long jNanoTime2 = System.nanoTime();
        int i11 = bufferedInputStream.read(bArr, 0, i10);
        long jNanoTime3 = jNanoTime;
        long jNanoTime4 = jNanoTime2;
        while (!this.f12754s && !this.f12755t && i11 != -1) {
            aVar.c(i11, bArr);
            if (this.f12755t || this.f12754s) {
                jNanoTime4 = jNanoTime4;
                jNanoTime3 = jNanoTime3;
            } else {
                long j10 = jNanoTime3;
                this.f12759x += (long) i11;
                b().f10367z = this.f12759x;
                b().f10346A = this.f12757v;
                this.f12746C.f10372w = this.f12759x;
                this.f12746C.f10371v = this.f12757v;
                boolean zC = C3.b.C(jNanoTime4, System.nanoTime(), 1000L);
                long j11 = jNanoTime4;
                if (zC) {
                    this.f12745B.a(this.f12759x - j);
                    this.f12744A = g.b(this.f12745B);
                    this.f12760y = C3.b.c(this.f12759x, this.f12757v, a());
                    j = this.f12759x;
                }
                if (C3.b.C(j10, System.nanoTime(), 400L)) {
                    this.f12746C.f10372w = this.f12759x;
                    if (!this.f12755t && !this.f12754s) {
                        b bVar = this.f12756u;
                        if (bVar != null) {
                            bVar.e(b());
                        }
                        b bVar2 = this.f12756u;
                        if (bVar2 != null) {
                            bVar2.a(b(), this.f12746C, this.f12747D);
                        }
                        b().f10358M = this.f12760y;
                        b().f10359N = a();
                        b bVar3 = this.f12756u;
                        if (bVar3 != null) {
                            bVar3.c(b(), b().f10358M, b().f10359N);
                        }
                    }
                    jNanoTime3 = System.nanoTime();
                } else {
                    j = j;
                    jNanoTime3 = j10;
                }
                jNanoTime4 = zC ? System.nanoTime() : j11;
                i11 = bufferedInputStream.read(bArr, 0, i10);
                j = j;
            }
        }
        aVar.flush();
    }

    @Override // p102k7.b
    public final void h() {
        b bVar = this.f12756u;
        if (!(bVar instanceof b)) {
            bVar = null;
        }
        if (bVar != null) {
            bVar.a = true;
        }
        this.f12754s = true;
    }

    @Override // p102k7.b
    public final void i(b bVar) {
        this.f12756u = bVar;
    }

    @Override // p102k7.b
    public final void j() {
        b bVar = this.f12756u;
        if (!(bVar instanceof b)) {
            bVar = null;
        }
        if (bVar != null) {
            bVar.a = true;
        }
        this.f12755t = true;
    }

    @Override // p102k7.b
    public final DownloadInfo l() {
        b().f10367z = this.f12759x;
        b().f10346A = this.f12757v;
        return b();
    }

    @Override // p102k7.b
    public final boolean p() {
        return this.f12754s;
    }

    /* JADX WARN: Code duplicated, block: B:155:0x02a8 A[Catch: all -> 0x0232, TryCatch #13 {all -> 0x0232, blocks: (B:111:0x01f1, B:113:0x01f7, B:115:0x01fb, B:117:0x01ff, B:119:0x021f, B:121:0x0223, B:123:0x0227, B:129:0x0237, B:131:0x023b, B:132:0x0246, B:134:0x025c, B:135:0x0271, B:138:0x0279, B:153:0x02a4, B:155:0x02a8, B:157:0x02ac, B:162:0x02d5, B:163:0x02d8, B:170:0x02ee, B:171:0x02f0, B:173:0x0319, B:175:0x031d, B:177:0x032d, B:166:0x02e3, B:167:0x02e6), top: B:218:0x000c, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:161:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:166:0x02e3 A[Catch: all -> 0x0232, LOOP:0: B:159:0x02cf->B:166:0x02e3, LOOP_END, TryCatch #13 {all -> 0x0232, blocks: (B:111:0x01f1, B:113:0x01f7, B:115:0x01fb, B:117:0x01ff, B:119:0x021f, B:121:0x0223, B:123:0x0227, B:129:0x0237, B:131:0x023b, B:132:0x0246, B:134:0x025c, B:135:0x0271, B:138:0x0279, B:153:0x02a4, B:155:0x02a8, B:157:0x02ac, B:162:0x02d5, B:163:0x02d8, B:170:0x02ee, B:171:0x02f0, B:173:0x0319, B:175:0x031d, B:177:0x032d, B:166:0x02e3, B:167:0x02e6), top: B:218:0x000c, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:170:0x02ee A[Catch: all -> 0x0232, TryCatch #13 {all -> 0x0232, blocks: (B:111:0x01f1, B:113:0x01f7, B:115:0x01fb, B:117:0x01ff, B:119:0x021f, B:121:0x0223, B:123:0x0227, B:129:0x0237, B:131:0x023b, B:132:0x0246, B:134:0x025c, B:135:0x0271, B:138:0x0279, B:153:0x02a4, B:155:0x02a8, B:157:0x02ac, B:162:0x02d5, B:163:0x02d8, B:170:0x02ee, B:171:0x02f0, B:173:0x0319, B:175:0x031d, B:177:0x032d, B:166:0x02e3, B:167:0x02e6), top: B:218:0x000c, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:173:0x0319 A[Catch: all -> 0x0232, TryCatch #13 {all -> 0x0232, blocks: (B:111:0x01f1, B:113:0x01f7, B:115:0x01fb, B:117:0x01ff, B:119:0x021f, B:121:0x0223, B:123:0x0227, B:129:0x0237, B:131:0x023b, B:132:0x0246, B:134:0x025c, B:135:0x0271, B:138:0x0279, B:153:0x02a4, B:155:0x02a8, B:157:0x02ac, B:162:0x02d5, B:163:0x02d8, B:170:0x02ee, B:171:0x02f0, B:173:0x0319, B:175:0x031d, B:177:0x032d, B:166:0x02e3, B:167:0x02e6), top: B:218:0x000c, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:177:0x032d A[Catch: all -> 0x0232, TRY_LEAVE, TryCatch #13 {all -> 0x0232, blocks: (B:111:0x01f1, B:113:0x01f7, B:115:0x01fb, B:117:0x01ff, B:119:0x021f, B:121:0x0223, B:123:0x0227, B:129:0x0237, B:131:0x023b, B:132:0x0246, B:134:0x025c, B:135:0x0271, B:138:0x0279, B:153:0x02a4, B:155:0x02a8, B:157:0x02ac, B:162:0x02d5, B:163:0x02d8, B:170:0x02ee, B:171:0x02f0, B:173:0x0319, B:175:0x031d, B:177:0x032d, B:166:0x02e3, B:167:0x02e6), top: B:218:0x000c, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0059 A[Catch: all -> 0x00a0, Exception -> 0x00a2, TryCatch #20 {Exception -> 0x00a2, all -> 0x00a0, blocks: (B:9:0x0042, B:11:0x0046, B:13:0x004c, B:18:0x0059, B:20:0x005d, B:22:0x0061, B:26:0x0069, B:28:0x0071, B:33:0x007e, B:35:0x0088, B:41:0x00b9, B:43:0x00d5, B:47:0x00e7, B:48:0x00ea, B:40:0x00a4, B:32:0x0078, B:77:0x0197, B:79:0x019b, B:81:0x019f, B:84:0x01a6, B:85:0x01ad, B:87:0x01b0, B:89:0x01b4, B:92:0x01bb, B:93:0x01c2, B:94:0x01c3, B:96:0x01c7, B:98:0x01cb, B:100:0x01d3, B:103:0x01da, B:104:0x01e1), top: B:227:0x0042 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x005c  */
    /* JADX WARN: Code duplicated, block: B:209:0x0365 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x0372 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x034e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x035a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:0x0336 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:223:0x0341 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:0x02eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:234:0x02e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x0195 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x0197 A[Catch: all -> 0x00a0, Exception -> 0x00a2, TRY_ENTER, TryCatch #20 {Exception -> 0x00a2, all -> 0x00a0, blocks: (B:9:0x0042, B:11:0x0046, B:13:0x004c, B:18:0x0059, B:20:0x005d, B:22:0x0061, B:26:0x0069, B:28:0x0071, B:33:0x007e, B:35:0x0088, B:41:0x00b9, B:43:0x00d5, B:47:0x00e7, B:48:0x00ea, B:40:0x00a4, B:32:0x0078, B:77:0x0197, B:79:0x019b, B:81:0x019f, B:84:0x01a6, B:85:0x01ad, B:87:0x01b0, B:89:0x01b4, B:92:0x01bb, B:93:0x01c2, B:94:0x01c3, B:96:0x01c7, B:98:0x01cb, B:100:0x01d3, B:103:0x01da, B:104:0x01e1), top: B:227:0x0042 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x01b0 A[Catch: all -> 0x00a0, Exception -> 0x00a2, TryCatch #20 {Exception -> 0x00a2, all -> 0x00a0, blocks: (B:9:0x0042, B:11:0x0046, B:13:0x004c, B:18:0x0059, B:20:0x005d, B:22:0x0061, B:26:0x0069, B:28:0x0071, B:33:0x007e, B:35:0x0088, B:41:0x00b9, B:43:0x00d5, B:47:0x00e7, B:48:0x00ea, B:40:0x00a4, B:32:0x0078, B:77:0x0197, B:79:0x019b, B:81:0x019f, B:84:0x01a6, B:85:0x01ad, B:87:0x01b0, B:89:0x01b4, B:92:0x01bb, B:93:0x01c2, B:94:0x01c3, B:96:0x01c7, B:98:0x01cb, B:100:0x01d3, B:103:0x01da, B:104:0x01e1), top: B:227:0x0042 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x01c7 A[Catch: all -> 0x00a0, Exception -> 0x00a2, TryCatch #20 {Exception -> 0x00a2, all -> 0x00a0, blocks: (B:9:0x0042, B:11:0x0046, B:13:0x004c, B:18:0x0059, B:20:0x005d, B:22:0x0061, B:26:0x0069, B:28:0x0071, B:33:0x007e, B:35:0x0088, B:41:0x00b9, B:43:0x00d5, B:47:0x00e7, B:48:0x00ea, B:40:0x00a4, B:32:0x0078, B:77:0x0197, B:79:0x019b, B:81:0x019f, B:84:0x01a6, B:85:0x01ad, B:87:0x01b0, B:89:0x01b4, B:92:0x01bb, B:93:0x01c2, B:94:0x01c3, B:96:0x01c7, B:98:0x01cb, B:100:0x01d3, B:103:0x01da, B:104:0x01e1), top: B:227:0x0042 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [k7.f] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v25, types: [D6.a] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        ?? V10;
        c cVarP;
        BufferedInputStream bufferedInputStream;
        p163q7.f fVar;
        h7.b bVarT;
        boolean z6;
        int i10;
        b bVar;
        ?? r10;
        ?? r11;
        boolean z10;
        ?? r12;
        ?? r13 = "FileDownloader resuming Download ";
        boolean z11 = true;
        c cVar = null;
        bufferedInputStream = null;
        bufferedInputStream = null;
        cVar = null;
        cVar = null;
        BufferedInputStream bufferedInputStream2 = null;
        try {
            try {
                this.f12759x = ((DownloadInfo) this.f12749F).f10367z;
                this.f12757v = ((DownloadInfo) this.f12749F).f10346A;
                b().f10367z = this.f12759x;
                b().f10346A = this.f12757v;
                try {
                    if (!this.f12754s && !this.f12755t) {
                        e eVarC = c();
                        cVarP = this.f12750G.P(eVarC, this.f12748E);
                        if (cVarP != null) {
                            try {
                                if (cVarP.f14422b && cVarP.f14423c == -1) {
                                    this.f12758w = true;
                                }
                                if (cVarP != null) {
                                    z10 = cVarP.f14422b;
                                } else {
                                    z10 = false;
                                }
                                if (!this.f12754s || this.f12755t || cVarP == null || !z10) {
                                    if (cVarP == null && !this.f12754s && !this.f12755t && !d()) {
                                        throw new FetchException("empty_response_body");
                                    }
                                    if (!z10 && !this.f12754s && !d()) {
                                        throw new FetchException("request_not_successful");
                                    }
                                    if (!this.f12754s && !this.f12755t && this.f12759x < this.f12757v && !d()) {
                                        throw new FetchException("unknown");
                                    }
                                    r12 = 0;
                                    bufferedInputStream = null;
                                } else {
                                    long j = 0;
                                    this.f12759x = (cVarP.a == 206 || cVarP.f14426f) ? ((DownloadInfo) this.f12749F).f10367z : 0L;
                                    this.f12757v = cVarP.f14423c;
                                    if (cVarP.a == 206) {
                                        this.f12751H.a("FileDownloader resuming Download " + l());
                                        j = this.f12759x;
                                    } else {
                                        this.f12751H.a("FileDownloader starting Download " + l());
                                    }
                                    b().f10367z = this.f12759x;
                                    b().f10346A = this.f12757v;
                                    if (!this.f12753J.k((String) eVarC.f1661v)) {
                                        this.f12753J.f((String) eVarC.f1661v, ((DownloadInfo) this.f12749F).f10352G == 2);
                                    }
                                    this.f12753J.s((String) eVarC.f1661v, b().f10346A);
                                    ContentResolver contentResolver = ((Context) this.f12753J.f13638s).getContentResolver();
                                    i.b(contentResolver, "context.contentResolver");
                                    V10 = C4.a.v(contentResolver, (String) eVarC.f1661v);
                                    try {
                                        V10.a(j);
                                        if (this.f12754s || this.f12755t) {
                                            bufferedInputStream = null;
                                            r12 = V10;
                                        } else {
                                            this.f12750G.y(eVarC);
                                            bufferedInputStream = new BufferedInputStream(cVarP.f14424d, 8192);
                                            try {
                                                b().f10367z = this.f12759x;
                                                b().f10346A = this.f12757v;
                                                this.f12746C.f10372w = this.f12759x;
                                                DownloadBlockInfo downloadBlockInfo = this.f12746C;
                                                downloadBlockInfo.f10370u = j;
                                                downloadBlockInfo.f10371v = this.f12757v;
                                                if (!this.f12755t && !this.f12754s) {
                                                    b().f10358M = -1L;
                                                    b().f10359N = -1L;
                                                    b bVar2 = this.f12756u;
                                                    if (bVar2 != null) {
                                                        bVar2.d(b(), com.bumptech.glide.d.u(this.f12746C), this.f12747D);
                                                    }
                                                    b bVar3 = this.f12756u;
                                                    if (bVar3 != null) {
                                                        bVar3.a(b(), this.f12746C, this.f12747D);
                                                    }
                                                }
                                                f(bufferedInputStream, V10, 8192);
                                                r12 = V10;
                                            } catch (Exception e10) {
                                                e = e10;
                                                r11 = V10;
                                                cVar = cVarP;
                                                r13 = r11;
                                                if (!this.f12754s) {
                                                    this.f12751H.b("FileDownloader download:" + l(), e);
                                                    bVarT = C4.a.t(e);
                                                    z6 = !C3.a.j(this.f12752I.f13825g);
                                                    i10 = 1;
                                                    while (true) {
                                                        if (i10 <= 10) {
                                                            try {
                                                                Thread.sleep(500L);
                                                                if (!C3.a.j(this.f12752I.f13825g)) {
                                                                    break;
                                                                } else {
                                                                    i10++;
                                                                }
                                                            } catch (InterruptedException unused) {
                                                                this.f12751H.getClass();
                                                                z11 = z6;
                                                                if (z11) {
                                                                    bVarT = h7.b.NO_NETWORK_CONNECTION;
                                                                }
                                                                b().f10367z = this.f12759x;
                                                                b().f10346A = this.f12757v;
                                                                DownloadInfo downloadInfoB = b();
                                                                downloadInfoB.getClass();
                                                                downloadInfoB.f10348C = bVarT;
                                                                this.f12746C.f10372w = this.f12759x;
                                                                this.f12746C.f10371v = this.f12757v;
                                                                if (!this.f12755t && !this.f12754s) {
                                                                    b().f10358M = -1L;
                                                                    b().f10359N = -1L;
                                                                    bVar = this.f12756u;
                                                                    if (bVar != null) {
                                                                        bVar.b(b(), bVarT, e);
                                                                    }
                                                                }
                                                                if (bufferedInputStream != null) {
                                                                    try {
                                                                        bufferedInputStream.close();
                                                                    } catch (Exception unused2) {
                                                                        this.f12751H.getClass();
                                                                    }
                                                                }
                                                                if (cVar != null) {
                                                                    try {
                                                                        this.f12750G.k(cVar);
                                                                    } catch (Exception unused3) {
                                                                        this.f12751H.getClass();
                                                                    }
                                                                }
                                                                if (r13 != 0) {
                                                                    try {
                                                                        r13.close();
                                                                    } catch (Exception unused4) {
                                                                        fVar = this.f12751H;
                                                                        fVar.getClass();
                                                                    }
                                                                }
                                                                j();
                                                            }
                                                        }
                                                        z11 = z6;
                                                        break;
                                                    }
                                                    if (z11) {
                                                        bVarT = h7.b.NO_NETWORK_CONNECTION;
                                                    }
                                                    b().f10367z = this.f12759x;
                                                    b().f10346A = this.f12757v;
                                                    DownloadInfo downloadInfoB2 = b();
                                                    downloadInfoB2.getClass();
                                                    downloadInfoB2.f10348C = bVarT;
                                                    this.f12746C.f10372w = this.f12759x;
                                                    this.f12746C.f10371v = this.f12757v;
                                                    if (!this.f12755t) {
                                                        b().f10358M = -1L;
                                                        b().f10359N = -1L;
                                                        bVar = this.f12756u;
                                                        if (bVar != null) {
                                                            bVar.b(b(), bVarT, e);
                                                        }
                                                    }
                                                }
                                                if (bufferedInputStream != null) {
                                                    bufferedInputStream.close();
                                                }
                                                if (cVar != null) {
                                                    this.f12750G.k(cVar);
                                                }
                                                if (r13 != 0) {
                                                    r13.close();
                                                }
                                                j();
                                            } catch (Throwable th) {
                                                th = th;
                                                V10 = V10;
                                                bufferedInputStream2 = bufferedInputStream;
                                                if (bufferedInputStream2 != null) {
                                                    try {
                                                        bufferedInputStream2.close();
                                                    } catch (Exception unused5) {
                                                        this.f12751H.getClass();
                                                    }
                                                }
                                                if (cVarP != null) {
                                                    try {
                                                        this.f12750G.k(cVarP);
                                                    } catch (Exception unused6) {
                                                        this.f12751H.getClass();
                                                    }
                                                }
                                                if (V10 != 0) {
                                                    try {
                                                        V10.close();
                                                    } catch (Exception unused7) {
                                                        this.f12751H.getClass();
                                                    }
                                                }
                                                j();
                                                throw th;
                                            }
                                        }
                                    } catch (Exception e11) {
                                        e = e11;
                                        bufferedInputStream = null;
                                        r11 = V10;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        if (bufferedInputStream2 != null) {
                                            bufferedInputStream2.close();
                                        }
                                        if (cVarP != null) {
                                            this.f12750G.k(cVarP);
                                        }
                                        if (V10 != 0) {
                                            V10.close();
                                        }
                                        j();
                                        throw th;
                                    }
                                }
                                cVar = cVarP;
                                r10 = r12;
                            } catch (Exception e12) {
                                e = e12;
                                r11 = 0;
                                bufferedInputStream = null;
                                cVar = cVarP;
                                r13 = r11;
                                if (!this.f12754s) {
                                    this.f12751H.b("FileDownloader download:" + l(), e);
                                    bVarT = C4.a.t(e);
                                    z6 = !C3.a.j(this.f12752I.f13825g);
                                    i10 = 1;
                                    while (true) {
                                        if (i10 <= 10) {
                                            Thread.sleep(500L);
                                            if (!C3.a.j(this.f12752I.f13825g)) {
                                                break;
                                                break;
                                            }
                                            i10++;
                                        }
                                        z11 = z6;
                                        break;
                                    }
                                    if (z11) {
                                        bVarT = h7.b.NO_NETWORK_CONNECTION;
                                    }
                                    b().f10367z = this.f12759x;
                                    b().f10346A = this.f12757v;
                                    DownloadInfo downloadInfoB3 = b();
                                    downloadInfoB3.getClass();
                                    downloadInfoB3.f10348C = bVarT;
                                    this.f12746C.f10372w = this.f12759x;
                                    this.f12746C.f10371v = this.f12757v;
                                    if (!this.f12755t) {
                                        b().f10358M = -1L;
                                        b().f10359N = -1L;
                                        bVar = this.f12756u;
                                        if (bVar != null) {
                                            bVar.b(b(), bVarT, e);
                                        }
                                    }
                                }
                                if (bufferedInputStream != null) {
                                    bufferedInputStream.close();
                                }
                                if (cVar != null) {
                                    this.f12750G.k(cVar);
                                }
                                if (r13 != 0) {
                                    r13.close();
                                }
                                j();
                            } catch (Throwable th3) {
                                th = th3;
                                V10 = 0;
                                if (bufferedInputStream2 != null) {
                                    bufferedInputStream2.close();
                                }
                                if (cVarP != null) {
                                    this.f12750G.k(cVarP);
                                }
                                if (V10 != 0) {
                                    V10.close();
                                }
                                j();
                                throw th;
                            }
                        } else {
                            if (cVarP != null) {
                                z10 = cVarP.f14422b;
                            } else {
                                z10 = false;
                            }
                            if (this.f12754s) {
                                if (cVarP == null) {
                                    throw new FetchException("empty_response_body");
                                }
                                if (!z10) {
                                    throw new FetchException("request_not_successful");
                                }
                                if (!this.f12754s) {
                                    throw new FetchException("unknown");
                                }
                                r12 = 0;
                                bufferedInputStream = null;
                            } else {
                                if (cVarP == null) {
                                    throw new FetchException("empty_response_body");
                                }
                                if (!z10) {
                                    throw new FetchException("request_not_successful");
                                }
                                if (!this.f12754s) {
                                    throw new FetchException("unknown");
                                }
                                r12 = 0;
                                bufferedInputStream = null;
                            }
                            cVar = cVarP;
                            r10 = r12;
                        }
                        j();
                    }
                    r10 = 0;
                    bufferedInputStream = null;
                    if (!d() && !this.f12755t && !this.f12754s) {
                        b().f10367z = this.f12759x;
                        b().f10346A = this.f12757v;
                        this.f12746C.f10372w = this.f12759x;
                        this.f12746C.f10371v = this.f12757v;
                        if (!this.f12755t && !this.f12754s) {
                            b bVar4 = this.f12756u;
                            if (bVar4 != null) {
                                bVar4.e(b());
                            }
                            b bVar5 = this.f12756u;
                            if (bVar5 != null) {
                                bVar5.a(b(), this.f12746C, this.f12747D);
                            }
                            b().f10358M = this.f12760y;
                            b().f10359N = a();
                            b bVar6 = this.f12756u;
                            if (bVar6 != null) {
                                bVar6.c(b(), b().f10358M, b().f10359N);
                            }
                        }
                    } else if (d() && cVar != null) {
                        e();
                    }
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (Exception unused8) {
                            this.f12751H.getClass();
                        }
                    }
                    if (cVar != null) {
                        try {
                            this.f12750G.k(cVar);
                        } catch (Exception unused9) {
                            this.f12751H.getClass();
                        }
                    }
                    if (r10 != 0) {
                        try {
                            r10.close();
                        } catch (Exception unused10) {
                            fVar = this.f12751H;
                            fVar.getClass();
                        }
                    }
                } catch (Exception e13) {
                    e = e13;
                    r13 = r10;
                    if (!this.f12754s && !this.f12755t) {
                        this.f12751H.b("FileDownloader download:" + l(), e);
                        bVarT = C4.a.t(e);
                        z6 = !C3.a.j(this.f12752I.f13825g);
                        i10 = 1;
                        while (true) {
                            if (i10 <= 10) {
                                Thread.sleep(500L);
                                if (!C3.a.j(this.f12752I.f13825g)) {
                                    break;
                                    break;
                                }
                                i10++;
                            }
                            z11 = z6;
                            break;
                        }
                        if (z11) {
                            bVarT = h7.b.NO_NETWORK_CONNECTION;
                        }
                        b().f10367z = this.f12759x;
                        b().f10346A = this.f12757v;
                        DownloadInfo downloadInfoB4 = b();
                        downloadInfoB4.getClass();
                        downloadInfoB4.f10348C = bVarT;
                        this.f12746C.f10372w = this.f12759x;
                        this.f12746C.f10371v = this.f12757v;
                        if (!this.f12755t) {
                            b().f10358M = -1L;
                            b().f10359N = -1L;
                            bVar = this.f12756u;
                            if (bVar != null) {
                                bVar.b(b(), bVarT, e);
                            }
                        }
                    }
                    if (bufferedInputStream != null) {
                        bufferedInputStream.close();
                    }
                    if (cVar != null) {
                        this.f12750G.k(cVar);
                    }
                    if (r13 != 0) {
                        r13.close();
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                cVarP = cVar;
                V10 = r13;
                bufferedInputStream2 = bufferedInputStream;
                if (bufferedInputStream2 != null) {
                    bufferedInputStream2.close();
                }
                if (cVarP != null) {
                    this.f12750G.k(cVarP);
                }
                if (V10 != 0) {
                    V10.close();
                }
                j();
                throw th;
            }
        } catch (Exception e14) {
            e = e14;
            r13 = 0;
            bufferedInputStream = null;
        } catch (Throwable th5) {
            th = th5;
            V10 = 0;
            cVarP = null;
        }
        j();
    }
}

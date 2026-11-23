package p197u4;

import D3.b;
import N9.AbstractC0342z;
import V9.e;
import Y1.c;
import android.os.Build;
import android.util.Log;
import c2.a;
import java.util.Arrays;
import java.util.Map;
import java.util.regex.Pattern;
import p039e0.f;
import p076h8.j;
import p076h8.m;
import p086i8.y;
import p123m8.i;
import p182s4.C0765b;
import p182s4.C0780q;
import p182s4.X;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public final p082i4.d a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f15313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f15314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final V9.d f15315d = e.a();

    public d(i iVar, p082i4.d dVar, C0765b c0765b, c cVar, f fVar) {
        this.a = dVar;
        this.f15313b = cVar;
        this.f15314c = b.s(new a(fVar, 21));
    }

    public static String c(String str) {
        Pattern patternCompile = Pattern.compile("/");
        p210v8.i.e(patternCompile, "compile(...)");
        String strReplaceAll = patternCompile.matcher(str).replaceAll("");
        p210v8.i.e(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    public final Boolean a() {
        f fVar = b().f15348b;
        if (fVar != null) {
            return fVar.a;
        }
        p210v8.i.n("sessionConfigs");
        throw null;
    }

    public final n b() {
        return (n) this.f15314c.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00b3 A[Catch: all -> 0x0051, TRY_LEAVE, TryCatch #0 {all -> 0x0051, blocks: (B:21:0x004d, B:42:0x00a7, B:44:0x00b3, B:47:0x00c0, B:35:0x0085, B:39:0x0095), top: B:58:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00c0 A[Catch: all -> 0x0051, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0051, blocks: (B:21:0x004d, B:42:0x00a7, B:44:0x00b3, B:47:0x00c0, B:35:0x0085, B:39:0x0095), top: B:58:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0152  */
    /* JADX WARN: Code duplicated, block: B:53:0x0156  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v14, types: [V9.a] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [int] */
    public final Object d(p123m8.d dVar) throws Throwable {
        a aVar;
        ?? r10;
        V9.a aVar2;
        d dVar2;
        String str;
        Object objW;
        ?? r11;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f15306w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f15306w = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, (p144o8.c) dVar);
            }
        } else {
            aVar = new a(this, (p144o8.c) dVar);
        }
        Object objA = aVar.f15304u;
        p134n8.a aVar3 = p134n8.a.f13404s;
        ?? r12 = aVar.f15306w;
        m mVar = m.a;
        try {
            if (r12 == 0) {
                J7.a.v(objA);
                V9.d dVar3 = this.f15315d;
                if (!dVar3.c() && !b().b()) {
                    return mVar;
                }
                aVar.f15302s = this;
                aVar.f15303t = dVar3;
                aVar.f15306w = 1;
                if (dVar3.d(aVar) != aVar3) {
                    aVar2 = dVar3;
                    dVar2 = this;
                }
                return aVar3;
            }
            if (r12 == 1) {
                aVar2 = aVar.f15303t;
                dVar2 = (d) aVar.f15302s;
                J7.a.v(objA);
            } else {
                if (r12 == 2) {
                    aVar2 = aVar.f15303t;
                    dVar2 = (d) aVar.f15302s;
                    J7.a.v(objA);
                    str = ((C0780q) objA).a;
                    if (str.equals("")) {
                        Log.w("SessionConfigFetcher", "Error getting Firebase Installation ID. Skipping this Session Event.");
                        ((V9.d) aVar2).e(null);
                        return mVar;
                    }
                    p076h8.f fVar = new p076h8.f("X-Crashlytics-Installation-ID", str);
                    String str2 = String.format("%s/%s", Arrays.copyOf(new Object[]{Build.MANUFACTURER, Build.MODEL}, 2));
                    dVar2.getClass();
                    p076h8.f fVar2 = new p076h8.f("X-Crashlytics-Device-Model", c(str2));
                    String str3 = Build.VERSION.INCREMENTAL;
                    p210v8.i.e(str3, "INCREMENTAL");
                    p076h8.f fVar3 = new p076h8.f("X-Crashlytics-OS-Build-Version", c(str3));
                    String str4 = Build.VERSION.RELEASE;
                    p210v8.i.e(str4, "RELEASE");
                    Map mapW = y.w(fVar, fVar2, fVar3, new p076h8.f("X-Crashlytics-OS-Display-Version", c(str4)), new p076h8.f("X-Crashlytics-API-Client-Version", "2.0.3"));
                    c cVar = dVar2.f15313b;
                    b bVar = new b(dVar2, null);
                    c cVar2 = new c(2, null);
                    aVar.f15302s = aVar2;
                    aVar.f15303t = null;
                    aVar.f15306w = 3;
                    objW = AbstractC0342z.w((i) cVar.f5671u, new e(cVar, mapW, bVar, cVar2, null), aVar);
                    if (objW != aVar3) {
                        objW = mVar;
                    }
                    if (objW != aVar3) {
                        r11 = aVar2;
                    }
                    return aVar3;
                }
                if (r12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r10 = (V9.a) aVar.f15302s;
                try {
                    J7.a.v(objA);
                    r11 = r10;
                } catch (Throwable th) {
                    th = th;
                    ((V9.d) r10).e(null);
                    throw th;
                }
            }
            ((V9.d) r11).e(null);
            return mVar;
            if (!dVar2.b().b()) {
                ((V9.d) aVar2).e(null);
                return mVar;
            }
            X x8 = C0780q.f14709c;
            p082i4.d dVar4 = dVar2.a;
            aVar.f15302s = dVar2;
            aVar.f15303t = aVar2;
            aVar.f15306w = 2;
            objA = x8.a(dVar4, aVar);
            if (objA != aVar3) {
                str = ((C0780q) objA).a;
                if (str.equals("")) {
                    Log.w("SessionConfigFetcher", "Error getting Firebase Installation ID. Skipping this Session Event.");
                    ((V9.d) aVar2).e(null);
                    return mVar;
                }
                p076h8.f fVar4 = new p076h8.f("X-Crashlytics-Installation-ID", str);
                String str5 = String.format("%s/%s", Arrays.copyOf(new Object[]{Build.MANUFACTURER, Build.MODEL}, 2));
                dVar2.getClass();
                p076h8.f fVar5 = new p076h8.f("X-Crashlytics-Device-Model", c(str5));
                String str6 = Build.VERSION.INCREMENTAL;
                p210v8.i.e(str6, "INCREMENTAL");
                p076h8.f fVar6 = new p076h8.f("X-Crashlytics-OS-Build-Version", c(str6));
                String str7 = Build.VERSION.RELEASE;
                p210v8.i.e(str7, "RELEASE");
                Map mapW2 = y.w(fVar4, fVar5, fVar6, new p076h8.f("X-Crashlytics-OS-Display-Version", c(str7)), new p076h8.f("X-Crashlytics-API-Client-Version", "2.0.3"));
                c cVar3 = dVar2.f15313b;
                b bVar2 = new b(dVar2, null);
                c cVar4 = new c(2, null);
                aVar.f15302s = aVar2;
                aVar.f15303t = null;
                aVar.f15306w = 3;
                objW = AbstractC0342z.w((i) cVar3.f5671u, new e(cVar3, mapW2, bVar2, cVar4, null), aVar);
                if (objW != aVar3) {
                    objW = mVar;
                }
                if (objW != aVar3) {
                    r11 = aVar2;
                    ((V9.d) r11).e(null);
                    return mVar;
                }
            }
            return aVar3;
        } catch (Throwable th2) {
            th = th2;
            r10 = r12;
        }
    }
}

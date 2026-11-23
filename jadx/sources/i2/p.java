package i2;

import android.content.Context;
import com.rollbar.notifier.sender.SyncSender;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile j f12193e;
    public final p169r2.a a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p169r2.a f12194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p128n2.d f12195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p138o2.h f12196d;

    public p(p169r2.a aVar, p169r2.a aVar2, p128n2.d dVar, p138o2.h hVar, p138o2.i iVar) {
        this.a = aVar;
        this.f12194b = aVar2;
        this.f12195c = dVar;
        this.f12196d = hVar;
        iVar.getClass();
        iVar.a.execute(new B6.d(iVar, 23));
    }

    public static p a() {
        j jVar = f12193e;
        if (jVar != null) {
            return (p) jVar.f12189y.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (f12193e == null) {
            synchronized (p.class) {
                try {
                    if (f12193e == null) {
                        E1.l lVar = new E1.l();
                        context.getClass();
                        lVar.f1318t = context;
                        f12193e = lVar.b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final o c(g2.a aVar) {
        Set setSingleton;
        byte[] bytes;
        if (aVar instanceof k) {
            aVar.getClass();
            setSingleton = Collections.unmodifiableSet(g2.a.f11526d);
        } else {
            setSingleton = Collections.singleton(new p051f2.c("proto"));
        }
        Y1.c cVarA = i.a();
        aVar.getClass();
        cVarA.f5670t = "cct";
        String str = aVar.a;
        String str2 = aVar.f11529b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = ("1$" + str + "\\" + str2).getBytes(Charset.forName(SyncSender.UTF_8));
        }
        cVarA.f5671u = bytes;
        return new o(setSingleton, cVarA.l(), this);
    }
}

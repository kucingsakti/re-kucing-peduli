package p247z9;

import A1.J;
import L9.f;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import p081i3.b;
import p200u8.a;

/* JADX INFO: loaded from: classes.dex */
public class l implements o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f16334d = f.h0(l.class.getCanonicalName(), "");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f16335e = new b("NO_LOCKS", a.f16318s);
    public final n a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f16336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f16337c;

    public l(String str) {
        this(str, new b(new ReentrantLock(), 26));
    }

    public static void e(AssertionError assertionError) {
        StackTraceElement[] stackTrace = assertionError.getStackTrace();
        int length = stackTrace.length;
        int i10 = 0;
        while (i10 < length) {
            if (!stackTrace[i10].getClassName().startsWith(f16334d)) {
                List listSubList = Arrays.asList(stackTrace).subList(i10, length);
                assertionError.setStackTrace((StackTraceElement[]) listSubList.toArray(new StackTraceElement[listSubList.size()]));
            }
            i10++;
        }
        i10 = -1;
        List listSubList2 = Arrays.asList(stackTrace).subList(i10, length);
        assertionError.setStackTrace((StackTraceElement[]) listSubList2.toArray(new StackTraceElement[listSubList2.size()]));
    }

    public final i a(a aVar) {
        return new i(this, aVar);
    }

    public final e b(p200u8.b bVar) {
        return new e(this, new ConcurrentHashMap(3, 1.0f, 2), bVar, 1);
    }

    public final j c(p200u8.b bVar) {
        return new j(this, new ConcurrentHashMap(3, 1.0f, 2), bVar);
    }

    public J d(Object obj, String str) {
        String str2;
        StringBuilder sb = new StringBuilder("Recursion detected ");
        sb.append(str);
        if (obj == null) {
            str2 = "";
        } else {
            str2 = "on input: " + obj;
        }
        sb.append(str2);
        sb.append(" under ");
        sb.append(this);
        AssertionError assertionError = new AssertionError(sb.toString());
        e(assertionError);
        throw assertionError;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(" (");
        return E0.a.l(sb, this.f16337c, ")");
    }

    public l(String str, n nVar) {
        a aVar = a.f16319t;
        this.a = nVar;
        this.f16336b = aVar;
        this.f16337c = str;
    }
}

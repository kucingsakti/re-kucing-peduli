package f7;

import J7.o;
import U7.g;
import com.tailoredapps.biometricauth.BiometricAuthenticationCancelledException;
import com.tailoredapps.biometricauth.BiometricAuthenticationException;
import d7.e;
import java.util.NoSuchElementException;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class d implements N7.d, N7.c {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final d f11439t = new d(0);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final d f11440u = new d(1);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final d f11441v = new d(2);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f11442s;

    public /* synthetic */ d(int i10) {
        this.f11442s = i10;
    }

    @Override // N7.d
    public boolean a(Object obj) {
        e eVar = (e) obj;
        i.f(eVar, "event");
        return (eVar instanceof d7.d) || (eVar instanceof d7.a);
    }

    @Override // N7.c
    public Object apply(Object obj) {
        switch (this.f11442s) {
            case 1:
                Throwable th = (Throwable) obj;
                i.f(th, "throwable");
                return th instanceof NoSuchElementException ? o.a(new BiometricAuthenticationCancelledException()) : o.a(th);
            default:
                e eVar = (e) obj;
                i.f(eVar, "event");
                if (!(eVar instanceof d7.d)) {
                    return eVar instanceof d7.a ? new U7.c(new BiometricAuthenticationException(((d7.a) eVar).f10549b), 1) : new U7.c(new BiometricAuthenticationException(""), 1);
                }
                p027c7.a aVar = ((d7.d) eVar).a;
                return aVar != null ? new g(aVar) : U7.d.f4912s;
        }
    }
}

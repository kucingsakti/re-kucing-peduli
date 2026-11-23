package p040e1;

import P0.d;
import java.lang.reflect.InvocationTargetException;
import oa.b;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import p181s3.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {
    public static final n a;

    static {
        n gVar;
        try {
            gVar = new d((WebViewProviderFactoryBoundaryInterface) b.a(WebViewProviderFactoryBoundaryInterface.class, a.g()), 25);
        } catch (ClassNotFoundException unused) {
            gVar = new g();
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (NoSuchMethodException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
        a = gVar;
    }
}

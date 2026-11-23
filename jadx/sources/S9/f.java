package S9;

import java.util.Arrays;
import java.util.Collection;
import java.util.ServiceConfigurationError;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static final Collection a;

    static {
        try {
            a = K9.n.B(K9.n.s(Arrays.asList(new O9.b()).iterator()));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}

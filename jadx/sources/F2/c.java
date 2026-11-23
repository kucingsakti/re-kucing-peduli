package F2;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Stack;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class c extends ThreadLocal {
    public final /* synthetic */ int a;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.a) {
            case 0:
                return 0L;
            case 1:
                return new WeakHashMap();
            case 2:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(Y9.c.f5824e);
                return simpleDateFormat;
            case 3:
                return new Stack();
            case 4:
                return Boolean.FALSE;
            default:
                return new Random();
        }
    }
}

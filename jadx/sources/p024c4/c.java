package p024c4;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import p004a4.e;
import p004a4.f;

/* JADX INFO: loaded from: classes.dex */
public final class c implements e {
    public static final SimpleDateFormat a;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        a = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    @Override // p004a4.a
    public final void a(Object obj, Object obj2) {
        ((f) obj2).c(a.format((Date) obj));
    }
}

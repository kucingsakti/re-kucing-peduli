package e2;

import L9.n;
import java.util.List;
import p076h8.f;
import p210v8.i;
import p210v8.k;

/* JADX INFO: loaded from: classes.dex */
public final class a extends k implements p200u8.b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final a f10700s = new a(1);

    @Override // p200u8.b
    public final Object invoke(Object obj) {
        List list = (List) obj;
        i.f(list, "it");
        String str = (String) ((f) list.get(0)).f11789s;
        f fVar = (f) list.get(1);
        String str2 = (String) fVar.f11789s;
        int iIntValue = ((Number) fVar.f11790t).intValue();
        if (n.D(str) && n.D(str2)) {
            return Integer.valueOf(iIntValue);
        }
        return null;
    }
}

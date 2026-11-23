package p044e6;

import V5.c;
import p123m8.d;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static /* synthetic */ Object processNotification$default(b bVar, c cVar, int i10, d dVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: processNotification");
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return bVar.processNotification(cVar, i10, dVar);
    }
}

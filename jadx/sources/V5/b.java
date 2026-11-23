package V5;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object listNotificationsForOutstanding$default(d dVar, List list, p123m8.d dVar2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listNotificationsForOutstanding");
        }
        if ((i10 & 1) != 0) {
            list = null;
        }
        return dVar.listNotificationsForOutstanding(list, dVar2);
    }

    public static /* synthetic */ Object markAsConsumed$default(d dVar, int i10, boolean z6, String str, boolean z10, p123m8.d dVar2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: markAsConsumed");
        }
        if ((i11 & 4) != 0) {
            str = null;
        }
        String str2 = str;
        if ((i11 & 8) != 0) {
            z10 = true;
        }
        return dVar.markAsConsumed(i10, z6, str2, z10, dVar2);
    }
}

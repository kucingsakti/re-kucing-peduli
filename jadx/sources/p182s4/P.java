package p182s4;

import C3.a;
import android.os.Message;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class P implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return a.d(Long.valueOf(((Message) obj).getWhen()), Long.valueOf(((Message) obj2).getWhen()));
    }
}

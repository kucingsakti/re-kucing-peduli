package androidx.recyclerview.widget;

import android.util.SparseArray;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class z {
    public SparseArray a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Set f7143c;

    public final y a(int i10) {
        SparseArray sparseArray = this.a;
        y yVar = (y) sparseArray.get(i10);
        if (yVar != null) {
            return yVar;
        }
        y yVar2 = new y();
        sparseArray.put(i10, yVar2);
        return yVar2;
    }
}

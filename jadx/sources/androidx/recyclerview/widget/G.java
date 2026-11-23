package androidx.recyclerview.widget;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class G {
    public int[] a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f6882b;

    public final void a() {
        int[] iArr = this.a;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.f6882b = null;
    }

    public final void b(int i10) {
        int[] iArr = this.a;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i10, 10) + 1];
            this.a = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i10 >= iArr.length) {
            int length = iArr.length;
            while (length <= i10) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.a = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = this.a;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public final void c(int i10, int i11) {
        int[] iArr = this.a;
        if (iArr == null || i10 >= iArr.length) {
            return;
        }
        int i12 = i10 + i11;
        b(i12);
        int[] iArr2 = this.a;
        System.arraycopy(iArr2, i10, iArr2, i12, (iArr2.length - i10) - i11);
        Arrays.fill(this.a, i10, i12, -1);
        ArrayList arrayList = this.f6882b;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) this.f6882b.get(size);
            int i13 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f7033s;
            if (i13 >= i10) {
                staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f7033s = i13 + i11;
            }
        }
    }

    public final void d(int i10, int i11) {
        int[] iArr = this.a;
        if (iArr == null || i10 >= iArr.length) {
            return;
        }
        int i12 = i10 + i11;
        b(i12);
        int[] iArr2 = this.a;
        System.arraycopy(iArr2, i12, iArr2, i10, (iArr2.length - i10) - i11);
        int[] iArr3 = this.a;
        Arrays.fill(iArr3, iArr3.length - i11, iArr3.length, -1);
        ArrayList arrayList = this.f6882b;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) this.f6882b.get(size);
            int i13 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f7033s;
            if (i13 >= i10) {
                if (i13 < i12) {
                    this.f6882b.remove(size);
                } else {
                    staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f7033s = i13 - i11;
                }
            }
        }
    }
}

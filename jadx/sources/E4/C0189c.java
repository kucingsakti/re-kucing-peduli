package E4;

import com.kcstream.cing.activity.Browser2Activity;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: E4.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0189c extends p013b1.e {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f1401m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final HashMap f1402n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Browser2Activity f1403o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0189c(Browser2Activity browser2Activity, Browser2Activity browser2Activity2, ArrayList arrayList) {
        super(browser2Activity2);
        p210v8.i.f(arrayList, "urls");
        this.f1403o = browser2Activity;
        this.f1401m = arrayList;
        this.f1402n = new HashMap();
    }

    @Override // androidx.recyclerview.widget.s
    public final int a() {
        return this.f1401m.size();
    }
}

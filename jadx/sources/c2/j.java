package c2;

import android.app.ActivityManager;
import android.os.StatFs;

/* JADX INFO: loaded from: classes.dex */
public final class j extends p210v8.k implements p200u8.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f7450s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ o1.c f7451t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(o1.c cVar, int i10) {
        super(0);
        this.f7450s = i10;
        this.f7451t = cVar;
    }

    @Override // p200u8.a
    public final Object invoke() {
        switch (this.f7450s) {
            case 0:
                return Long.valueOf(((StatFs) this.f7451t.f13624u).getTotalBytes());
            default:
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                ((ActivityManager) this.f7451t.f13623t).getMemoryInfo(memoryInfo);
                return Long.valueOf(memoryInfo.totalMem);
        }
    }
}

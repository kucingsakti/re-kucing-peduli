package y0;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class s extends p210v8.k implements p200u8.b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f15962s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Bundle f15963t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(int i10, Bundle bundle) {
        super(1);
        this.f15962s = i10;
        this.f15963t = bundle;
    }

    @Override // p200u8.b
    public final Object invoke(Object obj) {
        switch (this.f15962s) {
            case 0:
                String str = (String) obj;
                p210v8.i.f(str, "argName");
                return Boolean.valueOf(!this.f15963t.containsKey(str));
            default:
                String str2 = (String) obj;
                p210v8.i.f(str2, "key");
                return Boolean.valueOf(!this.f15963t.containsKey(str2));
        }
    }
}

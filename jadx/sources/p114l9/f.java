package p114l9;

import A9.AbstractC0151y;
import O8.U;
import p200u8.b;
import p210v8.i;
import p210v8.k;

/* JADX INFO: loaded from: classes.dex */
public final class f extends k implements b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final f f12977t = new f(1, 0);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final f f12978u = new f(1, 1);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final f f12979v = new f(1, 2);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final f f12980w = new f(1, 3);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f12981s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i10, int i11) {
        super(i10);
        this.f12981s = i11;
    }

    @Override // p200u8.b
    public final Object invoke(Object obj) {
        switch (this.f12981s) {
            case 0:
                return "";
            case 1:
                AbstractC0151y abstractC0151y = (AbstractC0151y) obj;
                i.f(abstractC0151y, "it");
                return abstractC0151y;
            case 2:
                i.f((U) obj, "it");
                return "...";
            default:
                AbstractC0151y abstractC0151y2 = (AbstractC0151y) obj;
                i.f(abstractC0151y2, "it");
                return abstractC0151y2;
        }
    }
}

package y0;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import com.kcstream.cing.R;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: y0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0864b extends p210v8.k implements p200u8.b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f15911s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C0864b f15904t = new C0864b(1, 0);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final C0864b f15905u = new C0864b(1, 1);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final C0864b f15906v = new C0864b(1, 2);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final C0864b f15907w = new C0864b(1, 3);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final C0864b f15908x = new C0864b(1, 4);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final C0864b f15909y = new C0864b(1, 5);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final C0864b f15910z = new C0864b(1, 6);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final C0864b f15900A = new C0864b(1, 7);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final C0864b f15901B = new C0864b(1, 8);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final C0864b f15902C = new C0864b(1, 9);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final C0864b f15903D = new C0864b(1, 10);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0864b(int i10, int i11) {
        super(i10);
        this.f15911s = i11;
    }

    @Override // p200u8.b
    public final Object invoke(Object obj) {
        switch (this.f15911s) {
            case 0:
                Context context = (Context) obj;
                p210v8.i.f(context, "it");
                if (context instanceof ContextWrapper) {
                    return ((ContextWrapper) context).getBaseContext();
                }
                return null;
            case 1:
                Context context2 = (Context) obj;
                p210v8.i.f(context2, "it");
                if (context2 instanceof ContextWrapper) {
                    return ((ContextWrapper) context2).getBaseContext();
                }
                return null;
            case 2:
                x xVar = (x) obj;
                p210v8.i.f(xVar, "destination");
                z zVar = xVar.f15996t;
                if (zVar == null || zVar.f16008D != xVar.f16002z) {
                    return null;
                }
                return zVar;
            case 3:
                x xVar2 = (x) obj;
                p210v8.i.f(xVar2, "destination");
                z zVar2 = xVar2.f15996t;
                if (zVar2 == null || zVar2.f16008D != xVar2.f16002z) {
                    return null;
                }
                return zVar2;
            case 4:
                x xVar3 = (x) obj;
                p210v8.i.f(xVar3, "it");
                return Integer.valueOf(xVar3.f16002z);
            case 5:
                Context context3 = (Context) obj;
                p210v8.i.f(context3, "it");
                ContextWrapper contextWrapper = context3 instanceof ContextWrapper ? (ContextWrapper) context3 : null;
                if (contextWrapper != null) {
                    return contextWrapper.getBaseContext();
                }
                return null;
            case 6:
                Context context4 = (Context) obj;
                p210v8.i.f(context4, "it");
                if (context4 instanceof Activity) {
                    return (Activity) context4;
                }
                return null;
            case 7:
                x xVar4 = (x) obj;
                p210v8.i.f(xVar4, "it");
                return xVar4.f15996t;
            case 8:
                x xVar5 = (x) obj;
                p210v8.i.f(xVar5, "it");
                if (!(xVar5 instanceof z)) {
                    return null;
                }
                z zVar3 = (z) xVar5;
                return zVar3.o(zVar3.f16008D, zVar3, null, false);
            case 9:
                View view = (View) obj;
                p210v8.i.f(view, "it");
                Object parent = view.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            default:
                View view2 = (View) obj;
                p210v8.i.f(view2, "it");
                Object tag = view2.getTag(R.id.nav_controller_view_tag);
                if (tag instanceof WeakReference) {
                    return (B) ((WeakReference) tag).get();
                }
                if (tag instanceof B) {
                    return (B) tag;
                }
                return null;
        }
    }
}

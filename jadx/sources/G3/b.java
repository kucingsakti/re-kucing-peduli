package G3;

import A3.AbstractC0119q;
import A3.F;
import C8.E;
import J7.j;
import com.google.android.gms.measurement.internal.zzis;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final F a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC0119q f1691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AbstractC0119q f1692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AbstractC0119q f1693d;

    static {
        int i10 = F.f227t;
        Object[] objArr = new Object[15];
        objArr[0] = "_in";
        objArr[1] = "_xa";
        objArr[2] = "_xu";
        objArr[3] = "_aq";
        objArr[4] = "_aa";
        objArr[5] = "_ai";
        System.arraycopy(new String[]{"_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"}, 0, objArr, 6, 9);
        a = F.q(15, 15, objArr);
        int i11 = AbstractC0119q.f279t;
        Object[] objArr2 = {"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"};
        j.c(7, objArr2);
        f1691b = AbstractC0119q.o(7, objArr2);
        Object[] objArr3 = {"auto", "app", "am"};
        j.c(3, objArr3);
        f1692c = AbstractC0119q.o(3, objArr3);
        Object[] objArr4 = {"_r", "_dbg"};
        j.c(2, objArr4);
        f1693d = AbstractC0119q.o(2, objArr4);
        String[] strArr = zzis.a;
        j.c(15, strArr);
        Object[] objArrCopyOf = Arrays.copyOf(new Object[4], E.k(4, 15));
        System.arraycopy(strArr, 0, objArrCopyOf, 0, 15);
        String[] strArr2 = zzis.f9182b;
        j.c(15, strArr2);
        if (objArrCopyOf.length < 30) {
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, E.k(objArrCopyOf.length, 30));
        }
        System.arraycopy(strArr2, 0, objArrCopyOf, 15, 15);
        AbstractC0119q.o(30, objArrCopyOf);
        Object[] objArr5 = {"^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$"};
        j.c(2, objArr5);
        AbstractC0119q.o(2, objArr5);
    }
}

package p188t1;

import java.util.concurrent.CountDownLatch;
import p086i8.C;
import p140o4.r;

/* JADX INFO: loaded from: classes.dex */
public final class g0 {
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15037c;

    static {
        C.a(C.c("016CB0DB05ECC18E82"));
        C.a(C.c("0D67B0C00BC1D7AA"));
        C.a(C.c("066BBACE0FF7D5B58F791B3EC8"));
    }

    public g0(r rVar) throws InterruptedException {
        this.a = rVar.a();
        this.f15036b = rVar.c();
        if (((String) rVar.f13782t) == null) {
            ((CountDownLatch) rVar.f13784v).await();
        }
        this.f15037c = (String) rVar.f13782t;
    }
}

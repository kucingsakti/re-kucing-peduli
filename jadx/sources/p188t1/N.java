package p188t1;

import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.kcstream.cing.MainApp;
import java.util.UUID;
import p086i8.C;

/* JADX INFO: loaded from: classes.dex */
public final class N extends C0857u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f14987e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0849l f14988f;

    static {
        AbstractC0487g.r("096CA7DD0BEBC6A2AF73", "066EB5CE19");
    }

    public N(MainApp mainApp) {
        super(mainApp);
        if (g(C.a(C.c("096CA7DD0BEBC6A2AF73")))) {
            this.f14987e = e(C.a(C.c("096CA7DD0BEBC6A2AF73")));
        } else {
            String string = UUID.randomUUID().toString();
            this.f14987e = string;
            f(C.a(C.c("096CA7DD0BEBC6A2AF73")), string);
        }
        this.f14988f = new C0849l(mainApp);
    }
}

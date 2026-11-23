package p111l6;

import com.onesignal.common.modeling.l;
import com.onesignal.common.modeling.m;
import p093j5.b;
import p210v8.i;
import p210v8.k;

/* JADX INFO: loaded from: classes.dex */
public class d extends m {

    public static final class a extends k implements p200u8.a {
        public static final a INSTANCE = new a();

        public a() {
            super(0);
        }

        @Override // p200u8.a
        public final c invoke() {
            return new c();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar) {
        super(new l(a.INSTANCE, "session", bVar));
        i.f(bVar, "prefs");
    }
}

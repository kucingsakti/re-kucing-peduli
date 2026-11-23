package p053f4;

import D3.c;
import P2.f;
import Q.n;
import android.content.Context;
import android.os.Build;
import com.google.android.gms.tasks.Tasks;
import java.util.Set;
import java.util.concurrent.Executor;
import p073h4.b;

/* JADX INFO: loaded from: classes.dex */
public final class d implements f, g {
    public final c a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f11433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f11434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f11435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f11436e;

    public d(Context context, String str, Set set, b bVar, Executor executor) {
        this.a = new c(context, str);
        this.f11435d = set;
        this.f11436e = executor;
        this.f11434c = bVar;
        this.f11433b = context;
    }

    public final synchronized int a() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        h hVar = (h) this.a.get();
        if (!hVar.i(jCurrentTimeMillis)) {
            return 1;
        }
        hVar.g();
        return 3;
    }

    public final f b() {
        if (Build.VERSION.SDK_INT >= 24 ? n.a(this.f11433b) : true) {
            return Tasks.c(this.f11436e, new c(this, 0));
        }
        return Tasks.e("");
    }

    public final void c() {
        if (this.f11435d.size() <= 0) {
            Tasks.e(null);
            return;
        }
        if (Build.VERSION.SDK_INT >= 24 ? n.a(this.f11433b) : true) {
            Tasks.c(this.f11436e, new c(this, 1));
        } else {
            Tasks.e(null);
        }
    }
}

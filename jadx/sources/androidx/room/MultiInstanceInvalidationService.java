package androidx.room;

import K0.j;
import K0.k;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/room/MultiInstanceInvalidationService;", "Landroid/app/Service;", "<init>", "()V", "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class MultiInstanceInvalidationService extends Service {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f7144s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final LinkedHashMap f7145t = new LinkedHashMap();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final k f7146u = new k(this);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final j f7147v = new j(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        i.f(intent, "intent");
        return this.f7147v;
    }
}

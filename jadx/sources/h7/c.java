package h7;

import android.content.Context;
import kotlin.TypeCastException;
import o1.k;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final Context a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p185s7.a f11759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p163q7.f f11760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f11761d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k f11762e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final N4.e f11763f;

    public c(Context context, p185s7.a aVar, p163q7.f fVar, d dVar, k kVar, N4.e eVar) {
        this.a = context;
        this.f11759b = aVar;
        this.f11760c = fVar;
        this.f11761d = dVar;
        this.f11762e = kVar;
        this.f11763f = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!c.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tonyodev.fetch2.FetchConfiguration");
        }
        c cVar = (c) obj;
        return i.a(this.a, cVar.a) && this.f11759b.equals(cVar.f11759b) && i.a(this.f11760c, cVar.f11760c) && i.a(this.f11761d, cVar.f11761d) && this.f11762e.equals(cVar.f11762e) && this.f11763f.equals(cVar.f11763f);
    }

    public final int hashCode() {
        Long l4 = 400L;
        int iHashCode = (l4.hashCode() + (((((this.a.hashCode() * 31) - 1521653773) * 31) + 999) * 31)) * 31;
        Boolean bool = Boolean.FALSE;
        int iHashCode2 = (this.f11760c.hashCode() + ((p239z.e.d(1) + ((this.f11759b.hashCode() + ((bool.hashCode() + iHashCode) * 31)) * 31)) * 31)) * 31;
        Boolean bool2 = Boolean.TRUE;
        int iD = (p239z.e.d(1) + ((this.f11763f.hashCode() + ((this.f11762e.hashCode() + ((bool2.hashCode() + ((bool.hashCode() + ((this.f11761d.hashCode() + ((bool2.hashCode() + ((bool2.hashCode() + iHashCode2) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        Long l10 = 150L;
        int iHashCode3 = (bool2.hashCode() + ((l10.hashCode() + iD) * 31)) * 31;
        Integer num = 2;
        return bool2.hashCode() + ((num.hashCode() + iHashCode3) * 31);
    }

    public final String toString() {
        return "FetchConfiguration(appContext=" + this.a + ", namespace='LibGlobalFetchLib', concurrentLimit=999, progressReportingIntervalMillis=400, loggingEnabled=false, httpDownloader=" + this.f11759b + ", globalNetworkType=GLOBAL_OFF, logger=" + this.f11760c + ", autoStart=true, retryOnNetworkGain=true, fileServerDownloader=" + this.f11761d + ", hashCheckingEnabled=false, fileExistChecksEnabled=true, storageResolver=" + this.f11762e + ", fetchNotificationManager=" + this.f11763f + ", fetchDatabaseManager=null, backgroundHandler=null, prioritySort=ASC, internetCheckUrl=null, activeDownloadsCheckInterval=150, createFileOnEnqueue=true, preAllocateFileOnCreation=true, maxAutoRetryAttempts=2, fetchHandler=null)";
    }
}

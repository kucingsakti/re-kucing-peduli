package p078i;

import android.app.job.JobInfo;
import android.net.Uri;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class w {
    public static /* synthetic */ JobInfo.TriggerContentUri a(Uri uri, int i10) {
        return new JobInfo.TriggerContentUri(uri, i10);
    }

    public static /* bridge */ /* synthetic */ Class c() {
        return CompletableFuture.class;
    }

    public static /* synthetic */ void g() {
    }

    public static /* bridge */ /* synthetic */ Class q() {
        return Optional.class;
    }
}

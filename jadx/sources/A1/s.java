package A1;

import java.io.File;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class s implements U1.g {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile Object f168s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f169t;

    public /* synthetic */ s(Object obj) {
        this.f169t = obj;
    }

    public C1.a a() {
        if (((C1.a) this.f168s) == null) {
            synchronized (this) {
                try {
                    if (((C1.a) this.f168s) == null) {
                        File cacheDir = ((C1.e) ((p040e1.j) this.f169t).f10697t).f930s.getCacheDir();
                        C1.d dVar = null;
                        File file = cacheDir == null ? null : new File(cacheDir, "image_manager_disk_cache");
                        if (file != null && (file.isDirectory() || file.mkdirs())) {
                            dVar = new C1.d(file);
                        }
                        this.f168s = dVar;
                    }
                    if (((C1.a) this.f168s) == null) {
                        this.f168s = new p230x9.d(2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (C1.a) this.f168s;
    }

    @Override // U1.g
    public Object get() {
        if (this.f168s == null) {
            synchronized (this) {
                try {
                    if (this.f168s == null) {
                        Object obj = ((U1.g) this.f169t).get();
                        U1.f.c(obj, "Argument must not be null");
                        this.f168s = obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f168s;
    }

    public s() {
        this.f169t = new CopyOnWriteArraySet();
    }
}

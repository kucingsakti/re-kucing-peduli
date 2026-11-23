package Q0;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final HashMap f3936e = new HashMap();
    public final boolean a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f3937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lock f3938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public FileChannel f3939d;

    public a(String str, File file, boolean z6) {
        Lock lock;
        this.a = z6;
        File file2 = new File(file, str.concat(".lck"));
        this.f3937b = file2;
        String absolutePath = file2.getAbsolutePath();
        i.e(absolutePath, "lockFile.absolutePath");
        HashMap map = f3936e;
        synchronized (map) {
            try {
                Object reentrantLock = map.get(absolutePath);
                if (reentrantLock == null) {
                    reentrantLock = new ReentrantLock();
                    map.put(absolutePath, reentrantLock);
                }
                lock = (Lock) reentrantLock;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f3938c = lock;
    }

    public final void a(boolean z6) {
        this.f3938c.lock();
        if (z6) {
            File file = this.f3937b;
            try {
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(file).getChannel();
                channel.lock();
                this.f3939d = channel;
            } catch (IOException e10) {
                this.f3939d = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e10);
            }
        }
    }

    public final void b() {
        try {
            FileChannel fileChannel = this.f3939d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f3938c.unlock();
    }
}

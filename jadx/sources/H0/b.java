package H0;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final Executor a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f1818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f1819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f1820d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f1821e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1822f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c[] f1823g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f1824h;

    public b(AssetManager assetManager, Executor executor, d dVar, String str, File file) {
        this.a = executor;
        this.f1818b = dVar;
        this.f1821e = str;
        this.f1820d = file;
        int i10 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i10 >= 24) {
            if (i10 < 31) {
                switch (i10) {
                    case 24:
                    case 25:
                        bArr = e.f1839h;
                        break;
                    case 26:
                        bArr = e.f1838g;
                        break;
                    case 27:
                        bArr = e.f1837f;
                        break;
                    case 28:
                    case 29:
                    case 30:
                        bArr = e.f1836e;
                        break;
                }
            } else {
                bArr = e.f1835d;
            }
        }
        this.f1819c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e10) {
            String message = e10.getMessage();
            if (message == null) {
                return null;
            }
            message.contains("compressed");
            return null;
        }
    }

    public final void b(final int i10, final Serializable serializable) {
        this.a.execute(new Runnable() { // from class: H0.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f1815s.f1818b.d(i10, serializable);
            }
        });
    }
}

package s8;

import java.io.File;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public final File a;

    public f(File file) {
        i.f(file, "root");
        this.a = file;
    }

    public abstract File a();
}

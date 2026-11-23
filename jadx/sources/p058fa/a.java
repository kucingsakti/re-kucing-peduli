package p058fa;

import java.io.File;
import java.io.IOException;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final a a = new a();

    public final void a(File file) throws IOException {
        i.f(file, "file");
        if (!file.delete() && file.exists()) {
            throw new IOException(i.k(file, "failed to delete "));
        }
    }

    public final void b(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            throw new IOException(i.k(file, "not a readable directory: "));
        }
        int length = fileArrListFiles.length;
        int i10 = 0;
        while (i10 < length) {
            File file2 = fileArrListFiles[i10];
            i10++;
            if (file2.isDirectory()) {
                b(file2);
            }
            if (!file2.delete()) {
                throw new IOException(i.k(file2, "failed to delete "));
            }
        }
    }

    public final boolean c(File file) {
        i.f(file, "file");
        return file.exists();
    }

    public final void d(File file, File file2) throws IOException {
        i.f(file, "from");
        i.f(file2, "to");
        a(file2);
        if (file.renameTo(file2)) {
            return;
        }
        throw new IOException("failed to rename " + file + " to " + file2);
    }

    public final String toString() {
        return "FileSystem.SYSTEM";
    }
}

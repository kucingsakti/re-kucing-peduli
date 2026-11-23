package H0;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class i {
    public final int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f1845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f1846d;

    public i(int i10, int i11, long j, long j10) {
        this.a = i10;
        this.f1844b = i11;
        this.f1845c = j;
        this.f1846d = j10;
    }

    public static i a(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            i iVar = new i(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return iVar;
        } catch (Throwable th) {
            try {
                dataInputStream.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public final void b(File file) throws IOException {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.a);
            dataOutputStream.writeInt(this.f1844b);
            dataOutputStream.writeLong(this.f1845c);
            dataOutputStream.writeLong(this.f1846d);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof i)) {
            i iVar = (i) obj;
            if (this.f1844b == iVar.f1844b && this.f1845c == iVar.f1845c && this.a == iVar.a && this.f1846d == iVar.f1846d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f1844b), Long.valueOf(this.f1845c), Integer.valueOf(this.a), Long.valueOf(this.f1846d));
    }
}

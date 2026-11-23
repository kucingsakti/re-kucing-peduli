package P3;

import com.rollbar.notifier.sender.SyncSender;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class l implements c {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Charset f3890u = Charset.forName(SyncSender.UTF_8);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final File f3891s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public k f3892t;

    public l(File file) {
        this.f3891s = file;
    }

    @Override // P3.c
    public final void a() {
        O3.g.c(this.f3892t);
        this.f3892t = null;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000a  */
    @Override // P3.c
    public final String h() {
        A1.l lVar;
        byte[] bArr;
        File file = this.f3891s;
        if (file.exists()) {
            if (this.f3892t == null) {
                try {
                    this.f3892t = new k(file);
                } catch (IOException unused) {
                    Objects.toString(file);
                }
            }
            k kVar = this.f3892t;
            if (kVar == null) {
                lVar = null;
            } else {
                int[] iArr = {0};
                byte[] bArr2 = new byte[kVar.p()];
                try {
                    this.f3892t.g(new e(bArr2, iArr));
                } catch (IOException unused2) {
                }
                lVar = new A1.l(bArr2, iArr[0]);
            }
        } else {
            lVar = null;
        }
        if (lVar == null) {
            bArr = null;
        } else {
            int i10 = lVar.f122s;
            bArr = new byte[i10];
            System.arraycopy((byte[]) lVar.f123t, 0, bArr, 0, i10);
        }
        if (bArr != null) {
            return new String(bArr, f3890u);
        }
        return null;
    }

    @Override // P3.c
    public final void m(String str, long j) {
        File file = this.f3891s;
        if (this.f3892t == null) {
            try {
                this.f3892t = new k(file);
            } catch (IOException unused) {
                Objects.toString(file);
            }
        }
        if (this.f3892t == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            if (str.length() > 16384) {
                str = "..." + str.substring(str.length() - 16384);
            }
            this.f3892t.a(String.format(Locale.US, "%d %s%n", Long.valueOf(j), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(f3890u));
            while (!this.f3892t.h() && this.f3892t.p() > 65536) {
                this.f3892t.l();
            }
        } catch (IOException unused2) {
        }
    }
}

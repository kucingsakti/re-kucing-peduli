package E1;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: classes.dex */
public final class B implements s, p232y1.b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final B f1291t = new B(0);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f1292s;

    public /* synthetic */ B(int i10) {
        this.f1292s = i10;
    }

    public static ByteArrayInputStream b(String str) {
        if (!str.startsWith("data:image")) {
            throw new IllegalArgumentException("Not a valid image data URL.");
        }
        int iIndexOf = str.indexOf(44);
        if (iIndexOf == -1) {
            throw new IllegalArgumentException("Missing comma in data URL.");
        }
        if (str.substring(0, iIndexOf).endsWith(";base64")) {
            return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
        }
        throw new IllegalArgumentException("Not a base64 image data URL.");
    }

    @Override // E1.s
    public r D(x xVar) {
        switch (this.f1292s) {
            case 0:
                return C.f1293b;
            case 2:
                return new C0181c(new B(1), 0);
            case 4:
                return new C0181c(new B(3), 0);
            case 6:
                return new C(1);
            case 11:
                return new A(xVar.b(Uri.class, AssetFileDescriptor.class), 0);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return new A(xVar.b(Uri.class, ParcelFileDescriptor.class), 0);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return new A(xVar.b(Uri.class, InputStream.class), 0);
            default:
                return new H(xVar.b(C0185g.class, InputStream.class));
        }
    }

    @Override // p232y1.b
    public boolean a(Object obj, File file, p232y1.h hVar) throws Throwable {
        try {
            U1.b.d((ByteBuffer) obj, file);
            return true;
        } catch (IOException unused) {
            Log.isLoggable("ByteBufferEncoder", 3);
            return false;
        }
    }

    public Class c() {
        switch (this.f1292s) {
            case 1:
                return ByteBuffer.class;
            case 3:
                return InputStream.class;
            case 8:
                return ParcelFileDescriptor.class;
            default:
                return InputStream.class;
        }
    }
}

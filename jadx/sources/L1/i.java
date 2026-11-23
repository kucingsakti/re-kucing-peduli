package L1;

import A1.F;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import p188t1.Y;
import p232y1.j;

/* JADX INFO: loaded from: classes.dex */
public final class i implements j {
    public final ArrayList a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f2773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B1.g f2774c;

    public i(ArrayList arrayList, a aVar, B1.g gVar) {
        this.a = arrayList;
        this.f2773b = aVar;
        this.f2774c = gVar;
    }

    @Override // p232y1.j
    public final F a(Object obj, int i10, int i11, p232y1.h hVar) {
        byte[] byteArray;
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i12 = inputStream.read(bArr);
                if (i12 == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i12);
            }
            byteArrayOutputStream.flush();
            byteArray = byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e10);
            }
            byteArray = null;
        }
        if (byteArray == null) {
            return null;
        }
        return this.f2773b.a(ByteBuffer.wrap(byteArray), i10, i11, hVar);
    }

    @Override // p232y1.j
    public final boolean b(Object obj, p232y1.h hVar) {
        return !((Boolean) hVar.c(h.f2772b)).booleanValue() && Y.n(this.a, (InputStream) obj, this.f2774c) == ImageHeaderParser$ImageType.GIF;
    }
}

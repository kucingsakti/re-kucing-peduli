package p232y1;

import B1.g;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public interface d {
    ImageHeaderParser$ImageType a(ByteBuffer byteBuffer);

    int b(ByteBuffer byteBuffer, g gVar);

    int c(InputStream inputStream, g gVar);

    ImageHeaderParser$ImageType d(InputStream inputStream);
}

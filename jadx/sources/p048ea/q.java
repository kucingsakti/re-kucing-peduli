package p048ea;

import androidx.datastore.preferences.protobuf.AbstractC0487g;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {
    public static int a(int i10, int i11, int i12) throws IOException {
        if ((i11 & 8) != 0) {
            i10--;
        }
        if (i12 <= i10) {
            return i10 - i12;
        }
        throw new IOException(AbstractC0487g.h("PROTOCOL_ERROR padding ", i12, " > remaining length ", i10));
    }
}

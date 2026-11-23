package O3;

import Q3.F;
import Q3.r0;
import java.io.File;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements Comparator {
    public final /* synthetic */ int a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            case 1:
                return ((F) ((r0) obj)).a.compareTo(((F) ((r0) obj2)).a);
            case 2:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i10 = 0; i10 < bArr.length; i10++) {
                    byte b3 = bArr[i10];
                    byte b7 = bArr2[i10];
                    if (b3 != b7) {
                        return b3 - b7;
                    }
                }
                return 0;
            case 3:
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            default:
                String name = ((File) obj).getName();
                int i11 = T3.a.f4650f;
                return name.substring(0, i11).compareTo(((File) obj2).getName().substring(0, i11));
        }
    }
}

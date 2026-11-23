package H1;

import A1.C0099h;
import A1.F;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class f implements p232y1.j {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f1868b;

    public /* synthetic */ f(o oVar, int i10) {
        this.a = i10;
        this.f1868b = oVar;
    }

    @Override // p232y1.j
    public final F a(Object obj, int i10, int i11, p232y1.h hVar) {
        switch (this.a) {
            case 0:
                o oVar = this.f1868b;
                return oVar.a(new C0099h((ByteBuffer) obj, oVar.f1889d, oVar.f1888c, 5), i10, i11, hVar, o.f1885k);
            default:
                o oVar2 = this.f1868b;
                return oVar2.a(new C0099h((ParcelFileDescriptor) obj, oVar2.f1889d, oVar2.f1888c), i10, i11, hVar, o.f1885k);
        }
    }

    @Override // p232y1.j
    public final boolean b(Object obj, p232y1.h hVar) {
        switch (this.a) {
            case 0:
                this.f1868b.getClass();
                return true;
            default:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
                String str = Build.MANUFACTURER;
                return (!("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912) && !"robolectric".equals(Build.FINGERPRINT);
        }
    }
}

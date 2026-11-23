package M2;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzfw;
import com.google.android.gms.measurement.internal.zzhj;
import com.google.android.gms.measurement.internal.zznc;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class q0 implements InterfaceC0310t, t0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ zznc f3068s;

    public /* synthetic */ q0(zznc zzncVar) {
        this.f3068s = zzncVar;
    }

    @Override // M2.t0
    public void a(String str, String str2, Bundle bundle) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        zznc zzncVar = this.f3068s;
        if (!zIsEmpty) {
            zzncVar.l().f1(new RunnableC0315y(this, str, str2, bundle));
            return;
        }
        zzhj zzhjVar = zzncVar.f9283D;
        if (zzhjVar != null) {
            zzfw zzfwVar = zzhjVar.f9115A;
            zzhj.g(zzfwVar);
            zzfwVar.f9056x.a(str2, "AppId not known when logging event");
        }
    }

    @Override // M2.InterfaceC0310t
    public void m(String str, int i10, IOException iOException, byte[] bArr, Map map) {
        this.f3068s.x(str, i10, iOException, bArr, map);
    }
}

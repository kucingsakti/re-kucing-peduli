package p090j2;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.gms.internal.measurement.S;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    public final S a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f12368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f12369c;

    public f(Context context, d dVar) {
        S s9 = new S(context, 15);
        this.f12369c = new HashMap();
        this.a = s9;
        this.f12368b = dVar;
    }

    public final synchronized g a(String str) {
        if (this.f12369c.containsKey(str)) {
            return (g) this.f12369c.get(str);
        }
        CctBackendFactory cctBackendFactoryP = this.a.p(str);
        if (cctBackendFactoryP == null) {
            return null;
        }
        d dVar = this.f12368b;
        g gVarCreate = cctBackendFactoryP.create(new b(dVar.a, dVar.f12364b, dVar.f12365c, str));
        this.f12369c.put(str, gVarCreate);
        return gVarCreate;
    }
}

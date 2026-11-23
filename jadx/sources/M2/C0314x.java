package M2;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzb;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.measurement.internal.zzgt;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: M2.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0314x extends J0.M {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ zzgt f3160h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0314x(zzgt zzgtVar) {
        super(20);
        this.f3160h = zzgtVar;
    }

    @Override // J0.M
    public final Object c(Object obj) {
        zzfi.zzd zzdVar;
        String str = (String) obj;
        Preconditions.e(str);
        zzgt zzgtVar = this.f3160h;
        zzgtVar.a1();
        Preconditions.e(str);
        if (TextUtils.isEmpty(str) || (zzdVar = (zzfi.zzd) zzgtVar.f9095z.get(str)) == null || zzdVar.z() == 0) {
            return null;
        }
        if (!zzgtVar.f9095z.containsKey(str) || zzgtVar.f9095z.get(str) == null) {
            zzgtVar.u1(str);
        } else {
            zzgtVar.j1(str, (zzfi.zzd) zzgtVar.f9095z.get(str));
        }
        C0314x c0314x = zzgtVar.f9086B;
        c0314x.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (((K3.d) c0314x.f2260g)) {
            Set<Map.Entry> setEntrySet = ((p019b9.o) c0314x.f2259f).a.entrySet();
            p210v8.i.e(setEntrySet, "map.entries");
            for (Map.Entry entry : setEntrySet) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return (zzb) linkedHashMap.get(str);
    }
}

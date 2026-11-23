package p070h0;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.protobuf.AbstractC0502w;
import androidx.datastore.preferences.protobuf.C0491k;
import androidx.datastore.preferences.protobuf.InterfaceC0504y;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import com.unity3d.ads.metadata.MediationMetaData;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import kotlin.NoWhenBranchMatchedException;
import p039e0.m;
import p060g0.c;
import p060g0.e;
import p060g0.f;
import p060g0.g;
import p060g0.h;
import p086i8.k;
import p086i8.y;

/* JADX INFO: loaded from: classes.dex */
public final class i {
    public static final i a = new i();

    public final b a(FileInputStream fileInputStream) throws CorruptionException {
        try {
            e eVarL = e.l(fileInputStream);
            b bVar = new b(false);
            f[] fVarArr = (f[]) Arrays.copyOf(new f[0], 0);
            p210v8.i.f(fVarArr, "pairs");
            if (bVar.f11635b.get()) {
                throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
            }
            if (fVarArr.length > 0) {
                f fVar = fVarArr[0];
                throw null;
            }
            Map mapJ = eVarL.j();
            p210v8.i.e(mapJ, "preferencesProto.preferencesMap");
            for (Map.Entry entry : mapJ.entrySet()) {
                String str = (String) entry.getKey();
                p060g0.i iVar = (p060g0.i) entry.getValue();
                p210v8.i.e(str, MediationMetaData.KEY_NAME);
                p210v8.i.e(iVar, "value");
                int iX = iVar.x();
                switch (iX == 0 ? -1 : h.a[p239z.e.d(iX)]) {
                    case -1:
                        throw new CorruptionException("Value case is null.", null);
                    case 0:
                    default:
                        throw new NoWhenBranchMatchedException();
                    case 1:
                        bVar.b(new e(str), Boolean.valueOf(iVar.p()));
                        break;
                    case 2:
                        bVar.b(new e(str), Float.valueOf(iVar.s()));
                        break;
                    case 3:
                        bVar.b(new e(str), Double.valueOf(iVar.r()));
                        break;
                    case 4:
                        bVar.b(new e(str), Integer.valueOf(iVar.t()));
                        break;
                    case 5:
                        bVar.b(new e(str), Long.valueOf(iVar.u()));
                        break;
                    case 6:
                        e eVar = new e(str);
                        String strV = iVar.v();
                        p210v8.i.e(strV, "value.string");
                        bVar.b(eVar, strV);
                        break;
                    case 7:
                        e eVar2 = new e(str);
                        InterfaceC0504y interfaceC0504yK = iVar.w().k();
                        p210v8.i.e(interfaceC0504yK, "value.stringSet.stringsList");
                        bVar.b(eVar2, k.w0(interfaceC0504yK));
                        break;
                    case 8:
                        throw new CorruptionException("Value not set.", null);
                }
            }
            Map mapUnmodifiableMap = Collections.unmodifiableMap(bVar.a);
            p210v8.i.e(mapUnmodifiableMap, "unmodifiableMap(preferencesMap)");
            return new b(y.C(mapUnmodifiableMap), true);
        } catch (InvalidProtocolBufferException e10) {
            throw new CorruptionException("Unable to parse preferences proto.", e10);
        }
    }

    public final void b(Object obj, m mVar) {
        AbstractC0502w abstractC0502wA;
        Map mapUnmodifiableMap = Collections.unmodifiableMap(((b) obj).a);
        p210v8.i.e(mapUnmodifiableMap, "unmodifiableMap(preferencesMap)");
        c cVarK = e.k();
        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            e eVar = (e) entry.getKey();
            Object value = entry.getValue();
            String str = eVar.a;
            if (value instanceof Boolean) {
                h hVarY = p060g0.i.y();
                boolean zBooleanValue = ((Boolean) value).booleanValue();
                hVarY.d();
                p060g0.i.m((p060g0.i) hVarY.f6521t, zBooleanValue);
                abstractC0502wA = hVarY.a();
            } else if (value instanceof Float) {
                h hVarY2 = p060g0.i.y();
                float fFloatValue = ((Number) value).floatValue();
                hVarY2.d();
                p060g0.i.n((p060g0.i) hVarY2.f6521t, fFloatValue);
                abstractC0502wA = hVarY2.a();
            } else if (value instanceof Double) {
                h hVarY3 = p060g0.i.y();
                double dDoubleValue = ((Number) value).doubleValue();
                hVarY3.d();
                p060g0.i.l((p060g0.i) hVarY3.f6521t, dDoubleValue);
                abstractC0502wA = hVarY3.a();
            } else if (value instanceof Integer) {
                h hVarY4 = p060g0.i.y();
                int iIntValue = ((Number) value).intValue();
                hVarY4.d();
                p060g0.i.o((p060g0.i) hVarY4.f6521t, iIntValue);
                abstractC0502wA = hVarY4.a();
            } else if (value instanceof Long) {
                h hVarY5 = p060g0.i.y();
                long jLongValue = ((Number) value).longValue();
                hVarY5.d();
                p060g0.i.i((p060g0.i) hVarY5.f6521t, jLongValue);
                abstractC0502wA = hVarY5.a();
            } else if (value instanceof String) {
                h hVarY6 = p060g0.i.y();
                hVarY6.d();
                p060g0.i.j((p060g0.i) hVarY6.f6521t, (String) value);
                abstractC0502wA = hVarY6.a();
            } else {
                if (!(value instanceof Set)) {
                    throw new IllegalStateException(p210v8.i.k(value.getClass().getName(), "PreferencesSerializer does not support type: "));
                }
                h hVarY7 = p060g0.i.y();
                f fVarL = g.l();
                fVarL.d();
                g.i((g) fVarL.f6521t, (Set) value);
                hVarY7.d();
                p060g0.i.k((p060g0.i) hVarY7.f6521t, fVarL);
                abstractC0502wA = hVarY7.a();
            }
            cVarK.getClass();
            cVarK.d();
            e.i((e) cVarK.f6521t).put(str, (p060g0.i) abstractC0502wA);
        }
        e eVar2 = (e) cVarK.a();
        int iA = eVar2.a();
        Logger logger = C0491k.f6487h;
        if (iA > 4096) {
            iA = 4096;
        }
        C0491k c0491k = new C0491k(mVar, iA);
        eVar2.c(c0491k);
        if (c0491k.f6492f > 0) {
            c0491k.B();
        }
    }
}

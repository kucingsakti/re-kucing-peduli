package p037d9;

import java.util.LinkedHashMap;
import p086i8.z;

/* JADX INFO: loaded from: classes.dex */
public enum a {
    UNKNOWN(0),
    CLASS(1),
    FILE_FACADE(2),
    SYNTHETIC_CLASS(3),
    MULTIFILE_CLASS(4),
    MULTIFILE_CLASS_PART(5);


    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final LinkedHashMap f10552t;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f10559s;

    static {
        a[] aVarArrValues = values();
        int iS = z.s(aVarArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS < 16 ? 16 : iS);
        for (a aVar : aVarArrValues) {
            linkedHashMap.put(Integer.valueOf(aVar.f10559s), aVar);
        }
        f10552t = linkedHashMap;
    }

    a(int i10) {
        this.f10559s = i10;
    }
}

package p093j5;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static /* synthetic */ Boolean getBool$default(b bVar, String str, String str2, Boolean bool, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBool");
        }
        if ((i10 & 4) != 0) {
            bool = null;
        }
        return bVar.getBool(str, str2, bool);
    }

    public static /* synthetic */ Integer getInt$default(b bVar, String str, String str2, Integer num, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getInt");
        }
        if ((i10 & 4) != 0) {
            num = null;
        }
        return bVar.getInt(str, str2, num);
    }

    public static /* synthetic */ Long getLong$default(b bVar, String str, String str2, Long l4, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLong");
        }
        if ((i10 & 4) != 0) {
            l4 = null;
        }
        return bVar.getLong(str, str2, l4);
    }

    public static /* synthetic */ String getString$default(b bVar, String str, String str2, String str3, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getString");
        }
        if ((i10 & 4) != 0) {
            str3 = null;
        }
        return bVar.getString(str, str2, str3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Set getStringSet$default(b bVar, String str, String str2, Set set, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getStringSet");
        }
        if ((i10 & 4) != 0) {
            set = null;
        }
        return bVar.getStringSet(str, str2, set);
    }
}

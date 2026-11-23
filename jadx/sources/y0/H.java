package y0;

import androidx.datastore.preferences.protobuf.AbstractC0487g;

/* JADX INFO: loaded from: classes.dex */
public final class H extends L {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Class f15874s;

    public H(Class cls) {
        super(0, cls);
        if (cls.isEnum()) {
            this.f15874s = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " is not an Enum type.").toString());
    }

    @Override // y0.L, y0.M
    public final String b() {
        return this.f15874s.getName();
    }

    @Override // y0.L
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final Enum d(String str) {
        Object obj;
        p210v8.i.f(str, "value");
        Class cls = this.f15874s;
        Object[] enumConstants = cls.getEnumConstants();
        p210v8.i.e(enumConstants, "type.enumConstants");
        int length = enumConstants.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                obj = null;
                break;
            }
            obj = enumConstants[i10];
            if (L9.n.C(((Enum) obj).name(), str, true)) {
                break;
            }
            i10++;
        }
        Enum r10 = (Enum) obj;
        if (r10 != null) {
            return r10;
        }
        StringBuilder sbM = AbstractC0487g.m("Enum value ", str, " not found for type ");
        sbM.append(cls.getName());
        sbM.append('.');
        throw new IllegalArgumentException(sbM.toString());
    }
}

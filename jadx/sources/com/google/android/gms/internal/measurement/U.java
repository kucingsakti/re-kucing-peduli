package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class U extends zzgz {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f8364i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ U(zzhh zzhhVar, String str, Object obj, int i10) {
        super(zzhhVar, str, obj);
        this.f8364i = i10;
    }

    @Override // com.google.android.gms.internal.measurement.zzgz
    public final Object c(Object obj) {
        switch (this.f8364i) {
            case 0:
                if (obj instanceof Boolean) {
                    return (Boolean) obj;
                }
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (zzfy.f8629c.matcher(str).matches()) {
                        return Boolean.TRUE;
                    }
                    if (zzfy.f8630d.matcher(str).matches()) {
                        return Boolean.FALSE;
                    }
                }
                String str2 = this.a.f8663c;
                if (str2 != null) {
                    str2.isEmpty();
                }
                String.valueOf(obj);
                return null;
            case 1:
                if (obj instanceof Long) {
                    return (Long) obj;
                }
                if (obj instanceof String) {
                    try {
                        return Long.valueOf(Long.parseLong((String) obj));
                    } catch (NumberFormatException unused) {
                    }
                }
                String str3 = this.a.f8663c;
                if (str3 != null) {
                    str3.isEmpty();
                }
                String.valueOf(obj);
                return null;
            case 2:
                if (obj instanceof String) {
                    return (String) obj;
                }
                return null;
            default:
                if (obj instanceof Double) {
                    return (Double) obj;
                }
                if (obj instanceof Float) {
                    return Double.valueOf(((Float) obj).doubleValue());
                }
                if (obj instanceof String) {
                    try {
                        return Double.valueOf(Double.parseDouble((String) obj));
                    } catch (NumberFormatException unused2) {
                    }
                }
                String str4 = this.a.f8663c;
                if (str4 != null) {
                    str4.isEmpty();
                }
                String.valueOf(obj);
                return null;
        }
    }
}

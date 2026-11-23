package com.google.android.gms.common.server.response;

import E0.a;
import android.os.Parcel;
import android.util.Base64;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.common.util.MapUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@ShowFirstParty
@KeepForSdk
public abstract class FastJsonResponse {

    @SafeParcelable.Class
    @ShowFirstParty
    @KeepForSdk
    public static class Field<I, O> extends AbstractSafeParcelable {
        public static final zaj CREATOR = new zaj();

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public final String f8213A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public zan f8214B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public final StringToIntConverter f8215C;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final int f8216s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final int f8217t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final boolean f8218u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final int f8219v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final boolean f8220w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final String f8221x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final int f8222y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final Class f8223z;

        public Field(int i10, int i11, boolean z6, int i12, boolean z10, String str, int i13, String str2, zaa zaaVar) {
            this.f8216s = i10;
            this.f8217t = i11;
            this.f8218u = z6;
            this.f8219v = i12;
            this.f8220w = z10;
            this.f8221x = str;
            this.f8222y = i13;
            if (str2 == null) {
                this.f8223z = null;
                this.f8213A = null;
            } else {
                this.f8223z = SafeParcelResponse.class;
                this.f8213A = str2;
            }
            if (zaaVar == null) {
                this.f8215C = null;
                return;
            }
            StringToIntConverter stringToIntConverter = zaaVar.f8209t;
            if (stringToIntConverter == null) {
                throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
            }
            this.f8215C = stringToIntConverter;
        }

        public final String toString() {
            Objects.ToStringHelper toStringHelper = new Objects.ToStringHelper(this);
            toStringHelper.a(Integer.valueOf(this.f8216s), "versionCode");
            toStringHelper.a(Integer.valueOf(this.f8217t), "typeIn");
            toStringHelper.a(Boolean.valueOf(this.f8218u), "typeInArray");
            toStringHelper.a(Integer.valueOf(this.f8219v), "typeOut");
            toStringHelper.a(Boolean.valueOf(this.f8220w), "typeOutArray");
            toStringHelper.a(this.f8221x, "outputFieldName");
            toStringHelper.a(Integer.valueOf(this.f8222y), "safeParcelFieldId");
            String str = this.f8213A;
            if (str == null) {
                str = null;
            }
            toStringHelper.a(str, "concreteTypeName");
            Class cls = this.f8223z;
            if (cls != null) {
                toStringHelper.a(cls.getCanonicalName(), "concreteType.class");
            }
            if (this.f8215C != null) {
                toStringHelper.a(StringToIntConverter.class.getCanonicalName(), "converterName");
            }
            return toStringHelper.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            int i11 = SafeParcelWriter.i(parcel, 20293);
            SafeParcelWriter.k(parcel, 1, 4);
            parcel.writeInt(this.f8216s);
            SafeParcelWriter.k(parcel, 2, 4);
            parcel.writeInt(this.f8217t);
            SafeParcelWriter.k(parcel, 3, 4);
            parcel.writeInt(this.f8218u ? 1 : 0);
            SafeParcelWriter.k(parcel, 4, 4);
            parcel.writeInt(this.f8219v);
            SafeParcelWriter.k(parcel, 5, 4);
            parcel.writeInt(this.f8220w ? 1 : 0);
            SafeParcelWriter.e(parcel, 6, this.f8221x);
            SafeParcelWriter.k(parcel, 7, 4);
            parcel.writeInt(this.f8222y);
            String str = this.f8213A;
            if (str == null) {
                str = null;
            }
            SafeParcelWriter.e(parcel, 8, str);
            StringToIntConverter stringToIntConverter = this.f8215C;
            SafeParcelWriter.d(parcel, 9, stringToIntConverter != null ? new zaa(stringToIntConverter) : null, i10);
            SafeParcelWriter.j(parcel, i11);
        }
    }

    @ShowFirstParty
    public interface FieldConverter<I, O> {
    }

    public static final Object f(Field field, Object obj) {
        StringToIntConverter stringToIntConverter = field.f8215C;
        if (stringToIntConverter != null) {
            obj = (String) stringToIntConverter.f8207u.get(((Integer) obj).intValue());
            if (obj == null && stringToIntConverter.f8206t.containsKey("gms_unknown")) {
                return "gms_unknown";
            }
        }
        return obj;
    }

    public static final void g(StringBuilder sb, Field field, Object obj) {
        int i10 = field.f8217t;
        if (i10 == 11) {
            Class cls = field.f8223z;
            Preconditions.i(cls);
            sb.append(((FastJsonResponse) cls.cast(obj)).toString());
        } else {
            if (i10 != 7) {
                sb.append(obj);
                return;
            }
            sb.append("\"");
            sb.append(JsonUtils.a((String) obj));
            sb.append("\"");
        }
    }

    public abstract Map a();

    public final Object b(Field field) {
        if (field.f8223z == null) {
            return c();
        }
        boolean z6 = c() == null;
        String str = field.f8221x;
        if (!z6) {
            throw new IllegalStateException(a.h("Concrete field shouldn't be value object: ", str));
        }
        try {
            return getClass().getMethod("get" + Character.toUpperCase(str.charAt(0)) + str.substring(1), new Class[0]).invoke(this, new Object[0]);
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    public abstract Object c();

    public final boolean d(Field field) {
        if (field.f8219v != 11) {
            return e();
        }
        if (field.f8220w) {
            throw new UnsupportedOperationException("Concrete type arrays not supported");
        }
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    public abstract boolean e();

    public String toString() {
        Map mapA = a();
        StringBuilder sb = new StringBuilder(100);
        for (String str : mapA.keySet()) {
            Field field = (Field) mapA.get(str);
            if (d(field)) {
                Object objF = f(field, b(field));
                if (sb.length() == 0) {
                    sb.append("{");
                } else {
                    sb.append(",");
                }
                sb.append("\"");
                sb.append(str);
                sb.append("\":");
                if (objF != null) {
                    switch (field.f8219v) {
                        case 8:
                            sb.append("\"");
                            sb.append(Base64.encodeToString((byte[]) objF, 0));
                            sb.append("\"");
                            break;
                        case 9:
                            sb.append("\"");
                            sb.append(Base64.encodeToString((byte[]) objF, 10));
                            sb.append("\"");
                            break;
                        case 10:
                            MapUtils.a(sb, (HashMap) objF);
                            break;
                        default:
                            if (field.f8218u) {
                                ArrayList arrayList = (ArrayList) objF;
                                sb.append("[");
                                int size = arrayList.size();
                                for (int i10 = 0; i10 < size; i10++) {
                                    if (i10 > 0) {
                                        sb.append(",");
                                    }
                                    Object obj = arrayList.get(i10);
                                    if (obj != null) {
                                        g(sb, field, obj);
                                    }
                                }
                                sb.append("]");
                            } else {
                                g(sb, field, objF);
                            }
                            break;
                    }
                } else {
                    sb.append("null");
                }
            }
        }
        if (sb.length() > 0) {
            sb.append("}");
        } else {
            sb.append("{}");
        }
        return sb.toString();
    }
}

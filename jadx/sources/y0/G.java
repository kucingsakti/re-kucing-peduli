package y0;

import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class G extends M {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f15873r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ G(int i10, boolean z6) {
        super(z6);
        this.f15873r = i10;
    }

    @Override // y0.M
    public final Object a(String str, Bundle bundle) {
        switch (this.f15873r) {
            case 0:
                return (Boolean) p231y.a.b(bundle, "bundle", str, "key", str);
            case 1:
                Object objB = p231y.a.b(bundle, "bundle", str, "key", str);
                p210v8.i.d(objB, "null cannot be cast to non-null type kotlin.Float");
                return (Float) objB;
            case 2:
                Object objB2 = p231y.a.b(bundle, "bundle", str, "key", str);
                p210v8.i.d(objB2, "null cannot be cast to non-null type kotlin.Int");
                return (Integer) objB2;
            case 3:
                Object objB3 = p231y.a.b(bundle, "bundle", str, "key", str);
                p210v8.i.d(objB3, "null cannot be cast to non-null type kotlin.Long");
                return (Long) objB3;
            case 4:
                Object objB4 = p231y.a.b(bundle, "bundle", str, "key", str);
                p210v8.i.d(objB4, "null cannot be cast to non-null type kotlin.Int");
                return (Integer) objB4;
            default:
                return (String) p231y.a.b(bundle, "bundle", str, "key", str);
        }
    }

    @Override // y0.M
    public final String b() {
        switch (this.f15873r) {
            case 0:
                return "boolean";
            case 1:
                return "float";
            case 2:
                return "integer";
            case 3:
                return "long";
            case 4:
                return "reference";
            default:
                return "string";
        }
    }

    @Override // y0.M
    public final Object d(String str) {
        boolean z6;
        int i10;
        String strSubstring;
        long j;
        int i11;
        switch (this.f15873r) {
            case 0:
                p210v8.i.f(str, "value");
                if (str.equals("true")) {
                    z6 = true;
                } else {
                    if (!str.equals("false")) {
                        throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
                    }
                    z6 = false;
                }
                return Boolean.valueOf(z6);
            case 1:
                p210v8.i.f(str, "value");
                return Float.valueOf(Float.parseFloat(str));
            case 2:
                p210v8.i.f(str, "value");
                if (L9.n.I(str, "0x", false)) {
                    String strSubstring2 = str.substring(2);
                    p210v8.i.e(strSubstring2, "substring(...)");
                    D3.b.d(16);
                    i10 = Integer.parseInt(strSubstring2, 16);
                } else {
                    i10 = Integer.parseInt(str);
                }
                return Integer.valueOf(i10);
            case 3:
                p210v8.i.f(str, "value");
                if (L9.n.B(str, "L")) {
                    strSubstring = str.substring(0, str.length() - 1);
                    p210v8.i.e(strSubstring, "substring(...)");
                } else {
                    strSubstring = str;
                }
                if (L9.n.I(str, "0x", false)) {
                    String strSubstring3 = strSubstring.substring(2);
                    p210v8.i.e(strSubstring3, "substring(...)");
                    D3.b.d(16);
                    j = Long.parseLong(strSubstring3, 16);
                } else {
                    j = Long.parseLong(strSubstring);
                }
                return Long.valueOf(j);
            case 4:
                p210v8.i.f(str, "value");
                if (L9.n.I(str, "0x", false)) {
                    String strSubstring4 = str.substring(2);
                    p210v8.i.e(strSubstring4, "substring(...)");
                    D3.b.d(16);
                    i11 = Integer.parseInt(strSubstring4, 16);
                } else {
                    i11 = Integer.parseInt(str);
                }
                return Integer.valueOf(i11);
            default:
                p210v8.i.f(str, "value");
                if (str.equals("null")) {
                    return null;
                }
                return str;
        }
    }

    @Override // y0.M
    public final void e(Bundle bundle, String str, Object obj) {
        switch (this.f15873r) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                p210v8.i.f(str, "key");
                bundle.putBoolean(str, zBooleanValue);
                break;
            case 1:
                float fFloatValue = ((Number) obj).floatValue();
                p210v8.i.f(str, "key");
                bundle.putFloat(str, fFloatValue);
                break;
            case 2:
                int iIntValue = ((Number) obj).intValue();
                p210v8.i.f(str, "key");
                bundle.putInt(str, iIntValue);
                break;
            case 3:
                long jLongValue = ((Number) obj).longValue();
                p210v8.i.f(str, "key");
                bundle.putLong(str, jLongValue);
                break;
            case 4:
                int iIntValue2 = ((Number) obj).intValue();
                p210v8.i.f(str, "key");
                bundle.putInt(str, iIntValue2);
                break;
            default:
                p210v8.i.f(str, "key");
                bundle.putString(str, (String) obj);
                break;
        }
    }

    @Override // y0.M
    public String f(Object obj) {
        switch (this.f15873r) {
            case 5:
                String str = (String) obj;
                String strEncode = str != null ? Uri.encode(str) : null;
                return strEncode == null ? "null" : strEncode;
            default:
                return super.f(obj);
        }
    }
}

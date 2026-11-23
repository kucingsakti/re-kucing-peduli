package E;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final SparseIntArray f1186p0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f1187A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public float f1188B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f1189C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f1190D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f1191E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f1192F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f1193G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f1194H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f1195I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f1196J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f1197K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f1198L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f1199M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int f1200N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int f1201O;
    public int P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f1202Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public int f1203R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public int f1204S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public float f1205T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public float f1206U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public int f1207V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public int f1208W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public int f1209X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f1210Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public int f1211Z;
    public boolean a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f1212a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1213b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f1214b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1215c;
    public int c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1216d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public float f1217d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1218e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public float f1219e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f1220f;
    public int f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1221g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f1222g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1223h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f1224h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1225i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int[] f1226i0;
    public int j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public String f1227j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1228k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public String f1229k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1230l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public boolean f1231l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f1232m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public boolean f1233m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f1234n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public boolean f1235n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1236o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public int f1237o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f1238p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1239q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f1240r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1241s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f1242t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f1243u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f1244v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f1245w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f1246x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f1247y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f1248z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1186p0 = sparseIntArray;
        sparseIntArray.append(43, 24);
        sparseIntArray.append(44, 25);
        sparseIntArray.append(46, 28);
        sparseIntArray.append(47, 29);
        sparseIntArray.append(52, 35);
        sparseIntArray.append(51, 34);
        sparseIntArray.append(24, 4);
        sparseIntArray.append(23, 3);
        sparseIntArray.append(19, 1);
        sparseIntArray.append(61, 6);
        sparseIntArray.append(62, 7);
        sparseIntArray.append(31, 17);
        sparseIntArray.append(32, 18);
        sparseIntArray.append(33, 19);
        sparseIntArray.append(15, 90);
        sparseIntArray.append(0, 26);
        sparseIntArray.append(48, 31);
        sparseIntArray.append(49, 32);
        sparseIntArray.append(30, 10);
        sparseIntArray.append(29, 9);
        sparseIntArray.append(66, 13);
        sparseIntArray.append(69, 16);
        sparseIntArray.append(67, 14);
        sparseIntArray.append(64, 11);
        sparseIntArray.append(68, 15);
        sparseIntArray.append(65, 12);
        sparseIntArray.append(55, 38);
        sparseIntArray.append(41, 37);
        sparseIntArray.append(40, 39);
        sparseIntArray.append(54, 40);
        sparseIntArray.append(39, 20);
        sparseIntArray.append(53, 36);
        sparseIntArray.append(28, 5);
        sparseIntArray.append(42, 91);
        sparseIntArray.append(50, 91);
        sparseIntArray.append(45, 91);
        sparseIntArray.append(22, 91);
        sparseIntArray.append(18, 91);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(5, 27);
        sparseIntArray.append(7, 30);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(4, 33);
        sparseIntArray.append(6, 2);
        sparseIntArray.append(1, 22);
        sparseIntArray.append(2, 21);
        sparseIntArray.append(56, 41);
        sparseIntArray.append(34, 42);
        sparseIntArray.append(17, 87);
        sparseIntArray.append(16, 88);
        sparseIntArray.append(71, 76);
        sparseIntArray.append(25, 61);
        sparseIntArray.append(27, 62);
        sparseIntArray.append(26, 63);
        sparseIntArray.append(60, 69);
        sparseIntArray.append(38, 70);
        sparseIntArray.append(12, 71);
        sparseIntArray.append(10, 72);
        sparseIntArray.append(11, 73);
        sparseIntArray.append(13, 74);
        sparseIntArray.append(9, 75);
        sparseIntArray.append(58, 84);
        sparseIntArray.append(59, 86);
        sparseIntArray.append(58, 83);
        sparseIntArray.append(37, 85);
        sparseIntArray.append(56, 87);
        sparseIntArray.append(34, 88);
        sparseIntArray.append(91, 89);
        sparseIntArray.append(15, 90);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f1280e);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            SparseIntArray sparseIntArray = f1186p0;
            int i11 = sparseIntArray.get(index);
            switch (i11) {
                case 1:
                    this.f1238p = o.f(typedArrayObtainStyledAttributes, index, this.f1238p);
                    break;
                case 2:
                    this.f1195I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1195I);
                    break;
                case 3:
                    this.f1236o = o.f(typedArrayObtainStyledAttributes, index, this.f1236o);
                    break;
                case 4:
                    this.f1234n = o.f(typedArrayObtainStyledAttributes, index, this.f1234n);
                    break;
                case 5:
                    this.f1247y = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 6:
                    this.f1189C = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1189C);
                    break;
                case 7:
                    this.f1190D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1190D);
                    break;
                case 8:
                    this.f1196J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1196J);
                    break;
                case 9:
                    this.f1244v = o.f(typedArrayObtainStyledAttributes, index, this.f1244v);
                    break;
                case 10:
                    this.f1243u = o.f(typedArrayObtainStyledAttributes, index, this.f1243u);
                    break;
                case 11:
                    this.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.P);
                    break;
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    this.f1202Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1202Q);
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    this.f1199M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1199M);
                    break;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    this.f1201O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1201O);
                    break;
                case 15:
                    this.f1203R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1203R);
                    break;
                case 16:
                    this.f1200N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1200N);
                    break;
                case 17:
                    this.f1216d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1216d);
                    break;
                case 18:
                    this.f1218e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1218e);
                    break;
                case 19:
                    this.f1220f = typedArrayObtainStyledAttributes.getFloat(index, this.f1220f);
                    break;
                case 20:
                    this.f1245w = typedArrayObtainStyledAttributes.getFloat(index, this.f1245w);
                    break;
                case MobileAdsBridge.CODE_21 /* 21 */:
                    this.f1215c = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f1215c);
                    break;
                case 22:
                    this.f1213b = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f1213b);
                    break;
                case 23:
                    this.f1192F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1192F);
                    break;
                case 24:
                    this.f1223h = o.f(typedArrayObtainStyledAttributes, index, this.f1223h);
                    break;
                case 25:
                    this.f1225i = o.f(typedArrayObtainStyledAttributes, index, this.f1225i);
                    break;
                case 26:
                    this.f1191E = typedArrayObtainStyledAttributes.getInt(index, this.f1191E);
                    break;
                case 27:
                    this.f1193G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1193G);
                    break;
                case 28:
                    this.j = o.f(typedArrayObtainStyledAttributes, index, this.j);
                    break;
                case 29:
                    this.f1228k = o.f(typedArrayObtainStyledAttributes, index, this.f1228k);
                    break;
                case 30:
                    this.f1197K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1197K);
                    break;
                case 31:
                    this.f1241s = o.f(typedArrayObtainStyledAttributes, index, this.f1241s);
                    break;
                case 32:
                    this.f1242t = o.f(typedArrayObtainStyledAttributes, index, this.f1242t);
                    break;
                case 33:
                    this.f1194H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1194H);
                    break;
                case 34:
                    this.f1232m = o.f(typedArrayObtainStyledAttributes, index, this.f1232m);
                    break;
                case 35:
                    this.f1230l = o.f(typedArrayObtainStyledAttributes, index, this.f1230l);
                    break;
                case 36:
                    this.f1246x = typedArrayObtainStyledAttributes.getFloat(index, this.f1246x);
                    break;
                case 37:
                    this.f1206U = typedArrayObtainStyledAttributes.getFloat(index, this.f1206U);
                    break;
                case 38:
                    this.f1205T = typedArrayObtainStyledAttributes.getFloat(index, this.f1205T);
                    break;
                case 39:
                    this.f1207V = typedArrayObtainStyledAttributes.getInt(index, this.f1207V);
                    break;
                case 40:
                    this.f1208W = typedArrayObtainStyledAttributes.getInt(index, this.f1208W);
                    break;
                case 41:
                    o.g(this, typedArrayObtainStyledAttributes, index, 0);
                    break;
                case 42:
                    o.g(this, typedArrayObtainStyledAttributes, index, 1);
                    break;
                default:
                    switch (i11) {
                        case 61:
                            this.f1248z = o.f(typedArrayObtainStyledAttributes, index, this.f1248z);
                            break;
                        case 62:
                            this.f1187A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1187A);
                            break;
                        case 63:
                            this.f1188B = typedArrayObtainStyledAttributes.getFloat(index, this.f1188B);
                            break;
                        default:
                            switch (i11) {
                                case 69:
                                    this.f1217d0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                    break;
                                case 70:
                                    this.f1219e0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                    break;
                                case 71:
                                    break;
                                case 72:
                                    this.f0 = typedArrayObtainStyledAttributes.getInt(index, this.f0);
                                    break;
                                case 73:
                                    this.f1222g0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1222g0);
                                    break;
                                case 74:
                                    this.f1227j0 = typedArrayObtainStyledAttributes.getString(index);
                                    break;
                                case 75:
                                    this.f1235n0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f1235n0);
                                    break;
                                case 76:
                                    this.f1237o0 = typedArrayObtainStyledAttributes.getInt(index, this.f1237o0);
                                    break;
                                case 77:
                                    this.f1239q = o.f(typedArrayObtainStyledAttributes, index, this.f1239q);
                                    break;
                                case 78:
                                    this.f1240r = o.f(typedArrayObtainStyledAttributes, index, this.f1240r);
                                    break;
                                case 79:
                                    this.f1204S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1204S);
                                    break;
                                case 80:
                                    this.f1198L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1198L);
                                    break;
                                case 81:
                                    this.f1209X = typedArrayObtainStyledAttributes.getInt(index, this.f1209X);
                                    break;
                                case 82:
                                    this.f1210Y = typedArrayObtainStyledAttributes.getInt(index, this.f1210Y);
                                    break;
                                case 83:
                                    this.f1212a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1212a0);
                                    break;
                                case 84:
                                    this.f1211Z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1211Z);
                                    break;
                                case 85:
                                    this.c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.c0);
                                    break;
                                case 86:
                                    this.f1214b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1214b0);
                                    break;
                                case 87:
                                    this.f1231l0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f1231l0);
                                    break;
                                case 88:
                                    this.f1233m0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f1233m0);
                                    break;
                                case 89:
                                    this.f1229k0 = typedArrayObtainStyledAttributes.getString(index);
                                    break;
                                case 90:
                                    this.f1221g = typedArrayObtainStyledAttributes.getBoolean(index, this.f1221g);
                                    break;
                                case 91:
                                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                    break;
                                default:
                                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}

package E;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.chromium.net.UrlRequest;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f1272d = {0, 4, 8};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final SparseIntArray f1273e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final SparseIntArray f1274f;
    public final HashMap a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1275b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f1276c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1273e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f1274f = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(ModuleDescriptor.MODULE_VERSION, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    public static int[] c(a aVar, String str) {
        int iIntValue;
        HashMap map;
        String[] strArrSplit = str.split(",");
        Context context = aVar.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i10 = 0;
        int i11 = 0;
        while (i10 < strArrSplit.length) {
            String strTrim = strArrSplit[i10].trim();
            Object obj = null;
            try {
                iIntValue = q.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && aVar.isInEditMode() && (aVar.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) aVar.getParent();
                constraintLayout.getClass();
                if ((strTrim instanceof String) && (map = constraintLayout.f6294E) != null && map.containsKey(strTrim)) {
                    obj = constraintLayout.f6294E.get(strTrim);
                }
                if (obj != null && (obj instanceof Integer)) {
                    iIntValue = ((Integer) obj).intValue();
                }
            }
            iArr[i11] = iIntValue;
            i10++;
            i11++;
        }
        return i11 != strArrSplit.length ? Arrays.copyOf(iArr, i11) : iArr;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0084. Please report as an issue. */
    public static j d(Context context, AttributeSet attributeSet, boolean z6) {
        int i10;
        int i11;
        j jVar = new j();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z6 ? r.f1278c : r.a);
        int[] iArr = f1272d;
        String[] strArr = A.a.a;
        SparseIntArray sparseIntArray = f1273e;
        m mVar = jVar.f1181b;
        n nVar = jVar.f1184e;
        l lVar = jVar.f1182c;
        k kVar = jVar.f1183d;
        if (z6) {
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            i iVar = new i();
            iVar.a = new int[10];
            iVar.f1171b = new int[10];
            iVar.f1172c = 0;
            iVar.f1173d = new int[10];
            iVar.f1174e = new float[10];
            iVar.f1175f = 0;
            iVar.f1176g = new int[5];
            iVar.f1177h = new String[5];
            iVar.f1178i = 0;
            iVar.j = new int[4];
            iVar.f1179k = new boolean[4];
            iVar.f1180l = 0;
            lVar.getClass();
            kVar.getClass();
            nVar.getClass();
            int i12 = 0;
            while (i12 < indexCount) {
                int index = typedArrayObtainStyledAttributes.getIndex(i12);
                int i13 = i12;
                switch (f1274f.get(index)) {
                    case 2:
                        iVar.b(2, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.f1195I));
                        break;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 25:
                    case 26:
                    case 29:
                    case 30:
                    case 32:
                    case 33:
                    case 35:
                    case 36:
                    case 61:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        StringBuilder sb = new StringBuilder("Unknown attribute 0x");
                        indexCount = indexCount;
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(sparseIntArray.get(index));
                        Log.w("ConstraintSet", sb.toString());
                        break;
                    case 5:
                        iVar.c(5, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 6:
                        indexCount = indexCount;
                        iVar.b(6, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, kVar.f1189C));
                        break;
                    case 7:
                        indexCount = indexCount;
                        iVar.b(7, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, kVar.f1190D));
                        break;
                    case 8:
                        indexCount = indexCount;
                        iVar.b(8, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.f1196J));
                        break;
                    case 11:
                        indexCount = indexCount;
                        iVar.b(11, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.P));
                        break;
                    case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                        indexCount = indexCount;
                        iVar.b(12, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.f1202Q));
                        break;
                    case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                        indexCount = indexCount;
                        iVar.b(13, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.f1199M));
                        break;
                    case UrlRequest.Status.READING_RESPONSE /* 14 */:
                        indexCount = indexCount;
                        iVar.b(14, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.f1201O));
                        break;
                    case 15:
                        indexCount = indexCount;
                        iVar.b(15, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.f1203R));
                        break;
                    case 16:
                        indexCount = indexCount;
                        iVar.b(16, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.f1200N));
                        break;
                    case 17:
                        indexCount = indexCount;
                        iVar.b(17, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, kVar.f1216d));
                        break;
                    case 18:
                        indexCount = indexCount;
                        iVar.b(18, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, kVar.f1218e));
                        break;
                    case 19:
                        indexCount = indexCount;
                        iVar.a(19, typedArrayObtainStyledAttributes.getFloat(index, kVar.f1220f));
                        break;
                    case 20:
                        indexCount = indexCount;
                        iVar.a(20, typedArrayObtainStyledAttributes.getFloat(index, kVar.f1245w));
                        break;
                    case MobileAdsBridge.CODE_21 /* 21 */:
                        indexCount = indexCount;
                        iVar.b(21, typedArrayObtainStyledAttributes.getLayoutDimension(index, kVar.f1215c));
                        break;
                    case 22:
                        indexCount = indexCount;
                        iVar.b(22, iArr[typedArrayObtainStyledAttributes.getInt(index, mVar.a)]);
                        break;
                    case 23:
                        indexCount = indexCount;
                        iVar.b(23, typedArrayObtainStyledAttributes.getLayoutDimension(index, kVar.f1213b));
                        break;
                    case 24:
                        indexCount = indexCount;
                        iVar.b(24, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.f1192F));
                        break;
                    case 27:
                        indexCount = indexCount;
                        iVar.b(27, typedArrayObtainStyledAttributes.getInt(index, kVar.f1191E));
                        break;
                    case 28:
                        indexCount = indexCount;
                        iVar.b(28, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.f1193G));
                        break;
                    case 31:
                        indexCount = indexCount;
                        iVar.b(31, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.f1197K));
                        break;
                    case 34:
                        indexCount = indexCount;
                        iVar.b(34, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.f1194H));
                        break;
                    case 37:
                        indexCount = indexCount;
                        iVar.a(37, typedArrayObtainStyledAttributes.getFloat(index, kVar.f1246x));
                        break;
                    case 38:
                        indexCount = indexCount;
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, jVar.a);
                        jVar.a = resourceId;
                        iVar.b(38, resourceId);
                        break;
                    case 39:
                        indexCount = indexCount;
                        iVar.a(39, typedArrayObtainStyledAttributes.getFloat(index, kVar.f1206U));
                        break;
                    case 40:
                        indexCount = indexCount;
                        iVar.a(40, typedArrayObtainStyledAttributes.getFloat(index, kVar.f1205T));
                        break;
                    case 41:
                        indexCount = indexCount;
                        iVar.b(41, typedArrayObtainStyledAttributes.getInt(index, kVar.f1207V));
                        break;
                    case 42:
                        indexCount = indexCount;
                        iVar.b(42, typedArrayObtainStyledAttributes.getInt(index, kVar.f1208W));
                        break;
                    case 43:
                        indexCount = indexCount;
                        iVar.a(43, typedArrayObtainStyledAttributes.getFloat(index, mVar.f1258c));
                        break;
                    case 44:
                        indexCount = indexCount;
                        iVar.d(44, true);
                        iVar.a(44, typedArrayObtainStyledAttributes.getDimension(index, nVar.f1271m));
                        break;
                    case 45:
                        indexCount = indexCount;
                        iVar.a(45, typedArrayObtainStyledAttributes.getFloat(index, nVar.f1261b));
                        break;
                    case 46:
                        indexCount = indexCount;
                        iVar.a(46, typedArrayObtainStyledAttributes.getFloat(index, nVar.f1262c));
                        break;
                    case 47:
                        indexCount = indexCount;
                        iVar.a(47, typedArrayObtainStyledAttributes.getFloat(index, nVar.f1263d));
                        break;
                    case 48:
                        indexCount = indexCount;
                        iVar.a(48, typedArrayObtainStyledAttributes.getFloat(index, nVar.f1264e));
                        break;
                    case 49:
                        indexCount = indexCount;
                        iVar.a(49, typedArrayObtainStyledAttributes.getDimension(index, nVar.f1265f));
                        break;
                    case 50:
                        indexCount = indexCount;
                        iVar.a(50, typedArrayObtainStyledAttributes.getDimension(index, nVar.f1266g));
                        break;
                    case 51:
                        indexCount = indexCount;
                        iVar.a(51, typedArrayObtainStyledAttributes.getDimension(index, nVar.f1268i));
                        break;
                    case 52:
                        indexCount = indexCount;
                        iVar.a(52, typedArrayObtainStyledAttributes.getDimension(index, nVar.j));
                        break;
                    case 53:
                        indexCount = indexCount;
                        iVar.a(53, typedArrayObtainStyledAttributes.getDimension(index, nVar.f1269k));
                        break;
                    case 54:
                        indexCount = indexCount;
                        iVar.b(54, typedArrayObtainStyledAttributes.getInt(index, kVar.f1209X));
                        break;
                    case 55:
                        indexCount = indexCount;
                        iVar.b(55, typedArrayObtainStyledAttributes.getInt(index, kVar.f1210Y));
                        break;
                    case 56:
                        indexCount = indexCount;
                        iVar.b(56, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.f1211Z));
                        break;
                    case 57:
                        indexCount = indexCount;
                        iVar.b(57, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.f1212a0));
                        break;
                    case 58:
                        indexCount = indexCount;
                        iVar.b(58, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.f1214b0));
                        break;
                    case 59:
                        indexCount = indexCount;
                        iVar.b(59, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.c0));
                        break;
                    case 60:
                        indexCount = indexCount;
                        iVar.a(60, typedArrayObtainStyledAttributes.getFloat(index, nVar.a));
                        break;
                    case 62:
                        indexCount = indexCount;
                        iVar.b(62, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.f1187A));
                        break;
                    case 63:
                        indexCount = indexCount;
                        iVar.a(63, typedArrayObtainStyledAttributes.getFloat(index, kVar.f1188B));
                        break;
                    case 64:
                        indexCount = indexCount;
                        iVar.b(64, f(typedArrayObtainStyledAttributes, index, lVar.a));
                        break;
                    case 65:
                        indexCount = indexCount;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            iVar.c(65, typedArrayObtainStyledAttributes.getString(index));
                        } else {
                            iVar.c(65, strArr[typedArrayObtainStyledAttributes.getInteger(index, 0)]);
                        }
                        break;
                    case 66:
                        indexCount = indexCount;
                        iVar.b(66, typedArrayObtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        indexCount = indexCount;
                        iVar.a(67, typedArrayObtainStyledAttributes.getFloat(index, lVar.f1252e));
                        break;
                    case 68:
                        indexCount = indexCount;
                        iVar.a(68, typedArrayObtainStyledAttributes.getFloat(index, mVar.f1259d));
                        break;
                    case 69:
                        indexCount = indexCount;
                        iVar.a(69, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 70:
                        indexCount = indexCount;
                        iVar.a(70, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 71:
                        indexCount = indexCount;
                        break;
                    case 72:
                        indexCount = indexCount;
                        iVar.b(72, typedArrayObtainStyledAttributes.getInt(index, kVar.f0));
                        break;
                    case 73:
                        indexCount = indexCount;
                        iVar.b(73, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.f1222g0));
                        break;
                    case 74:
                        indexCount = indexCount;
                        iVar.c(74, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 75:
                        indexCount = indexCount;
                        iVar.d(75, typedArrayObtainStyledAttributes.getBoolean(index, kVar.f1235n0));
                        break;
                    case 76:
                        indexCount = indexCount;
                        iVar.b(76, typedArrayObtainStyledAttributes.getInt(index, lVar.f1250c));
                        break;
                    case 77:
                        indexCount = indexCount;
                        iVar.c(77, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 78:
                        indexCount = indexCount;
                        iVar.b(78, typedArrayObtainStyledAttributes.getInt(index, mVar.f1257b));
                        break;
                    case 79:
                        indexCount = indexCount;
                        iVar.a(79, typedArrayObtainStyledAttributes.getFloat(index, lVar.f1251d));
                        break;
                    case 80:
                        indexCount = indexCount;
                        iVar.d(80, typedArrayObtainStyledAttributes.getBoolean(index, kVar.f1231l0));
                        break;
                    case 81:
                        indexCount = indexCount;
                        iVar.d(81, typedArrayObtainStyledAttributes.getBoolean(index, kVar.f1233m0));
                        break;
                    case 82:
                        indexCount = indexCount;
                        iVar.b(82, typedArrayObtainStyledAttributes.getInteger(index, lVar.f1249b));
                        break;
                    case 83:
                        indexCount = indexCount;
                        iVar.b(83, f(typedArrayObtainStyledAttributes, index, nVar.f1267h));
                        break;
                    case 84:
                        indexCount = indexCount;
                        iVar.b(84, typedArrayObtainStyledAttributes.getInteger(index, lVar.f1254g));
                        break;
                    case 85:
                        indexCount = indexCount;
                        iVar.a(85, typedArrayObtainStyledAttributes.getFloat(index, lVar.f1253f));
                        break;
                    case 86:
                        indexCount = indexCount;
                        int i14 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i14 == 1) {
                            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            lVar.f1256i = resourceId2;
                            iVar.b(89, resourceId2);
                            if (lVar.f1256i != -1) {
                                iVar.b(88, -2);
                            }
                        } else if (i14 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            lVar.f1255h = string;
                            iVar.c(90, string);
                            if (lVar.f1255h.indexOf("/") > 0) {
                                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                lVar.f1256i = resourceId3;
                                iVar.b(89, resourceId3);
                                iVar.b(88, -2);
                            } else {
                                iVar.b(88, -1);
                            }
                        } else {
                            iVar.b(88, typedArrayObtainStyledAttributes.getInteger(index, lVar.f1256i));
                        }
                        break;
                    case 87:
                        indexCount = indexCount;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case 93:
                        indexCount = indexCount;
                        iVar.b(93, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.f1198L));
                        break;
                    case 94:
                        indexCount = indexCount;
                        iVar.b(94, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.f1204S));
                        break;
                    case 95:
                        indexCount = indexCount;
                        g(iVar, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        indexCount = indexCount;
                        g(iVar, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        indexCount = indexCount;
                        iVar.b(97, typedArrayObtainStyledAttributes.getInt(index, kVar.f1237o0));
                        break;
                    case 98:
                        indexCount = indexCount;
                        int i15 = D.a.f1032I;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            jVar.a = typedArrayObtainStyledAttributes.getResourceId(index, jVar.a);
                        }
                        break;
                    case 99:
                        indexCount = indexCount;
                        iVar.d(99, typedArrayObtainStyledAttributes.getBoolean(index, kVar.f1221g));
                        break;
                }
                i12 = i13 + 1;
                indexCount = indexCount;
            }
        } else {
            int i16 = 1;
            int indexCount2 = typedArrayObtainStyledAttributes.getIndexCount();
            int i17 = 0;
            while (i17 < indexCount2) {
                int index2 = typedArrayObtainStyledAttributes.getIndex(i17);
                if (index2 != i16 && 23 != index2) {
                    if (24 != index2) {
                        lVar.getClass();
                        kVar.getClass();
                        nVar.getClass();
                    }
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i10 = indexCount2;
                        kVar.f1238p = f(typedArrayObtainStyledAttributes, index2, kVar.f1238p);
                        i11 = 1;
                        break;
                    case 2:
                        i10 = indexCount2;
                        kVar.f1195I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.f1195I);
                        i11 = 1;
                        break;
                    case 3:
                        i10 = indexCount2;
                        kVar.f1236o = f(typedArrayObtainStyledAttributes, index2, kVar.f1236o);
                        i11 = 1;
                        break;
                    case 4:
                        i10 = indexCount2;
                        kVar.f1234n = f(typedArrayObtainStyledAttributes, index2, kVar.f1234n);
                        i11 = 1;
                        break;
                    case 5:
                        i10 = indexCount2;
                        kVar.f1247y = typedArrayObtainStyledAttributes.getString(index2);
                        i11 = 1;
                        break;
                    case 6:
                        i10 = indexCount2;
                        kVar.f1189C = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, kVar.f1189C);
                        i11 = 1;
                        break;
                    case 7:
                        i10 = indexCount2;
                        kVar.f1190D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, kVar.f1190D);
                        i11 = 1;
                        break;
                    case 8:
                        i10 = indexCount2;
                        kVar.f1196J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.f1196J);
                        i11 = 1;
                        break;
                    case 9:
                        i10 = indexCount2;
                        kVar.f1244v = f(typedArrayObtainStyledAttributes, index2, kVar.f1244v);
                        i11 = 1;
                        break;
                    case 10:
                        i10 = indexCount2;
                        kVar.f1243u = f(typedArrayObtainStyledAttributes, index2, kVar.f1243u);
                        i11 = 1;
                        break;
                    case 11:
                        i10 = indexCount2;
                        kVar.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.P);
                        i11 = 1;
                        break;
                    case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                        i10 = indexCount2;
                        kVar.f1202Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.f1202Q);
                        i11 = 1;
                        break;
                    case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                        i10 = indexCount2;
                        kVar.f1199M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.f1199M);
                        i11 = 1;
                        break;
                    case UrlRequest.Status.READING_RESPONSE /* 14 */:
                        i10 = indexCount2;
                        kVar.f1201O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.f1201O);
                        i11 = 1;
                        break;
                    case 15:
                        i10 = indexCount2;
                        kVar.f1203R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.f1203R);
                        i11 = 1;
                        break;
                    case 16:
                        i10 = indexCount2;
                        kVar.f1200N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.f1200N);
                        i11 = 1;
                        break;
                    case 17:
                        i10 = indexCount2;
                        kVar.f1216d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, kVar.f1216d);
                        i11 = 1;
                        break;
                    case 18:
                        i10 = indexCount2;
                        kVar.f1218e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, kVar.f1218e);
                        i11 = 1;
                        break;
                    case 19:
                        i10 = indexCount2;
                        kVar.f1220f = typedArrayObtainStyledAttributes.getFloat(index2, kVar.f1220f);
                        i11 = 1;
                        break;
                    case 20:
                        i10 = indexCount2;
                        kVar.f1245w = typedArrayObtainStyledAttributes.getFloat(index2, kVar.f1245w);
                        i11 = 1;
                        break;
                    case MobileAdsBridge.CODE_21 /* 21 */:
                        i10 = indexCount2;
                        kVar.f1215c = typedArrayObtainStyledAttributes.getLayoutDimension(index2, kVar.f1215c);
                        i11 = 1;
                        break;
                    case 22:
                        i10 = indexCount2;
                        int i18 = typedArrayObtainStyledAttributes.getInt(index2, mVar.a);
                        mVar.a = i18;
                        mVar.a = iArr[i18];
                        i11 = 1;
                        break;
                    case 23:
                        i10 = indexCount2;
                        kVar.f1213b = typedArrayObtainStyledAttributes.getLayoutDimension(index2, kVar.f1213b);
                        i11 = 1;
                        break;
                    case 24:
                        i10 = indexCount2;
                        kVar.f1192F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.f1192F);
                        i11 = 1;
                        break;
                    case 25:
                        i10 = indexCount2;
                        kVar.f1223h = f(typedArrayObtainStyledAttributes, index2, kVar.f1223h);
                        i11 = 1;
                        break;
                    case 26:
                        i10 = indexCount2;
                        kVar.f1225i = f(typedArrayObtainStyledAttributes, index2, kVar.f1225i);
                        i11 = 1;
                        break;
                    case 27:
                        i10 = indexCount2;
                        kVar.f1191E = typedArrayObtainStyledAttributes.getInt(index2, kVar.f1191E);
                        i11 = 1;
                        break;
                    case 28:
                        i10 = indexCount2;
                        kVar.f1193G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.f1193G);
                        i11 = 1;
                        break;
                    case 29:
                        i10 = indexCount2;
                        kVar.j = f(typedArrayObtainStyledAttributes, index2, kVar.j);
                        i11 = 1;
                        break;
                    case 30:
                        i10 = indexCount2;
                        kVar.f1228k = f(typedArrayObtainStyledAttributes, index2, kVar.f1228k);
                        i11 = 1;
                        break;
                    case 31:
                        i10 = indexCount2;
                        kVar.f1197K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.f1197K);
                        i11 = 1;
                        break;
                    case 32:
                        i10 = indexCount2;
                        kVar.f1241s = f(typedArrayObtainStyledAttributes, index2, kVar.f1241s);
                        i11 = 1;
                        break;
                    case 33:
                        i10 = indexCount2;
                        kVar.f1242t = f(typedArrayObtainStyledAttributes, index2, kVar.f1242t);
                        i11 = 1;
                        break;
                    case 34:
                        i10 = indexCount2;
                        kVar.f1194H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.f1194H);
                        i11 = 1;
                        break;
                    case 35:
                        i10 = indexCount2;
                        kVar.f1232m = f(typedArrayObtainStyledAttributes, index2, kVar.f1232m);
                        i11 = 1;
                        break;
                    case 36:
                        i10 = indexCount2;
                        kVar.f1230l = f(typedArrayObtainStyledAttributes, index2, kVar.f1230l);
                        i11 = 1;
                        break;
                    case 37:
                        i10 = indexCount2;
                        kVar.f1246x = typedArrayObtainStyledAttributes.getFloat(index2, kVar.f1246x);
                        i11 = 1;
                        break;
                    case 38:
                        i10 = indexCount2;
                        jVar.a = typedArrayObtainStyledAttributes.getResourceId(index2, jVar.a);
                        i11 = 1;
                        break;
                    case 39:
                        i10 = indexCount2;
                        kVar.f1206U = typedArrayObtainStyledAttributes.getFloat(index2, kVar.f1206U);
                        i11 = 1;
                        break;
                    case 40:
                        i10 = indexCount2;
                        kVar.f1205T = typedArrayObtainStyledAttributes.getFloat(index2, kVar.f1205T);
                        i11 = 1;
                        break;
                    case 41:
                        i10 = indexCount2;
                        kVar.f1207V = typedArrayObtainStyledAttributes.getInt(index2, kVar.f1207V);
                        i11 = 1;
                        break;
                    case 42:
                        i10 = indexCount2;
                        kVar.f1208W = typedArrayObtainStyledAttributes.getInt(index2, kVar.f1208W);
                        i11 = 1;
                        break;
                    case 43:
                        i10 = indexCount2;
                        mVar.f1258c = typedArrayObtainStyledAttributes.getFloat(index2, mVar.f1258c);
                        i11 = 1;
                        break;
                    case 44:
                        i10 = indexCount2;
                        nVar.f1270l = true;
                        nVar.f1271m = typedArrayObtainStyledAttributes.getDimension(index2, nVar.f1271m);
                        i11 = 1;
                        break;
                    case 45:
                        i10 = indexCount2;
                        nVar.f1261b = typedArrayObtainStyledAttributes.getFloat(index2, nVar.f1261b);
                        i11 = 1;
                        break;
                    case 46:
                        i10 = indexCount2;
                        nVar.f1262c = typedArrayObtainStyledAttributes.getFloat(index2, nVar.f1262c);
                        i11 = 1;
                        break;
                    case 47:
                        i10 = indexCount2;
                        nVar.f1263d = typedArrayObtainStyledAttributes.getFloat(index2, nVar.f1263d);
                        i11 = 1;
                        break;
                    case 48:
                        i10 = indexCount2;
                        nVar.f1264e = typedArrayObtainStyledAttributes.getFloat(index2, nVar.f1264e);
                        i11 = 1;
                        break;
                    case 49:
                        i10 = indexCount2;
                        nVar.f1265f = typedArrayObtainStyledAttributes.getDimension(index2, nVar.f1265f);
                        i11 = 1;
                        break;
                    case 50:
                        i10 = indexCount2;
                        nVar.f1266g = typedArrayObtainStyledAttributes.getDimension(index2, nVar.f1266g);
                        i11 = 1;
                        break;
                    case 51:
                        i10 = indexCount2;
                        nVar.f1268i = typedArrayObtainStyledAttributes.getDimension(index2, nVar.f1268i);
                        i11 = 1;
                        break;
                    case 52:
                        i10 = indexCount2;
                        nVar.j = typedArrayObtainStyledAttributes.getDimension(index2, nVar.j);
                        i11 = 1;
                        break;
                    case 53:
                        i10 = indexCount2;
                        nVar.f1269k = typedArrayObtainStyledAttributes.getDimension(index2, nVar.f1269k);
                        i11 = 1;
                        break;
                    case 54:
                        i10 = indexCount2;
                        kVar.f1209X = typedArrayObtainStyledAttributes.getInt(index2, kVar.f1209X);
                        i11 = 1;
                        break;
                    case 55:
                        i10 = indexCount2;
                        kVar.f1210Y = typedArrayObtainStyledAttributes.getInt(index2, kVar.f1210Y);
                        i11 = 1;
                        break;
                    case 56:
                        i10 = indexCount2;
                        kVar.f1211Z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.f1211Z);
                        i11 = 1;
                        break;
                    case 57:
                        i10 = indexCount2;
                        kVar.f1212a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.f1212a0);
                        i11 = 1;
                        break;
                    case 58:
                        i10 = indexCount2;
                        kVar.f1214b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.f1214b0);
                        i11 = 1;
                        break;
                    case 59:
                        i10 = indexCount2;
                        kVar.c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.c0);
                        i11 = 1;
                        break;
                    case 60:
                        i10 = indexCount2;
                        nVar.a = typedArrayObtainStyledAttributes.getFloat(index2, nVar.a);
                        i11 = 1;
                        break;
                    case 61:
                        i10 = indexCount2;
                        kVar.f1248z = f(typedArrayObtainStyledAttributes, index2, kVar.f1248z);
                        i11 = 1;
                        break;
                    case 62:
                        i10 = indexCount2;
                        kVar.f1187A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.f1187A);
                        i11 = 1;
                        break;
                    case 63:
                        i10 = indexCount2;
                        kVar.f1188B = typedArrayObtainStyledAttributes.getFloat(index2, kVar.f1188B);
                        i11 = 1;
                        break;
                    case 64:
                        i10 = indexCount2;
                        lVar.a = f(typedArrayObtainStyledAttributes, index2, lVar.a);
                        i11 = 1;
                        break;
                    case 65:
                        i10 = indexCount2;
                        if (typedArrayObtainStyledAttributes.peekValue(index2).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index2);
                            lVar.getClass();
                        } else {
                            String str = strArr[typedArrayObtainStyledAttributes.getInteger(index2, 0)];
                            lVar.getClass();
                        }
                        i11 = 1;
                        break;
                    case 66:
                        i10 = indexCount2;
                        typedArrayObtainStyledAttributes.getInt(index2, 0);
                        lVar.getClass();
                        i11 = 1;
                        break;
                    case 67:
                        i10 = indexCount2;
                        lVar.f1252e = typedArrayObtainStyledAttributes.getFloat(index2, lVar.f1252e);
                        i11 = 1;
                        break;
                    case 68:
                        i10 = indexCount2;
                        mVar.f1259d = typedArrayObtainStyledAttributes.getFloat(index2, mVar.f1259d);
                        i11 = 1;
                        break;
                    case 69:
                        i10 = indexCount2;
                        kVar.f1217d0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        i11 = 1;
                        break;
                    case 70:
                        i10 = indexCount2;
                        kVar.f1219e0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        i11 = 1;
                        break;
                    case 71:
                        i10 = indexCount2;
                        i11 = 1;
                        break;
                    case 72:
                        i10 = indexCount2;
                        kVar.f0 = typedArrayObtainStyledAttributes.getInt(index2, kVar.f0);
                        i11 = 1;
                        break;
                    case 73:
                        i10 = indexCount2;
                        kVar.f1222g0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.f1222g0);
                        i11 = 1;
                        break;
                    case 74:
                        i10 = indexCount2;
                        kVar.f1227j0 = typedArrayObtainStyledAttributes.getString(index2);
                        i11 = 1;
                        break;
                    case 75:
                        i10 = indexCount2;
                        kVar.f1235n0 = typedArrayObtainStyledAttributes.getBoolean(index2, kVar.f1235n0);
                        i11 = 1;
                        break;
                    case 76:
                        i10 = indexCount2;
                        lVar.f1250c = typedArrayObtainStyledAttributes.getInt(index2, lVar.f1250c);
                        i11 = 1;
                        break;
                    case 77:
                        i10 = indexCount2;
                        kVar.f1229k0 = typedArrayObtainStyledAttributes.getString(index2);
                        i11 = 1;
                        break;
                    case 78:
                        i10 = indexCount2;
                        mVar.f1257b = typedArrayObtainStyledAttributes.getInt(index2, mVar.f1257b);
                        i11 = 1;
                        break;
                    case 79:
                        i10 = indexCount2;
                        lVar.f1251d = typedArrayObtainStyledAttributes.getFloat(index2, lVar.f1251d);
                        i11 = 1;
                        break;
                    case 80:
                        i10 = indexCount2;
                        kVar.f1231l0 = typedArrayObtainStyledAttributes.getBoolean(index2, kVar.f1231l0);
                        i11 = 1;
                        break;
                    case 81:
                        i10 = indexCount2;
                        kVar.f1233m0 = typedArrayObtainStyledAttributes.getBoolean(index2, kVar.f1233m0);
                        i11 = 1;
                        break;
                    case 82:
                        i10 = indexCount2;
                        lVar.f1249b = typedArrayObtainStyledAttributes.getInteger(index2, lVar.f1249b);
                        i11 = 1;
                        break;
                    case 83:
                        i10 = indexCount2;
                        nVar.f1267h = f(typedArrayObtainStyledAttributes, index2, nVar.f1267h);
                        i11 = 1;
                        break;
                    case 84:
                        i10 = indexCount2;
                        lVar.f1254g = typedArrayObtainStyledAttributes.getInteger(index2, lVar.f1254g);
                        i11 = 1;
                        break;
                    case 85:
                        i10 = indexCount2;
                        lVar.f1253f = typedArrayObtainStyledAttributes.getFloat(index2, lVar.f1253f);
                        i11 = 1;
                        break;
                    case 86:
                        i10 = indexCount2;
                        int i19 = typedArrayObtainStyledAttributes.peekValue(index2).type;
                        if (i19 == 1) {
                            lVar.f1256i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                        } else if (i19 == 3) {
                            String string2 = typedArrayObtainStyledAttributes.getString(index2);
                            lVar.f1255h = string2;
                            if (string2.indexOf("/") > 0) {
                                lVar.f1256i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                            }
                        } else {
                            typedArrayObtainStyledAttributes.getInteger(index2, lVar.f1256i);
                        }
                        i11 = 1;
                        break;
                    case 87:
                        i10 = indexCount2;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        i11 = 1;
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        StringBuilder sb2 = new StringBuilder("Unknown attribute 0x");
                        i10 = indexCount2;
                        sb2.append(Integer.toHexString(index2));
                        sb2.append("   ");
                        sb2.append(sparseIntArray.get(index2));
                        Log.w("ConstraintSet", sb2.toString());
                        i11 = 1;
                        break;
                    case 91:
                        i10 = indexCount2;
                        kVar.f1239q = f(typedArrayObtainStyledAttributes, index2, kVar.f1239q);
                        i11 = 1;
                        break;
                    case 92:
                        i10 = indexCount2;
                        kVar.f1240r = f(typedArrayObtainStyledAttributes, index2, kVar.f1240r);
                        i11 = 1;
                        break;
                    case 93:
                        i10 = indexCount2;
                        kVar.f1198L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.f1198L);
                        i11 = 1;
                        break;
                    case 94:
                        i10 = indexCount2;
                        kVar.f1204S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.f1204S);
                        i11 = 1;
                        break;
                    case 95:
                        i10 = indexCount2;
                        g(kVar, typedArrayObtainStyledAttributes, index2, 0);
                        i11 = 1;
                        break;
                    case 96:
                        i10 = indexCount2;
                        g(kVar, typedArrayObtainStyledAttributes, index2, 1);
                        i11 = 1;
                        break;
                    case 97:
                        i10 = indexCount2;
                        kVar.f1237o0 = typedArrayObtainStyledAttributes.getInt(index2, kVar.f1237o0);
                        i11 = 1;
                        break;
                }
                i17++;
                indexCount2 = i10;
                i16 = i11;
            }
            if (kVar.f1227j0 != null) {
                kVar.f1226i0 = null;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return jVar;
    }

    public static int f(TypedArray typedArray, int i10, int i11) {
        int resourceId = typedArray.getResourceId(i10, i11);
        return resourceId == -1 ? typedArray.getInt(i10, -1) : resourceId;
    }

    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0036  */
    /* JADX WARN: Code duplicated, block: B:22:0x003a  */
    /* JADX WARN: Code duplicated, block: B:24:0x003f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0044  */
    /* JADX WARN: Code duplicated, block: B:28:0x0048  */
    /* JADX WARN: Code duplicated, block: B:30:0x004c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0051  */
    /* JADX WARN: Code duplicated, block: B:34:0x0056  */
    /* JADX WARN: Code duplicated, block: B:36:0x005a  */
    /* JADX WARN: Code duplicated, block: B:38:0x005e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0067  */
    public static void g(Object obj, TypedArray typedArray, int i10, int i11) {
        int dimensionPixelSize;
        i iVar;
        k kVar;
        e eVar;
        if (obj == null) {
            return;
        }
        int i12 = typedArray.peekValue(i10).type;
        boolean z6 = true;
        int i13 = 0;
        if (i12 != 3) {
            if (i12 != 5) {
                dimensionPixelSize = typedArray.getInt(i10, 0);
                if (dimensionPixelSize == -4) {
                    i13 = -2;
                } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                    z6 = false;
                }
                if (obj instanceof e) {
                    eVar = (e) obj;
                    if (i11 == 0) {
                        ((ViewGroup.MarginLayoutParams) eVar).width = i13;
                        eVar.f1115W = z6;
                        return;
                    } else {
                        ((ViewGroup.MarginLayoutParams) eVar).height = i13;
                        eVar.f1116X = z6;
                        return;
                    }
                }
                if (obj instanceof k) {
                    kVar = (k) obj;
                    if (i11 == 0) {
                        kVar.f1213b = i13;
                        kVar.f1231l0 = z6;
                        return;
                    } else {
                        kVar.f1215c = i13;
                        kVar.f1233m0 = z6;
                        return;
                    }
                }
                if (obj instanceof i) {
                    iVar = (i) obj;
                    if (i11 == 0) {
                        iVar.b(23, i13);
                        iVar.d(80, z6);
                        return;
                    } else {
                        iVar.b(21, i13);
                        iVar.d(81, z6);
                        return;
                    }
                }
                return;
            }
            dimensionPixelSize = typedArray.getDimensionPixelSize(i10, 0);
            z6 = false;
            i13 = dimensionPixelSize;
            if (obj instanceof e) {
                eVar = (e) obj;
                if (i11 == 0) {
                    ((ViewGroup.MarginLayoutParams) eVar).width = i13;
                    eVar.f1115W = z6;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) eVar).height = i13;
                    eVar.f1116X = z6;
                    return;
                }
            }
            if (obj instanceof k) {
                kVar = (k) obj;
                if (i11 == 0) {
                    kVar.f1213b = i13;
                    kVar.f1231l0 = z6;
                    return;
                } else {
                    kVar.f1215c = i13;
                    kVar.f1233m0 = z6;
                    return;
                }
            }
            if (obj instanceof i) {
                iVar = (i) obj;
                if (i11 == 0) {
                    iVar.b(23, i13);
                    iVar.d(80, z6);
                    return;
                } else {
                    iVar.b(21, i13);
                    iVar.d(81, z6);
                    return;
                }
            }
            return;
        }
        String string = typedArray.getString(i10);
        if (string == null) {
            return;
        }
        int iIndexOf = string.indexOf(61);
        int length = string.length();
        if (iIndexOf <= 0 || iIndexOf >= length - 1) {
            return;
        }
        String strSubstring = string.substring(0, iIndexOf);
        String strSubstring2 = string.substring(iIndexOf + 1);
        if (strSubstring2.length() > 0) {
            String strTrim = strSubstring.trim();
            String strTrim2 = strSubstring2.trim();
            if ("ratio".equalsIgnoreCase(strTrim)) {
                if (obj instanceof e) {
                    e eVar2 = (e) obj;
                    if (i11 == 0) {
                        ((ViewGroup.MarginLayoutParams) eVar2).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) eVar2).height = 0;
                    }
                    h(eVar2, strTrim2);
                    return;
                }
                if (obj instanceof k) {
                    ((k) obj).f1247y = strTrim2;
                    return;
                } else {
                    if (obj instanceof i) {
                        ((i) obj).c(5, strTrim2);
                        return;
                    }
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(strTrim)) {
                    float f10 = Float.parseFloat(strTrim2);
                    if (obj instanceof e) {
                        e eVar3 = (e) obj;
                        if (i11 == 0) {
                            ((ViewGroup.MarginLayoutParams) eVar3).width = 0;
                            eVar3.f1101H = f10;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) eVar3).height = 0;
                            eVar3.f1102I = f10;
                            return;
                        }
                    }
                    if (obj instanceof k) {
                        k kVar2 = (k) obj;
                        if (i11 == 0) {
                            kVar2.f1213b = 0;
                            kVar2.f1206U = f10;
                            return;
                        } else {
                            kVar2.f1215c = 0;
                            kVar2.f1205T = f10;
                            return;
                        }
                    }
                    if (obj instanceof i) {
                        i iVar2 = (i) obj;
                        if (i11 == 0) {
                            iVar2.b(23, 0);
                            iVar2.a(39, f10);
                            return;
                        } else {
                            iVar2.b(21, 0);
                            iVar2.a(40, f10);
                            return;
                        }
                    }
                    return;
                }
                if ("parent".equalsIgnoreCase(strTrim)) {
                    float fMax = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(strTrim2)));
                    if (obj instanceof e) {
                        e eVar4 = (e) obj;
                        if (i11 == 0) {
                            ((ViewGroup.MarginLayoutParams) eVar4).width = 0;
                            eVar4.f1110R = fMax;
                            eVar4.f1105L = 2;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) eVar4).height = 0;
                            eVar4.f1111S = fMax;
                            eVar4.f1106M = 2;
                            return;
                        }
                    }
                    if (obj instanceof k) {
                        k kVar3 = (k) obj;
                        if (i11 == 0) {
                            kVar3.f1213b = 0;
                            kVar3.f1217d0 = fMax;
                            kVar3.f1209X = 2;
                            return;
                        } else {
                            kVar3.f1215c = 0;
                            kVar3.f1219e0 = fMax;
                            kVar3.f1210Y = 2;
                            return;
                        }
                    }
                    if (obj instanceof i) {
                        i iVar3 = (i) obj;
                        if (i11 == 0) {
                            iVar3.b(23, 0);
                            iVar3.b(54, 2);
                        } else {
                            iVar3.b(21, 0);
                            iVar3.b(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    public static void h(e eVar, String str) {
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            byte b3 = -1;
            int i10 = 0;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                if (strSubstring.equalsIgnoreCase("W")) {
                    b3 = 0;
                } else if (strSubstring.equalsIgnoreCase("H")) {
                    b3 = 1;
                }
                i10 = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i10);
                    if (strSubstring2.length() > 0) {
                        Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i10, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f10 = Float.parseFloat(strSubstring3);
                        float f11 = Float.parseFloat(strSubstring4);
                        if (f10 > 0.0f && f11 > 0.0f) {
                            if (b3 == 1) {
                                Math.abs(f11 / f10);
                            } else {
                                Math.abs(f10 / f11);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        eVar.f1100G = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(ConstraintLayout constraintLayout) {
        boolean z6;
        String resourceEntryName;
        int childCount = constraintLayout.getChildCount();
        HashMap map = this.f1276c;
        HashSet<Integer> hashSet = new HashSet(map.keySet());
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            int id = childAt.getId();
            if (!map.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder("id unknown ");
                try {
                    resourceEntryName = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    resourceEntryName = "UNKNOWN";
                }
                sb.append(resourceEntryName);
                Log.w("ConstraintSet", sb.toString());
            } else {
                if (this.f1275b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1 && map.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    j jVar = (j) map.get(Integer.valueOf(id));
                    if (jVar != null) {
                        if (childAt instanceof a) {
                            k kVar = jVar.f1183d;
                            kVar.f1224h0 = 1;
                            a aVar = (a) childAt;
                            aVar.setId(id);
                            aVar.setType(kVar.f0);
                            aVar.setMargin(kVar.f1222g0);
                            aVar.setAllowsGoneWidget(kVar.f1235n0);
                            int[] iArr = kVar.f1226i0;
                            if (iArr != null) {
                                aVar.setReferencedIds(iArr);
                            } else {
                                String str = kVar.f1227j0;
                                if (str != null) {
                                    int[] iArrC = c(aVar, str);
                                    kVar.f1226i0 = iArrC;
                                    aVar.setReferencedIds(iArrC);
                                }
                            }
                        }
                        e eVar = (e) childAt.getLayoutParams();
                        eVar.a();
                        jVar.a(eVar);
                        HashMap map2 = jVar.f1185f;
                        Class<?> cls = childAt.getClass();
                        for (String strH : map2.keySet()) {
                            b bVar = (b) map2.get(strH);
                            if (!bVar.a) {
                                strH = E0.a.h("set", strH);
                            }
                            try {
                                int iD = p239z.e.d(bVar.f1081b);
                                Class<?> cls2 = Float.TYPE;
                                Class<?> cls3 = Integer.TYPE;
                                switch (iD) {
                                    case 0:
                                        cls.getMethod(strH, cls3).invoke(childAt, Integer.valueOf(bVar.f1082c));
                                        break;
                                    case 1:
                                        cls.getMethod(strH, cls2).invoke(childAt, Float.valueOf(bVar.f1083d));
                                        break;
                                    case 2:
                                        cls.getMethod(strH, cls3).invoke(childAt, Integer.valueOf(bVar.f1086g));
                                        break;
                                    case 3:
                                        Method method = cls.getMethod(strH, Drawable.class);
                                        ColorDrawable colorDrawable = new ColorDrawable();
                                        colorDrawable.setColor(bVar.f1086g);
                                        method.invoke(childAt, colorDrawable);
                                        break;
                                    case 4:
                                        cls.getMethod(strH, CharSequence.class).invoke(childAt, bVar.f1084e);
                                        break;
                                    case 5:
                                        cls.getMethod(strH, Boolean.TYPE).invoke(childAt, Boolean.valueOf(bVar.f1085f));
                                        break;
                                    case 6:
                                        cls.getMethod(strH, cls2).invoke(childAt, Float.valueOf(bVar.f1083d));
                                        break;
                                    case 7:
                                        cls.getMethod(strH, cls3).invoke(childAt, Integer.valueOf(bVar.f1082c));
                                        break;
                                }
                            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                            }
                        }
                        childAt.setLayoutParams(eVar);
                        m mVar = jVar.f1181b;
                        if (mVar.f1257b == 0) {
                            childAt.setVisibility(mVar.a);
                        }
                        childAt.setAlpha(mVar.f1258c);
                        n nVar = jVar.f1184e;
                        childAt.setRotation(nVar.a);
                        childAt.setRotationX(nVar.f1261b);
                        childAt.setRotationY(nVar.f1262c);
                        childAt.setScaleX(nVar.f1263d);
                        childAt.setScaleY(nVar.f1264e);
                        if (nVar.f1267h != -1) {
                            View viewFindViewById = ((View) childAt.getParent()).findViewById(nVar.f1267h);
                            if (viewFindViewById != null) {
                                float bottom = (viewFindViewById.getBottom() + viewFindViewById.getTop()) / 2.0f;
                                float right = (viewFindViewById.getRight() + viewFindViewById.getLeft()) / 2.0f;
                                if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                    float left = right - childAt.getLeft();
                                    float top = bottom - childAt.getTop();
                                    childAt.setPivotX(left);
                                    childAt.setPivotY(top);
                                }
                            }
                        } else {
                            if (!Float.isNaN(nVar.f1265f)) {
                                childAt.setPivotX(nVar.f1265f);
                            }
                            if (!Float.isNaN(nVar.f1266g)) {
                                childAt.setPivotY(nVar.f1266g);
                            }
                        }
                        childAt.setTranslationX(nVar.f1268i);
                        childAt.setTranslationY(nVar.j);
                        childAt.setTranslationZ(nVar.f1269k);
                        if (nVar.f1270l) {
                            childAt.setElevation(nVar.f1271m);
                        }
                    }
                }
            }
        }
        boolean z10 = false;
        for (Integer num : hashSet) {
            j jVar2 = (j) map.get(num);
            if (jVar2 != null) {
                k kVar2 = jVar2.f1183d;
                if (kVar2.f1224h0 == 1) {
                    Context context = constraintLayout.getContext();
                    a aVar2 = new a(context);
                    aVar2.f1087s = new int[32];
                    aVar2.f1093y = new HashMap();
                    aVar2.f1089u = context;
                    B.a aVar3 = new B.a();
                    z6 = z10 ? 1 : 0;
                    aVar3.f402s0 = z6 ? 1 : 0;
                    aVar3.f403t0 = true;
                    aVar3.f404u0 = z6 ? 1 : 0;
                    aVar3.f405v0 = z6;
                    aVar2.f1079B = aVar3;
                    aVar2.f1090v = aVar3;
                    aVar2.i();
                    aVar2.setVisibility(8);
                    aVar2.setId(num.intValue());
                    int[] iArr2 = kVar2.f1226i0;
                    if (iArr2 != null) {
                        aVar2.setReferencedIds(iArr2);
                    } else {
                        String str2 = kVar2.f1227j0;
                        if (str2 != null) {
                            int[] iArrC2 = c(aVar2, str2);
                            kVar2.f1226i0 = iArrC2;
                            aVar2.setReferencedIds(iArrC2);
                        }
                    }
                    aVar2.setType(kVar2.f0);
                    aVar2.setMargin(kVar2.f1222g0);
                    e eVarG = ConstraintLayout.g();
                    aVar2.i();
                    jVar2.a(eVarG);
                    constraintLayout.addView(aVar2, eVarG);
                } else {
                    z6 = z10 ? 1 : 0;
                }
                if (kVar2.a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    e eVarG2 = ConstraintLayout.g();
                    jVar2.a(eVarG2);
                    constraintLayout.addView(guideline, eVarG2);
                }
                z10 = z6;
            }
        }
        for (int i11 = (z10 ? 1 : 0) == true ? 1 : 0; i11 < childCount; i11++) {
            View childAt2 = constraintLayout.getChildAt(i11);
            if (childAt2 instanceof c) {
                ((c) childAt2).e(constraintLayout);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        int i10;
        int i11;
        o oVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map = oVar.f1276c;
        map.clear();
        int i12 = 0;
        while (i12 < childCount) {
            View childAt = constraintLayout.getChildAt(i12);
            e eVar = (e) childAt.getLayoutParams();
            int id = childAt.getId();
            if (oVar.f1275b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map.containsKey(Integer.valueOf(id))) {
                map.put(Integer.valueOf(id), new j());
            }
            j jVar = (j) map.get(Integer.valueOf(id));
            if (jVar == null) {
                i10 = childCount;
            } else {
                HashMap map2 = oVar.a;
                HashMap map3 = new HashMap();
                Class<?> cls = childAt.getClass();
                for (String str : map2.keySet()) {
                    b bVar = (b) map2.get(str);
                    try {
                        if (str.equals("BackgroundColor")) {
                            map3.put(str, new b(bVar, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                            i11 = childCount;
                        } else {
                            i11 = childCount;
                            try {
                                map3.put(str, new b(bVar, cls.getMethod("getMap" + str, new Class[0]).invoke(childAt, new Object[0])));
                            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                            }
                        }
                    } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                    }
                    childCount = i11;
                }
                i10 = childCount;
                jVar.f1185f = map3;
                jVar.a = id;
                int i13 = eVar.f1125e;
                k kVar = jVar.f1183d;
                kVar.f1223h = i13;
                kVar.f1225i = eVar.f1127f;
                kVar.j = eVar.f1128g;
                kVar.f1228k = eVar.f1130h;
                kVar.f1230l = eVar.f1132i;
                kVar.f1232m = eVar.j;
                kVar.f1234n = eVar.f1135k;
                kVar.f1236o = eVar.f1137l;
                kVar.f1238p = eVar.f1139m;
                kVar.f1239q = eVar.f1141n;
                kVar.f1240r = eVar.f1143o;
                kVar.f1241s = eVar.f1149s;
                kVar.f1242t = eVar.f1150t;
                kVar.f1243u = eVar.f1151u;
                kVar.f1244v = eVar.f1152v;
                kVar.f1245w = eVar.f1098E;
                kVar.f1246x = eVar.f1099F;
                kVar.f1247y = eVar.f1100G;
                kVar.f1248z = eVar.f1145p;
                kVar.f1187A = eVar.f1147q;
                kVar.f1188B = eVar.f1148r;
                kVar.f1189C = eVar.f1112T;
                kVar.f1190D = eVar.f1113U;
                kVar.f1191E = eVar.f1114V;
                kVar.f1220f = eVar.f1122c;
                kVar.f1216d = eVar.a;
                kVar.f1218e = eVar.f1120b;
                kVar.f1213b = ((ViewGroup.MarginLayoutParams) eVar).width;
                kVar.f1215c = ((ViewGroup.MarginLayoutParams) eVar).height;
                kVar.f1192F = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
                kVar.f1193G = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
                kVar.f1194H = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                kVar.f1195I = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                kVar.f1198L = eVar.f1097D;
                kVar.f1205T = eVar.f1102I;
                kVar.f1206U = eVar.f1101H;
                kVar.f1208W = eVar.f1104K;
                kVar.f1207V = eVar.f1103J;
                kVar.f1231l0 = eVar.f1115W;
                kVar.f1233m0 = eVar.f1116X;
                kVar.f1209X = eVar.f1105L;
                kVar.f1210Y = eVar.f1106M;
                kVar.f1211Z = eVar.P;
                kVar.f1212a0 = eVar.f1109Q;
                kVar.f1214b0 = eVar.f1107N;
                kVar.c0 = eVar.f1108O;
                kVar.f1217d0 = eVar.f1110R;
                kVar.f1219e0 = eVar.f1111S;
                kVar.f1229k0 = eVar.f1117Y;
                kVar.f1200N = eVar.f1154x;
                kVar.P = eVar.f1156z;
                kVar.f1199M = eVar.f1153w;
                kVar.f1201O = eVar.f1155y;
                kVar.f1203R = eVar.f1094A;
                kVar.f1202Q = eVar.f1095B;
                kVar.f1204S = eVar.f1096C;
                kVar.f1237o0 = eVar.f1118Z;
                kVar.f1196J = eVar.getMarginEnd();
                kVar.f1197K = eVar.getMarginStart();
                int visibility = childAt.getVisibility();
                m mVar = jVar.f1181b;
                mVar.a = visibility;
                mVar.f1258c = childAt.getAlpha();
                float rotation = childAt.getRotation();
                n nVar = jVar.f1184e;
                nVar.a = rotation;
                nVar.f1261b = childAt.getRotationX();
                nVar.f1262c = childAt.getRotationY();
                nVar.f1263d = childAt.getScaleX();
                nVar.f1264e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    nVar.f1265f = pivotX;
                    nVar.f1266g = pivotY;
                }
                nVar.f1268i = childAt.getTranslationX();
                nVar.j = childAt.getTranslationY();
                nVar.f1269k = childAt.getTranslationZ();
                if (nVar.f1270l) {
                    nVar.f1271m = childAt.getElevation();
                }
                if (childAt instanceof a) {
                    a aVar = (a) childAt;
                    kVar.f1235n0 = aVar.getAllowsGoneWidget();
                    kVar.f1226i0 = aVar.getReferencedIds();
                    kVar.f0 = aVar.getType();
                    kVar.f1222g0 = aVar.getMargin();
                }
            }
            i12++;
            oVar = this;
            childCount = i10;
        }
    }

    public final void e(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    j jVarD = d(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        jVarD.f1183d.a = true;
                    }
                    this.f1276c.put(Integer.valueOf(jVarD.a), jVarD);
                }
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }
}

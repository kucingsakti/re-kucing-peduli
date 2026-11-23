package androidx.constraintlayout.widget;

import A1.C0099h;
import B.a;
import B.d;
import B.e;
import B.j;
import C.i;
import C.k;
import C.m;
import E.c;
import E.f;
import E.g;
import E.h;
import E.o;
import E.p;
import E.r;
import E.s;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.measurement.S;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import org.chromium.net.UrlRequest;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static s f6289H;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f6290A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public o f6291B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public S f6292C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f6293D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public HashMap f6294E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final SparseArray f6295F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final f f6296G;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final SparseArray f6297s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f6298t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final e f6299u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f6300v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f6301w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f6302x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f6303y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f6304z;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6297s = new SparseArray();
        this.f6298t = new ArrayList(4);
        this.f6299u = new e();
        this.f6300v = 0;
        this.f6301w = 0;
        this.f6302x = Integer.MAX_VALUE;
        this.f6303y = Integer.MAX_VALUE;
        this.f6304z = true;
        this.f6290A = 257;
        this.f6291B = null;
        this.f6292C = null;
        this.f6293D = -1;
        this.f6294E = new HashMap();
        this.f6295F = new SparseArray();
        this.f6296G = new f(this, this);
        i(attributeSet, 0);
    }

    public static E.e g() {
        E.e eVar = new E.e(-2, -2);
        eVar.a = -1;
        eVar.f1120b = -1;
        eVar.f1122c = -1.0f;
        eVar.f1123d = true;
        eVar.f1125e = -1;
        eVar.f1127f = -1;
        eVar.f1128g = -1;
        eVar.f1130h = -1;
        eVar.f1132i = -1;
        eVar.j = -1;
        eVar.f1135k = -1;
        eVar.f1137l = -1;
        eVar.f1139m = -1;
        eVar.f1141n = -1;
        eVar.f1143o = -1;
        eVar.f1145p = -1;
        eVar.f1147q = 0;
        eVar.f1148r = 0.0f;
        eVar.f1149s = -1;
        eVar.f1150t = -1;
        eVar.f1151u = -1;
        eVar.f1152v = -1;
        eVar.f1153w = Integer.MIN_VALUE;
        eVar.f1154x = Integer.MIN_VALUE;
        eVar.f1155y = Integer.MIN_VALUE;
        eVar.f1156z = Integer.MIN_VALUE;
        eVar.f1094A = Integer.MIN_VALUE;
        eVar.f1095B = Integer.MIN_VALUE;
        eVar.f1096C = Integer.MIN_VALUE;
        eVar.f1097D = 0;
        eVar.f1098E = 0.5f;
        eVar.f1099F = 0.5f;
        eVar.f1100G = null;
        eVar.f1101H = -1.0f;
        eVar.f1102I = -1.0f;
        eVar.f1103J = 0;
        eVar.f1104K = 0;
        eVar.f1105L = 0;
        eVar.f1106M = 0;
        eVar.f1107N = 0;
        eVar.f1108O = 0;
        eVar.P = 0;
        eVar.f1109Q = 0;
        eVar.f1110R = 1.0f;
        eVar.f1111S = 1.0f;
        eVar.f1112T = -1;
        eVar.f1113U = -1;
        eVar.f1114V = -1;
        eVar.f1115W = false;
        eVar.f1116X = false;
        eVar.f1117Y = null;
        eVar.f1118Z = 0;
        eVar.f1119a0 = true;
        eVar.f1121b0 = true;
        eVar.c0 = false;
        eVar.f1124d0 = false;
        eVar.f1126e0 = false;
        eVar.f0 = -1;
        eVar.f1129g0 = -1;
        eVar.f1131h0 = -1;
        eVar.f1133i0 = -1;
        eVar.f1134j0 = Integer.MIN_VALUE;
        eVar.f1136k0 = Integer.MIN_VALUE;
        eVar.f1138l0 = 0.5f;
        eVar.f1146p0 = new d();
        return eVar;
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static s getSharedValues() {
        if (f6289H == null) {
            s sVar = new s();
            new SparseIntArray();
            new HashMap();
            f6289H = sVar;
        }
        return f6289H;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof E.e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f6298t;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                ((c) arrayList.get(i10)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i12 = Integer.parseInt(strArrSplit[0]);
                        int i13 = Integer.parseInt(strArrSplit[1]);
                        int i14 = Integer.parseInt(strArrSplit[2]);
                        int i15 = (int) ((i12 / 1080.0f) * width);
                        int i16 = (int) ((i13 / 1920.0f) * height);
                        int i17 = (int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f10 = i15;
                        float f11 = i16;
                        float f12 = i15 + ((int) ((i14 / 1080.0f) * width));
                        canvas.drawLine(f10, f11, f12, f11, paint);
                        float f13 = i16 + i17;
                        canvas.drawLine(f12, f11, f12, f13, paint);
                        canvas.drawLine(f12, f13, f10, f13, paint);
                        canvas.drawLine(f10, f13, f10, f11, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f10, f11, f12, f13, paint);
                        canvas.drawLine(f10, f13, f12, f11, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.f6304z = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return g();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        E.e eVar = new E.e(context, attributeSet);
        eVar.a = -1;
        eVar.f1120b = -1;
        eVar.f1122c = -1.0f;
        eVar.f1123d = true;
        eVar.f1125e = -1;
        eVar.f1127f = -1;
        eVar.f1128g = -1;
        eVar.f1130h = -1;
        eVar.f1132i = -1;
        eVar.j = -1;
        eVar.f1135k = -1;
        eVar.f1137l = -1;
        eVar.f1139m = -1;
        eVar.f1141n = -1;
        eVar.f1143o = -1;
        eVar.f1145p = -1;
        eVar.f1147q = 0;
        eVar.f1148r = 0.0f;
        eVar.f1149s = -1;
        eVar.f1150t = -1;
        eVar.f1151u = -1;
        eVar.f1152v = -1;
        eVar.f1153w = Integer.MIN_VALUE;
        eVar.f1154x = Integer.MIN_VALUE;
        eVar.f1155y = Integer.MIN_VALUE;
        eVar.f1156z = Integer.MIN_VALUE;
        eVar.f1094A = Integer.MIN_VALUE;
        eVar.f1095B = Integer.MIN_VALUE;
        eVar.f1096C = Integer.MIN_VALUE;
        eVar.f1097D = 0;
        eVar.f1098E = 0.5f;
        eVar.f1099F = 0.5f;
        eVar.f1100G = null;
        eVar.f1101H = -1.0f;
        eVar.f1102I = -1.0f;
        eVar.f1103J = 0;
        eVar.f1104K = 0;
        eVar.f1105L = 0;
        eVar.f1106M = 0;
        eVar.f1107N = 0;
        eVar.f1108O = 0;
        eVar.P = 0;
        eVar.f1109Q = 0;
        eVar.f1110R = 1.0f;
        eVar.f1111S = 1.0f;
        eVar.f1112T = -1;
        eVar.f1113U = -1;
        eVar.f1114V = -1;
        eVar.f1115W = false;
        eVar.f1116X = false;
        eVar.f1117Y = null;
        eVar.f1118Z = 0;
        eVar.f1119a0 = true;
        eVar.f1121b0 = true;
        eVar.c0 = false;
        eVar.f1124d0 = false;
        eVar.f1126e0 = false;
        eVar.f0 = -1;
        eVar.f1129g0 = -1;
        eVar.f1131h0 = -1;
        eVar.f1133i0 = -1;
        eVar.f1134j0 = Integer.MIN_VALUE;
        eVar.f1136k0 = Integer.MIN_VALUE;
        eVar.f1138l0 = 0.5f;
        eVar.f1146p0 = new d();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f1277b);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            int i11 = E.d.a.get(index);
            switch (i11) {
                case 1:
                    eVar.f1114V = typedArrayObtainStyledAttributes.getInt(index, eVar.f1114V);
                    break;
                case 2:
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f1145p);
                    eVar.f1145p = resourceId;
                    if (resourceId == -1) {
                        eVar.f1145p = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 3:
                    eVar.f1147q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f1147q);
                    break;
                case 4:
                    float f10 = typedArrayObtainStyledAttributes.getFloat(index, eVar.f1148r) % 360.0f;
                    eVar.f1148r = f10;
                    if (f10 < 0.0f) {
                        eVar.f1148r = (360.0f - f10) % 360.0f;
                    }
                    break;
                case 5:
                    eVar.a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, eVar.a);
                    break;
                case 6:
                    eVar.f1120b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, eVar.f1120b);
                    break;
                case 7:
                    eVar.f1122c = typedArrayObtainStyledAttributes.getFloat(index, eVar.f1122c);
                    break;
                case 8:
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f1125e);
                    eVar.f1125e = resourceId2;
                    if (resourceId2 == -1) {
                        eVar.f1125e = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 9:
                    int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f1127f);
                    eVar.f1127f = resourceId3;
                    if (resourceId3 == -1) {
                        eVar.f1127f = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 10:
                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f1128g);
                    eVar.f1128g = resourceId4;
                    if (resourceId4 == -1) {
                        eVar.f1128g = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 11:
                    int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f1130h);
                    eVar.f1130h = resourceId5;
                    if (resourceId5 == -1) {
                        eVar.f1130h = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f1132i);
                    eVar.f1132i = resourceId6;
                    if (resourceId6 == -1) {
                        eVar.f1132i = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.j);
                    eVar.j = resourceId7;
                    if (resourceId7 == -1) {
                        eVar.j = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f1135k);
                    eVar.f1135k = resourceId8;
                    if (resourceId8 == -1) {
                        eVar.f1135k = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 15:
                    int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f1137l);
                    eVar.f1137l = resourceId9;
                    if (resourceId9 == -1) {
                        eVar.f1137l = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 16:
                    int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f1139m);
                    eVar.f1139m = resourceId10;
                    if (resourceId10 == -1) {
                        eVar.f1139m = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 17:
                    int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f1149s);
                    eVar.f1149s = resourceId11;
                    if (resourceId11 == -1) {
                        eVar.f1149s = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 18:
                    int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f1150t);
                    eVar.f1150t = resourceId12;
                    if (resourceId12 == -1) {
                        eVar.f1150t = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 19:
                    int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f1151u);
                    eVar.f1151u = resourceId13;
                    if (resourceId13 == -1) {
                        eVar.f1151u = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 20:
                    int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f1152v);
                    eVar.f1152v = resourceId14;
                    if (resourceId14 == -1) {
                        eVar.f1152v = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case MobileAdsBridge.CODE_21 /* 21 */:
                    eVar.f1153w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f1153w);
                    break;
                case 22:
                    eVar.f1154x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f1154x);
                    break;
                case 23:
                    eVar.f1155y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f1155y);
                    break;
                case 24:
                    eVar.f1156z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f1156z);
                    break;
                case 25:
                    eVar.f1094A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f1094A);
                    break;
                case 26:
                    eVar.f1095B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f1095B);
                    break;
                case 27:
                    eVar.f1115W = typedArrayObtainStyledAttributes.getBoolean(index, eVar.f1115W);
                    break;
                case 28:
                    eVar.f1116X = typedArrayObtainStyledAttributes.getBoolean(index, eVar.f1116X);
                    break;
                case 29:
                    eVar.f1098E = typedArrayObtainStyledAttributes.getFloat(index, eVar.f1098E);
                    break;
                case 30:
                    eVar.f1099F = typedArrayObtainStyledAttributes.getFloat(index, eVar.f1099F);
                    break;
                case 31:
                    eVar.f1105L = typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 32:
                    eVar.f1106M = typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 33:
                    try {
                        eVar.f1107N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f1107N);
                    } catch (Exception unused) {
                        if (typedArrayObtainStyledAttributes.getInt(index, eVar.f1107N) == -2) {
                            eVar.f1107N = -2;
                        }
                    }
                    break;
                case 34:
                    try {
                        eVar.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.P);
                    } catch (Exception unused2) {
                        if (typedArrayObtainStyledAttributes.getInt(index, eVar.P) == -2) {
                            eVar.P = -2;
                        }
                    }
                    break;
                case 35:
                    eVar.f1110R = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, eVar.f1110R));
                    eVar.f1105L = 2;
                    break;
                case 36:
                    try {
                        eVar.f1108O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f1108O);
                    } catch (Exception unused3) {
                        if (typedArrayObtainStyledAttributes.getInt(index, eVar.f1108O) == -2) {
                            eVar.f1108O = -2;
                        }
                    }
                    break;
                case 37:
                    try {
                        eVar.f1109Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f1109Q);
                    } catch (Exception unused4) {
                        if (typedArrayObtainStyledAttributes.getInt(index, eVar.f1109Q) == -2) {
                            eVar.f1109Q = -2;
                        }
                    }
                    break;
                case 38:
                    eVar.f1111S = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, eVar.f1111S));
                    eVar.f1106M = 2;
                    break;
                default:
                    switch (i11) {
                        case 44:
                            o.h(eVar, typedArrayObtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            eVar.f1101H = typedArrayObtainStyledAttributes.getFloat(index, eVar.f1101H);
                            break;
                        case 46:
                            eVar.f1102I = typedArrayObtainStyledAttributes.getFloat(index, eVar.f1102I);
                            break;
                        case 47:
                            eVar.f1103J = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            eVar.f1104K = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            eVar.f1112T = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, eVar.f1112T);
                            break;
                        case 50:
                            eVar.f1113U = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, eVar.f1113U);
                            break;
                        case 51:
                            eVar.f1117Y = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f1141n);
                            eVar.f1141n = resourceId15;
                            if (resourceId15 == -1) {
                                eVar.f1141n = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            break;
                        case 53:
                            int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f1143o);
                            eVar.f1143o = resourceId16;
                            if (resourceId16 == -1) {
                                eVar.f1143o = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            break;
                        case 54:
                            eVar.f1097D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f1097D);
                            break;
                        case 55:
                            eVar.f1096C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f1096C);
                            break;
                        default:
                            switch (i11) {
                                case 64:
                                    o.g(eVar, typedArrayObtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    o.g(eVar, typedArrayObtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    eVar.f1118Z = typedArrayObtainStyledAttributes.getInt(index, eVar.f1118Z);
                                    break;
                                case 67:
                                    eVar.f1123d = typedArrayObtainStyledAttributes.getBoolean(index, eVar.f1123d);
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        eVar.a();
        return eVar;
    }

    public int getMaxHeight() {
        return this.f6303y;
    }

    public int getMaxWidth() {
        return this.f6302x;
    }

    public int getMinHeight() {
        return this.f6301w;
    }

    public int getMinWidth() {
        return this.f6300v;
    }

    public int getOptimizationLevel() {
        return this.f6299u.f495D0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        e eVar = this.f6299u;
        if (eVar.j == null) {
            int id2 = getId();
            if (id2 != -1) {
                eVar.j = getContext().getResources().getResourceEntryName(id2);
            } else {
                eVar.j = "parent";
            }
        }
        if (eVar.f466h0 == null) {
            eVar.f466h0 = eVar.j;
        }
        for (d dVar : eVar.f504q0) {
            View view = dVar.f0;
            if (view != null) {
                if (dVar.j == null && (id = view.getId()) != -1) {
                    dVar.j = getContext().getResources().getResourceEntryName(id);
                }
                if (dVar.f466h0 == null) {
                    dVar.f466h0 = dVar.j;
                }
            }
        }
        eVar.n(sb);
        return sb.toString();
    }

    public final d h(View view) {
        if (view == this) {
            return this.f6299u;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof E.e) {
            return ((E.e) view.getLayoutParams()).f1146p0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof E.e) {
            return ((E.e) view.getLayoutParams()).f1146p0;
        }
        return null;
    }

    public final void i(AttributeSet attributeSet, int i10) {
        e eVar = this.f6299u;
        eVar.f0 = this;
        f fVar = this.f6296G;
        eVar.f508u0 = fVar;
        eVar.f506s0.f817f = fVar;
        this.f6297s.put(getId(), this);
        this.f6291B = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f1277b, i10, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                if (index == 16) {
                    this.f6300v = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f6300v);
                } else if (index == 17) {
                    this.f6301w = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f6301w);
                } else if (index == 14) {
                    this.f6302x = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f6302x);
                } else if (index == 15) {
                    this.f6303y = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f6303y);
                } else if (index == 113) {
                    this.f6290A = typedArrayObtainStyledAttributes.getInt(index, this.f6290A);
                } else if (index == 56) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            j(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f6292C = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        o oVar = new o();
                        this.f6291B = oVar;
                        oVar.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f6291B = null;
                    }
                    this.f6293D = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        eVar.f495D0 = this.f6290A;
        p239z.c.f16263q = eVar.W(512);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006d  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void j(int i10) {
        Context context = getContext();
        S s9 = new S(3, false);
        s9.f8359t = new SparseArray();
        s9.f8360u = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            int eventType = xml.getEventType();
            g gVar = null;
            while (true) {
                byte b3 = 1;
                if (eventType != 1) {
                    if (eventType == 2) {
                        String name = xml.getName();
                        switch (name.hashCode()) {
                            case -1349929691:
                                if (!name.equals("ConstraintSet")) {
                                    b3 = -1;
                                } else {
                                    b3 = 4;
                                }
                                break;
                            case 80204913:
                                if (!name.equals("State")) {
                                    b3 = -1;
                                } else {
                                    b3 = 2;
                                }
                                break;
                            case 1382829617:
                                if (!name.equals("StateSet")) {
                                    b3 = -1;
                                }
                                break;
                            case 1657696882:
                                if (!name.equals("layoutDescription")) {
                                    b3 = -1;
                                } else {
                                    b3 = 0;
                                }
                                break;
                            case 1901439077:
                                if (!name.equals("Variant")) {
                                    b3 = -1;
                                } else {
                                    b3 = 3;
                                }
                                break;
                            default:
                                b3 = -1;
                                break;
                        }
                        if (b3 == 2) {
                            g gVar2 = new g(context, xml);
                            ((SparseArray) s9.f8359t).put(gVar2.f1164s, gVar2);
                            gVar = gVar2;
                        } else if (b3 == 3) {
                            h hVar = new h(context, xml);
                            if (gVar != null) {
                                ((ArrayList) gVar.f1166u).add(hVar);
                            }
                        } else if (b3 == 4) {
                            s9.u(context, xml);
                        }
                    }
                    eventType = xml.next();
                }
                this.f6292C = s9;
                return;
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:159:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:161:0x0313  */
    /* JADX WARN: Code duplicated, block: B:163:0x0316  */
    /* JADX WARN: Code duplicated, block: B:168:0x0338  */
    /* JADX WARN: Code duplicated, block: B:177:0x0355  */
    /* JADX WARN: Code duplicated, block: B:402:0x0384 A[SYNTHETIC] */
    public final void k(e eVar, int i10, int i11, int i12) {
        int iMin;
        int iMax;
        int iMin2;
        int iMax2;
        int i13;
        boolean z6;
        int i14;
        int i15;
        boolean z10;
        int i16;
        boolean zT;
        ArrayList arrayList;
        int i17;
        boolean z11;
        boolean z12;
        k kVar;
        m mVar;
        int i18;
        int i19;
        int i20;
        int i21;
        int[] iArr;
        int i22;
        int i23;
        boolean z13;
        Iterator it;
        boolean z14;
        C.o oVar;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        int iMax3 = Math.max(0, getPaddingTop());
        int iMax4 = Math.max(0, getPaddingBottom());
        int i24 = iMax3 + iMax4;
        int paddingWidth = getPaddingWidth();
        f fVar = this.f6296G;
        fVar.f1157b = iMax3;
        fVar.f1158c = iMax4;
        fVar.f1159d = paddingWidth;
        fVar.f1160e = i24;
        fVar.f1161f = i11;
        fVar.f1162g = i12;
        int iMax5 = Math.max(0, getPaddingStart());
        int iMax6 = Math.max(0, getPaddingEnd());
        int i25 = 1;
        if (iMax5 <= 0 && iMax6 <= 0) {
            iMax5 = Math.max(0, getPaddingLeft());
        } else if ((getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection()) {
            iMax5 = iMax6;
        }
        int i26 = size - paddingWidth;
        int i27 = size2 - i24;
        int i28 = fVar.f1160e;
        int i29 = fVar.f1159d;
        int childCount = getChildCount();
        if (mode == Integer.MIN_VALUE) {
            if (childCount == 0) {
                iMax = Math.max(0, this.f6300v);
                iMin = iMax;
            } else {
                iMin = i26;
            }
            i25 = 2;
        } else if (mode == 0) {
            if (childCount == 0) {
                iMax = Math.max(0, this.f6300v);
                iMin = iMax;
            } else {
                iMin = 0;
            }
            i25 = 2;
        } else if (mode != 1073741824) {
            iMin = 0;
        } else {
            iMin = Math.min(this.f6302x - i29, i26);
            i25 = 1;
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (childCount == 0) {
                iMax2 = Math.max(0, this.f6301w);
                iMin2 = iMax2;
            } else {
                iMin2 = i27;
            }
            i13 = 2;
        } else if (mode2 != 0) {
            iMin2 = mode2 != 1073741824 ? 0 : Math.min(this.f6303y - i28, i27);
            i13 = 1;
        } else {
            if (childCount == 0) {
                iMax2 = Math.max(0, this.f6301w);
                iMin2 = iMax2;
            } else {
                iMin2 = 0;
            }
            i13 = 2;
        }
        int iQ = eVar.q();
        C.e eVar2 = eVar.f506s0;
        int i30 = iMin;
        if (i30 != iQ || iMin2 != eVar.k()) {
            eVar2.f814c = true;
        }
        eVar.f452Y = 0;
        eVar.f453Z = 0;
        int i31 = this.f6302x - i29;
        int[] iArr2 = eVar.f431C;
        iArr2[0] = i31;
        iArr2[1] = this.f6303y - i28;
        eVar.f456b0 = 0;
        eVar.c0 = 0;
        eVar.M(i25);
        eVar.O(i30);
        eVar.N(i13);
        eVar.L(iMin2);
        int i32 = this.f6300v - i29;
        if (i32 < 0) {
            eVar.f456b0 = 0;
        } else {
            eVar.f456b0 = i32;
        }
        int i33 = this.f6301w - i28;
        if (i33 < 0) {
            eVar.c0 = 0;
        } else {
            eVar.c0 = i33;
        }
        eVar.f511x0 = iMax5;
        eVar.f512y0 = iMax3;
        C0099h c0099h = eVar.f505r0;
        c0099h.getClass();
        f fVar2 = eVar.f508u0;
        int size3 = eVar.f504q0.size();
        int iQ2 = eVar.q();
        int iK = eVar.k();
        boolean zC = j.c(i10, 128);
        boolean z15 = zC || j.c(i10, 64);
        if (z15) {
            int i34 = 0;
            while (true) {
                if (i34 < size3) {
                    d dVar = (d) eVar.f504q0.get(i34);
                    boolean z16 = z15;
                    int[] iArr3 = dVar.f481p0;
                    i14 = size3;
                    boolean z17 = (iArr3[0] == 3) && (iArr3[1] == 3) && dVar.f450W > 0.0f;
                    if ((dVar.x() && z17) || ((dVar.y() && z17) || (dVar instanceof B.g) || dVar.x() || dVar.y())) {
                        i15 = 1073741824;
                        z6 = false;
                    } else {
                        i34++;
                        z15 = z16;
                        size3 = i14;
                    }
                } else {
                    z6 = z15;
                    i14 = size3;
                    i15 = 1073741824;
                }
            }
        } else {
            z6 = z15;
            i14 = size3;
            i15 = 1073741824;
        }
        boolean z18 = z6 & ((mode == i15 && mode2 == i15) || zC);
        if (z18) {
            int iMin3 = Math.min(iArr2[0], i26);
            int iMin4 = Math.min(iArr2[1], i27);
            if (mode == 1073741824 && eVar.q() != iMin3) {
                eVar.O(iMin3);
                eVar.f506s0.f813b = true;
            }
            if (mode2 == 1073741824 && eVar.k() != iMin4) {
                eVar.L(iMin4);
                eVar.f506s0.f813b = true;
            }
            if (mode == 1073741824 && mode2 == 1073741824) {
                boolean z19 = eVar2.f813b;
                e eVar3 = eVar2.a;
                if (z19 || eVar2.f814c) {
                    for (d dVar2 : eVar3.f504q0) {
                        dVar2.h();
                        dVar2.a = false;
                        dVar2.f458d.n();
                        dVar2.f460e.m();
                    }
                    i20 = 0;
                    eVar3.h();
                    eVar3.a = false;
                    eVar3.f458d.n();
                    eVar3.f460e.m();
                    eVar2.f814c = false;
                } else {
                    i20 = 0;
                }
                eVar2.b(eVar2.f815d);
                eVar3.f452Y = i20;
                eVar3.f453Z = i20;
                int iJ = eVar3.j(i20);
                int iJ2 = eVar3.j(1);
                if (eVar2.f813b) {
                    eVar2.c();
                }
                int iR = eVar3.r();
                int iS = eVar3.s();
                eVar3.f458d.f846h.d(iR);
                eVar3.f460e.f846h.d(iS);
                eVar2.g();
                ArrayList<C.o> arrayList2 = eVar2.f816e;
                z10 = z18;
                if (iJ == 2 || iJ2 == 2) {
                    if (zC) {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            if (!((C.o) it2.next()).k()) {
                                zC = false;
                                break;
                            }
                        }
                    }
                    if (zC && iJ == 2) {
                        eVar3.M(1);
                        eVar3.O(eVar2.d(eVar3, 0));
                        eVar3.f458d.f843e.d(eVar3.q());
                    }
                    if (zC && iJ2 == 2) {
                        i21 = 1;
                        eVar3.N(1);
                        eVar3.L(eVar2.d(eVar3, 1));
                        eVar3.f460e.f843e.d(eVar3.k());
                    }
                    iArr = eVar3.f481p0;
                    i22 = iArr[0];
                    if (i22 != i21 || i22 == 4) {
                        int iQ3 = eVar3.q() + iR;
                        eVar3.f458d.f847i.d(iQ3);
                        eVar3.f458d.f843e.d(iQ3 - iR);
                        eVar2.g();
                        i23 = iArr[1];
                        if (i23 != 1 || i23 == 4) {
                            int iK2 = eVar3.k() + iS;
                            eVar3.f460e.f847i.d(iK2);
                            eVar3.f460e.f843e.d(iK2 - iS);
                        }
                        eVar2.g();
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    for (C.o oVar2 : arrayList2) {
                        if (oVar2.f840b == eVar3 || oVar2.f845g) {
                            oVar2.e();
                        }
                    }
                    it = arrayList2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            z14 = true;
                            break;
                        }
                        oVar = (C.o) it.next();
                        if (!z13 || oVar.f840b != eVar3) {
                            if (oVar.f846h.j || ((!oVar.f847i.j && !(oVar instanceof i)) || (!oVar.f843e.j && !(oVar instanceof C.c) && !(oVar instanceof i)))) {
                                z14 = false;
                                break;
                            }
                        }
                    }
                    eVar3.M(iJ);
                    eVar3.N(iJ2);
                    zT = z14;
                    i19 = 1073741824;
                    i16 = 2;
                } else {
                    arrayList2 = arrayList2;
                }
                i21 = 1;
                iArr = eVar3.f481p0;
                i22 = iArr[0];
                if (i22 != i21) {
                    int iQ4 = eVar3.q() + iR;
                    eVar3.f458d.f847i.d(iQ4);
                    eVar3.f458d.f843e.d(iQ4 - iR);
                    eVar2.g();
                    i23 = iArr[1];
                    if (i23 != 1) {
                        int iK3 = eVar3.k() + iS;
                        eVar3.f460e.f847i.d(iK3);
                        eVar3.f460e.f843e.d(iK3 - iS);
                    } else {
                        int iK4 = eVar3.k() + iS;
                        eVar3.f460e.f847i.d(iK4);
                        eVar3.f460e.f843e.d(iK4 - iS);
                    }
                    eVar2.g();
                    z13 = true;
                } else {
                    int iQ5 = eVar3.q() + iR;
                    eVar3.f458d.f847i.d(iQ5);
                    eVar3.f458d.f843e.d(iQ5 - iR);
                    eVar2.g();
                    i23 = iArr[1];
                    if (i23 != 1) {
                        int iK5 = eVar3.k() + iS;
                        eVar3.f460e.f847i.d(iK5);
                        eVar3.f460e.f843e.d(iK5 - iS);
                    } else {
                        int iK6 = eVar3.k() + iS;
                        eVar3.f460e.f847i.d(iK6);
                        eVar3.f460e.f843e.d(iK6 - iS);
                    }
                    eVar2.g();
                    z13 = true;
                }
                while (r2.hasNext()) {
                    if (oVar2.f840b == eVar3) {
                    }
                    oVar2.e();
                }
                it = arrayList2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        z14 = true;
                        break;
                    }
                    oVar = (C.o) it.next();
                    if (!z13) {
                    }
                    if (oVar.f846h.j) {
                    }
                    z14 = false;
                    break;
                }
                eVar3.M(iJ);
                eVar3.N(iJ2);
                zT = z14;
                i19 = 1073741824;
                i16 = 2;
            } else {
                z10 = z18;
                boolean z20 = eVar2.f813b;
                e eVar4 = eVar2.a;
                if (z20) {
                    for (d dVar3 : eVar4.f504q0) {
                        dVar3.h();
                        dVar3.a = false;
                        k kVar2 = dVar3.f458d;
                        kVar2.f843e.j = false;
                        kVar2.f845g = false;
                        kVar2.n();
                        m mVar2 = dVar3.f460e;
                        mVar2.f843e.j = false;
                        mVar2.f845g = false;
                        mVar2.m();
                    }
                    i18 = 0;
                    eVar4.h();
                    eVar4.a = false;
                    k kVar3 = eVar4.f458d;
                    kVar3.f843e.j = false;
                    kVar3.f845g = false;
                    kVar3.n();
                    m mVar3 = eVar4.f460e;
                    mVar3.f843e.j = false;
                    mVar3.f845g = false;
                    mVar3.m();
                    eVar2.c();
                } else {
                    i18 = 0;
                }
                eVar2.b(eVar2.f815d);
                eVar4.f452Y = i18;
                eVar4.f453Z = i18;
                eVar4.f458d.f846h.d(i18);
                eVar4.f460e.f846h.d(i18);
                i19 = 1073741824;
                if (mode == 1073741824) {
                    zT = eVar.T(i18, zC);
                    i16 = 1;
                } else {
                    i16 = 0;
                    zT = true;
                }
                if (mode2 == 1073741824) {
                    zT &= eVar.T(1, zC);
                    i16++;
                }
            }
            if (zT) {
                eVar.P(mode == i19, mode2 == i19);
            }
        } else {
            z10 = z18;
            i16 = 0;
            zT = false;
        }
        if (zT && i16 == 2) {
            return;
        }
        int i35 = eVar.f495D0;
        if (i14 > 0) {
            int size4 = eVar.f504q0.size();
            boolean zW = eVar.W(64);
            f fVar3 = eVar.f508u0;
            for (int i36 = 0; i36 < size4; i36++) {
                d dVar4 = (d) eVar.f504q0.get(i36);
                if (!(dVar4 instanceof B.h) && !(dVar4 instanceof a) && !dVar4.f434F && (!zW || (kVar = dVar4.f458d) == null || (mVar = dVar4.f460e) == null || !kVar.f843e.j || !mVar.f843e.j)) {
                    int iJ3 = dVar4.j(0);
                    int iJ4 = dVar4.j(1);
                    boolean z21 = iJ3 == 3 && dVar4.f483r != 1 && iJ4 == 3 && dVar4.f484s != 1;
                    if (!z21 && eVar.W(1) && !(dVar4 instanceof B.g)) {
                        if (iJ3 == 3 && dVar4.f483r == 0 && iJ4 != 3 && !dVar4.x()) {
                            z21 = true;
                        }
                        if (iJ4 == 3 && dVar4.f484s == 0 && iJ3 != 3 && !dVar4.x()) {
                            z21 = true;
                        }
                        if ((iJ3 == 3 || iJ4 == 3) && dVar4.f450W > 0.0f) {
                            z21 = true;
                        }
                    }
                    if (!z21) {
                        c0099h.o(0, dVar4, fVar3);
                    }
                }
            }
            ConstraintLayout constraintLayout = fVar3.a;
            int childCount2 = constraintLayout.getChildCount();
            for (int i37 = 0; i37 < childCount2; i37++) {
                constraintLayout.getChildAt(i37);
            }
            ArrayList arrayList3 = constraintLayout.f6298t;
            int size5 = arrayList3.size();
            if (size5 > 0) {
                for (int i38 = 0; i38 < size5; i38++) {
                    ((c) arrayList3.get(i38)).getClass();
                }
            }
        }
        c0099h.u(eVar);
        ArrayList arrayList4 = (ArrayList) c0099h.f103t;
        int size6 = arrayList4.size();
        if (i14 > 0) {
            c0099h.r(eVar, 0, iQ2, iK);
        }
        if (size6 > 0) {
            int[] iArr4 = eVar.f481p0;
            boolean z22 = iArr4[0] == 2;
            boolean z23 = iArr4[1] == 2;
            int iQ6 = eVar.q();
            e eVar5 = (e) c0099h.f105v;
            int iMax7 = Math.max(iQ6, eVar5.f456b0);
            int iMax8 = Math.max(eVar.k(), eVar5.c0);
            int i39 = 0;
            boolean z24 = false;
            while (i39 < size6) {
                d dVar5 = (d) arrayList4.get(i39);
                if (dVar5 instanceof B.g) {
                    int iQ7 = dVar5.q();
                    z11 = z23;
                    int iK7 = dVar5.k();
                    z12 = z22;
                    boolean zO = z24 | c0099h.o(1, dVar5, fVar2);
                    int iQ8 = dVar5.q();
                    boolean z25 = zO;
                    int iK8 = dVar5.k();
                    if (iQ8 != iQ7) {
                        dVar5.O(iQ8);
                        if (z12 && dVar5.r() + dVar5.f448U > iMax7) {
                            iMax7 = Math.max(iMax7, dVar5.i(4).e() + dVar5.r() + dVar5.f448U);
                        }
                        z25 = true;
                    }
                    if (iK8 != iK7) {
                        dVar5.L(iK8);
                        if (z11 && dVar5.s() + dVar5.f449V > iMax8) {
                            iMax8 = Math.max(iMax8, dVar5.i(5).e() + dVar5.s() + dVar5.f449V);
                        }
                        z25 = true;
                    }
                    z24 = z25 | ((B.g) dVar5).f562y0;
                } else {
                    z11 = z23;
                    z12 = z22;
                }
                i39++;
                z23 = z11;
                z22 = z12;
            }
            boolean z26 = z23;
            boolean z27 = z22;
            int i40 = 0;
            while (i40 < 2) {
                int i41 = 0;
                while (i41 < size6) {
                    d dVar6 = (d) arrayList4.get(i41);
                    if (((dVar6 instanceof B.i) && !(dVar6 instanceof B.g)) || (dVar6 instanceof B.h) || dVar6.f464g0 == 8 || ((z10 && dVar6.f458d.f843e.j && dVar6.f460e.f843e.j) || (dVar6 instanceof B.g))) {
                        arrayList = arrayList4;
                        i17 = size6;
                    } else {
                        int iQ9 = dVar6.q();
                        int iK9 = dVar6.k();
                        arrayList = arrayList4;
                        int i42 = dVar6.f454a0;
                        i17 = size6;
                        boolean zO2 = c0099h.o(i40 == 1 ? 2 : 1, dVar6, fVar2) | z24;
                        int iQ10 = dVar6.q();
                        boolean z28 = zO2;
                        int iK10 = dVar6.k();
                        if (iQ10 != iQ9) {
                            dVar6.O(iQ10);
                            if (z27 && dVar6.r() + dVar6.f448U > iMax7) {
                                iMax7 = Math.max(iMax7, dVar6.i(4).e() + dVar6.r() + dVar6.f448U);
                            }
                            z28 = true;
                        }
                        if (iK10 != iK9) {
                            dVar6.L(iK10);
                            if (z26 && dVar6.s() + dVar6.f449V > iMax8) {
                                iMax8 = Math.max(iMax8, dVar6.i(5).e() + dVar6.s() + dVar6.f449V);
                            }
                            z28 = true;
                        }
                        z24 = (!dVar6.f433E || i42 == dVar6.f454a0) ? z28 : true;
                    }
                    i41++;
                    arrayList4 = arrayList;
                    size6 = i17;
                }
                ArrayList arrayList5 = arrayList4;
                int i43 = size6;
                if (!z24) {
                    break;
                }
                i40++;
                c0099h.r(eVar, i40, iQ2, iK);
                arrayList4 = arrayList5;
                size6 = i43;
                z24 = false;
            }
        }
        eVar.f495D0 = i35;
        p239z.c.f16263q = eVar.W(512);
    }

    public final void l(d dVar, E.e eVar, SparseArray sparseArray, int i10, int i11) {
        View view = (View) this.f6297s.get(i10);
        d dVar2 = (d) sparseArray.get(i10);
        if (dVar2 == null || view == null || !(view.getLayoutParams() instanceof E.e)) {
            return;
        }
        eVar.c0 = true;
        if (i11 == 6) {
            E.e eVar2 = (E.e) view.getLayoutParams();
            eVar2.c0 = true;
            eVar2.f1146p0.f433E = true;
        }
        dVar.i(6).b(dVar2.i(i11), eVar.f1097D, eVar.f1096C, true);
        dVar.f433E = true;
        dVar.i(3).j();
        dVar.i(5).j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            E.e eVar = (E.e) childAt.getLayoutParams();
            d dVar = eVar.f1146p0;
            if (childAt.getVisibility() != 8 || eVar.f1124d0 || eVar.f1126e0 || zIsInEditMode) {
                int iR = dVar.r();
                int iS = dVar.s();
                childAt.layout(iR, iS, dVar.q() + iR, dVar.k() + iS);
            }
        }
        ArrayList arrayList = this.f6298t;
        int size = arrayList.size();
        if (size > 0) {
            for (int i15 = 0; i15 < size; i15++) {
                ((c) arrayList.get(i15)).getClass();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:121:0x0220  */
    /* JADX WARN: Code duplicated, block: B:160:0x032b  */
    /* JADX WARN: Code duplicated, block: B:162:0x0335  */
    /* JADX WARN: Code duplicated, block: B:165:0x0343  */
    /* JADX WARN: Code duplicated, block: B:172:0x0361  */
    /* JADX WARN: Code duplicated, block: B:174:0x036b  */
    /* JADX WARN: Code duplicated, block: B:175:0x037b  */
    /* JADX WARN: Code duplicated, block: B:177:0x0383  */
    /* JADX WARN: Code duplicated, block: B:182:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:185:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:187:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:188:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:190:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:197:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:199:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:201:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:202:0x0405  */
    /* JADX WARN: Code duplicated, block: B:204:0x040f  */
    /* JADX WARN: Code duplicated, block: B:207:0x0416  */
    /* JADX WARN: Code duplicated, block: B:210:0x041e  */
    /* JADX WARN: Code duplicated, block: B:283:0x0543  */
    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        boolean z6;
        int i12;
        boolean z10;
        d dVar;
        int i13;
        d dVar2;
        int i14;
        int i15;
        int i16;
        d dVar3;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        d dVar4;
        int i23;
        int i24;
        int i25;
        d dVar5;
        E.e eVar;
        int i26;
        int i27;
        int i28;
        d dVar6;
        int i29;
        float f10;
        d dVar7;
        d dVar8;
        int i30;
        d dVar9;
        int i31;
        int i32;
        int i33;
        int i34;
        float fAbs;
        int i35;
        byte b3;
        ArrayList arrayList;
        int i36;
        d dVar10;
        ConstraintLayout constraintLayout = this;
        boolean z11 = constraintLayout.f6304z;
        constraintLayout.f6304z = z11;
        int i37 = 0;
        int i38 = 1;
        if (!z11) {
            int childCount = constraintLayout.getChildCount();
            for (int i39 = 0; i39 < childCount; i39++) {
                if (constraintLayout.getChildAt(i39).isLayoutRequested()) {
                    constraintLayout.f6304z = true;
                    break;
                }
            }
        }
        boolean z12 = (constraintLayout.getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == constraintLayout.getLayoutDirection();
        e eVar2 = constraintLayout.f6299u;
        eVar2.f509v0 = z12;
        if (constraintLayout.f6304z) {
            constraintLayout.f6304z = false;
            int childCount2 = constraintLayout.getChildCount();
            int i40 = 0;
            while (true) {
                if (i40 >= childCount2) {
                    z6 = false;
                    break;
                } else {
                    if (constraintLayout.getChildAt(i40).isLayoutRequested()) {
                        z6 = true;
                        break;
                    }
                    i40++;
                }
            }
            if (z6) {
                boolean zIsInEditMode = constraintLayout.isInEditMode();
                int childCount3 = constraintLayout.getChildCount();
                for (int i41 = 0; i41 < childCount3; i41++) {
                    d dVarH = constraintLayout.h(constraintLayout.getChildAt(i41));
                    if (dVarH != null) {
                        dVarH.C();
                    }
                }
                Object obj = null;
                if (zIsInEditMode) {
                    int i42 = 0;
                    while (i42 < childCount3) {
                        View childAt = constraintLayout.getChildAt(i42);
                        try {
                            String resourceName = constraintLayout.getResources().getResourceName(childAt.getId());
                            Integer numValueOf = Integer.valueOf(childAt.getId());
                            if (resourceName instanceof String) {
                                if (constraintLayout.f6294E == null) {
                                    constraintLayout.f6294E = new HashMap();
                                }
                                int iIndexOf = resourceName.indexOf("/");
                                i36 = i38;
                                try {
                                    constraintLayout.f6294E.put(iIndexOf != -1 ? resourceName.substring(iIndexOf + 1) : resourceName, numValueOf);
                                } catch (Resources.NotFoundException unused) {
                                }
                            } else {
                                i36 = i38;
                            }
                            int iIndexOf2 = resourceName.indexOf(47);
                            if (iIndexOf2 != -1) {
                                resourceName = resourceName.substring(iIndexOf2 + 1);
                            }
                            int id = childAt.getId();
                            if (id != 0) {
                                View viewFindViewById = (View) constraintLayout.f6297s.get(id);
                                if (viewFindViewById == null && (viewFindViewById = constraintLayout.findViewById(id)) != null && viewFindViewById != constraintLayout && viewFindViewById.getParent() == constraintLayout) {
                                    constraintLayout.onViewAdded(viewFindViewById);
                                }
                                dVar10 = viewFindViewById == constraintLayout ? eVar2 : viewFindViewById == null ? null : ((E.e) viewFindViewById.getLayoutParams()).f1146p0;
                            }
                            dVar10.f466h0 = resourceName;
                        } catch (Resources.NotFoundException unused2) {
                            i36 = i38;
                        }
                        i42++;
                        i38 = i36;
                    }
                }
                int i43 = i38;
                if (constraintLayout.f6293D != -1) {
                    for (int i44 = 0; i44 < childCount3; i44++) {
                        constraintLayout.getChildAt(i44).getId();
                    }
                }
                o oVar = constraintLayout.f6291B;
                if (oVar != null) {
                    oVar.a(constraintLayout);
                }
                eVar2.f504q0.clear();
                ArrayList arrayList2 = constraintLayout.f6298t;
                int size = arrayList2.size();
                if (size > 0) {
                    int i45 = 0;
                    while (i45 < size) {
                        c cVar = (c) arrayList2.get(i45);
                        if (cVar.isInEditMode()) {
                            cVar.setIds(cVar.f1091w);
                        }
                        B.i iVar = cVar.f1090v;
                        if (iVar == null) {
                            arrayList = arrayList2;
                        } else {
                            iVar.f571r0 = i37;
                            Arrays.fill(iVar.f570q0, obj);
                            int i46 = i37;
                            while (i46 < cVar.f1088t) {
                                int i47 = cVar.f1087s[i46];
                                View view = (View) constraintLayout.f6297s.get(i47);
                                if (view == null) {
                                    Integer numValueOf2 = Integer.valueOf(i47);
                                    HashMap map = cVar.f1093y;
                                    String str = (String) map.get(numValueOf2);
                                    int iF = cVar.f(constraintLayout, str);
                                    if (iF != 0) {
                                        cVar.f1087s[i46] = iF;
                                        map.put(Integer.valueOf(iF), str);
                                        view = (View) constraintLayout.f6297s.get(iF);
                                    }
                                }
                                if (view != null) {
                                    B.i iVar2 = cVar.f1090v;
                                    d dVarH2 = constraintLayout.h(view);
                                    iVar2.getClass();
                                    if (dVarH2 != iVar2 && dVarH2 != null) {
                                        int i48 = iVar2.f571r0 + 1;
                                        d[] dVarArr = iVar2.f570q0;
                                        if (i48 > dVarArr.length) {
                                            iVar2.f570q0 = (d[]) Arrays.copyOf(dVarArr, dVarArr.length * 2);
                                        }
                                        d[] dVarArr2 = iVar2.f570q0;
                                        int i49 = iVar2.f571r0;
                                        dVarArr2[i49] = dVarH2;
                                        iVar2.f571r0 = i49 + 1;
                                    }
                                }
                                i46++;
                                arrayList2 = arrayList2;
                            }
                            arrayList = arrayList2;
                            cVar.f1090v.S();
                        }
                        i45++;
                        arrayList2 = arrayList;
                        obj = null;
                        i37 = 0;
                    }
                }
                int i50 = 2;
                for (int i51 = 0; i51 < childCount3; i51++) {
                    constraintLayout.getChildAt(i51);
                }
                SparseArray sparseArray = constraintLayout.f6295F;
                sparseArray.clear();
                sparseArray.put(0, eVar2);
                sparseArray.put(constraintLayout.getId(), eVar2);
                for (int i52 = 0; i52 < childCount3; i52++) {
                    View childAt2 = constraintLayout.getChildAt(i52);
                    sparseArray.put(childAt2.getId(), constraintLayout.h(childAt2));
                }
                int i53 = 0;
                while (i53 < childCount3) {
                    View childAt3 = constraintLayout.getChildAt(i53);
                    d dVarH3 = constraintLayout.h(childAt3);
                    if (dVarH3 == null) {
                        i12 = i53;
                        z10 = z6;
                        i32 = i50;
                    } else {
                        E.e eVar3 = (E.e) childAt3.getLayoutParams();
                        eVar2.f504q0.add(dVarH3);
                        d dVar11 = dVarH3.f447T;
                        if (dVar11 != null) {
                            ((e) dVar11).f504q0.remove(dVarH3);
                            dVarH3.C();
                        }
                        dVarH3.f447T = eVar2;
                        eVar3.a();
                        dVarH3.f464g0 = childAt3.getVisibility();
                        dVarH3.f0 = childAt3;
                        if (childAt3 instanceof c) {
                            ((c) childAt3).h(dVarH3, eVar2.f509v0);
                        }
                        if (eVar3.f1124d0) {
                            B.h hVar = (B.h) dVarH3;
                            int i54 = eVar3.f1140m0;
                            int i55 = eVar3.f1142n0;
                            float f11 = eVar3.f1144o0;
                            if (f11 == -1.0f) {
                                b3 = -1;
                                if (i54 != -1) {
                                    if (i54 > -1) {
                                        hVar.f564q0 = -1.0f;
                                        hVar.f565r0 = i54;
                                        hVar.f566s0 = -1;
                                    }
                                } else if (i55 != -1 && i55 > -1) {
                                    hVar.f564q0 = -1.0f;
                                    hVar.f565r0 = -1;
                                    hVar.f566s0 = i55;
                                    i12 = i53;
                                    z10 = z6;
                                    i32 = i50;
                                }
                                i12 = i53;
                                z10 = z6;
                                i32 = i50;
                            } else if (f11 > -1.0f) {
                                hVar.f564q0 = f11;
                                b3 = -1;
                                hVar.f565r0 = -1;
                                hVar.f566s0 = -1;
                                i12 = i53;
                                z10 = z6;
                                i32 = i50;
                            } else {
                                i12 = i53;
                                z10 = z6;
                                i32 = i50;
                            }
                        } else {
                            int i56 = eVar3.f0;
                            int i57 = eVar3.f1129g0;
                            int i58 = eVar3.f1131h0;
                            int i59 = eVar3.f1133i0;
                            int i60 = eVar3.f1134j0;
                            int i61 = eVar3.f1136k0;
                            i12 = i53;
                            float f12 = eVar3.f1138l0;
                            int i62 = eVar3.f1145p;
                            z10 = z6;
                            if (i62 != -1) {
                                d dVar12 = (d) sparseArray.get(i62);
                                if (dVar12 != null) {
                                    float f13 = eVar3.f1148r;
                                    dVarH3.v(7, 7, eVar3.f1147q, 0, dVar12);
                                    dVarH3.f432D = f13;
                                }
                                constraintLayout = this;
                                dVar6 = dVarH3;
                                eVar = eVar3;
                                i17 = 4;
                                i16 = 2;
                            } else {
                                if (i56 != -1) {
                                    d dVar13 = (d) sparseArray.get(i56);
                                    if (dVar13 != null) {
                                        dVar = dVarH3;
                                        i13 = 2;
                                        dVar.v(2, 2, ((ViewGroup.MarginLayoutParams) eVar3).leftMargin, i60, dVar13);
                                    } else {
                                        dVar = dVarH3;
                                        i13 = 2;
                                    }
                                } else {
                                    dVar = dVarH3;
                                    i13 = 2;
                                    if (i57 != -1 && (dVar2 = (d) sparseArray.get(i57)) != null) {
                                        dVar.v(2, 4, ((ViewGroup.MarginLayoutParams) eVar3).leftMargin, i60, dVar2);
                                        i14 = 2;
                                        i15 = 4;
                                    }
                                    if (i58 != -1) {
                                        dVar9 = (d) sparseArray.get(i58);
                                        if (dVar9 != null) {
                                            dVar.v(i15, i14, ((ViewGroup.MarginLayoutParams) eVar3).rightMargin, i61, dVar9);
                                        }
                                        i16 = i14;
                                    } else {
                                        i16 = i14;
                                        if (i59 != -1 && (dVar3 = (d) sparseArray.get(i59)) != null) {
                                            dVar.v(i15, i15, ((ViewGroup.MarginLayoutParams) eVar3).rightMargin, i61, dVar3);
                                        }
                                    }
                                    i17 = i15;
                                    i18 = eVar3.f1132i;
                                    if (i18 != -1) {
                                        dVar8 = (d) sparseArray.get(i18);
                                        if (dVar8 != null) {
                                            i30 = 3;
                                            dVar.v(3, 3, ((ViewGroup.MarginLayoutParams) eVar3).topMargin, eVar3.f1154x, dVar8);
                                        } else {
                                            i30 = 3;
                                        }
                                        i21 = i30;
                                        i22 = 5;
                                        i20 = -1;
                                    } else {
                                        i19 = eVar3.j;
                                        i20 = -1;
                                        if (i19 != -1 || (dVar4 = (d) sparseArray.get(i19)) == null) {
                                            i21 = 3;
                                            i22 = 5;
                                        } else {
                                            dVar.v(3, 5, ((ViewGroup.MarginLayoutParams) eVar3).topMargin, eVar3.f1154x, dVar4);
                                            i21 = 3;
                                            i22 = 5;
                                        }
                                    }
                                    i23 = eVar3.f1135k;
                                    if (i23 != i20) {
                                        dVar7 = (d) sparseArray.get(i23);
                                        if (dVar7 != null) {
                                            int i63 = i21;
                                            dVar.v(i22, i63, ((ViewGroup.MarginLayoutParams) eVar3).bottomMargin, eVar3.f1156z, dVar7);
                                            i24 = i63;
                                        } else {
                                            i24 = i21;
                                        }
                                    } else {
                                        i24 = i21;
                                        i25 = eVar3.f1137l;
                                        if (i25 != i20 && (dVar5 = (d) sparseArray.get(i25)) != null) {
                                            dVar.v(i22, i22, ((ViewGroup.MarginLayoutParams) eVar3).bottomMargin, eVar3.f1156z, dVar5);
                                        }
                                    }
                                    eVar = eVar3;
                                    i26 = eVar.f1139m;
                                    if (i26 != -1) {
                                        constraintLayout = this;
                                        dVar6 = dVar;
                                        constraintLayout.l(dVar6, eVar, sparseArray, i26, 6);
                                    } else {
                                        i27 = eVar.f1141n;
                                        if (i27 != -1) {
                                            constraintLayout = this;
                                            dVar6 = dVar;
                                            constraintLayout.l(dVar6, eVar, sparseArray, i27, i24);
                                        } else {
                                            i28 = eVar.f1143o;
                                            constraintLayout = this;
                                            dVar6 = dVar;
                                            i29 = i22;
                                            if (i28 != -1) {
                                                constraintLayout.l(dVar6, eVar, sparseArray, i28, i29);
                                            }
                                        }
                                        if (f12 >= 0.0f) {
                                            dVar6.f459d0 = f12;
                                        }
                                        f10 = eVar.f1099F;
                                        if (f10 >= 0.0f) {
                                            dVar6.f461e0 = f10;
                                        }
                                    }
                                    if (f12 >= 0.0f) {
                                        dVar6.f459d0 = f12;
                                    }
                                    f10 = eVar.f1099F;
                                    if (f10 >= 0.0f) {
                                        dVar6.f461e0 = f10;
                                    }
                                }
                                i14 = i13;
                                i15 = 4;
                                if (i58 != -1) {
                                    dVar9 = (d) sparseArray.get(i58);
                                    if (dVar9 != null) {
                                        dVar.v(i15, i14, ((ViewGroup.MarginLayoutParams) eVar3).rightMargin, i61, dVar9);
                                    }
                                    i16 = i14;
                                } else {
                                    i16 = i14;
                                    if (i59 != -1) {
                                        dVar.v(i15, i15, ((ViewGroup.MarginLayoutParams) eVar3).rightMargin, i61, dVar3);
                                    }
                                }
                                i17 = i15;
                                i18 = eVar3.f1132i;
                                if (i18 != -1) {
                                    dVar8 = (d) sparseArray.get(i18);
                                    if (dVar8 != null) {
                                        i30 = 3;
                                        dVar.v(3, 3, ((ViewGroup.MarginLayoutParams) eVar3).topMargin, eVar3.f1154x, dVar8);
                                    } else {
                                        i30 = 3;
                                    }
                                    i21 = i30;
                                    i22 = 5;
                                    i20 = -1;
                                } else {
                                    i19 = eVar3.j;
                                    i20 = -1;
                                    if (i19 != -1) {
                                        i21 = 3;
                                        i22 = 5;
                                    } else {
                                        i21 = 3;
                                        i22 = 5;
                                    }
                                }
                                i23 = eVar3.f1135k;
                                if (i23 != i20) {
                                    dVar7 = (d) sparseArray.get(i23);
                                    if (dVar7 != null) {
                                        int i64 = i21;
                                        dVar.v(i22, i64, ((ViewGroup.MarginLayoutParams) eVar3).bottomMargin, eVar3.f1156z, dVar7);
                                        i24 = i64;
                                    } else {
                                        i24 = i21;
                                    }
                                } else {
                                    i24 = i21;
                                    i25 = eVar3.f1137l;
                                    if (i25 != i20) {
                                        dVar.v(i22, i22, ((ViewGroup.MarginLayoutParams) eVar3).bottomMargin, eVar3.f1156z, dVar5);
                                    }
                                }
                                eVar = eVar3;
                                i26 = eVar.f1139m;
                                if (i26 != -1) {
                                    constraintLayout = this;
                                    dVar6 = dVar;
                                    constraintLayout.l(dVar6, eVar, sparseArray, i26, 6);
                                } else {
                                    i27 = eVar.f1141n;
                                    if (i27 != -1) {
                                        constraintLayout = this;
                                        dVar6 = dVar;
                                        constraintLayout.l(dVar6, eVar, sparseArray, i27, i24);
                                    } else {
                                        i28 = eVar.f1143o;
                                        constraintLayout = this;
                                        dVar6 = dVar;
                                        i29 = i22;
                                        if (i28 != -1) {
                                            constraintLayout.l(dVar6, eVar, sparseArray, i28, i29);
                                        }
                                    }
                                    if (f12 >= 0.0f) {
                                        dVar6.f459d0 = f12;
                                    }
                                    f10 = eVar.f1099F;
                                    if (f10 >= 0.0f) {
                                        dVar6.f461e0 = f10;
                                    }
                                }
                                if (f12 >= 0.0f) {
                                    dVar6.f459d0 = f12;
                                }
                                f10 = eVar.f1099F;
                                if (f10 >= 0.0f) {
                                    dVar6.f461e0 = f10;
                                }
                            }
                            if (zIsInEditMode && ((i35 = eVar.f1112T) != -1 || eVar.f1113U != -1)) {
                                int i65 = eVar.f1113U;
                                dVar6.f452Y = i35;
                                dVar6.f453Z = i65;
                            }
                            if (eVar.f1119a0) {
                                dVar6.M(i43);
                                dVar6.O(((ViewGroup.MarginLayoutParams) eVar).width);
                                if (((ViewGroup.MarginLayoutParams) eVar).width == -2) {
                                    dVar6.M(i50);
                                }
                            } else if (((ViewGroup.MarginLayoutParams) eVar).width == -1) {
                                if (eVar.f1115W) {
                                    dVar6.M(3);
                                } else {
                                    dVar6.M(4);
                                }
                                dVar6.i(i16).f426g = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
                                dVar6.i(i17).f426g = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
                            } else {
                                dVar6.M(3);
                                dVar6.O(0);
                            }
                            if (eVar.f1121b0) {
                                i31 = -1;
                                dVar6.N(1);
                                dVar6.L(((ViewGroup.MarginLayoutParams) eVar).height);
                                if (((ViewGroup.MarginLayoutParams) eVar).height == -2) {
                                    dVar6.N(2);
                                }
                            } else {
                                i31 = -1;
                                if (((ViewGroup.MarginLayoutParams) eVar).height == -1) {
                                    if (eVar.f1116X) {
                                        dVar6.N(3);
                                    } else {
                                        dVar6.N(4);
                                    }
                                    dVar6.i(3).f426g = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                                    dVar6.i(5).f426g = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                                } else {
                                    dVar6.N(3);
                                    dVar6.L(0);
                                }
                            }
                            String str2 = eVar.f1100G;
                            if (str2 == null || str2.length() == 0) {
                                dVar6.f450W = 0.0f;
                            } else {
                                int length = str2.length();
                                int iIndexOf3 = str2.indexOf(44);
                                if (iIndexOf3 <= 0 || iIndexOf3 >= length - 1) {
                                    i33 = i31;
                                    i34 = 0;
                                } else {
                                    String strSubstring = str2.substring(0, iIndexOf3);
                                    i33 = strSubstring.equalsIgnoreCase("W") ? 0 : strSubstring.equalsIgnoreCase("H") ? 1 : i31;
                                    i34 = iIndexOf3 + 1;
                                }
                                int iIndexOf4 = str2.indexOf(58);
                                if (iIndexOf4 < 0 || iIndexOf4 >= length - 1) {
                                    String strSubstring2 = str2.substring(i34);
                                    if (strSubstring2.length() > 0) {
                                        fAbs = Float.parseFloat(strSubstring2);
                                    } else {
                                        fAbs = 0.0f;
                                    }
                                } else {
                                    String strSubstring3 = str2.substring(i34, iIndexOf4);
                                    String strSubstring4 = str2.substring(iIndexOf4 + 1);
                                    if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
                                        fAbs = 0.0f;
                                    } else {
                                        try {
                                            float f14 = Float.parseFloat(strSubstring3);
                                            float f15 = Float.parseFloat(strSubstring4);
                                            if (f14 <= 0.0f || f15 <= 0.0f) {
                                                fAbs = 0.0f;
                                            } else {
                                                fAbs = i33 == 1 ? Math.abs(f15 / f14) : Math.abs(f14 / f15);
                                            }
                                        } catch (NumberFormatException unused3) {
                                        }
                                    }
                                }
                                if (fAbs > 0.0f) {
                                    dVar6.f450W = fAbs;
                                    dVar6.f451X = i33;
                                }
                            }
                            float f16 = eVar.f1101H;
                            float[] fArr = dVar6.f471k0;
                            fArr[0] = f16;
                            i43 = 1;
                            fArr[1] = eVar.f1102I;
                            dVar6.f468i0 = eVar.f1103J;
                            dVar6.f469j0 = eVar.f1104K;
                            int i66 = eVar.f1118Z;
                            if (i66 >= 0 && i66 <= 3) {
                                dVar6.f482q = i66;
                            }
                            int i67 = eVar.f1105L;
                            int i68 = eVar.f1107N;
                            int i69 = eVar.P;
                            float f17 = eVar.f1110R;
                            dVar6.f483r = i67;
                            dVar6.f486u = i68;
                            if (i69 == Integer.MAX_VALUE) {
                                i69 = 0;
                            }
                            dVar6.f487v = i69;
                            dVar6.f488w = f17;
                            if (f17 > 0.0f && f17 < 1.0f && i67 == 0) {
                                dVar6.f483r = 2;
                            }
                            int i70 = eVar.f1106M;
                            int i71 = eVar.f1108O;
                            int i72 = eVar.f1109Q;
                            float f18 = eVar.f1111S;
                            dVar6.f484s = i70;
                            dVar6.f489x = i71;
                            if (i72 == Integer.MAX_VALUE) {
                                i72 = 0;
                            }
                            dVar6.f490y = i72;
                            dVar6.f491z = f18;
                            if (f18 <= 0.0f || f18 >= 1.0f || i70 != 0) {
                                i32 = 2;
                            } else {
                                i32 = 2;
                                dVar6.f484s = 2;
                            }
                        }
                    }
                    i53 = i12 + 1;
                    i50 = i32;
                    z6 = z10;
                }
            }
            if (z6) {
                eVar2.f505r0.u(eVar2);
            }
        }
        eVar2.f510w0.getClass();
        constraintLayout.k(eVar2, constraintLayout.f6290A, i10, i11);
        int iQ = eVar2.q();
        int iK = eVar2.k();
        boolean z13 = eVar2.f496E0;
        boolean z14 = eVar2.f497F0;
        f fVar = constraintLayout.f6296G;
        int i73 = fVar.f1160e;
        int iResolveSizeAndState = View.resolveSizeAndState(iQ + fVar.f1159d, i10, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(iK + i73, i11, 0) & 16777215;
        int iMin = Math.min(constraintLayout.f6302x, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(constraintLayout.f6303y, iResolveSizeAndState2);
        if (z13) {
            iMin |= 16777216;
        }
        if (z14) {
            iMin2 |= 16777216;
        }
        constraintLayout.setMeasuredDimension(iMin, iMin2);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        d dVarH = h(view);
        if ((view instanceof Guideline) && !(dVarH instanceof B.h)) {
            E.e eVar = (E.e) view.getLayoutParams();
            B.h hVar = new B.h();
            eVar.f1146p0 = hVar;
            eVar.f1124d0 = true;
            hVar.S(eVar.f1114V);
        }
        if (view instanceof c) {
            c cVar = (c) view;
            cVar.i();
            ((E.e) view.getLayoutParams()).f1126e0 = true;
            ArrayList arrayList = this.f6298t;
            if (!arrayList.contains(cVar)) {
                arrayList.add(cVar);
            }
        }
        this.f6297s.put(view.getId(), view);
        this.f6304z = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f6297s.remove(view.getId());
        d dVarH = h(view);
        this.f6299u.f504q0.remove(dVarH);
        dVarH.C();
        this.f6298t.remove(view);
        this.f6304z = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f6304z = true;
        super.requestLayout();
    }

    public void setConstraintSet(o oVar) {
        this.f6291B = oVar;
    }

    @Override // android.view.View
    public void setId(int i10) {
        int id = getId();
        SparseArray sparseArray = this.f6297s;
        sparseArray.remove(id);
        super.setId(i10);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i10) {
        if (i10 == this.f6303y) {
            return;
        }
        this.f6303y = i10;
        requestLayout();
    }

    public void setMaxWidth(int i10) {
        if (i10 == this.f6302x) {
            return;
        }
        this.f6302x = i10;
        requestLayout();
    }

    public void setMinHeight(int i10) {
        if (i10 == this.f6301w) {
            return;
        }
        this.f6301w = i10;
        requestLayout();
    }

    public void setMinWidth(int i10) {
        if (i10 == this.f6300v) {
            return;
        }
        this.f6300v = i10;
        requestLayout();
    }

    public void setOnConstraintsChanged(p pVar) {
        S s9 = this.f6292C;
        if (s9 != null) {
            s9.getClass();
        }
    }

    public void setOptimizationLevel(int i10) {
        this.f6290A = i10;
        e eVar = this.f6299u;
        eVar.f495D0 = i10;
        p239z.c.f16263q = eVar.W(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f6297s = new SparseArray();
        this.f6298t = new ArrayList(4);
        this.f6299u = new e();
        this.f6300v = 0;
        this.f6301w = 0;
        this.f6302x = Integer.MAX_VALUE;
        this.f6303y = Integer.MAX_VALUE;
        this.f6304z = true;
        this.f6290A = 257;
        this.f6291B = null;
        this.f6292C = null;
        this.f6293D = -1;
        this.f6294E = new HashMap();
        this.f6295F = new SparseArray();
        this.f6296G = new f(this, this);
        i(attributeSet, i10);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        E.e eVar = new E.e(layoutParams);
        eVar.a = -1;
        eVar.f1120b = -1;
        eVar.f1122c = -1.0f;
        eVar.f1123d = true;
        eVar.f1125e = -1;
        eVar.f1127f = -1;
        eVar.f1128g = -1;
        eVar.f1130h = -1;
        eVar.f1132i = -1;
        eVar.j = -1;
        eVar.f1135k = -1;
        eVar.f1137l = -1;
        eVar.f1139m = -1;
        eVar.f1141n = -1;
        eVar.f1143o = -1;
        eVar.f1145p = -1;
        eVar.f1147q = 0;
        eVar.f1148r = 0.0f;
        eVar.f1149s = -1;
        eVar.f1150t = -1;
        eVar.f1151u = -1;
        eVar.f1152v = -1;
        eVar.f1153w = Integer.MIN_VALUE;
        eVar.f1154x = Integer.MIN_VALUE;
        eVar.f1155y = Integer.MIN_VALUE;
        eVar.f1156z = Integer.MIN_VALUE;
        eVar.f1094A = Integer.MIN_VALUE;
        eVar.f1095B = Integer.MIN_VALUE;
        eVar.f1096C = Integer.MIN_VALUE;
        eVar.f1097D = 0;
        eVar.f1098E = 0.5f;
        eVar.f1099F = 0.5f;
        eVar.f1100G = null;
        eVar.f1101H = -1.0f;
        eVar.f1102I = -1.0f;
        eVar.f1103J = 0;
        eVar.f1104K = 0;
        eVar.f1105L = 0;
        eVar.f1106M = 0;
        eVar.f1107N = 0;
        eVar.f1108O = 0;
        eVar.P = 0;
        eVar.f1109Q = 0;
        eVar.f1110R = 1.0f;
        eVar.f1111S = 1.0f;
        eVar.f1112T = -1;
        eVar.f1113U = -1;
        eVar.f1114V = -1;
        eVar.f1115W = false;
        eVar.f1116X = false;
        eVar.f1117Y = null;
        eVar.f1118Z = 0;
        eVar.f1119a0 = true;
        eVar.f1121b0 = true;
        eVar.c0 = false;
        eVar.f1124d0 = false;
        eVar.f1126e0 = false;
        eVar.f0 = -1;
        eVar.f1129g0 = -1;
        eVar.f1131h0 = -1;
        eVar.f1133i0 = -1;
        eVar.f1134j0 = Integer.MIN_VALUE;
        eVar.f1136k0 = Integer.MIN_VALUE;
        eVar.f1138l0 = 0.5f;
        eVar.f1146p0 = new d();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) eVar).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) eVar).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) eVar).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = marginLayoutParams.bottomMargin;
            eVar.setMarginStart(marginLayoutParams.getMarginStart());
            eVar.setMarginEnd(marginLayoutParams.getMarginEnd());
        }
        if (!(layoutParams instanceof E.e)) {
            return eVar;
        }
        E.e eVar2 = (E.e) layoutParams;
        eVar.a = eVar2.a;
        eVar.f1120b = eVar2.f1120b;
        eVar.f1122c = eVar2.f1122c;
        eVar.f1123d = eVar2.f1123d;
        eVar.f1125e = eVar2.f1125e;
        eVar.f1127f = eVar2.f1127f;
        eVar.f1128g = eVar2.f1128g;
        eVar.f1130h = eVar2.f1130h;
        eVar.f1132i = eVar2.f1132i;
        eVar.j = eVar2.j;
        eVar.f1135k = eVar2.f1135k;
        eVar.f1137l = eVar2.f1137l;
        eVar.f1139m = eVar2.f1139m;
        eVar.f1141n = eVar2.f1141n;
        eVar.f1143o = eVar2.f1143o;
        eVar.f1145p = eVar2.f1145p;
        eVar.f1147q = eVar2.f1147q;
        eVar.f1148r = eVar2.f1148r;
        eVar.f1149s = eVar2.f1149s;
        eVar.f1150t = eVar2.f1150t;
        eVar.f1151u = eVar2.f1151u;
        eVar.f1152v = eVar2.f1152v;
        eVar.f1153w = eVar2.f1153w;
        eVar.f1154x = eVar2.f1154x;
        eVar.f1155y = eVar2.f1155y;
        eVar.f1156z = eVar2.f1156z;
        eVar.f1094A = eVar2.f1094A;
        eVar.f1095B = eVar2.f1095B;
        eVar.f1096C = eVar2.f1096C;
        eVar.f1097D = eVar2.f1097D;
        eVar.f1098E = eVar2.f1098E;
        eVar.f1099F = eVar2.f1099F;
        eVar.f1100G = eVar2.f1100G;
        eVar.f1101H = eVar2.f1101H;
        eVar.f1102I = eVar2.f1102I;
        eVar.f1103J = eVar2.f1103J;
        eVar.f1104K = eVar2.f1104K;
        eVar.f1115W = eVar2.f1115W;
        eVar.f1116X = eVar2.f1116X;
        eVar.f1105L = eVar2.f1105L;
        eVar.f1106M = eVar2.f1106M;
        eVar.f1107N = eVar2.f1107N;
        eVar.P = eVar2.P;
        eVar.f1108O = eVar2.f1108O;
        eVar.f1109Q = eVar2.f1109Q;
        eVar.f1110R = eVar2.f1110R;
        eVar.f1111S = eVar2.f1111S;
        eVar.f1112T = eVar2.f1112T;
        eVar.f1113U = eVar2.f1113U;
        eVar.f1114V = eVar2.f1114V;
        eVar.f1119a0 = eVar2.f1119a0;
        eVar.f1121b0 = eVar2.f1121b0;
        eVar.c0 = eVar2.c0;
        eVar.f1124d0 = eVar2.f1124d0;
        eVar.f0 = eVar2.f0;
        eVar.f1129g0 = eVar2.f1129g0;
        eVar.f1131h0 = eVar2.f1131h0;
        eVar.f1133i0 = eVar2.f1133i0;
        eVar.f1134j0 = eVar2.f1134j0;
        eVar.f1136k0 = eVar2.f1136k0;
        eVar.f1138l0 = eVar2.f1138l0;
        eVar.f1117Y = eVar2.f1117Y;
        eVar.f1118Z = eVar2.f1118Z;
        eVar.f1146p0 = eVar2.f1146p0;
        return eVar;
    }
}

package V0;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.SwitchCompat;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: V0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0447b extends Property {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0447b(Class cls, String str, int i10) {
        super(cls, str);
        this.a = i10;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return Float.valueOf(z.a.o((View) obj));
            case 6:
                return ((View) obj).getClipBounds();
            case 7:
                return Float.valueOf(((p129n3.h) obj).b());
            case 8:
                return Float.valueOf(((p129n3.m) obj).f13376z);
            case 9:
                return Float.valueOf(((p129n3.o) obj).f13381A);
            default:
                return Float.valueOf(((SwitchCompat) obj).f6180R);
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                C0450e c0450e = (C0450e) obj;
                PointF pointF = (PointF) obj2;
                c0450e.getClass();
                c0450e.a = Math.round(pointF.x);
                int iRound = Math.round(pointF.y);
                c0450e.f5105b = iRound;
                int i10 = c0450e.f5109f + 1;
                c0450e.f5109f = i10;
                if (i10 == c0450e.f5110g) {
                    z.a(c0450e.f5108e, c0450e.a, iRound, c0450e.f5106c, c0450e.f5107d);
                    c0450e.f5109f = 0;
                    c0450e.f5110g = 0;
                }
                break;
            case 1:
                C0450e c0450e2 = (C0450e) obj;
                PointF pointF2 = (PointF) obj2;
                c0450e2.getClass();
                c0450e2.f5106c = Math.round(pointF2.x);
                int iRound2 = Math.round(pointF2.y);
                c0450e2.f5107d = iRound2;
                int i11 = c0450e2.f5110g + 1;
                c0450e2.f5110g = i11;
                if (c0450e2.f5109f == i11) {
                    z.a(c0450e2.f5108e, c0450e2.a, c0450e2.f5105b, c0450e2.f5106c, iRound2);
                    c0450e2.f5109f = 0;
                    c0450e2.f5110g = 0;
                }
                break;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                z.a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                z.a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int iRound3 = Math.round(pointF5.x);
                int iRound4 = Math.round(pointF5.y);
                z.a(view3, iRound3, iRound4, view3.getWidth() + iRound3, view3.getHeight() + iRound4);
                break;
            case 5:
                z.a.A((View) obj, ((Float) obj2).floatValue());
                break;
            case 6:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
            case 7:
                p129n3.h hVar = (p129n3.h) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                if (hVar.f13359z != fFloatValue) {
                    hVar.f13359z = fFloatValue;
                    hVar.invalidateSelf();
                }
                break;
            case 8:
                p129n3.m mVar = (p129n3.m) obj;
                float fFloatValue2 = ((Float) obj2).floatValue();
                mVar.f13376z = fFloatValue2;
                ArrayList arrayList = (ArrayList) mVar.f726t;
                ((p129n3.i) arrayList.get(0)).a = 0.0f;
                float f10 = ((int) (fFloatValue2 * 333.0f)) / 667;
                p129n3.i iVar = (p129n3.i) arrayList.get(0);
                p129n3.i iVar2 = (p129n3.i) arrayList.get(1);
                p178s0.a aVar = mVar.f13372v;
                float interpolation = aVar.getInterpolation(f10);
                iVar2.a = interpolation;
                iVar.f13360b = interpolation;
                p129n3.i iVar3 = (p129n3.i) arrayList.get(1);
                p129n3.i iVar4 = (p129n3.i) arrayList.get(2);
                float interpolation2 = aVar.getInterpolation(f10 + 0.49925038f);
                iVar4.a = interpolation2;
                iVar3.f13360b = interpolation2;
                ((p129n3.i) arrayList.get(2)).f13360b = 1.0f;
                if (mVar.f13375y && ((p129n3.i) arrayList.get(1)).f13360b < 1.0f) {
                    ((p129n3.i) arrayList.get(2)).f13361c = ((p129n3.i) arrayList.get(1)).f13361c;
                    ((p129n3.i) arrayList.get(1)).f13361c = ((p129n3.i) arrayList.get(0)).f13361c;
                    ((p129n3.i) arrayList.get(0)).f13361c = mVar.f13373w.f13390c[mVar.f13374x];
                    mVar.f13375y = false;
                }
                ((p129n3.k) mVar.f725s).invalidateSelf();
                break;
            case 9:
                p129n3.o oVar = (p129n3.o) obj;
                float fFloatValue3 = ((Float) obj2).floatValue();
                oVar.f13381A = fFloatValue3;
                int i12 = (int) (fFloatValue3 * 1800.0f);
                int i13 = 0;
                while (true) {
                    ArrayList arrayList2 = (ArrayList) oVar.f726t;
                    if (i13 >= arrayList2.size()) {
                        if (oVar.f13388z) {
                            Iterator it = arrayList2.iterator();
                            while (it.hasNext()) {
                                ((p129n3.i) it.next()).f13361c = oVar.f13386x.f13390c[oVar.f13387y];
                            }
                            oVar.f13388z = false;
                        }
                        ((p129n3.k) oVar.f725s).invalidateSelf();
                    } else {
                        p129n3.i iVar5 = (p129n3.i) arrayList2.get(i13);
                        int[] iArr = p129n3.o.f13379D;
                        int i14 = i13 * 2;
                        int i15 = iArr[i14];
                        int[] iArr2 = p129n3.o.f13378C;
                        float f11 = (i12 - i15) / iArr2[i14];
                        Interpolator[] interpolatorArr = oVar.f13385w;
                        iVar5.a = p181s3.a.d(interpolatorArr[i14].getInterpolation(f11), 0.0f, 1.0f);
                        int i16 = i14 + 1;
                        iVar5.f13360b = p181s3.a.d(interpolatorArr[i16].getInterpolation((i12 - iArr[i16]) / iArr2[i16]), 0.0f, 1.0f);
                        i13++;
                    }
                    break;
                }
                break;
            default:
                ((SwitchCompat) obj).setThumbPosition(((Float) obj2).floatValue());
                break;
        }
    }
}

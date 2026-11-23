package A1;

import U.U;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Message;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class I implements Handler.Callback {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f73s;

    public /* synthetic */ I(int i10) {
        this.f73s = i10;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        switch (this.f73s) {
            case 0:
                if (message.what != 1) {
                    return false;
                }
                ((F) message.obj).c();
                return true;
            default:
                int i10 = message.what;
                if (i10 == 0) {
                    p190t3.f fVar = (p190t3.f) message.obj;
                    p190t3.e eVar = fVar.f15196i;
                    if (eVar.getParent() == null) {
                        ViewGroup.LayoutParams layoutParams = eVar.getLayoutParams();
                        if (layoutParams instanceof G.e) {
                            G.e eVar2 = (G.e) layoutParams;
                            BaseTransientBottomBar$Behavior baseTransientBottomBar$Behavior = new BaseTransientBottomBar$Behavior();
                            p102k7.e eVar3 = baseTransientBottomBar$Behavior.f9808A;
                            eVar3.getClass();
                            eVar3.f12743s = fVar.f15206t;
                            baseTransientBottomBar$Behavior.f9481t = new p081i3.b(fVar, 19);
                            eVar2.b(baseTransientBottomBar$Behavior);
                            eVar2.f1670g = 80;
                        }
                        eVar.f15174C = true;
                        fVar.f15194g.addView(eVar);
                        eVar.f15174C = false;
                        fVar.e();
                        eVar.setVisibility(4);
                    }
                    WeakHashMap weakHashMap = U.a;
                    if (eVar.isLaidOut()) {
                        fVar.d();
                        return true;
                    }
                    fVar.f15204r = true;
                    return true;
                }
                if (i10 != 1) {
                    return false;
                }
                p190t3.f fVar2 = (p190t3.f) message.obj;
                int i11 = message.arg1;
                AccessibilityManager accessibilityManager = fVar2.f15205s;
                if (accessibilityManager == null || ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) != null && enabledAccessibilityServiceList.isEmpty())) {
                    p190t3.e eVar4 = fVar2.f15196i;
                    if (eVar4.getVisibility() == 0) {
                        if (eVar4.getAnimationMode() == 1) {
                            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                            valueAnimatorOfFloat.setInterpolator(fVar2.f15191d);
                            valueAnimatorOfFloat.addUpdateListener(new p190t3.b(fVar2, 0, (byte) 0));
                            valueAnimatorOfFloat.setDuration(fVar2.f15189b);
                            valueAnimatorOfFloat.addListener(new p190t3.a(fVar2, i11, 0));
                            valueAnimatorOfFloat.start();
                            return true;
                        }
                        ValueAnimator valueAnimator = new ValueAnimator();
                        int height = eVar4.getHeight();
                        ViewGroup.LayoutParams layoutParams2 = eVar4.getLayoutParams();
                        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                            height += ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                        }
                        valueAnimator.setIntValues(0, height);
                        valueAnimator.setInterpolator(fVar2.f15192e);
                        valueAnimator.setDuration(fVar2.f15190c);
                        valueAnimator.addListener(new p190t3.a(fVar2, i11, 2));
                        valueAnimator.addUpdateListener(new p190t3.b(fVar2, 3, (byte) 0));
                        valueAnimator.start();
                        return true;
                    }
                }
                fVar2.b();
                return true;
        }
    }
}

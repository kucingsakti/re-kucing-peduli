package p032d0;

import U.C0412b;
import U.U;
import V.j;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import p023c3.f;
import p212w.h;
import p230x9.d;
import za.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends C0412b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Rect f10498n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final d f10499o = new d(20);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final c f10500p = new c(20);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AccessibilityManager f10505h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Chip f10506i;
    public a j;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f10501d = new Rect();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f10502e = new Rect();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Rect f10503f = new Rect();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f10504g = new int[2];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f10507k = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f10508l = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f10509m = Integer.MIN_VALUE;

    public b(Chip chip) {
        this.f10506i = chip;
        this.f10505h = (AccessibilityManager) chip.getContext().getSystemService("accessibility");
        chip.setFocusable(true);
        WeakHashMap weakHashMap = U.a;
        if (chip.getImportantForAccessibility() == 0) {
            chip.setImportantForAccessibility(1);
        }
    }

    @Override // U.C0412b
    public final P0.d b(View view) {
        if (this.j == null) {
            this.j = new a(this);
        }
        return this.j;
    }

    @Override // U.C0412b
    public final void d(View view, j jVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        AccessibilityNodeInfo accessibilityNodeInfo = jVar.a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = ((p023c3.d) this).f7460q;
        f fVar = chip.f9626w;
        accessibilityNodeInfo.setCheckable(fVar != null && fVar.f7502j0);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        jVar.i(chip.getAccessibilityClassName());
        jVar.m(chip.getText());
    }

    public final boolean j(int i10) {
        if (this.f10508l != i10) {
            return false;
        }
        this.f10508l = Integer.MIN_VALUE;
        p023c3.d dVar = (p023c3.d) this;
        if (i10 == 1) {
            Chip chip = dVar.f7460q;
            chip.f9616F = false;
            chip.refreshDrawableState();
        }
        q(i10, 8);
        return true;
    }

    public final j k(int i10) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        j jVar = new j(accessibilityNodeInfoObtain);
        accessibilityNodeInfoObtain.setEnabled(true);
        accessibilityNodeInfoObtain.setFocusable(true);
        jVar.i("android.view.View");
        Rect rect = f10498n;
        accessibilityNodeInfoObtain.setBoundsInParent(rect);
        accessibilityNodeInfoObtain.setBoundsInScreen(rect);
        Chip chip = this.f10506i;
        accessibilityNodeInfoObtain.setParent(chip);
        o(i10, jVar);
        if (jVar.g() == null && accessibilityNodeInfoObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f10502e;
        jVar.f(rect2);
        if (rect2.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = accessibilityNodeInfoObtain.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        accessibilityNodeInfoObtain.setPackageName(chip.getContext().getPackageName());
        jVar.f5080b = i10;
        accessibilityNodeInfoObtain.setSource(chip, i10);
        if (this.f10507k == i10) {
            accessibilityNodeInfoObtain.setAccessibilityFocused(true);
            jVar.a(128);
        } else {
            accessibilityNodeInfoObtain.setAccessibilityFocused(false);
            jVar.a(64);
        }
        boolean z6 = this.f10508l == i10;
        if (z6) {
            jVar.a(2);
        } else if (accessibilityNodeInfoObtain.isFocusable()) {
            jVar.a(1);
        }
        accessibilityNodeInfoObtain.setFocused(z6);
        int[] iArr = this.f10504g;
        chip.getLocationOnScreen(iArr);
        Rect rect3 = this.f10501d;
        accessibilityNodeInfoObtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            jVar.f(rect3);
            rect3.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
        }
        Rect rect4 = this.f10503f;
        if (chip.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
            if (rect3.intersect(rect4)) {
                accessibilityNodeInfoObtain.setBoundsInScreen(rect3);
                if (!rect3.isEmpty() && chip.getWindowVisibility() == 0) {
                    Object parent = chip.getParent();
                    while (parent instanceof View) {
                        View view = (View) parent;
                        if (view.getAlpha() > 0.0f && view.getVisibility() == 0) {
                            parent = view.getParent();
                        }
                    }
                    if (parent != null) {
                        jVar.a.setVisibleToUser(true);
                    }
                }
            }
        }
        return jVar;
    }

    public abstract void l(ArrayList arrayList);

    /* JADX WARN: Code duplicated, block: B:118:0x015a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x015a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x015a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x015a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00da  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:51:0x010c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0115  */
    /* JADX WARN: Code duplicated, block: B:57:0x0122  */
    /* JADX WARN: Code duplicated, block: B:66:0x0137  */
    /* JADX WARN: Code duplicated, block: B:68:0x0155  */
    /* JADX WARN: Code duplicated, block: B:89:0x01b2  */
    public final boolean m(int i10, Rect rect) {
        int i11;
        int i12;
        Object obj;
        Object obj2;
        j jVar;
        int i13;
        Rect rect2;
        int iH;
        Rect rect3;
        int i14;
        j jVar2;
        int i15;
        int iU;
        int iW;
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        p212w.j jVar3 = new p212w.j(0);
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            jVar3.f(((Integer) arrayList.get(i16)).intValue(), k(((Integer) arrayList.get(i16)).intValue()));
        }
        int i17 = this.f10508l;
        int iE = Integer.MIN_VALUE;
        j jVar4 = i17 == Integer.MIN_VALUE ? null : (j) jVar3.d(i17);
        d dVar = f10499o;
        c cVar = f10500p;
        Chip chip = this.f10506i;
        if (i10 == 1 || i10 == 2) {
            i11 = 0;
            i12 = -1;
            WeakHashMap weakHashMap = U.a;
            boolean z6 = chip.getLayoutDirection() == 1;
            cVar.getClass();
            int iH2 = jVar3.h();
            ArrayList arrayList2 = new ArrayList(iH2);
            for (int i18 = 0; i18 < iH2; i18++) {
                arrayList2.add((j) jVar3.i(i18));
            }
            Collections.sort(arrayList2, new c(z6, dVar));
            if (i10 == 1) {
                int size = arrayList2.size();
                if (jVar4 != null) {
                    size = arrayList2.indexOf(jVar4);
                }
                int i19 = size - 1;
                if (i19 >= 0) {
                    obj = arrayList2.get(i19);
                    obj2 = obj;
                } else {
                    obj2 = null;
                }
            } else {
                if (i10 != 2) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                }
                int size2 = arrayList2.size();
                int iLastIndexOf = (jVar4 == null ? -1 : arrayList2.lastIndexOf(jVar4)) + 1;
                if (iLastIndexOf < size2) {
                    obj = arrayList2.get(iLastIndexOf);
                    obj2 = obj;
                } else {
                    obj2 = null;
                }
            }
            jVar = (j) obj2;
        } else {
            if (i10 != 17 && i10 != 33 && i10 != 66 && i10 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect4 = new Rect();
            int i20 = this.f10508l;
            if (i20 != Integer.MIN_VALUE) {
                n(i20).f(rect4);
            } else {
                if (rect != null) {
                    rect4.set(rect);
                } else {
                    int width = chip.getWidth();
                    int height = chip.getHeight();
                    if (i10 == 17) {
                        i12 = -1;
                        rect4.set(width, 0, width, height);
                    } else if (i10 == 33) {
                        i12 = -1;
                        rect4.set(0, height, width, height);
                    } else if (i10 == 66) {
                        rect4.set(-1, 0, -1, height);
                        i12 = -1;
                    } else {
                        if (i10 != 130) {
                            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        }
                        rect4.set(0, -1, width, -1);
                        i12 = -1;
                    }
                }
                rect2 = new Rect(rect4);
                if (i10 != 17) {
                    i11 = 0;
                    rect2.offset(rect4.width() + 1, 0);
                } else if (i10 != 33) {
                    i11 = 0;
                    rect2.offset(0, rect4.height() + 1);
                } else if (i10 != 66) {
                    i11 = 0;
                    rect2.offset(-(rect4.width() + 1), 0);
                } else {
                    if (i10 == 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    i11 = 0;
                    rect2.offset(0, -(rect4.height() + 1));
                }
                cVar.getClass();
                iH = jVar3.h();
                rect3 = new Rect();
                jVar = null;
                for (i14 = i11; i14 < iH; i14++) {
                    jVar2 = (j) jVar3.i(i14);
                    if (jVar2 == jVar4) {
                        dVar.getClass();
                        jVar2.f(rect3);
                        if (D3.b.p(i10, rect4, rect3)) {
                            if (D3.b.p(i10, rect4, rect2) || D3.b.b(i10, rect4, rect3, rect2)) {
                                rect2.set(rect3);
                                jVar = jVar2;
                            } else if (D3.b.b(i10, rect4, rect2, rect3)) {
                                int iU2 = D3.b.u(i10, rect4, rect3);
                                int iW2 = D3.b.w(i10, rect4, rect3);
                                i15 = (iW2 * iW2) + (iU2 * 13 * iU2);
                                iU = D3.b.u(i10, rect4, rect2);
                                iW = D3.b.w(i10, rect4, rect2);
                                if (i15 < (iW * iW) + (iU * 13 * iU)) {
                                    rect2.set(rect3);
                                    jVar = jVar2;
                                }
                            }
                        }
                    }
                }
            }
            i12 = -1;
            rect2 = new Rect(rect4);
            if (i10 != 17) {
                i11 = 0;
                rect2.offset(rect4.width() + 1, 0);
            } else if (i10 != 33) {
                i11 = 0;
                rect2.offset(0, rect4.height() + 1);
            } else if (i10 != 66) {
                i11 = 0;
                rect2.offset(-(rect4.width() + 1), 0);
            } else {
                if (i10 == 130) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
                i11 = 0;
                rect2.offset(0, -(rect4.height() + 1));
            }
            cVar.getClass();
            iH = jVar3.h();
            rect3 = new Rect();
            jVar = null;
            while (i14 < iH) {
                jVar2 = (j) jVar3.i(i14);
                if (jVar2 == jVar4) {
                    dVar.getClass();
                    jVar2.f(rect3);
                    if (D3.b.p(i10, rect4, rect3)) {
                        if (D3.b.p(i10, rect4, rect2)) {
                            rect2.set(rect3);
                            jVar = jVar2;
                        } else if (D3.b.b(i10, rect4, rect2, rect3)) {
                            int iU3 = D3.b.u(i10, rect4, rect3);
                            int iW3 = D3.b.w(i10, rect4, rect3);
                            i15 = (iW3 * iW3) + (iU3 * 13 * iU3);
                            iU = D3.b.u(i10, rect4, rect2);
                            iW = D3.b.w(i10, rect4, rect2);
                            if (i15 < (iW * iW) + (iU * 13 * iU)) {
                                rect2.set(rect3);
                                jVar = jVar2;
                            }
                        }
                    }
                }
            }
        }
        j jVar5 = jVar;
        if (jVar5 != null) {
            if (jVar3.f15507s) {
                h.a(jVar3);
            }
            int i21 = jVar3.f15510v;
            int i22 = i11;
            while (true) {
                if (i22 >= i21) {
                    i13 = i12;
                    break;
                }
                if (jVar3.f15509u[i22] == jVar5) {
                    i13 = i22;
                    break;
                }
                i22++;
            }
            iE = jVar3.e(i13);
        }
        return p(iE);
    }

    public final j n(int i10) {
        if (i10 != -1) {
            return k(i10);
        }
        Chip chip = this.f10506i;
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(chip);
        j jVar = new j(accessibilityNodeInfoObtain);
        WeakHashMap weakHashMap = U.a;
        chip.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        if (accessibilityNodeInfoObtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            jVar.a.addChild(chip, ((Integer) arrayList.get(i11)).intValue());
        }
        return jVar;
    }

    public abstract void o(int i10, j jVar);

    public final boolean p(int i10) {
        int i11;
        Chip chip = this.f10506i;
        if ((!chip.isFocused() && !chip.requestFocus()) || (i11 = this.f10508l) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            j(i11);
        }
        if (i10 == Integer.MIN_VALUE) {
            return false;
        }
        this.f10508l = i10;
        p023c3.d dVar = (p023c3.d) this;
        if (i10 == 1) {
            Chip chip2 = dVar.f7460q;
            chip2.f9616F = true;
            chip2.refreshDrawableState();
        }
        q(i10, 8);
        return true;
    }

    public final void q(int i10, int i11) {
        View view;
        ViewParent parent;
        AccessibilityEvent accessibilityEventObtain;
        if (i10 == Integer.MIN_VALUE || !this.f10505h.isEnabled() || (parent = (view = this.f10506i).getParent()) == null) {
            return;
        }
        if (i10 != -1) {
            accessibilityEventObtain = AccessibilityEvent.obtain(i11);
            j jVarN = n(i10);
            accessibilityEventObtain.getText().add(jVarN.g());
            AccessibilityNodeInfo accessibilityNodeInfo = jVarN.a;
            accessibilityEventObtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            accessibilityEventObtain.setScrollable(accessibilityNodeInfo.isScrollable());
            accessibilityEventObtain.setPassword(accessibilityNodeInfo.isPassword());
            accessibilityEventObtain.setEnabled(accessibilityNodeInfo.isEnabled());
            accessibilityEventObtain.setChecked(accessibilityNodeInfo.isChecked());
            if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            accessibilityEventObtain.setClassName(accessibilityNodeInfo.getClassName());
            accessibilityEventObtain.setSource(view, i10);
            accessibilityEventObtain.setPackageName(view.getContext().getPackageName());
        } else {
            accessibilityEventObtain = AccessibilityEvent.obtain(i11);
            view.onInitializeAccessibilityEvent(accessibilityEventObtain);
        }
        parent.requestSendAccessibilityEvent(view, accessibilityEventObtain);
    }
}

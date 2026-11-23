package com.google.android.material.button;

import A9.C0148v;
import C0.w;
import I4.b;
import U.U;
import V.h;
import Y2.c;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import com.google.android.material.timepicker.f;
import com.kcstream.cing.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import p091j3.C;
import p170r3.j;

/* JADX INFO: loaded from: classes.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ int f9564C = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f9565A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public HashSet f9566B;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayList f9567s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final h f9568t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final LinkedHashSet f9569u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final C0148v f9570v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Integer[] f9571w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f9572x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f9573y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f9574z;

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(p225x3.a.a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet, R.attr.materialButtonToggleGroupStyle);
        this.f9567s = new ArrayList();
        this.f9568t = new h(this, 4);
        this.f9569u = new LinkedHashSet();
        this.f9570v = new C0148v(this, 1);
        this.f9572x = false;
        this.f9566B = new HashSet();
        TypedArray typedArrayI = C.i(getContext(), attributeSet, Q2.a.f4027v, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(typedArrayI.getBoolean(3, false));
        this.f9565A = typedArrayI.getResourceId(1, -1);
        this.f9574z = typedArrayI.getBoolean(2, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayI.getBoolean(0, true));
        typedArrayI.recycle();
        WeakHashMap weakHashMap = U.a;
        setImportantForAccessibility(1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (c(i10)) {
                return i10;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof MaterialButton) && c(i11)) {
                i10++;
            }
        }
        return i10;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap weakHashMap = U.a;
            materialButton.setId(View.generateViewId());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f9568t);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public final void a() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i10 = firstVisibleChildIndex + 1; i10 < getChildCount(); i10++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i10);
            int iMin = Math.min(materialButton.getStrokeWidth(), ((MaterialButton) getChildAt(i10 - 1)).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams = materialButton.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                layoutParams2.setMarginEnd(0);
                layoutParams2.setMarginStart(-iMin);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = -iMin;
                layoutParams2.setMarginStart(0);
            }
            materialButton.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
        } else {
            layoutParams3.setMarginEnd(0);
            layoutParams3.setMarginStart(0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof MaterialButton) {
            super.addView(view, i10, layoutParams);
            MaterialButton materialButton = (MaterialButton) view;
            setGeneratedIdIfNeeded(materialButton);
            setupButtonChild(materialButton);
            b(materialButton.getId(), materialButton.f9555G);
            j shapeAppearanceModel = materialButton.getShapeAppearanceModel();
            this.f9567s.add(new c(shapeAppearanceModel.f14513e, shapeAppearanceModel.f14516h, shapeAppearanceModel.f14514f, shapeAppearanceModel.f14515g));
            materialButton.setEnabled(isEnabled());
            U.n(materialButton, new w(this, 3));
        }
    }

    public final void b(int i10, boolean z6) {
        if (i10 == -1) {
            return;
        }
        HashSet hashSet = new HashSet(this.f9566B);
        if (z6 && !hashSet.contains(Integer.valueOf(i10))) {
            if (this.f9573y && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i10));
        } else {
            if (z6 || !hashSet.contains(Integer.valueOf(i10))) {
                return;
            }
            if (!this.f9574z || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i10));
            }
        }
        d(hashSet);
    }

    public final boolean c(int i10) {
        return getChildAt(i10).getVisibility() != 8;
    }

    public final void d(Set set) {
        HashSet hashSet = this.f9566B;
        this.f9566B = new HashSet(set);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id = ((MaterialButton) getChildAt(i10)).getId();
            boolean zContains = set.contains(Integer.valueOf(id));
            View viewFindViewById = findViewById(id);
            if (viewFindViewById instanceof MaterialButton) {
                this.f9572x = true;
                ((MaterialButton) viewFindViewById).setChecked(zContains);
                this.f9572x = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator it = this.f9569u.iterator();
                while (it.hasNext()) {
                    ((f) it.next()).a();
                }
            }
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f9570v);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            treeMap.put((MaterialButton) getChildAt(i10), Integer.valueOf(i10));
        }
        this.f9571w = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void e() {
        c cVar;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i10 = 0; i10 < childCount; i10++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i10);
            if (materialButton.getVisibility() != 8) {
                b bVarF = materialButton.getShapeAppearanceModel().f();
                c cVar2 = (c) this.f9567s.get(i10);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z6 = getOrientation() == 0;
                    p170r3.a aVar = c.f5691e;
                    if (i10 == firstVisibleChildIndex) {
                        cVar = z6 ? C.h(this) ? new c(aVar, aVar, cVar2.f5692b, cVar2.f5693c) : new c(cVar2.a, cVar2.f5694d, aVar, aVar) : new c(cVar2.a, aVar, cVar2.f5692b, aVar);
                    } else if (i10 != lastVisibleChildIndex) {
                        cVar2 = null;
                    } else if (z6) {
                        cVar = C.h(this) ? new c(cVar2.a, cVar2.f5694d, aVar, aVar) : new c(aVar, aVar, cVar2.f5692b, cVar2.f5693c);
                    } else {
                        cVar = new c(aVar, cVar2.f5694d, aVar, cVar2.f5693c);
                    }
                    cVar2 = cVar;
                }
                if (cVar2 == null) {
                    bVarF.c(0.0f);
                } else {
                    bVarF.f2072e = cVar2.a;
                    bVarF.f2075h = cVar2.f5694d;
                    bVarF.f2073f = cVar2.f5692b;
                    bVarF.f2074g = cVar2.f5693c;
                }
                materialButton.setShapeAppearanceModel(bVarF.a());
            }
        }
    }

    public int getCheckedButtonId() {
        if (!this.f9573y || this.f9566B.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f9566B.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id = ((MaterialButton) getChildAt(i10)).getId();
            if (this.f9566B.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i10, int i11) {
        Integer[] numArr = this.f9571w;
        if (numArr != null && i11 < numArr.length) {
            return numArr[i11].intValue();
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return i11;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i10 = this.f9565A;
        if (i10 != -1) {
            d(Collections.singleton(Integer.valueOf(i10)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) h.a(1, getVisibleButtonCount(), this.f9573y ? 1 : 2).f5078t);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        e();
        a();
        super.onMeasure(i10, i11);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f9567s.remove(iIndexOfChild);
        }
        e();
        a();
    }

    @Override // android.view.View
    public void setEnabled(boolean z6) {
        super.setEnabled(z6);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            ((MaterialButton) getChildAt(i10)).setEnabled(z6);
        }
    }

    public void setSelectionRequired(boolean z6) {
        this.f9574z = z6;
    }

    public void setSingleSelection(boolean z6) {
        if (this.f9573y != z6) {
            this.f9573y = z6;
            d(new HashSet());
        }
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            ((MaterialButton) getChildAt(i10)).setA11yClassName((this.f9573y ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    public void setSingleSelection(int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }
}

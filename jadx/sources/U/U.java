package U;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.kcstream.cing.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;
import p.C0728t;

/* JADX INFO: loaded from: classes.dex */
public abstract class U {
    public static WeakHashMap a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Field f4786b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f4787c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f4788d = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final B f4789e = new B();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final D f4790f = new D();

    public static C0417d0 a(View view) {
        if (a == null) {
            a = new WeakHashMap();
        }
        C0417d0 c0417d0 = (C0417d0) a.get(view);
        if (c0417d0 != null) {
            return c0417d0;
        }
        C0417d0 c0417d1 = new C0417d0(view);
        a.put(view, c0417d1);
        return c0417d1;
    }

    public static B0 b(View view, B0 b3) {
        WindowInsets windowInsetsG = b3.g();
        if (windowInsetsG != null) {
            WindowInsets windowInsetsA = F.a(view, windowInsetsG);
            if (!windowInsetsA.equals(windowInsetsG)) {
                return B0.h(view, windowInsetsA);
            }
        }
        return b3;
    }

    public static boolean c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = T.f4783d;
        T t7 = (T) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (t7 == null) {
            t7 = new T();
            t7.a = null;
            t7.f4784b = null;
            t7.f4785c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, t7);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = t7.a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = T.f4783d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (t7.a == null) {
                            t7.a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = T.f4783d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                t7.a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    t7.a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        View viewA = t7.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewA != null && !KeyEvent.isModifierKey(keyCode)) {
                if (t7.f4784b == null) {
                    t7.f4784b = new SparseArray();
                }
                t7.f4784b.put(keyCode, new WeakReference(viewA));
            }
        }
        return viewA != null;
    }

    public static View.AccessibilityDelegate d(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return N.a(view);
        }
        if (f4787c) {
            return null;
        }
        if (f4786b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f4786b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f4787c = true;
                return null;
            }
        }
        try {
            Object obj = f4786b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f4787c = true;
            return null;
        }
    }

    public static CharSequence e(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = M.b(view);
        } else {
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    public static ArrayList f(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static String[] g(C0728t c0728t) {
        return Build.VERSION.SDK_INT >= 31 ? P.a(c0728t) : (String[]) c0728t.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void h(View view, int i10) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z6 = e(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z6) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z6 ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i10);
                if (z6) {
                    accessibilityEventObtain.getText().add(e(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i10 != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i10);
                        return;
                    } catch (AbstractMethodError unused) {
                        view.getParent().getClass();
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i10);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(e(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    public static B0 i(View view, B0 b3) {
        WindowInsets windowInsetsG = b3.g();
        if (windowInsetsG != null) {
            WindowInsets windowInsetsB = F.b(view, windowInsetsG);
            if (!windowInsetsB.equals(windowInsetsG)) {
                return B0.h(view, windowInsetsB);
            }
        }
        return b3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C0421g j(View view, C0421g c0421g) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Objects.toString(c0421g);
            view.getClass();
            view.getId();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return P.b(view, c0421g);
        }
        InterfaceC0433t interfaceC0433t = (InterfaceC0433t) view.getTag(R.id.tag_on_receive_content_listener);
        InterfaceC0434u interfaceC0434u = f4789e;
        if (interfaceC0433t == null) {
            if (view instanceof InterfaceC0434u) {
                interfaceC0434u = (InterfaceC0434u) view;
            }
            return interfaceC0434u.a(c0421g);
        }
        C0421g c0421gA = ((p000a0.q) interfaceC0433t).a(view, c0421g);
        if (c0421gA == null) {
            return null;
        }
        if (view instanceof InterfaceC0434u) {
            interfaceC0434u = (InterfaceC0434u) view;
        }
        return interfaceC0434u.a(c0421gA);
    }

    public static void k(View view, int i10) {
        ArrayList arrayListF = f(view);
        for (int i11 = 0; i11 < arrayListF.size(); i11++) {
            if (((V.d) arrayListF.get(i11)).a() == i10) {
                arrayListF.remove(i11);
                return;
            }
        }
    }

    public static void l(View view, V.d dVar, V.t tVar) {
        C0412b c0412b;
        if (tVar == null) {
            k(view, dVar.a());
            h(view, 0);
            return;
        }
        V.d dVar2 = new V.d(null, dVar.f5074b, null, tVar, dVar.f5075c);
        View.AccessibilityDelegate accessibilityDelegateD = d(view);
        if (accessibilityDelegateD == null) {
            c0412b = null;
        } else {
            c0412b = accessibilityDelegateD instanceof C0410a ? ((C0410a) accessibilityDelegateD).a : new C0412b(accessibilityDelegateD);
        }
        if (c0412b == null) {
            c0412b = new C0412b();
        }
        n(view, c0412b);
        k(view, dVar2.a());
        f(view).add(dVar2);
        h(view, 0);
    }

    public static void m(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            N.d(view, context, iArr, attributeSet, typedArray, i10, 0);
        }
    }

    public static void n(View view, C0412b c0412b) {
        if (c0412b == null && (d(view) instanceof C0410a)) {
            c0412b = new C0412b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c0412b == null ? null : c0412b.f4799b);
    }

    public static void o(View view, CharSequence charSequence) {
        new C(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).g(view, charSequence);
        D d3 = f4790f;
        if (charSequence == null) {
            d3.f4774s.remove(view);
            view.removeOnAttachStateChangeListener(d3);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(d3);
        } else {
            d3.f4774s.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(d3);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(d3);
            }
        }
    }

    public static void p(ViewGroup viewGroup, p040e1.j jVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            J.d(viewGroup, Q.k.m(jVar != null ? (PointerIcon) jVar.f10697t : null));
        }
    }
}

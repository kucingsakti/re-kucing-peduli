package U;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.Objects;

/* JADX INFO: renamed from: U.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0429o {
    public ViewParent a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewParent f4831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewGroup f4832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4833d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f4834e;

    public C0429o(ViewGroup viewGroup) {
        this.f4832c = viewGroup;
    }

    public final boolean a(float f10, float f11, boolean z6) {
        ViewParent viewParentE;
        if (this.f4833d && (viewParentE = e(0)) != null) {
            try {
                return AbstractC0413b0.a(viewParentE, this.f4832c, f10, f11, z6);
            } catch (AbstractMethodError unused) {
                Objects.toString(viewParentE);
            }
        }
        return false;
    }

    public final boolean b(float f10, float f11) {
        ViewParent viewParentE;
        if (this.f4833d && (viewParentE = e(0)) != null) {
            try {
                return AbstractC0413b0.b(viewParentE, this.f4832c, f10, f11);
            } catch (AbstractMethodError unused) {
                Objects.toString(viewParentE);
            }
        }
        return false;
    }

    public final boolean c(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        ViewParent viewParentE;
        int i13;
        int i14;
        int[] iArr3;
        if (!this.f4833d || (viewParentE = e(i12)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.f4832c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i13 = iArr2[0];
            i14 = iArr2[1];
        } else {
            i13 = 0;
            i14 = 0;
        }
        if (iArr == null) {
            if (this.f4834e == null) {
                this.f4834e = new int[2];
            }
            iArr3 = this.f4834e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (viewParentE instanceof InterfaceC0430p) {
            ((InterfaceC0430p) viewParentE).c(viewGroup, i10, i11, iArr3, i12);
        } else if (i12 == 0) {
            try {
                AbstractC0413b0.c(viewParentE, viewGroup, i10, i11, iArr3);
            } catch (AbstractMethodError unused) {
                Objects.toString(viewParentE);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i13;
            iArr2[1] = iArr2[1] - i14;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x008b  */
    public final boolean d(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        ViewParent viewParentE;
        int i15;
        int i16;
        int[] iArr3;
        ViewGroup viewGroup;
        if (this.f4833d && (viewParentE = e(i14)) != null) {
            if (i10 != 0 || i11 != 0 || i12 != 0 || i13 != 0) {
                ViewGroup viewGroup2 = this.f4832c;
                if (iArr != null) {
                    viewGroup2.getLocationInWindow(iArr);
                    i15 = iArr[0];
                    i16 = iArr[1];
                } else {
                    i15 = 0;
                    i16 = 0;
                }
                if (iArr2 == null) {
                    if (this.f4834e == null) {
                        this.f4834e = new int[2];
                    }
                    int[] iArr4 = this.f4834e;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (!(viewParentE instanceof InterfaceC0431q)) {
                    iArr3[0] = iArr3[0] + i12;
                    iArr3[1] = iArr3[1] + i13;
                    if (viewParentE instanceof InterfaceC0430p) {
                        InterfaceC0430p interfaceC0430p = (InterfaceC0430p) viewParentE;
                        viewGroup = viewGroup2;
                        interfaceC0430p.e(viewGroup, i10, i11, i12, i13, i14);
                    } else if (i14 == 0) {
                        try {
                            AbstractC0413b0.d(viewParentE, viewGroup2, i10, i11, i12, i13);
                        } catch (AbstractMethodError unused) {
                            Objects.toString(viewParentE);
                        }
                    }
                    if (iArr != null) {
                        viewGroup2.getLocationInWindow(iArr);
                        iArr[0] = iArr[0] - i15;
                        iArr[1] = iArr[1] - i16;
                    }
                    return true;
                }
                InterfaceC0431q interfaceC0431q = (InterfaceC0431q) viewParentE;
                viewGroup = viewGroup2;
                interfaceC0431q.d(viewGroup, i10, i11, i12, i13, i14, iArr3);
                viewGroup2 = viewGroup;
                if (iArr != null) {
                    viewGroup2.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i15;
                    iArr[1] = iArr[1] - i16;
                }
                return true;
            }
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
        }
        return false;
    }

    public final ViewParent e(int i10) {
        if (i10 == 0) {
            return this.a;
        }
        if (i10 != 1) {
            return null;
        }
        return this.f4831b;
    }

    public final boolean f(int i10) {
        return e(i10) != null;
    }

    public final boolean g(int i10, int i11) {
        boolean zF;
        if (!f(i11)) {
            if (this.f4833d) {
                ViewGroup viewGroup = this.f4832c;
                View view = viewGroup;
                for (ViewParent parent = viewGroup.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z6 = parent instanceof InterfaceC0430p;
                    if (z6) {
                        zF = ((InterfaceC0430p) parent).f(view, viewGroup, i10, i11);
                    } else if (i11 == 0) {
                        try {
                            zF = AbstractC0413b0.f(parent, view, viewGroup, i10);
                        } catch (AbstractMethodError unused) {
                            Objects.toString(parent);
                            zF = false;
                        }
                    } else {
                        zF = false;
                    }
                    if (zF) {
                        if (i11 == 0) {
                            this.a = parent;
                        } else if (i11 == 1) {
                            this.f4831b = parent;
                        }
                        if (z6) {
                            ((InterfaceC0430p) parent).a(view, viewGroup, i10, i11);
                        } else if (i11 == 0) {
                            try {
                                AbstractC0413b0.e(parent, view, viewGroup, i10);
                            } catch (AbstractMethodError unused2) {
                                Objects.toString(parent);
                            }
                        }
                    } else {
                        if (parent instanceof View) {
                            view = (View) parent;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void h(int i10) {
        ViewParent viewParentE = e(i10);
        if (viewParentE != null) {
            boolean z6 = viewParentE instanceof InterfaceC0430p;
            ViewGroup viewGroup = this.f4832c;
            if (z6) {
                ((InterfaceC0430p) viewParentE).b(viewGroup, i10);
            } else if (i10 == 0) {
                try {
                    AbstractC0413b0.g(viewParentE, viewGroup);
                } catch (AbstractMethodError unused) {
                    Objects.toString(viewParentE);
                }
            }
            if (i10 == 0) {
                this.a = null;
            } else {
                if (i10 != 1) {
                    return;
                }
                this.f4831b = null;
            }
        }
    }
}

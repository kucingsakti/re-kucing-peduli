package p136o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.kcstream.cing.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import p.C0;
import p.C0722p0;
import p.C0736x;
import p.D0;
import p.F0;
import p081i3.b;
import p118m3.k;

/* JADX INFO: loaded from: classes.dex */
public final class f extends t implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public View f13460F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public View f13461G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f13462H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f13463I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f13464J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f13465K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f13466L;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f13468N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public w f13469O;
    public ViewTreeObserver P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public u f13470Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public boolean f13471R;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Context f13472t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f13473u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f13474v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f13475w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Handler f13476x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ArrayList f13477y = new ArrayList();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ArrayList f13478z = new ArrayList();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final k f13455A = new k(this, 1);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final ViewOnAttachStateChangeListenerC0686d f13456B = new ViewOnAttachStateChangeListenerC0686d(this, 0);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final b f13457C = new b(this, 8);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f13458D = 0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f13459E = 0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f13467M = false;

    public f(Context context, View view, int i10, boolean z6) {
        this.f13472t = context;
        this.f13460F = view;
        this.f13474v = i10;
        this.f13475w = z6;
        this.f13462H = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f13473u = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f13476x = new Handler();
    }

    @Override // p136o.B
    public final void a() {
        if (b()) {
            return;
        }
        ArrayList arrayList = this.f13477y;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            x((l) it.next());
        }
        arrayList.clear();
        View view = this.f13460F;
        this.f13461G = view;
        if (view != null) {
            boolean z6 = this.P == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.P = viewTreeObserver;
            if (z6) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f13455A);
            }
            this.f13461G.addOnAttachStateChangeListener(this.f13456B);
        }
    }

    @Override // p136o.B
    public final boolean b() {
        ArrayList arrayList = this.f13478z;
        return arrayList.size() > 0 && ((e) arrayList.get(0)).a.f13918R.isShowing();
    }

    @Override // p136o.x
    public final void c(l lVar, boolean z6) {
        ArrayList arrayList = this.f13478z;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (lVar == ((e) arrayList.get(i10)).f13453b) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 < 0) {
            return;
        }
        int i11 = i10 + 1;
        if (i11 < arrayList.size()) {
            ((e) arrayList.get(i11)).f13453b.c(false);
        }
        e eVar = (e) arrayList.remove(i10);
        eVar.f13453b.r(this);
        boolean z10 = this.f13471R;
        F0 f0 = eVar.a;
        if (z10) {
            C0.b(f0.f13918R, null);
            f0.f13918R.setAnimationStyle(0);
        }
        f0.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f13462H = ((e) arrayList.get(size2 - 1)).f13454c;
        } else {
            this.f13462H = this.f13460F.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z6) {
                ((e) arrayList.get(0)).f13453b.c(false);
                return;
            }
            return;
        }
        dismiss();
        w wVar = this.f13469O;
        if (wVar != null) {
            wVar.c(lVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.P;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.P.removeGlobalOnLayoutListener(this.f13455A);
            }
            this.P = null;
        }
        this.f13461G.removeOnAttachStateChangeListener(this.f13456B);
        this.f13470Q.onDismiss();
    }

    @Override // p136o.B
    public final void dismiss() {
        ArrayList arrayList = this.f13478z;
        int size = arrayList.size();
        if (size > 0) {
            e[] eVarArr = (e[]) arrayList.toArray(new e[size]);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                e eVar = eVarArr[i10];
                if (eVar.a.f13918R.isShowing()) {
                    eVar.a.dismiss();
                }
            }
        }
    }

    @Override // p136o.x
    public final void e(boolean z6) {
        Iterator it = this.f13478z.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((e) it.next()).a.f13921u.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((i) adapter).notifyDataSetChanged();
        }
    }

    @Override // p136o.B
    public final C0722p0 f() {
        ArrayList arrayList = this.f13478z;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((e) arrayList.get(arrayList.size() - 1)).a.f13921u;
    }

    @Override // p136o.x
    public final void h(w wVar) {
        this.f13469O = wVar;
    }

    @Override // p136o.x
    public final boolean j() {
        return false;
    }

    @Override // p136o.x
    public final Parcelable k() {
        return null;
    }

    @Override // p136o.x
    public final boolean l(D d3) {
        for (e eVar : this.f13478z) {
            if (d3 == eVar.f13453b) {
                eVar.a.f13921u.requestFocus();
                return true;
            }
        }
        if (!d3.hasVisibleItems()) {
            return false;
        }
        n(d3);
        w wVar = this.f13469O;
        if (wVar != null) {
            wVar.l(d3);
        }
        return true;
    }

    @Override // p136o.t
    public final void n(l lVar) {
        lVar.b(this, this.f13472t);
        if (b()) {
            x(lVar);
        } else {
            this.f13477y.add(lVar);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        e eVar;
        ArrayList arrayList = this.f13478z;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                eVar = null;
                break;
            }
            eVar = (e) arrayList.get(i10);
            if (!eVar.a.f13918R.isShowing()) {
                break;
            } else {
                i10++;
            }
        }
        if (eVar != null) {
            eVar.f13453b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // p136o.t
    public final void p(View view) {
        if (this.f13460F != view) {
            this.f13460F = view;
            this.f13459E = Gravity.getAbsoluteGravity(this.f13458D, view.getLayoutDirection());
        }
    }

    @Override // p136o.t
    public final void q(boolean z6) {
        this.f13467M = z6;
    }

    @Override // p136o.t
    public final void r(int i10) {
        if (this.f13458D != i10) {
            this.f13458D = i10;
            this.f13459E = Gravity.getAbsoluteGravity(i10, this.f13460F.getLayoutDirection());
        }
    }

    @Override // p136o.t
    public final void s(int i10) {
        this.f13463I = true;
        this.f13465K = i10;
    }

    @Override // p136o.t
    public final void t(PopupWindow.OnDismissListener onDismissListener) {
        this.f13470Q = (u) onDismissListener;
    }

    @Override // p136o.t
    public final void u(boolean z6) {
        this.f13468N = z6;
    }

    @Override // p136o.t
    public final void v(int i10) {
        this.f13464J = true;
        this.f13466L = i10;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0153  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void x(l lVar) {
        int i10;
        char c10;
        View childAt;
        e eVar;
        int i11;
        int i12;
        int i13;
        int width;
        MenuItem item;
        i iVar;
        int headersCount;
        int firstVisiblePosition;
        Context context = this.f13472t;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        i iVar2 = new i(lVar, layoutInflaterFrom, this.f13475w, R.layout.abc_cascading_menu_item_layout);
        int i14 = 1;
        if (!b() && this.f13467M) {
            iVar2.f13487c = true;
        } else if (b()) {
            iVar2.f13487c = t.w(lVar);
        }
        int iO = t.o(iVar2, context, this.f13473u);
        F0 f0 = new F0(context, null, this.f13474v);
        C0736x c0736x = f0.f13918R;
        f0.f13940V = this.f13457C;
        f0.f13909H = this;
        c0736x.setOnDismissListener(this);
        f0.f13908G = this.f13460F;
        f0.f13905D = this.f13459E;
        f0.f13917Q = true;
        c0736x.setFocusable(true);
        c0736x.setInputMethodMode(2);
        f0.p(iVar2);
        f0.r(iO);
        f0.f13905D = this.f13459E;
        ArrayList arrayList = this.f13478z;
        if (arrayList.size() > 0) {
            eVar = (e) arrayList.get(arrayList.size() - 1);
            l lVar2 = eVar.f13453b;
            int size = lVar2.f13512x.size();
            int i15 = 0;
            while (true) {
                if (i15 >= size) {
                    item = null;
                    break;
                }
                item = lVar2.getItem(i15);
                if (item.hasSubMenu() && lVar == item.getSubMenu()) {
                    break;
                } else {
                    i15++;
                }
            }
            if (item == null) {
                i10 = 1;
                childAt = null;
                c10 = 0;
            } else {
                C0722p0 c0722p0 = eVar.a.f13921u;
                ListAdapter adapter = c0722p0.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    iVar = (i) headerViewListAdapter.getWrappedAdapter();
                } else {
                    iVar = (i) adapter;
                    headersCount = 0;
                }
                int count = iVar.getCount();
                int i16 = 0;
                c10 = 0;
                while (true) {
                    i10 = i14;
                    if (i16 >= count) {
                        i16 = -1;
                        break;
                    } else {
                        if (item == iVar.getItem(i16)) {
                            break;
                        }
                        i16++;
                        i14 = i10;
                    }
                }
                childAt = (i16 != -1 && (firstVisiblePosition = (i16 + headersCount) - c0722p0.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < c0722p0.getChildCount()) ? c0722p0.getChildAt(firstVisiblePosition) : null;
            }
        } else {
            i10 = 1;
            c10 = 0;
            childAt = null;
            eVar = null;
        }
        if (childAt != null) {
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = F0.f13939W;
                if (method != null) {
                    try {
                        Object[] objArr = new Object[i10];
                        objArr[c10] = Boolean.FALSE;
                        method.invoke(c0736x, objArr);
                    } catch (Exception unused) {
                        Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    }
                }
            } else {
                D0.a(c0736x, c10);
            }
            C0.a(c0736x, null);
            C0722p0 c0722p1 = ((e) arrayList.get(arrayList.size() - 1)).a.f13921u;
            int[] iArr = new int[2];
            c0722p1.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            this.f13461G.getWindowVisibleDisplayFrame(rect);
            if (this.f13462H == 1) {
                if (c0722p1.getWidth() + iArr[0] + iO > rect.right) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
            } else if (iArr[0] - iO < 0) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            boolean z6 = i11 == 1;
            this.f13462H = i11;
            if (Build.VERSION.SDK_INT >= 26) {
                f0.f13908G = childAt;
                i12 = 0;
                i13 = 0;
            } else {
                int[] iArr2 = new int[2];
                this.f13460F.getLocationOnScreen(iArr2);
                int[] iArr3 = new int[2];
                childAt.getLocationOnScreen(iArr3);
                if ((this.f13459E & 7) == 5) {
                    iArr2[0] = this.f13460F.getWidth() + iArr2[0];
                    iArr3[0] = childAt.getWidth() + iArr3[0];
                }
                int i17 = iArr3[0] - iArr2[0];
                i12 = iArr3[1] - iArr2[1];
                i13 = i17;
            }
            if ((this.f13459E & 5) == 5) {
                width = z6 ? i13 + iO : i13 - childAt.getWidth();
            } else {
                width = z6 ? i13 + childAt.getWidth() : i13 - iO;
            }
            f0.f13924x = width;
            f0.f13904C = true;
            f0.f13903B = true;
            f0.i(i12);
        } else {
            if (this.f13463I) {
                f0.f13924x = this.f13465K;
            }
            if (this.f13464J) {
                f0.i(this.f13466L);
            }
            Rect rect2 = this.f13554s;
            f0.P = rect2 != null ? new Rect(rect2) : null;
        }
        arrayList.add(new e(f0, lVar, this.f13462H));
        f0.a();
        C0722p0 c0722p2 = f0.f13921u;
        c0722p2.setOnKeyListener(this);
        if (eVar == null && this.f13468N && lVar.f13496E != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0722p2, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(lVar.f13496E);
            c0722p2.addHeaderView(frameLayout, null, false);
            f0.a();
        }
    }

    @Override // p136o.x
    public final void d(Parcelable parcelable) {
    }
}

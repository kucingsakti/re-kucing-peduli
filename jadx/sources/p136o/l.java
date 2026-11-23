package p136o;

import J.a;
import U.W;
import U.Y;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class l implements Menu {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final int[] f13491Q = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final ArrayList f13492A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final ArrayList f13493B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f13494C;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public CharSequence f13496E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public Drawable f13497F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public View f13498G;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public n f13505N;
    public boolean P;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Context f13507s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Resources f13508t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f13509u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f13510v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public j f13511w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ArrayList f13512x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ArrayList f13513y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f13514z;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f13495D = 0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f13499H = false;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f13500I = false;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f13501J = false;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f13502K = false;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final ArrayList f13503L = new ArrayList();

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final CopyOnWriteArrayList f13504M = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f13506O = false;

    public l(Context context) {
        boolean zB;
        boolean z6 = false;
        this.f13507s = context;
        Resources resources = context.getResources();
        this.f13508t = resources;
        this.f13512x = new ArrayList();
        this.f13513y = new ArrayList();
        this.f13514z = true;
        this.f13492A = new ArrayList();
        this.f13493B = new ArrayList();
        this.f13494C = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = Y.a;
            if (Build.VERSION.SDK_INT >= 28) {
                zB = W.b(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
                zB = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (zB) {
                z6 = true;
            }
        }
        this.f13510v = z6;
    }

    public n a(int i10, int i11, int i12, CharSequence charSequence) {
        int i13;
        int i14 = ((-65536) & i12) >> 16;
        if (i14 < 0 || i14 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i15 = (f13491Q[i14] << 16) | (65535 & i12);
        n nVar = new n(this, i10, i11, i12, i15, charSequence, this.f13495D);
        ArrayList arrayList = this.f13512x;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((n) arrayList.get(size)).f13541v <= i15) {
                i13 = size + 1;
                arrayList.add(i13, nVar);
                p(true);
                return nVar;
            }
        }
        i13 = 0;
        arrayList.add(i13, nVar);
        p(true);
        return nVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        int i14;
        PackageManager packageManager = this.f13507s.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i13 & 1) == 0) {
            removeGroup(i10);
        }
        for (int i15 = 0; i15 < size; i15++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i15);
            int i16 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i16 < 0 ? intent : intentArr[i16]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            n nVarA = a(i10, i11, i12, resolveInfo.loadLabel(packageManager));
            nVarA.setIcon(resolveInfo.loadIcon(packageManager));
            nVarA.f13544y = intent2;
            if (menuItemArr != null && (i14 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i14] = nVarA;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(x xVar, Context context) {
        this.f13504M.add(new WeakReference(xVar));
        xVar.i(context, this);
        this.f13494C = true;
    }

    public final void c(boolean z6) {
        if (this.f13502K) {
            return;
        }
        this.f13502K = true;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f13504M;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            x xVar = (x) weakReference.get();
            if (xVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                xVar.c(this, z6);
            }
        }
        this.f13502K = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        n nVar = this.f13505N;
        if (nVar != null) {
            d(nVar);
        }
        this.f13512x.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f13497F = null;
        this.f13496E = null;
        this.f13498G = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(n nVar) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f13504M;
        boolean zM = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f13505N == nVar) {
            y();
            for (WeakReference weakReference : copyOnWriteArrayList) {
                x xVar = (x) weakReference.get();
                if (xVar != null) {
                    zM = xVar.m(nVar);
                    if (zM) {
                        break;
                    }
                } else {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            x();
            if (zM) {
                this.f13505N = null;
            }
        }
        return zM;
    }

    public boolean e(l lVar, MenuItem menuItem) {
        j jVar = this.f13511w;
        return jVar != null && jVar.k(lVar, menuItem);
    }

    public boolean f(n nVar) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f13504M;
        boolean zG = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        y();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            x xVar = (x) weakReference.get();
            if (xVar != null) {
                zG = xVar.g(nVar);
                if (zG) {
                    break;
                }
            } else {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        x();
        if (zG) {
            this.f13505N = nVar;
        }
        return zG;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i10) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f13512x;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            n nVar = (n) arrayList.get(i11);
            if (nVar.f13538s == i10) {
                return nVar;
            }
            if (nVar.hasSubMenu() && (menuItemFindItem = nVar.f13524G.findItem(i10)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public final n g(int i10, KeyEvent keyEvent) {
        ArrayList arrayList = this.f13503L;
        arrayList.clear();
        h(arrayList, i10, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (n) arrayList.get(0);
        }
        boolean zN = n();
        for (int i11 = 0; i11 < size; i11++) {
            n nVar = (n) arrayList.get(i11);
            char c10 = zN ? nVar.f13519B : nVar.f13545z;
            char[] cArr = keyData.meta;
            if ((c10 == cArr[0] && (metaState & 2) == 0) || ((c10 == cArr[2] && (metaState & 2) != 0) || (zN && c10 == '\b' && i10 == 67))) {
                return nVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i10) {
        return (MenuItem) this.f13512x.get(i10);
    }

    public final void h(ArrayList arrayList, int i10, KeyEvent keyEvent) {
        boolean zN = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i10 == 67) {
            ArrayList arrayList2 = this.f13512x;
            int size = arrayList2.size();
            for (int i11 = 0; i11 < size; i11++) {
                n nVar = (n) arrayList2.get(i11);
                if (nVar.hasSubMenu()) {
                    nVar.f13524G.h(arrayList, i10, keyEvent);
                }
                char c10 = zN ? nVar.f13519B : nVar.f13545z;
                if ((modifiers & 69647) == ((zN ? nVar.f13520C : nVar.f13518A) & 69647) && c10 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c10 == cArr[0] || c10 == cArr[2] || (zN && c10 == '\b' && i10 == 67)) && nVar.isEnabled()) {
                        arrayList.add(nVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.P) {
            return true;
        }
        ArrayList arrayList = this.f13512x;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((n) arrayList.get(i10)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList arrayListL = l();
        if (this.f13494C) {
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f13504M;
            boolean zJ = false;
            for (WeakReference weakReference : copyOnWriteArrayList) {
                x xVar = (x) weakReference.get();
                if (xVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zJ |= xVar.j();
                }
            }
            ArrayList arrayList = this.f13492A;
            ArrayList arrayList2 = this.f13493B;
            if (zJ) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListL.size();
                for (int i10 = 0; i10 < size; i10++) {
                    n nVar = (n) arrayListL.get(i10);
                    if ((nVar.P & 32) == 32) {
                        arrayList.add(nVar);
                    } else {
                        arrayList2.add(nVar);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.f13494C = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return g(i10, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public final ArrayList l() {
        boolean z6 = this.f13514z;
        ArrayList arrayList = this.f13513y;
        if (!z6) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f13512x;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            n nVar = (n) arrayList2.get(i10);
            if (nVar.isVisible()) {
                arrayList.add(nVar);
            }
        }
        this.f13514z = false;
        this.f13494C = true;
        return arrayList;
    }

    public boolean m() {
        return this.f13506O;
    }

    public boolean n() {
        return this.f13509u;
    }

    public boolean o() {
        return this.f13510v;
    }

    public void p(boolean z6) {
        if (this.f13499H) {
            this.f13500I = true;
            if (z6) {
                this.f13501J = true;
                return;
            }
            return;
        }
        if (z6) {
            this.f13514z = true;
            this.f13494C = true;
        }
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f13504M;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        y();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            x xVar = (x) weakReference.get();
            if (xVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                xVar.e(z6);
            }
        }
        x();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i10, int i11) {
        return q(findItem(i10), null, i11);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        n nVarG = g(i10, keyEvent);
        boolean zQ = nVarG != null ? q(nVarG, null, i11) : false;
        if ((i11 & 2) != 0) {
            c(true);
        }
        return zQ;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0018  */
    /* JADX WARN: Code duplicated, block: B:30:0x0049  */
    /* JADX WARN: Code duplicated, block: B:33:0x0050  */
    /* JADX WARN: Code duplicated, block: B:35:0x0057  */
    /* JADX WARN: Code duplicated, block: B:36:0x005c  */
    /* JADX WARN: Code duplicated, block: B:43:0x006d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0071  */
    /* JADX WARN: Code duplicated, block: B:48:0x007a  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:55:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x009e  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x00a6 A[SYNTHETIC] */
    public final boolean q(MenuItem menuItem, x xVar, int i10) {
        o oVar;
        boolean zExpandActionView;
        o oVar2;
        boolean z6;
        D d3;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList;
        x xVar2;
        n nVar = (n) menuItem;
        boolean zL = false;
        if (nVar == null || !nVar.isEnabled()) {
            return false;
        }
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = nVar.f13525H;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(nVar)) {
            l lVar = nVar.f13523F;
            if (lVar.e(lVar, nVar)) {
                zExpandActionView = true;
            } else {
                Intent intent = nVar.f13544y;
                if (intent != null) {
                    try {
                        lVar.f13507s.startActivity(intent);
                    } catch (ActivityNotFoundException unused) {
                        oVar = nVar.f13535S;
                        if (oVar == null) {
                        }
                        zExpandActionView = false;
                        oVar2 = nVar.f13535S;
                        if (oVar2 == null) {
                            z6 = false;
                        } else {
                            z6 = false;
                        }
                        if (nVar.e()) {
                            zExpandActionView |= nVar.expandActionView();
                            if (zExpandActionView) {
                                c(true);
                            }
                        } else if (nVar.hasSubMenu()) {
                            if ((i10 & 4) == 0) {
                                c(false);
                            }
                            if (!nVar.hasSubMenu()) {
                                D d8 = new D(this.f13507s, this, nVar);
                                nVar.f13524G = d8;
                                d8.setHeaderTitle(nVar.f13542w);
                            }
                            d3 = nVar.f13524G;
                            if (z6) {
                                s sVar = oVar2.f13547c;
                                oVar2.f13546b.onPrepareSubMenu(d3);
                            }
                            copyOnWriteArrayList = this.f13504M;
                            if (!copyOnWriteArrayList.isEmpty()) {
                                if (xVar != null) {
                                }
                                for (WeakReference weakReference : copyOnWriteArrayList) {
                                    xVar2 = (x) weakReference.get();
                                    if (xVar2 == null) {
                                        copyOnWriteArrayList.remove(weakReference);
                                    } else if (!zL) {
                                        zL = xVar2.l(d3);
                                    }
                                }
                            }
                            zExpandActionView |= zL;
                            if (!zExpandActionView) {
                                c(true);
                            }
                        } else {
                            if ((i10 & 4) == 0) {
                                c(false);
                            }
                            if (!nVar.hasSubMenu()) {
                                D d10 = new D(this.f13507s, this, nVar);
                                nVar.f13524G = d10;
                                d10.setHeaderTitle(nVar.f13542w);
                            }
                            d3 = nVar.f13524G;
                            if (z6) {
                                s sVar2 = oVar2.f13547c;
                                oVar2.f13546b.onPrepareSubMenu(d3);
                            }
                            copyOnWriteArrayList = this.f13504M;
                            if (!copyOnWriteArrayList.isEmpty()) {
                                zL = xVar != null ? xVar.l(d3) : false;
                                while (r8.hasNext()) {
                                    xVar2 = (x) weakReference.get();
                                    if (xVar2 == null) {
                                        copyOnWriteArrayList.remove(weakReference);
                                    } else if (!zL) {
                                        zL = xVar2.l(d3);
                                    }
                                }
                            }
                            zExpandActionView |= zL;
                            if (!zExpandActionView) {
                                c(true);
                            }
                        }
                        return zExpandActionView;
                    }
                    zExpandActionView = true;
                } else {
                    oVar = nVar.f13535S;
                    if (oVar == null && oVar.f13546b.onPerformDefaultAction()) {
                        zExpandActionView = true;
                    } else {
                        zExpandActionView = false;
                    }
                }
            }
        } else {
            zExpandActionView = true;
        }
        oVar2 = nVar.f13535S;
        if (oVar2 == null && oVar2.f13546b.hasSubMenu()) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (nVar.e()) {
            zExpandActionView |= nVar.expandActionView();
            if (zExpandActionView) {
                c(true);
            }
        } else if (nVar.hasSubMenu() || z6) {
            if ((i10 & 4) == 0) {
                c(false);
            }
            if (!nVar.hasSubMenu()) {
                D d11 = new D(this.f13507s, this, nVar);
                nVar.f13524G = d11;
                d11.setHeaderTitle(nVar.f13542w);
            }
            d3 = nVar.f13524G;
            if (z6) {
                s sVar3 = oVar2.f13547c;
                oVar2.f13546b.onPrepareSubMenu(d3);
            }
            copyOnWriteArrayList = this.f13504M;
            if (!copyOnWriteArrayList.isEmpty()) {
                if (xVar != null) {
                }
                while (r8.hasNext()) {
                    xVar2 = (x) weakReference.get();
                    if (xVar2 == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else if (!zL) {
                        zL = xVar2.l(d3);
                    }
                }
            }
            zExpandActionView |= zL;
            if (!zExpandActionView) {
                c(true);
            }
        } else if ((i10 & 1) == 0) {
            c(true);
        }
        return zExpandActionView;
    }

    public final void r(x xVar) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f13504M;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            x xVar2 = (x) weakReference.get();
            if (xVar2 == null || xVar2 == xVar) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i10) {
        ArrayList arrayList = this.f13512x;
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                i12 = -1;
                break;
            } else if (((n) arrayList.get(i12)).f13539t == i10) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 >= 0) {
            int size2 = arrayList.size() - i12;
            while (true) {
                int i13 = i11 + 1;
                if (i11 >= size2 || ((n) arrayList.get(i12)).f13539t != i10) {
                    break;
                }
                if (i12 >= 0) {
                    ArrayList arrayList2 = this.f13512x;
                    if (i12 < arrayList2.size()) {
                        arrayList2.remove(i12);
                    }
                }
                i11 = i13;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i10) {
        ArrayList arrayList = this.f13512x;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                i11 = -1;
                break;
            } else if (((n) arrayList.get(i11)).f13538s == i10) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 >= 0) {
            ArrayList arrayList2 = this.f13512x;
            if (i11 >= arrayList2.size()) {
                return;
            }
            arrayList2.remove(i11);
            p(true);
        }
    }

    public final void s(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = this.f13512x.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((D) item.getSubMenu()).s(bundle);
            }
        }
        int i11 = bundle.getInt("android:menu:expandedactionview");
        if (i11 <= 0 || (menuItemFindItem = findItem(i11)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i10, boolean z6, boolean z10) {
        ArrayList arrayList = this.f13512x;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            n nVar = (n) arrayList.get(i11);
            if (nVar.f13539t == i10) {
                nVar.f(z10);
                nVar.setCheckable(z6);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z6) {
        this.f13506O = z6;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i10, boolean z6) {
        ArrayList arrayList = this.f13512x;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            n nVar = (n) arrayList.get(i11);
            if (nVar.f13539t == i10) {
                nVar.setEnabled(z6);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i10, boolean z6) {
        ArrayList arrayList = this.f13512x;
        int size = arrayList.size();
        boolean z10 = false;
        for (int i11 = 0; i11 < size; i11++) {
            n nVar = (n) arrayList.get(i11);
            if (nVar.f13539t == i10) {
                int i12 = nVar.P;
                int i13 = (i12 & (-9)) | (z6 ? 0 : 8);
                nVar.P = i13;
                if (i12 != i13) {
                    z10 = true;
                }
            }
        }
        if (z10) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z6) {
        this.f13509u = z6;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f13512x.size();
    }

    public final void t(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null) {
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f13504M;
            if (copyOnWriteArrayList.isEmpty()) {
                return;
            }
            for (WeakReference weakReference : copyOnWriteArrayList) {
                x xVar = (x) weakReference.get();
                if (xVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    int id = xVar.getId();
                    if (id > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id)) != null) {
                        xVar.d(parcelable);
                    }
                }
            }
        }
    }

    public final void u(Bundle bundle) {
        int size = this.f13512x.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((D) item.getSubMenu()).u(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void v(Bundle bundle) {
        Parcelable parcelableK;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f13504M;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            x xVar = (x) weakReference.get();
            if (xVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                int id = xVar.getId();
                if (id > 0 && (parcelableK = xVar.k()) != null) {
                    sparseArray.put(id, parcelableK);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
    }

    public final void w(int i10, CharSequence charSequence, int i11, Drawable drawable, View view) {
        if (view != null) {
            this.f13498G = view;
            this.f13496E = null;
            this.f13497F = null;
        } else {
            if (i10 > 0) {
                this.f13496E = this.f13508t.getText(i10);
            } else if (charSequence != null) {
                this.f13496E = charSequence;
            }
            if (i11 > 0) {
                this.f13497F = a.b(this.f13507s, i11);
            } else if (drawable != null) {
                this.f13497F = drawable;
            }
            this.f13498G = null;
        }
        p(false);
    }

    public final void x() {
        this.f13499H = false;
        if (this.f13500I) {
            this.f13500I = false;
            p(this.f13501J);
        }
    }

    public final void y() {
        if (this.f13499H) {
            return;
        }
        this.f13499H = true;
        this.f13500I = false;
        this.f13501J = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10) {
        return a(0, 0, 0, this.f13508t.getString(i10));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10) {
        return addSubMenu(0, 0, 0, this.f13508t.getString(i10));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return a(i10, i11, i12, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        n nVarA = a(i10, i11, i12, charSequence);
        D d3 = new D(this.f13507s, this, nVarA);
        nVarA.f13524G = d3;
        d3.setHeaderTitle(nVarA.f13542w);
        return d3;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, int i13) {
        return a(i10, i11, i12, this.f13508t.getString(i13));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return addSubMenu(i10, i11, i12, this.f13508t.getString(i13));
    }

    public l k() {
        return this;
    }
}

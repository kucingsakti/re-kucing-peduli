package p181s3;

import L8.InterfaceC0269c;
import L9.n;
import U8.g;
import X9.w;
import X9.y;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.bumptech.glide.d;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.onesignal.core.activities.PermissionsActivity;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;
import ma.r;
import p010aa.b;
import p010aa.c;
import p040e1.e;
import p086i8.k;
import p086i8.u;
import p096j9.f;
import p114l9.m;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SideSheetBehavior f14589b;

    public /* synthetic */ a(SideSheetBehavior sideSheetBehavior, int i10) {
        this.a = i10;
        this.f14589b = sideSheetBehavior;
    }

    public static final void a(p010aa.a aVar, b bVar, String str) {
        c.f6024i.fine(bVar.f6018b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + aVar.a);
    }

    public static void b(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void c(int i10, int i11, int i12) {
        if (i10 >= 0 && i11 <= i12) {
            if (i10 > i11) {
                throw new IllegalArgumentException(AbstractC0487g.h("fromIndex: ", i10, " > toIndex: ", i11));
            }
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i10 + ", toIndex: " + i11 + ", size: " + i12);
    }

    public static float d(float f10, float f11, float f12) {
        if (f10 < f11) {
            return f11;
        }
        return f10 > f12 ? f12 : f10;
    }

    public static int e(int i10, int i11, int i12) {
        if (i10 < i11) {
            return i11;
        }
        return i10 > i12 ? i12 : i10;
    }

    public static final void f(P0.c cVar) throws IOException {
        p095j8.b bVar = new p095j8.b();
        Cursor cursorN = cVar.n("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (cursorN.moveToNext()) {
            try {
                bVar.add(cursorN.getString(0));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    com.bumptech.glide.c.c(cursorN, th);
                    throw th2;
                }
            }
        }
        cursorN.close();
        ListIterator listIterator = d.a(bVar).listIterator(0);
        while (true) {
            p095j8.a aVar = (p095j8.a) listIterator;
            if (!aVar.hasNext()) {
                return;
            }
            String str = (String) aVar.next();
            i.e(str, "triggerName");
            if (n.I(str, "room_fts_content_sync_", false)) {
                cVar.h("DROP TRIGGER IF EXISTS ".concat(str));
            }
        }
    }

    public static InvocationHandler g() {
        ClassLoader classLoader;
        if (Build.VERSION.SDK_INT >= 28) {
            classLoader = e.b();
        } else {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", new Class[0]);
                declaredMethod.setAccessible(true);
                classLoader = declaredMethod.invoke(null, new Object[0]).getClass().getClassLoader();
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            } catch (NoSuchMethodException e11) {
                throw new RuntimeException(e11);
            } catch (InvocationTargetException e12) {
                throw new RuntimeException(e12);
            }
        }
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, classLoader).getDeclaredMethod("createWebViewProviderFactory", new Class[0]).invoke(null, new Object[0]);
    }

    public static final String h(long j) {
        String str;
        if (j <= -999500000) {
            str = ((j - ((long) 500000000)) / ((long) 1000000000)) + " s ";
        } else if (j <= -999500) {
            str = ((j - ((long) 500000)) / ((long) 1000000)) + " ms";
        } else if (j <= 0) {
            str = ((j - ((long) PermissionsActivity.DELAY_TIME_CALLBACK_CALL)) / ((long) 1000)) + " µs";
        } else if (j < 999500) {
            str = ((j + ((long) PermissionsActivity.DELAY_TIME_CALLBACK_CALL)) / ((long) 1000)) + " µs";
        } else if (j < 999500000) {
            str = ((j + ((long) 500000)) / ((long) 1000000)) + " ms";
        } else {
            str = ((j + ((long) 500000000)) / ((long) 1000000000)) + " s ";
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
    }

    public static boolean m(InterfaceC0269c interfaceC0269c) {
        i.f(interfaceC0269c, "callableMemberDescriptor");
        if (!g.f4974d.contains(interfaceC0269c.getName())) {
            return false;
        }
        if (k.O(g.f4973c, p165q9.d.c(interfaceC0269c)) && interfaceC0269c.H0().isEmpty()) {
            return true;
        }
        if (!I8.i.z(interfaceC0269c)) {
            return false;
        }
        Collection collectionX = interfaceC0269c.x();
        i.e(collectionX, "overriddenDescriptors");
        Collection<InterfaceC0269c> collection = collectionX;
        if (collection.isEmpty()) {
            return false;
        }
        for (InterfaceC0269c interfaceC0269c2 : collection) {
            i.e(interfaceC0269c2, "it");
            if (m(interfaceC0269c2)) {
                return true;
            }
        }
        return false;
    }

    public static void n(final Context context) {
        final boolean z6;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        if (com.bumptech.glide.c.g(context).getBoolean("proxy_notification_initialized", false)) {
            return;
        }
        try {
            Context applicationContext = context.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            z6 = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_notification_delegation_enabled")) ? true : applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (Build.VERSION.SDK_INT < 29) {
            Tasks.e(null);
        } else {
            final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            new Runnable() { // from class: o4.p
                @Override // java.lang.Runnable
                public final void run() {
                    Context context2 = context;
                    TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                    try {
                        if (!(Binder.getCallingUid() == context2.getApplicationInfo().uid)) {
                            context2.getPackageName();
                            return;
                        }
                        SharedPreferences.Editor editorEdit = com.bumptech.glide.c.g(context2).edit();
                        editorEdit.putBoolean("proxy_notification_initialized", true);
                        editorEdit.apply();
                        NotificationManager notificationManager = (NotificationManager) context2.getSystemService(NotificationManager.class);
                        if (z6) {
                            notificationManager.setNotificationDelegate("com.google.android.gms");
                        } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                            notificationManager.setNotificationDelegate(null);
                        }
                    } finally {
                        taskCompletionSource2.d(null);
                    }
                }
            }.run();
        }
    }

    public static String o(y yVar) {
        i.f(yVar, "url");
        ma.i iVar = ma.i.f13191v;
        return p230x9.d.r(yVar.f5663i).g("MD5").i();
    }

    public static int p(r rVar) throws IOException {
        try {
            long jH = rVar.h();
            String strO = rVar.o(Long.MAX_VALUE);
            if (jH >= 0 && jH <= 2147483647L && strO.length() <= 0) {
                return (int) jH;
            }
            throw new IOException("expected an int but was \"" + jH + strO + '\"');
        } catch (NumberFormatException e10) {
            throw new IOException(e10.getMessage());
        }
    }

    public static final String q(f fVar) {
        i.f(fVar, "<this>");
        String strG = fVar.g();
        i.e(strG, "asString()");
        if (!m.a.contains(strG)) {
            for (int i10 = 0; i10 < strG.length(); i10++) {
                char cCharAt = strG.charAt(i10);
                if (Character.isLetterOrDigit(cCharAt) || cCharAt == '_') {
                }
            }
            String strG2 = fVar.g();
            i.e(strG2, "asString()");
            return strG2;
        }
        StringBuilder sb = new StringBuilder();
        String strG3 = fVar.g();
        i.e(strG3, "asString()");
        sb.append("`".concat(strG3));
        sb.append('`');
        return sb.toString();
    }

    public static final String r(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            if (sb.length() > 0) {
                sb.append(".");
            }
            sb.append(q(fVar));
        }
        String string = sb.toString();
        i.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static final String s(String str, String str2, String str3, String str4, String str5) {
        i.f(str, "lowerRendered");
        i.f(str2, "lowerPrefix");
        i.f(str3, "upperRendered");
        i.f(str4, "upperPrefix");
        i.f(str5, "foldedPrefix");
        if (!n.I(str, str2, false) || !n.I(str3, str4, false)) {
            return null;
        }
        String strSubstring = str.substring(str2.length());
        i.e(strSubstring, "this as java.lang.String).substring(startIndex)");
        String strSubstring2 = str3.substring(str4.length());
        i.e(strSubstring2, "this as java.lang.String).substring(startIndex)");
        String strConcat = str5.concat(strSubstring);
        if (strSubstring.equals(strSubstring2)) {
            return strConcat;
        }
        if (!v(strSubstring, strSubstring2)) {
            return null;
        }
        return strConcat + '!';
    }

    public static int t(float f10) {
        if (Float.isNaN(f10)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f10);
    }

    public static B8.a u(B8.c cVar, int i10) {
        i.f(cVar, "<this>");
        boolean z6 = i10 > 0;
        Integer numValueOf = Integer.valueOf(i10);
        if (z6) {
            if (cVar.f771u <= 0) {
                i10 = -i10;
            }
            return new B8.a(cVar.f769s, cVar.f770t, i10);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + numValueOf + '.');
    }

    public static final boolean v(String str, String str2) {
        i.f(str, "lower");
        i.f(str2, "upper");
        if (str.equals(n.G(str2, "?", ""))) {
            return true;
        }
        if (n.B(str2, "?") && i.a(str.concat("?"), str2)) {
            return true;
        }
        StringBuilder sb = new StringBuilder("(");
        sb.append(str);
        sb.append(")?");
        return i.a(sb.toString(), str2);
    }

    public static B8.c w(int i10, int i11) {
        if (i11 > Integer.MIN_VALUE) {
            return new B8.c(i10, i11 - 1, 1);
        }
        B8.c cVar = B8.c.f776v;
        return B8.c.f776v;
    }

    public static Set y(w wVar) {
        int size = wVar.size();
        TreeSet treeSet = null;
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            if ("Vary".equalsIgnoreCase(wVar.f(i10))) {
                String strM = wVar.m(i10);
                if (treeSet == null) {
                    Comparator comparator = String.CASE_INSENSITIVE_ORDER;
                    i.e(comparator, "CASE_INSENSITIVE_ORDER");
                    treeSet = new TreeSet(comparator);
                }
                Iterator it = L9.f.b0(strM, new char[]{','}).iterator();
                while (it.hasNext()) {
                    treeSet.add(L9.f.j0((String) it.next()).toString());
                }
            }
            i10 = i11;
        }
        return treeSet == null ? u.f12330s : treeSet;
    }

    public final int i() {
        switch (this.a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f14589b;
                return Math.max(0, sideSheetBehavior.f9789F + sideSheetBehavior.f9790G);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.f14589b;
                return Math.max(0, (sideSheetBehavior2.f9788E - sideSheetBehavior2.f9787D) - sideSheetBehavior2.f9790G);
        }
    }

    public final int j() {
        switch (this.a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f14589b;
                return (-sideSheetBehavior.f9787D) - sideSheetBehavior.f9790G;
            default:
                return this.f14589b.f9788E;
        }
    }

    public final int k(View view) {
        switch (this.a) {
            case 0:
                return view.getRight() + this.f14589b.f9790G;
            default:
                return view.getLeft() - this.f14589b.f9790G;
        }
    }

    public final int l() {
        switch (this.a) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    public final void x(ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
        switch (this.a) {
            case 0:
                marginLayoutParams.leftMargin = i10;
                break;
            default:
                marginLayoutParams.rightMargin = i10;
                break;
        }
    }
}

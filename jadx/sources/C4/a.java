package C4;

import A0.s;
import A9.AbstractC0151y;
import A9.D;
import A9.b0;
import C3.b;
import C8.E;
import F8.p0;
import F8.y0;
import Fa.e;
import G8.u;
import L8.InterfaceC0269c;
import L8.InterfaceC0271e;
import L8.InterfaceC0273g;
import L8.InterfaceC0275i;
import L8.InterfaceC0276j;
import L8.InterfaceC0285t;
import L8.K;
import L8.T;
import L9.f;
import O8.U;
import O8.x;
import U.InterfaceC0425k;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.kcstream.cing.R;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import o1.c;
import p106l0.m;
import p106l0.n;
import p124m9.g;
import p156q0.C0742a;
import p156q0.M;
import p163q7.l;
import p165q9.d;
import p210v8.i;
import s8.h;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static boolean a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f943b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f944c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Field f945d;

    public a() {
        new ConcurrentHashMap();
    }

    public static final s A(M m2, String str, int i10) {
        Bundle bundle;
        s sVar = (s) m2.E(str);
        if (sVar != null) {
            return sVar;
        }
        if (i10 != 0) {
            bundle = new Bundle();
            bundle.putInt("android-support-nav:fragment:graphId", i10);
        } else {
            bundle = null;
        }
        s sVar2 = new s();
        if (bundle != null) {
            sVar2.b0(bundle);
        }
        C0742a c0742a = new C0742a(m2);
        c0742a.j(R.id.nav_host_fragment, sVar2, str, 1);
        c0742a.h();
        return sVar2;
    }

    public static TypedValue B(Context context, int i10) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i10, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean C(Context context, int i10, boolean z6) {
        TypedValue typedValueB = B(context, i10);
        if (typedValueB == null || typedValueB.type != 18) {
            return z6;
        }
        return typedValueB.data != 0;
    }

    public static TypedValue D(int i10, Context context, String str) {
        TypedValue typedValueB = B(context, i10);
        if (typedValueB != null) {
            return typedValueB;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i10)));
    }

    public static void E(Runnable runnable) {
        new Handler(Looper.getMainLooper()).postDelayed(runnable, 0L);
    }

    public static int F(int i10) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i10) * (-862048943)), 15)) * 461845907);
    }

    public static final Class G(AbstractC0151y abstractC0151y) {
        D dF;
        i.f(abstractC0151y, "<this>");
        Class clsH = H(abstractC0151y.D().w());
        if (clsH == null) {
            return null;
        }
        if (b0.e(abstractC0151y) && ((dF = g.f(abstractC0151y)) == null || b0.e(dF) || I8.i.F(dF))) {
            return null;
        }
        return clsH;
    }

    public static final Class H(InterfaceC0276j interfaceC0276j) {
        if (!(interfaceC0276j instanceof InterfaceC0271e) || !g.b(interfaceC0276j)) {
            return null;
        }
        InterfaceC0271e interfaceC0271e = (InterfaceC0271e) interfaceC0276j;
        Class clsJ = y0.j(interfaceC0271e);
        if (clsJ != null) {
            return clsJ;
        }
        throw new p0("Class object for the class " + interfaceC0271e.getName() + " cannot be found (classId=" + d.f((InterfaceC0273g) interfaceC0276j) + ')', 0);
    }

    public static final void a(File file, long j) throws IOException {
        if (!file.exists()) {
            b.j(file);
        }
        if (file.length() != j && j > 0) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                randomAccessFile.setLength(j);
                randomAccessFile.close();
            } catch (Exception unused) {
                throw new IOException("file_allocation_error");
            }
        }
    }

    public static String b(int i10, String str, int i11) {
        if (i10 < 0) {
            return E.v("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return E.v("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(AbstractC0487g.g(i11, "negative size: "));
    }

    public static void c(int i10, int i11) {
        String strV;
        if (i10 < 0 || i10 >= i11) {
            if (i10 < 0) {
                strV = E.v("%s (%s) must not be negative", "index", Integer.valueOf(i10));
            } else {
                if (i11 < 0) {
                    throw new IllegalArgumentException(AbstractC0487g.g(i11, "negative size: "));
                }
                strV = E.v("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
            }
            throw new IndexOutOfBoundsException(strV);
        }
    }

    public static void d(int i10, int i11) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(b(i10, "index", i11));
        }
    }

    public static void e(int i10, int i11, int i12) {
        String strB;
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            if (i10 < 0 || i10 > i12) {
                strB = b(i10, "start index", i12);
            } else {
                strB = (i11 < 0 || i11 > i12) ? b(i11, "end index", i12) : E.v("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(strB);
        }
    }

    public static final Object f(Object obj, InterfaceC0269c interfaceC0269c) {
        AbstractC0151y abstractC0151yU;
        Class clsG;
        return (((interfaceC0269c instanceof K) && g.d((T) interfaceC0269c)) || (abstractC0151yU = u(interfaceC0269c)) == null || (clsG = G(abstractC0151yU)) == null) ? obj : z(clsG, interfaceC0269c).invoke(obj, new Object[0]);
    }

    public static int g(Context context, int i10) {
        return Math.round(TypedValue.applyDimension(1, i10, context.getResources().getDisplayMetrics()));
    }

    public static n h(Context context) {
        ProviderInfo providerInfo;
        e eVar;
        ApplicationInfo applicationInfo;
        p230x9.d bVar = Build.VERSION.SDK_INT >= 28 ? new p106l0.b(22) : new p230x9.d(22);
        PackageManager packageManager = context.getPackageManager();
        xa.d.d(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            eVar = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrS = bVar.s(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrS) {
                    arrayList.add(signature.toByteArray());
                }
                eVar = new e(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e10) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e10);
                eVar = null;
            }
        }
        if (eVar == null) {
            return null;
        }
        return new n(new m(context, eVar));
    }

    public static final G8.e m(G8.e eVar, InterfaceC0285t interfaceC0285t, boolean z6) {
        AbstractC0151y abstractC0151yW;
        AbstractC0151y abstractC0151yU;
        i.f(interfaceC0285t, "descriptor");
        if (!g.a(interfaceC0285t)) {
            List listH0 = interfaceC0285t.H0();
            i.e(listH0, "descriptor.valueParameters");
            List list = listH0;
            if ((list instanceof Collection) && list.isEmpty()) {
                abstractC0151yW = interfaceC0285t.w();
                return abstractC0151yW != null ? eVar : eVar;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC0151y type = ((U) it.next()).getType();
                i.e(type, "it.type");
                if (g.c(type)) {
                }
            }
            abstractC0151yW = interfaceC0285t.w();
            if ((abstractC0151yW != null || !g.c(abstractC0151yW)) && ((eVar instanceof G8.d) || (abstractC0151yU = u(interfaceC0285t)) == null || !g.c(abstractC0151yU))) {
            }
        }
        return new u(eVar, interfaceC0285t, z6);
    }

    public static final String n(String str, boolean z6) {
        i.g(str, "filePath");
        if (!z6) {
            b.j(new File(str));
            return str;
        }
        File file = new File(str);
        if (file.exists()) {
            String str2 = file.getParent() + '/';
            String name = file.getName();
            i.e(name, "getName(...)");
            String strF0 = f.f0(name, '.', "");
            String strC = h.C(file);
            int i10 = 0;
            while (file.exists()) {
                i10++;
                file = new File(str2 + (strC + " (" + i10 + ')') + '.' + strF0);
            }
        }
        b.j(file);
        String absolutePath = file.getAbsolutePath();
        i.b(absolutePath, "getIncrementedFileIfOrig…ts(filePath).absolutePath");
        return absolutePath;
    }

    public static boolean o(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int iIndexOfKey;
        WeakHashMap weakHashMap = U.U.a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = U.T.f4783d;
        U.T t7 = (U.T) view.getTag(R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (t7 == null) {
            t7 = new U.T();
            t7.a = null;
            t7.f4784b = null;
            t7.f4785c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, t7);
        }
        WeakReference weakReference2 = t7.f4785c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        t7.f4785c = new WeakReference(keyEvent);
        if (t7.f4784b == null) {
            t7.f4784b = new SparseArray();
        }
        SparseArray sparseArray = t7.f4784b;
        if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(iIndexOfKey);
            sparseArray.removeAt(iIndexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }

    public static boolean p(InterfaceC0425k interfaceC0425k, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        boolean zBooleanValue = false;
        if (interfaceC0425k != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                return interfaceC0425k.b(keyEvent);
            }
            if (callback instanceof Activity) {
                Activity activity = (Activity) callback;
                activity.onUserInteraction();
                Window window = activity.getWindow();
                if (window.hasFeature(8)) {
                    ActionBar actionBar = activity.getActionBar();
                    if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                        if (!a) {
                            try {
                                f943b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                            } catch (NoSuchMethodException unused) {
                            }
                            a = true;
                        }
                        Method method = f943b;
                        if (method != null) {
                            try {
                                Object objInvoke = method.invoke(actionBar, keyEvent);
                                if (objInvoke != null) {
                                    zBooleanValue = ((Boolean) objInvoke).booleanValue();
                                }
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                        if (zBooleanValue) {
                            return true;
                        }
                    }
                }
                if (window.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView = window.getDecorView();
                if (U.U.c(decorView, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
            }
            if (callback instanceof Dialog) {
                Dialog dialog = (Dialog) callback;
                if (!f944c) {
                    try {
                        Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                        f945d = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException unused3) {
                    }
                    f944c = true;
                }
                Field field = f945d;
                if (field != null) {
                    try {
                        onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                    } catch (IllegalAccessException unused4) {
                        onKeyListener = null;
                    }
                } else {
                    onKeyListener = null;
                }
                if (onKeyListener != null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                    return true;
                }
                Window window2 = dialog.getWindow();
                if (window2.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView2 = window2.getDecorView();
                if (U.U.c(decorView2, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
            }
            if ((view != null && U.U.c(view, keyEvent)) || interfaceC0425k.b(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    public static int q(int i10) {
        return (int) TypedValue.applyDimension(1, i10, Resources.getSystem().getDisplayMetrics());
    }

    public static final h7.b s(String str) {
        h7.b bVar = h7.b.UNKNOWN;
        if (str != null && str.length() != 0) {
            if (str.equalsIgnoreCase("request_with_file_path_already_exist") || f.J(str, "UNIQUE constraint failed: requests._file (code 2067)", true)) {
                return h7.b.REQUEST_WITH_FILE_PATH_ALREADY_EXIST;
            }
            if (f.J(str, "UNIQUE constraint failed: requests._id", false)) {
                return h7.b.REQUEST_WITH_ID_ALREADY_EXIST;
            }
            if (f.J(str, "empty_response_body", true)) {
                return h7.b.EMPTY_RESPONSE_FROM_SERVER;
            }
            if (str.equalsIgnoreCase("FNC") || str.equalsIgnoreCase("open failed: ENOENT (No such file or directory)")) {
                return h7.b.FILE_NOT_CREATED;
            }
            if (f.J(str, "recvfrom failed: ETIMEDOUT (Connection timed out)", true) || f.J(str, "timeout", true) || f.J(str, "Software caused connection abort", true) || f.J(str, "Read timed out at", true)) {
                return h7.b.CONNECTION_TIMED_OUT;
            }
            if (str.equalsIgnoreCase("java.io.IOException: 404") || f.J(str, "No address associated with hostname", false)) {
                return h7.b.HTTP_NOT_FOUND;
            }
            if (f.J(str, "Unable to resolve host", false)) {
                return h7.b.UNKNOWN_HOST;
            }
            if (str.equalsIgnoreCase("open failed: EACCES (Permission denied)")) {
                return h7.b.WRITE_PERMISSION_DENIED;
            }
            if (str.equalsIgnoreCase("write failed: ENOSPC (No space left on device)") || str.equalsIgnoreCase("database or disk is full (code 13)")) {
                return h7.b.NO_STORAGE_SPACE;
            }
            if (str.equalsIgnoreCase("UNIQUE constraint failed: requests._id (code 1555)")) {
                return h7.b.REQUEST_ALREADY_EXIST;
            }
            if (str.equalsIgnoreCase("fetch download not found")) {
                return h7.b.DOWNLOAD_NOT_FOUND;
            }
            if (str.equalsIgnoreCase("Fetch data base error")) {
                return h7.b.FETCH_DATABASE_ERROR;
            }
            if (f.J(str, "request_not_successful", true) || f.J(str, "Failed to connect", true)) {
                return h7.b.REQUEST_NOT_SUCCESSFUL;
            }
            if (f.J(str, "invalid content hash", true)) {
                return h7.b.INVALID_CONTENT_HASH;
            }
            if (f.J(str, "download_incomplete", true)) {
                return h7.b.UNKNOWN_IO_ERROR;
            }
            if (f.J(str, "failed_to_update_request", true)) {
                return h7.b.FAILED_TO_UPDATE_REQUEST;
            }
            if (f.J(str, "failed_to_add_completed_download", true)) {
                return h7.b.FAILED_TO_ADD_COMPLETED_DOWNLOAD;
            }
            if (f.J(str, "fetch_file_server_invalid_response_type", true)) {
                return h7.b.FETCH_FILE_SERVER_INVALID_RESPONSE;
            }
            if (f.J(str, "request_does_not_exist", true)) {
                return h7.b.REQUEST_DOES_NOT_EXIST;
            }
            if (f.J(str, "no_network_connection", true)) {
                return h7.b.NO_NETWORK_CONNECTION;
            }
            if (f.J(str, "file_not_found", true)) {
                return h7.b.FILE_NOT_FOUND;
            }
            if (f.J(str, "fetch_file_server_url_invalid", true)) {
                return h7.b.FETCH_FILE_SERVER_URL_INVALID;
            }
            if (f.J(str, "request_list_not_distinct", true)) {
                return h7.b.ENQUEUED_REQUESTS_ARE_NOT_DISTINCT;
            }
            if (f.J(str, "enqueue_not_successful", true)) {
                return h7.b.ENQUEUE_NOT_SUCCESSFUL;
            }
            if (f.J(str, "cannot rename file associated with incomplete download", true)) {
                return h7.b.FAILED_TO_RENAME_INCOMPLETE_DOWNLOAD_FILE;
            }
            if (f.J(str, "file_cannot_be_renamed", true)) {
                return h7.b.FAILED_TO_RENAME_FILE;
            }
            if (f.J(str, "file_allocation_error", true)) {
                return h7.b.FILE_ALLOCATION_FAILED;
            }
            if (f.J(str, "Cleartext HTTP traffic to", true)) {
                return h7.b.HTTP_CONNECTION_NOT_ALLOWED;
            }
        }
        return bVar;
    }

    public static final h7.b t(Exception exc) {
        String message = exc.getMessage();
        if (message == null) {
            message = "";
        }
        boolean z6 = exc instanceof SocketTimeoutException;
        if (z6 && message.length() == 0) {
            message = "timeout";
        }
        h7.b bVarS = s(message);
        h7.b bVar = h7.b.UNKNOWN;
        if (bVarS == bVar && z6) {
            return h7.b.CONNECTION_TIMED_OUT;
        }
        return (bVarS == bVar && (exc instanceof IOException)) ? h7.b.UNKNOWN_IO_ERROR : bVarS;
    }

    public static final AbstractC0151y u(InterfaceC0269c interfaceC0269c) {
        x xVarR = interfaceC0269c.R();
        x xVarG = interfaceC0269c.G();
        if (xVarR != null) {
            return xVarR.getType();
        }
        if (xVarG != null) {
            if (interfaceC0269c instanceof InterfaceC0275i) {
                return xVarG.getType();
            }
            InterfaceC0276j interfaceC0276jV = interfaceC0269c.v();
            InterfaceC0271e interfaceC0271e = interfaceC0276jV instanceof InterfaceC0271e ? (InterfaceC0271e) interfaceC0276jV : null;
            if (interfaceC0271e != null) {
                return interfaceC0271e.p();
            }
        }
        return null;
    }

    public static final D6.a v(ContentResolver contentResolver, String str) throws FileNotFoundException {
        i.g(str, "filePath");
        if (!b.J(str)) {
            return w(new File(str));
        }
        Uri uri = Uri.parse(str);
        i.b(uri, "Uri.parse(filePath)");
        if (i.a(uri.getScheme(), "content")) {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "w");
            if (parcelFileDescriptorOpenFileDescriptor != null) {
                FileDescriptor fileDescriptor = parcelFileDescriptorOpenFileDescriptor.getFileDescriptor();
                i.b(fileDescriptor, "parcelFileDescriptor.fileDescriptor");
                return new l(new FileOutputStream(fileDescriptor));
            }
            throw new FileNotFoundException(uri + " file_not_found");
        }
        if (!i.a(uri.getScheme(), "file")) {
            throw new FileNotFoundException(uri + " file_not_found");
        }
        File file = new File(uri.getPath());
        if (file.exists() && file.canWrite()) {
            return w(file);
        }
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor2 = contentResolver.openFileDescriptor(uri, "w");
        if (parcelFileDescriptorOpenFileDescriptor2 != null) {
            FileDescriptor fileDescriptor2 = parcelFileDescriptorOpenFileDescriptor2.getFileDescriptor();
            i.b(fileDescriptor2, "parcelFileDescriptor.fileDescriptor");
            return new l(new FileOutputStream(fileDescriptor2));
        }
        throw new FileNotFoundException(uri + " file_not_found");
    }

    public static final l w(File file) throws FileNotFoundException {
        if (file.exists()) {
            return new l(new RandomAccessFile(file, "rw"));
        }
        throw new FileNotFoundException(file.getCanonicalPath() + " file_not_found");
    }

    public static final Method z(Class cls, InterfaceC0269c interfaceC0269c) {
        i.f(interfaceC0269c, "descriptor");
        try {
            Method declaredMethod = cls.getDeclaredMethod("unbox-impl", new Class[0]);
            i.e(declaredMethod, "{\n        getDeclaredMet…LINE_CLASS_MEMBERS)\n    }");
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new p0("No unbox method found in inline class: " + cls + " (calling " + interfaceC0269c + ')', 0);
        }
    }

    public abstract Typeface i(Context context, K.f fVar, Resources resources, int i10);

    public abstract Typeface j(Context context, R.h[] hVarArr, int i10);

    public Typeface k(Context context, InputStream inputStream) {
        File fileS = E.s(context);
        if (fileS == null) {
            return null;
        }
        try {
            if (E.i(fileS, inputStream)) {
                return Typeface.createFromFile(fileS.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileS.delete();
        }
    }

    public Typeface l(Context context, Resources resources, int i10, String str, int i11) {
        File fileS = E.s(context);
        if (fileS == null) {
            return null;
        }
        try {
            if (E.h(fileS, resources, i10)) {
                return Typeface.createFromFile(fileS.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileS.delete();
        }
    }

    public R.h r(int i10, R.h[] hVarArr) {
        new p204v1.g(7);
        int i11 = (i10 & 1) == 0 ? 400 : 700;
        boolean z6 = (i10 & 2) != 0;
        R.h hVar = null;
        int i12 = Integer.MAX_VALUE;
        for (R.h hVar2 : hVarArr) {
            int iAbs = (Math.abs(hVar2.f4426c - i11) * 2) + (hVar2.f4427d == z6 ? 0 : 1);
            if (hVar == null || i12 > iAbs) {
                hVar = hVar2;
                i12 = iAbs;
            }
        }
        return hVar;
    }

    public abstract void x(Context context, String str, p199u7.d dVar);

    public abstract void y(Context context, p199u7.d dVar, A1.l lVar, c cVar);
}

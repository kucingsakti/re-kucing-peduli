package C8;

import F8.m0;
import U.InterfaceC0419e0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.TypedValue;
import android.view.View;
import android.widget.EditText;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.kcstream.cing.R;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public abstract class E implements InterfaceC0419e0 {
    public static final /* synthetic */ int a = 0;

    public static Z8.a A(int i10, boolean z6, Y8.F f10, int i11) {
        boolean z10 = (i11 & 1) != 0 ? false : z6;
        boolean z11 = (i11 & 2) == 0;
        if ((i11 & 4) != 0) {
            f10 = null;
        }
        AbstractC0487g.p(i10, "<this>");
        return new Z8.a(i10, z11, z10, f10 != null ? p086i8.C.w(f10) : null, 34);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0079  */
    public static final String d(Type type) {
        String name;
        String string;
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (cls.isArray()) {
            K9.l lVarX = K9.n.x(type, D.f953A);
            StringBuilder sb = new StringBuilder();
            sb.append(((Class) K9.n.y(lVarX)).getName());
            int iT = K9.n.t(lVarX);
            if (iT < 0) {
                throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + iT + '.').toString());
            }
            if (iT == 0) {
                string = "";
            } else if (iT != 1) {
                int length = "[]".length();
                if (length == 0) {
                    string = "";
                } else if (length != 1) {
                    StringBuilder sb2 = new StringBuilder("[]".length() * iT);
                    B8.b it = new B8.c(1, iT, 1).iterator();
                    while (it.f774u) {
                        it.a();
                        sb2.append((CharSequence) "[]");
                    }
                    string = sb2.toString();
                    p210v8.i.c(string);
                } else {
                    char cCharAt = "[]".charAt(0);
                    char[] cArr = new char[iT];
                    for (int i10 = 0; i10 < iT; i10++) {
                        cArr[i10] = cCharAt;
                    }
                    string = new String(cArr);
                }
            } else {
                string = "[]".toString();
            }
            sb.append(string);
            name = sb.toString();
        } else {
            name = cls.getName();
        }
        p210v8.i.c(name);
        return name;
    }

    public static void e(Throwable th, Throwable th2) {
        p210v8.i.f(th, "<this>");
        p210v8.i.f(th2, "exception");
        if (th != th2) {
            Integer num = p164q8.a.a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = p153p8.a.a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static void f(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static final Type g(p210v8.j jVar, boolean z6) {
        m0 m0Var = (m0) jVar;
        InterfaceC0176d interfaceC0176dC = m0Var.c();
        if (interfaceC0176dC instanceof v) {
            return new B((v) interfaceC0176dC);
        }
        if (!(interfaceC0176dC instanceof InterfaceC0175c)) {
            throw new UnsupportedOperationException("Unsupported type classifier: " + m0Var);
        }
        InterfaceC0175c interfaceC0175c = (InterfaceC0175c) interfaceC0176dC;
        Class clsP = z6 ? p068ga.d.p(interfaceC0175c) : p068ga.d.o(interfaceC0175c);
        List listB = m0Var.b();
        if (listB.isEmpty()) {
            return clsP;
        }
        if (!clsP.isArray()) {
            return j(clsP, listB);
        }
        if (clsP.getComponentType().isPrimitive()) {
            return clsP;
        }
        x xVar = (x) p086i8.k.m0(listB);
        if (xVar == null) {
            throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + m0Var);
        }
        y yVar = xVar.a;
        int i10 = yVar == null ? -1 : C.a[yVar.ordinal()];
        if (i10 == -1 || i10 == 1) {
            return clsP;
        }
        if (i10 != 2 && i10 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        m0 m0Var2 = xVar.f963b;
        p210v8.i.c(m0Var2);
        Type typeG = g(m0Var2, false);
        return typeG instanceof Class ? clsP : new C0173a(typeG);
    }

    public static boolean h(File file, Resources resources, int i10) throws Throwable {
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i10);
            try {
                boolean zI = i(file, inputStreamOpenRawResource);
                f(inputStreamOpenRawResource);
                return zI;
            } catch (Throwable th) {
                th = th;
                f(inputStreamOpenRawResource);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamOpenRawResource = null;
        }
    }

    public static boolean i(File file, InputStream inputStream) throws Throwable {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i10 = inputStream.read(bArr);
                        if (i10 == -1) {
                            f(fileOutputStream2);
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                            return true;
                        }
                        fileOutputStream2.write(bArr, 0, i10);
                    }
                } catch (IOException e10) {
                    e = e10;
                    fileOutputStream = fileOutputStream2;
                    e.getMessage();
                    f(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    f(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    throw th;
                }
            } catch (IOException e11) {
                e = e11;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static final A j(Class cls, List list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(p086i8.m.H(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(r((x) it.next()));
            }
            return new A(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            List list3 = list;
            ArrayList arrayList2 = new ArrayList(p086i8.m.H(list3, 10));
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(r((x) it2.next()));
            }
            return new A(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        A aJ = j(declaringClass, list.subList(length, list.size()));
        List listSubList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(p086i8.m.H(listSubList, 10));
        Iterator it3 = listSubList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(r((x) it3.next()));
        }
        return new A(cls, aJ, arrayList3);
    }

    public static int k(int i10, int i11) {
        if (i11 < 0) {
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
        int iHighestOneBit = i10 + (i10 >> 1) + 1;
        if (iHighestOneBit < i11) {
            iHighestOneBit = Integer.highestOneBit(i11 - 1) << 1;
        }
        if (iHighestOneBit < 0) {
            return Integer.MAX_VALUE;
        }
        return iHighestOneBit;
    }

    public static String l(String str, String str2, Locale locale) {
        p210v8.i.f(str, "date");
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2, locale);
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("EEEE, dd-MMM-yy", new Locale("id", "ID"));
            Date date = simpleDateFormat.parse(str);
            p210v8.i.c(date);
            String str3 = simpleDateFormat2.format(date);
            p210v8.i.c(str3);
            return str3;
        } catch (Exception unused) {
            return "";
        }
    }

    public static ColorStateList m(Context context, Y1.c cVar, int i10) {
        int resourceId;
        ColorStateList colorStateListC;
        TypedArray typedArray = (TypedArray) cVar.f5671u;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (colorStateListC = J.f.c(context, resourceId)) == null) ? cVar.u(i10) : colorStateListC;
    }

    public static ColorStateList n(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        ColorStateList colorStateListC;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (colorStateListC = J.f.c(context, resourceId)) == null) ? typedArray.getColorStateList(i10) : colorStateListC;
    }

    public static int p(Context context, TypedArray typedArray, int i10, int i11) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i10, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i10, i11);
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i11);
        typedArrayObtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public static Drawable q(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        Drawable drawableG;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (drawableG = p068ga.l.g(context, resourceId)) == null) ? typedArray.getDrawable(i10) : drawableG;
    }

    public static final Type r(x xVar) {
        y yVar = xVar.a;
        if (yVar == null) {
            return F.f954u;
        }
        m0 m0Var = xVar.f963b;
        p210v8.i.c(m0Var);
        int iOrdinal = yVar.ordinal();
        if (iOrdinal == 0) {
            return g(m0Var, true);
        }
        if (iOrdinal == 1) {
            return new F(null, g(m0Var, true));
        }
        if (iOrdinal == 2) {
            return new F(g(m0Var, true), null);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static File s(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i10 = 0; i10 < 100; i10++) {
            File file = new File(cacheDir, str + i10);
            try {
                if (file.createNewFile()) {
                    return file;
                }
            } catch (IOException unused) {
            }
        }
        return null;
    }

    public static boolean t(EditText editText) {
        return editText.getInputType() != 0;
    }

    public static boolean u(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static String v(String str, Object... objArr) {
        int iIndexOf;
        String string;
        int i10 = 0;
        for (int i11 = 0; i11 < objArr.length; i11++) {
            Object obj = objArr[i11];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e10) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str2, (Throwable) e10);
                    StringBuilder sbM = AbstractC0487g.m("<", str2, " threw ");
                    sbM.append(e10.getClass().getName());
                    sbM.append(">");
                    string = sbM.toString();
                }
            }
            objArr[i11] = string;
        }
        StringBuilder sb = new StringBuilder((objArr.length * 16) + str.length());
        int i12 = 0;
        while (i10 < objArr.length && (iIndexOf = str.indexOf("%s", i12)) != -1) {
            sb.append((CharSequence) str, i12, iIndexOf);
            sb.append(objArr[i10]);
            i12 = iIndexOf + 2;
            i10++;
        }
        sb.append((CharSequence) str, i12, str.length());
        if (i10 < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i10]);
            for (int i13 = i10 + 1; i13 < objArr.length; i13++) {
                sb.append(", ");
                sb.append(objArr[i13]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static MappedByteBuffer w(Context context, Uri uri) {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return null;
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return map;
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (IOException unused) {
        }
    }

    public static final void z(View view, p031d.y yVar) {
        p210v8.i.f(view, "<this>");
        view.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, yVar);
    }

    public abstract void o(p170r3.t tVar, float f10, float f11);

    public abstract void x(Throwable th);

    public abstract void y(o1.h hVar);

    @Override // U.InterfaceC0419e0
    public void b() {
    }

    @Override // U.InterfaceC0419e0
    public void c() {
    }
}

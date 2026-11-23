package p068ga;

import A9.AbstractC0130c;
import A9.AbstractC0151y;
import A9.C0133f;
import A9.C0150x;
import A9.K;
import A9.O;
import A9.S;
import B4.C0157e;
import B9.g;
import C3.b;
import C8.InterfaceC0175c;
import J0.AbstractC0266p;
import L8.AbstractC0281o;
import L8.C0280n;
import L8.InterfaceC0271e;
import L8.InterfaceC0273g;
import L8.InterfaceC0276j;
import L8.P;
import L8.e0;
import L9.n;
import N9.D;
import O8.E;
import R8.AbstractC0408c;
import U8.x;
import X9.A;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.tonyodev.fetch2.Download;
import com.tonyodev.fetch2.database.DownloadInfo;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import kotlin.NoWhenBranchMatchedException;
import ma.a;
import ma.o;
import ma.q;
import ma.r;
import ma.v;
import ma.w;
import ma.y;
import p020ba.h;
import p029c9.e;
import p029c9.j;
import p029c9.p;
import p086i8.m;
import p096j9.c;
import p096j9.f;
import p188t1.Y;
import p210v8.i;
import p210v8.u;
import p231y.k;
import p231y.l;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public final /* synthetic */ int a;

    public /* synthetic */ d(int i10) {
        this.a = i10;
    }

    public static final void A(int i10, String str, int i11) {
        i.g(str, "fileTempDir");
        try {
            String strS = s(i10, str);
            long j = i11;
            i.g(strS, "filePath");
            File fileT = b.t(strS);
            if (fileT.exists()) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(fileT, "rw");
                try {
                    randomAccessFile.seek(0L);
                    randomAccessFile.setLength(0L);
                    randomAccessFile.writeLong(j);
                } catch (Exception unused) {
                } catch (Throwable th) {
                    try {
                        randomAccessFile.close();
                    } catch (Exception unused2) {
                    }
                    throw th;
                }
                randomAccessFile.close();
            }
        } catch (Exception unused3) {
        }
    }

    public static final a B(Socket socket) throws IOException {
        Logger logger = o.a;
        h hVar = new h(socket, 2);
        OutputStream outputStream = socket.getOutputStream();
        i.e(outputStream, "getOutputStream()");
        return new a(hVar, 0, new a(outputStream, 1, hVar));
    }

    public static a C(File file) {
        Logger logger = o.a;
        i.f(file, "<this>");
        return new a(new FileOutputStream(file, false), 1, new y());
    }

    public static final ma.b D(File file) {
        Logger logger = o.a;
        i.f(file, "<this>");
        return new ma.b(new FileInputStream(file), 1, y.f13225d);
    }

    public static final ma.b E(Socket socket) throws IOException {
        Logger logger = o.a;
        h hVar = new h(socket, 2);
        InputStream inputStream = socket.getInputStream();
        i.e(inputStream, "getInputStream()");
        return new ma.b(hVar, 0, new ma.b(inputStream, 1, hVar));
    }

    public static final C0280n F(e0 e0Var) {
        i.f(e0Var, "<this>");
        C0280n c0280n = (C0280n) U8.o.f4980d.get(e0Var);
        return c0280n == null ? AbstractC0281o.f(e0Var) : c0280n;
    }

    public static k a(D d3) {
        p231y.i iVar = new p231y.i();
        iVar.f15825c = new l();
        k kVar = new k(iVar);
        iVar.f15824b = kVar;
        iVar.a = E0.a.class;
        try {
            d3.C(false, true, new E0.b(iVar, 0, d3));
            iVar.a = "Deferred.asListenableFuture";
            return kVar;
        } catch (Exception e10) {
            kVar.f15829t.p(e10);
            return kVar;
        }
    }

    public static final q c(v vVar) {
        i.f(vVar, "<this>");
        return new q(vVar);
    }

    public static final r d(w wVar) {
        i.f(wVar, "<this>");
        return new r(wVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0020  */
    public static final String e(InterfaceC0271e interfaceC0271e, e eVar) {
        i.f(interfaceC0271e, "klass");
        i.f(eVar, "typeMappingConfiguration");
        InterfaceC0276j interfaceC0276jV = interfaceC0271e.v();
        i.e(interfaceC0276jV, "klass.containingDeclaration");
        f name = interfaceC0271e.getName();
        if (name != null) {
            f fVar = p096j9.h.a;
            if (name.f12552t) {
                name = p096j9.h.f12554c;
            }
        } else {
            name = p096j9.h.f12554c;
        }
        String strH = name.h();
        if (interfaceC0276jV instanceof L8.D) {
            c cVar = ((E) ((L8.D) interfaceC0276jV)).f3634w;
            if (cVar.d()) {
                return strH;
            }
            return n.F(cVar.b(), '.', '/') + '/' + strH;
        }
        InterfaceC0271e interfaceC0271e2 = interfaceC0276jV instanceof InterfaceC0271e ? (InterfaceC0271e) interfaceC0276jV : null;
        if (interfaceC0271e2 == null) {
            throw new IllegalArgumentException("Unexpected container: " + interfaceC0276jV + " for " + interfaceC0271e);
        }
        return e(interfaceC0271e2, eVar) + '$' + strH;
    }

    public static int f(J0.D d3, AbstractC0266p abstractC0266p, View view, View view2, androidx.recyclerview.widget.w wVar, boolean z6) {
        if (wVar.w() == 0 || d3.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z6) {
            return Math.abs(androidx.recyclerview.widget.w.M(view) - androidx.recyclerview.widget.w.M(view2)) + 1;
        }
        return Math.min(abstractC0266p.l(), abstractC0266p.b(view2) - abstractC0266p.e(view));
    }

    public static int g(J0.D d3, AbstractC0266p abstractC0266p, View view, View view2, androidx.recyclerview.widget.w wVar, boolean z6, boolean z10) {
        if (wVar.w() == 0 || d3.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z10 ? Math.max(0, (d3.b() - Math.max(androidx.recyclerview.widget.w.M(view), androidx.recyclerview.widget.w.M(view2))) - 1) : Math.max(0, Math.min(androidx.recyclerview.widget.w.M(view), androidx.recyclerview.widget.w.M(view2)));
        if (z6) {
            return Math.round((iMax * (Math.abs(abstractC0266p.b(view2) - abstractC0266p.e(view)) / (Math.abs(androidx.recyclerview.widget.w.M(view) - androidx.recyclerview.widget.w.M(view2)) + 1))) + (abstractC0266p.k() - abstractC0266p.e(view)));
        }
        return iMax;
    }

    public static int h(J0.D d3, AbstractC0266p abstractC0266p, View view, View view2, androidx.recyclerview.widget.w wVar, boolean z6) {
        if (wVar.w() == 0 || d3.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z6) {
            return d3.b();
        }
        return (int) (((abstractC0266p.b(view2) - abstractC0266p.e(view)) / (Math.abs(androidx.recyclerview.widget.w.M(view) - androidx.recyclerview.widget.w.M(view2)) + 1)) * d3.b());
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00d9  */
    public static Q8.b i(Class cls) throws InvocationTargetException {
        C0157e c0157e;
        p029c9.k cVar;
        p037d9.a aVar;
        i.f(cls, "klass");
        p037d9.e eVar = new p037d9.e();
        eVar.a = null;
        eVar.f10567b = null;
        eVar.f10568c = 0;
        eVar.f10569d = null;
        eVar.f10570e = null;
        eVar.f10571f = null;
        eVar.f10572g = null;
        eVar.f10573h = null;
        Annotation[] declaredAnnotations = cls.getDeclaredAnnotations();
        i.e(declaredAnnotations, "klass.declaredAnnotations");
        for (Annotation annotation : declaredAnnotations) {
            i.e(annotation, "annotation");
            Class clsO = o(l(annotation));
            p096j9.b bVarA = AbstractC0408c.a(clsO);
            c cVarB = bVarA.b();
            if (cVarB.equals(x.a)) {
                cVar = new p037d9.c(eVar, 0);
            } else if (cVarB.equals(x.f5006o)) {
                cVar = new V.h(eVar, 17);
            } else if (p037d9.e.f10566i || eVar.f10572g != null || (aVar = (p037d9.a) p037d9.e.j.get(bVarA)) == null) {
                cVar = null;
            } else {
                eVar.f10572g = aVar;
                cVar = new p037d9.c(eVar, 1);
            }
            if (cVar != null) {
                com.bumptech.glide.e.m(cVar, annotation, clsO);
            }
        }
        i9.f fVar = i9.f.f12337g;
        if (eVar.f10572g == null || eVar.a == null) {
            c0157e = null;
        } else {
            i9.f fVar2 = new i9.f(eVar.a, (eVar.f10568c & 8) != 0);
            if (fVar2.b(fVar)) {
                p037d9.a aVar2 = eVar.f10572g;
                if ((aVar2 == p037d9.a.CLASS || aVar2 == p037d9.a.FILE_FACADE || aVar2 == p037d9.a.MULTIFILE_CLASS_PART) && eVar.f10569d == null) {
                    c0157e = null;
                }
            } else {
                eVar.f10571f = eVar.f10569d;
                eVar.f10569d = null;
            }
            String[] strArr = eVar.f10573h;
            if (strArr != null) {
                i9.a.a(strArr);
            }
            c0157e = new C0157e(eVar.f10572g, fVar2, eVar.f10569d, eVar.f10571f, eVar.f10570e, eVar.f10567b, eVar.f10568c);
        }
        if (c0157e == null) {
            return null;
        }
        return new Q8.b(cls, c0157e);
    }

    public static final void j(int i10, String str) {
        File[] fileArrListFiles;
        i.g(str, "fileTempDir");
        try {
            File file = new File(str);
            if (!file.exists() || (fileArrListFiles = file.listFiles()) == null) {
                return;
            }
            ArrayList<File> arrayList = new ArrayList();
            for (File file2 : fileArrListFiles) {
                i.b(file2, "file");
                String strC = s8.h.C(file2);
                StringBuilder sb = new StringBuilder();
                sb.append(i10);
                sb.append('.');
                if (n.I(strC, sb.toString(), false)) {
                    arrayList.add(file2);
                }
            }
            for (File file3 : arrayList) {
                if (file3.exists()) {
                    file3.delete();
                }
            }
        } catch (Exception unused) {
        }
    }

    public static A k(String str) {
        i.f(str, "<this>");
        Matcher matcher = A.f5431d.matcher(str);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
        }
        String strGroup = matcher.group(1);
        i.e(strGroup, "typeSubtype.group(1)");
        Locale locale = Locale.US;
        i.e(locale, "US");
        String lowerCase = strGroup.toLowerCase(locale);
        i.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        String strGroup2 = matcher.group(2);
        i.e(strGroup2, "typeSubtype.group(2)");
        i.e(strGroup2.toLowerCase(locale), "this as java.lang.String).toLowerCase(locale)");
        ArrayList arrayList = new ArrayList();
        Matcher matcher2 = A.f5432e.matcher(str);
        int iEnd = matcher.end();
        while (iEnd < str.length()) {
            matcher2.region(iEnd, str.length());
            if (!matcher2.lookingAt()) {
                StringBuilder sb = new StringBuilder("Parameter is not formatted correctly: \"");
                String strSubstring = str.substring(iEnd);
                i.e(strSubstring, "this as java.lang.String).substring(startIndex)");
                sb.append(strSubstring);
                sb.append("\" for: \"");
                throw new IllegalArgumentException(AbstractC0487g.j(sb, str, '\"').toString());
            }
            String strGroup3 = matcher2.group(1);
            if (strGroup3 == null) {
                iEnd = matcher2.end();
            } else {
                String strGroup4 = matcher2.group(2);
                if (strGroup4 == null) {
                    strGroup4 = matcher2.group(3);
                } else if (n.I(strGroup4, "'", false) && n.B(strGroup4, "'") && strGroup4.length() > 2) {
                    strGroup4 = strGroup4.substring(1, strGroup4.length() - 1);
                    i.e(strGroup4, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                arrayList.add(strGroup3);
                arrayList.add(strGroup4);
                iEnd = matcher2.end();
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return new A(str, lowerCase, (String[]) array);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public static final InterfaceC0175c l(Annotation annotation) {
        i.f(annotation, "<this>");
        Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
        i.e(clsAnnotationType, "annotationType(...)");
        return r(clsAnnotationType);
    }

    public static String m(Context context, int i10) {
        String strValueOf;
        i.f(context, "context");
        if (i10 <= 16777215) {
            return String.valueOf(i10);
        }
        try {
            strValueOf = context.getResources().getResourceName(i10);
        } catch (Resources.NotFoundException unused) {
            strValueOf = String.valueOf(i10);
        }
        i.e(strValueOf, "try {\n                  …tring()\n                }");
        return strValueOf;
    }

    public static final String n(int i10, String str, int i11) {
        i.g(str, "fileTempDir");
        return str + '/' + i10 + '.' + i11 + ".data";
    }

    public static final Class o(InterfaceC0175c interfaceC0175c) {
        i.f(interfaceC0175c, "<this>");
        Class clsA = ((p210v8.c) interfaceC0175c).a();
        i.d(clsA, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return clsA;
    }

    public static final Class p(InterfaceC0175c interfaceC0175c) {
        i.f(interfaceC0175c, "<this>");
        Class clsA = ((p210v8.c) interfaceC0175c).a();
        if (!clsA.isPrimitive()) {
            return clsA;
        }
        String name = clsA.getName();
        switch (name.hashCode()) {
            case -1325958191:
                return !name.equals("double") ? clsA : Double.class;
            case 104431:
                return !name.equals("int") ? clsA : Integer.class;
            case 3039496:
                return !name.equals("byte") ? clsA : Byte.class;
            case 3052374:
                return !name.equals("char") ? clsA : Character.class;
            case 3327612:
                return !name.equals("long") ? clsA : Long.class;
            case 3625364:
                return !name.equals("void") ? clsA : Void.class;
            case 64711720:
                return !name.equals("boolean") ? clsA : Boolean.class;
            case 97526364:
                return !name.equals("float") ? clsA : Float.class;
            case 109413500:
                return !name.equals("short") ? clsA : Short.class;
            default:
                return clsA;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class q(InterfaceC0175c interfaceC0175c) {
        i.f(interfaceC0175c, "<this>");
        Class clsA = ((p210v8.c) interfaceC0175c).a();
        if (clsA.isPrimitive()) {
            return clsA;
        }
        String name = clsA.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                return null;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }

    public static final InterfaceC0175c r(Class cls) {
        i.f(cls, "<this>");
        return u.a.b(cls);
    }

    public static final String s(int i10, String str) {
        i.g(str, "fileTempDir");
        return str + '/' + i10 + ".meta.data";
    }

    public static Fa.e t(Download download) {
        return u(download, -1L, "GET", 0, 16);
    }

    public static Fa.e u(Download download, long j, String str, int i10, int i11) {
        String str2 = (i11 & 8) != 0 ? "GET" : str;
        int i12 = (i11 & 16) != 0 ? 1 : i10;
        i.g(download, "download");
        long j10 = j == -1 ? 0L : j;
        DownloadInfo downloadInfo = (DownloadInfo) download;
        LinkedHashMap linkedHashMapC = p086i8.y.C(downloadInfo.f10366y);
        linkedHashMapC.put("Range", "bytes=" + j10 + "-");
        int i13 = downloadInfo.f10360s;
        String str3 = downloadInfo.f10362u;
        String str4 = downloadInfo.f10363v;
        return new Fa.e(i13, str3, linkedHashMapC, str4, b.v(str4), downloadInfo.f10351F, downloadInfo.f10353H, str2, downloadInfo.f10355J, "", i12);
    }

    public static final boolean v(AssertionError assertionError) {
        Logger logger = o.a;
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message == null ? false : L9.f.J(message, "getsockname failed", false)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x012e  */
    /* JADX WARN: Code duplicated, block: B:79:0x01da A[EDGE_INSN: B:79:0x01da->B:82:0x020b BREAK  A[LOOP:1: B:74:0x01c5->B:178:?]] */
    public static final Object w(AbstractC0151y abstractC0151y, p pVar, p200u8.d dVar) {
        p029c9.h hVarD;
        AbstractC0151y abstractC0151y2;
        p pVar2;
        Object objW;
        int iD;
        p029c9.i iVar;
        boolean z6;
        A9.r rVarG;
        e eVar = e.f7548d;
        i.f(abstractC0151y, "kotlinType");
        i.f(dVar, "writeGenericType");
        if (com.bumptech.glide.d.t(abstractC0151y)) {
            O8.D d3 = I8.p.a;
            com.bumptech.glide.d.t(abstractC0151y);
            I8.i iVarL = qa.b.l(abstractC0151y);
            M8.h hVarQ = abstractC0151y.q();
            AbstractC0151y abstractC0151yP = com.bumptech.glide.d.p(abstractC0151y);
            List listN = com.bumptech.glide.d.n(abstractC0151y);
            List listR = com.bumptech.glide.d.r(abstractC0151y);
            ArrayList arrayList = new ArrayList(m.H(listR, 10));
            Iterator it = listR.iterator();
            while (it.hasNext()) {
                arrayList.add(((S) it.next()).b());
            }
            K.f338t.getClass();
            K k3 = K.f339u;
            O oI = I8.p.a.I();
            com.bumptech.glide.d.s(abstractC0151y);
            AbstractC0151y abstractC0151yB = ((S) p086i8.k.b0(abstractC0151y.l())).b();
            i.e(abstractC0151yB, "arguments.last().type");
            ArrayList arrayListH0 = p086i8.k.h0(arrayList, C0133f.r(k3, oI, com.bumptech.glide.d.u(qa.b.a(abstractC0151yB)), false));
            A9.D dO = qa.b.l(abstractC0151y).o();
            i.e(dO, "suspendFunType.builtIns.nullableAnyType");
            return w(com.bumptech.glide.d.h(iVarL, hVarQ, abstractC0151yP, listN, arrayListH0, dO, false).G0(abstractC0151y.H()), pVar, dVar);
        }
        A9.D dH = g.h(abstractC0151y);
        if (dH == null && ((rVarG = g.g(abstractC0151y)) == null || (dH = g.N(rVarG)) == null)) {
            dH = g.h(abstractC0151y);
            i.c(dH);
        }
        O oW = g.W(dH);
        Object objD = null;
        if (g.y(oW)) {
            i.f(oW, "$receiver");
            if (!(oW instanceof O)) {
                StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb.append(oW);
                sb.append(", ");
                throw new IllegalArgumentException(AbstractC0487g.k(u.a, oW.getClass(), sb).toString());
            }
            InterfaceC0273g interfaceC0273gW = oW.w();
            i.d(interfaceC0273gW, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            I8.k kVarT = I8.i.t((InterfaceC0271e) interfaceC0273gW);
            if (kVarT != null) {
                switch (kVarT) {
                    case BOOLEAN:
                        iVar = j.a;
                        break;
                    case CHAR:
                        iVar = j.f7555b;
                        break;
                    case BYTE:
                        iVar = j.f7556c;
                        break;
                    case SHORT:
                        iVar = j.f7557d;
                        break;
                    case INT:
                        iVar = j.f7558e;
                        break;
                    case FLOAT:
                        iVar = j.f7559f;
                        break;
                    case LONG:
                        iVar = j.f7560g;
                        break;
                    case DOUBLE:
                        iVar = j.f7561h;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                if (g.H(abstractC0151y)) {
                    z6 = true;
                } else {
                    c cVar = x.f5007p;
                    i.e(cVar, "ENHANCED_NULLABILITY_ANNOTATION");
                    if (g.u(abstractC0151y, cVar)) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                }
                objD = Y.e(iVar, z6);
            } else {
                i.f(oW, "$receiver");
                if (!(oW instanceof O)) {
                    StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                    sb2.append(oW);
                    sb2.append(", ");
                    throw new IllegalArgumentException(AbstractC0487g.k(u.a, oW.getClass(), sb2).toString());
                }
                InterfaceC0273g interfaceC0273gW2 = oW.w();
                i.d(interfaceC0273gW2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                I8.k kVarR = I8.i.r((InterfaceC0271e) interfaceC0273gW2);
                if (kVarR != null) {
                    StringBuilder sb3 = new StringBuilder("[");
                    p176r9.c cVar2 = (p176r9.c) p176r9.c.f14568G.get(kVarR);
                    if (cVar2 == null) {
                        p176r9.c.f(4);
                        throw null;
                    }
                    sb3.append(cVar2.h());
                    objD = e.c(sb3.toString());
                } else {
                    i.f(oW, "$receiver");
                    if (!(oW instanceof O)) {
                        StringBuilder sb4 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                        sb4.append(oW);
                        sb4.append(", ");
                        throw new IllegalArgumentException(AbstractC0487g.k(u.a, oW.getClass(), sb4).toString());
                    }
                    InterfaceC0273g interfaceC0273gW3 = oW.w();
                    if (interfaceC0273gW3 != null && I8.i.I(interfaceC0273gW3)) {
                        i.f(oW, "$receiver");
                        if (!(oW instanceof O)) {
                            StringBuilder sb5 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                            sb5.append(oW);
                            sb5.append(", ");
                            throw new IllegalArgumentException(AbstractC0487g.k(u.a, oW.getClass(), sb5).toString());
                        }
                        InterfaceC0273g interfaceC0273gW4 = oW.w();
                        i.d(interfaceC0273gW4, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                        p096j9.e eVarH = p165q9.d.h((InterfaceC0271e) interfaceC0273gW4);
                        String str = K8.d.a;
                        p096j9.b bVarF = K8.d.f(eVarH);
                        if (bVarF != null) {
                            if (!pVar.f7570g) {
                                List list = K8.d.f2637n;
                                if (!(list instanceof Collection) || !list.isEmpty()) {
                                    Iterator it2 = list.iterator();
                                    do {
                                        if (!it2.hasNext()) {
                                            String strE = p176r9.b.b(bVarF).e();
                                            i.e(strE, "byClassId(classId).internalName");
                                            objD = e.d(strE);
                                            break;
                                        }
                                    } while (!((K8.c) it2.next()).a.equals(bVarF));
                                } else {
                                    String strE2 = p176r9.b.b(bVarF).e();
                                    i.e(strE2, "byClassId(classId).internalName");
                                    objD = e.d(strE2);
                                    break;
                                }
                            } else {
                                String strE3 = p176r9.b.b(bVarF).e();
                                i.e(strE3, "byClassId(classId).internalName");
                                objD = e.d(strE3);
                                break;
                            }
                        }
                    }
                }
            }
        }
        if (objD != null) {
            Object objE = Y.e(objD, pVar.a);
            dVar.b(abstractC0151y, objE, pVar);
            return objE;
        }
        O oD = abstractC0151y.D();
        if (oD instanceof C0150x) {
            C0150x c0150x = (C0150x) oD;
            AbstractC0151y abstractC0151y3 = c0150x.a;
            if (abstractC0151y3 != null) {
                return w(qa.b.y(abstractC0151y3), pVar, dVar);
            }
            LinkedHashSet linkedHashSet = c0150x.f392b;
            i.f(linkedHashSet, "types");
            throw new AssertionError("There should be no intersection type in existing descriptors, but found: ".concat(p086i8.k.Z(linkedHashSet, null, null, null, null, 63)));
        }
        InterfaceC0273g interfaceC0273gW5 = oD.w();
        if (interfaceC0273gW5 == null) {
            throw new UnsupportedOperationException("no descriptor for type constructor of " + abstractC0151y);
        }
        if (C9.i.f(interfaceC0273gW5)) {
            return e.d("error/NonExistentClass");
        }
        boolean z10 = interfaceC0273gW5 instanceof InterfaceC0271e;
        boolean z11 = pVar.f7566c;
        if (z10 && I8.i.y(abstractC0151y)) {
            if (abstractC0151y.l().size() != 1) {
                throw new UnsupportedOperationException("arrays must have one type argument");
            }
            S s9 = (S) abstractC0151y.l().get(0);
            AbstractC0151y abstractC0151yB2 = s9.b();
            i.e(abstractC0151yB2, "memberProjection.type");
            if (s9.a() == 2) {
                objW = e.d("java/lang/Object");
            } else {
                int iA = s9.a();
                AbstractC0487g.u(iA, "memberProjection.projectionKind");
                if (z11 || ((iD = p239z.e.d(iA)) == 0 ? (pVar2 = pVar.f7572i) == null : !(iD == 1 ? (pVar2 = pVar.f7571h) != null : (pVar2 = pVar.f7569f) != null))) {
                    pVar2 = pVar;
                }
                objW = w(abstractC0151yB2, pVar2, dVar);
            }
            return e.c("[" + e.h((j) objW));
        }
        if (!z10) {
            if (interfaceC0273gW5 instanceof P) {
                AbstractC0151y abstractC0151yN = qa.b.n((P) interfaceC0273gW5);
                if (abstractC0151y.H()) {
                    abstractC0151yN = qa.b.s(abstractC0151yN);
                }
                return w(abstractC0151yN, pVar, J9.d.f2465s);
            }
            if ((interfaceC0273gW5 instanceof p238y9.q) && pVar.j) {
                return w(((p238y9.q) interfaceC0273gW5).a1(), pVar, dVar);
            }
            throw new UnsupportedOperationException("Unknown type " + abstractC0151y);
        }
        if (p124m9.g.b(interfaceC0273gW5) && !pVar.f7565b && (abstractC0151y2 = (AbstractC0151y) AbstractC0130c.d(abstractC0151y, new HashSet())) != null) {
            return w(abstractC0151y2, new p(pVar.a, true, pVar.f7566c, pVar.f7567d, pVar.f7568e, pVar.f7569f, pVar.f7570g, pVar.f7571h, pVar.f7572i, 512), dVar);
        }
        if (z11 && I8.i.b((InterfaceC0271e) interfaceC0273gW5, I8.n.P)) {
            hVarD = e.d("java/lang/Class");
        } else {
            InterfaceC0271e interfaceC0271e = (InterfaceC0271e) interfaceC0273gW5;
            i.e(interfaceC0271e.c(), "descriptor.original");
            if (interfaceC0271e.M() == 4) {
                InterfaceC0276j interfaceC0276jV = interfaceC0271e.v();
                i.d(interfaceC0276jV, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                interfaceC0271e = (InterfaceC0271e) interfaceC0276jV;
            }
            InterfaceC0271e interfaceC0271eC = interfaceC0271e.c();
            i.e(interfaceC0271eC, "enumClassIfEnumEntry.original");
            hVarD = e.d(e(interfaceC0271eC, eVar));
        }
        dVar.b(abstractC0151y, hVarD, pVar);
        return hVarD;
    }

    public static A x(String str) {
        i.f(str, "<this>");
        try {
            return k(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static p057f9.a z(InputStream inputStream) {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        B8.c cVar = new B8.c(1, dataInputStream.readInt(), 1);
        ArrayList arrayList = new ArrayList(m.H(cVar, 10));
        B8.b it = cVar.iterator();
        while (it.f774u) {
            it.a();
            arrayList.add(Integer.valueOf(dataInputStream.readInt()));
        }
        int[] iArrR0 = p086i8.k.r0(arrayList);
        return new p057f9.a(Arrays.copyOf(iArrR0, iArrR0.length));
    }

    public abstract String b();

    public String toString() {
        switch (this.a) {
            case 9:
                return b();
            default:
                return super.toString();
        }
    }

    public abstract void y(String str);
}

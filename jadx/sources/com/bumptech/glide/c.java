package com.bumptech.glide;

import C8.E;
import L8.InterfaceC0290y;
import L9.n;
import U.C0411a0;
import X9.C0462h;
import X9.w;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.view.View;
import com.kcstream.cing.R;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import p047e9.C0609a;
import p104k9.AbstractC0672a;
import p104k9.C0676e;
import p104k9.C0678g;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final void a(StringBuilder sb, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            sb.append("?");
            if (i11 < i10 - 1) {
                sb.append(",");
            }
        }
    }

    public static final void b(View view) {
        C0411a0 c0411a0 = new C0411a0(view, null);
        K9.m mVar = new K9.m();
        mVar.f2698v = c0411a0.create(mVar, mVar);
        while (mVar.hasNext()) {
            View view2 = (View) mVar.next();
            p012b0.a aVar = (p012b0.a) view2.getTag(R.id.pooling_container_listener_holder_tag);
            if (aVar == null) {
                aVar = new p012b0.a();
                view2.setTag(R.id.pooling_container_listener_holder_tag, aVar);
            }
            ArrayList arrayList = aVar.a;
            int iB = p086i8.l.B(arrayList);
            if (-1 < iB) {
                arrayList.get(iB).getClass();
                throw new ClassCastException();
            }
        }
    }

    public static final void c(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                E.e(th, th2);
            }
        }
    }

    public static final void d(int i10, int i11) {
        if (i10 <= i11) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i10 + ") is greater than size (" + i11 + ").");
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004d A[Catch: all -> 0x0067, TryCatch #1 {all -> 0x0067, blocks: (B:3:0x000a, B:10:0x002a, B:12:0x0044, B:13:0x0047, B:15:0x004d, B:17:0x0051, B:18:0x0061, B:20:0x0063, B:21:0x0066), top: B:37:0x000a, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x0051 A[Catch: all -> 0x0067, TryCatch #1 {all -> 0x0067, blocks: (B:3:0x000a, B:10:0x002a, B:12:0x0044, B:13:0x0047, B:15:0x004d, B:17:0x0051, B:18:0x0061, B:20:0x0063, B:21:0x0066), top: B:37:0x000a, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x006a  */
    public static p230x9.c e(p096j9.c cVar, p247z9.l lVar, InterfaceC0290y interfaceC0290y, InputStream inputStream) throws IOException {
        p047e9.E e10;
        AbstractC0672a abstractC0672a;
        p210v8.i.f(cVar, "fqName");
        p210v8.i.f(interfaceC0290y, "module");
        try {
            p057f9.a aVar = p057f9.a.f11443f;
            p057f9.a aVarZ = p068ga.d.z(inputStream);
            p057f9.a aVar2 = p057f9.a.f11443f;
            p210v8.i.f(aVar2, "ourVersion");
            int i10 = aVarZ.f11544c;
            int i11 = aVar2.f11544c;
            int i12 = aVar2.f11543b;
            int i13 = aVarZ.f11543b;
            if (i13 == 0) {
                if (i12 == 0 && i10 == i11) {
                    C0678g c0678g = new C0678g();
                    p057f9.b.a(c0678g);
                    C0609a c0609a = p047e9.E.f10760C;
                    c0609a.getClass();
                    C0676e c0676e = new C0676e(inputStream);
                    abstractC0672a = (AbstractC0672a) c0609a.a(c0676e, c0678g);
                    try {
                        c0676e.a(0);
                        if (abstractC0672a.isInitialized()) {
                            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
                            invalidProtocolBufferException.f12841s = abstractC0672a;
                            throw invalidProtocolBufferException;
                        }
                        e10 = (p047e9.E) abstractC0672a;
                    } catch (InvalidProtocolBufferException e11) {
                        e11.f12841s = abstractC0672a;
                        throw e11;
                    }
                } else {
                    e10 = null;
                }
            } else if (i13 != i12 || i10 > i11) {
                e10 = null;
            } else {
                C0678g c0678g2 = new C0678g();
                p057f9.b.a(c0678g2);
                C0609a c0609a2 = p047e9.E.f10760C;
                c0609a2.getClass();
                C0676e c0676e2 = new C0676e(inputStream);
                abstractC0672a = (AbstractC0672a) c0609a2.a(c0676e2, c0678g2);
                c0676e2.a(0);
                if (abstractC0672a.isInitialized()) {
                    InvalidProtocolBufferException invalidProtocolBufferException2 = new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
                    invalidProtocolBufferException2.f12841s = abstractC0672a;
                    throw invalidProtocolBufferException2;
                }
                e10 = (p047e9.E) abstractC0672a;
            }
            p047e9.E e12 = e10;
            inputStream.close();
            if (e12 != null) {
                return new p230x9.c(cVar, lVar, interfaceC0290y, e12, aVarZ);
            }
            throw new UnsupportedOperationException("Kotlin built-in definition format version is not supported: expected " + aVar2 + ", actual " + aVarZ + ". Please update Kotlin");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                c(inputStream, th);
                throw th2;
            }
        }
    }

    public static void f(C3.d dVar) {
        boolean z6 = false;
        if (!dVar.isDone()) {
            throw new IllegalStateException(E.v("Future was expected to be done: %s", dVar));
        }
        while (true) {
            try {
                dVar.get();
                break;
            } catch (InterruptedException unused) {
                z6 = true;
            } catch (Throwable th) {
                if (z6) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z6) {
            Thread.currentThread().interrupt();
        }
    }

    public static SharedPreferences g(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    public static P0.c h(P0.d dVar, SQLiteDatabase sQLiteDatabase) {
        p210v8.i.f(dVar, "refHolder");
        P0.c cVar = (P0.c) dVar.f3811t;
        if (cVar != null && cVar.f3808s.equals(sQLiteDatabase)) {
            return cVar;
        }
        P0.c cVar2 = new P0.c(sQLiteDatabase);
        dVar.f3811t = cVar2;
        return cVar2;
    }

    public static final boolean i(ma.f fVar) {
        p210v8.i.f(fVar, "$this$isProbablyUtf8");
        try {
            ma.f fVar2 = new ma.f();
            long j = fVar.f13190t;
            long j10 = 64;
            if (j <= 64) {
                j10 = j;
            }
            fVar.i(fVar2, 0L, j10);
            for (int i10 = 0; i10 < 16 && !fVar2.j(); i10++) {
                int iW = fVar2.W();
                if (Character.isISOControl(iW) && !Character.isWhitespace(iW)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0062 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x0066 A[EDGE_INSN: B:109:0x0066->B:22:0x0066 BREAK  A[LOOP:2: B:16:0x004c->B:20:0x005d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x0045  */
    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    /* JADX WARN: Code duplicated, block: B:20:0x005d A[LOOP:2: B:16:0x004c->B:20:0x005d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x008d  */
    /* JADX WARN: Code duplicated, block: B:54:0x011c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0125  */
    /* JADX WARN: Code duplicated, block: B:58:0x012d  */
    /* JADX WARN: Code duplicated, block: B:59:0x0133  */
    /* JADX WARN: Code duplicated, block: B:61:0x013b  */
    /* JADX WARN: Code duplicated, block: B:63:0x0145  */
    /* JADX WARN: Code duplicated, block: B:65:0x014e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0153  */
    /* JADX WARN: Code duplicated, block: B:68:0x015b  */
    /* JADX WARN: Code duplicated, block: B:69:0x0161  */
    /* JADX WARN: Code duplicated, block: B:71:0x0169  */
    /* JADX WARN: Code duplicated, block: B:72:0x016f  */
    /* JADX WARN: Code duplicated, block: B:74:0x0177  */
    /* JADX WARN: Code duplicated, block: B:75:0x017d  */
    /* JADX WARN: Code duplicated, block: B:77:0x0185  */
    /* JADX WARN: Code duplicated, block: B:78:0x018d  */
    /* JADX WARN: Code duplicated, block: B:80:0x0195  */
    /* JADX WARN: Code duplicated, block: B:81:0x019b  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:86:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:87:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c4  */
    public static C0462h j(w wVar) {
        int i10;
        int length;
        boolean z6;
        int length2;
        String string;
        int i11;
        String string2;
        int length3;
        int i12;
        w wVar2 = wVar;
        int size = wVar2.size();
        boolean z10 = true;
        boolean z11 = true;
        int i13 = 0;
        String str = null;
        boolean z12 = false;
        boolean z13 = false;
        int iY = -1;
        int iY2 = -1;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        int iY3 = -1;
        int iY4 = -1;
        boolean z17 = false;
        boolean z18 = false;
        boolean z19 = false;
        while (i13 < size) {
            int i14 = i13 + 1;
            String strF = wVar2.f(i13);
            String strM = wVar2.m(i13);
            if (n.C(strF, "Cache-Control", z10)) {
                if (str == null) {
                    str = strM;
                }
                i10 = 0;
                while (i10 < strM.length()) {
                    length = strM.length();
                    z6 = z10;
                    length2 = i10;
                    while (true) {
                        if (length2 < length) {
                            length2 = strM.length();
                            break;
                        }
                        i12 = length2 + 1;
                        if (L9.f.K("=,;", strM.charAt(length2))) {
                            break;
                        }
                        length2 = i12;
                    }
                    String strSubstring = strM.substring(i10, length2);
                    p210v8.i.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    string = L9.f.j0(strSubstring).toString();
                    if (length2 != strM.length() || strM.charAt(length2) == ',' || strM.charAt(length2) == ';') {
                        i11 = size;
                        i10 = length2 + 1;
                        string2 = null;
                    } else {
                        int length4 = length2 + 1;
                        byte[] bArr = Y9.c.a;
                        int length5 = strM.length();
                        while (true) {
                            if (length4 >= length5) {
                                i11 = size;
                                length4 = strM.length();
                                break;
                            }
                            int i15 = length4 + 1;
                            i11 = size;
                            char cCharAt = strM.charAt(length4);
                            int i16 = length5;
                            if (cCharAt != ' ' && cCharAt != '\t') {
                                break;
                            }
                            length4 = i15;
                            size = i11;
                            length5 = i16;
                        }
                        if (length4 >= strM.length() || strM.charAt(length4) != '\"') {
                            int length6 = strM.length();
                            int i17 = length4;
                            while (true) {
                                if (i17 >= length6) {
                                    length3 = strM.length();
                                    break;
                                }
                                int i18 = i17 + 1;
                                int i19 = length6;
                                int i20 = i17;
                                if (L9.f.K(",;", strM.charAt(i17))) {
                                    length3 = i20;
                                    break;
                                }
                                i17 = i18;
                                length6 = i19;
                            }
                            String strSubstring2 = strM.substring(length4, length3);
                            p210v8.i.e(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                            i10 = length3;
                            string2 = L9.f.j0(strSubstring2).toString();
                        } else {
                            int i21 = length4 + 1;
                            int iO = L9.f.O(strM, '\"', i21, 4);
                            string2 = strM.substring(i21, iO);
                            p210v8.i.e(string2, "this as java.lang.String…ing(startIndex, endIndex)");
                            i10 = iO + 1;
                        }
                    }
                    if ("no-cache".equalsIgnoreCase(string)) {
                        z10 = z6;
                        z12 = z10;
                    } else if ("no-store".equalsIgnoreCase(string)) {
                        z10 = z6;
                        z13 = z10;
                    } else {
                        if ("max-age".equalsIgnoreCase(string)) {
                            iY = Y9.c.y(-1, string2);
                        } else if ("s-maxage".equalsIgnoreCase(string)) {
                            iY2 = Y9.c.y(-1, string2);
                        } else if ("private".equalsIgnoreCase(string)) {
                            z10 = z6;
                            z14 = z10;
                        } else if ("public".equalsIgnoreCase(string)) {
                            z10 = z6;
                            z15 = z10;
                        } else if ("must-revalidate".equalsIgnoreCase(string)) {
                            z10 = z6;
                            z16 = z10;
                        } else if ("max-stale".equalsIgnoreCase(string)) {
                            iY3 = Y9.c.y(Integer.MAX_VALUE, string2);
                        } else if ("min-fresh".equalsIgnoreCase(string)) {
                            iY4 = Y9.c.y(-1, string2);
                        } else if ("only-if-cached".equalsIgnoreCase(string)) {
                            z10 = z6;
                            z17 = z10;
                        } else if ("no-transform".equalsIgnoreCase(string)) {
                            z10 = z6;
                            z18 = z10;
                        } else if ("immutable".equalsIgnoreCase(string)) {
                            z10 = z6;
                            z19 = z10;
                        }
                        z10 = z6;
                    }
                    size = i11;
                }
                wVar2 = wVar;
                i13 = i14;
            } else {
                if (n.C(strF, "Pragma", z10)) {
                }
                wVar2 = wVar;
                i13 = i14;
            }
            z11 = false;
            i10 = 0;
            while (i10 < strM.length()) {
                length = strM.length();
                z6 = z10;
                length2 = i10;
                while (true) {
                    if (length2 < length) {
                        length2 = strM.length();
                        break;
                    }
                    i12 = length2 + 1;
                    if (L9.f.K("=,;", strM.charAt(length2))) {
                        break;
                        break;
                    }
                    length2 = i12;
                }
                String strSubstring3 = strM.substring(i10, length2);
                p210v8.i.e(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                string = L9.f.j0(strSubstring3).toString();
                if (length2 != strM.length()) {
                    i11 = size;
                    i10 = length2 + 1;
                    string2 = null;
                } else {
                    i11 = size;
                    i10 = length2 + 1;
                    string2 = null;
                }
                if ("no-cache".equalsIgnoreCase(string)) {
                    z10 = z6;
                    z12 = z10;
                } else if ("no-store".equalsIgnoreCase(string)) {
                    z10 = z6;
                    z13 = z10;
                } else {
                    if ("max-age".equalsIgnoreCase(string)) {
                        iY = Y9.c.y(-1, string2);
                    } else if ("s-maxage".equalsIgnoreCase(string)) {
                        iY2 = Y9.c.y(-1, string2);
                    } else if ("private".equalsIgnoreCase(string)) {
                        z10 = z6;
                        z14 = z10;
                    } else if ("public".equalsIgnoreCase(string)) {
                        z10 = z6;
                        z15 = z10;
                    } else if ("must-revalidate".equalsIgnoreCase(string)) {
                        z10 = z6;
                        z16 = z10;
                    } else if ("max-stale".equalsIgnoreCase(string)) {
                        iY3 = Y9.c.y(Integer.MAX_VALUE, string2);
                    } else if ("min-fresh".equalsIgnoreCase(string)) {
                        iY4 = Y9.c.y(-1, string2);
                    } else if ("only-if-cached".equalsIgnoreCase(string)) {
                        z10 = z6;
                        z17 = z10;
                    } else if ("no-transform".equalsIgnoreCase(string)) {
                        z10 = z6;
                        z18 = z10;
                    } else if ("immutable".equalsIgnoreCase(string)) {
                        z10 = z6;
                        z19 = z10;
                    }
                    z10 = z6;
                }
                size = i11;
            }
            wVar2 = wVar;
            i13 = i14;
        }
        return new C0462h(z12, z13, iY, iY2, z14, z15, z16, iY3, iY4, z17, z18, z19, !z11 ? null : str);
    }

    public static final boolean k(p076h8.f fVar) {
        if (p210v8.i.a(fVar.f11789s, "processor")) {
            CharSequence charSequence = (CharSequence) fVar.f11790t;
            for (int i10 = 0; i10 < charSequence.length(); i10++) {
                if (Character.isDigit(charSequence.charAt(i10))) {
                }
            }
            return true;
        }
        return false;
    }
}

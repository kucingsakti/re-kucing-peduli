package C3;

import A1.C0099h;
import A3.C0110h;
import B1.g;
import E1.B;
import E1.C0184f;
import E1.C0185g;
import E1.D;
import E1.y;
import E1.z;
import Fa.e;
import H1.A;
import H1.C0232a;
import H1.C0233b;
import H1.C0234c;
import H1.E;
import H1.l;
import H1.o;
import H1.s;
import L.f;
import L9.m;
import L9.n;
import N9.AbstractC0342z;
import N9.C0333p;
import S9.r;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.TypedValue;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import androidx.recyclerview.widget.RecyclerView;
import com.kcstream.cing.utils.GridAutoLayoutManager;
import com.unity3d.services.core.request.metrics.AdOperationMetric;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.IntFunction;
import java.util.stream.IntStream;
import kotlin.NoWhenBranchMatchedException;
import p047e9.e0;
import p067g9.h;
import p086i8.C;
import p086i8.k;
import p210v8.i;
import p210v8.x;
import p232y1.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final Set A(e eVar, p163q7.d dVar) {
        Set setS = C.s(p163q7.b.f14419s);
        try {
            p163q7.c cVarP = dVar.P(eVar, new za.c(25));
            if (cVarP != null) {
                if (a(cVarP.a, cVarP.f14425e)) {
                    setS.add(p163q7.b.f14420t);
                }
                dVar.k(cVarP);
            }
        } catch (Exception unused) {
        }
        return setS;
    }

    public static final GridAutoLayoutManager B(RecyclerView recyclerView, Context context) {
        GridAutoLayoutManager gridAutoLayoutManager = new GridAutoLayoutManager();
        gridAutoLayoutManager.f10280O = true;
        gridAutoLayoutManager.P = true;
        int iApplyDimension = (int) TypedValue.applyDimension(1, 120, context.getResources().getDisplayMetrics());
        if (iApplyDimension > 0 && iApplyDimension != gridAutoLayoutManager.f10279N) {
            gridAutoLayoutManager.f10279N = iApplyDimension;
            gridAutoLayoutManager.f10280O = true;
        }
        gridAutoLayoutManager.f6889L = new N4.a(recyclerView, gridAutoLayoutManager);
        return gridAutoLayoutManager;
    }

    public static final boolean C(long j, long j10, long j11) {
        return TimeUnit.NANOSECONDS.toMillis(j10 - j) >= j11;
    }

    public static C0110h D(int i10, int i11, IntFunction intFunction, Comparator comparator) {
        if (comparator == null || (i11 & 4) != 0) {
            return new C0110h(IntStream.range(0, i10).spliterator(), intFunction, i11, comparator);
        }
        throw new IllegalArgumentException();
    }

    public static final int E(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 2;
        }
        throw new IllegalArgumentException(E0.a.g("Could not convert ", i10, " to BackoffPolicy"));
    }

    public static final int F(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 2;
        }
        if (i10 == 2) {
            return 3;
        }
        if (i10 == 3) {
            return 4;
        }
        if (i10 == 4) {
            return 5;
        }
        if (Build.VERSION.SDK_INT < 30 || i10 != 5) {
            throw new IllegalArgumentException(E0.a.g("Could not convert ", i10, " to NetworkType"));
        }
        return 6;
    }

    public static final int G(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 2;
        }
        throw new IllegalArgumentException(E0.a.g("Could not convert ", i10, " to OutOfQuotaPolicy"));
    }

    public static final int H(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 2;
        }
        if (i10 == 2) {
            return 3;
        }
        if (i10 == 3) {
            return 4;
        }
        if (i10 == 4) {
            return 5;
        }
        if (i10 == 5) {
            return 6;
        }
        throw new IllegalArgumentException(E0.a.g("Could not convert ", i10, " to State"));
    }

    public static final boolean I(String str) {
        i.g(str, "url");
        try {
            return n.I(str, "fetchlocal://", false) && r(str).length() > 0 && s(str) > -1;
        } catch (Exception unused) {
        }
    }

    public static final boolean J(String str) {
        i.g(str, "path");
        if (str.length() <= 0) {
            str = null;
        }
        return str != null && (n.I(str, "content://", false) || n.I(str, "file://", false));
    }

    public static final int K(int i10) {
        String str;
        AbstractC0487g.p(i10, "networkType");
        int iD = p239z.e.d(i10);
        if (iD == 0) {
            return 0;
        }
        int i11 = 1;
        if (iD != 1) {
            i11 = 2;
            if (iD != 2) {
                i11 = 3;
                if (iD != 3) {
                    i11 = 4;
                    if (iD != 4) {
                        if (Build.VERSION.SDK_INT >= 30 && i10 == 6) {
                            return 5;
                        }
                        StringBuilder sb = new StringBuilder("Could not convert ");
                        switch (i10) {
                            case 1:
                                str = "NOT_REQUIRED";
                                break;
                            case 2:
                                str = "CONNECTED";
                                break;
                            case 3:
                                str = "UNMETERED";
                                break;
                            case 4:
                                str = "NOT_ROAMING";
                                break;
                            case 5:
                                str = "METERED";
                                break;
                            case 6:
                                str = "TEMPORARILY_UNMETERED";
                                break;
                            default:
                                str = "null";
                                break;
                        }
                        sb.append(str);
                        sb.append(" to int");
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
            }
        }
        return i11;
    }

    public static Activity L(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return L(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static final byte[] M(Set set) throws IOException {
        i.f(set, "triggers");
        if (set.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeInt(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    p050f1.c cVar = (p050f1.c) it.next();
                    objectOutputStream.writeUTF(cVar.a.toString());
                    objectOutputStream.writeBoolean(cVar.f11395b);
                }
                objectOutputStream.close();
                byteArrayOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                i.e(byteArray, "outputStream.toByteArray()");
                return byteArray;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    com.bumptech.glide.c.c(objectOutputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                com.bumptech.glide.c.c(byteArrayOutputStream, th3);
                throw th4;
            }
        }
    }

    public static final Object N(r rVar, r rVar2, p200u8.c cVar) throws Throwable {
        Object c0333p;
        Object objG;
        try {
            x.e(2, cVar);
            c0333p = cVar.invoke(rVar2, rVar);
        } catch (Throwable th) {
            c0333p = new C0333p(th, false);
        }
        p134n8.a aVar = p134n8.a.f13404s;
        if (c0333p == aVar || (objG = rVar.G(c0333p)) == AbstractC0342z.f3499e) {
            return aVar;
        }
        if (objG instanceof C0333p) {
            throw ((C0333p) objG).a;
        }
        return AbstractC0342z.u(objG);
    }

    public static final int O(int i10) {
        AbstractC0487g.p(i10, AdOperationMetric.INIT_STATE);
        int iD = p239z.e.d(i10);
        if (iD == 0) {
            return 0;
        }
        int i11 = 1;
        if (iD != 1) {
            i11 = 2;
            if (iD != 2) {
                i11 = 3;
                if (iD != 3) {
                    i11 = 4;
                    if (iD != 4) {
                        if (iD == 5) {
                            return 5;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
        }
        return i11;
    }

    public static int P(int i10) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i11 = 0; i11 < 6; i11++) {
            int i12 = iArr[i11];
            int i13 = i12 - 1;
            if (i12 == 0) {
                throw null;
            }
            if (i13 == i10) {
                return i12;
            }
        }
        return 1;
    }

    public static final boolean a(int i10, AbstractMap abstractMap) {
        String lowerCase;
        String strW = w(abstractMap, "Accept-Ranges", "accept-ranges", "AcceptRanges");
        String strW2 = w(abstractMap, "Transfer-Encoding", "transfer-encoding", "TransferEncoding");
        long jP = p(abstractMap);
        boolean z6 = i10 == 206 || i.a(strW, "bytes");
        if (jP <= -1 || !z6) {
            if (jP > -1) {
                if (strW2 != null) {
                    lowerCase = strW2.toLowerCase();
                    i.b(lowerCase, "(this as java.lang.String).toLowerCase()");
                } else {
                    lowerCase = null;
                }
                if (!i.a(lowerCase, "chunked")) {
                }
            }
            return false;
        }
        return true;
    }

    public static final LinkedHashSet b(byte[] bArr) throws IOException {
        i.f(bArr, "bytes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bArr.length != 0) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                try {
                    ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        int i10 = objectInputStream.readInt();
                        for (int i11 = 0; i11 < i10; i11++) {
                            Uri uri = Uri.parse(objectInputStream.readUTF());
                            boolean z6 = objectInputStream.readBoolean();
                            i.e(uri, "uri");
                            linkedHashSet.add(new p050f1.c(z6, uri));
                        }
                        objectInputStream.close();
                        byteArrayInputStream.close();
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            com.bumptech.glide.c.c(objectInputStream, th);
                            throw th2;
                        }
                    }
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    com.bumptech.glide.c.c(byteArrayInputStream, th3);
                    throw th4;
                }
            }
        }
        return linkedHashSet;
    }

    public static final long c(long j, long j10, long j11) {
        if (j10 >= 1 && j >= 1 && j11 >= 1) {
            return ((long) Math.abs(Math.ceil((j10 - j) / j11))) * ((long) 1000);
        }
        return -1L;
    }

    public static boolean d(f[] fVarArr, f[] fVarArr2) {
        if (fVarArr == null || fVarArr2 == null || fVarArr.length != fVarArr2.length) {
            return false;
        }
        for (int i10 = 0; i10 < fVarArr.length; i10++) {
            f fVar = fVarArr[i10];
            char c10 = fVar.a;
            f fVar2 = fVarArr2[i10];
            if (c10 != fVar2.a || fVar.f2715b.length != fVar2.f2715b.length) {
                return false;
            }
        }
        return true;
    }

    public static float[] f(float[] fArr, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int iMin = Math.min(i10, length);
        float[] fArr2 = new float[i10];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    public static final String g(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder sb = new StringBuilder();
            for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                sb.append(line);
                sb.append('\n');
            }
            return sb.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    public static h h(e0 e0Var) {
        i.f(e0Var, "table");
        if (e0Var.f11050t.size() == 0) {
            return h.f11586b;
        }
        List list = e0Var.f11050t;
        i.e(list, "table.requirementList");
        return new h(list);
    }

    public static com.bumptech.glide.h i(com.bumptech.glide.b bVar, ArrayList arrayList) {
        j fVar;
        j c0232a;
        B1.b bVar2 = bVar.f7587s;
        com.bumptech.glide.f fVar2 = bVar.f7589u;
        Context applicationContext = fVar2.getApplicationContext();
        P0.d dVar = fVar2.f7601h;
        com.bumptech.glide.h hVar = new com.bumptech.glide.h();
        l lVar = new l();
        Ea.a aVar = hVar.f7613g;
        synchronized (aVar) {
            aVar.a.add(lVar);
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 27) {
            hVar.k(new s());
        }
        Resources resources = applicationContext.getResources();
        ArrayList arrayListF = hVar.f();
        g gVar = bVar.f7590v;
        L1.a aVar2 = new L1.a(applicationContext, arrayListF, bVar2, gVar);
        E e10 = new E(bVar2, new p204v1.g(5));
        o oVar = new o(hVar.f(), resources.getDisplayMetrics(), bVar2, gVar);
        if (i10 < 28 || !((Map) dVar.f3811t).containsKey(com.bumptech.glide.c.class)) {
            fVar = new H1.f(oVar, 0);
            c0232a = new C0232a(oVar, 2, gVar);
        } else {
            c0232a = new H1.g(1);
            fVar = new H1.g(0);
        }
        Class<InputStream> cls = InputStream.class;
        if (i10 >= 28) {
            hVar.d("Animation", InputStream.class, Drawable.class, new J1.a(new o1.c(arrayListF, 5, gVar), 1));
            hVar.d("Animation", ByteBuffer.class, Drawable.class, new J1.a(new o1.c(arrayListF, 5, gVar), 0));
        }
        J1.d dVar2 = new J1.d(applicationContext);
        y yVar = new y(resources, 1);
        z zVar = new z(resources, 1);
        z zVar2 = new z(resources, 0);
        y yVar2 = new y(resources, 0);
        C0233b c0233b = new C0233b(gVar);
        A1.l lVar2 = new A1.l(1);
        M1.d dVar3 = new M1.d(1);
        ContentResolver contentResolver = applicationContext.getContentResolver();
        hVar.b(ByteBuffer.class, new B(5));
        hVar.b(InputStream.class, new A1.r(gVar, 8));
        hVar.d("Bitmap", ByteBuffer.class, Bitmap.class, fVar);
        hVar.d("Bitmap", InputStream.class, Bitmap.class, c0232a);
        String str = Build.FINGERPRINT;
        Class<ParcelFileDescriptor> cls2 = ParcelFileDescriptor.class;
        if (!"robolectric".equals(str)) {
            hVar.d("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new H1.f(oVar, 1));
        }
        hVar.d("Bitmap", ParcelFileDescriptor.class, Bitmap.class, e10);
        hVar.d("Bitmap", AssetFileDescriptor.class, Bitmap.class, new E(bVar2, new K3.d(5)));
        B b3 = B.f1291t;
        hVar.a(Bitmap.class, Bitmap.class, b3);
        hVar.d("Bitmap", Bitmap.class, Bitmap.class, new A(0));
        hVar.c(Bitmap.class, c0233b);
        hVar.d("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C0232a(resources, fVar));
        hVar.d("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C0232a(resources, c0232a));
        hVar.d("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new C0232a(resources, e10));
        hVar.c(BitmapDrawable.class, new o1.r(bVar2, 3, c0233b));
        hVar.d("Animation", InputStream.class, L1.c.class, new L1.i(arrayListF, aVar2, gVar));
        hVar.d("Animation", ByteBuffer.class, L1.c.class, aVar2);
        hVar.c(L1.c.class, new za.c(7));
        hVar.a(p223x1.d.class, p223x1.d.class, b3);
        hVar.d("Bitmap", p223x1.d.class, Bitmap.class, new C0234c(bVar2));
        hVar.d("legacy_append", Uri.class, Drawable.class, dVar2);
        hVar.d("legacy_append", Uri.class, Bitmap.class, new C0232a(dVar2, 1, bVar2));
        hVar.i(new I1.a(0));
        hVar.a(File.class, ByteBuffer.class, new B(6));
        hVar.a(File.class, InputStream.class, new C0184f(new B(9)));
        hVar.d("legacy_append", File.class, File.class, new A(2));
        hVar.a(File.class, ParcelFileDescriptor.class, new C0184f(new B(8)));
        hVar.a(File.class, File.class, b3);
        hVar.i(new com.bumptech.glide.load.data.l(gVar));
        if (!"robolectric".equals(str)) {
            hVar.i(new I1.a(2));
        }
        Class cls3 = Integer.TYPE;
        hVar.a(cls3, InputStream.class, yVar);
        hVar.a(cls3, ParcelFileDescriptor.class, zVar2);
        hVar.a(Integer.class, InputStream.class, yVar);
        hVar.a(Integer.class, ParcelFileDescriptor.class, zVar2);
        hVar.a(Integer.class, Uri.class, zVar);
        hVar.a(cls3, AssetFileDescriptor.class, yVar2);
        hVar.a(Integer.class, AssetFileDescriptor.class, yVar2);
        hVar.a(cls3, Uri.class, zVar);
        hVar.a(String.class, InputStream.class, new A1.r(6));
        hVar.a(Uri.class, InputStream.class, new A1.r(6));
        hVar.a(String.class, InputStream.class, new B(13));
        hVar.a(String.class, ParcelFileDescriptor.class, new B(12));
        hVar.a(String.class, AssetFileDescriptor.class, new B(11));
        hVar.a(Uri.class, InputStream.class, new p040e1.j(applicationContext.getAssets(), 7));
        hVar.a(Uri.class, AssetFileDescriptor.class, new A1.r(applicationContext.getAssets(), 5));
        hVar.a(Uri.class, InputStream.class, new C1.e(applicationContext));
        hVar.a(Uri.class, InputStream.class, new E1.l(applicationContext, 1));
        if (i10 >= 29) {
            hVar.a(Uri.class, InputStream.class, new F1.b(applicationContext, cls));
            hVar.a(Uri.class, ParcelFileDescriptor.class, new F1.b(applicationContext, cls2));
        }
        hVar.a(Uri.class, InputStream.class, new D(contentResolver, 1));
        hVar.a(Uri.class, ParcelFileDescriptor.class, new E1.E(contentResolver));
        hVar.a(Uri.class, AssetFileDescriptor.class, new D(contentResolver, 0));
        hVar.a(Uri.class, InputStream.class, new B(14));
        hVar.a(URL.class, InputStream.class, new p053f4.e(3));
        hVar.a(Uri.class, File.class, new E1.l(applicationContext, 0));
        hVar.a(C0185g.class, InputStream.class, new p040e1.j(9));
        hVar.a(byte[].class, ByteBuffer.class, new B(2));
        hVar.a(byte[].class, InputStream.class, new B(4));
        hVar.a(Uri.class, Uri.class, b3);
        hVar.a(Drawable.class, Drawable.class, b3);
        hVar.d("legacy_append", Drawable.class, Drawable.class, new A(1));
        hVar.j(Bitmap.class, BitmapDrawable.class, new y(resources, 2));
        hVar.j(Bitmap.class, byte[].class, lVar2);
        hVar.j(Drawable.class, byte[].class, new C0099h(bVar2, lVar2, dVar3, 19));
        hVar.j(L1.c.class, byte[].class, dVar3);
        E e11 = new E(bVar2, new p053f4.e(5));
        hVar.d("legacy_append", ByteBuffer.class, Bitmap.class, e11);
        hVar.d("legacy_append", ByteBuffer.class, BitmapDrawable.class, new C0232a(resources, e11));
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw E0.a.e(it);
        }
        return hVar;
    }

    public static final void j(File file) {
        if (file.exists()) {
            return;
        }
        if (file.getParentFile() == null || file.getParentFile().exists()) {
            if (file.createNewFile()) {
                return;
            }
            throw new FileNotFoundException(file + " file_not_found");
        }
        if (!file.getParentFile().mkdirs()) {
            throw new FileNotFoundException(file + " file_not_found");
        }
        if (file.createNewFile()) {
            return;
        }
        throw new FileNotFoundException(file + " file_not_found");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:41:0x0091  */
    /* JADX WARN: Code duplicated, block: B:46:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d7 A[SYNTHETIC] */
    public static f[] k(String str) {
        int i10;
        String strTrim;
        float[] fArrF;
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        int i12 = 0;
        int i13 = 1;
        while (i13 < str.length()) {
            while (i13 < str.length()) {
                char cCharAt = str.charAt(i13);
                if ((cCharAt - 'Z') * (cCharAt - 'A') > 0) {
                    if ((cCharAt - 'z') * (cCharAt - 'a') > 0) {
                        continue;
                    } else if (cCharAt != 'e' && cCharAt != 'E') {
                        strTrim = str.substring(i12, i13).trim();
                        if (strTrim.isEmpty()) {
                            if (strTrim.charAt(i11) != 'z' || strTrim.charAt(i11) == 'Z') {
                                fArrF = new float[i11];
                            } else {
                                try {
                                    float[] fArr = new float[strTrim.length()];
                                    int length = strTrim.length();
                                    int i14 = i11;
                                    int i15 = 1;
                                    while (i15 < length) {
                                        int i16 = i11;
                                        int i17 = i16;
                                        int i18 = i17;
                                        int i19 = i18;
                                        for (int i20 = i15; i20 < strTrim.length(); i20++) {
                                            char cCharAt2 = strTrim.charAt(i20);
                                            if (cCharAt2 == ' ') {
                                                i16 = 0;
                                                i18 = 1;
                                            } else if (cCharAt2 != 'E' && cCharAt2 != 'e') {
                                                switch (cCharAt2) {
                                                    case ',':
                                                        i16 = 0;
                                                        i18 = 1;
                                                        break;
                                                    case '-':
                                                        if (i20 == i15 || i16 != 0) {
                                                            i16 = 0;
                                                        } else {
                                                            i16 = 0;
                                                            i18 = 1;
                                                            i19 = 1;
                                                        }
                                                        break;
                                                    case '.':
                                                        if (i17 == 0) {
                                                            i16 = 0;
                                                            i17 = 1;
                                                        } else {
                                                            i16 = 0;
                                                            i18 = 1;
                                                            i19 = 1;
                                                        }
                                                        break;
                                                    default:
                                                        i16 = 0;
                                                        break;
                                                }
                                            } else {
                                                i16 = 1;
                                            }
                                            if (i18 != 0) {
                                                if (i15 < i20) {
                                                    fArr[i14] = Float.parseFloat(strTrim.substring(i15, i20));
                                                    i14++;
                                                }
                                                if (i19 != 0) {
                                                    i15 = i20;
                                                } else {
                                                    i15 = i20 + 1;
                                                }
                                                i11 = 0;
                                            }
                                        }
                                        if (i15 < i20) {
                                            fArr[i14] = Float.parseFloat(strTrim.substring(i15, i20));
                                            i14++;
                                        }
                                        if (i19 != 0) {
                                            i15 = i20;
                                        } else {
                                            i15 = i20 + 1;
                                        }
                                        i11 = 0;
                                    }
                                    fArrF = f(fArr, i14);
                                    i11 = 0;
                                } catch (NumberFormatException e10) {
                                    throw new RuntimeException(E0.a.i("error in parsing \"", strTrim, "\""), e10);
                                }
                            }
                            arrayList.add(new f(strTrim.charAt(i11), fArrF));
                        }
                        i12 = i13;
                        i13++;
                        i11 = 0;
                    }
                } else if (cCharAt != 'e') {
                    continue;
                }
                i13++;
            }
            strTrim = str.substring(i12, i13).trim();
            if (strTrim.isEmpty()) {
                if (strTrim.charAt(i11) != 'z') {
                    fArrF = new float[i11];
                } else {
                    fArrF = new float[i11];
                }
                arrayList.add(new f(strTrim.charAt(i11), fArrF));
            }
            i12 = i13;
            i13++;
            i11 = 0;
        }
        if (i13 - i12 != 1 || i12 >= str.length()) {
            i10 = 0;
        } else {
            i10 = 0;
            arrayList.add(new f(str.charAt(i12), new float[0]));
        }
        return (f[]) arrayList.toArray(new f[i10]);
    }

    public static Path l(String str) {
        Path path = new Path();
        try {
            f.b(k(str), path);
            return path;
        } catch (RuntimeException e10) {
            throw new RuntimeException("Error in parsing ".concat(str), e10);
        }
    }

    public static f[] m(f[] fVarArr) {
        f[] fVarArr2 = new f[fVarArr.length];
        for (int i10 = 0; i10 < fVarArr.length; i10++) {
            fVarArr2[i10] = new f(fVarArr[i10]);
        }
        return fVarArr2;
    }

    public static boolean n(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static final int o(G8.e eVar) {
        i.f(eVar, "<this>");
        return eVar.x().size();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004c  */
    public static final long p(AbstractMap abstractMap) {
        long jLongValue;
        Long lA;
        String strW = w(abstractMap, "Content-Range", "content-range", "ContentRange");
        Integer numValueOf = strW != null ? Integer.valueOf(L9.f.S(strW, 6, "/")) : null;
        if (numValueOf == null || numValueOf.intValue() == -1 || numValueOf.intValue() >= strW.length()) {
            jLongValue = -1;
        } else {
            String strSubstring = strW.substring(numValueOf.intValue() + 1);
            i.b(strSubstring, "(this as java.lang.String).substring(startIndex)");
            Long lA2 = m.A(strSubstring);
            if (lA2 != null) {
                jLongValue = lA2.longValue();
            } else {
                jLongValue = -1;
            }
        }
        if (jLongValue != -1) {
            return jLongValue;
        }
        String strW2 = w(abstractMap, "content-length", "Content-Length", "ContentLength");
        if (strW2 == null || (lA = m.A(strW2)) == null) {
            return -1L;
        }
        return lA.longValue();
    }

    public static int q(W6.a aVar, int i10) {
        int iX;
        int iX2;
        if (aVar == null) {
            return 0;
        }
        W6.b bVarB = aVar.b();
        W6.b bVar = W6.b.f5347s;
        T6.f fVar = T6.f.f4688z;
        if (bVarB == bVar) {
            if (aVar.b() == bVar) {
                iX2 = x(aVar, i10);
            } else {
                iX2 = aVar.a;
                if (aVar.a() == fVar) {
                    iX2 *= 3;
                }
            }
            return iX2 + aVar.f5328c;
        }
        if (aVar.b() == bVar) {
            iX = aVar.a;
            if (aVar.a() == fVar) {
                iX *= 3;
            }
        } else {
            iX = x(aVar, i10);
        }
        return iX + aVar.f5329d;
    }

    public static final String r(String str) {
        i.g(str, "url");
        String strSubstring = str.substring(L9.f.P(str, "//", 0, false, 6) + 2, L9.f.S(str, 6, ":"));
        i.b(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static final int s(String str) {
        i.g(str, "url");
        String strSubstring = str.substring(L9.f.S(str, 6, ":") + 1, str.length());
        i.b(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        int iP = L9.f.P(strSubstring, "/", 0, false, 6);
        if (iP == -1) {
            return Integer.parseInt(strSubstring);
        }
        String strSubstring2 = strSubstring.substring(0, iP);
        i.b(strSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return Integer.parseInt(strSubstring2);
    }

    public static final File t(String str) throws IOException {
        i.g(str, "filePath");
        File file = new File(str);
        if (!file.exists()) {
            if (file.getParentFile() == null || file.getParentFile().exists()) {
                file.createNewFile();
            } else if (file.getParentFile().mkdirs()) {
                file.createNewFile();
                return file;
            }
        }
        return file;
    }

    public static final String u(Context context) {
        i.g(context, "context");
        StringBuilder sb = new StringBuilder();
        File filesDir = context.getFilesDir();
        i.b(filesDir, "context.filesDir");
        sb.append(filesDir.getAbsoluteFile());
        sb.append("/_fetchData/temp");
        return sb.toString();
    }

    public static final Uri v(String str) {
        i.g(str, "path");
        if (J(str)) {
            Uri uri = Uri.parse(str);
            i.b(uri, "Uri.parse(path)");
            return uri;
        }
        Uri uriFromFile = Uri.fromFile(new File(str));
        i.b(uriFromFile, "Uri.fromFile(File(path))");
        return uriFromFile;
    }

    public static final String w(AbstractMap abstractMap, String... strArr) {
        int length = strArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                return null;
            }
            List list = (List) abstractMap.get(strArr[i10]);
            String str = list != null ? (String) k.V(list) : null;
            if (str != null && !n.D(str)) {
                return str;
            }
            i10++;
        }
    }

    public static int x(W6.a aVar, int i10) {
        int i11 = aVar.f5339o;
        int i12 = aVar.a;
        int i13 = aVar.f5332g;
        int i14 = aVar.f5327b;
        int i15 = 0;
        for (int i16 = 0; i16 < i11; i16++) {
            int i17 = i13 / 2;
            int i18 = i12 + i17 + i15;
            if (i10 == i16) {
                return i18;
            }
            i15 = i12 + i14 + i17 + i18;
        }
        return aVar.a() == T6.f.f4688z ? (i12 * 2) + i15 : i15;
    }

    public static final Long y(String str) throws IOException {
        i.g(str, "filePath");
        File fileT = t(str);
        if (fileT.exists()) {
            RandomAccessFile randomAccessFile = new RandomAccessFile(fileT, "r");
            try {
                try {
                    Long lValueOf = Long.valueOf(randomAccessFile.readLong());
                    try {
                        randomAccessFile.close();
                        return lValueOf;
                    } catch (Exception unused) {
                        return lValueOf;
                    }
                } catch (Exception unused2) {
                }
            } catch (Exception unused3) {
                randomAccessFile.close();
                return null;
            } catch (Throwable th) {
                try {
                    randomAccessFile.close();
                } catch (Exception unused4) {
                }
                throw th;
            }
        }
        return null;
    }

    public static final String z(String str) {
        i.g(str, "url");
        try {
            Uri uri = Uri.parse(str);
            StringBuilder sb = new StringBuilder();
            i.b(uri, "uri");
            sb.append(uri.getScheme());
            sb.append("://");
            sb.append(uri.getAuthority());
            return sb.toString();
        } catch (Exception unused) {
            return "https://google.com";
        }
    }

    public abstract List e(String str, List list);
}

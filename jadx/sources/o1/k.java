package o1;

import A1.C0099h;
import A9.AbstractC0151y;
import L8.AbstractC0287v;
import L8.InterfaceC0271e;
import L8.InterfaceC0273g;
import L8.InterfaceC0290y;
import L8.M;
import L8.e0;
import O3.z;
import O8.C0355k;
import R8.AbstractC0408c;
import U.B0;
import U.C0417d0;
import U.F;
import U.InterfaceC0432s;
import U.U;
import U8.A;
import X9.O;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.gms.cloudmessaging.zzd;
import com.google.android.material.textview.MaterialTextView;
import com.google.gson.JsonIOException;
import com.google.gson.u;
import com.kcstream.cing.R;
import com.rollbar.notifier.sender.SyncSender;
import com.unity3d.ads.metadata.MediationMetaData;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.UrlRequest;
import org.json.JSONException;
import org.json.JSONObject;
import p047e9.C0612d;
import p047e9.C0613e;
import p047e9.C0615g;
import p047e9.EnumC0611c;
import p078i.AbstractActivityC0655l;
import p078i.D;
import p086i8.t;
import p086i8.y;
import p145o9.s;
import p145o9.v;
import p145o9.w;
import p145o9.x;
import ya.C0891l;
import ya.InterfaceC0882c;
import ya.InterfaceC0885f;
import ya.InterfaceC0890k;
import ya.L;

/* JADX INFO: loaded from: classes.dex */
public final class k implements InterfaceC0890k, InterfaceC0432s, A, p220w9.e, p027c7.b, InterfaceC0885f {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f13638s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f13639t;

    public /* synthetic */ k(Object obj, Object obj2) {
        this.f13638s = obj;
        this.f13639t = obj2;
    }

    public static k e(View view) {
        int i10 = R.id.itemImage;
        ImageView imageView = (ImageView) oa.b.c(view, R.id.itemImage);
        if (imageView != null) {
            i10 = R.id.itemTitle;
            MaterialTextView materialTextView = (MaterialTextView) oa.b.c(view, R.id.itemTitle);
            if (materialTextView != null) {
                return new k(imageView, materialTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @Override // U.InterfaceC0432s
    public B0 E(View view, B0 b3) {
        B0 b0I = U.i(view, b3);
        if (b0I.a.m()) {
            return b0I;
        }
        int iB = b0I.b();
        Rect rect = (Rect) this.f13638s;
        rect.left = iB;
        rect.top = b0I.d();
        rect.right = b0I.c();
        rect.bottom = b0I.a();
        N6.l lVar = (N6.l) this.f13639t;
        int childCount = lVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            B0 b0B = U.b(lVar.getChildAt(i10), b0I);
            rect.left = Math.min(b0B.b(), rect.left);
            rect.top = Math.min(b0B.d(), rect.top);
            rect.right = Math.min(b0B.c(), rect.right);
            rect.bottom = Math.min(b0B.a(), rect.bottom);
        }
        return b0I.f(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // p220w9.e
    public p220w9.d a(p096j9.b bVar) {
        p210v8.i.f(bVar, "classId");
        p029c9.d dVar = (p029c9.d) this.f13639t;
        p210v8.i.f((p220w9.i) dVar.c().f2080c, "<this>");
        Q8.b bVarD = p068ga.l.d((p040e1.j) this.f13638s, bVar, i9.f.f12337g);
        if (bVarD == null) {
            return null;
        }
        AbstractC0408c.a(bVarD.a).equals(bVar);
        return dVar.f(bVarD);
    }

    @Override // p027c7.b
    public J7.a b() {
        int i10 = 1;
        int i11 = 0;
        V.h hVar = new V.h(this, 24);
        int i12 = J7.c.a;
        E0.a.m(5, "mode is null");
        return new U7.f(new U7.i(new X7.a(new T7.k(new T7.n(new T7.f(hVar, i11), f7.d.f11439t), i11), f7.d.f11440u, i10), i10, f7.d.f11441v), i11);
    }

    @Override // p027c7.b
    public boolean c() {
        return ((E1.l) this.f13638s).d();
    }

    @Override // p027c7.b
    public boolean d() {
        return ((E1.l) this.f13638s).c();
    }

    public void f(String str, boolean z6) throws IOException {
        p210v8.i.g(str, "file");
        Context context = (Context) this.f13638s;
        p210v8.i.g(context, "context");
        if (!C3.b.J(str)) {
            C4.a.n(str, z6);
            return;
        }
        Uri uri = Uri.parse(str);
        p210v8.i.b(uri, "uri");
        if (p210v8.i.a(uri.getScheme(), "file")) {
            String path = uri.getPath();
            if (path != null) {
                str = path;
            }
            C4.a.n(str, z6);
            return;
        }
        if (!p210v8.i.a(uri.getScheme(), "content")) {
            throw new IOException("FNC");
        }
        if (context.getContentResolver().openFileDescriptor(uri, "w") == null) {
            throw new IOException("FNC");
        }
    }

    @Override // ya.InterfaceC0885f
    public void g(InterfaceC0882c interfaceC0882c, Throwable th) {
        ((C0891l) this.f13639t).f16211s.execute(new z(this, (InterfaceC0885f) this.f13638s, th, 11));
    }

    public M8.c h(C0615g c0615g, p067g9.f fVar) {
        p210v8.i.f(c0615g, "proto");
        p210v8.i.f(fVar, "nameResolver");
        InterfaceC0271e interfaceC0271eF = AbstractC0287v.f((InterfaceC0290y) this.f13638s, J7.a.e(fVar, c0615g.f11063u), (p140o4.r) this.f13639t);
        Map mapZ = t.f12329s;
        if (c0615g.f11064v.size() != 0 && !C9.i.f(interfaceC0271eF) && p124m9.e.n(interfaceC0271eF, 5)) {
            Collection collectionN = interfaceC0271eF.n();
            p210v8.i.e(collectionN, "annotationClass.constructors");
            C0355k c0355k = (C0355k) p086i8.k.l0(collectionN);
            if (c0355k != null) {
                List listH0 = c0355k.H0();
                p210v8.i.e(listH0, "constructor.valueParameters");
                List list = listH0;
                int iS = p086i8.z.s(p086i8.m.H(list, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                for (Object obj : list) {
                    linkedHashMap.put(((O8.U) obj).getName(), obj);
                }
                List<C0613e> list2 = c0615g.f11064v;
                p210v8.i.e(list2, "proto.argumentList");
                ArrayList arrayList = new ArrayList();
                for (C0613e c0613e : list2) {
                    p210v8.i.e(c0613e, "it");
                    O8.U u3 = (O8.U) linkedHashMap.get(J7.a.i(fVar, c0613e.f11043u));
                    Object fVar2 = null;
                    if (u3 != null) {
                        p096j9.f fVarI = J7.a.i(fVar, c0613e.f11043u);
                        AbstractC0151y type = u3.getType();
                        p210v8.i.e(type, "parameter.type");
                        C0612d c0612d = c0613e.f11044v;
                        p210v8.i.e(c0612d, "proto.value");
                        p145o9.g gVarV = v(type, c0612d, fVar);
                        fVar2 = i(gVarV, type, c0612d) ? gVarV : null;
                        if (fVar2 == null) {
                            String str = "Unexpected argument value: actual type " + c0612d.f11021u + " != expected type " + type;
                            p210v8.i.f(str, "message");
                            fVar2 = new p145o9.j(str);
                        }
                        fVar2 = new p076h8.f(fVarI, fVar2);
                    }
                    if (fVar2 != null) {
                        arrayList.add(fVar2);
                    }
                }
                mapZ = y.z(arrayList);
            }
        }
        return new M8.c(interfaceC0271eF.p(), mapZ, M.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean i(p145o9.g gVar, AbstractC0151y abstractC0151y, C0612d c0612d) {
        EnumC0611c enumC0611c = c0612d.f11021u;
        int i10 = enumC0611c == null ? -1 : p220w9.b.a[enumC0611c.ordinal()];
        if (i10 == 10) {
            InterfaceC0273g interfaceC0273gW = abstractC0151y.D().w();
            InterfaceC0271e interfaceC0271e = interfaceC0273gW instanceof InterfaceC0271e ? (InterfaceC0271e) interfaceC0273gW : null;
            if (interfaceC0271e != null) {
                p096j9.f fVar = I8.i.f2112e;
                if (!I8.i.b(interfaceC0271e, I8.n.P)) {
                    return false;
                }
            }
            return true;
        }
        InterfaceC0290y interfaceC0290y = (InterfaceC0290y) this.f13638s;
        if (i10 != 13) {
            return p210v8.i.a(gVar.a(interfaceC0290y), abstractC0151y);
        }
        if (gVar instanceof p145o9.b) {
            p145o9.b bVar = (p145o9.b) gVar;
            if (((List) bVar.a).size() == c0612d.f11014C.size()) {
                AbstractC0151y abstractC0151yF = interfaceC0290y.s().f(abstractC0151y);
                Collection collection = (Collection) bVar.a;
                p210v8.i.f(collection, "<this>");
                B8.c cVar = new B8.c(0, collection.size() - 1, 1);
                if (!(cVar instanceof Collection) || !((Collection) cVar).isEmpty()) {
                    B8.b bVarE = cVar.iterator();
                    while (bVarE.f774u) {
                        int iA = bVarE.a();
                        p145o9.g gVar2 = (p145o9.g) ((List) bVar.a).get(iA);
                        C0612d c0612d2 = (C0612d) c0612d.f11014C.get(iA);
                        p210v8.i.e(c0612d2, "value.getArrayElement(i)");
                        if (!i(gVar2, abstractC0151yF, c0612d2)) {
                            return false;
                        }
                    }
                }
                return true;
            }
        }
        throw new IllegalStateException(("Deserialized ArrayValue should have the same number of elements as the original array value: " + gVar).toString());
    }

    @Override // ya.InterfaceC0890k
    public Object j(Object obj) {
        O o10 = (O) obj;
        X9.M m2 = o10.f5547s;
        if (m2 == null) {
            ma.h hVarC = o10.c();
            X9.A aB = o10.b();
            Charset charsetA = aB == null ? null : aB.a(L9.a.a);
            if (charsetA == null) {
                charsetA = L9.a.a;
            }
            m2 = new X9.M(hVarC, charsetA);
            o10.f5547s = m2;
        }
        com.google.gson.i iVar = (com.google.gson.i) this.f13638s;
        A4.a aVar = new A4.a(m2);
        aVar.f301t = iVar.f10010g;
        try {
            Object objB = ((u) this.f13639t).b(aVar);
            if (aVar.X() != 10) {
                throw new JsonIOException("JSON document was not fully consumed.");
            }
            o10.close();
            return objB;
        } catch (Throwable th) {
            o10.close();
            throw th;
        }
    }

    public boolean k(String str) {
        p210v8.i.g(str, "file");
        if (str.length() == 0) {
            return false;
        }
        try {
            ContentResolver contentResolver = ((Context) this.f13638s).getContentResolver();
            p210v8.i.b(contentResolver, "context.contentResolver");
            C4.a.v(contentResolver, str).close();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public File l() {
        if (((File) this.f13638s) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f13638s) == null) {
                        D3.g gVar = (D3.g) this.f13639t;
                        gVar.a();
                        this.f13638s = new File(gVar.a.getFilesDir(), "PersistedInstallation." + ((D3.g) this.f13639t).d() + ".json");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (File) this.f13638s;
    }

    @Override // ya.InterfaceC0885f
    public void m(InterfaceC0882c interfaceC0882c, L l4) {
        ((C0891l) this.f13639t).f16211s.execute(new z(this, (InterfaceC0885f) this.f13638s, l4, 10));
    }

    public void n(p092j4.a aVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", aVar.a);
            jSONObject.put("Status", p239z.e.d(aVar.f12498b));
            jSONObject.put("AuthToken", aVar.f12499c);
            jSONObject.put("RefreshToken", aVar.f12500d);
            jSONObject.put("TokenCreationEpochInSecs", aVar.f12502f);
            jSONObject.put("ExpiresInSecs", aVar.f12501e);
            jSONObject.put("FisError", aVar.f12503g);
            D3.g gVar = (D3.g) this.f13639t;
            gVar.a();
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", gVar.a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes(SyncSender.UTF_8));
            fileOutputStream.close();
            if (fileCreateTempFile.renameTo(l())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public void o(Ga.c cVar, SparseArray sparseArray) {
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                SparseArray sparseArray2 = (SparseArray) sparseArray.valueAt(i10);
                int size2 = sparseArray2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    int iKeyAt = sparseArray.keyAt(i10);
                    int iKeyAt2 = sparseArray2.keyAt(i11);
                    if (sparseArray2.valueAt(i11) != null) {
                        throw new ClassCastException();
                    }
                    if (iKeyAt == R.id.undefined && iKeyAt2 == R.id.undefined) {
                        if (((Ga.d) (!(cVar instanceof Ga.d) ? null : cVar)) != null) {
                            p210v8.i.b(null, "viewEventListener");
                            p210v8.i.f(null, "<set-?>");
                        }
                    }
                    View viewFindViewById = cVar.f7003s;
                    if (iKeyAt != R.id.undefined) {
                        viewFindViewById = viewFindViewById.findViewById(iKeyAt);
                        p210v8.i.b(viewFindViewById, "smartViewHolder.itemView.findViewById(viewId)");
                    }
                    p210v8.i.b(null, "viewEventListener");
                    p040e1.j jVar = (p040e1.j) this.f13639t;
                    jVar.getClass();
                    p210v8.i.g(null, "viewEventListener");
                    SparseArray sparseArray3 = (SparseArray) jVar.f10697t;
                    if (sparseArray3.indexOfKey(iKeyAt2) >= 0) {
                        switch (((Fa.b) sparseArray3.get(iKeyAt2)).a) {
                            case 0:
                                p210v8.i.g(null, "viewEventListener");
                                viewFindViewById.setOnClickListener(new Fa.a(iKeyAt2, cVar));
                                break;
                            case 1:
                                p210v8.i.g(null, "viewEventListener");
                                throw null;
                            default:
                                p210v8.i.g(null, "viewEventListener");
                                viewFindViewById.setOnLongClickListener(new Fa.c(iKeyAt2, cVar));
                                break;
                        }
                    }
                }
            }
        }
    }

    public void p(e0 e0Var) {
        h hVar = (h) this.f13638s;
        ((ActionMode.Callback) hVar.f13632s).onDestroyActionMode(hVar.f(e0Var));
        D d3 = (D) this.f13639t;
        if (d3.f11934O != null) {
            d3.f11923D.getDecorView().removeCallbacks(d3.P);
        }
        if (d3.f11933N != null) {
            C0417d0 c0417d0 = d3.f11935Q;
            if (c0417d0 != null) {
                c0417d0.b();
            }
            C0417d0 c0417d0A = U.a(d3.f11933N);
            c0417d0A.a(0.0f);
            d3.f11935Q = c0417d0A;
            c0417d0A.d(new p078i.u(this, 2));
        }
        d3.f11932M = null;
        ViewGroup viewGroup = d3.f11937S;
        WeakHashMap weakHashMap = U.a;
        F.c(viewGroup);
        d3.K();
    }

    public void q(Bundle bundle) {
        Locale locale = Locale.US;
        Objects.toString(bundle);
        Log.isLoggable("FirebaseCrashlytics", 2);
        String string = bundle.getString(MediationMetaData.KEY_NAME);
        if (string != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            M3.b bVar = "clx".equals(bundle2.getString("_o")) ? (C0099h) this.f13638s : (A1.r) this.f13639t;
            if (bVar == null) {
                return;
            }
            bVar.E(string, bundle2);
        }
    }

    public boolean r(e0 e0Var, p136o.l lVar) {
        ViewGroup viewGroup = ((D) this.f13639t).f11937S;
        WeakHashMap weakHashMap = U.a;
        F.c(viewGroup);
        h hVar = (h) this.f13638s;
        p125n.d dVarF = hVar.f(e0Var);
        p212w.i iVar = (p212w.i) hVar.f13635v;
        Menu a = (Menu) iVar.get(lVar);
        if (a == null) {
            a = new p136o.A((Context) hVar.f13633t, lVar);
            iVar.put(lVar, a);
        }
        return ((ActionMode.Callback) hVar.f13632s).onPrepareActionMode(dVarF, a);
    }

    public void s(String str, long j) throws IOException {
        p210v8.i.g(str, "file");
        if (str.length() == 0) {
            throw new FileNotFoundException(str.concat(" file_not_found"));
        }
        if (j < 1) {
            return;
        }
        Context context = (Context) this.f13638s;
        p210v8.i.g(context, "context");
        if (!C3.b.J(str)) {
            C4.a.a(new File(str), j);
            return;
        }
        Uri uri = Uri.parse(str);
        p210v8.i.b(uri, "uri");
        if (p210v8.i.a(uri.getScheme(), "file")) {
            String path = uri.getPath();
            if (path != null) {
                str = path;
            }
            C4.a.a(new File(str), j);
            return;
        }
        if (!p210v8.i.a(uri.getScheme(), "content")) {
            throw new IOException("file_allocation_error");
        }
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "w");
        if (parcelFileDescriptorOpenFileDescriptor == null) {
            throw new IOException("file_allocation_error");
        }
        if (j > 0) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                if (fileOutputStream.getChannel().size() == j) {
                    return;
                }
                fileOutputStream.getChannel().position(j - 1);
                fileOutputStream.write(1);
            } catch (Exception unused) {
                throw new IOException("file_allocation_error");
            }
        }
    }

    public p092j4.a t() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(l());
            while (true) {
                try {
                    int i10 = fileInputStream.read(bArr, 0, 16384);
                    if (i10 < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i10);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String strOptString = jSONObject.optString("Fid", null);
        int iOptInt = jSONObject.optInt("Status", 0);
        String strOptString2 = jSONObject.optString("AuthToken", null);
        String strOptString3 = jSONObject.optString("RefreshToken", null);
        long jOptLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String strOptString4 = jSONObject.optString("FisError", null);
        int i11 = p239z.e.e(5)[iOptInt];
        if (i11 == 0) {
            throw new NullPointerException("Null registrationStatus");
        }
        String str = i11 == 0 ? " registrationStatus" : "";
        if (str.isEmpty()) {
            return new p092j4.a(strOptString, i11, strOptString2, strOptString3, jOptLong2, jOptLong, strOptString4);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void u(String str) {
        C1.b bVar;
        synchronized (this) {
            try {
                Object obj = ((HashMap) this.f13638s).get(str);
                U1.f.c(obj, "Argument must not be null");
                bVar = (C1.b) obj;
                int i10 = bVar.f924b;
                if (i10 < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + bVar.f924b);
                }
                int i11 = i10 - 1;
                bVar.f924b = i11;
                if (i11 == 0) {
                    C1.b bVar2 = (C1.b) ((HashMap) this.f13638s).remove(str);
                    if (!bVar2.equals(bVar)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + bVar + ", but actually removed: " + bVar2 + ", safeKey: " + str);
                    }
                    ((C1.c) this.f13639t).b(bVar2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        bVar.a.unlock();
    }

    public p145o9.g v(AbstractC0151y abstractC0151y, C0612d c0612d, p067g9.f fVar) {
        p210v8.i.f(c0612d, "value");
        p210v8.i.f(fVar, "nameResolver");
        boolean zBooleanValue = p067g9.e.f11561M.c(c0612d.f11016E).booleanValue();
        EnumC0611c enumC0611c = c0612d.f11021u;
        switch (enumC0611c == null ? -1 : p220w9.b.a[enumC0611c.ordinal()]) {
            case 1:
                byte b3 = (byte) c0612d.f11022v;
                return zBooleanValue ? new x(b3) : new p145o9.d(b3);
            case 2:
                return new p145o9.e(Character.valueOf((char) c0612d.f11022v));
            case 3:
                short s9 = (short) c0612d.f11022v;
                return zBooleanValue ? new x(s9) : new p145o9.u(s9);
            case 4:
                int i10 = (int) c0612d.f11022v;
                return zBooleanValue ? new x(i10) : new p145o9.k(i10);
            case 5:
                long j = c0612d.f11022v;
                return zBooleanValue ? new x(j) : new s(j);
            case 6:
                return new p145o9.c(c0612d.f11023w);
            case 7:
                return new p145o9.c(c0612d.f11024x);
            case 8:
                return new p145o9.c(Boolean.valueOf(c0612d.f11022v != 0));
            case 9:
                return new v(fVar.getString(c0612d.f11025y));
            case 10:
                return new p145o9.r(J7.a.e(fVar, c0612d.f11026z), c0612d.f11015D);
            case 11:
                return new p145o9.i(J7.a.e(fVar, c0612d.f11026z), J7.a.i(fVar, c0612d.f11012A));
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                C0615g c0615g = c0612d.f11013B;
                p210v8.i.e(c0615g, "value.annotation");
                return new p145o9.a((Object) h(c0615g, fVar));
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                List list = c0612d.f11014C;
                p210v8.i.e(list, "value.arrayElementList");
                List<C0612d> list2 = list;
                ArrayList arrayList = new ArrayList(p086i8.m.H(list2, 10));
                for (C0612d c0612d2 : list2) {
                    A9.D dE = ((InterfaceC0290y) this.f13638s).s().e();
                    p210v8.i.e(c0612d2, "it");
                    arrayList.add(v(dE, c0612d2, fVar));
                }
                return new w(arrayList, abstractC0151y);
            default:
                throw new IllegalStateException(("Unsupported annotation argument type: " + c0612d.f11021u + " (expected " + abstractC0151y + ')').toString());
        }
    }

    public /* synthetic */ k(Object obj, Object obj2, boolean z6) {
        this.f13639t = obj;
        this.f13638s = obj2;
    }

    public k(IBinder iBinder) throws RemoteException {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.f13638s = new Messenger(iBinder);
            this.f13639t = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.f13639t = new zzd(iBinder);
            this.f13638s = null;
        } else {
            Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
            throw new RemoteException();
        }
    }

    public k(Context context, String str) {
        p210v8.i.g(context, "context");
        p210v8.i.g(str, "defaultTempDir");
        this.f13638s = context;
        this.f13639t = str;
    }

    public k(int i10) {
        switch (i10) {
            case 3:
                this.f13638s = new HashMap();
                this.f13639t = new p040e1.j(10);
                break;
            case 8:
                this.f13638s = new AtomicInteger();
                this.f13639t = new AtomicInteger();
                break;
            default:
                this.f13638s = new HashMap();
                this.f13639t = new C1.c(0);
                break;
        }
    }

    public k(AbstractActivityC0655l abstractActivityC0655l) {
        this.f13639t = abstractActivityC0655l;
        this.f13638s = new E1.l(abstractActivityC0655l, 2);
    }

    public k(InterfaceC0290y interfaceC0290y, p140o4.r rVar) {
        p210v8.i.f(interfaceC0290y, "module");
        p210v8.i.f(rVar, "notFoundClasses");
        this.f13638s = interfaceC0290y;
        this.f13639t = rVar;
    }

    public k(Map map) {
        this.f13638s = map;
        this.f13639t = new p247z9.l("Java nullability annotation states").c(new A0.m(this, 18));
    }
}

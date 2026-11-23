package E1;

import A1.C0099h;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: E1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0180b implements r {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f1300c;

    public /* synthetic */ C0180b(Object obj, int i10, Object obj2) {
        this.a = i10;
        this.f1299b = obj;
        this.f1300c = obj2;
    }

    @Override // E1.r
    public final boolean a(Object obj) {
        switch (this.a) {
            case 0:
                Uri uri = (Uri) obj;
                return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
            case 1:
                Iterator it = ((ArrayList) this.f1299b).iterator();
                while (it.hasNext()) {
                    if (((r) it.next()).a(obj)) {
                        return true;
                    }
                }
                return false;
            default:
                return true;
        }
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [E1.a, java.lang.Object] */
    @Override // E1.r
    public final q b(Object obj, int i10, int i11, p232y1.h hVar) {
        q qVarB;
        Uri uri;
        switch (this.a) {
            case 0:
                Uri uri2 = (Uri) obj;
                return new q(new T1.b(uri2), this.f1300c.p((AssetManager) this.f1299b, uri2.toString().substring(22)));
            case 1:
                ArrayList arrayList = (ArrayList) this.f1299b;
                int size = arrayList.size();
                ArrayList arrayList2 = new ArrayList(size);
                p232y1.e eVar = null;
                for (int i12 = 0; i12 < size; i12++) {
                    r rVar = (r) arrayList.get(i12);
                    if (rVar.a(obj) && (qVarB = rVar.b(obj, i10, i11, hVar)) != null) {
                        arrayList2.add(qVarB.f1326c);
                        eVar = qVarB.a;
                    }
                }
                if (arrayList2.isEmpty() || eVar == null) {
                    return null;
                }
                return new q(eVar, new v(arrayList2, (C0099h) this.f1300c));
            default:
                Integer num = (Integer) obj;
                Resources resources = (Resources) this.f1300c;
                try {
                    uri = Uri.parse("android.resource://" + resources.getResourcePackageName(num.intValue()) + '/' + resources.getResourceTypeName(num.intValue()) + '/' + resources.getResourceEntryName(num.intValue()));
                    break;
                } catch (Resources.NotFoundException e10) {
                    if (Log.isLoggable("ResourceLoader", 5)) {
                        Log.w("ResourceLoader", "Received invalid resource id: " + num, e10);
                    }
                    uri = null;
                }
                if (uri == null) {
                    return null;
                }
                return ((r) this.f1299b).b(uri, i10, i11, hVar);
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "MultiModelLoader{modelLoaders=" + Arrays.toString(((ArrayList) this.f1299b).toArray()) + '}';
            default:
                return super.toString();
        }
    }

    public C0180b(Resources resources, r rVar) {
        this.a = 2;
        this.f1300c = resources;
        this.f1299b = rVar;
    }
}

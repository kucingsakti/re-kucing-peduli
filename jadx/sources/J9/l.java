package J9;

import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.chromium.net.UrlRequest;
import p086i8.s;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {
    public static final j a = new j();

    public static /* synthetic */ void a(int i10) {
        Object[] objArr = new Object[3];
        switch (i10) {
            case 1:
            case 5:
            case 8:
            case 11:
            case 15:
            case 18:
            case MobileAdsBridge.CODE_21 /* 21 */:
            case 23:
                objArr[0] = "neighbors";
                break;
            case 2:
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            case 16:
            case 19:
            case 24:
                objArr[0] = "visited";
                break;
            case 3:
            case 6:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
            case 25:
                objArr[0] = "handler";
                break;
            case 4:
            case 7:
            case 17:
            case 20:
            default:
                objArr[0] = "nodes";
                break;
            case 9:
                objArr[0] = "predicate";
                break;
            case 10:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                objArr[0] = "node";
                break;
            case 22:
                objArr[0] = "current";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (i10) {
            case 7:
            case 8:
            case 9:
                objArr[2] = "ifAny";
                break;
            case 10:
            case 11:
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
            case 15:
            case 16:
                objArr[2] = "dfsFromNode";
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case MobileAdsBridge.CODE_21 /* 21 */:
                objArr[2] = "topologicalOrder";
                break;
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "doDfs";
                break;
            default:
                objArr[2] = "dfs";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static final void b(AbstractCollection abstractCollection, Object obj) {
        if (obj != null) {
            abstractCollection.add(obj);
        }
    }

    public static final List e(ArrayList arrayList) {
        p210v8.i.f(arrayList, "<this>");
        int size = arrayList.size();
        if (size == 0) {
            return s.f12328s;
        }
        if (size == 1) {
            return com.bumptech.glide.d.u(p086i8.k.T(arrayList));
        }
        arrayList.trimToSize();
        return arrayList;
    }

    public static Object f(Collection collection, b bVar, l lVar) {
        return g(collection, bVar, new p040e1.j(16), lVar);
    }

    public static Object g(Collection collection, b bVar, p040e1.j jVar, l lVar) {
        if (collection == null) {
            a(0);
            throw null;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            h(it.next(), bVar, jVar, lVar);
        }
        return lVar.k();
    }

    public static void h(Object obj, b bVar, p040e1.j jVar, l lVar) {
        if (obj == null) {
            a(22);
            throw null;
        }
        if (((HashSet) jVar.f10697t).add(obj) && lVar.d(obj)) {
            Iterator it = bVar.h(obj).iterator();
            while (it.hasNext()) {
                h(it.next(), bVar, jVar, lVar);
            }
            lVar.c(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean[], java.io.Serializable] */
    public static Boolean i(Collection collection, b bVar, p200u8.b bVar2) {
        return (Boolean) f(collection, bVar, new a(bVar2, new boolean[1], 0));
    }

    public static final boolean j(Throwable th) {
        Class<?> superclass = th.getClass();
        while (!p210v8.i.a(superclass.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                return false;
            }
        }
        return true;
    }

    public static void l(Object obj) throws Throwable {
        if (obj instanceof k) {
            throw ((k) obj).a;
        }
    }

    public abstract boolean d(Object obj);

    public abstract Object k();

    public void c(Object obj) {
    }
}

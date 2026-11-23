package H8;

import U8.x;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import p086i8.l;
import p096j9.b;
import p096j9.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final LinkedHashSet a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f1935b;

    static {
        List listC = l.C(x.a, x.f5000h, x.f5001i, x.f4995c, x.f4996d, x.f4998f);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(b.j((c) it.next()));
        }
        a = linkedHashSet;
        f1935b = b.j(x.f4999g);
    }
}

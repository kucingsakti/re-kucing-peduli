package Aa;

import com.google.gson.i;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import o1.k;
import p188t1.G;
import ya.AbstractC0889j;
import ya.InterfaceC0890k;

/* JADX INFO: loaded from: classes.dex */
public final class a extends AbstractC0889j {
    public final i a;

    public a(i iVar) {
        this.a = iVar;
    }

    @Override // ya.AbstractC0889j
    public final InterfaceC0890k a(Type type) {
        p243z4.a aVar = new p243z4.a(type);
        i iVar = this.a;
        return new b(iVar, iVar.c(aVar));
    }

    @Override // ya.AbstractC0889j
    public final InterfaceC0890k b(Type type, Annotation[] annotationArr, G g8) {
        p243z4.a aVar = new p243z4.a(type);
        i iVar = this.a;
        return new k(iVar, iVar.c(aVar));
    }
}

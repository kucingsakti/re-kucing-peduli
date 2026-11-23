package W9;

import N9.C0324g;
import X9.G;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.lang.reflect.Method;
import kotlin.KotlinNullPointerException;
import p210v8.i;
import retrofit2.HttpException;
import ya.C0894o;
import ya.InterfaceC0882c;
import ya.InterfaceC0885f;
import ya.L;

/* JADX INFO: loaded from: classes.dex */
public final class b implements OnCompleteListener, InterfaceC0885f {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0324g f5370s;

    public /* synthetic */ b(C0324g c0324g) {
        this.f5370s = c0324g;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void d(Task task) {
        Exception excF = task.f();
        C0324g c0324g = this.f5370s;
        if (excF != null) {
            c0324g.resumeWith(J7.a.d(excF));
        } else if (task.i()) {
            c0324g.r(null);
        } else {
            c0324g.resumeWith(task.g());
        }
    }

    @Override // ya.InterfaceC0885f
    public void g(InterfaceC0882c interfaceC0882c, Throwable th) {
        i.g(interfaceC0882c, "call");
        this.f5370s.resumeWith(J7.a.d(th));
    }

    @Override // ya.InterfaceC0885f
    public void m(InterfaceC0882c interfaceC0882c, L l4) {
        i.g(interfaceC0882c, "call");
        boolean zC = l4.a.c();
        C0324g c0324g = this.f5370s;
        if (!zC) {
            c0324g.resumeWith(J7.a.d(new HttpException(l4)));
            return;
        }
        Object obj = l4.f16192b;
        if (obj != null) {
            c0324g.resumeWith(obj);
            return;
        }
        G gK = interfaceC0882c.K();
        gK.getClass();
        Object objCast = C0894o.class.cast(gK.f5508e.get(C0894o.class));
        if (objCast == null) {
            i.l();
            throw null;
        }
        StringBuilder sb = new StringBuilder("Response from ");
        Method method = ((C0894o) objCast).a;
        Class<?> declaringClass = method.getDeclaringClass();
        i.b(declaringClass, "method.declaringClass");
        sb.append(declaringClass.getName());
        sb.append('.');
        sb.append(method.getName());
        sb.append(" was null but response body type was declared as non-null");
        c0324g.resumeWith(J7.a.d(new KotlinNullPointerException(sb.toString())));
    }
}

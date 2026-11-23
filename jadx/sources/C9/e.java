package C9;

import L8.AbstractC0281o;
import L8.InterfaceC0273g;
import L8.M;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import p086i8.C;
import p086i8.s;
import p086i8.u;
import t9.n;

/* JADX INFO: loaded from: classes.dex */
public class e implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f974b;

    public e(String[] strArr, int i10) {
        String str;
        AbstractC0487g.p(i10, "kind");
        p210v8.i.f(strArr, "formatParams");
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, objArrCopyOf.length);
        switch (i10) {
            case 1:
                str = "No member resolution should be done on captured type, it used only during constraint system resolution";
                break;
            case 2:
                str = "Scope for integer literal type (%s)";
                break;
            case 3:
                str = "Error scope for erased receiver type";
                break;
            case 4:
                str = "Scope for abbreviation %s";
                break;
            case 5:
                str = "Scope for stub type %s";
                break;
            case 6:
                str = "A scope for common supertype which is not a normal classifier";
                break;
            case 7:
                str = "Scope for error type %s";
                break;
            case 8:
                str = "Scope for unsupported type %s";
                break;
            case 9:
                str = "Error scope for class %s with arguments: %s";
                break;
            case 10:
                str = "Error resolution candidate for call %s";
                break;
            default:
                throw null;
        }
        this.f974b = String.format(str, objArrCopyOf2);
    }

    @Override // t9.p
    public InterfaceC0273g a(p096j9.f fVar, T8.b bVar) {
        p210v8.i.f(fVar, MediationMetaData.KEY_NAME);
        p210v8.i.f(bVar, "location");
        return new a(p096j9.f.l(String.format("<Error class: %s>", Arrays.copyOf(new Object[]{fVar}, 1))));
    }

    @Override // t9.n
    public Set d() {
        return u.f12330s;
    }

    @Override // t9.n
    public Set e() {
        return u.f12330s;
    }

    @Override // t9.p
    public Collection f(t9.f fVar, p200u8.b bVar) {
        p210v8.i.f(fVar, "kindFilter");
        return s.f12328s;
    }

    @Override // t9.n
    public Set g() {
        return u.f12330s;
    }

    @Override // t9.n
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Set c(p096j9.f fVar, T8.b bVar) {
        p210v8.i.f(fVar, MediationMetaData.KEY_NAME);
        a aVar = i.f1016c;
        p210v8.i.f(aVar, "containingDeclaration");
        b bVar2 = new b(aVar, null, M8.g.a, p096j9.f.l("<Error function>"), 1, M.a);
        s sVar = s.f12328s;
        bVar2.e1(null, null, sVar, sVar, sVar, i.c(h.RETURN_TYPE_FOR_FUNCTION, new String[0]), 3, AbstractC0281o.f2822e);
        return C.w(bVar2);
    }

    @Override // t9.n
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Set b(p096j9.f fVar, T8.b bVar) {
        p210v8.i.f(fVar, MediationMetaData.KEY_NAME);
        return i.f1019f;
    }

    public String toString() {
        return AbstractC0487g.j(new StringBuilder("ErrorScope{"), this.f974b, '}');
    }
}

package F8;

import A9.AbstractC0151y;
import L8.InterfaceC0269c;
import L8.InterfaceC0285t;
import O8.AbstractC0359o;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class v0 {
    public static final p114l9.g a = p114l9.g.f12982c;

    public static void a(InterfaceC0269c interfaceC0269c, StringBuilder sb) {
        O8.x xVarG = y0.g(interfaceC0269c);
        O8.x xVarR = interfaceC0269c.R();
        if (xVarG != null) {
            sb.append(d(xVarG.getType()));
            sb.append(".");
        }
        boolean z6 = (xVarG == null || xVarR == null) ? false : true;
        if (z6) {
            sb.append("(");
        }
        if (xVarR != null) {
            sb.append(d(xVarR.getType()));
            sb.append(".");
        }
        if (z6) {
            sb.append(")");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String b(InterfaceC0285t interfaceC0285t) {
        p210v8.i.f(interfaceC0285t, "descriptor");
        StringBuilder sb = new StringBuilder();
        sb.append("fun ");
        a(interfaceC0285t, sb);
        p096j9.f name = ((AbstractC0359o) interfaceC0285t).getName();
        p210v8.i.e(name, "descriptor.name");
        sb.append(a.O(name, true));
        List listH0 = interfaceC0285t.H0();
        p210v8.i.e(listH0, "descriptor.valueParameters");
        p086i8.k.Y(listH0, sb, ", ", "(", ")", C0208b.f1564z, 48);
        sb.append(": ");
        AbstractC0151y abstractC0151yW = interfaceC0285t.w();
        p210v8.i.c(abstractC0151yW);
        sb.append(d(abstractC0151yW));
        String string = sb.toString();
        p210v8.i.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static String c(L8.K k3) {
        p210v8.i.f(k3, "descriptor");
        StringBuilder sb = new StringBuilder();
        sb.append(k3.P() ? "var " : "val ");
        a(k3, sb);
        p096j9.f name = k3.getName();
        p210v8.i.e(name, "descriptor.name");
        sb.append(a.O(name, true));
        sb.append(": ");
        AbstractC0151y type = k3.getType();
        p210v8.i.e(type, "descriptor.type");
        sb.append(d(type));
        String string = sb.toString();
        p210v8.i.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static String d(AbstractC0151y abstractC0151y) {
        p210v8.i.f(abstractC0151y, com.onesignal.inAppMessages.internal.display.impl.k.EVENT_TYPE_KEY);
        return a.Y(abstractC0151y);
    }
}

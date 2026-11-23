package p125n;

import Y1.c;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import p.AbstractC0710j0;
import p069h.a;
import p136o.l;
import p136o.o;

/* JADX INFO: loaded from: classes.dex */
public final class g extends MenuInflater {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Class[] f13272e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Class[] f13273f;
    public final Object[] a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f13274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f13275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f13276d;

    static {
        Class[] clsArr = {Context.class};
        f13272e = clsArr;
        f13273f = clsArr;
    }

    public g(Context context) {
        super(context);
        this.f13275c = context;
        Object[] objArr = {context};
        this.a = objArr;
        this.f13274b = objArr;
    }

    public static Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [n.g] */
    /* JADX WARN: Type inference failed for: r3v13, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v59 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        ?? r10;
        int i10;
        ?? r11;
        ColorStateList colorStateList;
        f fVar = new f(this, menu);
        int eventType = xmlResourceParser.getEventType();
        do {
            r10 = 1;
            i10 = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlResourceParser.next();
                break;
            }
            eventType = xmlResourceParser.next();
        } while (eventType != 1);
        boolean z6 = false;
        boolean z10 = false;
        String str = null;
        while (!z6) {
            if (eventType == r10) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType == i10) {
                if (!z10) {
                    String name2 = xmlResourceParser.getName();
                    boolean zEquals = name2.equals("group");
                    g gVar = fVar.f13247E;
                    if (zEquals) {
                        ?? ObtainStyledAttributes = gVar.f13275c.obtainStyledAttributes(attributeSet, a.f11624q);
                        fVar.f13248b = ObtainStyledAttributes.getResourceId(r10, 0);
                        fVar.f13249c = ObtainStyledAttributes.getInt(3, 0);
                        fVar.f13250d = ObtainStyledAttributes.getInt(4, 0);
                        fVar.f13251e = ObtainStyledAttributes.getInt(5, 0);
                        fVar.f13252f = ObtainStyledAttributes.getBoolean(2, r10);
                        fVar.f13253g = ObtainStyledAttributes.getBoolean(0, r10);
                        ObtainStyledAttributes.recycle();
                    } else if (name2.equals("item")) {
                        c cVarD = c.D(gVar.f13275c, attributeSet, a.f11625r);
                        TypedArray typedArray = (TypedArray) cVarD.f5671u;
                        fVar.f13255i = typedArray.getResourceId(2, 0);
                        fVar.j = (typedArray.getInt(5, fVar.f13249c) & (-65536)) | (typedArray.getInt(6, fVar.f13250d) & 65535);
                        fVar.f13256k = typedArray.getText(7);
                        fVar.f13257l = typedArray.getText(8);
                        fVar.f13258m = typedArray.getResourceId(0, 0);
                        String string = typedArray.getString(9);
                        fVar.f13259n = string == null ? (char) 0 : string.charAt(0);
                        fVar.f13260o = typedArray.getInt(16, 4096);
                        String string2 = typedArray.getString(10);
                        fVar.f13261p = string2 == null ? (char) 0 : string2.charAt(0);
                        fVar.f13262q = typedArray.getInt(20, 4096);
                        if (typedArray.hasValue(11)) {
                            fVar.f13263r = typedArray.getBoolean(11, false) ? 1 : 0;
                        } else {
                            fVar.f13263r = fVar.f13251e;
                        }
                        fVar.f13264s = typedArray.getBoolean(3, false);
                        fVar.f13265t = typedArray.getBoolean(4, fVar.f13252f);
                        fVar.f13266u = typedArray.getBoolean(1, fVar.f13253g);
                        fVar.f13267v = typedArray.getInt(21, -1);
                        fVar.f13270y = typedArray.getString(12);
                        fVar.f13268w = typedArray.getResourceId(13, 0);
                        fVar.f13269x = typedArray.getString(15);
                        String string3 = typedArray.getString(14);
                        boolean z11 = string3 != null;
                        if (z11 && fVar.f13268w == 0 && fVar.f13269x == null) {
                            fVar.f13271z = (o) fVar.a(string3, f13273f, gVar.f13274b);
                        } else {
                            if (z11) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            fVar.f13271z = null;
                        }
                        fVar.f13243A = typedArray.getText(17);
                        fVar.f13244B = typedArray.getText(22);
                        if (typedArray.hasValue(19)) {
                            fVar.f13246D = AbstractC0710j0.c(typedArray.getInt(19, -1), fVar.f13246D);
                            colorStateList = null;
                        } else {
                            colorStateList = null;
                            fVar.f13246D = null;
                        }
                        if (typedArray.hasValue(18)) {
                            fVar.f13245C = cVarD.u(18);
                        } else {
                            fVar.f13245C = colorStateList;
                        }
                        cVarD.J();
                        fVar.f13254h = false;
                        xmlResourceParser = xmlResourceParser;
                        r11 = 1;
                    } else if (name2.equals("menu")) {
                        r11 = 1;
                        fVar.f13254h = true;
                        SubMenu subMenuAddSubMenu = fVar.a.addSubMenu(fVar.f13248b, fVar.f13255i, fVar.j, fVar.f13256k);
                        fVar.b(subMenuAddSubMenu.getItem());
                        xmlResourceParser = xmlResourceParser;
                        b(xmlResourceParser, attributeSet, subMenuAddSubMenu);
                    } else {
                        xmlResourceParser = xmlResourceParser;
                        r11 = 1;
                        str = name2;
                        z10 = true;
                    }
                }
                r11 = r10;
                z6 = z6;
            } else if (eventType != 3) {
                r11 = r10;
                z6 = z6;
            } else {
                String name3 = xmlResourceParser.getName();
                if (z10 && name3.equals(str)) {
                    xmlResourceParser = xmlResourceParser;
                    r11 = r10;
                    z10 = false;
                    str = null;
                } else {
                    if (name3.equals("group")) {
                        fVar.f13248b = 0;
                        fVar.f13249c = 0;
                        fVar.f13250d = 0;
                        fVar.f13251e = 0;
                        fVar.f13252f = r10;
                        fVar.f13253g = r10;
                    } else if (name3.equals("item")) {
                        if (!fVar.f13254h) {
                            o oVar = fVar.f13271z;
                            if (oVar == null || !oVar.f13546b.hasSubMenu()) {
                                fVar.f13254h = r10;
                                fVar.b(fVar.a.add(fVar.f13248b, fVar.f13255i, fVar.j, fVar.f13256k));
                            } else {
                                fVar.f13254h = r10;
                                fVar.b(fVar.a.addSubMenu(fVar.f13248b, fVar.f13255i, fVar.j, fVar.f13256k).getItem());
                            }
                        }
                    } else if (name3.equals("menu")) {
                        ?? r12 = r10;
                        z6 = r12 == true ? 1 : 0;
                        r11 = r12;
                    }
                    r11 = r10;
                    z6 = z6;
                }
            }
            eventType = xmlResourceParser.next();
            r10 = r11;
            i10 = 2;
            z6 = z6;
            z10 = z10;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i10, Menu menu) {
        if (!(menu instanceof l)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z6 = false;
        try {
            try {
                layout = this.f13275c.getResources().getLayout(i10);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof l) {
                    l lVar = (l) menu;
                    if (!lVar.f13499H) {
                        lVar.y();
                        z6 = true;
                    }
                }
                b(layout, attributeSetAsAttributeSet, menu);
                if (z6) {
                    ((l) menu).x();
                }
                layout.close();
            } catch (IOException e10) {
                throw new InflateException("Error inflating menu XML", e10);
            } catch (XmlPullParserException e11) {
                throw new InflateException("Error inflating menu XML", e11);
            }
        } catch (Throwable th) {
            if (z6) {
                ((l) menu).x();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}

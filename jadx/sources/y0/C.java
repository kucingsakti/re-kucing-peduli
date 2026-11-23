package y0;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ThreadLocal f15858c = new ThreadLocal();
    public final Context a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final P f15859b;

    public C(Context context, P p10) {
        p210v8.i.f(p10, "navigatorProvider");
        this.a = context;
        this.f15859b = p10;
    }

    /* JADX WARN: Code duplicated, block: B:201:0x0380  */
    /* JADX WARN: Code duplicated, block: B:203:0x038a  */
    /* JADX WARN: Code duplicated, block: B:205:0x039d  */
    /* JADX WARN: Code duplicated, block: B:206:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:208:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:209:0x03be  */
    /* JADX WARN: Code duplicated, block: B:211:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:212:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:214:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:215:0x03da  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d0  */
    /* JADX WARN: Instruction removed from duplicated block: B:215:0x03da, please report this as an issue */
    public static C0868f c(TypedArray typedArray, Resources resources, int i10) throws XmlPullParserException {
        boolean z6;
        F f10;
        M m2;
        M m10;
        Class cls;
        boolean z10;
        M m11;
        Object objD;
        M l4;
        Class<?> componentType;
        M mB;
        Object objValueOf;
        int i11;
        M k3;
        boolean z11 = typedArray.getBoolean(3, false);
        ThreadLocal threadLocal = f15858c;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        String string = typedArray.getString(2);
        G g8 = M.f15880c;
        F f11 = M.j;
        F f12 = M.f15892p;
        F f13 = M.f15889m;
        F f14 = M.f15884g;
        F f15 = M.f15881d;
        G g10 = M.f15883f;
        G g11 = M.f15891o;
        G g12 = M.f15888l;
        G g13 = M.f15886i;
        G g14 = M.f15879b;
        if (string != null) {
            f10 = f15;
            String resourcePackageName = resources.getResourcePackageName(i10);
            if ("integer".equals(string)) {
                z6 = z11;
                m2 = g10;
                m10 = g14;
            } else {
                z6 = z11;
                if ("integer[]".equals(string)) {
                    m2 = g10;
                    m10 = f10;
                } else {
                    if ("List<Int>".equals(string)) {
                        m10 = M.f15882e;
                    } else if ("long".equals(string)) {
                        m10 = g10;
                        m2 = m10;
                    } else if ("long[]".equals(string)) {
                        m2 = g10;
                        m10 = f14;
                    } else if ("List<Long>".equals(string)) {
                        m10 = M.f15885h;
                    } else if ("boolean".equals(string)) {
                        m2 = g10;
                        m10 = g12;
                    } else if ("boolean[]".equals(string)) {
                        m2 = g10;
                        m10 = f13;
                    } else if ("List<Boolean>".equals(string)) {
                        m10 = M.f15890n;
                    } else if ("string".equals(string)) {
                        m2 = g10;
                        m10 = g11;
                    } else if ("string[]".equals(string)) {
                        m2 = g10;
                        m10 = f12;
                    } else if ("List<String>".equals(string)) {
                        m10 = M.f15893q;
                    } else if ("float".equals(string)) {
                        m10 = g13;
                    } else if ("float[]".equals(string)) {
                        m2 = g10;
                        m10 = f11;
                    } else if ("List<Float>".equals(string)) {
                        m10 = M.f15887k;
                    } else if ("reference".equals(string)) {
                        m10 = g8;
                    } else if (string.length() == 0) {
                        m2 = g10;
                        m10 = g11;
                    } else {
                        try {
                            m2 = g10;
                            String strConcat = (!L9.n.I(string, ".", false) || resourcePackageName == null) ? string : resourcePackageName.concat(string);
                            boolean zB = L9.n.B(string, "[]");
                            if (zB) {
                                strConcat = strConcat.substring(0, strConcat.length() - 2);
                                p210v8.i.e(strConcat, "substring(...)");
                            }
                            Class<?> cls2 = Class.forName(strConcat);
                            if (Parcelable.class.isAssignableFrom(cls2)) {
                                k3 = zB ? new I(cls2) : new J(cls2);
                            } else if (Enum.class.isAssignableFrom(cls2) && zB == 0) {
                                k3 = new H(cls2);
                            } else if (Serializable.class.isAssignableFrom(cls2)) {
                                k3 = zB != 0 ? new K(cls2) : new L(cls2);
                            } else {
                                k3 = null;
                            }
                            if (k3 == null) {
                                throw new IllegalArgumentException((strConcat + " is not Serializable or Parcelable.").toString());
                            }
                            m10 = k3;
                        } catch (ClassNotFoundException e10) {
                            throw new RuntimeException(e10);
                        }
                    }
                    m2 = g10;
                }
            }
        } else {
            z6 = z11;
            f10 = f15;
            m2 = g10;
            m10 = null;
        }
        if (typedArray.getValue(1, typedValue)) {
            cls = Serializable.class;
            if (m10 == g8) {
                int i12 = typedValue.resourceId;
                if (i12 != 0) {
                    i11 = i12;
                } else {
                    if (typedValue.type != 16 || typedValue.data != 0) {
                        throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + m10.b() + ". Must be a reference to a resource.");
                    }
                    i11 = 0;
                }
                objD = Integer.valueOf(i11);
            } else {
                int i13 = typedValue.resourceId;
                if (i13 == 0) {
                    if (m10 == g11) {
                        z10 = true;
                        objD = typedArray.getString(1);
                    } else {
                        z10 = true;
                        int i14 = typedValue.type;
                        if (i14 != 3) {
                            if (i14 == 4) {
                                mB = o1.f.b(typedValue, m10, g13, string, "float");
                                objValueOf = Float.valueOf(typedValue.getFloat());
                            } else if (i14 == 5) {
                                mB = o1.f.b(typedValue, m10, g14, string, "dimension");
                                objValueOf = Integer.valueOf((int) typedValue.getDimension(resources.getDisplayMetrics()));
                            } else if (i14 == 18) {
                                mB = o1.f.b(typedValue, m10, g12, string, "boolean");
                                objValueOf = Boolean.valueOf(typedValue.data != 0);
                            } else {
                                if (i14 < 16 || i14 > 31) {
                                    throw new XmlPullParserException("unsupported argument type " + typedValue.type);
                                }
                                if (m10 == g13) {
                                    mB = o1.f.b(typedValue, m10, g13, string, "float");
                                    objValueOf = Float.valueOf(typedValue.data);
                                } else {
                                    mB = o1.f.b(typedValue, m10, g14, string, "integer");
                                    objValueOf = Integer.valueOf(typedValue.data);
                                }
                            }
                            m10 = mB;
                            objD = objValueOf;
                        } else {
                            String string2 = typedValue.string.toString();
                            if (m10 == null) {
                                p210v8.i.f(string2, "value");
                                try {
                                    g14.d(string2);
                                    m10 = g14;
                                    m11 = m2;
                                } catch (IllegalArgumentException unused) {
                                    m11 = m2;
                                    try {
                                        try {
                                            try {
                                                m11.d(string2);
                                                m10 = m11;
                                            } catch (IllegalArgumentException unused2) {
                                                m10 = g11;
                                            }
                                        } catch (IllegalArgumentException unused3) {
                                            g12.d(string2);
                                            m10 = g12;
                                        }
                                    } catch (IllegalArgumentException unused4) {
                                        g13.d(string2);
                                        m10 = g13;
                                    }
                                }
                            } else {
                                m11 = m2;
                            }
                            objD = m10.d(string2);
                        }
                    }
                    m11 = m2;
                } else {
                    if (m10 != null) {
                        throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + m10.b() + ". You must use a \"reference\" type to reference other resources.");
                    }
                    objD = Integer.valueOf(i13);
                    m10 = g8;
                }
            }
            m11 = m2;
            z10 = true;
        } else {
            cls = Serializable.class;
            z10 = true;
            m11 = m2;
            objD = null;
        }
        if (objD == null) {
            objD = null;
            z10 = false;
        }
        M m12 = m10 != null ? m10 : null;
        if (m12 != null) {
            l4 = m12;
        } else if (objD instanceof Integer) {
            l4 = g14;
        } else if (objD instanceof int[]) {
            l4 = f10;
        } else if (objD instanceof Long) {
            l4 = m11;
        } else if (objD instanceof long[]) {
            l4 = f14;
        } else if (objD instanceof Float) {
            l4 = g13;
        } else if (objD instanceof float[]) {
            l4 = f11;
        } else if (objD instanceof Boolean) {
            l4 = g12;
        } else if (objD instanceof boolean[]) {
            l4 = f13;
        } else if ((objD instanceof String) || objD == null) {
            l4 = g11;
        } else if ((objD instanceof Object[]) && (((Object[]) objD) instanceof String[])) {
            l4 = f12;
        } else if (objD.getClass().isArray()) {
            Class<?> componentType2 = objD.getClass().getComponentType();
            p210v8.i.c(componentType2);
            if (Parcelable.class.isAssignableFrom(componentType2)) {
                Class<?> componentType3 = objD.getClass().getComponentType();
                p210v8.i.d(componentType3, "null cannot be cast to non-null type java.lang.Class<android.os.Parcelable>");
                l4 = new I(componentType3);
            } else if (objD.getClass().isArray()) {
                componentType = objD.getClass().getComponentType();
                p210v8.i.c(componentType);
                if (cls.isAssignableFrom(componentType)) {
                    Class<?> componentType4 = objD.getClass().getComponentType();
                    p210v8.i.d(componentType4, "null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                    l4 = new K(componentType4);
                } else if (objD instanceof Parcelable) {
                    l4 = new J(objD.getClass());
                } else if (objD instanceof Enum) {
                    l4 = new H(objD.getClass());
                } else {
                    if (objD instanceof Serializable) {
                        throw new IllegalArgumentException("Object of type " + objD.getClass().getName() + " is not supported for navigation arguments.");
                    }
                    l4 = new L(objD.getClass());
                }
            } else if (objD instanceof Parcelable) {
                l4 = new J(objD.getClass());
            } else if (objD instanceof Enum) {
                l4 = new H(objD.getClass());
            } else {
                if (objD instanceof Serializable) {
                    throw new IllegalArgumentException("Object of type " + objD.getClass().getName() + " is not supported for navigation arguments.");
                }
                l4 = new L(objD.getClass());
            }
        } else if (objD.getClass().isArray()) {
            componentType = objD.getClass().getComponentType();
            p210v8.i.c(componentType);
            if (cls.isAssignableFrom(componentType)) {
                Class<?> componentType5 = objD.getClass().getComponentType();
                p210v8.i.d(componentType5, "null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                l4 = new K(componentType5);
            } else if (objD instanceof Parcelable) {
                l4 = new J(objD.getClass());
            } else if (objD instanceof Enum) {
                l4 = new H(objD.getClass());
            } else {
                if (objD instanceof Serializable) {
                    throw new IllegalArgumentException("Object of type " + objD.getClass().getName() + " is not supported for navigation arguments.");
                }
                l4 = new L(objD.getClass());
            }
        } else if (objD instanceof Parcelable) {
            l4 = new J(objD.getClass());
        } else if (objD instanceof Enum) {
            l4 = new H(objD.getClass());
        } else {
            if (objD instanceof Serializable) {
                throw new IllegalArgumentException("Object of type " + objD.getClass().getName() + " is not supported for navigation arguments.");
            }
            l4 = new L(objD.getClass());
        }
        return new C0868f(l4, z6, objD, z10);
    }

    public final x a(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, int i10) throws XmlPullParserException, IOException {
        int depth;
        Context context;
        int i11;
        TypedArray typedArray;
        Object obj;
        String strG;
        String strG2;
        int i12 = i10;
        String name = xmlResourceParser.getName();
        p210v8.i.e(name, "parser.name");
        x xVarA = this.f15859b.b(name).a();
        Context context2 = this.a;
        xVarA.m(context2, attributeSet);
        int i13 = 1;
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == i13 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2) {
                String name2 = xmlResourceParser.getName();
                boolean zEquals = "argument".equals(name2);
                int[] iArr = p240z0.a.f16294b;
                LinkedHashMap linkedHashMap = xVarA.f16001y;
                if (zEquals) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, iArr);
                    p210v8.i.e(typedArrayObtainAttributes, "res.obtainAttributes(att… R.styleable.NavArgument)");
                    String string = typedArrayObtainAttributes.getString(0);
                    if (string == null) {
                        throw new XmlPullParserException("Arguments must have a name");
                    }
                    linkedHashMap.put(string, c(typedArrayObtainAttributes, resources, i12));
                    typedArrayObtainAttributes.recycle();
                } else if ("deepLink".equals(name2)) {
                    TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(attributeSet, p240z0.a.f16295c);
                    p210v8.i.e(typedArrayObtainAttributes2, "res.obtainAttributes(att… R.styleable.NavDeepLink)");
                    String string2 = typedArrayObtainAttributes2.getString(3);
                    String string3 = typedArrayObtainAttributes2.getString(1);
                    String string4 = typedArrayObtainAttributes2.getString(2);
                    if ((string2 == null || string2.length() == 0) && ((string3 == null || string3.length() == 0) && (string4 == null || string4.length() == 0))) {
                        throw new XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
                    }
                    String strG3 = null;
                    if (string2 != null) {
                        String packageName = context2.getPackageName();
                        p210v8.i.e(packageName, "context.packageName");
                        strG = L9.n.G(string2, "${applicationId}", packageName);
                    } else {
                        strG = null;
                    }
                    if (string3 == null || string3.length() == 0) {
                        strG2 = null;
                    } else {
                        String packageName2 = context2.getPackageName();
                        p210v8.i.e(packageName2, "context.packageName");
                        strG2 = L9.n.G(string3, "${applicationId}", packageName2);
                        if (strG2.length() <= 0) {
                            throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
                        }
                    }
                    if (string4 != null) {
                        String packageName3 = context2.getPackageName();
                        p210v8.i.e(packageName3, "context.packageName");
                        strG3 = L9.n.G(string4, "${applicationId}", packageName3);
                    }
                    t tVar = new t(strG, strG2, strG3);
                    ArrayList arrayListK = com.bumptech.glide.e.k(linkedHashMap, new w(tVar, 0));
                    if (!arrayListK.isEmpty()) {
                        throw new IllegalArgumentException(("Deep link " + strG + " can't be used to open destination " + xVarA + ".\nFollowing required arguments are missing: " + arrayListK).toString());
                    }
                    xVarA.f15999w.add(tVar);
                    typedArrayObtainAttributes2.recycle();
                } else {
                    if ("action".equals(name2)) {
                        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, p240z0.a.a, 0, 0);
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
                        C0867e c0867e = new C0867e(typedArrayObtainStyledAttributes.getResourceId(1, 0));
                        c0867e.f15914b = new D(typedArrayObtainStyledAttributes.getBoolean(4, false), typedArrayObtainStyledAttributes.getBoolean(10, false), typedArrayObtainStyledAttributes.getResourceId(7, -1), typedArrayObtainStyledAttributes.getBoolean(8, false), typedArrayObtainStyledAttributes.getBoolean(9, false), typedArrayObtainStyledAttributes.getResourceId(2, -1), typedArrayObtainStyledAttributes.getResourceId(3, -1), typedArrayObtainStyledAttributes.getResourceId(5, -1), typedArrayObtainStyledAttributes.getResourceId(6, -1));
                        Bundle bundle = new Bundle();
                        context = context2;
                        int i14 = 1;
                        int depth3 = xmlResourceParser.getDepth() + 1;
                        i11 = depth2;
                        while (true) {
                            int next2 = xmlResourceParser.next();
                            if (next2 == i14) {
                                typedArray = typedArrayObtainStyledAttributes;
                                break;
                            }
                            int depth4 = xmlResourceParser.getDepth();
                            typedArray = typedArrayObtainStyledAttributes;
                            if (depth4 < depth3 && next2 == 3) {
                                break;
                            }
                            if (next2 == 2 && depth4 <= depth3) {
                                if ("argument".equals(xmlResourceParser.getName())) {
                                    TypedArray typedArrayObtainAttributes3 = resources.obtainAttributes(attributeSet, iArr);
                                    p210v8.i.e(typedArrayObtainAttributes3, "res.obtainAttributes(att… R.styleable.NavArgument)");
                                    String string5 = typedArrayObtainAttributes3.getString(0);
                                    if (string5 == null) {
                                        throw new XmlPullParserException("Arguments must have a name");
                                    }
                                    C0868f c0868fC = c(typedArrayObtainAttributes3, resources, i12);
                                    boolean z6 = c0868fC.f15917c;
                                    if (z6 && z6 && (obj = c0868fC.f15918d) != null) {
                                        c0868fC.a.e(bundle, string5, obj);
                                    }
                                    typedArrayObtainAttributes3.recycle();
                                }
                                i12 = i10;
                            }
                            typedArrayObtainStyledAttributes = typedArray;
                            i14 = 1;
                        }
                        if (!bundle.isEmpty()) {
                            c0867e.f15915c = bundle;
                        }
                        if (xVarA instanceof C0863a) {
                            throw new UnsupportedOperationException("Cannot add action " + resourceId + " to " + xVarA + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
                        }
                        if (resourceId == 0) {
                            throw new IllegalArgumentException("Cannot have an action with actionId 0");
                        }
                        xVarA.f16000x.f(resourceId, c0867e);
                        typedArray.recycle();
                    } else {
                        context = context2;
                        i11 = depth2;
                        if ("include".equals(name2) && (xVarA instanceof z)) {
                            TypedArray typedArrayObtainAttributes4 = resources.obtainAttributes(attributeSet, Q.f15897c);
                            p210v8.i.e(typedArrayObtainAttributes4, "res.obtainAttributes(att…n.R.styleable.NavInclude)");
                            ((z) xVarA).n(b(typedArrayObtainAttributes4.getResourceId(0, 0)));
                            typedArrayObtainAttributes4.recycle();
                        } else if (xVarA instanceof z) {
                            ((z) xVarA).n(a(resources, xmlResourceParser, attributeSet, i10));
                        }
                    }
                    i12 = i10;
                    depth2 = i11;
                    context2 = context;
                }
                i13 = 1;
            }
        }
        return xVarA;
    }

    public final z b(int i10) {
        int next;
        Resources resources = this.a.getResources();
        XmlResourceParser xml = resources.getXml(i10);
        p210v8.i.e(xml, "res.getXml(graphResId)");
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            try {
                try {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } catch (Exception e10) {
                    throw new RuntimeException("Exception inflating " + resources.getResourceName(i10) + " line " + xml.getLineNumber(), e10);
                }
            } catch (Throwable th) {
                xml.close();
                throw th;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        p210v8.i.e(attributeSetAsAttributeSet, "attrs");
        x xVarA = a(resources, xml, attributeSetAsAttributeSet, i10);
        if (xVarA instanceof z) {
            z zVar = (z) xVarA;
            xml.close();
            return zVar;
        }
        throw new IllegalArgumentException(("Root element <" + name + "> did not inflate into a NavGraph").toString());
    }
}

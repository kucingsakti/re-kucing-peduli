package C0;

import A1.RunnableC0094c;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.SwitchPreference;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.Collections;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Class[] f891e = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final HashMap f892f = new HashMap();
    public final Context a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f894c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f893b = new Object[2];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String[] f895d = {Preference.class.getPackage().getName() + ".", SwitchPreference.class.getPackage().getName() + "."};

    public u(Context context, v vVar) {
        this.a = context;
        this.f894c = vVar;
    }

    public final Preference a(String str, String[] strArr, AttributeSet attributeSet) throws ClassNotFoundException {
        Class<?> cls;
        HashMap map = f892f;
        Constructor<?> constructor = (Constructor) map.get(str);
        if (constructor == null) {
            try {
                try {
                    ClassLoader classLoader = this.a.getClassLoader();
                    if (strArr == null || strArr.length == 0) {
                        cls = Class.forName(str, false, classLoader);
                    } else {
                        cls = null;
                        ClassNotFoundException e10 = null;
                        for (String str2 : strArr) {
                            try {
                                cls = Class.forName(str2 + str, false, classLoader);
                                break;
                            } catch (ClassNotFoundException e11) {
                                e10 = e11;
                            }
                        }
                        if (cls == null) {
                            if (e10 != null) {
                                throw e10;
                            }
                            throw new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                        }
                    }
                    constructor = cls.getConstructor(f891e);
                    constructor.setAccessible(true);
                    map.put(str, constructor);
                } catch (Exception e12) {
                    InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                    inflateException.initCause(e12);
                    throw inflateException;
                }
            } catch (ClassNotFoundException e13) {
                throw e13;
            }
        }
        Object[] objArr = this.f893b;
        objArr[1] = attributeSet;
        return (Preference) constructor.newInstance(objArr);
    }

    public final Preference b(String str, AttributeSet attributeSet) {
        try {
            return -1 == str.indexOf(46) ? a(str, this.f895d, attributeSet) : a(str, null, attributeSet);
        } catch (InflateException e10) {
            throw e10;
        } catch (ClassNotFoundException e11) {
            InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class (not found)" + str);
            inflateException.initCause(e11);
            throw inflateException;
        } catch (Exception e12) {
            InflateException inflateException2 = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
            inflateException2.initCause(e12);
            throw inflateException2;
        }
    }

    public final PreferenceGroup c(XmlResourceParser xmlResourceParser) {
        int next;
        PreferenceGroup preferenceGroup;
        synchronized (this.f893b) {
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
            this.f893b[0] = this.a;
            do {
                try {
                    try {
                        next = xmlResourceParser.next();
                        if (next == 2) {
                            break;
                        }
                    } catch (InflateException e10) {
                        throw e10;
                    }
                } catch (IOException e11) {
                    InflateException inflateException = new InflateException(xmlResourceParser.getPositionDescription() + ": " + e11.getMessage());
                    inflateException.initCause(e11);
                    throw inflateException;
                } catch (XmlPullParserException e12) {
                    InflateException inflateException2 = new InflateException(e12.getMessage());
                    inflateException2.initCause(e12);
                    throw inflateException2;
                }
            } while (next != 1);
            if (next != 2) {
                throw new InflateException(xmlResourceParser.getPositionDescription() + ": No start tag found!");
            }
            preferenceGroup = (PreferenceGroup) b(xmlResourceParser.getName(), attributeSetAsAttributeSet);
            preferenceGroup.p(this.f894c);
            d(xmlResourceParser, preferenceGroup, attributeSetAsAttributeSet);
        }
        return preferenceGroup;
    }

    public final void d(XmlResourceParser xmlResourceParser, Preference preference, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        long jC;
        int depth = xmlResourceParser.getDepth();
        while (true) {
            int next = xmlResourceParser.next();
            if ((next == 3 && xmlResourceParser.getDepth() <= depth) || next == 1) {
                return;
            }
            if (next == 2) {
                String name = xmlResourceParser.getName();
                if ("intent".equals(name)) {
                    try {
                        preference.f6807E = Intent.parseIntent(this.a.getResources(), xmlResourceParser, attributeSet);
                    } catch (IOException e10) {
                        XmlPullParserException xmlPullParserException = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException.initCause(e10);
                        throw xmlPullParserException;
                    }
                } else if ("extra".equals(name)) {
                    Resources resources = this.a.getResources();
                    if (preference.f6809G == null) {
                        preference.f6809G = new Bundle();
                    }
                    resources.parseBundleExtra("extra", attributeSet, preference.f6809G);
                    try {
                        int depth2 = xmlResourceParser.getDepth();
                        while (true) {
                            int next2 = xmlResourceParser.next();
                            if (next2 == 1 || (next2 == 3 && xmlResourceParser.getDepth() <= depth2)) {
                                break;
                            }
                        }
                    } catch (IOException e11) {
                        XmlPullParserException xmlPullParserException2 = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException2.initCause(e11);
                        throw xmlPullParserException2;
                    }
                } else {
                    Preference preferenceB = b(name, attributeSet);
                    PreferenceGroup preferenceGroup = (PreferenceGroup) preference;
                    if (!preferenceGroup.f6840g0.contains(preferenceB)) {
                        if (preferenceB.f6806D != null) {
                            PreferenceGroup preferenceGroup2 = preferenceGroup;
                            while (true) {
                                PreferenceGroup preferenceGroup3 = preferenceGroup2.f6828a0;
                                if (preferenceGroup3 == null) {
                                    break;
                                } else {
                                    preferenceGroup2 = preferenceGroup3;
                                }
                            }
                            preferenceGroup2.C(preferenceB.f6806D);
                        }
                        int i10 = preferenceB.f6838y;
                        if (i10 == Integer.MAX_VALUE) {
                            if (preferenceGroup.f6841h0) {
                                int i11 = preferenceGroup.f6842i0;
                                preferenceGroup.f6842i0 = i11 + 1;
                                if (i11 != i10) {
                                    preferenceB.f6838y = i11;
                                    t tVar = preferenceB.f6826Y;
                                    if (tVar != null) {
                                        Handler handler = tVar.f889h;
                                        RunnableC0094c runnableC0094c = tVar.f890i;
                                        handler.removeCallbacks(runnableC0094c);
                                        handler.post(runnableC0094c);
                                    }
                                }
                            }
                            if (preferenceB instanceof PreferenceGroup) {
                                ((PreferenceGroup) preferenceB).f6841h0 = preferenceGroup.f6841h0;
                            }
                        }
                        int iBinarySearch = Collections.binarySearch(preferenceGroup.f6840g0, preferenceB);
                        if (iBinarySearch < 0) {
                            iBinarySearch = (iBinarySearch * (-1)) - 1;
                        }
                        boolean zA = preferenceGroup.A();
                        if (preferenceB.f6816N == zA) {
                            preferenceB.f6816N = !zA;
                            preferenceB.n(preferenceB.A());
                            preferenceB.m();
                        }
                        synchronized (preferenceGroup) {
                            preferenceGroup.f6840g0.add(iBinarySearch, preferenceB);
                        }
                        v vVar = preferenceGroup.f6833t;
                        String str = preferenceB.f6806D;
                        if (str == null || !preferenceGroup.f0.containsKey(str)) {
                            jC = vVar.c();
                        } else {
                            jC = ((Long) preferenceGroup.f0.get(str)).longValue();
                            preferenceGroup.f0.remove(str);
                        }
                        preferenceB.f6834u = jC;
                        preferenceB.f6835v = true;
                        try {
                            preferenceB.p(vVar);
                            preferenceB.f6835v = false;
                            if (preferenceB.f6828a0 != null) {
                                throw new IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
                            }
                            preferenceB.f6828a0 = preferenceGroup;
                            if (preferenceGroup.f6843j0) {
                                preferenceB.o();
                            }
                            t tVar2 = preferenceGroup.f6826Y;
                            if (tVar2 != null) {
                                Handler handler2 = tVar2.f889h;
                                RunnableC0094c runnableC0094c2 = tVar2.f890i;
                                handler2.removeCallbacks(runnableC0094c2);
                                handler2.post(runnableC0094c2);
                            }
                        } catch (Throwable th) {
                            preferenceB.f6835v = false;
                            throw th;
                        }
                    }
                    d(xmlResourceParser, preferenceB, attributeSet);
                }
            }
        }
    }
}

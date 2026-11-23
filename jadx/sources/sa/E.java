package sa;

import com.unity3d.services.core.device.MimeTypes;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class E implements Cloneable {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final HashMap f14803B = new HashMap();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final String[] f14804C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final String[] f14805D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final String[] f14806E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final String[] f14807F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final String[] f14808G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final String[] f14809H;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f14811s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f14812t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f14813u = true;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f14814v = true;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f14815w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f14816x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f14817y = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f14818z = false;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f14810A = false;

    static {
        String[] strArr = {com.onesignal.inAppMessages.internal.d.HTML, "head", "body", "frameset", "script", "noscript", "style", "meta", "link", "title", "frame", "noframes", "section", "nav", "aside", "hgroup", "header", "footer", R5.a.PUSH_MINIFIED_BUTTON_ICON, "h1", "h2", "h3", "h4", "h5", "h6", "ul", "ol", "pre", "div", "blockquote", "hr", "address", "figure", "figcaption", "form", "fieldset", "ins", "del", "dl", "dt", "dd", "li", "table", "caption", "thead", "tfoot", "tbody", "colgroup", "col", "tr", "th", "td", MimeTypes.BASE_TYPE_VIDEO, MimeTypes.BASE_TYPE_AUDIO, "canvas", "details", "menu", "plaintext", "template", "article", "main", "svg", "math", "center", "template", "dir", "applet", "marquee", "listing"};
        f14804C = new String[]{"object", "base", "font", "tt", "i", "b", "u", "big", "small", "em", "strong", "dfn", "code", "samp", "kbd", "var", "cite", "abbr", p084i6.e.TIME, "acronym", "mark", "ruby", "rt", "rp", R5.a.PUSH_ADDITIONAL_DATA_KEY, "img", "br", "wbr", "map", "q", "sub", "sup", "bdo", "iframe", "embed", "span", "input", "select", "textarea", "label", "button", "optgroup", "option", "legend", "datalist", "keygen", "output", "progress", "meter", "area", "param", "source", "track", "summary", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track", JsonStorageKeyNames.DATA_KEY, "bdi", "s", "strike", "nobr"};
        f14805D = new String[]{"meta", "link", "base", "frame", "img", "br", "wbr", "embed", "hr", "input", "keygen", "col", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track"};
        f14806E = new String[]{"title", R5.a.PUSH_ADDITIONAL_DATA_KEY, R5.a.PUSH_MINIFIED_BUTTON_ICON, "h1", "h2", "h3", "h4", "h5", "h6", "pre", "address", "li", "th", "td", "script", "style", "ins", "del", "s"};
        f14807F = new String[]{"pre", "plaintext", "title", "textarea"};
        f14808G = new String[]{"button", "fieldset", "input", "keygen", "object", "output", "select", "textarea"};
        f14809H = new String[]{"input", "keygen", "object", "select", "textarea"};
        for (int i10 = 0; i10 < 69; i10++) {
            E e10 = new E(strArr[i10]);
            f14803B.put(e10.f14811s, e10);
        }
        for (String str : f14804C) {
            E e11 = new E(str);
            e11.f14813u = false;
            e11.f14814v = false;
            f14803B.put(e11.f14811s, e11);
        }
        for (String str2 : f14805D) {
            E e12 = (E) f14803B.get(str2);
            qa.b.w(e12);
            e12.f14815w = true;
        }
        for (String str3 : f14806E) {
            E e13 = (E) f14803B.get(str3);
            qa.b.w(e13);
            e13.f14814v = false;
        }
        for (String str4 : f14807F) {
            E e14 = (E) f14803B.get(str4);
            qa.b.w(e14);
            e14.f14817y = true;
        }
        for (String str5 : f14808G) {
            E e15 = (E) f14803B.get(str5);
            qa.b.w(e15);
            e15.f14818z = true;
        }
        for (String str6 : f14809H) {
            E e16 = (E) f14803B.get(str6);
            qa.b.w(e16);
            e16.f14810A = true;
        }
    }

    public E(String str) {
        this.f14811s = str;
        this.f14812t = J7.j.t(str);
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final E clone() {
        try {
            return (E) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        E e10 = (E) obj;
        return this.f14811s.equals(e10.f14811s) && this.f14815w == e10.f14815w && this.f14814v == e10.f14814v && this.f14813u == e10.f14813u && this.f14817y == e10.f14817y && this.f14816x == e10.f14816x && this.f14818z == e10.f14818z && this.f14810A == e10.f14810A;
    }

    public final int hashCode() {
        return (((((((((((((this.f14811s.hashCode() * 31) + (this.f14813u ? 1 : 0)) * 31) + (this.f14814v ? 1 : 0)) * 31) + (this.f14815w ? 1 : 0)) * 31) + (this.f14816x ? 1 : 0)) * 31) + (this.f14817y ? 1 : 0)) * 31) + (this.f14818z ? 1 : 0)) * 31) + (this.f14810A ? 1 : 0);
    }

    public final String toString() {
        return this.f14811s;
    }
}

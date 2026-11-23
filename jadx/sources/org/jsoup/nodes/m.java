package org.jsoup.nodes;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {
    public static final char[] a = {',', ';'};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f13892b = new HashMap();

    static {
        l lVar = l.xhtml;
        Charset charset = qa.a.a;
        new ThreadLocal();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    public static void a(Appendable appendable, l lVar, int i10) throws IOException {
        String str;
        int iBinarySearch = Arrays.binarySearch(lVar.f13890u, i10);
        if (iBinarySearch >= 0) {
            String[] strArr = lVar.f13891v;
            if (iBinarySearch < strArr.length - 1) {
                int i11 = iBinarySearch + 1;
                if (lVar.f13890u[i11] == i10) {
                    str = strArr[i11];
                } else {
                    str = strArr[iBinarySearch];
                }
            } else {
                str = strArr[iBinarySearch];
            }
        } else {
            str = "";
        }
        if ("".equals(str)) {
            appendable.append("&#x").append(Integer.toHexString(i10)).append(';');
        } else {
            appendable.append('&').append(str).append(';');
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0056  */
    /* JADX WARN: Code duplicated, block: B:54:0x0094  */
    /* JADX WARN: Code duplicated, block: B:74:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f4  */
    public static void b(Appendable appendable, String str, g gVar, boolean z6, boolean z10, boolean z11, boolean z12) throws IOException {
        String str2;
        char c10;
        l lVar = gVar.f13866s;
        CharsetEncoder charsetEncoderC = (CharsetEncoder) gVar.f13868u.get();
        if (charsetEncoderC == null) {
            charsetEncoderC = gVar.c();
        }
        int i10 = gVar.f13869v;
        int length = str.length();
        int iCharCount = 0;
        boolean z13 = false;
        boolean zCanEncode = false;
        boolean z14 = false;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            zCanEncode = true;
            if (z10) {
                if (!ra.a.e(iCodePointAt)) {
                    if (z13) {
                        appendable.append(' ');
                        z13 = false;
                    }
                    z14 = false;
                    if (iCodePointAt < 65536) {
                        c10 = (char) iCodePointAt;
                        if (c10 != '\t') {
                            appendable.append(c10);
                        } else {
                            appendable.append(c10);
                        }
                    } else {
                        str2 = new String(Character.toChars(iCodePointAt));
                        if (charsetEncoderC.canEncode(str2)) {
                            appendable.append(str2);
                        } else {
                            a(appendable, lVar, iCodePointAt);
                        }
                    }
                } else if ((!z11 || zCanEncode) && !z14) {
                    if (z12) {
                        z13 = true;
                    } else {
                        appendable.append(' ');
                        z14 = true;
                    }
                }
            } else if (iCodePointAt < 65536) {
                c10 = (char) iCodePointAt;
                if (c10 != '\t' || c10 == '\n' || c10 == '\r') {
                    appendable.append(c10);
                } else if (c10 != '\"') {
                    if (c10 == '&') {
                        appendable.append("&amp;");
                    } else if (c10 != '<') {
                        if (c10 != '>') {
                            if (c10 != 160) {
                                if (c10 < ' ') {
                                    a(appendable, lVar, iCodePointAt);
                                } else {
                                    int iD = p239z.e.d(i10);
                                    if (iD != 0) {
                                        if (iD != 1) {
                                            zCanEncode = charsetEncoderC.canEncode(c10);
                                        }
                                    } else if (c10 >= 128) {
                                        zCanEncode = false;
                                    }
                                    if (zCanEncode) {
                                        appendable.append(c10);
                                    } else {
                                        a(appendable, lVar, iCodePointAt);
                                    }
                                }
                            } else if (lVar != l.xhtml) {
                                appendable.append("&nbsp;");
                            } else {
                                appendable.append("&#xa0;");
                            }
                        } else if (z6) {
                            appendable.append(c10);
                        } else {
                            appendable.append("&gt;");
                        }
                    } else if (!z6 || lVar == l.xhtml || gVar.f13873z == 2) {
                        appendable.append("&lt;");
                    } else {
                        appendable.append(c10);
                    }
                } else if (z6) {
                    appendable.append("&quot;");
                } else {
                    appendable.append(c10);
                }
            } else {
                str2 = new String(Character.toChars(iCodePointAt));
                if (charsetEncoderC.canEncode(str2)) {
                    appendable.append(str2);
                } else {
                    a(appendable, lVar, iCodePointAt);
                }
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
    }
}

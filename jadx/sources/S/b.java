package S;

import A1.J;
import android.text.SpannableStringBuilder;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f4496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f4497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f4498d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f4499e;
    public final boolean a;

    static {
        J j = k.f4504c;
        f4496b = Character.toString((char) 8206);
        f4497c = Character.toString((char) 8207);
        f4498d = new b(false);
        f4499e = new b(true);
    }

    public b(boolean z6) {
        J j = k.a;
        this.a = z6;
    }

    public static int a(CharSequence charSequence) {
        byte directionality;
        a aVar = new a(charSequence);
        aVar.f4494c = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int i13 = aVar.f4494c;
            if (i13 < aVar.f4493b && i10 == 0) {
                CharSequence charSequence2 = aVar.a;
                char cCharAt = charSequence2.charAt(i13);
                aVar.f4495d = cCharAt;
                if (Character.isHighSurrogate(cCharAt)) {
                    int iCodePointAt = Character.codePointAt(charSequence2, aVar.f4494c);
                    aVar.f4494c = Character.charCount(iCodePointAt) + aVar.f4494c;
                    directionality = Character.getDirectionality(iCodePointAt);
                } else {
                    aVar.f4494c++;
                    char c10 = aVar.f4495d;
                    directionality = c10 < 1792 ? a.f4492e[c10] : Character.getDirectionality(c10);
                }
                if (directionality != 0) {
                    if (directionality == 1 || directionality == 2) {
                        if (i12 == 0) {
                            return 1;
                        }
                    } else if (directionality != 9) {
                        switch (directionality) {
                            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                            case 15:
                                i12++;
                                i11 = -1;
                                continue;
                            case 16:
                            case 17:
                                i12++;
                                i11 = 1;
                                continue;
                            case 18:
                                i12--;
                                i11 = 0;
                                continue;
                        }
                    }
                } else if (i12 == 0) {
                    return -1;
                }
                i10 = i12;
            }
        }
        if (i10 != 0) {
            if (i11 == 0) {
                while (aVar.f4494c > 0) {
                    switch (aVar.a()) {
                        case UrlRequest.Status.READING_RESPONSE /* 14 */:
                        case 15:
                            if (i10 == i12) {
                                return -1;
                            }
                            i12--;
                            break;
                        case 16:
                        case 17:
                            if (i10 == i12) {
                                return 1;
                            }
                            i12--;
                            break;
                        case 18:
                            i12++;
                            break;
                        default:
                            break;
                    }
                }
            } else {
                return i11;
            }
        }
        return 0;
    }

    public static int b(CharSequence charSequence) {
        a aVar = new a(charSequence);
        aVar.f4494c = aVar.f4493b;
        int i10 = 0;
        while (true) {
            int i11 = i10;
            while (aVar.f4494c > 0) {
                byte bA = aVar.a();
                if (bA == 0) {
                    if (i10 == 0) {
                        return -1;
                    }
                    if (i11 == 0) {
                    }
                } else if (bA == 1 || bA == 2) {
                    if (i10 == 0) {
                        return 1;
                    }
                    if (i11 == 0) {
                    }
                } else if (bA != 9) {
                    switch (bA) {
                        case UrlRequest.Status.READING_RESPONSE /* 14 */:
                        case 15:
                            if (i11 == i10) {
                                return -1;
                            }
                            i10--;
                            break;
                        case 16:
                        case 17:
                            if (i11 == i10) {
                                return 1;
                            }
                            i10--;
                            break;
                        case 18:
                            i10++;
                            break;
                        default:
                            if (i11 != 0) {
                            }
                            break;
                    }
                } else {
                    continue;
                }
            }
            return 0;
        }
    }

    public final SpannableStringBuilder c(CharSequence charSequence) {
        String str;
        J j = k.f4504c;
        if (charSequence == null) {
            return null;
        }
        boolean zI = j.i(charSequence.length(), charSequence);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean zI2 = (zI ? k.f4503b : k.a).i(charSequence.length(), charSequence);
        String str2 = "";
        String str3 = f4497c;
        String str4 = f4496b;
        boolean z6 = this.a;
        if (z6 || !(zI2 || a(charSequence) == 1)) {
            str = (!z6 || (zI2 && a(charSequence) != -1)) ? "" : str3;
        } else {
            str = str4;
        }
        spannableStringBuilder.append((CharSequence) str);
        if (zI != z6) {
            spannableStringBuilder.append(zI ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean zI3 = (zI ? k.f4503b : k.a).i(charSequence.length(), charSequence);
        if (!z6 && (zI3 || b(charSequence) == 1)) {
            str2 = str4;
        } else if (z6 && (!zI3 || b(charSequence) == -1)) {
            str2 = str3;
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }
}

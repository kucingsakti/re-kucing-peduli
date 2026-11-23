package p047e9;

import org.chromium.net.UrlRequest;
import p104k9.o;

/* JADX INFO: renamed from: e9.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0611c implements o {
    BYTE(0),
    CHAR(1),
    SHORT(2),
    INT(3),
    LONG(4),
    FLOAT(5),
    DOUBLE(6),
    BOOLEAN(7),
    STRING(8),
    CLASS(9),
    ENUM(10),
    ANNOTATION(11),
    ARRAY(12);


    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f11004s;

    EnumC0611c(int i10) {
        this.f11004s = i10;
    }

    public static EnumC0611c f(int i10) {
        switch (i10) {
            case 0:
                return BYTE;
            case 1:
                return CHAR;
            case 2:
                return SHORT;
            case 3:
                return INT;
            case 4:
                return LONG;
            case 5:
                return FLOAT;
            case 6:
                return DOUBLE;
            case 7:
                return BOOLEAN;
            case 8:
                return STRING;
            case 9:
                return CLASS;
            case 10:
                return ENUM;
            case 11:
                return ANNOTATION;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return ARRAY;
            default:
                return null;
        }
    }

    @Override // p104k9.o
    public final int getNumber() {
        return this.f11004s;
    }
}

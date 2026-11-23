package org.jsoup;

import E0.a;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class UnsupportedMimeTypeException extends IOException {
    @Override // java.lang.Throwable
    public final String toString() {
        return a.l(new StringBuilder(), super.toString(), ". Mimetype=null, URL=null");
    }
}

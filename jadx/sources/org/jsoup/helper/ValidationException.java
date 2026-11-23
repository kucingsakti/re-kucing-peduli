package org.jsoup.helper;

import java.util.ArrayList;
import qa.b;

/* JADX INFO: loaded from: classes.dex */
public class ValidationException extends IllegalArgumentException {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f13852s = b.class.getName();

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        try {
            super.fillInStackTrace();
            StackTraceElement[] stackTrace = getStackTrace();
            ArrayList arrayList = new ArrayList();
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (!stackTraceElement.getClassName().equals(f13852s)) {
                    arrayList.add(stackTraceElement);
                }
            }
            setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }
}

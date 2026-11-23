package com.google.gson;

import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {
    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            A4.b bVar = new A4.b(stringWriter);
            bVar.f315w = true;
            com.google.gson.internal.bind.e.f10099z.c(bVar, this);
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}

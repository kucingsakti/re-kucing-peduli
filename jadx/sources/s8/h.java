package s8;

import K9.k;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.nio.charset.Charset;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class h extends com.bumptech.glide.d {
    public static void B(File file) {
        i.f(file, "<this>");
        e eVar = new e(new k(file));
        while (true) {
            boolean z6 = true;
            while (eVar.hasNext()) {
                File file2 = (File) eVar.next();
                if (file2.delete() || !file2.exists()) {
                    if (z6) {
                    }
                }
                z6 = false;
            }
            return;
        }
    }

    public static String C(File file) {
        String name = file.getName();
        i.e(name, "getName(...)");
        return L9.f.h0(name, name);
    }

    public static String D(File file) throws IOException {
        Charset charset = L9.a.a;
        i.f(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[8192];
            for (int i10 = inputStreamReader.read(cArr); i10 >= 0; i10 = inputStreamReader.read(cArr)) {
                stringWriter.write(cArr, 0, i10);
            }
            String string = stringWriter.toString();
            i.e(string, "toString(...)");
            inputStreamReader.close();
            return string;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                com.bumptech.glide.c.c(inputStreamReader, th);
                throw th2;
            }
        }
    }
}

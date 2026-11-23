package E1;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import p188t1.Y;

/* JADX INFO: renamed from: E1.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0183e implements com.bumptech.glide.load.data.e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f1304s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Comparable f1305t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Object f1306u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f1307v;

    public /* synthetic */ C0183e(int i10, Comparable comparable, Object obj) {
        this.f1304s = i10;
        this.f1305t = comparable;
        this.f1306u = obj;
    }

    public static C0183e e(Context context, Uri uri, p241z1.b bVar) {
        return new C0183e(2, uri, new p241z1.c(com.bumptech.glide.b.b(context).f7589u.a().f(), bVar, com.bumptech.glide.b.b(context).f7590v, context.getContentResolver()));
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        switch (this.f1304s) {
            case 0:
                ((B) this.f1306u).getClass();
                return InputStream.class;
            case 1:
                return ((B) this.f1306u).c();
            default:
                return InputStream.class;
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void b() {
        switch (this.f1304s) {
            case 0:
                try {
                    ((ByteArrayInputStream) this.f1307v).close();
                } catch (IOException unused) {
                    return;
                }
                break;
            case 1:
                Object obj = this.f1307v;
                if (obj != null) {
                    try {
                        switch (((B) this.f1306u).f1292s) {
                            case 8:
                                ((ParcelFileDescriptor) obj).close();
                                break;
                            default:
                                ((InputStream) obj).close();
                                break;
                        }
                    } catch (IOException unused2) {
                        return;
                    }
                }
                break;
            default:
                InputStream inputStream = (InputStream) this.f1307v;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused3) {
                        return;
                    }
                }
                break;
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final int c() {
        switch (this.f1304s) {
        }
        return 1;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
        int i10 = this.f1304s;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void d(com.bumptech.glide.g gVar, com.bumptech.glide.load.data.d dVar) throws Throwable {
        Object objOpen;
        switch (this.f1304s) {
            case 0:
                try {
                    ByteArrayInputStream byteArrayInputStreamB = B.b((String) this.f1305t);
                    this.f1307v = byteArrayInputStreamB;
                    dVar.g(byteArrayInputStreamB);
                } catch (IllegalArgumentException e10) {
                    dVar.f(e10);
                }
                break;
            case 1:
                try {
                    B b3 = (B) this.f1306u;
                    File file = (File) this.f1305t;
                    switch (b3.f1292s) {
                        case 8:
                            objOpen = ParcelFileDescriptor.open(file, 268435456);
                            break;
                        default:
                            objOpen = new FileInputStream(file);
                            break;
                    }
                    this.f1307v = objOpen;
                    dVar.g(objOpen);
                } catch (FileNotFoundException e11) {
                    Log.isLoggable("FileLoader", 3);
                    dVar.f(e11);
                    return;
                }
                break;
            default:
                try {
                    InputStream inputStreamI = i();
                    this.f1307v = inputStreamI;
                    dVar.g(inputStreamI);
                } catch (FileNotFoundException e12) {
                    Log.isLoggable("MediaStoreThumbFetcher", 3);
                    dVar.f(e12);
                    return;
                }
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0046  */
    /* JADX WARN: Code duplicated, block: B:25:0x0048  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:68:0x009a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x008c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    public InputStream i() throws Throwable {
        Cursor cursorA;
        String string;
        boolean zIsEmpty;
        ContentResolver contentResolver;
        File file;
        InputStream inputStreamOpenInputStream;
        int iM;
        Uri uri = (Uri) this.f1305t;
        p241z1.c cVar = (p241z1.c) this.f1306u;
        Cursor cursor = null;
        inputStreamOpenInputStream = null;
        InputStream inputStreamOpenInputStream2 = null;
        try {
            cursorA = cVar.a.a(uri);
            if (cursorA != null) {
                try {
                    try {
                        if (cursorA.moveToFirst()) {
                            string = cursorA.getString(0);
                            cursorA.close();
                        }
                    } catch (SecurityException unused) {
                        if (Log.isLoggable("ThumbStreamOpener", 3)) {
                            Objects.toString(uri);
                        }
                        if (cursorA != null) {
                        }
                        string = null;
                        zIsEmpty = TextUtils.isEmpty(string);
                        contentResolver = cVar.f16302c;
                        if (zIsEmpty) {
                            inputStreamOpenInputStream = null;
                        } else {
                            file = new File(string);
                            if (file.exists()) {
                                inputStreamOpenInputStream = null;
                            } else {
                                inputStreamOpenInputStream = null;
                            }
                        }
                        if (inputStreamOpenInputStream != null) {
                            try {
                                try {
                                    inputStreamOpenInputStream2 = contentResolver.openInputStream(uri);
                                    iM = Y.m(cVar.f16303d, inputStreamOpenInputStream2, cVar.f16301b);
                                    if (inputStreamOpenInputStream2 != null) {
                                        try {
                                            inputStreamOpenInputStream2.close();
                                        } catch (IOException unused2) {
                                        }
                                    }
                                } catch (IOException | NullPointerException unused3) {
                                    if (Log.isLoggable("ThumbStreamOpener", 3)) {
                                        Objects.toString(uri);
                                    }
                                    if (inputStreamOpenInputStream2 != null) {
                                        try {
                                            inputStreamOpenInputStream2.close();
                                        } catch (IOException unused4) {
                                        }
                                    }
                                    iM = -1;
                                    if (iM != -1) {
                                        return new com.bumptech.glide.load.data.i(inputStreamOpenInputStream, iM);
                                    }
                                    return inputStreamOpenInputStream;
                                }
                            } catch (Throwable th) {
                                if (inputStreamOpenInputStream2 != null) {
                                    try {
                                        inputStreamOpenInputStream2.close();
                                    } catch (IOException unused5) {
                                    }
                                }
                                throw th;
                            }
                        } else {
                            iM = -1;
                        }
                        if (iM != -1) {
                            return new com.bumptech.glide.load.data.i(inputStreamOpenInputStream, iM);
                        }
                        return inputStreamOpenInputStream;
                    }
                    zIsEmpty = TextUtils.isEmpty(string);
                    contentResolver = cVar.f16302c;
                    if (zIsEmpty) {
                        inputStreamOpenInputStream = null;
                    } else {
                        file = new File(string);
                        if (file.exists() || 0 >= file.length()) {
                            inputStreamOpenInputStream = null;
                        } else {
                            Uri uriFromFile = Uri.fromFile(file);
                            try {
                                inputStreamOpenInputStream = contentResolver.openInputStream(uriFromFile);
                            } catch (NullPointerException e10) {
                                throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + uriFromFile).initCause(e10));
                            }
                        }
                    }
                    if (inputStreamOpenInputStream != null) {
                        inputStreamOpenInputStream2 = contentResolver.openInputStream(uri);
                        iM = Y.m(cVar.f16303d, inputStreamOpenInputStream2, cVar.f16301b);
                        if (inputStreamOpenInputStream2 != null) {
                            inputStreamOpenInputStream2.close();
                        }
                    } else {
                        iM = -1;
                    }
                    if (iM != -1) {
                        return new com.bumptech.glide.load.data.i(inputStreamOpenInputStream, iM);
                    }
                    return inputStreamOpenInputStream;
                } catch (Throwable th2) {
                    th = th2;
                    cursor = cursorA;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursorA != null) {
                cursorA.close();
            }
        } catch (SecurityException unused6) {
            cursorA = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        string = null;
        zIsEmpty = TextUtils.isEmpty(string);
        contentResolver = cVar.f16302c;
        if (zIsEmpty) {
            inputStreamOpenInputStream = null;
        } else {
            file = new File(string);
            if (file.exists()) {
                inputStreamOpenInputStream = null;
            } else {
                inputStreamOpenInputStream = null;
            }
        }
        if (inputStreamOpenInputStream != null) {
            inputStreamOpenInputStream2 = contentResolver.openInputStream(uri);
            iM = Y.m(cVar.f16303d, inputStreamOpenInputStream2, cVar.f16301b);
            if (inputStreamOpenInputStream2 != null) {
                inputStreamOpenInputStream2.close();
            }
        } else {
            iM = -1;
        }
        if (iM != -1) {
            return new com.bumptech.glide.load.data.i(inputStreamOpenInputStream, iM);
        }
        return inputStreamOpenInputStream;
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void h() {
    }
}

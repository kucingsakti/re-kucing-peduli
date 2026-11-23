package p205v2;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends zzz {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15412c;

    public c(byte[] bArr) {
        Preconditions.b(bArr.length == 25);
        this.f15412c = Arrays.hashCode(bArr);
    }

    public static byte[] h0(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // com.google.android.gms.common.internal.zzaa
    public final int c() {
        return this.f15412c;
    }

    @Override // com.google.android.gms.common.internal.zzaa
    public final IObjectWrapper d() {
        return new ObjectWrapper(i0());
    }

    public final boolean equals(Object obj) {
        IObjectWrapper iObjectWrapperD;
        if (obj == null || !(obj instanceof zzaa)) {
            return false;
        }
        try {
            zzaa zzaaVar = (zzaa) obj;
            if (zzaaVar.c() == this.f15412c && (iObjectWrapperD = zzaaVar.d()) != null) {
                return Arrays.equals(i0(), (byte[]) ObjectWrapper.i0(iObjectWrapperD));
            }
            return false;
        } catch (RemoteException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return this.f15412c;
    }

    public abstract byte[] i0();
}

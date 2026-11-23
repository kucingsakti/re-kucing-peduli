package R;

import A1.l;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p040e1.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final O3.i a = new O3.i(2);

    public static l a(Context context, Fa.e eVar) {
        Cursor cursorF;
        PackageManager packageManager = context.getPackageManager();
        Resources resources = context.getResources();
        String str = (String) eVar.f1659t;
        ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
        if (providerInfoResolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException(E0.a.h("No package found for authority: ", str));
        }
        String str2 = providerInfoResolveContentProvider.packageName;
        String str3 = (String) eVar.f1660u;
        if (!str2.equals(str3)) {
            throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str3);
        }
        Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        O3.i iVar = a;
        Collections.sort(arrayList, iVar);
        List listL = (List) eVar.f1662w;
        if (listL == null) {
            listL = K.b.l(resources, 0);
        }
        int i10 = 0;
        loop1: while (true) {
            cursorF = null;
            if (i10 >= listL.size()) {
                providerInfoResolveContentProvider = null;
                break;
            }
            ArrayList arrayList2 = new ArrayList((Collection) listL.get(i10));
            Collections.sort(arrayList2, iVar);
            if (arrayList.size() == arrayList2.size()) {
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList.size()) {
                        break loop1;
                    }
                    if (!Arrays.equals((byte[]) arrayList.get(i11), (byte[]) arrayList2.get(i11))) {
                        break;
                    }
                    i11++;
                }
            }
            i10++;
        }
        if (providerInfoResolveContentProvider == null) {
            return new l(1, (h[]) null);
        }
        String str4 = providerInfoResolveContentProvider.authority;
        ArrayList arrayList3 = new ArrayList();
        Uri uriBuild = new Uri.Builder().scheme("content").authority(str4).build();
        Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str4).appendPath("file").build();
        b dVar = Build.VERSION.SDK_INT < 24 ? new P0.d(context, uriBuild) : new j(context, uriBuild);
        try {
            cursorF = dVar.f(uriBuild, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, new String[]{(String) eVar.f1661v});
            if (cursorF != null && cursorF.getCount() > 0) {
                int columnIndex = cursorF.getColumnIndex("result_code");
                arrayList3 = new ArrayList();
                int columnIndex2 = cursorF.getColumnIndex("_id");
                int columnIndex3 = cursorF.getColumnIndex("file_id");
                int columnIndex4 = cursorF.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursorF.getColumnIndex("font_weight");
                int columnIndex6 = cursorF.getColumnIndex("font_italic");
                while (cursorF.moveToNext()) {
                    arrayList3.add(new h(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorF.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorF.getLong(columnIndex3)), columnIndex4 != -1 ? cursorF.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorF.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorF.getInt(columnIndex6) == 1, columnIndex != -1 ? cursorF.getInt(columnIndex) : 0));
                }
            }
            return new l(0, (h[]) arrayList3.toArray(new h[0]));
        } finally {
            if (cursorF != null) {
                cursorF.close();
            }
            dVar.close();
        }
    }
}

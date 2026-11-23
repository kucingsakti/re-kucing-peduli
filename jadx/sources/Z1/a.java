package Z1;

import L9.n;
import android.hardware.Camera;
import android.media.MediaDrm;
import android.os.Build;
import c2.b;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p076h8.f;
import p076h8.g;
import p086i8.l;
import p086i8.m;
import p086i8.q;
import p210v8.i;
import p210v8.k;
import p210v8.t;
import s8.h;

/* JADX INFO: loaded from: classes.dex */
public final class a extends k implements p200u8.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f5829s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, int i10) {
        super(0);
        this.f5829s = i10;
    }

    /* JADX WARN: Code duplicated, block: B:151:0x0359 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:152:0x035b  */
    /* JADX WARN: Code duplicated, block: B:153:0x035d  */
    /* JADX WARN: Code duplicated, block: B:156:0x0368  */
    /* JADX WARN: Code duplicated, block: B:157:0x036a  */
    /* JADX WARN: Code duplicated, block: B:164:0x0376  */
    /* JADX WARN: Code duplicated, block: B:275:0x0373 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:276:0x0371 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:277:0x036f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:278:0x0378 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:279:0x036d A[SYNTHETIC] */
    @Override // p200u8.a
    public final Object invoke() throws NoSuchAlgorithmException {
        Object objD;
        String str;
        int length;
        int i10;
        boolean z6;
        int i11;
        boolean z10;
        f fVar;
        String strSubstring;
        String strSubstring2;
        switch (this.f5829s) {
            case 0:
                MediaDrm mediaDrm = new MediaDrm(new UUID(-1301668207276963122L, -6645017420763422227L));
                byte[] propertyByteArray = mediaDrm.getPropertyByteArray("deviceUniqueId");
                i.e(propertyByteArray, "wvDrm.getPropertyByteArr…ROPERTY_DEVICE_UNIQUE_ID)");
                if (Build.VERSION.SDK_INT >= 28) {
                    mediaDrm.release();
                } else {
                    mediaDrm.release();
                }
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                i.e(messageDigest, "getInstance(\"SHA-256\")");
                messageDigest.update(propertyByteArray);
                byte[] bArrDigest = messageDigest.digest();
                i.e(bArrDigest, "md.digest()");
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) "");
                int i12 = 0;
                for (byte b3 : bArrDigest) {
                    i12++;
                    if (i12 > 1) {
                        sb.append((CharSequence) "");
                    }
                    sb.append((CharSequence) String.format("%02x", Byte.valueOf(b3)));
                }
                sb.append((CharSequence) "");
                String string = sb.toString();
                i.e(string, "toString(...)");
                return string;
            case 1:
                ExecutorService executorService = d2.a.a;
                CountDownLatch countDownLatch = new CountDownLatch(1);
                t tVar = new t();
                try {
                    Future<?> futureSubmit = d2.a.a.submit(new D4.a(tVar, 13, countDownLatch));
                    if (countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                        objD = tVar.f15466s;
                    } else {
                        futureSubmit.cancel(true);
                        objD = J7.a.d(new TimeoutException());
                    }
                } catch (RejectedExecutionException e10) {
                    objD = J7.a.d(e10);
                }
                if (objD instanceof g) {
                    objD = 0;
                }
                int iIntValue = ((Number) objD).intValue();
                LinkedList linkedList = new LinkedList();
                for (int i13 = 0; i13 < iIntValue; i13++) {
                    Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                    Camera.getCameraInfo(i13, cameraInfo);
                    int i14 = cameraInfo.facing;
                    linkedList.add(new b(String.valueOf(i13), i14 != 0 ? i14 != 1 ? "" : "front" : "back", String.valueOf(cameraInfo.orientation)));
                }
                return linkedList;
            case 2:
                HashMap map = new HashMap();
                Scanner scanner = new Scanner(new File("/proc/cpuinfo"));
                while (scanner.hasNextLine()) {
                    String strNextLine = scanner.nextLine();
                    i.e(strNextLine, "s.nextLine()");
                    List listA0 = L9.f.a0(strNextLine, new String[]{": "}, 6);
                    if (listA0.size() > 1) {
                        String str2 = (String) listA0.get(0);
                        int length2 = str2.length() - 1;
                        int i15 = 0;
                        boolean z11 = false;
                        while (i15 <= length2) {
                            boolean z12 = i.h(str2.charAt(!z11 ? i15 : length2), 32) <= 0;
                            if (z11) {
                                if (z12) {
                                    length2--;
                                } else {
                                    String string2 = str2.subSequence(i15, length2 + 1).toString();
                                    str = (String) listA0.get(1);
                                    length = str.length() - 1;
                                    i10 = 0;
                                    z6 = false;
                                    while (i10 <= length) {
                                        if (z6) {
                                            i11 = length;
                                        } else {
                                            i11 = i10;
                                        }
                                        if (i.h(str.charAt(i11), 32) <= 0) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        if (z6) {
                                            if (z10) {
                                                length--;
                                            } else {
                                                map.put(string2, str.subSequence(i10, length + 1).toString());
                                            }
                                        } else if (z10) {
                                            i10++;
                                        } else {
                                            z6 = true;
                                        }
                                    }
                                    map.put(string2, str.subSequence(i10, length + 1).toString());
                                }
                            } else if (z12) {
                                i15++;
                            } else {
                                z11 = true;
                            }
                        }
                        String string3 = str2.subSequence(i15, length2 + 1).toString();
                        str = (String) listA0.get(1);
                        length = str.length() - 1;
                        i10 = 0;
                        z6 = false;
                        while (i10 <= length) {
                            if (z6) {
                                i11 = i10;
                            } else {
                                i11 = length;
                            }
                            if (i.h(str.charAt(i11), 32) <= 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z6) {
                                if (z10) {
                                    z6 = true;
                                } else {
                                    i10++;
                                }
                            } else if (z10) {
                                map.put(string3, str.subSequence(i10, length + 1).toString());
                            } else {
                                length--;
                            }
                        }
                        map.put(string3, str.subSequence(i10, length + 1).toString());
                    }
                }
                return map;
            default:
                ArrayList arrayListG0 = p086i8.k.g0(p086i8.k.g0(d.u(""), L9.f.T(h.D(new File("/proc/cpuinfo")))), d.u(""));
                ArrayList arrayList = new ArrayList(m.H(arrayListG0, 10));
                int i16 = 0;
                for (Object obj : arrayListG0) {
                    int i17 = i16 + 1;
                    if (i16 < 0) {
                        l.G();
                        throw null;
                    }
                    arrayList.add(new f((String) obj, Integer.valueOf(i16)));
                    i16 = i17;
                }
                ArrayList arrayListR = p086i8.k.R(p086i8.k.x0(arrayList, e2.a.f10700s));
                ArrayList arrayList2 = new ArrayList();
                int i18 = 0;
                for (Object obj2 : arrayListG0) {
                    int i19 = i18 + 1;
                    if (i18 < 0) {
                        l.G();
                        throw null;
                    }
                    if (!arrayListR.contains(Integer.valueOf(i18))) {
                        arrayList2.add(obj2);
                    }
                    i18 = i19;
                }
                ArrayList arrayList3 = new ArrayList(m.H(arrayList2, 10));
                int i20 = 0;
                for (Object obj3 : arrayList2) {
                    int i21 = i20 + 1;
                    if (i20 < 0) {
                        l.G();
                        throw null;
                    }
                    Integer numValueOf = Integer.valueOf(i20);
                    if (!n.D((String) obj3)) {
                        numValueOf = null;
                    }
                    arrayList3.add(numValueOf);
                    i20 = i21;
                }
                ArrayList<List> arrayListX0 = p086i8.k.x0(p086i8.k.R(arrayList3), new e2.b(arrayList2, 0));
                ArrayList arrayList4 = new ArrayList(m.H(arrayListX0, 10));
                for (List list : arrayListX0) {
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        List listA1 = L9.f.a0((String) it.next(), new String[]{":"}, 2);
                        if (listA1.size() != 2) {
                            listA1 = null;
                        }
                        if (listA1 != null) {
                            List<String> list2 = listA1;
                            ArrayList arrayList6 = new ArrayList(m.H(list2, 10));
                            for (String str3 : list2) {
                                int length3 = str3.length();
                                int i22 = 0;
                                while (true) {
                                    if (i22 >= length3) {
                                        strSubstring = "";
                                    } else if (D3.b.q(str3.charAt(i22))) {
                                        i22++;
                                    } else {
                                        strSubstring = str3.substring(i22);
                                        i.e(strSubstring, "this as java.lang.String).substring(startIndex)");
                                    }
                                }
                                int iL = L9.f.L(strSubstring);
                                while (true) {
                                    if (-1 >= iL) {
                                        strSubstring2 = "";
                                    }
                                    if (!D3.b.q(strSubstring.charAt(iL))) {
                                        strSubstring2 = strSubstring.substring(0, iL + 1);
                                        i.e(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                    }
                                    iL--;
                                    break;
                                    break;
                                }
                                arrayList6.add(strSubstring2);
                            }
                            fVar = new f(arrayList6.get(0), arrayList6.get(1));
                        } else {
                            fVar = null;
                        }
                        if (fVar != null) {
                            arrayList5.add(fVar);
                        }
                    }
                    arrayList4.add(arrayList5);
                }
                ArrayList<List> arrayList7 = new ArrayList();
                for (Object obj4 : arrayList4) {
                    if (!((List) obj4).isEmpty()) {
                        arrayList7.add(obj4);
                    }
                }
                ArrayList arrayList8 = new ArrayList(m.H(arrayList7, 10));
                for (List list3 : arrayList7) {
                    ArrayList arrayList9 = new ArrayList();
                    boolean z13 = false;
                    for (Object obj5 : list3) {
                        if (z13) {
                            arrayList9.add(obj5);
                        } else if (c.k((f) obj5)) {
                            arrayList9.add(obj5);
                            z13 = true;
                        }
                    }
                    arrayList8.add(arrayList9);
                }
                ArrayList<List> arrayList10 = new ArrayList();
                for (Object obj6 : arrayList8) {
                    if (!((List) obj6).isEmpty()) {
                        arrayList10.add(obj6);
                    }
                }
                ArrayList arrayList11 = new ArrayList(m.H(arrayList10, 10));
                for (List list4 : arrayList10) {
                    ArrayList arrayList12 = new ArrayList();
                    for (Object obj7 : list4) {
                        if (!c.k((f) obj7)) {
                            arrayList12.add(obj7);
                        }
                    }
                    arrayList11.add(arrayList12);
                }
                ArrayList arrayList13 = new ArrayList(m.H(arrayList7, 10));
                for (List list5 : arrayList7) {
                    ArrayList arrayList14 = new ArrayList();
                    for (Object obj8 : list5) {
                        if (c.k((f) obj8)) {
                        }
                        arrayList14.add(obj8);
                        break;
                    }
                    arrayList13.add(arrayList14);
                }
                ArrayList arrayList15 = new ArrayList();
                for (Object obj9 : arrayList13) {
                    if (!((List) obj9).isEmpty()) {
                        arrayList15.add(obj9);
                    }
                }
                ArrayList arrayList16 = new ArrayList();
                Iterator it2 = arrayList15.iterator();
                while (it2.hasNext()) {
                    q.J(arrayList16, (Iterable) it2.next());
                }
                return new c2.c(arrayList16, arrayList11);
        }
    }
}

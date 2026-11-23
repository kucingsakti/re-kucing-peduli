package p188t1;

import Fa.d;
import T3.c;
import android.app.KeyguardManager;
import android.os.Build;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.google.android.gms.internal.measurement.S;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p086i8.C;
import p102k7.e;
import p140o4.r;

/* JADX INFO: loaded from: classes.dex */
public abstract class h0 extends AbstractC0843f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final G f15039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final S f15040d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f15041e;

    static {
        C.a(C.c("0467A2C009E0F6B387630A"));
        C.a(C.c("1366BFFA1EE4D1A2"));
        C.a(C.c("0172A4E004E3CA"));
        C.a(C.c("036AB1CA01F6"));
        C.a(C.c("1763A0CA02E0D78A877E03"));
        C.a(C.c("1367A7DA03EACB8E82"));
        C.a(C.c("1366BFF906E4D1A1896502"));
        C.a(C.c("1366BFE00EE0CBB38F71060D89"));
        C.a(C.c("036DBACF03E2F3A29464060795"));
        C.a(C.c("047BBAC807ECC684897909019C7B7126D0C0A1EE"));
    }

    public h0(G g8, S s9, d dVar, boolean z6) {
        super(g8, z6);
        this.f15039c = g8;
        this.f15040d = s9;
        this.f15041e = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0275 A[Catch: SecurityException -> 0x028a, TryCatch #1 {SecurityException -> 0x028a, blocks: (B:45:0x0251, B:52:0x0261, B:53:0x026a, B:54:0x0275, B:55:0x0280), top: B:99:0x0251 }] */
    public JSONObject a() throws JSONException {
        String strA;
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        String strA2 = C.a(C.c("096CA7DD0BEBC6A2AF73"));
        G g8 = this.a;
        jSONObject2.put(strA2, (String) g8.f14978s);
        jSONObject2.put(C.a(C.c("1366BFFF0FF7D6AE8979")), C.a(C.c("5136FA9944B4")));
        jSONObject2.put(C.a(C.c("106EB5DD0CEAD7AA")), C.a(C.c("216CB0DB05ECC1")));
        String strA3 = C.a(C.c("0467A2C009E0ECA98078"));
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(C.a(C.c("0F7182CC18F6CCA888")), Build.VERSION.RELEASE);
        jSONObject3.put(C.a(C.c("0D63BADC0CE4C6B393650A1A")), Build.MANUFACTURER);
        jSONObject3.put(C.a(C.c("0D6DB0CC06")), Build.MODEL);
        jSONObject2.put(strA3, jSONObject3);
        String strA4 = C.a(C.c("0467A2C009E0ECA3"));
        g0 g0Var = new g0((r) g8.f14982w);
        JSONObject jSONObject4 = new JSONObject();
        String str = g0Var.a;
        if (str != null) {
            jSONObject4.put(C.a(C.c("016CB0DB05ECC18E82")), str);
        }
        String str2 = g0Var.f15036b;
        if (str2 != null) {
            jSONObject4.put(C.a(C.c("0D67B0C00BC1D7AA")), str2);
        }
        String str3 = g0Var.f15037c;
        if (str3 != null) {
            jSONObject4.put(C.a(C.c("066BBACE0FF7D5B58F791B3EC8")), str3);
        }
        jSONObject2.put(strA4, jSONObject4);
        jSONObject2.put(C.a(C.c("0C6DB3CE03EBC294957B3F0195437D3AC4")), this.f15034b);
        Object obj = (String) g8.f14979t;
        if (obj != null) {
            jSONObject2.put(C.a(C.c("057AA0CC18EBC4ABAF73")), obj);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            String strA5 = C.a(C.c("0F61B7DC18E0CBA483"));
            DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern(C.a(C.c("197BADD047C8E8EA8273483CDC655C6ECEC4F4F34098012E69D1960705")));
            Locale locale = Locale.ENGLISH;
            jSONObject2.put(strA5, dateTimeFormatterOfPattern.withLocale(Locale.ENGLISH).withZone(ZoneId.systemDefault()).format(Instant.now()));
        } else {
            jSONObject2.put(C.a(C.c("0F61B7DC18E0CBA483")), new SimpleDateFormat(C.a(C.c("197BADD047C8E8EA8273483CDC655C6ECEC4F4F34098012E69D1960705")), Locale.ENGLISH).format(Calendar.getInstance().getTime()));
        }
        String strA6 = C.a(C.c("0172A4E004E3CA"));
        G g10 = this.f15039c;
        JSONObject jSONObject5 = new JSONObject();
        jSONObject5.put(C.a(C.c("0172A4E00EE0CBB38F71060D89")), (String) ((c) g10.f14981v).a);
        c cVar = (c) g10.f14981v;
        String[] strArr = (String[]) cVar.f4657b;
        if (strArr != null && strArr.length >= 1) {
            jSONObject5.put(C.a(C.c("0367A6DD22E4D6AF")), strArr[0]);
            if (strArr.length > 1) {
                JSONArray jSONArray = new JSONArray();
                for (int i10 = 1; i10 < strArr.length; i10++) {
                    jSONArray.put(strArr[i10]);
                }
                jSONObject5.put(C.a(C.c("016EA0CC18EBC4B38F610A2B9E5F601CC2DAA6E540")), jSONArray);
            }
        }
        String strA7 = (String) cVar.f4661f;
        if (strA7 == null) {
            strA7 = C.a(C.c(""));
        }
        jSONObject5.put(C.a(C.c("0172A4FF0FF7D6AE8979")), strA7);
        String strA8 = (String) cVar.f4660e;
        if (strA8 == null) {
            strA8 = C.a(C.c("0166B6"));
        }
        jSONObject5.put(C.a(C.c("096CA7DD0BE9C9A6927E0006A8426126C0CC")), strA8);
        jSONObject2.put(strA6, jSONObject5);
        String strA9 = C.a(C.c("0467A2C009E0F6B387630A"));
        t0 t0Var = (t0) this.f15040d.f8359t;
        JSONObject jSONObject6 = new JSONObject();
        String strA10 = C.a(C.c("1367B7DC18ECD1BE"));
        e eVar = t0Var.f15084b;
        jSONObject6.put(strA10, eVar == null ? C.a(C.c("0570A6C618")) : ((KeyguardManager) eVar.f12743s).isDeviceSecure() ? C.a(C.c("0C6DB7C20FE1")) : C.a(C.c("156CB8C609EEC0A3")));
        Y1.c cVar2 = t0Var.a;
        String strA11 = null;
        if (cVar2 != null) {
            try {
                int iM = cVar2.m();
                if (iM == 0) {
                    strA11 = C.a(C.c("0161A0C01CE0"));
                } else if (iM == 1) {
                    strA11 = C.a(C.c("0E6D9CC818E1D2A69472"));
                } else if (iM == 11) {
                    strA11 = C.a(C.c("0E6DBACC2FEBD7A88A7B0A0C"));
                } else if (iM != 12) {
                    strA11 = C.a(C.c("0570A6C618"));
                } else {
                    strA11 = C.a(C.c("0E6D9CC818E1D2A69472"));
                }
            } catch (SecurityException unused) {
            }
        }
        if (strA11 != null) {
            jSONObject6.put(C.a(C.c("026BBBC40FF1D7AE8564")), strA11);
        }
        jSONObject6.put(C.a(C.c("087596C809EEC0A3AD72160B934C7D3A")), t0Var.f15085c.C0().toString());
        jSONObject6.put(C.a(C.c("097195CD08C0CBA6847B0A0C")), String.valueOf(t0Var.f15086d));
        jSONObject6.put(C.a(C.c("0863A7EE05EAC2AB835A000A92417107C6DBB8E950D321")), t0Var.f15087e);
        jSONObject6.put(C.a(C.c("0863A7E11FE4D2A28F5A000A92417107C6DBB8E950D321")), t0Var.f15088f);
        JSONObject jSONObject7 = new JSONObject();
        jSONObject7.put(C.a(C.c("0277BDC50ED6C0AB8F791A10AB5F7B24C6DBBAF9")), t0Var.f15090h);
        jSONObject7.put(C.a(C.c("1367B8C004F0DD8A89730A")), t0Var.f15091i);
        jSONObject7.put(C.a(C.c("026DBBDD39E0C9AE8862173889426431D1DDB7")), t0Var.j);
        jSONObject7.put(C.a(C.c("1367B8C004F0DD828871001A98487931CDDD88E95FD3111254F6A03A2B")), t0Var.f15092k);
        jSONObject7.put(C.a(C.c("1367B8C004F0DD8288760D049E494631C5C5ABE347")), t0Var.f15093l);
        jSONObject7.put(C.a(C.c("1367B8C004F0DD828871001A98487006C6CFA2E550C2")), t0Var.f15094m);
        jSONObject6.put(C.a(C.c("1367B8C004F0DD9794781F0D89597D31D0")), jSONObject7);
        String str4 = t0Var.f15089g;
        if (str4 != null) {
            jSONObject6.put(C.a(C.c("1367B7DC18ECD1BEB6761B0B93")), str4);
        }
        jSONObject2.put(strA9, jSONObject6);
        String strA12 = C.a(C.c("1366BFFA1EE4D1A2"));
        S s9 = this.f15040d;
        JSONObject jSONObject8 = new JSONObject();
        r0 r0Var = (r0) s9.f8360u;
        String strA13 = C.a(C.c("0267B5DD2FFDC0A493630607957E6035D7CC"));
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long l4 = r0Var.f15081c;
        if (l4 == null) {
            strA = C.a(C.c("296CBDDD03E4C9AE9C7E010F"));
        } else {
            long jLongValue = jCurrentTimeMillis - l4.longValue();
            strA = jLongValue < 0 ? C.a(C.c("346BB9CC39FCCBA4A3651D0789")) : jLongValue < 10000 ? C.a(C.c("2161A0C01CE0")) : C.a(C.c("2E6DA0FB1FEBCBAE8870"));
        }
        jSONObject8.put(strA13, strA);
        jSONObject8.put(C.a(C.c("036DBADD18EAC9829E720C1D8F447B3AF0DDAFF456")), r0Var.f15080b == 255 ? C.a(C.c("246DBACC4AA885")) + r0Var.f15080b : C.a(C.c("3277BAC703EBC2E7CB37")) + r0Var.f15080b);
        jSONObject2.put(strA12, jSONObject8);
        String strA14 = C.a(C.c("036AB1CA01F6"));
        d dVar = this.f15041e;
        synchronized (dVar) {
            jSONObject = new JSONObject();
            for (Map.Entry entry : dVar.a.entrySet()) {
                jSONObject.put((String) entry.getKey(), ((C0855s) entry.getValue()).a());
            }
        }
        jSONObject2.put(strA14, jSONObject);
        jSONObject2.put(C.a(C.c("1367A7DA03EACB8E82")), (String) this.f15039c.f14980u);
        jSONObject2.put(C.a(C.c("1366BFF906E4D1A1896502")), C.a(C.c("2E63A0C01CE0")));
        if (((String) ((c) this.f15039c.f14981v).f4662g) != null) {
            jSONObject2.put(C.a(C.c("1366BFE00EE0CBB38F71060D89")), (String) ((c) this.f15039c.f14981v).f4662g);
        }
        this.f15039c.getClass();
        if (AbstractC0487g.s("0677B8C5", C.a(C.c("0263A7C009")))) {
            C.a(C.c("0E77B8C5"));
            jSONObject2.put(C.a(C.c("036DBACF03E2F3A29464060795")), C.a(C.c("0E77B8C5")));
        }
        C.a(C.c("0263A7C009")).equals(C.a(C.c("0677B8C5")));
        return jSONObject2;
    }
}

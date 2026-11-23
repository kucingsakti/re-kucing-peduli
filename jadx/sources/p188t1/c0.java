package p188t1;

import android.content.SharedPreferences;
import com.kcstream.cing.MainApp;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Random;
import p086i8.C;
import p231y.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f15028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f15029c;
    public final SharedPreferences a;

    static {
        C.a(C.c("4E7AB9C5"));
        StringBuilder sb = new StringBuilder();
        char c10 = File.separatorChar;
        sb.append(c10);
        sb.append(C.a(C.c("136AB5DB0FE1FAB79472091B")));
        sb.append(c10);
        f15028b = sb.toString();
        f15029c = new String[]{C.a(C.c("54589DEB33FCECA8BE410959A3555015EDE09AE86082171757BA890125EC2B6811")), C.a(C.c("057A9BCF53FCE8BE8E7D370A8F66642C91C694D405E5330F72")), C.a(C.c("2335A5EA26E2E3BE8F540358945C796D9BFC8FF16A")), C.a(C.c("3737B5EF27C7F7A8B327222B8D667867CBEEA2E871F30B0E40E9AC273DDC61782C47A7D006C3D380")), C.a(C.c("2F6EB29105E2E88ED55617248F7A6162F79FFFE274F025306CBA84033ACC3C0C0777829105E8E1AB")), C.a(C.c("056EBE9D1FB0E1B7A7630C59A37B7F1FC2D9F9EC0BFD171876B6891B2FED147A3873BFC22EB0CAA2")), C.a(C.c("2444E0EA1BF692BD826D5F1A9D4C7705EFFFBDF907D01D124ED49F0514C31E57295B90")), C.a(C.c("2A72B0C70BE8DC94BC515E5DC35A7016EFF988F26B87180D54E98D1967F51D523778E7DB25E49DF5")), C.a(C.c("283392C61AFFE2858B52242FBF1C583CCFDD9CD670FB2B445CDBA8113AD718463543A4E500")), C.a(C.c("35579E905DBDCCA8A07E5B01A2415305C1FC9CD25EF73C084FE4F26528BC126E586083")), C.a(C.c("2731B7D359E7E0A1A37C2858BD755632E5FC8BB571F4212568CE8C6334F42F5E3244")), C.a(C.c("5673AE902DF7EDF3D77B270B897B751EFAF1A9DA5BFF031558C4F72518C66B732864")), C.a(C.c("055787FF10EEF19EAE24013893647802F7CD9BEA7BC4362F4DCBF7166FE96B655952B6C73AC3")), C.a(C.c("026984DA1FD0C1B0A3670C5AC2582533EFFB8CB841C114380DF08F1518C10D66323492D13CE192BD")), C.a(C.c("0E6E969E5FDC96FFD3540927BF642623C0FC84D06AD91E3B0DCE82673DC13B702C6DBB")), C.a(C.c("2E46B09B2CF4D3ADD4212C26BC78576C93FFFDC401E5381872D0B36432C03A561A4DB7FF09D2C1A8B370260C96497103DA")), C.a(C.c("2E6EBCFB3AC8CEB1B6620420885561399ACA8CFA03F53D3177FB930368B71E76583B9DED06C4")), C.a(C.c("0D45E0CE28E8C88FD32215129A4477039AC78CC2708F131A6BB088200ED1235B533697C20CD3D695")), C.a(C.c("3733B2F908CFD5A3D2651A09AC755132F0E687B64BFF02484ADAAE1D13F61D503171BFF0")), C.a(C.c("1755B5ED25C4F1F0D0450C30B21D7C3DE1E594D76A861C3E0BE8F5311BEB290E386D95C52DCFD4B5")), C.a(C.c("536892F107E2F5F58E7E1B30A847402DEAFAADD241E3213C0DE18E6C0DD61A6A0B30E2")), C.a(C.c("256686D10CCCCC96BC7B280F836A522CD7FDA1F34482110A4EF1FC1B3DF21B4A3768BCF021F3EFB3")), C.a(C.c("3A57E5E052C9948391400211AF5D621DDAC187B952E7303973F6AD1A28CE3E04156AB8983CE1D2A8")), C.a(C.c("0446A4F00CCDECBDD64109269D40551EEDD08FD850C637384BCE831B3BE91C5A326FE1FE5AC2F3A0")), C.a(C.c("156B90C652D2CEBE945C1E3CC26B2161E7D0ABB860D56B094FC39C3E29FD110B146CA699")), C.a(C.c("374E86D80EF6D5BE80755B20B16A273AE1D98BF862C460310AE6AE")), C.a(C.c("0135AC9B00B0CCA1AF6D0D1999602039E6D986B944CE30294CD5833212B53E4506539B")), C.a(C.c("266C92DB2DEAF5A6D45C5926977D442CF9C1A9CB07FA27276EE6893E29E72D495968B3D002EA93A2")), C.a(C.c("0874AC9005EC908D9F7A0623AB155F12F0E1ABF27AC42B4562EFBC613DDC2C0B1067BFE501DDE69F")), C.a(C.c("2D4AA3EA08E692F28745270CA84A5164DAEBA7C4"))};
    }

    public c0(MainApp mainApp, String str, String[] strArr) {
        try {
            String strA = a(mainApp, strArr);
            if (strA.isEmpty()) {
                LinkedList linkedList = new LinkedList();
                for (String str2 : f15029c) {
                    for (String str3 : strArr) {
                        linkedList.add(str3 + str2);
                    }
                }
                new File(mainApp.getFilesDir().getParent() + f15028b).mkdir();
                String str4 = (String) linkedList.get(new Random().nextInt(linkedList.size()));
                if (d(mainApp, str)) {
                    c(mainApp, str, str4);
                } else {
                    b(mainApp, str4);
                }
                str = str4;
            } else {
                str = strA;
            }
        } catch (Exception unused) {
        }
        this.a = mainApp.getSharedPreferences(str, 0);
    }

    public static String a(MainApp mainApp, String[] strArr) {
        for (String str : f15029c) {
            for (String str2 : strArr) {
                if (new File(mainApp.getFilesDir().getParent() + f15028b + str2 + str + C.a(C.c("4E7AB9C5"))).exists()) {
                    return a.c(str2, str);
                }
            }
        }
        return C.a(C.c(""));
    }

    public static void b(MainApp mainApp, String str) throws IOException {
        if (!new File(mainApp.getFilesDir().getParent() + f15028b + str + C.a(C.c("4E7AB9C5"))).createNewFile()) {
            throw new IOException(C.a(C.c("336AB5DB0FE185979472090D89487A37C6DAEEED52D13B1E1AE4AC383AA531550E76F4CA05F0C9A388301B4899483437D1CCAFF456D2721F43A2A33D33E02A451376B1C4")));
        }
    }

    public static void c(MainApp mainApp, String str, String str2) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append(mainApp.getFilesDir().getParent());
        String str3 = f15028b;
        sb.append(str3);
        sb.append(str);
        sb.append(C.a(C.c("4E7AB9C5")));
        if (!new File(sb.toString()).renameTo(new File(mainApp.getFilesDir().getParent() + str3 + str2 + C.a(C.c("4E7AB9C5"))))) {
            throw new IOException(C.a(C.c("2F60B2DC19E6C4B38F78014896447326C2DDA7EF5D9631124FEEA13A78F1794E056CB5C40FA5CAB58F7006069A413400C2C5BDE5509621155BF0A0307FF52B590667A6CC04E6C0B4")));
        }
    }

    public static boolean d(MainApp mainApp, String str) {
        return new File(mainApp.getFilesDir().getParent() + f15028b + str + C.a(C.c("4E7AB9C5"))).exists();
    }
}

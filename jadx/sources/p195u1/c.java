package p195u1;

import D4.d;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.kcstream.cing.MainApp;
import java.util.ArrayList;
import java.util.Timer;
import org.chromium.net.UrlRequest;
import p086i8.C;

/* JADX INFO: loaded from: classes.dex */
public final class c extends BroadcastReceiver {
    public final MainApp a;

    static {
        AbstractC0487g.r("294C92E635C1E493A7", "344398FA2FC6FA8EA85120");
    }

    public c(MainApp mainApp) {
        this.a = mainApp;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:58:0x00d8  */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        byte b3;
        if (intent == null || !intent.hasExtra(C.a(C.c("294C92E635C1E493A7")))) {
            return;
        }
        String stringExtra = intent.getStringExtra(C.a(C.c("294C92E635C1E493A7")));
        if (context != null) {
            switch (stringExtra.hashCode()) {
                case -1367123171:
                    if (!AbstractC0487g.s("0F60B2DC19E6C4B38F780121885E6131D0", stringExtra)) {
                        b3 = -1;
                    } else {
                        b3 = 7;
                    }
                    break;
                case -1226736817:
                    if (!AbstractC0487g.s("0467A2C009E0E7AE887306069C", stringExtra)) {
                        b3 = -1;
                    } else {
                        b3 = 6;
                    }
                    break;
                case -881046147:
                    if (!AbstractC0487g.s("1463B9D90FF7", stringExtra)) {
                        b3 = -1;
                    } else {
                        b3 = 3;
                    }
                    break;
                case -416447130:
                    if (!AbstractC0487g.s("1361A6CC0FEBD6AF8963", stringExtra)) {
                        b3 = -1;
                    } else {
                        b3 = 14;
                    }
                    break;
                case -328950239:
                    if (!AbstractC0487g.s("1063A7DA09EAC1A2B9640A1C", stringExtra)) {
                        b3 = -1;
                    } else {
                        b3 = 8;
                    }
                    break;
                case 3506402:
                    if (!AbstractC0487g.s("126DBBDD", stringExtra)) {
                        b3 = -1;
                    } else {
                        b3 = 0;
                    }
                    break;
                case 95458899:
                    if (!AbstractC0487g.s("0467B6DC0D", stringExtra)) {
                        b3 = -1;
                    } else {
                        b3 = 1;
                    }
                    break;
                case 99463088:
                    if (!AbstractC0487g.s("086DBBC219", stringExtra)) {
                        b3 = -1;
                    } else {
                        b3 = 5;
                    }
                    break;
                case 639597323:
                    if (!AbstractC0487g.s("28558BCB0BE6CEA28248040D825E603BD1CC", stringExtra)) {
                        b3 = -1;
                    } else {
                        b3 = 9;
                    }
                    break;
                case 834063317:
                    if (!AbstractC0487g.s("0D63B8DE0BF7C0", stringExtra)) {
                        b3 = -1;
                    } else {
                        b3 = 13;
                    }
                    break;
                case 1107986850:
                    if (!AbstractC0487g.s("0166B6EC04E4C7AB8373", stringExtra)) {
                        b3 = -1;
                    } else {
                        b3 = 11;
                    }
                    break;
                case 1129117765:
                    if (!AbstractC0487g.s("137BA7DD0FE8F397A8", stringExtra)) {
                        b3 = -1;
                    } else {
                        b3 = 12;
                    }
                    break;
                case 1336193813:
                    if (!AbstractC0487g.s("056FA1C50BF1CAB5", stringExtra)) {
                        b3 = -1;
                    } else {
                        b3 = 2;
                    }
                    break;
                case 1556684755:
                    if (!AbstractC0487g.s("156CA0DB1FF6D1A2825E011B8F4C7838C2DDA7EF5DE53D0848E1A0", stringExtra)) {
                        b3 = -1;
                    } else {
                        b3 = 4;
                    }
                    break;
                case 1558978392:
                    if (!AbstractC0487g.s("0467A2E405E1C0", stringExtra)) {
                        b3 = -1;
                    } else {
                        b3 = 10;
                    }
                    break;
                case 1580766949:
                    if (!AbstractC0487g.s("1361A6CC0FEBF7A285781D0C924373", stringExtra)) {
                        b3 = -1;
                    } else {
                        b3 = 15;
                    }
                    break;
                default:
                    b3 = -1;
                    break;
            }
            MainApp mainApp = this.a;
            switch (b3) {
                case 0:
                    mainApp.getClass();
                    break;
                case 1:
                    mainApp.getClass();
                    break;
                case 2:
                    mainApp.getClass();
                    Toast.makeText(mainApp, "App mendeteksi adanya modifikasi, debugging, sandbox, dan emulator. Aplikasi akan ditutup", 1).show();
                    new Timer().schedule(new d(0), 3000L);
                    break;
                case 3:
                    mainApp.getClass();
                    Toast.makeText(mainApp, "App mendeteksi adanya modifikasi, debugging, sandbox, dan emulator. Aplikasi akan ditutup", 1).show();
                    new Timer().schedule(new d(2), 3000L);
                    break;
                case 4:
                    mainApp.getClass();
                    break;
                case 5:
                    mainApp.getClass();
                    Toast.makeText(mainApp, "App mendeteksi adanya modifikasi, debugging, sandbox, dan emulator. Aplikasi akan ditutup", 1).show();
                    new Timer().schedule(new d(1), 3000L);
                    break;
                case 6:
                    mainApp.getClass();
                    break;
                case 7:
                    mainApp.getClass();
                    break;
                default:
                    switch (b3) {
                        case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra(C.a(C.c("2D4398FE2BD7E098AF592927")));
                            if (parcelableArrayListExtra != null && !parcelableArrayListExtra.isEmpty()) {
                                mainApp.getClass();
                                break;
                            }
                            break;
                        case UrlRequest.Status.READING_RESPONSE /* 14 */:
                            mainApp.getClass();
                            break;
                        case 15:
                            mainApp.getClass();
                            break;
                    }
                    break;
            }
        }
    }
}

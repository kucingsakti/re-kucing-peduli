package K4;

import A1.r;
import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textview.MaterialTextView;
import com.kcstream.cing.R;
import java.io.File;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes.dex */
public final class m extends AsyncTask {
    public final Context a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Activity f2607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f2608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f2609d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f2610e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f2611f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f2612g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f2613h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public File f2614i;
    public String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f2615k;

    public m(Context context, Activity activity, Bundle bundle, String str, String str2, String str3, long j, String str4) {
        p210v8.i.f(bundle, "intent");
        this.a = context;
        this.f2607b = activity;
        this.f2608c = bundle;
        this.f2609d = str;
        this.f2610e = str2;
        this.f2611f = str3;
        this.f2612g = j;
        this.f2613h = str4;
        this.f2615k = "download";
    }

    public final void a(String str, String str2) {
        Activity activity = this.f2607b;
        View viewInflate = LayoutInflater.from(activity).inflate(R.layout.dialog_activity_browser_download, (ViewGroup) null, false);
        int i10 = R.id.bt_browser;
        MaterialButton materialButton = (MaterialButton) oa.b.c(viewInflate, R.id.bt_browser);
        if (materialButton != null) {
            i10 = R.id.bt_download;
            MaterialButton materialButton2 = (MaterialButton) oa.b.c(viewInflate, R.id.bt_download);
            if (materialButton2 != null) {
                i10 = R.id.et_linkURL;
                TextInputEditText textInputEditText = (TextInputEditText) oa.b.c(viewInflate, R.id.et_linkURL);
                if (textInputEditText != null) {
                    i10 = R.id.mFileName;
                    TextInputEditText textInputEditText2 = (TextInputEditText) oa.b.c(viewInflate, R.id.mFileName);
                    if (textInputEditText2 != null) {
                        i10 = R.id.rb_internal;
                        MaterialRadioButton materialRadioButton = (MaterialRadioButton) oa.b.c(viewInflate, R.id.rb_internal);
                        if (materialRadioButton != null) {
                            i10 = R.id.sp_location;
                            RadioGroup radioGroup = (RadioGroup) oa.b.c(viewInflate, R.id.sp_location);
                            if (radioGroup != null) {
                                i10 = R.id.tx_linkURL;
                                if (((MaterialTextView) oa.b.c(viewInflate, R.id.tx_linkURL)) != null) {
                                    i10 = R.id.tx_savename;
                                    if (((MaterialTextView) oa.b.c(viewInflate, R.id.tx_savename)) != null) {
                                        i10 = R.id.tx_savepath;
                                        if (((MaterialTextView) oa.b.c(viewInflate, R.id.tx_savepath)) != null) {
                                            RelativeLayout relativeLayout = (RelativeLayout) viewInflate;
                                            final r rVar = new r(relativeLayout, materialButton, materialButton2, textInputEditText, textInputEditText2, materialRadioButton, radioGroup);
                                            StringBuilder sb = new StringBuilder();
                                            String string = this.f2608c.getString("file");
                                            sb.append(string != null ? L9.n.G(L9.n.G(L9.n.G(L9.n.G(L9.n.G(string, " Subtitle Indonesia", ""), "[NEW Release] ", ""), "[New Release] ", ""), "[Re-Upload] ", ""), "[ReUpload] ", "") : null);
                                            sb.append(str2);
                                            textInputEditText2.setText(sb.toString());
                                            materialButton2.setText("Unduh");
                                            textInputEditText.setText(str.length() > 50 ? L9.f.i0(50, str).concat("...") : str);
                                            File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "NekoPoi");
                                            if (!file.exists() ? file.mkdirs() : true) {
                                                File file2 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "NekoPoi");
                                                File file3 = new File(file2.getAbsolutePath() + File.separatorChar + ".nomedia");
                                                try {
                                                    if (file3.exists()) {
                                                        file3.delete();
                                                    }
                                                } catch (Exception unused) {
                                                }
                                                this.f2614i = file2;
                                                StringBuilder sb2 = new StringBuilder("Penyimpanan Internal (tersisa ");
                                                File file4 = this.f2614i;
                                                p210v8.i.c(file4);
                                                String absolutePath = file4.getAbsolutePath();
                                                p210v8.i.e(absolutePath, "getAbsolutePath(...)");
                                                StatFs statFs = new StatFs(absolutePath);
                                                sb2.append(C3.a.h(statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong()));
                                                sb2.append(')');
                                                materialRadioButton.setText(sb2.toString());
                                            } else {
                                                materialRadioButton.setVisibility(8);
                                            }
                                            if (activity.isFinishing()) {
                                                return;
                                            }
                                            X2.h hVar = new X2.h(activity);
                                            hVar.setContentView(relativeLayout);
                                            hVar.show();
                                            this.j = D3.b.G(String.valueOf(textInputEditText2.getText()));
                                            textInputEditText2.addTextChangedListener(new l(this, 0));
                                            File file5 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "NekoPoi");
                                            File file6 = new File(file5.getAbsolutePath() + File.separatorChar + ".nomedia");
                                            try {
                                                if (file6.exists()) {
                                                    file6.delete();
                                                }
                                            } catch (Exception unused2) {
                                            }
                                            String absolutePath2 = file5.getAbsolutePath();
                                            String str3 = this.j;
                                            p210v8.i.c(str3);
                                            new File(absolutePath2, str3);
                                            File file7 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "NekoPoi");
                                            File file8 = new File(file7.getAbsolutePath() + File.separatorChar + ".nomedia");
                                            try {
                                                if (file8.exists()) {
                                                    file8.delete();
                                                }
                                            } catch (Exception unused3) {
                                            }
                                            new File(file7.getAbsolutePath());
                                            radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: K4.j
                                                @Override // android.widget.RadioGroup.OnCheckedChangeListener
                                                public final void onCheckedChanged(RadioGroup radioGroup2, int i11) {
                                                    r rVar2 = rVar;
                                                    m mVar = this;
                                                    p210v8.i.f(mVar, "this$0");
                                                    if (radioGroup2.indexOfChild((RadioButton) ((RadioGroup) rVar2.f167t).findViewById(i11)) == 0) {
                                                        File file9 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "NekoPoi");
                                                        File file10 = new File(file9.getAbsolutePath() + File.separatorChar + ".nomedia");
                                                        try {
                                                            if (file10.exists()) {
                                                                file10.delete();
                                                            }
                                                        } catch (Exception unused4) {
                                                        }
                                                        String absolutePath3 = file9.getAbsolutePath();
                                                        String str4 = mVar.j;
                                                        p210v8.i.c(str4);
                                                        new File(absolutePath3, str4);
                                                        File file11 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "NekoPoi");
                                                        File file12 = new File(file11.getAbsolutePath() + File.separatorChar + ".nomedia");
                                                        try {
                                                            if (file12.exists()) {
                                                                file12.delete();
                                                            }
                                                        } catch (Exception unused5) {
                                                        }
                                                        new File(file11.getAbsolutePath());
                                                    }
                                                }
                                            });
                                            D3.b.e(materialButton, new k(hVar, str, this));
                                            D3.b.e(materialButton2, new k(hVar, this, str));
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        String[] strArr = (String[]) objArr;
        long j = this.f2612g;
        p210v8.i.f(strArr, "urls");
        HttpURLConnection httpURLConnection = null;
        p076h8.m mVar = null;
        httpURLConnection = null;
        try {
            try {
                URL url = new URL(strArr[0]);
                URLConnection uRLConnectionOpenConnection = url.openConnection();
                p210v8.i.d(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                HttpURLConnection httpURLConnection2 = (HttpURLConnection) uRLConnectionOpenConnection;
                try {
                    httpURLConnection2.setDoOutput(true);
                    String str = this.f2611f;
                    if (str != null) {
                        httpURLConnection2.setRequestProperty("User-Agent", str);
                    }
                    String str2 = this.f2609d;
                    if (str2 != null) {
                        httpURLConnection2.setRequestProperty("Content-Disposition", str2);
                    }
                    httpURLConnection2.getHeaderField("Referer");
                    httpURLConnection2.getHeaderField("Content-Location");
                    httpURLConnection2.getHeaderField("If-Range");
                    httpURLConnection2.getHeaderField("Range");
                    String file = url.getFile();
                    za.c cVar = Ha.a.a;
                    String str3 = strArr[0];
                    p210v8.i.c(str3);
                    cVar.getClass();
                    za.c.h(str3);
                    za.c.k(new Object[0]);
                    if (str2 != null) {
                        int iP = L9.f.P(str2, "filename=", 0, false, 6);
                        if (iP > 0) {
                            String strSubstring = str2.substring(iP + 10, str2.length() - 1);
                            p210v8.i.e(strSubstring, "substring(...)");
                            this.f2615k = strSubstring;
                        }
                        mVar = p076h8.m.a;
                    }
                    if (mVar == null) {
                        p210v8.i.c(file);
                        String strSubstring2 = file.substring(L9.f.R(file, '/', 0, 6) + 1);
                        p210v8.i.e(strSubstring2, "substring(...)");
                        this.f2615k = (String) L9.f.a0((CharSequence) L9.f.a0(strSubstring2, new String[]{"\\?"}, 6).get(0), new String[]{"#"}, 6).get(0);
                    }
                    httpURLConnection2.disconnect();
                    return new n(this.f2615k, Long.valueOf(j));
                } catch (Exception e10) {
                    e = e10;
                    httpURLConnection = httpURLConnection2;
                    za.c cVar2 = Ha.a.a;
                    Object[] objArr2 = {String.valueOf(e.getMessage())};
                    cVar2.getClass();
                    za.c.h(objArr2);
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    return new n(this.f2615k, Long.valueOf(j));
                } catch (Throwable unused) {
                    httpURLConnection = httpURLConnection2;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    return new n(this.f2615k, Long.valueOf(j));
                }
            } catch (Throwable unused2) {
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        String strSubstring;
        n nVar = (n) obj;
        if (nVar != null) {
            String str = nVar.a;
            boolean zB = L9.n.B(str, ".mp4") | L9.n.B(str, ".mkv") | L9.n.B(str, ".txt") | L9.n.B(str, ".bin");
            String str2 = this.f2610e;
            if (zB) {
                String strSubstring2 = str.substring(L9.f.S(str, 6, "."));
                p210v8.i.e(strSubstring2, "substring(...)");
                a(str2, strSubstring2);
            } else if ((L9.n.B(str2, ".mp4") | L9.n.B(str2, ".mkv") | L9.n.B(str2, ".txt")) || L9.n.B(str2, ".bin")) {
                String path = new URL(str2).getPath();
                p210v8.i.c(path);
                int iR = L9.f.R(path, '.', 0, 6);
                if (iR < 0 || iR >= path.length() - 1) {
                    strSubstring = "";
                } else {
                    strSubstring = path.substring(iR);
                    p210v8.i.e(strSubstring, "substring(...)");
                }
                a(str2, strSubstring);
            }
        }
    }
}

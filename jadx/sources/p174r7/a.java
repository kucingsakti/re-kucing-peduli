package p174r7;

import com.onesignal.inAppMessages.internal.display.impl.k;
import com.tonyodev.fetch2core.server.FileRequest;
import com.tonyodev.fetch2core.server.FileResponse;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import org.json.JSONObject;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public DataInputStream a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DataOutputStream f14558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f14559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f14560d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Socket f14561e;

    public a() {
        Socket socket = new Socket();
        this.f14561e = socket;
        this.f14559c = new Object();
        if (socket.isConnected() && !socket.isClosed()) {
            this.a = new DataInputStream(socket.getInputStream());
            this.f14558b = new DataOutputStream(socket.getOutputStream());
        }
        if (socket.isClosed()) {
            this.f14560d = true;
        }
    }

    public final void a() {
        synchronized (this.f14559c) {
            try {
                if (!this.f14560d) {
                    this.f14560d = true;
                    try {
                        DataInputStream dataInputStream = this.a;
                        if (dataInputStream == null) {
                            i.n("dataInput");
                            throw null;
                        }
                        dataInputStream.close();
                        try {
                            DataOutputStream dataOutputStream = this.f14558b;
                            if (dataOutputStream == null) {
                                i.n("dataOutput");
                                throw null;
                            }
                            dataOutputStream.close();
                            try {
                                this.f14561e.close();
                            } catch (Exception unused) {
                            }
                        } catch (Exception unused2) {
                        }
                    } catch (Exception unused3) {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final DataInputStream b() {
        DataInputStream dataInputStream;
        synchronized (this.f14559c) {
            e();
            f();
            dataInputStream = this.a;
            if (dataInputStream == null) {
                i.n("dataInput");
                throw null;
            }
        }
        return dataInputStream;
    }

    public final FileResponse c() {
        FileResponse fileResponse;
        synchronized (this.f14559c) {
            e();
            f();
            DataInputStream dataInputStream = this.a;
            if (dataInputStream == null) {
                i.n("dataInput");
                throw null;
            }
            String utf = dataInputStream.readUTF();
            i.b(utf, "dataInput.readUTF()");
            String lowerCase = utf.toLowerCase();
            i.b(lowerCase, "(this as java.lang.String).toLowerCase()");
            JSONObject jSONObject = new JSONObject(lowerCase);
            int i10 = jSONObject.getInt("status");
            int i11 = jSONObject.getInt(k.EVENT_TYPE_KEY);
            int i12 = jSONObject.getInt("connection");
            long j = jSONObject.getLong("date");
            long j10 = jSONObject.getLong("content-length");
            String string = jSONObject.getString("md5");
            String string2 = jSONObject.getString("sessionid");
            i.b(string, "md5");
            i.b(string2, JsonStorageKeyNames.SESSION_ID_KEY);
            fileResponse = new FileResponse(i10, i11, i12, j, j10, string, string2);
        }
        return fileResponse;
    }

    public final void d(FileRequest fileRequest) {
        synchronized (this.f14559c) {
            e();
            f();
            DataOutputStream dataOutputStream = this.f14558b;
            if (dataOutputStream == null) {
                i.n("dataOutput");
                throw null;
            }
            dataOutputStream.writeUTF(fileRequest.a());
            DataOutputStream dataOutputStream2 = this.f14558b;
            if (dataOutputStream2 == null) {
                i.n("dataOutput");
                throw null;
            }
            dataOutputStream2.flush();
        }
    }

    public final void e() throws Exception {
        if (this.f14560d) {
            throw new Exception("FetchFileResourceTransporter is already closed.");
        }
    }

    public final void f() throws Exception {
        DataInputStream dataInputStream = this.a;
        if (dataInputStream == null) {
            i.n("dataInput");
            throw null;
        }
        if (dataInputStream != null) {
            DataOutputStream dataOutputStream = this.f14558b;
            if (dataOutputStream == null) {
                i.n("dataOutput");
                throw null;
            }
            if (dataOutputStream != null) {
                return;
            }
        }
        throw new Exception("You forgot to call connect before calling this method.");
    }
}

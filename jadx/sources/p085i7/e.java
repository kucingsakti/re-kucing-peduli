package p085i7;

import android.os.Parcel;
import android.os.Parcelable;
import com.tonyodev.fetch2.database.DownloadInfo;
import com.tonyodev.fetch2core.Extras;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import h7.b;
import h7.f;
import java.io.Serializable;
import java.util.Map;
import kotlin.TypeCastException;
import org.chromium.net.UrlRequest;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Parcelable.Creator {
    /* JADX WARN: Code duplicated, block: B:92:0x012c  */
    /* JADX WARN: Code duplicated, block: B:95:0x013d  */
    /* JADX WARN: Code duplicated, block: B:97:0x0198  */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i10;
        int i11;
        int i12;
        long j;
        long j10;
        boolean z6;
        long j11;
        long j12;
        Serializable serializable;
        int i13;
        i.g(parcel, "source");
        int i14 = parcel.readInt();
        String string = parcel.readString();
        if (string == null) {
            string = "";
        }
        String string2 = parcel.readString();
        if (string2 == null) {
            string2 = "";
        }
        String string3 = parcel.readString();
        String str = string3 != null ? string3 : "";
        int i15 = parcel.readInt();
        int i16 = parcel.readInt();
        if (i16 != -1) {
            i10 = (i16 == 0 || i16 != 1) ? 2 : 1;
        } else {
            i10 = 3;
        }
        Serializable serializable2 = parcel.readSerializable();
        if (serializable2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
        }
        Map map = (Map) serializable2;
        long j13 = parcel.readLong();
        long j14 = parcel.readLong();
        int i17 = parcel.readInt();
        f fVar = f.NONE;
        switch (i17) {
            case 1:
                fVar = f.QUEUED;
                break;
            case 2:
                fVar = f.DOWNLOADING;
                break;
            case 3:
                fVar = f.PAUSED;
                break;
            case 4:
                fVar = f.COMPLETED;
                break;
            case 5:
                fVar = f.CANCELLED;
                break;
            case 6:
                fVar = f.FAILED;
                break;
            case 7:
                fVar = f.REMOVED;
                break;
            case 8:
                fVar = f.DELETED;
                break;
            case 9:
                fVar = f.ADDED;
                break;
        }
        f fVar2 = fVar;
        int i18 = parcel.readInt();
        b bVar = b.UNKNOWN;
        switch (i18) {
            case 0:
                bVar = b.NONE;
                break;
            case 1:
                bVar = b.FILE_NOT_CREATED;
                break;
            case 2:
                bVar = b.CONNECTION_TIMED_OUT;
                break;
            case 3:
                bVar = b.UNKNOWN_HOST;
                break;
            case 4:
                bVar = b.HTTP_NOT_FOUND;
                break;
            case 5:
                bVar = b.WRITE_PERMISSION_DENIED;
                break;
            case 6:
                bVar = b.NO_STORAGE_SPACE;
                break;
            case 7:
                bVar = b.NO_NETWORK_CONNECTION;
                break;
            case 8:
                bVar = b.EMPTY_RESPONSE_FROM_SERVER;
                break;
            case 9:
                bVar = b.REQUEST_ALREADY_EXIST;
                break;
            case 10:
                bVar = b.DOWNLOAD_NOT_FOUND;
                break;
            case 11:
                bVar = b.FETCH_DATABASE_ERROR;
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                bVar = b.REQUEST_WITH_ID_ALREADY_EXIST;
                break;
            case 15:
                bVar = b.REQUEST_NOT_SUCCESSFUL;
                break;
            case 16:
                bVar = b.UNKNOWN_IO_ERROR;
                break;
            case 17:
                bVar = b.FILE_NOT_FOUND;
                break;
            case 19:
                bVar = b.FETCH_FILE_SERVER_URL_INVALID;
                break;
            case 20:
                bVar = b.INVALID_CONTENT_HASH;
                break;
            case MobileAdsBridge.CODE_21 /* 21 */:
                bVar = b.FAILED_TO_UPDATE_REQUEST;
                break;
            case 22:
                bVar = b.FAILED_TO_ADD_COMPLETED_DOWNLOAD;
                break;
            case 23:
                bVar = b.FETCH_FILE_SERVER_INVALID_RESPONSE;
                break;
            case 24:
                bVar = b.REQUEST_DOES_NOT_EXIST;
                break;
            case 25:
                bVar = b.ENQUEUE_NOT_SUCCESSFUL;
                break;
            case 26:
                bVar = b.COMPLETED_NOT_ADDED_SUCCESSFULLY;
                break;
            case 27:
                bVar = b.ENQUEUED_REQUESTS_ARE_NOT_DISTINCT;
                break;
            case 28:
                bVar = b.FAILED_TO_RENAME_INCOMPLETE_DOWNLOAD_FILE;
                break;
            case 29:
                bVar = b.FAILED_TO_RENAME_FILE;
                break;
            case 30:
                bVar = b.FILE_ALLOCATION_FAILED;
                break;
            case 31:
                bVar = b.HTTP_CONNECTION_NOT_ALLOWED;
                break;
        }
        b bVar2 = bVar;
        int i19 = parcel.readInt();
        if (i19 != -1) {
            if (i19 == 0) {
                i13 = 2;
            } else if (i19 != 1) {
                i13 = 2;
                if (i19 == 2) {
                    i11 = 4;
                }
            } else {
                i11 = 3;
            }
            i11 = i13;
        } else {
            i11 = 1;
        }
        long j15 = parcel.readLong();
        String string4 = parcel.readString();
        int i20 = parcel.readInt();
        if (i20 != 1) {
            if (i20 != 2) {
                j = j15;
                i12 = i20 != 3 ? 1 : 4;
            } else {
                i12 = 3;
            }
            j10 = parcel.readLong();
            z6 = parcel.readInt() == 1;
            j11 = parcel.readLong();
            j12 = parcel.readLong();
            serializable = parcel.readSerializable();
            if (serializable != null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
            }
            int i21 = parcel.readInt();
            int i22 = parcel.readInt();
            DownloadInfo downloadInfo = new DownloadInfo();
            downloadInfo.f10360s = i14;
            downloadInfo.f10361t = string;
            downloadInfo.f10362u = string2;
            downloadInfo.f10363v = str;
            downloadInfo.f10364w = i15;
            downloadInfo.f10365x = i10;
            downloadInfo.f10366y = map;
            downloadInfo.f10367z = j13;
            downloadInfo.f10346A = j14;
            downloadInfo.f10347B = fVar2;
            downloadInfo.f10348C = bVar2;
            downloadInfo.f10349D = i11;
            downloadInfo.f10350E = j;
            downloadInfo.f10351F = string4;
            downloadInfo.f10352G = i12;
            downloadInfo.f10353H = j10;
            downloadInfo.f10354I = z6;
            downloadInfo.f10358M = j11;
            downloadInfo.f10359N = j12;
            downloadInfo.f10355J = new Extras((Map) serializable);
            downloadInfo.f10356K = i21;
            downloadInfo.f10357L = i22;
            return downloadInfo;
        }
        i12 = 2;
        j = j15;
        j10 = parcel.readLong();
        if (parcel.readInt() == 1) {
        }
        j11 = parcel.readLong();
        j12 = parcel.readLong();
        serializable = parcel.readSerializable();
        if (serializable != null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
        }
        int i23 = parcel.readInt();
        int i24 = parcel.readInt();
        DownloadInfo downloadInfo2 = new DownloadInfo();
        downloadInfo2.f10360s = i14;
        downloadInfo2.f10361t = string;
        downloadInfo2.f10362u = string2;
        downloadInfo2.f10363v = str;
        downloadInfo2.f10364w = i15;
        downloadInfo2.f10365x = i10;
        downloadInfo2.f10366y = map;
        downloadInfo2.f10367z = j13;
        downloadInfo2.f10346A = j14;
        downloadInfo2.f10347B = fVar2;
        downloadInfo2.f10348C = bVar2;
        downloadInfo2.f10349D = i11;
        downloadInfo2.f10350E = j;
        downloadInfo2.f10351F = string4;
        downloadInfo2.f10352G = i12;
        downloadInfo2.f10353H = j10;
        downloadInfo2.f10354I = z6;
        downloadInfo2.f10358M = j11;
        downloadInfo2.f10359N = j12;
        downloadInfo2.f10355J = new Extras((Map) serializable);
        downloadInfo2.f10356K = i23;
        downloadInfo2.f10357L = i24;
        return downloadInfo2;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new DownloadInfo[i10];
    }
}

package p137o0;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import xa.d;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final String[] f13584D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final int[] f13585E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final byte[] f13586F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final d f13587G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final d[][] f13588H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final d[] f13589I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final HashMap[] f13590J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final HashMap[] f13591K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final HashSet f13592L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final HashMap f13593M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final Charset f13594N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final byte[] f13595O;
    public static final byte[] P;
    public final FileDescriptor a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AssetManager.AssetInputStream f13611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap[] f13613d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f13614e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ByteOrder f13615f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f13616g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f13617h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f13618i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f13619k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final boolean f13596l = Log.isLoggable("ExifInterface", 3);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final List f13597m = Arrays.asList(1, 6, 3, 8);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final List f13598n = Arrays.asList(2, 7, 4, 5);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[] f13599o = {8, 8, 8};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int[] f13600p = {8};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final byte[] f13601q = {-1, -40, -1};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final byte[] f13602r = {102, 116, 121, 112};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final byte[] f13603s = {109, 105, 102, 49};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final byte[] f13604t = {104, 101, 105, 99};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final byte[] f13605u = {79, 76, 89, 77, 80, 0};

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final byte[] f13606v = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final byte[] f13607w = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final byte[] f13608x = {101, 88, 73, 102};

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final byte[] f13609y = {73, 72, 68, 82};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final byte[] f13610z = {73, 69, 78, 68};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final byte[] f13581A = {82, 73, 70, 70};

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final byte[] f13582B = {87, 69, 66, 80};

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final byte[] f13583C = {69, 88, 73, 70};

    static {
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        f13584D = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        f13585E = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        f13586F = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        d[] dVarArr = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ImageWidth", 256, 3, 4), new d("ImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("Orientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("SensorTopBorder", 4, 4), new d("SensorLeftBorder", 5, 4), new d("SensorBottomBorder", 6, 4), new d("SensorRightBorder", 7, 4), new d("ISO", 23, 3), new d("JpgFromRaw", 46, 7), new d("Xmp", 700, 1)};
        d[] dVarArr2 = {new d("ExposureTime", 33434, 5), new d("FNumber", 33437, 5), new d("ExposureProgram", 34850, 3), new d("SpectralSensitivity", 34852, 2), new d("PhotographicSensitivity", 34855, 3), new d("OECF", 34856, 7), new d("SensitivityType", 34864, 3), new d("StandardOutputSensitivity", 34865, 4), new d("RecommendedExposureIndex", 34866, 4), new d("ISOSpeed", 34867, 4), new d("ISOSpeedLatitudeyyy", 34868, 4), new d("ISOSpeedLatitudezzz", 34869, 4), new d("ExifVersion", 36864, 2), new d("DateTimeOriginal", 36867, 2), new d("DateTimeDigitized", 36868, 2), new d("OffsetTime", 36880, 2), new d("OffsetTimeOriginal", 36881, 2), new d("OffsetTimeDigitized", 36882, 2), new d("ComponentsConfiguration", 37121, 7), new d("CompressedBitsPerPixel", 37122, 5), new d("ShutterSpeedValue", 37377, 10), new d("ApertureValue", 37378, 5), new d("BrightnessValue", 37379, 10), new d("ExposureBiasValue", 37380, 10), new d("MaxApertureValue", 37381, 5), new d("SubjectDistance", 37382, 5), new d("MeteringMode", 37383, 3), new d("LightSource", 37384, 3), new d("Flash", 37385, 3), new d("FocalLength", 37386, 5), new d("SubjectArea", 37396, 3), new d("MakerNote", 37500, 7), new d("UserComment", 37510, 7), new d("SubSecTime", 37520, 2), new d("SubSecTimeOriginal", 37521, 2), new d("SubSecTimeDigitized", 37522, 2), new d("FlashpixVersion", 40960, 7), new d("ColorSpace", 40961, 3), new d("PixelXDimension", 40962, 3, 4), new d("PixelYDimension", 40963, 3, 4), new d("RelatedSoundFile", 40964, 2), new d("InteroperabilityIFDPointer", 40965, 4), new d("FlashEnergy", 41483, 5), new d("SpatialFrequencyResponse", 41484, 7), new d("FocalPlaneXResolution", 41486, 5), new d("FocalPlaneYResolution", 41487, 5), new d("FocalPlaneResolutionUnit", 41488, 3), new d("SubjectLocation", 41492, 3), new d("ExposureIndex", 41493, 5), new d("SensingMethod", 41495, 3), new d("FileSource", 41728, 7), new d("SceneType", 41729, 7), new d("CFAPattern", 41730, 7), new d("CustomRendered", 41985, 3), new d("ExposureMode", 41986, 3), new d("WhiteBalance", 41987, 3), new d("DigitalZoomRatio", 41988, 5), new d("FocalLengthIn35mmFilm", 41989, 3), new d("SceneCaptureType", 41990, 3), new d("GainControl", 41991, 3), new d("Contrast", 41992, 3), new d("Saturation", 41993, 3), new d("Sharpness", 41994, 3), new d("DeviceSettingDescription", 41995, 7), new d("SubjectDistanceRange", 41996, 3), new d("ImageUniqueID", 42016, 2), new d("CameraOwnerName", 42032, 2), new d("BodySerialNumber", 42033, 2), new d("LensSpecification", 42034, 5), new d("LensMake", 42035, 2), new d("LensModel", 42036, 2), new d("Gamma", 42240, 5), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        d[] dVarArr3 = {new d("GPSVersionID", 0, 1), new d("GPSLatitudeRef", 1, 2), new d("GPSLatitude", 2, 5, 10), new d("GPSLongitudeRef", 3, 2), new d("GPSLongitude", 4, 5, 10), new d("GPSAltitudeRef", 5, 1), new d("GPSAltitude", 6, 5), new d("GPSTimeStamp", 7, 5), new d("GPSSatellites", 8, 2), new d("GPSStatus", 9, 2), new d("GPSMeasureMode", 10, 2), new d("GPSDOP", 11, 5), new d("GPSSpeedRef", 12, 2), new d("GPSSpeed", 13, 5), new d("GPSTrackRef", 14, 2), new d("GPSTrack", 15, 5), new d("GPSImgDirectionRef", 16, 2), new d("GPSImgDirection", 17, 5), new d("GPSMapDatum", 18, 2), new d("GPSDestLatitudeRef", 19, 2), new d("GPSDestLatitude", 20, 5), new d("GPSDestLongitudeRef", 21, 2), new d("GPSDestLongitude", 22, 5), new d("GPSDestBearingRef", 23, 2), new d("GPSDestBearing", 24, 5), new d("GPSDestDistanceRef", 25, 2), new d("GPSDestDistance", 26, 5), new d("GPSProcessingMethod", 27, 7), new d("GPSAreaInformation", 28, 7), new d("GPSDateStamp", 29, 2), new d("GPSDifferential", 30, 3), new d("GPSHPositioningError", 31, 5)};
        d[] dVarArr4 = {new d("InteroperabilityIndex", 1, 2)};
        d[] dVarArr5 = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ThumbnailImageWidth", 256, 3, 4), new d("ThumbnailImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("ThumbnailOrientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Xmp", 700, 1), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        f13587G = new d("StripOffsets", 273, 3);
        f13588H = new d[][]{dVarArr, dVarArr2, dVarArr3, dVarArr4, dVarArr5, dVarArr, new d[]{new d("ThumbnailImage", 256, 7), new d("CameraSettingsIFDPointer", 8224, 4), new d("ImageProcessingIFDPointer", 8256, 4)}, new d[]{new d("PreviewImageStart", 257, 4), new d("PreviewImageLength", 258, 4)}, new d[]{new d("AspectFrame", 4371, 3)}, new d[]{new d("ColorSpace", 55, 3)}};
        f13589I = new d[]{new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1)};
        f13590J = new HashMap[10];
        f13591K = new HashMap[10];
        f13592L = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f13593M = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        f13594N = charsetForName;
        f13595O = "Exif\u0000\u0000".getBytes(charsetForName);
        P = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i10 = 0;
        while (true) {
            d[][] dVarArr6 = f13588H;
            if (i10 >= dVarArr6.length) {
                HashMap map = f13593M;
                d[] dVarArr7 = f13589I;
                map.put(Integer.valueOf(dVarArr7[0].a), 5);
                map.put(Integer.valueOf(dVarArr7[1].a), 1);
                map.put(Integer.valueOf(dVarArr7[2].a), 2);
                map.put(Integer.valueOf(dVarArr7[3].a), 3);
                map.put(Integer.valueOf(dVarArr7[4].a), 7);
                map.put(Integer.valueOf(dVarArr7[5].a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f13590J[i10] = new HashMap();
            f13591K[i10] = new HashMap();
            for (d dVar : dVarArr6[i10]) {
                f13590J[i10].put(Integer.valueOf(dVar.a), dVar);
                f13591K[i10].put(dVar.f13577b, dVar);
            }
            i10++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00d1 A[Catch: all -> 0x0057, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0057, blocks: (B:12:0x0048, B:14:0x004b, B:21:0x0060, B:27:0x007d, B:29:0x0088, B:37:0x009e, B:32:0x008f, B:35:0x0097, B:36:0x009b, B:38:0x00a8, B:40:0x00b1, B:42:0x00b7, B:44:0x00bd, B:46:0x00c3, B:51:0x00d1), top: B:64:0x0048 }] */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    public g(InputStream inputStream) throws Throwable {
        d[][] dVarArr = f13588H;
        this.f13613d = new HashMap[dVarArr.length];
        this.f13614e = new HashSet(dVarArr.length);
        this.f13615f = ByteOrder.BIG_ENDIAN;
        if (inputStream instanceof AssetManager.AssetInputStream) {
            this.f13611b = (AssetManager.AssetInputStream) inputStream;
            this.a = null;
        } else if (inputStream instanceof FileInputStream) {
            FileInputStream fileInputStream = (FileInputStream) inputStream;
            try {
                h.c(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                this.f13611b = null;
                this.a = fileInputStream.getFD();
            } catch (Exception unused) {
                this.f13611b = null;
                this.a = null;
            }
        } else {
            this.f13611b = null;
            this.a = null;
        }
        boolean z6 = f13596l;
        for (int i10 = 0; i10 < dVarArr.length; i10++) {
            try {
                try {
                    this.f13613d[i10] = new HashMap();
                } catch (Throwable th) {
                    a();
                    if (z6) {
                        p();
                    }
                    throw th;
                }
            } catch (IOException e10) {
                e = e10;
                if (z6) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                a();
                if (!z6) {
                    return;
                }
            } catch (UnsupportedOperationException e11) {
                e = e11;
                if (z6) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                a();
                if (!z6) {
                    return;
                }
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
        int iF = f(bufferedInputStream);
        this.f13612c = iF;
        if (iF == 4 || iF == 9 || iF == 13 || iF == 14) {
            b bVar = new b(bufferedInputStream);
            int i11 = this.f13612c;
            if (i11 == 4) {
                e(bVar, 0, 0);
            } else if (i11 == 13) {
                h(bVar);
            } else if (i11 == 9) {
                i(bVar);
            } else if (i11 == 14) {
                l(bVar);
            }
        } else {
            f fVar = new f(bufferedInputStream);
            int i12 = this.f13612c;
            if (i12 == 12) {
                d(fVar);
            } else if (i12 == 7) {
                g(fVar);
            } else if (i12 == 10) {
                k(fVar);
            } else {
                j(fVar);
            }
            fVar.b(this.f13617h);
            u(fVar);
        }
        a();
        if (!z6) {
            return;
        }
        p();
    }

    public static ByteOrder q(b bVar) throws IOException {
        short s9 = bVar.readShort();
        if (s9 == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s9 == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s9));
    }

    public final void a() {
        String strB = b("DateTimeOriginal");
        HashMap[] mapArr = this.f13613d;
        if (strB != null && b("DateTime") == null) {
            HashMap map = mapArr[0];
            byte[] bytes = strB.concat("\u0000").getBytes(f13594N);
            map.put("DateTime", new c(bytes, 2, bytes.length));
        }
        if (b("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", c.a(0L, this.f13615f));
        }
        if (b("ImageLength") == null) {
            mapArr[0].put("ImageLength", c.a(0L, this.f13615f));
        }
        if (b("Orientation") == null) {
            mapArr[0].put("Orientation", c.a(0L, this.f13615f));
        }
        if (b("LightSource") == null) {
            mapArr[1].put("LightSource", c.a(0L, this.f13615f));
        }
    }

    public final String b(String str) {
        c cVarC = c(str);
        if (cVarC != null) {
            if (!f13592L.contains(str)) {
                return cVarC.f(this.f13615f);
            }
            if (str.equals("GPSTimeStamp")) {
                int i10 = cVarC.a;
                if (i10 != 5 && i10 != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i10);
                    return null;
                }
                e[] eVarArr = (e[]) cVarC.g(this.f13615f);
                if (eVarArr == null || eVarArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(eVarArr));
                    return null;
                }
                e eVar = eVarArr[0];
                Integer numValueOf = Integer.valueOf((int) (eVar.a / eVar.f13580b));
                e eVar2 = eVarArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (eVar2.a / eVar2.f13580b));
                e eVar3 = eVarArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (eVar3.a / eVar3.f13580b)));
            }
            try {
                return Double.toString(cVarC.d(this.f13615f));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final c c(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        for (int i10 = 0; i10 < f13588H.length; i10++) {
            c cVar = (c) this.f13613d[i10].get(str);
            if (cVar != null) {
                return cVar;
            }
        }
        return null;
    }

    public final void d(f fVar) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        int i10;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                i.a(mediaMetadataRetriever, new a(fVar));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                HashMap[] mapArr = this.f13613d;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", c.c(Integer.parseInt(strExtractMetadata), this.f13615f));
                }
                if (strExtractMetadata2 != null) {
                    mapArr[0].put("ImageLength", c.c(Integer.parseInt(strExtractMetadata2), this.f13615f));
                }
                if (strExtractMetadata3 != null) {
                    int i11 = Integer.parseInt(strExtractMetadata3);
                    if (i11 == 90) {
                        i10 = 6;
                    } else if (i11 != 180) {
                        i10 = i11 != 270 ? 1 : 8;
                    } else {
                        i10 = 3;
                    }
                    mapArr[0].put("Orientation", c.c(i10, this.f13615f));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i12 = Integer.parseInt(strExtractMetadata4);
                    int i13 = Integer.parseInt(strExtractMetadata5);
                    if (i13 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    fVar.b(i12);
                    byte[] bArr = new byte[6];
                    if (fVar.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i14 = i12 + 6;
                    int i15 = i13 - 6;
                    if (!Arrays.equals(bArr, f13595O)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i15];
                    if (fVar.read(bArr2) != i15) {
                        throw new IOException("Can't read exif");
                    }
                    this.f13617h = i14;
                    r(0, bArr2);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0153 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x0108 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x0148 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x006b A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:36:0x0072  */
    /* JADX WARN: Code duplicated, block: B:37:0x0075  */
    /* JADX WARN: Code duplicated, block: B:40:0x0089  */
    /* JADX WARN: Code duplicated, block: B:41:0x008c  */
    /* JADX WARN: Code duplicated, block: B:71:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:74:0x0105 A[LOOP:2: B:69:0x00fb->B:74:0x0105, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x0117  */
    /* JADX WARN: Code duplicated, block: B:82:0x014c A[LOOP:0: B:10:0x0024->B:82:0x014c, LOOP_END] */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    public final void e(p137o0.b r23, int r24, int r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p137o0.g.e(o0.b, int, int):void");
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0126 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:104:0x0129  */
    /* JADX WARN: Code duplicated, block: B:107:0x012f  */
    /* JADX WARN: Code duplicated, block: B:110:0x0137 A[LOOP:2: B:105:0x012a->B:110:0x0137, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:113:0x013d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:115:0x0140  */
    /* JADX WARN: Code duplicated, block: B:118:0x0146  */
    /* JADX WARN: Code duplicated, block: B:121:0x014e A[LOOP:3: B:116:0x0141->B:121:0x014e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:125:0x0157  */
    /* JADX WARN: Code duplicated, block: B:128:0x0161 A[LOOP:4: B:123:0x0152->B:128:0x0161, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:131:0x0167 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:146:0x00f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:155:0x013a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:0x0135 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x0151 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x014c A[EDGE_INSN: B:158:0x014c->B:120:0x014c BREAK  A[LOOP:3: B:116:0x0141->B:121:0x014e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x0164 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x014c A[EDGE_INSN: B:160:0x014c->B:120:0x014c BREAK  A[LOOP:3: B:116:0x0141->B:121:0x014e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:86:0x0107  */
    /* JADX WARN: Code duplicated, block: B:87:0x0109  */
    public final int f(BufferedInputStream bufferedInputStream) throws Throwable {
        b bVar;
        b bVar2;
        b bVar3;
        b bVar4;
        boolean z6;
        b bVar5;
        b bVar6;
        boolean z10;
        int i10;
        byte[] bArr;
        boolean z11;
        int i11;
        byte[] bArr2;
        int i12;
        byte[] bArr3;
        boolean z12;
        b bVar7;
        short s9;
        long j;
        bufferedInputStream.mark(5000);
        byte[] bArr4 = new byte[5000];
        bufferedInputStream.read(bArr4);
        bufferedInputStream.reset();
        int i13 = 0;
        while (true) {
            byte[] bArr5 = f13601q;
            if (i13 >= bArr5.length) {
                return 4;
            }
            if (bArr4[i13] != bArr5[i13]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i14 = 0; i14 < bytes.length; i14++) {
                    if (bArr4[i14] != bytes[i14]) {
                        try {
                            bVar2 = new b(bArr4);
                            try {
                                long j10 = bVar2.readInt();
                                byte[] bArr6 = new byte[4];
                                bVar2.read(bArr6);
                                if (Arrays.equals(bArr6, f13602r)) {
                                    if (j10 == 1) {
                                        j10 = bVar2.readLong();
                                        j = 16;
                                        if (j10 < 16) {
                                        }
                                    } else {
                                        j = 8;
                                    }
                                    long j11 = 5000;
                                    if (j10 > j11) {
                                        j10 = j11;
                                    }
                                    long j12 = j10 - j;
                                    if (j12 >= 8) {
                                        byte[] bArr7 = new byte[4];
                                        boolean z13 = false;
                                        boolean z14 = false;
                                        for (long j13 = 0; j13 < j12 / 4 && bVar2.read(bArr7) == 4; j13++) {
                                            if (j13 != 1) {
                                                if (Arrays.equals(bArr7, f13603s)) {
                                                    z13 = true;
                                                } else if (Arrays.equals(bArr7, f13604t)) {
                                                    z14 = true;
                                                }
                                                if (z13 && z14) {
                                                    bVar2.close();
                                                    return 12;
                                                }
                                            }
                                        }
                                    }
                                }
                            } catch (Exception unused) {
                                if (bVar2 != null) {
                                }
                                bVar4 = new b(bArr4);
                                ByteOrder byteOrderQ = q(bVar4);
                                this.f13615f = byteOrderQ;
                                bVar4.f13571t = byteOrderQ;
                                s9 = bVar4.readShort();
                                if (s9 != 20306) {
                                    z6 = true;
                                } else {
                                    z6 = true;
                                }
                                bVar4.close();
                                if (z6) {
                                    return 7;
                                }
                                try {
                                    bVar7 = new b(bArr4);
                                    try {
                                        ByteOrder byteOrderQ2 = q(bVar7);
                                        this.f13615f = byteOrderQ2;
                                        bVar7.f13571t = byteOrderQ2;
                                        if (bVar7.readShort() == 85) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        bVar7.close();
                                    } catch (Exception unused2) {
                                        bVar6 = bVar7;
                                        if (bVar6 != null) {
                                            bVar6.close();
                                        }
                                        z10 = false;
                                    } catch (Throwable th) {
                                        th = th;
                                        bVar5 = bVar7;
                                        if (bVar5 != null) {
                                            bVar5.close();
                                        }
                                        throw th;
                                    }
                                } catch (Exception unused3) {
                                    bVar6 = null;
                                } catch (Throwable th2) {
                                    th = th2;
                                    bVar5 = null;
                                }
                                if (z10) {
                                    return 10;
                                }
                                i10 = 0;
                                while (true) {
                                    bArr = f13607w;
                                    if (i10 < bArr.length) {
                                        z11 = true;
                                        break;
                                    }
                                    if (bArr4[i10] != bArr[i10]) {
                                        z11 = false;
                                        break;
                                    }
                                    i10++;
                                }
                                if (z11) {
                                    return 13;
                                }
                                i11 = 0;
                                while (true) {
                                    bArr2 = f13581A;
                                    if (i11 < bArr2.length) {
                                        i12 = 0;
                                        while (true) {
                                            bArr3 = f13582B;
                                            if (i12 < bArr3.length) {
                                                z12 = true;
                                                break;
                                            }
                                            if (bArr4[bArr2.length + i12 + 4] != bArr3[i12]) {
                                                break;
                                            }
                                            i12++;
                                        }
                                        if (z12) {
                                            return 14;
                                        }
                                        return 0;
                                    }
                                    if (bArr4[i11] != bArr2[i11]) {
                                        break;
                                    }
                                    i11++;
                                }
                                z12 = false;
                                if (z12) {
                                    return 14;
                                }
                                return 0;
                            } catch (Throwable th3) {
                                th = th3;
                                bVar = bVar2;
                                if (bVar != null) {
                                    bVar.close();
                                }
                                throw th;
                            }
                        } catch (Exception unused4) {
                            bVar2 = null;
                        } catch (Throwable th4) {
                            th = th4;
                            bVar = null;
                        }
                        bVar2.close();
                        try {
                            bVar4 = new b(bArr4);
                            try {
                                ByteOrder byteOrderQ3 = q(bVar4);
                                this.f13615f = byteOrderQ3;
                                bVar4.f13571t = byteOrderQ3;
                                s9 = bVar4.readShort();
                                if (s9 != 20306 || s9 == 21330) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                bVar4.close();
                            } catch (Exception unused5) {
                                if (bVar4 != null) {
                                    bVar4.close();
                                }
                                z6 = false;
                            } catch (Throwable th5) {
                                th = th5;
                                bVar3 = bVar4;
                                if (bVar3 != null) {
                                    bVar3.close();
                                }
                                throw th;
                            }
                        } catch (Exception unused6) {
                            bVar4 = null;
                        } catch (Throwable th6) {
                            th = th6;
                            bVar3 = null;
                        }
                        if (z6) {
                            return 7;
                        }
                        bVar7 = new b(bArr4);
                        ByteOrder byteOrderQ4 = q(bVar7);
                        this.f13615f = byteOrderQ4;
                        bVar7.f13571t = byteOrderQ4;
                        if (bVar7.readShort() == 85) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        bVar7.close();
                        if (z10) {
                            return 10;
                        }
                        i10 = 0;
                        while (true) {
                            bArr = f13607w;
                            if (i10 < bArr.length) {
                                z11 = true;
                                break;
                            }
                            if (bArr4[i10] != bArr[i10]) {
                                z11 = false;
                                break;
                            }
                            i10++;
                        }
                        if (z11) {
                            return 13;
                        }
                        i11 = 0;
                        while (true) {
                            bArr2 = f13581A;
                            if (i11 < bArr2.length) {
                                i12 = 0;
                                while (true) {
                                    bArr3 = f13582B;
                                    if (i12 < bArr3.length) {
                                        z12 = true;
                                        break;
                                    }
                                    if (bArr4[bArr2.length + i12 + 4] != bArr3[i12]) {
                                        break;
                                        break;
                                    }
                                    i12++;
                                }
                                if (z12) {
                                    return 14;
                                }
                                return 0;
                            }
                            if (bArr4[i11] != bArr2[i11]) {
                                break;
                                break;
                            }
                            i11++;
                        }
                        z12 = false;
                        if (z12) {
                            return 14;
                        }
                        return 0;
                    }
                }
                return 9;
            }
            i13++;
        }
    }

    public final void g(f fVar) throws Throwable {
        int i10;
        int i11;
        j(fVar);
        HashMap[] mapArr = this.f13613d;
        c cVar = (c) mapArr[1].get("MakerNote");
        if (cVar != null) {
            f fVar2 = new f(cVar.f13576d);
            fVar2.f13571t = this.f13615f;
            byte[] bArr = f13605u;
            byte[] bArr2 = new byte[bArr.length];
            fVar2.readFully(bArr2);
            fVar2.b(0L);
            byte[] bArr3 = f13606v;
            byte[] bArr4 = new byte[bArr3.length];
            fVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                fVar2.b(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                fVar2.b(12L);
            }
            s(fVar2, 6);
            c cVar2 = (c) mapArr[7].get("PreviewImageStart");
            c cVar3 = (c) mapArr[7].get("PreviewImageLength");
            if (cVar2 != null && cVar3 != null) {
                mapArr[5].put("JPEGInterchangeFormat", cVar2);
                mapArr[5].put("JPEGInterchangeFormatLength", cVar3);
            }
            c cVar4 = (c) mapArr[8].get("AspectFrame");
            if (cVar4 != null) {
                int[] iArr = (int[]) cVar4.g(this.f13615f);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i12 = iArr[2];
                int i13 = iArr[0];
                if (i12 <= i13 || (i10 = iArr[3]) <= (i11 = iArr[1])) {
                    return;
                }
                int i14 = (i12 - i13) + 1;
                int i15 = (i10 - i11) + 1;
                if (i14 < i15) {
                    int i16 = i14 + i15;
                    i15 = i16 - i15;
                    i14 = i16 - i15;
                }
                c cVarC = c.c(i14, this.f13615f);
                c cVarC2 = c.c(i15, this.f13615f);
                mapArr[0].put("ImageWidth", cVarC);
                mapArr[0].put("ImageLength", cVarC2);
            }
        }
    }

    public final void h(b bVar) throws Throwable {
        if (f13596l) {
            Objects.toString(bVar);
        }
        bVar.f13571t = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f13607w;
        bVar.a(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i10 = bVar.readInt();
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i11 = length + 8;
                if (i11 == 16 && !Arrays.equals(bArr2, f13609y)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f13610z)) {
                    return;
                }
                if (Arrays.equals(bArr2, f13608x)) {
                    byte[] bArr3 = new byte[i10];
                    if (bVar.read(bArr3) != i10) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + d.a(bArr2));
                    }
                    int i12 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i12) {
                        this.f13617h = i11;
                        r(0, bArr3);
                        x();
                        u(new b(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i12 + ", calculated CRC value: " + crc32.getValue());
                }
                int i13 = i10 + 4;
                bVar.a(i13);
                length = i11 + i13;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void i(b bVar) throws Throwable {
        if (f13596l) {
            Objects.toString(bVar);
        }
        bVar.a(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.read(bArr);
        bVar.read(bArr2);
        bVar.read(bArr3);
        int i10 = ByteBuffer.wrap(bArr).getInt();
        int i11 = ByteBuffer.wrap(bArr2).getInt();
        int i12 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i11];
        bVar.a(i10 - bVar.f13572u);
        bVar.read(bArr4);
        e(new b(bArr4), i10, 5);
        bVar.a(i12 - bVar.f13572u);
        bVar.f13571t = ByteOrder.BIG_ENDIAN;
        int i13 = bVar.readInt();
        for (int i14 = 0; i14 < i13; i14++) {
            int unsignedShort = bVar.readUnsignedShort();
            int unsignedShort2 = bVar.readUnsignedShort();
            if (unsignedShort == f13587G.a) {
                short s9 = bVar.readShort();
                short s10 = bVar.readShort();
                c cVarC = c.c(s9, this.f13615f);
                c cVarC2 = c.c(s10, this.f13615f);
                HashMap[] mapArr = this.f13613d;
                mapArr[0].put("ImageLength", cVarC);
                mapArr[0].put("ImageWidth", cVarC2);
                return;
            }
            bVar.a(unsignedShort2);
        }
    }

    public final void j(f fVar) throws Throwable {
        o(fVar);
        s(fVar, 0);
        w(fVar, 0);
        w(fVar, 5);
        w(fVar, 4);
        x();
        if (this.f13612c == 8) {
            HashMap[] mapArr = this.f13613d;
            c cVar = (c) mapArr[1].get("MakerNote");
            if (cVar != null) {
                f fVar2 = new f(cVar.f13576d);
                fVar2.f13571t = this.f13615f;
                fVar2.a(6);
                s(fVar2, 9);
                c cVar2 = (c) mapArr[9].get("ColorSpace");
                if (cVar2 != null) {
                    mapArr[1].put("ColorSpace", cVar2);
                }
            }
        }
    }

    public final void k(f fVar) throws Throwable {
        if (f13596l) {
            Objects.toString(fVar);
        }
        j(fVar);
        HashMap[] mapArr = this.f13613d;
        c cVar = (c) mapArr[0].get("JpgFromRaw");
        if (cVar != null) {
            e(new b(cVar.f13576d), (int) cVar.f13575c, 5);
        }
        c cVar2 = (c) mapArr[0].get("ISO");
        c cVar3 = (c) mapArr[1].get("PhotographicSensitivity");
        if (cVar2 == null || cVar3 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", cVar2);
    }

    public final void l(b bVar) throws Throwable {
        if (f13596l) {
            Objects.toString(bVar);
        }
        bVar.f13571t = ByteOrder.LITTLE_ENDIAN;
        bVar.a(f13581A.length);
        int i10 = bVar.readInt() + 8;
        byte[] bArr = f13582B;
        bVar.a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int i11 = bVar.readInt();
                int i12 = length + 8;
                if (Arrays.equals(f13583C, bArr2)) {
                    byte[] bArr3 = new byte[i11];
                    if (bVar.read(bArr3) == i11) {
                        this.f13617h = i12;
                        r(0, bArr3);
                        u(new b(bArr3));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + d.a(bArr2));
                    }
                }
                if (i11 % 2 == 1) {
                    i11++;
                }
                length = i12 + i11;
                if (length == i10) {
                    return;
                }
                if (length > i10) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.a(i11);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void m(b bVar, HashMap map) throws Throwable {
        c cVar = (c) map.get("JPEGInterchangeFormat");
        c cVar2 = (c) map.get("JPEGInterchangeFormatLength");
        if (cVar == null || cVar2 == null) {
            return;
        }
        int iE = cVar.e(this.f13615f);
        int iE2 = cVar2.e(this.f13615f);
        if (this.f13612c == 7) {
            iE += this.f13618i;
        }
        if (iE <= 0 || iE2 <= 0 || this.f13611b != null || this.a != null) {
            return;
        }
        bVar.skip(iE);
        bVar.read(new byte[iE2]);
    }

    public final boolean n(HashMap map) {
        c cVar = (c) map.get("ImageLength");
        c cVar2 = (c) map.get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            return false;
        }
        return cVar.e(this.f13615f) <= 512 && cVar2.e(this.f13615f) <= 512;
    }

    public final void o(f fVar) throws IOException {
        ByteOrder byteOrderQ = q(fVar);
        this.f13615f = byteOrderQ;
        fVar.f13571t = byteOrderQ;
        int unsignedShort = fVar.readUnsignedShort();
        int i10 = this.f13612c;
        if (i10 != 7 && i10 != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i11 = fVar.readInt();
        if (i11 < 8) {
            throw new IOException(AbstractC0487g.g(i11, "Invalid first Ifd offset: "));
        }
        int i12 = i11 - 8;
        if (i12 > 0) {
            fVar.a(i12);
        }
    }

    public final void p() throws Throwable {
        int i10 = 0;
        while (true) {
            HashMap[] mapArr = this.f13613d;
            if (i10 >= mapArr.length) {
                return;
            }
            mapArr[i10].size();
            for (Map.Entry entry : mapArr[i10].entrySet()) {
                c cVar = (c) entry.getValue();
                cVar.toString();
                cVar.f(this.f13615f);
            }
            i10++;
        }
    }

    public final void r(int i10, byte[] bArr) throws IOException {
        f fVar = new f(bArr);
        o(fVar);
        s(fVar, i10);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:106:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:108:0x020e  */
    /* JADX WARN: Code duplicated, block: B:109:0x0212  */
    /* JADX WARN: Code duplicated, block: B:123:0x024d  */
    /* JADX WARN: Code duplicated, block: B:143:0x0250 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:68:0x010a  */
    /* JADX WARN: Code duplicated, block: B:70:0x0114  */
    /* JADX WARN: Code duplicated, block: B:71:0x0116  */
    /* JADX WARN: Code duplicated, block: B:72:0x011b  */
    /* JADX WARN: Code duplicated, block: B:78:0x0163  */
    /* JADX WARN: Code duplicated, block: B:81:0x0179  */
    /* JADX WARN: Code duplicated, block: B:83:0x017c  */
    /* JADX WARN: Code duplicated, block: B:85:0x017f  */
    /* JADX WARN: Code duplicated, block: B:87:0x0183  */
    /* JADX WARN: Code duplicated, block: B:94:0x0194  */
    /* JADX WARN: Code duplicated, block: B:95:0x0199  */
    /* JADX WARN: Code duplicated, block: B:96:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:98:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:99:0x01c0  */
    public final void s(f fVar, int i10) throws IOException {
        HashMap[] mapArr;
        boolean z6;
        int i11;
        int i12;
        int i13;
        long j;
        boolean z10;
        int i14;
        int i15;
        HashMap[] mapArr2;
        Integer num;
        String str;
        int unsignedShort;
        long j10;
        int i16;
        int i17 = 5;
        Integer numValueOf = Integer.valueOf(fVar.f13572u);
        HashSet hashSet = this.f13614e;
        hashSet.add(numValueOf);
        short s9 = fVar.readShort();
        if (s9 <= 0) {
            return;
        }
        short s10 = 0;
        while (true) {
            mapArr = this.f13613d;
            z6 = f13596l;
            if (s10 >= s9) {
                break;
            }
            int unsignedShort2 = fVar.readUnsignedShort();
            int unsignedShort3 = fVar.readUnsignedShort();
            int i18 = fVar.readInt();
            short s11 = s9;
            long j11 = ((long) fVar.f13572u) + 4;
            d dVar = (d) f13590J[i10].get(Integer.valueOf(unsignedShort2));
            if (z6) {
                Integer numValueOf2 = Integer.valueOf(i10);
                Integer numValueOf3 = Integer.valueOf(unsignedShort2);
                i11 = 3;
                String str2 = dVar != null ? dVar.f13577b : null;
                Integer numValueOf4 = Integer.valueOf(unsignedShort3);
                Integer numValueOf5 = Integer.valueOf(i18);
                i12 = 4;
                Object[] objArr = new Object[i17];
                objArr[0] = numValueOf2;
                objArr[1] = numValueOf3;
                objArr[2] = str2;
                objArr[3] = numValueOf4;
                objArr[4] = numValueOf5;
                String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", objArr);
            } else {
                i11 = 3;
                i12 = 4;
            }
            if (dVar != null && unsignedShort3 > 0) {
                i13 = i17;
                int[] iArr = f13585E;
                if (unsignedShort3 < iArr.length) {
                    int i19 = dVar.f13578c;
                    if (i19 == 7 || unsignedShort3 == 7 || i19 == unsignedShort3 || (i14 = dVar.f13579d) == unsignedShort3 || (((i19 == (i15 = i12) || i14 == i15) && unsignedShort3 == i11) || (((i19 == 9 || i14 == 9) && unsignedShort3 == 8) || ((i19 == 12 || i14 == 12) && unsignedShort3 == 11)))) {
                        if (unsignedShort3 == 7) {
                            unsignedShort3 = i19;
                        }
                        j = ((long) iArr[unsignedShort3]) * ((long) i18);
                        z10 = j >= 0 && j <= 2147483647L;
                    } else if (z6) {
                        String str3 = f13584D[unsignedShort3];
                    }
                }
                if (z10) {
                    if (j > 4) {
                        i16 = fVar.readInt();
                        mapArr2 = mapArr;
                        if (this.f13612c != 7) {
                            if ("MakerNote".equals(dVar.f13577b)) {
                                this.f13618i = i16;
                            } else if (i10 != 6 && "ThumbnailImage".equals(dVar.f13577b)) {
                                this.j = i16;
                                this.f13619k = i18;
                                c cVarC = c.c(6, this.f13615f);
                                c cVarA = c.a(this.j, this.f13615f);
                                c cVarA2 = c.a(this.f13619k, this.f13615f);
                                mapArr2[4].put("Compression", cVarC);
                                mapArr2[4].put("JPEGInterchangeFormat", cVarA);
                                mapArr2[4].put("JPEGInterchangeFormatLength", cVarA2);
                            }
                        }
                        fVar.b(i16);
                    } else {
                        mapArr2 = mapArr;
                        z6 = z6;
                        i18 = i18;
                    }
                    num = (Integer) f13593M.get(Integer.valueOf(unsignedShort2));
                    if (num != null) {
                        if (unsignedShort3 != 3) {
                            if (unsignedShort3 != 4) {
                                j10 = ((long) fVar.readInt()) & 4294967295L;
                            } else if (unsignedShort3 == 8) {
                                unsignedShort = fVar.readShort();
                            } else if (unsignedShort3 != 9 || unsignedShort3 == 13) {
                                unsignedShort = fVar.readInt();
                            } else {
                                j10 = -1;
                            }
                            if (z6) {
                                String.format("Offset: %d, tagName: %s", Long.valueOf(j10), dVar.f13577b);
                            }
                            if (j10 > 0 && !hashSet.contains(Integer.valueOf((int) j10))) {
                                fVar.b(j10);
                                s(fVar, num.intValue());
                            }
                            fVar.b(j11);
                        } else {
                            unsignedShort = fVar.readUnsignedShort();
                        }
                        j10 = unsignedShort;
                        if (z6) {
                            String.format("Offset: %d, tagName: %s", Long.valueOf(j10), dVar.f13577b);
                        }
                        if (j10 > 0) {
                            fVar.b(j10);
                            s(fVar, num.intValue());
                        }
                        fVar.b(j11);
                    } else {
                        int i20 = fVar.f13572u + this.f13617h;
                        byte[] bArr = new byte[(int) j];
                        fVar.readFully(bArr);
                        c cVar = new c(i20, bArr, unsignedShort3, i18);
                        mapArr2[i10].put(dVar.f13577b, cVar);
                        str = dVar.f13577b;
                        if ("DNGVersion".equals(str)) {
                            this.f13612c = 3;
                        }
                        if (((!"Make".equals(str) || "Model".equals(str)) && cVar.f(this.f13615f).contains("PENTAX")) || ("Compression".equals(str) && cVar.e(this.f13615f) == 65535)) {
                            this.f13612c = 8;
                        }
                        if (fVar.f13572u != j11) {
                            fVar.b(j11);
                        }
                    }
                    s10 = (short) (s10 + 1);
                    s9 = s11;
                    i17 = i13;
                } else {
                    fVar.b(j11);
                    s10 = s10;
                }
                s10 = (short) (s10 + 1);
                s9 = s11;
                i17 = i13;
            } else {
                i13 = i17;
            }
            z10 = false;
            j = 0;
            if (z10) {
                fVar.b(j11);
                s10 = s10;
            } else {
                if (j > 4) {
                    i16 = fVar.readInt();
                    mapArr2 = mapArr;
                    if (this.f13612c != 7) {
                        if ("MakerNote".equals(dVar.f13577b)) {
                            this.f13618i = i16;
                        } else if (i10 != 6) {
                        }
                    }
                    fVar.b(i16);
                } else {
                    mapArr2 = mapArr;
                    z6 = z6;
                    i18 = i18;
                }
                num = (Integer) f13593M.get(Integer.valueOf(unsignedShort2));
                if (num != null) {
                    if (unsignedShort3 != 3) {
                        if (unsignedShort3 != 4) {
                            j10 = ((long) fVar.readInt()) & 4294967295L;
                        } else if (unsignedShort3 == 8) {
                            if (unsignedShort3 != 9) {
                            }
                            unsignedShort = fVar.readInt();
                        } else {
                            unsignedShort = fVar.readShort();
                        }
                        if (z6) {
                            String.format("Offset: %d, tagName: %s", Long.valueOf(j10), dVar.f13577b);
                        }
                        if (j10 > 0) {
                            fVar.b(j10);
                            s(fVar, num.intValue());
                        }
                        fVar.b(j11);
                    } else {
                        unsignedShort = fVar.readUnsignedShort();
                    }
                    j10 = unsignedShort;
                    if (z6) {
                        String.format("Offset: %d, tagName: %s", Long.valueOf(j10), dVar.f13577b);
                    }
                    if (j10 > 0) {
                        fVar.b(j10);
                        s(fVar, num.intValue());
                    }
                    fVar.b(j11);
                } else {
                    int i21 = fVar.f13572u + this.f13617h;
                    byte[] bArr2 = new byte[(int) j];
                    fVar.readFully(bArr2);
                    c cVar2 = new c(i21, bArr2, unsignedShort3, i18);
                    mapArr2[i10].put(dVar.f13577b, cVar2);
                    str = dVar.f13577b;
                    if ("DNGVersion".equals(str)) {
                        this.f13612c = 3;
                    }
                    if (!"Make".equals(str)) {
                    }
                    this.f13612c = 8;
                    if (fVar.f13572u != j11) {
                        fVar.b(j11);
                    }
                }
                s10 = (short) (s10 + 1);
                s9 = s11;
                i17 = i13;
            }
            s10 = (short) (s10 + 1);
            s9 = s11;
            i17 = i13;
        }
        int i22 = i17;
        int i23 = fVar.readInt();
        if (z6) {
            String.format("nextIfdOffset: %d", Integer.valueOf(i23));
        }
        long j12 = i23;
        if (j12 <= 0 || hashSet.contains(Integer.valueOf(i23))) {
            return;
        }
        fVar.b(j12);
        if (mapArr[4].isEmpty()) {
            s(fVar, 4);
        } else if (mapArr[i22].isEmpty()) {
            s(fVar, i22);
        }
    }

    public final void t(String str, int i10, String str2) {
        HashMap[] mapArr = this.f13613d;
        if (mapArr[i10].isEmpty() || mapArr[i10].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i10];
        map.put(str2, map.get(str));
        mapArr[i10].remove(str);
    }

    public final void u(b bVar) throws Throwable {
        c cVar;
        HashMap map = this.f13613d[4];
        c cVar2 = (c) map.get("Compression");
        if (cVar2 == null) {
            m(bVar, map);
            return;
        }
        int iE = cVar2.e(this.f13615f);
        if (iE != 1) {
            if (iE == 6) {
                m(bVar, map);
                return;
            } else if (iE != 7) {
                return;
            }
        }
        c cVar3 = (c) map.get("BitsPerSample");
        if (cVar3 != null) {
            int[] iArr = (int[]) cVar3.g(this.f13615f);
            int[] iArr2 = f13599o;
            if (!Arrays.equals(iArr2, iArr)) {
                if (this.f13612c != 3 || (cVar = (c) map.get("PhotometricInterpretation")) == null) {
                    return;
                }
                int iE2 = cVar.e(this.f13615f);
                if ((iE2 != 1 || !Arrays.equals(iArr, f13600p)) && (iE2 != 6 || !Arrays.equals(iArr, iArr2))) {
                    return;
                }
            }
            c cVar4 = (c) map.get("StripOffsets");
            c cVar5 = (c) map.get("StripByteCounts");
            if (cVar4 == null || cVar5 == null) {
                return;
            }
            long[] jArrE = d.e(cVar4.g(this.f13615f));
            long[] jArrE2 = d.e(cVar5.g(this.f13615f));
            if (jArrE == null || jArrE.length == 0) {
                Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                return;
            }
            if (jArrE2 == null || jArrE2.length == 0) {
                Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                return;
            }
            if (jArrE.length != jArrE2.length) {
                Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                return;
            }
            long j = 0;
            for (long j10 : jArrE2) {
                j += j10;
            }
            byte[] bArr = new byte[(int) j];
            this.f13616g = true;
            int i10 = 0;
            int i11 = 0;
            for (int i12 = 0; i12 < jArrE.length; i12++) {
                int i13 = (int) jArrE[i12];
                int i14 = (int) jArrE2[i12];
                if (i12 < jArrE.length - 1 && i13 + i14 != jArrE[i12 + 1]) {
                    this.f13616g = false;
                }
                int i15 = i13 - i10;
                if (i15 < 0) {
                    return;
                }
                long j11 = i15;
                if (bVar.skip(j11) != j11) {
                    return;
                }
                int i16 = i10 + i15;
                byte[] bArr2 = new byte[i14];
                if (bVar.read(bArr2) != i14) {
                    return;
                }
                i10 = i16 + i14;
                System.arraycopy(bArr2, 0, bArr, i11, i14);
                i11 += i14;
            }
            if (this.f13616g) {
                long j12 = jArrE[0];
            }
        }
    }

    public final void v(int i10, int i11) throws Throwable {
        HashMap[] mapArr = this.f13613d;
        if (mapArr[i10].isEmpty() || mapArr[i11].isEmpty()) {
            return;
        }
        c cVar = (c) mapArr[i10].get("ImageLength");
        c cVar2 = (c) mapArr[i10].get("ImageWidth");
        c cVar3 = (c) mapArr[i11].get("ImageLength");
        c cVar4 = (c) mapArr[i11].get("ImageWidth");
        if (cVar == null || cVar2 == null || cVar3 == null || cVar4 == null) {
            return;
        }
        int iE = cVar.e(this.f13615f);
        int iE2 = cVar2.e(this.f13615f);
        int iE3 = cVar3.e(this.f13615f);
        int iE4 = cVar4.e(this.f13615f);
        if (iE >= iE3 || iE2 >= iE4) {
            return;
        }
        HashMap map = mapArr[i10];
        mapArr[i10] = mapArr[i11];
        mapArr[i11] = map;
    }

    public final void w(f fVar, int i10) throws Throwable {
        c cVarC;
        c cVarC2;
        HashMap[] mapArr = this.f13613d;
        c cVar = (c) mapArr[i10].get("DefaultCropSize");
        c cVar2 = (c) mapArr[i10].get("SensorTopBorder");
        c cVar3 = (c) mapArr[i10].get("SensorLeftBorder");
        c cVar4 = (c) mapArr[i10].get("SensorBottomBorder");
        c cVar5 = (c) mapArr[i10].get("SensorRightBorder");
        if (cVar != null) {
            if (cVar.a == 5) {
                e[] eVarArr = (e[]) cVar.g(this.f13615f);
                if (eVarArr == null || eVarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(eVarArr));
                    return;
                }
                cVarC = c.b(eVarArr[0], this.f13615f);
                cVarC2 = c.b(eVarArr[1], this.f13615f);
            } else {
                int[] iArr = (int[]) cVar.g(this.f13615f);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                cVarC = c.c(iArr[0], this.f13615f);
                cVarC2 = c.c(iArr[1], this.f13615f);
            }
            mapArr[i10].put("ImageWidth", cVarC);
            mapArr[i10].put("ImageLength", cVarC2);
            return;
        }
        if (cVar2 != null && cVar3 != null && cVar4 != null && cVar5 != null) {
            int iE = cVar2.e(this.f13615f);
            int iE2 = cVar4.e(this.f13615f);
            int iE3 = cVar5.e(this.f13615f);
            int iE4 = cVar3.e(this.f13615f);
            if (iE2 <= iE || iE3 <= iE4) {
                return;
            }
            c cVarC3 = c.c(iE2 - iE, this.f13615f);
            c cVarC4 = c.c(iE3 - iE4, this.f13615f);
            mapArr[i10].put("ImageLength", cVarC3);
            mapArr[i10].put("ImageWidth", cVarC4);
            return;
        }
        c cVar6 = (c) mapArr[i10].get("ImageLength");
        c cVar7 = (c) mapArr[i10].get("ImageWidth");
        if (cVar6 == null || cVar7 == null) {
            c cVar8 = (c) mapArr[i10].get("JPEGInterchangeFormat");
            c cVar9 = (c) mapArr[i10].get("JPEGInterchangeFormatLength");
            if (cVar8 == null || cVar9 == null) {
                return;
            }
            int iE5 = cVar8.e(this.f13615f);
            int iE6 = cVar8.e(this.f13615f);
            fVar.b(iE5);
            byte[] bArr = new byte[iE6];
            fVar.read(bArr);
            e(new b(bArr), iE5, i10);
        }
    }

    public final void x() throws Throwable {
        v(0, 5);
        v(0, 4);
        v(5, 4);
        HashMap[] mapArr = this.f13613d;
        c cVar = (c) mapArr[1].get("PixelXDimension");
        c cVar2 = (c) mapArr[1].get("PixelYDimension");
        if (cVar != null && cVar2 != null) {
            mapArr[0].put("ImageWidth", cVar);
            mapArr[0].put("ImageLength", cVar2);
        }
        if (mapArr[4].isEmpty() && n(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        n(mapArr[4]);
        t("ThumbnailOrientation", 0, "Orientation");
        t("ThumbnailImageLength", 0, "ImageLength");
        t("ThumbnailImageWidth", 0, "ImageWidth");
        t("ThumbnailOrientation", 5, "Orientation");
        t("ThumbnailImageLength", 5, "ImageLength");
        t("ThumbnailImageWidth", 5, "ImageWidth");
        t("Orientation", 4, "ThumbnailOrientation");
        t("ImageLength", 4, "ThumbnailImageLength");
        t("ImageWidth", 4, "ThumbnailImageWidth");
    }
}

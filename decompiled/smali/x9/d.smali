.class public Lx9/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB1/b;
.implements LC1/a;
.implements Lcom/google/android/gms/internal/base/zaq;
.implements Lcom/google/android/gms/internal/common/zze;
.implements LN1/n;
.implements Lcom/google/android/gms/tasks/SuccessContinuation;
.implements LV1/c;
.implements Lj3/E;
.implements LN6/i;
.implements Lcom/google/gson/internal/l;
.implements Landroidx/lifecycle/T;
.implements Lu7/b;


# static fields
.field public static final t:Lx9/d;

.field public static u:Z


# instance fields
.field public final synthetic s:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lx9/d;

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lx9/d;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lx9/d;->t:Lx9/d;

    .line 9
    .line 10
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lx9/d;->s:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static p(Ljava/lang/String;)Lma/i;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    const/16 v2, 0x41

    .line 5
    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, 0x1

    .line 8
    const-string v5, "<this>"

    .line 9
    .line 10
    invoke-static {v0, v5}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    sget-object v5, Lma/z;->a:[B

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 16
    .line 17
    .line 18
    move-result v5

    .line 19
    :goto_0
    const/16 v6, 0x9

    .line 20
    .line 21
    const/16 v7, 0x20

    .line 22
    .line 23
    const/16 v8, 0xd

    .line 24
    .line 25
    const/16 v9, 0xa

    .line 26
    .line 27
    if-lez v5, :cond_1

    .line 28
    .line 29
    add-int/lit8 v10, v5, -0x1

    .line 30
    .line 31
    invoke-virtual {v0, v10}, Ljava/lang/String;->charAt(I)C

    .line 32
    .line 33
    .line 34
    move-result v10

    .line 35
    const/16 v11, 0x3d

    .line 36
    .line 37
    if-eq v10, v11, :cond_0

    .line 38
    .line 39
    if-eq v10, v9, :cond_0

    .line 40
    .line 41
    if-eq v10, v8, :cond_0

    .line 42
    .line 43
    if-eq v10, v7, :cond_0

    .line 44
    .line 45
    if-eq v10, v6, :cond_0

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_0
    add-int/lit8 v5, v5, -0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    :goto_1
    int-to-long v10, v5

    .line 52
    const-wide/16 v12, 0x6

    .line 53
    .line 54
    mul-long/2addr v10, v12

    .line 55
    const-wide/16 v12, 0x8

    .line 56
    .line 57
    div-long/2addr v10, v12

    .line 58
    long-to-int v10, v10

    .line 59
    new-array v11, v10, [B

    .line 60
    .line 61
    const/4 v13, 0x0

    .line 62
    if-lez v5, :cond_d

    .line 63
    .line 64
    move v14, v13

    .line 65
    move v15, v14

    .line 66
    move/from16 v16, v15

    .line 67
    .line 68
    const/16 v17, 0x0

    .line 69
    .line 70
    :goto_2
    add-int/lit8 v12, v13, 0x1

    .line 71
    .line 72
    invoke-virtual {v0, v13}, Ljava/lang/String;->charAt(I)C

    .line 73
    .line 74
    .line 75
    move-result v13

    .line 76
    move/from16 v18, v2

    .line 77
    .line 78
    if-gt v2, v13, :cond_2

    .line 79
    .line 80
    const/16 v2, 0x5a

    .line 81
    .line 82
    if-gt v13, v2, :cond_2

    .line 83
    .line 84
    add-int/lit8 v13, v13, -0x41

    .line 85
    .line 86
    goto :goto_6

    .line 87
    :cond_2
    const/16 v2, 0x61

    .line 88
    .line 89
    if-gt v2, v13, :cond_3

    .line 90
    .line 91
    const/16 v2, 0x7a

    .line 92
    .line 93
    if-gt v13, v2, :cond_3

    .line 94
    .line 95
    add-int/lit8 v13, v13, -0x47

    .line 96
    .line 97
    goto :goto_6

    .line 98
    :cond_3
    const/16 v2, 0x30

    .line 99
    .line 100
    if-gt v2, v13, :cond_4

    .line 101
    .line 102
    const/16 v2, 0x39

    .line 103
    .line 104
    if-gt v13, v2, :cond_4

    .line 105
    .line 106
    add-int/lit8 v13, v13, 0x4

    .line 107
    .line 108
    goto :goto_6

    .line 109
    :cond_4
    const/16 v2, 0x2b

    .line 110
    .line 111
    if-eq v13, v2, :cond_a

    .line 112
    .line 113
    const/16 v2, 0x2d

    .line 114
    .line 115
    if-ne v13, v2, :cond_5

    .line 116
    .line 117
    goto :goto_5

    .line 118
    :cond_5
    const/16 v2, 0x2f

    .line 119
    .line 120
    if-eq v13, v2, :cond_9

    .line 121
    .line 122
    const/16 v2, 0x5f

    .line 123
    .line 124
    if-ne v13, v2, :cond_6

    .line 125
    .line 126
    goto :goto_4

    .line 127
    :cond_6
    if-eq v13, v9, :cond_8

    .line 128
    .line 129
    if-eq v13, v8, :cond_8

    .line 130
    .line 131
    if-eq v13, v7, :cond_8

    .line 132
    .line 133
    if-ne v13, v6, :cond_7

    .line 134
    .line 135
    goto :goto_3

    .line 136
    :cond_7
    move-object/from16 v11, v17

    .line 137
    .line 138
    goto/16 :goto_a

    .line 139
    .line 140
    :cond_8
    :goto_3
    move/from16 v2, v16

    .line 141
    .line 142
    goto :goto_7

    .line 143
    :cond_9
    :goto_4
    const/16 v13, 0x3f

    .line 144
    .line 145
    goto :goto_6

    .line 146
    :cond_a
    :goto_5
    const/16 v13, 0x3e

    .line 147
    .line 148
    :goto_6
    shl-int/lit8 v2, v16, 0x6

    .line 149
    .line 150
    or-int/2addr v2, v13

    .line 151
    add-int/2addr v15, v4

    .line 152
    rem-int/lit8 v13, v15, 0x4

    .line 153
    .line 154
    if-nez v13, :cond_b

    .line 155
    .line 156
    add-int/lit8 v13, v14, 0x1

    .line 157
    .line 158
    shr-int/lit8 v6, v2, 0x10

    .line 159
    .line 160
    int-to-byte v6, v6

    .line 161
    aput-byte v6, v11, v14

    .line 162
    .line 163
    add-int/lit8 v6, v14, 0x2

    .line 164
    .line 165
    shr-int/lit8 v7, v2, 0x8

    .line 166
    .line 167
    int-to-byte v7, v7

    .line 168
    aput-byte v7, v11, v13

    .line 169
    .line 170
    add-int/2addr v14, v1

    .line 171
    int-to-byte v7, v2

    .line 172
    aput-byte v7, v11, v6

    .line 173
    .line 174
    :cond_b
    :goto_7
    if-lt v12, v5, :cond_c

    .line 175
    .line 176
    move v13, v15

    .line 177
    goto :goto_8

    .line 178
    :cond_c
    move/from16 v16, v2

    .line 179
    .line 180
    move v13, v12

    .line 181
    move/from16 v2, v18

    .line 182
    .line 183
    const/16 v6, 0x9

    .line 184
    .line 185
    const/16 v7, 0x20

    .line 186
    .line 187
    goto :goto_2

    .line 188
    :cond_d
    const/16 v17, 0x0

    .line 189
    .line 190
    move v2, v13

    .line 191
    move v14, v2

    .line 192
    :goto_8
    rem-int/lit8 v13, v13, 0x4

    .line 193
    .line 194
    if-eq v13, v4, :cond_7

    .line 195
    .line 196
    if-eq v13, v3, :cond_f

    .line 197
    .line 198
    if-eq v13, v1, :cond_e

    .line 199
    .line 200
    goto :goto_9

    .line 201
    :cond_e
    shl-int/lit8 v0, v2, 0x6

    .line 202
    .line 203
    add-int/2addr v4, v14

    .line 204
    shr-int/lit8 v1, v0, 0x10

    .line 205
    .line 206
    int-to-byte v1, v1

    .line 207
    aput-byte v1, v11, v14

    .line 208
    .line 209
    add-int/2addr v14, v3

    .line 210
    shr-int/lit8 v0, v0, 0x8

    .line 211
    .line 212
    int-to-byte v0, v0

    .line 213
    aput-byte v0, v11, v4

    .line 214
    .line 215
    goto :goto_9

    .line 216
    :cond_f
    shl-int/lit8 v0, v2, 0xc

    .line 217
    .line 218
    add-int/2addr v4, v14

    .line 219
    shr-int/lit8 v0, v0, 0x10

    .line 220
    .line 221
    int-to-byte v0, v0

    .line 222
    aput-byte v0, v11, v14

    .line 223
    .line 224
    move v14, v4

    .line 225
    :goto_9
    if-ne v14, v10, :cond_10

    .line 226
    .line 227
    goto :goto_a

    .line 228
    :cond_10
    invoke-static {v11, v14}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 229
    .line 230
    .line 231
    move-result-object v11

    .line 232
    const-string v0, "java.util.Arrays.copyOf(this, newSize)"

    .line 233
    .line 234
    invoke-static {v11, v0}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    :goto_a
    if-eqz v11, :cond_11

    .line 238
    .line 239
    new-instance v0, Lma/i;

    .line 240
    .line 241
    invoke-direct {v0, v11}, Lma/i;-><init>([B)V

    .line 242
    .line 243
    .line 244
    return-object v0

    .line 245
    :cond_11
    return-object v17
    .line 246
    .line 247
.end method

.method public static q(Ljava/lang/String;)Lma/i;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    rem-int/lit8 v0, v0, 0x2

    .line 6
    .line 7
    if-nez v0, :cond_2

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    div-int/lit8 v0, v0, 0x2

    .line 14
    .line 15
    new-array v1, v0, [B

    .line 16
    .line 17
    add-int/lit8 v0, v0, -0x1

    .line 18
    .line 19
    if-ltz v0, :cond_1

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    :goto_0
    add-int/lit8 v3, v2, 0x1

    .line 23
    .line 24
    mul-int/lit8 v4, v2, 0x2

    .line 25
    .line 26
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    invoke-static {v5}, Lna/b;->a(C)I

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    shl-int/lit8 v5, v5, 0x4

    .line 35
    .line 36
    add-int/lit8 v4, v4, 0x1

    .line 37
    .line 38
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    invoke-static {v4}, Lna/b;->a(C)I

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    add-int/2addr v4, v5

    .line 47
    int-to-byte v4, v4

    .line 48
    aput-byte v4, v1, v2

    .line 49
    .line 50
    if-le v3, v0, :cond_0

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_0
    move v2, v3

    .line 54
    goto :goto_0

    .line 55
    :cond_1
    :goto_1
    new-instance p0, Lma/i;

    .line 56
    .line 57
    invoke-direct {p0, v1}, Lma/i;-><init>([B)V

    .line 58
    .line 59
    .line 60
    return-object p0

    .line 61
    :cond_2
    const-string v0, "Unexpected hex string: "

    .line 62
    .line 63
    invoke-static {p0, v0}, Lv8/i;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 68
    .line 69
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    throw v0
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method public static r(Ljava/lang/String;)Lma/i;
    .locals 3

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lma/i;

    .line 7
    .line 8
    sget-object v1, LL9/a;->a:Ljava/nio/charset/Charset;

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const-string v2, "(this as java.lang.String).getBytes(charset)"

    .line 15
    .line 16
    invoke-static {v1, v2}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, v1}, Lma/i;-><init>([B)V

    .line 20
    .line 21
    .line 22
    iput-object p0, v0, Lma/i;->u:Ljava/lang/String;

    .line 23
    .line 24
    return-object v0
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public static t(Ljava/lang/String;)Ljava/io/InputStream;
    .locals 1

    .line 1
    const-string v0, "path"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-class v0, Lx9/d;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    invoke-static {p0}, Ljava/lang/ClassLoader;->getSystemResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :cond_0
    invoke-virtual {v0, p0}, Ljava/lang/ClassLoader;->getResource(Ljava/lang/String;)Ljava/net/URL;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    if-nez p0, :cond_1

    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    return-object p0

    .line 27
    :cond_1
    invoke-virtual {p0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    const/4 v0, 0x0

    .line 32
    invoke-virtual {p0, v0}, Ljava/net/URLConnection;->setUseCaches(Z)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method public static u([B)Lma/i;
    .locals 8

    .line 1
    sget-object v0, Lma/i;->v:Lma/i;

    .line 2
    .line 3
    array-length v0, p0

    .line 4
    array-length v1, p0

    .line 5
    int-to-long v2, v1

    .line 6
    const/4 v1, 0x0

    .line 7
    int-to-long v4, v1

    .line 8
    int-to-long v6, v0

    .line 9
    invoke-static/range {v2 .. v7}, Lo1/f;->c(JJJ)V

    .line 10
    .line 11
    .line 12
    new-instance v2, Lma/i;

    .line 13
    .line 14
    array-length v3, p0

    .line 15
    invoke-static {v0, v3}, Lcom/bumptech/glide/c;->d(II)V

    .line 16
    .line 17
    .line 18
    invoke-static {p0, v1, v0}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    const-string v0, "copyOfRange(...)"

    .line 23
    .line 24
    invoke-static {p0, v0}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-direct {v2, p0}, Lma/i;-><init>([B)V

    .line 28
    .line 29
    .line 30
    return-object v2
    .line 31
    .line 32
    .line 33
.end method


# virtual methods
.method public a(Ly1/e;)Ljava/io/File;
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return-object p1
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public b(Ljava/lang/Object;)V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public c(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    .locals 0

    .line 1
    invoke-static {p1, p2, p3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
.end method

.method public d(Ly1/e;LA1/h;)V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
.end method

.method public e(Ljava/lang/Class;)Landroidx/lifecycle/Q;
    .locals 1

    .line 1
    iget p1, p0, Lx9/d;->s:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Ly0/p;

    .line 7
    .line 8
    invoke-direct {p1}, Ly0/p;-><init>()V

    .line 9
    .line 10
    .line 11
    return-object p1

    .line 12
    :pswitch_0
    new-instance p1, Lq0/N;

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    invoke-direct {p1, v0}, Lq0/N;-><init>(Z)V

    .line 16
    .line 17
    .line 18
    return-object p1

    .line 19
    :pswitch_data_0
    .packed-switch 0x19
        :pswitch_0
    .end packed-switch
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public f(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    .locals 0

    .line 1
    invoke-static {p1, p2, p3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
.end method

.method public g(LC8/c;Lu0/b;)Landroidx/lifecycle/Q;
    .locals 1

    .line 1
    iget v0, p0, Lx9/d;->s:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lga/d;->o(LC8/c;)Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p0, p1, p2}, Lx9/d;->i(Ljava/lang/Class;Lu0/b;)Landroidx/lifecycle/Q;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1

    .line 15
    :pswitch_0
    invoke-static {p1}, Lga/d;->o(LC8/c;)Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p0, p1, p2}, Lx9/d;->i(Ljava/lang/Class;Lu0/b;)Landroidx/lifecycle/Q;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x19
        :pswitch_0
    .end packed-switch
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
.end method

.method public h(Landroid/graphics/Bitmap;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    .line 2
    .line 3
    .line 4
    return-void
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public i(Ljava/lang/Class;Lu0/b;)Landroidx/lifecycle/Q;
    .locals 0

    .line 1
    iget p2, p0, Lx9/d;->s:I

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lx9/d;->e(Ljava/lang/Class;)Landroidx/lifecycle/Q;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1

    .line 11
    :pswitch_0
    invoke-virtual {p0, p1}, Lx9/d;->e(Ljava/lang/Class;)Landroidx/lifecycle/Q;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x19
        :pswitch_0
    .end packed-switch
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
.end method

.method public j(Landroid/view/View;F)V
    .locals 6

    .line 1
    iget v0, p0, Lx9/d;->s:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    neg-float v0, p2

    .line 7
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    int-to-float v1, v1

    .line 12
    mul-float/2addr v0, v1

    .line 13
    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationX(F)V

    .line 14
    .line 15
    .line 16
    const v0, 0x469c4000    # 20000.0f

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v0}, Landroid/view/View;->setCameraDistance(F)V

    .line 20
    .line 21
    .line 22
    float-to-double v0, p2

    .line 23
    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    .line 24
    .line 25
    cmpg-double v2, v0, v2

    .line 26
    .line 27
    if-gez v2, :cond_0

    .line 28
    .line 29
    const-wide/high16 v2, -0x4020000000000000L    # -0.5

    .line 30
    .line 31
    cmpl-double v0, v0, v2

    .line 32
    .line 33
    if-lez v0, :cond_0

    .line 34
    .line 35
    const/4 v0, 0x0

    .line 36
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    const/4 v0, 0x4

    .line 41
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 42
    .line 43
    .line 44
    :goto_0
    const/high16 v0, -0x40800000    # -1.0f

    .line 45
    .line 46
    cmpg-float v0, p2, v0

    .line 47
    .line 48
    const/4 v1, 0x0

    .line 49
    if-gez v0, :cond_1

    .line 50
    .line 51
    invoke-virtual {p1, v1}, Landroid/view/View;->setAlpha(F)V

    .line 52
    .line 53
    .line 54
    goto/16 :goto_1

    .line 55
    .line 56
    :cond_1
    cmpg-float v0, p2, v1

    .line 57
    .line 58
    const/high16 v2, -0x3b860000    # -1000.0f

    .line 59
    .line 60
    const v3, 0x3ecccccd    # 0.4f

    .line 61
    .line 62
    .line 63
    const/high16 v4, 0x3f800000    # 1.0f

    .line 64
    .line 65
    if-gtz v0, :cond_2

    .line 66
    .line 67
    invoke-virtual {p1, v4}, Landroid/view/View;->setAlpha(F)V

    .line 68
    .line 69
    .line 70
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    sub-float v0, v4, v0

    .line 75
    .line 76
    invoke-static {v3, v0}, Ljava/lang/Math;->max(FF)F

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    invoke-virtual {p1, v0}, Landroid/view/View;->setScaleX(F)V

    .line 81
    .line 82
    .line 83
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    sub-float v0, v4, v0

    .line 88
    .line 89
    invoke-static {v3, v0}, Ljava/lang/Math;->max(FF)F

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    invoke-virtual {p1, v0}, Landroid/view/View;->setScaleY(F)V

    .line 94
    .line 95
    .line 96
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    sub-float v0, v4, v0

    .line 101
    .line 102
    add-float/2addr v0, v4

    .line 103
    const/high16 v1, 0x44870000    # 1080.0f

    .line 104
    .line 105
    mul-float/2addr v0, v1

    .line 106
    invoke-virtual {p1, v0}, Landroid/view/View;->setRotationX(F)V

    .line 107
    .line 108
    .line 109
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 110
    .line 111
    .line 112
    move-result p2

    .line 113
    mul-float/2addr p2, v2

    .line 114
    invoke-virtual {p1, p2}, Landroid/view/View;->setTranslationY(F)V

    .line 115
    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_2
    cmpg-float v0, p2, v4

    .line 119
    .line 120
    if-gtz v0, :cond_3

    .line 121
    .line 122
    invoke-virtual {p1, v4}, Landroid/view/View;->setAlpha(F)V

    .line 123
    .line 124
    .line 125
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    sub-float v0, v4, v0

    .line 130
    .line 131
    invoke-static {v3, v0}, Ljava/lang/Math;->max(FF)F

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    invoke-virtual {p1, v0}, Landroid/view/View;->setScaleX(F)V

    .line 136
    .line 137
    .line 138
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    sub-float v0, v4, v0

    .line 143
    .line 144
    invoke-static {v3, v0}, Ljava/lang/Math;->max(FF)F

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    invoke-virtual {p1, v0}, Landroid/view/View;->setScaleY(F)V

    .line 149
    .line 150
    .line 151
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    sub-float v0, v4, v0

    .line 156
    .line 157
    add-float/2addr v0, v4

    .line 158
    const/high16 v1, -0x3b790000    # -1080.0f

    .line 159
    .line 160
    mul-float/2addr v0, v1

    .line 161
    invoke-virtual {p1, v0}, Landroid/view/View;->setRotationX(F)V

    .line 162
    .line 163
    .line 164
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 165
    .line 166
    .line 167
    move-result p2

    .line 168
    mul-float/2addr p2, v2

    .line 169
    invoke-virtual {p1, p2}, Landroid/view/View;->setTranslationY(F)V

    .line 170
    .line 171
    .line 172
    goto :goto_1

    .line 173
    :cond_3
    invoke-virtual {p1, v1}, Landroid/view/View;->setAlpha(F)V

    .line 174
    .line 175
    .line 176
    :goto_1
    return-void

    .line 177
    :pswitch_0
    neg-float v0, p2

    .line 178
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 179
    .line 180
    .line 181
    move-result v1

    .line 182
    int-to-float v1, v1

    .line 183
    mul-float/2addr v0, v1

    .line 184
    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationX(F)V

    .line 185
    .line 186
    .line 187
    const/high16 v0, -0x40800000    # -1.0f

    .line 188
    .line 189
    cmpg-float v0, p2, v0

    .line 190
    .line 191
    const/4 v1, 0x0

    .line 192
    if-gez v0, :cond_4

    .line 193
    .line 194
    invoke-virtual {p1, v1}, Landroid/view/View;->setAlpha(F)V

    .line 195
    .line 196
    .line 197
    goto :goto_2

    .line 198
    :cond_4
    cmpg-float v0, p2, v1

    .line 199
    .line 200
    const/high16 v2, 0x3f800000    # 1.0f

    .line 201
    .line 202
    if-gtz v0, :cond_5

    .line 203
    .line 204
    invoke-virtual {p1, v2}, Landroid/view/View;->setAlpha(F)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {p1, v1}, Landroid/view/View;->setPivotX(F)V

    .line 208
    .line 209
    .line 210
    const/high16 v0, 0x42b40000    # 90.0f

    .line 211
    .line 212
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 213
    .line 214
    .line 215
    move-result p2

    .line 216
    mul-float/2addr p2, v0

    .line 217
    invoke-virtual {p1, p2}, Landroid/view/View;->setRotationY(F)V

    .line 218
    .line 219
    .line 220
    goto :goto_2

    .line 221
    :cond_5
    cmpg-float v0, p2, v2

    .line 222
    .line 223
    if-gtz v0, :cond_6

    .line 224
    .line 225
    invoke-virtual {p1, v2}, Landroid/view/View;->setAlpha(F)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 229
    .line 230
    .line 231
    move-result v0

    .line 232
    int-to-float v0, v0

    .line 233
    invoke-virtual {p1, v0}, Landroid/view/View;->setPivotX(F)V

    .line 234
    .line 235
    .line 236
    const/high16 v0, -0x3d4c0000    # -90.0f

    .line 237
    .line 238
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 239
    .line 240
    .line 241
    move-result p2

    .line 242
    mul-float/2addr p2, v0

    .line 243
    invoke-virtual {p1, p2}, Landroid/view/View;->setRotationY(F)V

    .line 244
    .line 245
    .line 246
    goto :goto_2

    .line 247
    :cond_6
    invoke-virtual {p1, v1}, Landroid/view/View;->setAlpha(F)V

    .line 248
    .line 249
    .line 250
    :goto_2
    return-void

    .line 251
    :pswitch_1
    const/high16 v0, -0x40800000    # -1.0f

    .line 252
    .line 253
    cmpg-float v0, p2, v0

    .line 254
    .line 255
    const/4 v1, 0x0

    .line 256
    if-gez v0, :cond_7

    .line 257
    .line 258
    invoke-virtual {p1, v1}, Landroid/view/View;->setAlpha(F)V

    .line 259
    .line 260
    .line 261
    goto :goto_3

    .line 262
    :cond_7
    cmpg-float v0, p2, v1

    .line 263
    .line 264
    const/high16 v2, 0x3f800000    # 1.0f

    .line 265
    .line 266
    if-gtz v0, :cond_8

    .line 267
    .line 268
    invoke-virtual {p1, v2}, Landroid/view/View;->setAlpha(F)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 272
    .line 273
    .line 274
    move-result v0

    .line 275
    int-to-float v0, v0

    .line 276
    invoke-virtual {p1, v0}, Landroid/view/View;->setPivotX(F)V

    .line 277
    .line 278
    .line 279
    const/high16 v0, -0x3d4c0000    # -90.0f

    .line 280
    .line 281
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 282
    .line 283
    .line 284
    move-result p2

    .line 285
    mul-float/2addr p2, v0

    .line 286
    invoke-virtual {p1, p2}, Landroid/view/View;->setRotationY(F)V

    .line 287
    .line 288
    .line 289
    goto :goto_3

    .line 290
    :cond_8
    cmpg-float v0, p2, v2

    .line 291
    .line 292
    if-gtz v0, :cond_9

    .line 293
    .line 294
    invoke-virtual {p1, v2}, Landroid/view/View;->setAlpha(F)V

    .line 295
    .line 296
    .line 297
    invoke-virtual {p1, v1}, Landroid/view/View;->setPivotX(F)V

    .line 298
    .line 299
    .line 300
    const/high16 v0, 0x42b40000    # 90.0f

    .line 301
    .line 302
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 303
    .line 304
    .line 305
    move-result p2

    .line 306
    mul-float/2addr p2, v0

    .line 307
    invoke-virtual {p1, p2}, Landroid/view/View;->setRotationY(F)V

    .line 308
    .line 309
    .line 310
    goto :goto_3

    .line 311
    :cond_9
    invoke-virtual {p1, v1}, Landroid/view/View;->setAlpha(F)V

    .line 312
    .line 313
    .line 314
    :goto_3
    return-void

    .line 315
    :pswitch_2
    neg-float v0, p2

    .line 316
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 317
    .line 318
    .line 319
    move-result v1

    .line 320
    int-to-float v1, v1

    .line 321
    mul-float/2addr v0, v1

    .line 322
    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationX(F)V

    .line 323
    .line 324
    .line 325
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 326
    .line 327
    .line 328
    move-result v0

    .line 329
    float-to-double v0, v0

    .line 330
    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    .line 331
    .line 332
    cmpg-double v0, v0, v2

    .line 333
    .line 334
    const/high16 v1, 0x3f800000    # 1.0f

    .line 335
    .line 336
    if-gez v0, :cond_a

    .line 337
    .line 338
    const/4 v0, 0x0

    .line 339
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 340
    .line 341
    .line 342
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 343
    .line 344
    .line 345
    move-result v0

    .line 346
    sub-float v0, v1, v0

    .line 347
    .line 348
    invoke-virtual {p1, v0}, Landroid/view/View;->setScaleX(F)V

    .line 349
    .line 350
    .line 351
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 352
    .line 353
    .line 354
    move-result v0

    .line 355
    sub-float v0, v1, v0

    .line 356
    .line 357
    invoke-virtual {p1, v0}, Landroid/view/View;->setScaleY(F)V

    .line 358
    .line 359
    .line 360
    goto :goto_4

    .line 361
    :cond_a
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 362
    .line 363
    .line 364
    move-result v0

    .line 365
    float-to-double v4, v0

    .line 366
    cmpl-double v0, v4, v2

    .line 367
    .line 368
    if-lez v0, :cond_b

    .line 369
    .line 370
    const/16 v0, 0x8

    .line 371
    .line 372
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 373
    .line 374
    .line 375
    :cond_b
    :goto_4
    const/high16 v0, -0x40800000    # -1.0f

    .line 376
    .line 377
    cmpg-float v0, p2, v0

    .line 378
    .line 379
    const/4 v2, 0x0

    .line 380
    if-gez v0, :cond_c

    .line 381
    .line 382
    invoke-virtual {p1, v2}, Landroid/view/View;->setAlpha(F)V

    .line 383
    .line 384
    .line 385
    goto :goto_5

    .line 386
    :cond_c
    cmpg-float v0, p2, v2

    .line 387
    .line 388
    if-gtz v0, :cond_d

    .line 389
    .line 390
    invoke-virtual {p1, v1}, Landroid/view/View;->setAlpha(F)V

    .line 391
    .line 392
    .line 393
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 394
    .line 395
    .line 396
    move-result p2

    .line 397
    sub-float/2addr v1, p2

    .line 398
    const/high16 p2, 0x43b40000    # 360.0f

    .line 399
    .line 400
    mul-float/2addr v1, p2

    .line 401
    invoke-virtual {p1, v1}, Landroid/view/View;->setRotation(F)V

    .line 402
    .line 403
    .line 404
    goto :goto_5

    .line 405
    :cond_d
    cmpg-float v0, p2, v1

    .line 406
    .line 407
    if-gtz v0, :cond_e

    .line 408
    .line 409
    invoke-virtual {p1, v1}, Landroid/view/View;->setAlpha(F)V

    .line 410
    .line 411
    .line 412
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 413
    .line 414
    .line 415
    move-result p2

    .line 416
    sub-float/2addr v1, p2

    .line 417
    const/high16 p2, -0x3c4c0000    # -360.0f

    .line 418
    .line 419
    mul-float/2addr v1, p2

    .line 420
    invoke-virtual {p1, v1}, Landroid/view/View;->setRotation(F)V

    .line 421
    .line 422
    .line 423
    goto :goto_5

    .line 424
    :cond_e
    invoke-virtual {p1, v2}, Landroid/view/View;->setAlpha(F)V

    .line 425
    .line 426
    .line 427
    :goto_5
    return-void

    .line 428
    nop

    .line 429
    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
.end method

.method public k(Landroid/view/View;LU/B0;LT6/k;)LU/B0;
    .locals 5

    .line 1
    iget v0, p3, LT6/k;->d:I

    .line 2
    .line 3
    invoke-virtual {p2}, LU/B0;->a()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    add-int/2addr v1, v0

    .line 8
    iput v1, p3, LT6/k;->d:I

    .line 9
    .line 10
    sget-object v0, LU/U;->a:Ljava/util/WeakHashMap;

    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/view/View;->getLayoutDirection()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x1

    .line 17
    if-ne v0, v1, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v1, 0x0

    .line 21
    :goto_0
    invoke-virtual {p2}, LU/B0;->b()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    invoke-virtual {p2}, LU/B0;->c()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    iget v3, p3, LT6/k;->a:I

    .line 30
    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    move v4, v2

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    move v4, v0

    .line 36
    :goto_1
    add-int/2addr v3, v4

    .line 37
    iput v3, p3, LT6/k;->a:I

    .line 38
    .line 39
    iget v4, p3, LT6/k;->c:I

    .line 40
    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_2
    move v0, v2

    .line 45
    :goto_2
    add-int/2addr v4, v0

    .line 46
    iput v4, p3, LT6/k;->c:I

    .line 47
    .line 48
    iget v0, p3, LT6/k;->d:I

    .line 49
    .line 50
    iget p3, p3, LT6/k;->b:I

    .line 51
    .line 52
    invoke-virtual {p1, v3, p3, v4, v0}, Landroid/view/View;->setPaddingRelative(IIII)V

    .line 53
    .line 54
    .line 55
    return-object p2
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
.end method

.method public l(I)V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public m(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Void;

    .line 2
    .line 3
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 4
    .line 5
    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->e(Ljava/lang/Object;)LP2/f;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public n()Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
.end method

.method public o()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
.end method

.method public s(Landroid/content/pm/PackageManager;Ljava/lang/String;)[Landroid/content/pm/Signature;
    .locals 1

    .line 1
    const/16 v0, 0x40

    .line 2
    .line 3
    invoke-virtual {p1, p2, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object p1, p1, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 8
    .line 9
    return-object p1
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
.end method

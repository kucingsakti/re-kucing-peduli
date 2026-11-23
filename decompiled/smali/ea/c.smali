.class public final Lea/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public final b:Ljava/util/ArrayList;

.field public final c:Lma/r;

.field public d:[Lea/b;

.field public e:I

.field public f:I

.field public g:I


# direct methods
.method public constructor <init>(Lea/r;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x1000

    .line 5
    .line 6
    iput v0, p0, Lea/c;->a:I

    .line 7
    .line 8
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lea/c;->b:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-static {p1}, Lga/d;->d(Lma/w;)Lma/r;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, Lea/c;->c:Lma/r;

    .line 20
    .line 21
    const/16 p1, 0x8

    .line 22
    .line 23
    new-array p1, p1, [Lea/b;

    .line 24
    .line 25
    iput-object p1, p0, Lea/c;->d:[Lea/b;

    .line 26
    .line 27
    const/4 p1, 0x7

    .line 28
    iput p1, p0, Lea/c;->e:I

    .line 29
    .line 30
    return-void
    .line 31
    .line 32
    .line 33
.end method


# virtual methods
.method public final a(I)I
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-lez p1, :cond_1

    .line 3
    .line 4
    iget-object v1, p0, Lea/c;->d:[Lea/b;

    .line 5
    .line 6
    array-length v1, v1

    .line 7
    add-int/lit8 v1, v1, -0x1

    .line 8
    .line 9
    :goto_0
    iget v2, p0, Lea/c;->e:I

    .line 10
    .line 11
    if-lt v1, v2, :cond_0

    .line 12
    .line 13
    if-lez p1, :cond_0

    .line 14
    .line 15
    iget-object v2, p0, Lea/c;->d:[Lea/b;

    .line 16
    .line 17
    aget-object v2, v2, v1

    .line 18
    .line 19
    invoke-static {v2}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iget v2, v2, Lea/b;->c:I

    .line 23
    .line 24
    sub-int/2addr p1, v2

    .line 25
    iget v3, p0, Lea/c;->g:I

    .line 26
    .line 27
    sub-int/2addr v3, v2

    .line 28
    iput v3, p0, Lea/c;->g:I

    .line 29
    .line 30
    iget v2, p0, Lea/c;->f:I

    .line 31
    .line 32
    add-int/lit8 v2, v2, -0x1

    .line 33
    .line 34
    iput v2, p0, Lea/c;->f:I

    .line 35
    .line 36
    add-int/lit8 v0, v0, 0x1

    .line 37
    .line 38
    add-int/lit8 v1, v1, -0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    iget-object p1, p0, Lea/c;->d:[Lea/b;

    .line 42
    .line 43
    add-int/lit8 v1, v2, 0x1

    .line 44
    .line 45
    add-int/lit8 v2, v2, 0x1

    .line 46
    .line 47
    add-int/2addr v2, v0

    .line 48
    iget v3, p0, Lea/c;->f:I

    .line 49
    .line 50
    invoke-static {p1, v1, p1, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 51
    .line 52
    .line 53
    iget p1, p0, Lea/c;->e:I

    .line 54
    .line 55
    add-int/2addr p1, v0

    .line 56
    iput p1, p0, Lea/c;->e:I

    .line 57
    .line 58
    :cond_1
    return v0
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

.method public final b(I)Lma/i;
    .locals 3

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    sget-object v0, Lea/e;->a:[Lea/b;

    .line 4
    .line 5
    array-length v1, v0

    .line 6
    add-int/lit8 v1, v1, -0x1

    .line 7
    .line 8
    if-gt p1, v1, :cond_0

    .line 9
    .line 10
    aget-object p1, v0, p1

    .line 11
    .line 12
    iget-object p1, p1, Lea/b;->a:Lma/i;

    .line 13
    .line 14
    return-object p1

    .line 15
    :cond_0
    sget-object v0, Lea/e;->a:[Lea/b;

    .line 16
    .line 17
    array-length v0, v0

    .line 18
    sub-int v0, p1, v0

    .line 19
    .line 20
    iget v1, p0, Lea/c;->e:I

    .line 21
    .line 22
    add-int/lit8 v1, v1, 0x1

    .line 23
    .line 24
    add-int/2addr v1, v0

    .line 25
    if-ltz v1, :cond_1

    .line 26
    .line 27
    iget-object v0, p0, Lea/c;->d:[Lea/b;

    .line 28
    .line 29
    array-length v2, v0

    .line 30
    if-ge v1, v2, :cond_1

    .line 31
    .line 32
    aget-object p1, v0, v1

    .line 33
    .line 34
    invoke-static {p1}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iget-object p1, p1, Lea/b;->a:Lma/i;

    .line 38
    .line 39
    return-object p1

    .line 40
    :cond_1
    new-instance v0, Ljava/io/IOException;

    .line 41
    .line 42
    add-int/lit8 p1, p1, 0x1

    .line 43
    .line 44
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    const-string v1, "Header index too large "

    .line 49
    .line 50
    invoke-static {p1, v1}, Lv8/i;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw v0
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

.method public final c(Lea/b;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lea/c;->b:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lea/c;->a:I

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    iget v2, p1, Lea/b;->c:I

    .line 10
    .line 11
    if-le v2, v0, :cond_0

    .line 12
    .line 13
    iget-object p1, p0, Lea/c;->d:[Lea/b;

    .line 14
    .line 15
    array-length v0, p1

    .line 16
    invoke-static {v1, v0, p1}, Li8/i;->t(II[Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Lea/c;->d:[Lea/b;

    .line 20
    .line 21
    array-length p1, p1

    .line 22
    add-int/lit8 p1, p1, -0x1

    .line 23
    .line 24
    iput p1, p0, Lea/c;->e:I

    .line 25
    .line 26
    iput v1, p0, Lea/c;->f:I

    .line 27
    .line 28
    iput v1, p0, Lea/c;->g:I

    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    iget v3, p0, Lea/c;->g:I

    .line 32
    .line 33
    add-int/2addr v3, v2

    .line 34
    sub-int/2addr v3, v0

    .line 35
    invoke-virtual {p0, v3}, Lea/c;->a(I)I

    .line 36
    .line 37
    .line 38
    iget v0, p0, Lea/c;->f:I

    .line 39
    .line 40
    add-int/lit8 v0, v0, 0x1

    .line 41
    .line 42
    iget-object v3, p0, Lea/c;->d:[Lea/b;

    .line 43
    .line 44
    array-length v4, v3

    .line 45
    if-le v0, v4, :cond_1

    .line 46
    .line 47
    array-length v0, v3

    .line 48
    mul-int/lit8 v0, v0, 0x2

    .line 49
    .line 50
    new-array v0, v0, [Lea/b;

    .line 51
    .line 52
    array-length v4, v3

    .line 53
    array-length v5, v3

    .line 54
    invoke-static {v3, v1, v0, v4, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 55
    .line 56
    .line 57
    iget-object v1, p0, Lea/c;->d:[Lea/b;

    .line 58
    .line 59
    array-length v1, v1

    .line 60
    add-int/lit8 v1, v1, -0x1

    .line 61
    .line 62
    iput v1, p0, Lea/c;->e:I

    .line 63
    .line 64
    iput-object v0, p0, Lea/c;->d:[Lea/b;

    .line 65
    .line 66
    :cond_1
    iget v0, p0, Lea/c;->e:I

    .line 67
    .line 68
    add-int/lit8 v1, v0, -0x1

    .line 69
    .line 70
    iput v1, p0, Lea/c;->e:I

    .line 71
    .line 72
    iget-object v1, p0, Lea/c;->d:[Lea/b;

    .line 73
    .line 74
    aput-object p1, v1, v0

    .line 75
    .line 76
    iget p1, p0, Lea/c;->f:I

    .line 77
    .line 78
    add-int/lit8 p1, p1, 0x1

    .line 79
    .line 80
    iput p1, p0, Lea/c;->f:I

    .line 81
    .line 82
    iget p1, p0, Lea/c;->g:I

    .line 83
    .line 84
    add-int/2addr p1, v2

    .line 85
    iput p1, p0, Lea/c;->g:I

    .line 86
    .line 87
    return-void
    .line 88
    .line 89
    .line 90
.end method

.method public final d()Lma/i;
    .locals 13

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    iget-object v1, p0, Lea/c;->c:Lma/r;

    .line 4
    .line 5
    invoke-virtual {v1}, Lma/r;->c()B

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    sget-object v3, LY9/c;->a:[B

    .line 10
    .line 11
    and-int/lit16 v3, v2, 0xff

    .line 12
    .line 13
    const/16 v4, 0x80

    .line 14
    .line 15
    and-int/2addr v2, v4

    .line 16
    const/4 v5, 0x0

    .line 17
    if-ne v2, v4, :cond_0

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v2, v5

    .line 22
    :goto_0
    const/16 v4, 0x7f

    .line 23
    .line 24
    invoke-virtual {p0, v3, v4}, Lea/c;->e(II)I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    int-to-long v3, v3

    .line 29
    if-eqz v2, :cond_6

    .line 30
    .line 31
    new-instance v2, Lma/f;

    .line 32
    .line 33
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 34
    .line 35
    .line 36
    sget-object v6, Lea/x;->a:[I

    .line 37
    .line 38
    const-string v6, "source"

    .line 39
    .line 40
    invoke-static {v1, v6}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    sget-object v6, Lea/x;->c:LE/g;

    .line 44
    .line 45
    const-wide/16 v7, 0x0

    .line 46
    .line 47
    move-object v10, v6

    .line 48
    move-wide v8, v7

    .line 49
    move v7, v5

    .line 50
    :cond_1
    cmp-long v11, v8, v3

    .line 51
    .line 52
    if-gez v11, :cond_3

    .line 53
    .line 54
    const-wide/16 v11, 0x1

    .line 55
    .line 56
    add-long/2addr v8, v11

    .line 57
    invoke-virtual {v1}, Lma/r;->c()B

    .line 58
    .line 59
    .line 60
    move-result v11

    .line 61
    sget-object v12, LY9/c;->a:[B

    .line 62
    .line 63
    and-int/lit16 v11, v11, 0xff

    .line 64
    .line 65
    shl-int/2addr v5, v0

    .line 66
    or-int/2addr v5, v11

    .line 67
    add-int/2addr v7, v0

    .line 68
    :goto_1
    if-lt v7, v0, :cond_1

    .line 69
    .line 70
    add-int/lit8 v11, v7, -0x8

    .line 71
    .line 72
    ushr-int v11, v5, v11

    .line 73
    .line 74
    and-int/lit16 v11, v11, 0xff

    .line 75
    .line 76
    iget-object v10, v10, LE/g;->u:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v10, [LE/g;

    .line 79
    .line 80
    invoke-static {v10}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    aget-object v10, v10, v11

    .line 84
    .line 85
    invoke-static {v10}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    iget-object v11, v10, LE/g;->u:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v11, [LE/g;

    .line 91
    .line 92
    if-nez v11, :cond_2

    .line 93
    .line 94
    iget v11, v10, LE/g;->s:I

    .line 95
    .line 96
    invoke-virtual {v2, v11}, Lma/f;->d0(I)V

    .line 97
    .line 98
    .line 99
    iget v10, v10, LE/g;->t:I

    .line 100
    .line 101
    sub-int/2addr v7, v10

    .line 102
    move-object v10, v6

    .line 103
    goto :goto_1

    .line 104
    :cond_2
    add-int/lit8 v7, v7, -0x8

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_3
    :goto_2
    if-lez v7, :cond_5

    .line 108
    .line 109
    rsub-int/lit8 v1, v7, 0x8

    .line 110
    .line 111
    shl-int v1, v5, v1

    .line 112
    .line 113
    and-int/lit16 v1, v1, 0xff

    .line 114
    .line 115
    iget-object v3, v10, LE/g;->u:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v3, [LE/g;

    .line 118
    .line 119
    invoke-static {v3}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    aget-object v1, v3, v1

    .line 123
    .line 124
    invoke-static {v1}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    iget-object v3, v1, LE/g;->u:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v3, [LE/g;

    .line 130
    .line 131
    if-nez v3, :cond_5

    .line 132
    .line 133
    iget v3, v1, LE/g;->t:I

    .line 134
    .line 135
    if-le v3, v7, :cond_4

    .line 136
    .line 137
    goto :goto_3

    .line 138
    :cond_4
    iget v1, v1, LE/g;->s:I

    .line 139
    .line 140
    invoke-virtual {v2, v1}, Lma/f;->d0(I)V

    .line 141
    .line 142
    .line 143
    sub-int/2addr v7, v3

    .line 144
    move-object v10, v6

    .line 145
    goto :goto_2

    .line 146
    :cond_5
    :goto_3
    iget-wide v0, v2, Lma/f;->t:J

    .line 147
    .line 148
    invoke-virtual {v2, v0, v1}, Lma/f;->B(J)Lma/i;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    return-object v0

    .line 153
    :cond_6
    invoke-virtual {v1, v3, v4}, Lma/r;->g(J)Lma/i;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    return-object v0
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
.end method

.method public final e(II)I
    .locals 3

    .line 1
    and-int/2addr p1, p2

    .line 2
    if-ge p1, p2, :cond_0

    .line 3
    .line 4
    return p1

    .line 5
    :cond_0
    const/4 p1, 0x0

    .line 6
    :goto_0
    iget-object v0, p0, Lea/c;->c:Lma/r;

    .line 7
    .line 8
    invoke-virtual {v0}, Lma/r;->c()B

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    sget-object v1, LY9/c;->a:[B

    .line 13
    .line 14
    and-int/lit16 v1, v0, 0xff

    .line 15
    .line 16
    and-int/lit16 v2, v0, 0x80

    .line 17
    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    and-int/lit8 v0, v0, 0x7f

    .line 21
    .line 22
    shl-int/2addr v0, p1

    .line 23
    add-int/2addr p2, v0

    .line 24
    add-int/lit8 p1, p1, 0x7

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    shl-int p1, v1, p1

    .line 28
    .line 29
    add-int/2addr p2, p1

    .line 30
    return p2
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

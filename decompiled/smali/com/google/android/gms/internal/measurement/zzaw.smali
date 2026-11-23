.class public final Lcom/google/android/gms/internal/measurement/zzaw;
.super Lcom/google/android/gms/internal/measurement/zzay;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzay;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzay;->a:Ljava/util/ArrayList;

    .line 5
    .line 6
    sget-object v1, Lcom/google/android/gms/internal/measurement/zzbv;->x:Lcom/google/android/gms/internal/measurement/zzbv;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzay;->a:Ljava/util/ArrayList;

    .line 12
    .line 13
    sget-object v1, Lcom/google/android/gms/internal/measurement/zzbv;->y:Lcom/google/android/gms/internal/measurement/zzbv;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzay;->a:Ljava/util/ArrayList;

    .line 19
    .line 20
    sget-object v1, Lcom/google/android/gms/internal/measurement/zzbv;->z:Lcom/google/android/gms/internal/measurement/zzbv;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzay;->a:Ljava/util/ArrayList;

    .line 26
    .line 27
    sget-object v1, Lcom/google/android/gms/internal/measurement/zzbv;->A:Lcom/google/android/gms/internal/measurement/zzbv;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzay;->a:Ljava/util/ArrayList;

    .line 33
    .line 34
    sget-object v1, Lcom/google/android/gms/internal/measurement/zzbv;->B:Lcom/google/android/gms/internal/measurement/zzbv;

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzay;->a:Ljava/util/ArrayList;

    .line 40
    .line 41
    sget-object v1, Lcom/google/android/gms/internal/measurement/zzbv;->C:Lcom/google/android/gms/internal/measurement/zzbv;

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzay;->a:Ljava/util/ArrayList;

    .line 47
    .line 48
    sget-object v1, Lcom/google/android/gms/internal/measurement/zzbv;->D:Lcom/google/android/gms/internal/measurement/zzbv;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    return-void
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
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzh;Ljava/util/ArrayList;)Lcom/google/android/gms/internal/measurement/zzaq;
    .locals 9

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/measurement/e;->a:[I

    .line 2
    .line 3
    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/zzg;->b(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzbv;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    aget v0, v0, v1

    .line 12
    .line 13
    const-wide/16 v1, 0x1f

    .line 14
    .line 15
    const/4 v3, 0x2

    .line 16
    const/4 v4, 0x1

    .line 17
    const/4 v5, 0x0

    .line 18
    packed-switch v0, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/zzay;->b(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const/4 p1, 0x0

    .line 25
    throw p1

    .line 26
    :pswitch_0
    sget-object p1, Lcom/google/android/gms/internal/measurement/zzbv;->D:Lcom/google/android/gms/internal/measurement/zzbv;

    .line 27
    .line 28
    invoke-static {p1, v3, p3}, Lcom/google/android/gms/internal/measurement/zzg;->e(Lcom/google/android/gms/internal/measurement/zzbv;ILjava/util/ArrayList;)V

    .line 29
    .line 30
    .line 31
    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, Lcom/google/android/gms/internal/measurement/zzaq;

    .line 36
    .line 37
    iget-object v0, p2, Lcom/google/android/gms/internal/measurement/zzh;->b:Lcom/google/android/gms/internal/measurement/zzbb;

    .line 38
    .line 39
    invoke-virtual {v0, p2, p1}, Lcom/google/android/gms/internal/measurement/zzbb;->a(Lcom/google/android/gms/internal/measurement/zzh;Lcom/google/android/gms/internal/measurement/zzaq;)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/zzaq;->e()Ljava/lang/Double;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    .line 48
    .line 49
    .line 50
    move-result-wide v0

    .line 51
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/measurement/zzg;->i(D)I

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    invoke-interface {p3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p3

    .line 59
    check-cast p3, Lcom/google/android/gms/internal/measurement/zzaq;

    .line 60
    .line 61
    iget-object v0, p2, Lcom/google/android/gms/internal/measurement/zzh;->b:Lcom/google/android/gms/internal/measurement/zzbb;

    .line 62
    .line 63
    invoke-virtual {v0, p2, p3}, Lcom/google/android/gms/internal/measurement/zzbb;->a(Lcom/google/android/gms/internal/measurement/zzh;Lcom/google/android/gms/internal/measurement/zzaq;)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    invoke-interface {p2}, Lcom/google/android/gms/internal/measurement/zzaq;->e()Ljava/lang/Double;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    .line 72
    .line 73
    .line 74
    move-result-wide p2

    .line 75
    invoke-static {p2, p3}, Lcom/google/android/gms/internal/measurement/zzg;->i(D)I

    .line 76
    .line 77
    .line 78
    move-result p2

    .line 79
    new-instance p3, Lcom/google/android/gms/internal/measurement/zzai;

    .line 80
    .line 81
    xor-int/2addr p1, p2

    .line 82
    int-to-double p1, p1

    .line 83
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-direct {p3, p1}, Lcom/google/android/gms/internal/measurement/zzai;-><init>(Ljava/lang/Double;)V

    .line 88
    .line 89
    .line 90
    return-object p3

    .line 91
    :pswitch_1
    sget-object p1, Lcom/google/android/gms/internal/measurement/zzbv;->C:Lcom/google/android/gms/internal/measurement/zzbv;

    .line 92
    .line 93
    invoke-static {p1, v3, p3}, Lcom/google/android/gms/internal/measurement/zzg;->e(Lcom/google/android/gms/internal/measurement/zzbv;ILjava/util/ArrayList;)V

    .line 94
    .line 95
    .line 96
    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    check-cast p1, Lcom/google/android/gms/internal/measurement/zzaq;

    .line 101
    .line 102
    iget-object v0, p2, Lcom/google/android/gms/internal/measurement/zzh;->b:Lcom/google/android/gms/internal/measurement/zzbb;

    .line 103
    .line 104
    invoke-virtual {v0, p2, p1}, Lcom/google/android/gms/internal/measurement/zzbb;->a(Lcom/google/android/gms/internal/measurement/zzh;Lcom/google/android/gms/internal/measurement/zzaq;)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/zzaq;->e()Ljava/lang/Double;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    .line 113
    .line 114
    .line 115
    move-result-wide v5

    .line 116
    invoke-static {v5, v6}, Lcom/google/android/gms/internal/measurement/zzg;->i(D)I

    .line 117
    .line 118
    .line 119
    move-result p1

    .line 120
    int-to-long v5, p1

    .line 121
    const-wide v7, 0xffffffffL

    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    and-long/2addr v5, v7

    .line 127
    invoke-interface {p3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    check-cast p1, Lcom/google/android/gms/internal/measurement/zzaq;

    .line 132
    .line 133
    iget-object p3, p2, Lcom/google/android/gms/internal/measurement/zzh;->b:Lcom/google/android/gms/internal/measurement/zzbb;

    .line 134
    .line 135
    invoke-virtual {p3, p2, p1}, Lcom/google/android/gms/internal/measurement/zzbb;->a(Lcom/google/android/gms/internal/measurement/zzh;Lcom/google/android/gms/internal/measurement/zzaq;)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/zzaq;->e()Ljava/lang/Double;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    .line 144
    .line 145
    .line 146
    move-result-wide p1

    .line 147
    invoke-static {p1, p2}, Lcom/google/android/gms/internal/measurement/zzg;->i(D)I

    .line 148
    .line 149
    .line 150
    move-result p1

    .line 151
    int-to-long p1, p1

    .line 152
    and-long/2addr p1, v1

    .line 153
    long-to-int p1, p1

    .line 154
    new-instance p2, Lcom/google/android/gms/internal/measurement/zzai;

    .line 155
    .line 156
    ushr-long v0, v5, p1

    .line 157
    .line 158
    long-to-double v0, v0

    .line 159
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    invoke-direct {p2, p1}, Lcom/google/android/gms/internal/measurement/zzai;-><init>(Ljava/lang/Double;)V

    .line 164
    .line 165
    .line 166
    return-object p2

    .line 167
    :pswitch_2
    sget-object p1, Lcom/google/android/gms/internal/measurement/zzbv;->B:Lcom/google/android/gms/internal/measurement/zzbv;

    .line 168
    .line 169
    invoke-static {p1, v3, p3}, Lcom/google/android/gms/internal/measurement/zzg;->e(Lcom/google/android/gms/internal/measurement/zzbv;ILjava/util/ArrayList;)V

    .line 170
    .line 171
    .line 172
    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    check-cast p1, Lcom/google/android/gms/internal/measurement/zzaq;

    .line 177
    .line 178
    iget-object v0, p2, Lcom/google/android/gms/internal/measurement/zzh;->b:Lcom/google/android/gms/internal/measurement/zzbb;

    .line 179
    .line 180
    invoke-virtual {v0, p2, p1}, Lcom/google/android/gms/internal/measurement/zzbb;->a(Lcom/google/android/gms/internal/measurement/zzh;Lcom/google/android/gms/internal/measurement/zzaq;)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/zzaq;->e()Ljava/lang/Double;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    .line 189
    .line 190
    .line 191
    move-result-wide v5

    .line 192
    invoke-static {v5, v6}, Lcom/google/android/gms/internal/measurement/zzg;->i(D)I

    .line 193
    .line 194
    .line 195
    move-result p1

    .line 196
    invoke-interface {p3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object p3

    .line 200
    check-cast p3, Lcom/google/android/gms/internal/measurement/zzaq;

    .line 201
    .line 202
    iget-object v0, p2, Lcom/google/android/gms/internal/measurement/zzh;->b:Lcom/google/android/gms/internal/measurement/zzbb;

    .line 203
    .line 204
    invoke-virtual {v0, p2, p3}, Lcom/google/android/gms/internal/measurement/zzbb;->a(Lcom/google/android/gms/internal/measurement/zzh;Lcom/google/android/gms/internal/measurement/zzaq;)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 205
    .line 206
    .line 207
    move-result-object p2

    .line 208
    invoke-interface {p2}, Lcom/google/android/gms/internal/measurement/zzaq;->e()Ljava/lang/Double;

    .line 209
    .line 210
    .line 211
    move-result-object p2

    .line 212
    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    .line 213
    .line 214
    .line 215
    move-result-wide p2

    .line 216
    invoke-static {p2, p3}, Lcom/google/android/gms/internal/measurement/zzg;->i(D)I

    .line 217
    .line 218
    .line 219
    move-result p2

    .line 220
    int-to-long p2, p2

    .line 221
    and-long/2addr p2, v1

    .line 222
    long-to-int p2, p2

    .line 223
    new-instance p3, Lcom/google/android/gms/internal/measurement/zzai;

    .line 224
    .line 225
    shr-int/2addr p1, p2

    .line 226
    int-to-double p1, p1

    .line 227
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 228
    .line 229
    .line 230
    move-result-object p1

    .line 231
    invoke-direct {p3, p1}, Lcom/google/android/gms/internal/measurement/zzai;-><init>(Ljava/lang/Double;)V

    .line 232
    .line 233
    .line 234
    return-object p3

    .line 235
    :pswitch_3
    sget-object p1, Lcom/google/android/gms/internal/measurement/zzbv;->A:Lcom/google/android/gms/internal/measurement/zzbv;

    .line 236
    .line 237
    invoke-static {p1, v3, p3}, Lcom/google/android/gms/internal/measurement/zzg;->e(Lcom/google/android/gms/internal/measurement/zzbv;ILjava/util/ArrayList;)V

    .line 238
    .line 239
    .line 240
    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object p1

    .line 244
    check-cast p1, Lcom/google/android/gms/internal/measurement/zzaq;

    .line 245
    .line 246
    iget-object v0, p2, Lcom/google/android/gms/internal/measurement/zzh;->b:Lcom/google/android/gms/internal/measurement/zzbb;

    .line 247
    .line 248
    invoke-virtual {v0, p2, p1}, Lcom/google/android/gms/internal/measurement/zzbb;->a(Lcom/google/android/gms/internal/measurement/zzh;Lcom/google/android/gms/internal/measurement/zzaq;)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 249
    .line 250
    .line 251
    move-result-object p1

    .line 252
    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/zzaq;->e()Ljava/lang/Double;

    .line 253
    .line 254
    .line 255
    move-result-object p1

    .line 256
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    .line 257
    .line 258
    .line 259
    move-result-wide v0

    .line 260
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/measurement/zzg;->i(D)I

    .line 261
    .line 262
    .line 263
    move-result p1

    .line 264
    invoke-interface {p3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object p3

    .line 268
    check-cast p3, Lcom/google/android/gms/internal/measurement/zzaq;

    .line 269
    .line 270
    iget-object v0, p2, Lcom/google/android/gms/internal/measurement/zzh;->b:Lcom/google/android/gms/internal/measurement/zzbb;

    .line 271
    .line 272
    invoke-virtual {v0, p2, p3}, Lcom/google/android/gms/internal/measurement/zzbb;->a(Lcom/google/android/gms/internal/measurement/zzh;Lcom/google/android/gms/internal/measurement/zzaq;)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 273
    .line 274
    .line 275
    move-result-object p2

    .line 276
    invoke-interface {p2}, Lcom/google/android/gms/internal/measurement/zzaq;->e()Ljava/lang/Double;

    .line 277
    .line 278
    .line 279
    move-result-object p2

    .line 280
    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    .line 281
    .line 282
    .line 283
    move-result-wide p2

    .line 284
    invoke-static {p2, p3}, Lcom/google/android/gms/internal/measurement/zzg;->i(D)I

    .line 285
    .line 286
    .line 287
    move-result p2

    .line 288
    new-instance p3, Lcom/google/android/gms/internal/measurement/zzai;

    .line 289
    .line 290
    or-int/2addr p1, p2

    .line 291
    int-to-double p1, p1

    .line 292
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 293
    .line 294
    .line 295
    move-result-object p1

    .line 296
    invoke-direct {p3, p1}, Lcom/google/android/gms/internal/measurement/zzai;-><init>(Ljava/lang/Double;)V

    .line 297
    .line 298
    .line 299
    return-object p3

    .line 300
    :pswitch_4
    sget-object p1, Lcom/google/android/gms/internal/measurement/zzbv;->z:Lcom/google/android/gms/internal/measurement/zzbv;

    .line 301
    .line 302
    invoke-static {p1, v4, p3}, Lcom/google/android/gms/internal/measurement/zzg;->e(Lcom/google/android/gms/internal/measurement/zzbv;ILjava/util/ArrayList;)V

    .line 303
    .line 304
    .line 305
    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object p1

    .line 309
    check-cast p1, Lcom/google/android/gms/internal/measurement/zzaq;

    .line 310
    .line 311
    iget-object p3, p2, Lcom/google/android/gms/internal/measurement/zzh;->b:Lcom/google/android/gms/internal/measurement/zzbb;

    .line 312
    .line 313
    invoke-virtual {p3, p2, p1}, Lcom/google/android/gms/internal/measurement/zzbb;->a(Lcom/google/android/gms/internal/measurement/zzh;Lcom/google/android/gms/internal/measurement/zzaq;)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 314
    .line 315
    .line 316
    move-result-object p1

    .line 317
    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/zzaq;->e()Ljava/lang/Double;

    .line 318
    .line 319
    .line 320
    move-result-object p1

    .line 321
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    .line 322
    .line 323
    .line 324
    move-result-wide p1

    .line 325
    invoke-static {p1, p2}, Lcom/google/android/gms/internal/measurement/zzg;->i(D)I

    .line 326
    .line 327
    .line 328
    move-result p1

    .line 329
    new-instance p2, Lcom/google/android/gms/internal/measurement/zzai;

    .line 330
    .line 331
    not-int p1, p1

    .line 332
    int-to-double v0, p1

    .line 333
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 334
    .line 335
    .line 336
    move-result-object p1

    .line 337
    invoke-direct {p2, p1}, Lcom/google/android/gms/internal/measurement/zzai;-><init>(Ljava/lang/Double;)V

    .line 338
    .line 339
    .line 340
    return-object p2

    .line 341
    :pswitch_5
    sget-object p1, Lcom/google/android/gms/internal/measurement/zzbv;->y:Lcom/google/android/gms/internal/measurement/zzbv;

    .line 342
    .line 343
    invoke-static {p1, v3, p3}, Lcom/google/android/gms/internal/measurement/zzg;->e(Lcom/google/android/gms/internal/measurement/zzbv;ILjava/util/ArrayList;)V

    .line 344
    .line 345
    .line 346
    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object p1

    .line 350
    check-cast p1, Lcom/google/android/gms/internal/measurement/zzaq;

    .line 351
    .line 352
    iget-object v0, p2, Lcom/google/android/gms/internal/measurement/zzh;->b:Lcom/google/android/gms/internal/measurement/zzbb;

    .line 353
    .line 354
    invoke-virtual {v0, p2, p1}, Lcom/google/android/gms/internal/measurement/zzbb;->a(Lcom/google/android/gms/internal/measurement/zzh;Lcom/google/android/gms/internal/measurement/zzaq;)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 355
    .line 356
    .line 357
    move-result-object p1

    .line 358
    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/zzaq;->e()Ljava/lang/Double;

    .line 359
    .line 360
    .line 361
    move-result-object p1

    .line 362
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    .line 363
    .line 364
    .line 365
    move-result-wide v5

    .line 366
    invoke-static {v5, v6}, Lcom/google/android/gms/internal/measurement/zzg;->i(D)I

    .line 367
    .line 368
    .line 369
    move-result p1

    .line 370
    invoke-interface {p3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    move-result-object p3

    .line 374
    check-cast p3, Lcom/google/android/gms/internal/measurement/zzaq;

    .line 375
    .line 376
    iget-object v0, p2, Lcom/google/android/gms/internal/measurement/zzh;->b:Lcom/google/android/gms/internal/measurement/zzbb;

    .line 377
    .line 378
    invoke-virtual {v0, p2, p3}, Lcom/google/android/gms/internal/measurement/zzbb;->a(Lcom/google/android/gms/internal/measurement/zzh;Lcom/google/android/gms/internal/measurement/zzaq;)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 379
    .line 380
    .line 381
    move-result-object p2

    .line 382
    invoke-interface {p2}, Lcom/google/android/gms/internal/measurement/zzaq;->e()Ljava/lang/Double;

    .line 383
    .line 384
    .line 385
    move-result-object p2

    .line 386
    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    .line 387
    .line 388
    .line 389
    move-result-wide p2

    .line 390
    invoke-static {p2, p3}, Lcom/google/android/gms/internal/measurement/zzg;->i(D)I

    .line 391
    .line 392
    .line 393
    move-result p2

    .line 394
    int-to-long p2, p2

    .line 395
    and-long/2addr p2, v1

    .line 396
    long-to-int p2, p2

    .line 397
    new-instance p3, Lcom/google/android/gms/internal/measurement/zzai;

    .line 398
    .line 399
    shl-int/2addr p1, p2

    .line 400
    int-to-double p1, p1

    .line 401
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 402
    .line 403
    .line 404
    move-result-object p1

    .line 405
    invoke-direct {p3, p1}, Lcom/google/android/gms/internal/measurement/zzai;-><init>(Ljava/lang/Double;)V

    .line 406
    .line 407
    .line 408
    return-object p3

    .line 409
    :pswitch_6
    sget-object p1, Lcom/google/android/gms/internal/measurement/zzbv;->x:Lcom/google/android/gms/internal/measurement/zzbv;

    .line 410
    .line 411
    invoke-static {p1, v3, p3}, Lcom/google/android/gms/internal/measurement/zzg;->e(Lcom/google/android/gms/internal/measurement/zzbv;ILjava/util/ArrayList;)V

    .line 412
    .line 413
    .line 414
    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 415
    .line 416
    .line 417
    move-result-object p1

    .line 418
    check-cast p1, Lcom/google/android/gms/internal/measurement/zzaq;

    .line 419
    .line 420
    iget-object v0, p2, Lcom/google/android/gms/internal/measurement/zzh;->b:Lcom/google/android/gms/internal/measurement/zzbb;

    .line 421
    .line 422
    invoke-virtual {v0, p2, p1}, Lcom/google/android/gms/internal/measurement/zzbb;->a(Lcom/google/android/gms/internal/measurement/zzh;Lcom/google/android/gms/internal/measurement/zzaq;)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 423
    .line 424
    .line 425
    move-result-object p1

    .line 426
    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/zzaq;->e()Ljava/lang/Double;

    .line 427
    .line 428
    .line 429
    move-result-object p1

    .line 430
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    .line 431
    .line 432
    .line 433
    move-result-wide v0

    .line 434
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/measurement/zzg;->i(D)I

    .line 435
    .line 436
    .line 437
    move-result p1

    .line 438
    invoke-interface {p3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    move-result-object p3

    .line 442
    check-cast p3, Lcom/google/android/gms/internal/measurement/zzaq;

    .line 443
    .line 444
    iget-object v0, p2, Lcom/google/android/gms/internal/measurement/zzh;->b:Lcom/google/android/gms/internal/measurement/zzbb;

    .line 445
    .line 446
    invoke-virtual {v0, p2, p3}, Lcom/google/android/gms/internal/measurement/zzbb;->a(Lcom/google/android/gms/internal/measurement/zzh;Lcom/google/android/gms/internal/measurement/zzaq;)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 447
    .line 448
    .line 449
    move-result-object p2

    .line 450
    invoke-interface {p2}, Lcom/google/android/gms/internal/measurement/zzaq;->e()Ljava/lang/Double;

    .line 451
    .line 452
    .line 453
    move-result-object p2

    .line 454
    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    .line 455
    .line 456
    .line 457
    move-result-wide p2

    .line 458
    invoke-static {p2, p3}, Lcom/google/android/gms/internal/measurement/zzg;->i(D)I

    .line 459
    .line 460
    .line 461
    move-result p2

    .line 462
    new-instance p3, Lcom/google/android/gms/internal/measurement/zzai;

    .line 463
    .line 464
    and-int/2addr p1, p2

    .line 465
    int-to-double p1, p1

    .line 466
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 467
    .line 468
    .line 469
    move-result-object p1

    .line 470
    invoke-direct {p3, p1}, Lcom/google/android/gms/internal/measurement/zzai;-><init>(Ljava/lang/Double;)V

    .line 471
    .line 472
    .line 473
    return-object p3

    .line 474
    nop

    .line 475
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method

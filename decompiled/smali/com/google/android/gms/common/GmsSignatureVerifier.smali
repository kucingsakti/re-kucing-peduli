.class public Lcom/google/android/gms/common/GmsSignatureVerifier;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
.end annotation

.annotation build Lcom/google/android/gms/common/internal/ShowFirstParty;
.end annotation

.annotation runtime Lcom/google/errorprone/annotations/RestrictedInheritance;
    allowedOnPath = ".*javatests/com/google/android/gmscore/integ/client/common/robolectric/.*"
    explanation = "Sub classing of GMS Core\'s APIs are restricted to testing fakes."
    link = "go/gmscore-restrictedinheritance"
.end annotation


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x1

    .line 4
    sget-object v3, Lcom/google/android/gms/internal/common/zzag;->t:LJ2/a;

    .line 5
    .line 6
    sget-object v3, Lcom/google/android/gms/internal/common/a;->w:Lcom/google/android/gms/internal/common/a;

    .line 7
    .line 8
    sget-object v3, Lv2/f;->d:Lv2/b;

    .line 9
    .line 10
    invoke-virtual {v3}, Lv2/b;->i0()[B

    .line 11
    .line 12
    .line 13
    move-result-object v4

    .line 14
    sget-object v5, Lv2/f;->b:Lv2/b;

    .line 15
    .line 16
    invoke-virtual {v5}, Lv2/b;->i0()[B

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    new-array v6, v0, [Ljava/lang/Object;

    .line 21
    .line 22
    aput-object v4, v6, v1

    .line 23
    .line 24
    aput-object v5, v6, v2

    .line 25
    .line 26
    invoke-static {v0, v6}, Lcom/google/android/gms/internal/common/zzah;->a(I[Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    new-instance v4, Lcom/google/android/gms/internal/common/a;

    .line 30
    .line 31
    invoke-direct {v4, v0, v6}, Lcom/google/android/gms/internal/common/a;-><init>(I[Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    invoke-static {v4}, Lcom/google/android/gms/internal/common/zzag;->q(Lcom/google/android/gms/internal/common/a;)Lcom/google/android/gms/internal/common/zzag;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    sget-object v5, Lv2/f;->c:Lv2/b;

    .line 39
    .line 40
    invoke-virtual {v5}, Lv2/b;->i0()[B

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    sget-object v7, Lv2/f;->a:Lv2/b;

    .line 45
    .line 46
    invoke-virtual {v7}, Lv2/b;->i0()[B

    .line 47
    .line 48
    .line 49
    move-result-object v7

    .line 50
    new-array v8, v0, [Ljava/lang/Object;

    .line 51
    .line 52
    aput-object v6, v8, v1

    .line 53
    .line 54
    aput-object v7, v8, v2

    .line 55
    .line 56
    invoke-static {v0, v8}, Lcom/google/android/gms/internal/common/zzah;->a(I[Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    new-instance v6, Lcom/google/android/gms/internal/common/a;

    .line 60
    .line 61
    invoke-direct {v6, v0, v8}, Lcom/google/android/gms/internal/common/a;-><init>(I[Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    invoke-static {v6}, Lcom/google/android/gms/internal/common/zzag;->q(Lcom/google/android/gms/internal/common/a;)Lcom/google/android/gms/internal/common/zzag;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {v4}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    const-string v6, "Either orderedTestCerts or orderedProdCerts must have at least one cert"

    .line 73
    .line 74
    if-eqz v4, :cond_1

    .line 75
    .line 76
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-nez v0, :cond_0

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 84
    .line 85
    invoke-direct {v0, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    throw v0

    .line 89
    :cond_1
    :goto_0
    invoke-virtual {v3}, Lv2/b;->i0()[B

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    new-array v3, v2, [Ljava/lang/Object;

    .line 94
    .line 95
    aput-object v0, v3, v1

    .line 96
    .line 97
    invoke-static {v2, v3}, Lcom/google/android/gms/internal/common/zzah;->a(I[Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    new-instance v0, Lcom/google/android/gms/internal/common/a;

    .line 101
    .line 102
    invoke-direct {v0, v2, v3}, Lcom/google/android/gms/internal/common/a;-><init>(I[Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    invoke-static {v0}, Lcom/google/android/gms/internal/common/zzag;->q(Lcom/google/android/gms/internal/common/a;)Lcom/google/android/gms/internal/common/zzag;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-virtual {v5}, Lv2/b;->i0()[B

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    new-array v4, v2, [Ljava/lang/Object;

    .line 114
    .line 115
    aput-object v3, v4, v1

    .line 116
    .line 117
    invoke-static {v2, v4}, Lcom/google/android/gms/internal/common/zzah;->a(I[Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    new-instance v1, Lcom/google/android/gms/internal/common/a;

    .line 121
    .line 122
    invoke-direct {v1, v2, v4}, Lcom/google/android/gms/internal/common/a;-><init>(I[Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    invoke-static {v1}, Lcom/google/android/gms/internal/common/zzag;->q(Lcom/google/android/gms/internal/common/a;)Lcom/google/android/gms/internal/common/zzag;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    if-eqz v0, :cond_3

    .line 134
    .line 135
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    if-nez v0, :cond_2

    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 143
    .line 144
    invoke-direct {v0, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    throw v0

    .line 148
    :cond_3
    :goto_1
    new-instance v0, Ljava/util/HashMap;

    .line 149
    .line 150
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 151
    .line 152
    .line 153
    return-void
    .line 154
    .line 155
    .line 156
    .line 157
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

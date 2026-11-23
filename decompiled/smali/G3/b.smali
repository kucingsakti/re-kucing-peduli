.class public abstract LG3/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LA3/F;

.field public static final b:LA3/q;

.field public static final c:LA3/q;

.field public static final d:LA3/q;


# direct methods
.method static constructor <clinit>()V
    .locals 17

    .line 1
    const/4 v0, 0x7

    .line 2
    const/4 v1, 0x6

    .line 3
    const/4 v2, 0x5

    .line 4
    const/4 v3, 0x4

    .line 5
    const/4 v4, 0x3

    .line 6
    const/4 v5, 0x2

    .line 7
    const/4 v6, 0x1

    .line 8
    const/4 v7, 0x0

    .line 9
    const-string v13, "_exp_clear"

    .line 10
    .line 11
    const-string v14, "_exp_activate"

    .line 12
    .line 13
    const-string v8, "_ac"

    .line 14
    .line 15
    const-string v9, "campaign_details"

    .line 16
    .line 17
    const-string v10, "_ug"

    .line 18
    .line 19
    const-string v11, "_iapx"

    .line 20
    .line 21
    const-string v12, "_exp_set"

    .line 22
    .line 23
    const-string v15, "_exp_timeout"

    .line 24
    .line 25
    const-string v16, "_exp_expire"

    .line 26
    .line 27
    filled-new-array/range {v8 .. v16}, [Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v8

    .line 31
    sget v9, LA3/F;->t:I

    .line 32
    .line 33
    const/16 v9, 0xf

    .line 34
    .line 35
    new-array v10, v9, [Ljava/lang/Object;

    .line 36
    .line 37
    const-string v11, "_in"

    .line 38
    .line 39
    aput-object v11, v10, v7

    .line 40
    .line 41
    const-string v11, "_xa"

    .line 42
    .line 43
    aput-object v11, v10, v6

    .line 44
    .line 45
    const-string v11, "_xu"

    .line 46
    .line 47
    aput-object v11, v10, v5

    .line 48
    .line 49
    const-string v11, "_aq"

    .line 50
    .line 51
    aput-object v11, v10, v4

    .line 52
    .line 53
    const-string v11, "_aa"

    .line 54
    .line 55
    aput-object v11, v10, v3

    .line 56
    .line 57
    const-string v11, "_ai"

    .line 58
    .line 59
    aput-object v11, v10, v2

    .line 60
    .line 61
    const/16 v11, 0x9

    .line 62
    .line 63
    invoke-static {v8, v7, v10, v1, v11}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 64
    .line 65
    .line 66
    invoke-static {v9, v9, v10}, LA3/F;->q(II[Ljava/lang/Object;)LA3/F;

    .line 67
    .line 68
    .line 69
    move-result-object v8

    .line 70
    sput-object v8, LG3/b;->a:LA3/F;

    .line 71
    .line 72
    sget v8, LA3/q;->t:I

    .line 73
    .line 74
    new-array v8, v0, [Ljava/lang/Object;

    .line 75
    .line 76
    const-string v10, "_e"

    .line 77
    .line 78
    aput-object v10, v8, v7

    .line 79
    .line 80
    const-string v10, "_f"

    .line 81
    .line 82
    aput-object v10, v8, v6

    .line 83
    .line 84
    const-string v10, "_iap"

    .line 85
    .line 86
    aput-object v10, v8, v5

    .line 87
    .line 88
    const-string v10, "_s"

    .line 89
    .line 90
    aput-object v10, v8, v4

    .line 91
    .line 92
    const-string v10, "_au"

    .line 93
    .line 94
    aput-object v10, v8, v3

    .line 95
    .line 96
    const-string v10, "_ui"

    .line 97
    .line 98
    aput-object v10, v8, v2

    .line 99
    .line 100
    const-string v2, "_cd"

    .line 101
    .line 102
    aput-object v2, v8, v1

    .line 103
    .line 104
    invoke-static {v0, v8}, LJ7/j;->c(I[Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    invoke-static {v0, v8}, LA3/q;->o(I[Ljava/lang/Object;)LA3/q;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    sput-object v0, LG3/b;->b:LA3/q;

    .line 112
    .line 113
    new-array v0, v4, [Ljava/lang/Object;

    .line 114
    .line 115
    const-string v1, "auto"

    .line 116
    .line 117
    aput-object v1, v0, v7

    .line 118
    .line 119
    const-string v1, "app"

    .line 120
    .line 121
    aput-object v1, v0, v6

    .line 122
    .line 123
    const-string v1, "am"

    .line 124
    .line 125
    aput-object v1, v0, v5

    .line 126
    .line 127
    invoke-static {v4, v0}, LJ7/j;->c(I[Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    invoke-static {v4, v0}, LA3/q;->o(I[Ljava/lang/Object;)LA3/q;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    sput-object v0, LG3/b;->c:LA3/q;

    .line 135
    .line 136
    new-array v0, v5, [Ljava/lang/Object;

    .line 137
    .line 138
    const-string v1, "_r"

    .line 139
    .line 140
    aput-object v1, v0, v7

    .line 141
    .line 142
    const-string v1, "_dbg"

    .line 143
    .line 144
    aput-object v1, v0, v6

    .line 145
    .line 146
    invoke-static {v5, v0}, LJ7/j;->c(I[Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    invoke-static {v5, v0}, LA3/q;->o(I[Ljava/lang/Object;)LA3/q;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    sput-object v0, LG3/b;->d:LA3/q;

    .line 154
    .line 155
    new-array v0, v3, [Ljava/lang/Object;

    .line 156
    .line 157
    sget-object v1, Lcom/google/android/gms/measurement/internal/zzis;->a:[Ljava/lang/String;

    .line 158
    .line 159
    invoke-static {v9, v1}, LJ7/j;->c(I[Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    invoke-static {v3, v9}, LC8/E;->k(II)I

    .line 163
    .line 164
    .line 165
    move-result v2

    .line 166
    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    invoke-static {v1, v7, v0, v7, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 171
    .line 172
    .line 173
    sget-object v1, Lcom/google/android/gms/measurement/internal/zzis;->b:[Ljava/lang/String;

    .line 174
    .line 175
    invoke-static {v9, v1}, LJ7/j;->c(I[Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    array-length v2, v0

    .line 179
    const/16 v3, 0x1e

    .line 180
    .line 181
    if-ge v2, v3, :cond_0

    .line 182
    .line 183
    array-length v2, v0

    .line 184
    invoke-static {v2, v3}, LC8/E;->k(II)I

    .line 185
    .line 186
    .line 187
    move-result v2

    .line 188
    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    :cond_0
    invoke-static {v1, v7, v0, v9, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 193
    .line 194
    .line 195
    invoke-static {v3, v0}, LA3/q;->o(I[Ljava/lang/Object;)LA3/q;

    .line 196
    .line 197
    .line 198
    new-array v0, v5, [Ljava/lang/Object;

    .line 199
    .line 200
    const-string v1, "^_ltv_[A-Z]{3}$"

    .line 201
    .line 202
    aput-object v1, v0, v7

    .line 203
    .line 204
    const-string v1, "^_cc[1-5]{1}$"

    .line 205
    .line 206
    aput-object v1, v0, v6

    .line 207
    .line 208
    invoke-static {v5, v0}, LJ7/j;->c(I[Ljava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    invoke-static {v5, v0}, LA3/q;->o(I[Ljava/lang/Object;)LA3/q;

    .line 212
    .line 213
    .line 214
    return-void
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

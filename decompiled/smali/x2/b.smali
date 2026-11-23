.class public final Lx2/b;
.super Lx2/j;
.source "SourceFile"


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/internal/zaaw;Lcom/google/android/gms/common/api/internal/zaaw;Lcom/google/android/gms/signin/internal/zak;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lx2/b;->b:I

    .line 1
    iput-object p2, p0, Lx2/b;->c:Ljava/lang/Object;

    iput-object p3, p0, Lx2/b;->d:Ljava/lang/Object;

    invoke-direct {p0, p1}, Lx2/j;-><init>(Lcom/google/android/gms/common/api/internal/zabf;)V

    return-void
.end method

.method public constructor <init>(Lx2/d;Lcom/google/android/gms/common/api/internal/zabf;Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lx2/b;->b:I

    .line 2
    iput-object p1, p0, Lx2/b;->d:Ljava/lang/Object;

    iput-object p3, p0, Lx2/b;->c:Ljava/lang/Object;

    invoke-direct {p0, p2}, Lx2/j;-><init>(Lcom/google/android/gms/common/api/internal/zabf;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    .line 1
    iget-object v0, p0, Lx2/b;->d:Ljava/lang/Object;

    .line 2
    .line 3
    iget-object v1, p0, Lx2/b;->c:Ljava/lang/Object;

    .line 4
    .line 5
    iget v2, p0, Lx2/b;->b:I

    .line 6
    .line 7
    packed-switch v2, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast v1, Lcom/google/android/gms/common/api/internal/zaaw;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-virtual {v1, v2}, Lcom/google/android/gms/common/api/internal/zaaw;->n(I)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-nez v2, :cond_0

    .line 18
    .line 19
    goto/16 :goto_1

    .line 20
    .line 21
    :cond_0
    check-cast v0, Lcom/google/android/gms/signin/internal/zak;

    .line 22
    .line 23
    iget-object v2, v0, Lcom/google/android/gms/signin/internal/zak;->t:Lcom/google/android/gms/common/ConnectionResult;

    .line 24
    .line 25
    invoke-virtual {v2}, Lcom/google/android/gms/common/ConnectionResult;->T()Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_4

    .line 30
    .line 31
    iget-object v0, v0, Lcom/google/android/gms/signin/internal/zak;->u:Lcom/google/android/gms/common/internal/zav;

    .line 32
    .line 33
    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->i(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iget-object v2, v0, Lcom/google/android/gms/common/internal/zav;->u:Lcom/google/android/gms/common/ConnectionResult;

    .line 37
    .line 38
    invoke-virtual {v2}, Lcom/google/android/gms/common/ConnectionResult;->T()Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-nez v3, :cond_1

    .line 43
    .line 44
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    new-instance v3, Ljava/lang/Exception;

    .line 49
    .line 50
    invoke-direct {v3}, Ljava/lang/Exception;-><init>()V

    .line 51
    .line 52
    .line 53
    const-string v4, "Sign-in succeeded with resolve account failure: "

    .line 54
    .line 55
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    const-string v4, "GACConnecting"

    .line 60
    .line 61
    invoke-static {v4, v0, v3}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1, v2}, Lcom/google/android/gms/common/api/internal/zaaw;->k(Lcom/google/android/gms/common/ConnectionResult;)V

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_1
    const/4 v2, 0x1

    .line 69
    iput-boolean v2, v1, Lcom/google/android/gms/common/api/internal/zaaw;->n:Z

    .line 70
    .line 71
    iget-object v2, v0, Lcom/google/android/gms/common/internal/zav;->t:Landroid/os/IBinder;

    .line 72
    .line 73
    if-nez v2, :cond_2

    .line 74
    .line 75
    const/4 v2, 0x0

    .line 76
    goto :goto_0

    .line 77
    :cond_2
    sget v3, Lcom/google/android/gms/common/internal/IAccountAccessor$Stub;->b:I

    .line 78
    .line 79
    const-string v3, "com.google.android.gms.common.internal.IAccountAccessor"

    .line 80
    .line 81
    invoke-interface {v2, v3}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    instance-of v5, v4, Lcom/google/android/gms/common/internal/IAccountAccessor;

    .line 86
    .line 87
    if-eqz v5, :cond_3

    .line 88
    .line 89
    move-object v2, v4

    .line 90
    check-cast v2, Lcom/google/android/gms/common/internal/IAccountAccessor;

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_3
    new-instance v4, Lcom/google/android/gms/common/internal/zzw;

    .line 94
    .line 95
    invoke-direct {v4, v2, v3}, Lcom/google/android/gms/internal/common/zza;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    move-object v2, v4

    .line 99
    :goto_0
    invoke-static {v2}, Lcom/google/android/gms/common/internal/Preconditions;->i(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    iput-object v2, v1, Lcom/google/android/gms/common/api/internal/zaaw;->o:Lcom/google/android/gms/common/internal/IAccountAccessor;

    .line 103
    .line 104
    iget-boolean v2, v0, Lcom/google/android/gms/common/internal/zav;->v:Z

    .line 105
    .line 106
    iput-boolean v2, v1, Lcom/google/android/gms/common/api/internal/zaaw;->p:Z

    .line 107
    .line 108
    iget-boolean v0, v0, Lcom/google/android/gms/common/internal/zav;->w:Z

    .line 109
    .line 110
    iput-boolean v0, v1, Lcom/google/android/gms/common/api/internal/zaaw;->q:Z

    .line 111
    .line 112
    invoke-virtual {v1}, Lcom/google/android/gms/common/api/internal/zaaw;->m()V

    .line 113
    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_4
    iget-boolean v0, v1, Lcom/google/android/gms/common/api/internal/zaaw;->l:Z

    .line 117
    .line 118
    if-eqz v0, :cond_5

    .line 119
    .line 120
    invoke-virtual {v2}, Lcom/google/android/gms/common/ConnectionResult;->K()Z

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    if-nez v0, :cond_5

    .line 125
    .line 126
    invoke-virtual {v1}, Lcom/google/android/gms/common/api/internal/zaaw;->h()V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v1}, Lcom/google/android/gms/common/api/internal/zaaw;->m()V

    .line 130
    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_5
    invoke-virtual {v1, v2}, Lcom/google/android/gms/common/api/internal/zaaw;->k(Lcom/google/android/gms/common/ConnectionResult;)V

    .line 134
    .line 135
    .line 136
    :goto_1
    return-void

    .line 137
    :pswitch_0
    check-cast v0, Lx2/d;

    .line 138
    .line 139
    iget-object v0, v0, Lx2/d;->v:Lcom/google/android/gms/common/api/internal/zaaw;

    .line 140
    .line 141
    check-cast v1, Lcom/google/android/gms/common/ConnectionResult;

    .line 142
    .line 143
    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/internal/zaaw;->k(Lcom/google/android/gms/common/ConnectionResult;)V

    .line 144
    .line 145
    .line 146
    return-void

    .line 147
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
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

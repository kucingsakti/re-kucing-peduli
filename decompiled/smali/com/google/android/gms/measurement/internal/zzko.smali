.class public final synthetic Lcom/google/android/gms/measurement/internal/zzko;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public synthetic s:LB4/I;

.field public synthetic t:I

.field public synthetic u:Ljava/io/IOException;

.field public synthetic v:[B


# virtual methods
.method public final run()V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v0, "gad_source"

    .line 4
    .line 5
    const-string v2, "gbraid"

    .line 6
    .line 7
    const-string v3, "gclid"

    .line 8
    .line 9
    const-string v4, ""

    .line 10
    .line 11
    iget-object v5, v1, Lcom/google/android/gms/measurement/internal/zzko;->s:LB4/I;

    .line 12
    .line 13
    iget-object v5, v5, LB4/I;->u:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v5, Lcom/google/android/gms/measurement/internal/zzhl;

    .line 16
    .line 17
    iget-object v5, v5, Lcom/google/android/gms/measurement/internal/zzhl;->a:Lcom/google/android/gms/measurement/internal/zzhj;

    .line 18
    .line 19
    iget-object v6, v5, Lcom/google/android/gms/measurement/internal/zzhj;->A:Lcom/google/android/gms/measurement/internal/zzfw;

    .line 20
    .line 21
    iget v7, v1, Lcom/google/android/gms/measurement/internal/zzko;->t:I

    .line 22
    .line 23
    iget-object v8, v1, Lcom/google/android/gms/measurement/internal/zzko;->u:Ljava/io/IOException;

    .line 24
    .line 25
    const/16 v9, 0xc8

    .line 26
    .line 27
    if-eq v7, v9, :cond_0

    .line 28
    .line 29
    const/16 v9, 0xcc

    .line 30
    .line 31
    if-eq v7, v9, :cond_0

    .line 32
    .line 33
    const/16 v9, 0x130

    .line 34
    .line 35
    if-ne v7, v9, :cond_9

    .line 36
    .line 37
    :cond_0
    if-nez v8, :cond_9

    .line 38
    .line 39
    iget-object v7, v5, Lcom/google/android/gms/measurement/internal/zzhj;->z:LM2/w;

    .line 40
    .line 41
    invoke-static {v7}, Lcom/google/android/gms/measurement/internal/zzhj;->e(LB1/a;)V

    .line 42
    .line 43
    .line 44
    iget-object v7, v7, LM2/w;->M:Lcom/google/android/gms/measurement/internal/zzgk;

    .line 45
    .line 46
    const/4 v8, 0x1

    .line 47
    invoke-virtual {v7, v8}, Lcom/google/android/gms/measurement/internal/zzgk;->a(Z)V

    .line 48
    .line 49
    .line 50
    iget-object v7, v1, Lcom/google/android/gms/measurement/internal/zzko;->v:[B

    .line 51
    .line 52
    if-eqz v7, :cond_8

    .line 53
    .line 54
    array-length v8, v7

    .line 55
    if-nez v8, :cond_1

    .line 56
    .line 57
    goto/16 :goto_2

    .line 58
    .line 59
    :cond_1
    new-instance v8, Ljava/lang/String;

    .line 60
    .line 61
    invoke-direct {v8, v7}, Ljava/lang/String;-><init>([B)V

    .line 62
    .line 63
    .line 64
    :try_start_0
    new-instance v7, Lorg/json/JSONObject;

    .line 65
    .line 66
    invoke-direct {v7, v8}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    const-string v8, "deeplink"

    .line 70
    .line 71
    invoke-virtual {v7, v8, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v8

    .line 75
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 76
    .line 77
    .line 78
    move-result v9

    .line 79
    if-eqz v9, :cond_2

    .line 80
    .line 81
    invoke-static {v6}, Lcom/google/android/gms/measurement/internal/zzhj;->g(LM2/L;)V

    .line 82
    .line 83
    .line 84
    iget-object v0, v6, Lcom/google/android/gms/measurement/internal/zzfw;->E:Lcom/google/android/gms/measurement/internal/zzfy;

    .line 85
    .line 86
    const-string v2, "Deferred Deep Link is empty."

    .line 87
    .line 88
    invoke-virtual {v0, v2}, Lcom/google/android/gms/measurement/internal/zzfy;->b(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :catch_0
    move-exception v0

    .line 93
    goto/16 :goto_1

    .line 94
    .line 95
    :cond_2
    invoke-virtual {v7, v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v9

    .line 99
    invoke-virtual {v7, v2, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v10

    .line 103
    invoke-virtual {v7, v0, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    const-string v11, "timestamp"

    .line 108
    .line 109
    const-wide/16 v12, 0x0

    .line 110
    .line 111
    invoke-virtual {v7, v11, v12, v13}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    .line 112
    .line 113
    .line 114
    move-result-wide v11

    .line 115
    new-instance v7, Landroid/os/Bundle;

    .line 116
    .line 117
    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    .line 118
    .line 119
    .line 120
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzoj;->a()Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 121
    .line 122
    .line 123
    iget-object v13, v5, Lcom/google/android/gms/measurement/internal/zzhj;->y:Lcom/google/android/gms/measurement/internal/zzag;

    .line 124
    .line 125
    :try_start_1
    sget-object v14, Lcom/google/android/gms/measurement/internal/zzbf;->L0:Lcom/google/android/gms/measurement/internal/zzfj;

    .line 126
    .line 127
    const/4 v15, 0x0

    .line 128
    invoke-virtual {v13, v15, v14}, Lcom/google/android/gms/measurement/internal/zzag;->h1(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzfj;)Z

    .line 129
    .line 130
    .line 131
    move-result v16
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 132
    iget-object v15, v5, Lcom/google/android/gms/measurement/internal/zzhj;->D:Lcom/google/android/gms/measurement/internal/zznp;

    .line 133
    .line 134
    if-eqz v16, :cond_5

    .line 135
    .line 136
    :try_start_2
    invoke-static {v15}, Lcom/google/android/gms/measurement/internal/zzhj;->e(LB1/a;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v15, v8}, Lcom/google/android/gms/measurement/internal/zznp;->f2(Ljava/lang/String;)Z

    .line 140
    .line 141
    .line 142
    move-result v16

    .line 143
    if-nez v16, :cond_3

    .line 144
    .line 145
    invoke-static {v6}, Lcom/google/android/gms/measurement/internal/zzhj;->g(LM2/L;)V

    .line 146
    .line 147
    .line 148
    iget-object v0, v6, Lcom/google/android/gms/measurement/internal/zzfw;->A:Lcom/google/android/gms/measurement/internal/zzfy;

    .line 149
    .line 150
    const-string v2, "Deferred Deep Link validation failed. gclid, gbraid, deep link"

    .line 151
    .line 152
    invoke-virtual {v0, v2, v9, v10, v8}, Lcom/google/android/gms/measurement/internal/zzfy;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    return-void

    .line 156
    :cond_3
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 157
    .line 158
    .line 159
    move-result v16

    .line 160
    if-nez v16, :cond_4

    .line 161
    .line 162
    invoke-virtual {v7, v2, v10}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    :cond_4
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 166
    .line 167
    .line 168
    move-result v2

    .line 169
    if-nez v2, :cond_6

    .line 170
    .line 171
    invoke-virtual {v7, v0, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    goto :goto_0

    .line 175
    :cond_5
    invoke-static {v15}, Lcom/google/android/gms/measurement/internal/zzhj;->e(LB1/a;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v15, v8}, Lcom/google/android/gms/measurement/internal/zznp;->f2(Ljava/lang/String;)Z

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    if-nez v0, :cond_6

    .line 183
    .line 184
    invoke-static {v6}, Lcom/google/android/gms/measurement/internal/zzhj;->g(LM2/L;)V

    .line 185
    .line 186
    .line 187
    iget-object v0, v6, Lcom/google/android/gms/measurement/internal/zzfw;->A:Lcom/google/android/gms/measurement/internal/zzfy;

    .line 188
    .line 189
    const-string v2, "Deferred Deep Link validation failed. gclid, deep link"

    .line 190
    .line 191
    invoke-virtual {v0, v2, v9, v8}, Lcom/google/android/gms/measurement/internal/zzfy;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    return-void

    .line 195
    :cond_6
    :goto_0
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzoj;->a()Z

    .line 196
    .line 197
    .line 198
    const/4 v0, 0x0

    .line 199
    invoke-virtual {v13, v0, v14}, Lcom/google/android/gms/measurement/internal/zzag;->h1(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzfj;)Z

    .line 200
    .line 201
    .line 202
    invoke-virtual {v7, v3, v9}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    const-string v0, "_cis"

    .line 206
    .line 207
    const-string v2, "ddp"

    .line 208
    .line 209
    invoke-virtual {v7, v0, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    iget-object v0, v5, Lcom/google/android/gms/measurement/internal/zzhj;->H:Lcom/google/android/gms/measurement/internal/zziv;

    .line 213
    .line 214
    const-string v2, "auto"

    .line 215
    .line 216
    const-string v3, "_cmp"

    .line 217
    .line 218
    invoke-virtual {v0, v2, v3, v7}, Lcom/google/android/gms/measurement/internal/zziv;->B1(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 219
    .line 220
    .line 221
    invoke-static {v15}, Lcom/google/android/gms/measurement/internal/zzhj;->e(LB1/a;)V

    .line 222
    .line 223
    .line 224
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 225
    .line 226
    .line 227
    move-result v0

    .line 228
    if-nez v0, :cond_7

    .line 229
    .line 230
    invoke-virtual {v15, v8, v11, v12}, Lcom/google/android/gms/measurement/internal/zznp;->F1(Ljava/lang/String;D)Z

    .line 231
    .line 232
    .line 233
    move-result v0

    .line 234
    if-eqz v0, :cond_7

    .line 235
    .line 236
    new-instance v0, Landroid/content/Intent;

    .line 237
    .line 238
    const-string v2, "android.google.analytics.action.DEEPLINK_ACTION"

    .line 239
    .line 240
    invoke-direct {v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    iget-object v2, v15, LB1/a;->s:Ljava/lang/Object;

    .line 244
    .line 245
    check-cast v2, Lcom/google/android/gms/measurement/internal/zzhj;

    .line 246
    .line 247
    iget-object v2, v2, Lcom/google/android/gms/measurement/internal/zzhj;->s:Landroid/content/Context;

    .line 248
    .line 249
    invoke-virtual {v2, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    .line 250
    .line 251
    .line 252
    return-void

    .line 253
    :goto_1
    invoke-static {v6}, Lcom/google/android/gms/measurement/internal/zzhj;->g(LM2/L;)V

    .line 254
    .line 255
    .line 256
    const-string v2, "Failed to parse the Deferred Deep Link response. exception"

    .line 257
    .line 258
    iget-object v3, v6, Lcom/google/android/gms/measurement/internal/zzfw;->x:Lcom/google/android/gms/measurement/internal/zzfy;

    .line 259
    .line 260
    invoke-virtual {v3, v0, v2}, Lcom/google/android/gms/measurement/internal/zzfy;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    :cond_7
    return-void

    .line 264
    :cond_8
    :goto_2
    invoke-static {v6}, Lcom/google/android/gms/measurement/internal/zzhj;->g(LM2/L;)V

    .line 265
    .line 266
    .line 267
    const-string v0, "Deferred Deep Link response empty."

    .line 268
    .line 269
    iget-object v2, v6, Lcom/google/android/gms/measurement/internal/zzfw;->E:Lcom/google/android/gms/measurement/internal/zzfy;

    .line 270
    .line 271
    invoke-virtual {v2, v0}, Lcom/google/android/gms/measurement/internal/zzfy;->b(Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    return-void

    .line 275
    :cond_9
    invoke-static {v6}, Lcom/google/android/gms/measurement/internal/zzhj;->g(LM2/L;)V

    .line 276
    .line 277
    .line 278
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    iget-object v2, v6, Lcom/google/android/gms/measurement/internal/zzfw;->A:Lcom/google/android/gms/measurement/internal/zzfy;

    .line 283
    .line 284
    const-string v3, "Network Request for Deferred Deep Link failed. response, exception"

    .line 285
    .line 286
    invoke-virtual {v2, v3, v0, v8}, Lcom/google/android/gms/measurement/internal/zzfy;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 287
    .line 288
    .line 289
    return-void
    .line 290
    .line 291
    .line 292
    .line 293
.end method

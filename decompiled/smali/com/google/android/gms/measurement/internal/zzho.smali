.class public final synthetic Lcom/google/android/gms/measurement/internal/zzho;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public synthetic s:Lcom/google/android/gms/measurement/internal/zzhn;

.field public synthetic t:Ljava/lang/String;

.field public synthetic u:Landroid/os/Bundle;


# virtual methods
.method public final run()V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzho;->s:Lcom/google/android/gms/measurement/internal/zzhn;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzhn;->b:Lcom/google/android/gms/measurement/internal/zznc;

    .line 4
    .line 5
    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/zznc;->u:LM2/g;

    .line 6
    .line 7
    invoke-static {v1}, Lcom/google/android/gms/measurement/internal/zznc;->n(LM2/m0;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, LB1/a;->W0()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1}, LM2/m0;->a1()V

    .line 14
    .line 15
    .line 16
    new-instance v2, Lcom/google/android/gms/measurement/internal/zzba;

    .line 17
    .line 18
    iget-object v5, p0, Lcom/google/android/gms/measurement/internal/zzho;->t:Ljava/lang/String;

    .line 19
    .line 20
    const-string v6, "dep"

    .line 21
    .line 22
    iget-object v9, p0, Lcom/google/android/gms/measurement/internal/zzho;->u:Landroid/os/Bundle;

    .line 23
    .line 24
    iget-object v0, v1, LB1/a;->s:Ljava/lang/Object;

    .line 25
    .line 26
    move-object v3, v0

    .line 27
    check-cast v3, Lcom/google/android/gms/measurement/internal/zzhj;

    .line 28
    .line 29
    const-string v4, ""

    .line 30
    .line 31
    const-wide/16 v7, 0x0

    .line 32
    .line 33
    invoke-direct/range {v2 .. v9}, Lcom/google/android/gms/measurement/internal/zzba;-><init>(Lcom/google/android/gms/measurement/internal/zzhj;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLandroid/os/Bundle;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1}, LM2/n0;->X0()Lcom/google/android/gms/measurement/internal/zznl;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0, v2}, Lcom/google/android/gms/measurement/internal/zznl;->i1(Lcom/google/android/gms/measurement/internal/zzba;)Lcom/google/android/gms/internal/measurement/zzfn$zzf;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhq;->l()[B

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v1}, LB1/a;->i()Lcom/google/android/gms/measurement/internal/zzfw;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    iget-object v3, v1, LB1/a;->s:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v3, Lcom/google/android/gms/measurement/internal/zzhj;

    .line 55
    .line 56
    iget-object v3, v3, Lcom/google/android/gms/measurement/internal/zzhj;->E:Lcom/google/android/gms/measurement/internal/zzfr;

    .line 57
    .line 58
    invoke-virtual {v3, v5}, Lcom/google/android/gms/measurement/internal/zzfr;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    array-length v4, v0

    .line 63
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    iget-object v2, v2, Lcom/google/android/gms/measurement/internal/zzfw;->F:Lcom/google/android/gms/measurement/internal/zzfy;

    .line 68
    .line 69
    const-string v6, "Saving default event parameters, appId, data size"

    .line 70
    .line 71
    invoke-virtual {v2, v6, v3, v4}, Lcom/google/android/gms/measurement/internal/zzfy;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    new-instance v2, Landroid/content/ContentValues;

    .line 75
    .line 76
    invoke-direct {v2}, Landroid/content/ContentValues;-><init>()V

    .line 77
    .line 78
    .line 79
    const-string v3, "app_id"

    .line 80
    .line 81
    invoke-virtual {v2, v3, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    const-string v3, "parameters"

    .line 85
    .line 86
    invoke-virtual {v2, v3, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    .line 87
    .line 88
    .line 89
    :try_start_0
    invoke-virtual {v1}, LM2/g;->d1()Landroid/database/sqlite/SQLiteDatabase;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    const-string v3, "default_event_params"

    .line 94
    .line 95
    const/4 v4, 0x0

    .line 96
    const/4 v6, 0x5

    .line 97
    invoke-virtual {v0, v3, v4, v2, v6}, Landroid/database/sqlite/SQLiteDatabase;->insertWithOnConflict(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J

    .line 98
    .line 99
    .line 100
    move-result-wide v2

    .line 101
    const-wide/16 v6, -0x1

    .line 102
    .line 103
    cmp-long v0, v2, v6

    .line 104
    .line 105
    if-nez v0, :cond_0

    .line 106
    .line 107
    invoke-virtual {v1}, LB1/a;->i()Lcom/google/android/gms/measurement/internal/zzfw;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzfw;->x:Lcom/google/android/gms/measurement/internal/zzfy;

    .line 112
    .line 113
    const-string v2, "Failed to insert default event parameters (got -1). appId"

    .line 114
    .line 115
    invoke-static {v5}, Lcom/google/android/gms/measurement/internal/zzfw;->a1(Ljava/lang/String;)LM2/r;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    invoke-virtual {v0, v3, v2}, Lcom/google/android/gms/measurement/internal/zzfy;->a(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 120
    .line 121
    .line 122
    return-void

    .line 123
    :catch_0
    move-exception v0

    .line 124
    invoke-virtual {v1}, LB1/a;->i()Lcom/google/android/gms/measurement/internal/zzfw;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    invoke-static {v5}, Lcom/google/android/gms/measurement/internal/zzfw;->a1(Ljava/lang/String;)LM2/r;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/zzfw;->x:Lcom/google/android/gms/measurement/internal/zzfy;

    .line 133
    .line 134
    const-string v3, "Error storing default event parameters. appId"

    .line 135
    .line 136
    invoke-virtual {v1, v3, v2, v0}, Lcom/google/android/gms/measurement/internal/zzfy;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    :cond_0
    return-void
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
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

.class public final LM2/F;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic s:I

.field public final synthetic t:Ljava/lang/Object;

.field public final synthetic u:Ljava/lang/Object;

.field public final synthetic v:J

.field public final synthetic w:Ljava/lang/Object;

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JI)V
    .locals 0

    .line 1
    iput p7, p0, LM2/F;->s:I

    iput-object p2, p0, LM2/F;->t:Ljava/lang/Object;

    iput-object p3, p0, LM2/F;->u:Ljava/lang/Object;

    iput-object p4, p0, LM2/F;->w:Ljava/lang/Object;

    iput-wide p5, p0, LM2/F;->v:J

    iput-object p1, p0, LM2/F;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 15

    .line 1
    iget v0, p0, LM2/F;->s:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LM2/F;->t:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroid/os/Bundle;

    .line 9
    .line 10
    const-string v1, "screen_name"

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string v1, "screen_class"

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, LM2/F;->x:Ljava/lang/Object;

    .line 21
    .line 22
    move-object v2, v1

    .line 23
    check-cast v2, Lcom/google/android/gms/measurement/internal/zzks;

    .line 24
    .line 25
    invoke-virtual {v2}, LB1/a;->V0()Lcom/google/android/gms/measurement/internal/zznp;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    const/4 v3, 0x0

    .line 30
    const/4 v4, 0x0

    .line 31
    const-string v5, "screen_view"

    .line 32
    .line 33
    invoke-virtual {v1, v5, v0, v3, v4}, Lcom/google/android/gms/measurement/internal/zznp;->g1(Ljava/lang/String;Landroid/os/Bundle;Ljava/util/List;Z)Landroid/os/Bundle;

    .line 34
    .line 35
    .line 36
    move-result-object v8

    .line 37
    iget-object v0, p0, LM2/F;->u:Ljava/lang/Object;

    .line 38
    .line 39
    move-object v3, v0

    .line 40
    check-cast v3, Lcom/google/android/gms/measurement/internal/zzkp;

    .line 41
    .line 42
    iget-object v0, p0, LM2/F;->w:Ljava/lang/Object;

    .line 43
    .line 44
    move-object v4, v0

    .line 45
    check-cast v4, Lcom/google/android/gms/measurement/internal/zzkp;

    .line 46
    .line 47
    iget-wide v5, p0, LM2/F;->v:J

    .line 48
    .line 49
    const/4 v7, 0x1

    .line 50
    invoke-virtual/range {v2 .. v8}, Lcom/google/android/gms/measurement/internal/zzks;->h1(Lcom/google/android/gms/measurement/internal/zzkp;Lcom/google/android/gms/measurement/internal/zzkp;JZLandroid/os/Bundle;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :pswitch_0
    iget-object v12, p0, LM2/F;->w:Ljava/lang/Object;

    .line 55
    .line 56
    iget-wide v10, p0, LM2/F;->v:J

    .line 57
    .line 58
    iget-object v0, p0, LM2/F;->x:Ljava/lang/Object;

    .line 59
    .line 60
    move-object v9, v0

    .line 61
    check-cast v9, Lcom/google/android/gms/measurement/internal/zziv;

    .line 62
    .line 63
    iget-object v0, p0, LM2/F;->t:Ljava/lang/Object;

    .line 64
    .line 65
    move-object v13, v0

    .line 66
    check-cast v13, Ljava/lang/String;

    .line 67
    .line 68
    iget-object v0, p0, LM2/F;->u:Ljava/lang/Object;

    .line 69
    .line 70
    move-object v14, v0

    .line 71
    check-cast v14, Ljava/lang/String;

    .line 72
    .line 73
    invoke-virtual/range {v9 .. v14}, Lcom/google/android/gms/measurement/internal/zziv;->e1(JLjava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :pswitch_1
    iget-object v0, p0, LM2/F;->u:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v0, Ljava/lang/String;

    .line 80
    .line 81
    iget-object v1, p0, LM2/F;->x:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v1, Lcom/google/android/gms/measurement/internal/zzhn;

    .line 84
    .line 85
    iget-object v2, p0, LM2/F;->t:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v2, Ljava/lang/String;

    .line 88
    .line 89
    if-nez v2, :cond_1

    .line 90
    .line 91
    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/zzhn;->b:Lcom/google/android/gms/measurement/internal/zznc;

    .line 92
    .line 93
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zznc;->l()Lcom/google/android/gms/measurement/internal/zzhc;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzhc;->W0()V

    .line 98
    .line 99
    .line 100
    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/zznc;->X:Ljava/lang/String;

    .line 101
    .line 102
    if-eqz v2, :cond_0

    .line 103
    .line 104
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    if-nez v2, :cond_0

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_0
    iput-object v0, v1, Lcom/google/android/gms/measurement/internal/zznc;->X:Ljava/lang/String;

    .line 112
    .line 113
    const/4 v0, 0x0

    .line 114
    iput-object v0, v1, Lcom/google/android/gms/measurement/internal/zznc;->W:Lcom/google/android/gms/measurement/internal/zzkp;

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_1
    new-instance v3, Lcom/google/android/gms/measurement/internal/zzkp;

    .line 118
    .line 119
    iget-object v4, p0, LM2/F;->w:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v4, Ljava/lang/String;

    .line 122
    .line 123
    iget-wide v5, p0, LM2/F;->v:J

    .line 124
    .line 125
    invoke-direct {v3, v4, v2, v5, v6}, Lcom/google/android/gms/measurement/internal/zzkp;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    .line 126
    .line 127
    .line 128
    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/zzhn;->b:Lcom/google/android/gms/measurement/internal/zznc;

    .line 129
    .line 130
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zznc;->l()Lcom/google/android/gms/measurement/internal/zzhc;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzhc;->W0()V

    .line 135
    .line 136
    .line 137
    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/zznc;->X:Ljava/lang/String;

    .line 138
    .line 139
    if-eqz v2, :cond_2

    .line 140
    .line 141
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    :cond_2
    iput-object v0, v1, Lcom/google/android/gms/measurement/internal/zznc;->X:Ljava/lang/String;

    .line 145
    .line 146
    iput-object v3, v1, Lcom/google/android/gms/measurement/internal/zznc;->W:Lcom/google/android/gms/measurement/internal/zzkp;

    .line 147
    .line 148
    :goto_0
    return-void

    .line 149
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

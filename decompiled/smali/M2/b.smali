.class public final LM2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic s:I

.field public final synthetic t:Ljava/lang/Object;

.field public final synthetic u:J

.field public final synthetic v:LM2/o;


# direct methods
.method public synthetic constructor <init>(LM2/o;Ljava/lang/Object;JI)V
    .locals 0

    .line 1
    iput p5, p0, LM2/b;->s:I

    iput-object p2, p0, LM2/b;->t:Ljava/lang/Object;

    iput-wide p3, p0, LM2/b;->u:J

    iput-object p1, p0, LM2/b;->v:LM2/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .line 1
    iget v0, p0, LM2/b;->s:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LM2/b;->v:LM2/o;

    .line 7
    .line 8
    check-cast v0, Lcom/google/android/gms/measurement/internal/zzks;

    .line 9
    .line 10
    iget-object v1, p0, LM2/b;->t:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lcom/google/android/gms/measurement/internal/zzkp;

    .line 13
    .line 14
    iget-wide v2, p0, LM2/b;->u:J

    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    invoke-virtual {v0, v1, v4, v2, v3}, Lcom/google/android/gms/measurement/internal/zzks;->i1(Lcom/google/android/gms/measurement/internal/zzkp;ZJ)V

    .line 18
    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    iput-object v1, v0, Lcom/google/android/gms/measurement/internal/zzks;->w:Lcom/google/android/gms/measurement/internal/zzkp;

    .line 22
    .line 23
    iget-object v0, v0, LB1/a;->s:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Lcom/google/android/gms/measurement/internal/zzhj;

    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzhj;->r()Lcom/google/android/gms/measurement/internal/zzkx;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0}, LM2/o;->W0()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, LM2/n;->a1()V

    .line 35
    .line 36
    .line 37
    new-instance v2, LC3/c;

    .line 38
    .line 39
    const/16 v3, 0x12

    .line 40
    .line 41
    const/4 v4, 0x0

    .line 42
    invoke-direct {v2, v0, v1, v3, v4}, LC3/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v2}, Lcom/google/android/gms/measurement/internal/zzkx;->f1(Ljava/lang/Runnable;)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :pswitch_0
    iget-object v0, p0, LM2/b;->v:LM2/o;

    .line 50
    .line 51
    check-cast v0, Lcom/google/android/gms/measurement/internal/zzb;

    .line 52
    .line 53
    invoke-virtual {v0}, LM2/o;->W0()V

    .line 54
    .line 55
    .line 56
    iget-object v1, p0, LM2/b;->t:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v1, Ljava/lang/String;

    .line 59
    .line 60
    invoke-static {v1}, Lcom/google/android/gms/common/internal/Preconditions;->e(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    iget-object v2, v0, Lcom/google/android/gms/measurement/internal/zzb;->u:Lw/e;

    .line 64
    .line 65
    invoke-virtual {v2, v1}, Lw/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    check-cast v3, Ljava/lang/Integer;

    .line 70
    .line 71
    if-eqz v3, :cond_3

    .line 72
    .line 73
    invoke-virtual {v0}, LM2/o;->Y0()Lcom/google/android/gms/measurement/internal/zzks;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    const/4 v5, 0x0

    .line 78
    invoke-virtual {v4, v5}, Lcom/google/android/gms/measurement/internal/zzks;->d1(Z)Lcom/google/android/gms/measurement/internal/zzkp;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    add-int/lit8 v3, v3, -0x1

    .line 87
    .line 88
    if-nez v3, :cond_2

    .line 89
    .line 90
    invoke-virtual {v2, v1}, Lw/i;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    iget-object v3, v0, Lcom/google/android/gms/measurement/internal/zzb;->t:Lw/e;

    .line 94
    .line 95
    invoke-virtual {v3, v1}, Lw/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    check-cast v5, Ljava/lang/Long;

    .line 100
    .line 101
    iget-wide v6, p0, LM2/b;->u:J

    .line 102
    .line 103
    if-nez v5, :cond_0

    .line 104
    .line 105
    invoke-virtual {v0}, LB1/a;->i()Lcom/google/android/gms/measurement/internal/zzfw;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    const-string v3, "First ad unit exposure time was never set"

    .line 110
    .line 111
    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/zzfw;->x:Lcom/google/android/gms/measurement/internal/zzfy;

    .line 112
    .line 113
    invoke-virtual {v1, v3}, Lcom/google/android/gms/measurement/internal/zzfy;->b(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_0
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 118
    .line 119
    .line 120
    move-result-wide v8

    .line 121
    sub-long v8, v6, v8

    .line 122
    .line 123
    invoke-virtual {v3, v1}, Lw/i;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0, v1, v8, v9, v4}, Lcom/google/android/gms/measurement/internal/zzb;->d1(Ljava/lang/String;JLcom/google/android/gms/measurement/internal/zzkp;)V

    .line 127
    .line 128
    .line 129
    :goto_0
    invoke-virtual {v2}, Lw/i;->isEmpty()Z

    .line 130
    .line 131
    .line 132
    move-result v1

    .line 133
    if-eqz v1, :cond_4

    .line 134
    .line 135
    iget-wide v1, v0, Lcom/google/android/gms/measurement/internal/zzb;->v:J

    .line 136
    .line 137
    const-wide/16 v8, 0x0

    .line 138
    .line 139
    cmp-long v3, v1, v8

    .line 140
    .line 141
    if-nez v3, :cond_1

    .line 142
    .line 143
    invoke-virtual {v0}, LB1/a;->i()Lcom/google/android/gms/measurement/internal/zzfw;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    const-string v1, "First ad exposure time was never set"

    .line 148
    .line 149
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzfw;->x:Lcom/google/android/gms/measurement/internal/zzfy;

    .line 150
    .line 151
    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/zzfy;->b(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    goto :goto_1

    .line 155
    :cond_1
    sub-long/2addr v6, v1

    .line 156
    invoke-virtual {v0, v6, v7, v4}, Lcom/google/android/gms/measurement/internal/zzb;->b1(JLcom/google/android/gms/measurement/internal/zzkp;)V

    .line 157
    .line 158
    .line 159
    iput-wide v8, v0, Lcom/google/android/gms/measurement/internal/zzb;->v:J

    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_2
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    invoke-virtual {v2, v1, v0}, Lw/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    goto :goto_1

    .line 170
    :cond_3
    invoke-virtual {v0}, LB1/a;->i()Lcom/google/android/gms/measurement/internal/zzfw;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    const-string v2, "Call to endAdUnitExposure for unknown ad unit id"

    .line 175
    .line 176
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzfw;->x:Lcom/google/android/gms/measurement/internal/zzfy;

    .line 177
    .line 178
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/measurement/internal/zzfy;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    :cond_4
    :goto_1
    return-void

    .line 182
    :pswitch_1
    iget-object v0, p0, LM2/b;->v:LM2/o;

    .line 183
    .line 184
    check-cast v0, Lcom/google/android/gms/measurement/internal/zzb;

    .line 185
    .line 186
    invoke-virtual {v0}, LM2/o;->W0()V

    .line 187
    .line 188
    .line 189
    iget-object v1, p0, LM2/b;->t:Ljava/lang/Object;

    .line 190
    .line 191
    check-cast v1, Ljava/lang/String;

    .line 192
    .line 193
    invoke-static {v1}, Lcom/google/android/gms/common/internal/Preconditions;->e(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    iget-object v2, v0, Lcom/google/android/gms/measurement/internal/zzb;->u:Lw/e;

    .line 197
    .line 198
    invoke-virtual {v2}, Lw/i;->isEmpty()Z

    .line 199
    .line 200
    .line 201
    move-result v3

    .line 202
    iget-wide v4, p0, LM2/b;->u:J

    .line 203
    .line 204
    if-eqz v3, :cond_5

    .line 205
    .line 206
    iput-wide v4, v0, Lcom/google/android/gms/measurement/internal/zzb;->v:J

    .line 207
    .line 208
    :cond_5
    invoke-virtual {v2, v1}, Lw/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v3

    .line 212
    check-cast v3, Ljava/lang/Integer;

    .line 213
    .line 214
    const/4 v6, 0x1

    .line 215
    if-eqz v3, :cond_6

    .line 216
    .line 217
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 218
    .line 219
    .line 220
    move-result v0

    .line 221
    add-int/2addr v0, v6

    .line 222
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    invoke-virtual {v2, v1, v0}, Lw/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    goto :goto_2

    .line 230
    :cond_6
    iget v3, v2, Lw/i;->u:I

    .line 231
    .line 232
    const/16 v7, 0x64

    .line 233
    .line 234
    if-lt v3, v7, :cond_7

    .line 235
    .line 236
    invoke-virtual {v0}, LB1/a;->i()Lcom/google/android/gms/measurement/internal/zzfw;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    const-string v1, "Too many ads visible"

    .line 241
    .line 242
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzfw;->A:Lcom/google/android/gms/measurement/internal/zzfy;

    .line 243
    .line 244
    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/zzfy;->b(Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    goto :goto_2

    .line 248
    :cond_7
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 249
    .line 250
    .line 251
    move-result-object v3

    .line 252
    invoke-virtual {v2, v1, v3}, Lw/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzb;->t:Lw/e;

    .line 256
    .line 257
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 258
    .line 259
    .line 260
    move-result-object v2

    .line 261
    invoke-virtual {v0, v1, v2}, Lw/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    :goto_2
    return-void

    .line 265
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

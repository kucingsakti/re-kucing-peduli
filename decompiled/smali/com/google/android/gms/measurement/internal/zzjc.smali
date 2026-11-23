.class public final synthetic Lcom/google/android/gms/measurement/internal/zzjc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public synthetic s:Lcom/google/android/gms/measurement/internal/zziv;

.field public synthetic t:Landroid/os/Bundle;


# virtual methods
.method public final run()V
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzjc;->s:Lcom/google/android/gms/measurement/internal/zziv;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzjc;->t:Landroid/os/Bundle;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, LB1/a;->U0()LM2/w;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v1, Landroid/os/Bundle;

    .line 12
    .line 13
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 14
    .line 15
    .line 16
    iget-object v0, v0, LM2/w;->R:Lcom/google/android/gms/measurement/internal/zzgj;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/zzgj;->b(Landroid/os/Bundle;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    invoke-virtual {v0}, LB1/a;->U0()LM2/w;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    iget-object v2, v2, LM2/w;->R:Lcom/google/android/gms/measurement/internal/zzgj;

    .line 27
    .line 28
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzgj;->a()Landroid/os/Bundle;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    :cond_1
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    const/4 v5, 0x0

    .line 45
    iget-object v6, v0, Lcom/google/android/gms/measurement/internal/zziv;->M:Le1/j;

    .line 46
    .line 47
    iget-object v7, v0, LB1/a;->s:Ljava/lang/Object;

    .line 48
    .line 49
    move-object v12, v7

    .line 50
    check-cast v12, Lcom/google/android/gms/measurement/internal/zzhj;

    .line 51
    .line 52
    if-eqz v4, :cond_6

    .line 53
    .line 54
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    check-cast v4, Ljava/lang/String;

    .line 59
    .line 60
    invoke-virtual {v1, v4}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v13

    .line 64
    if-eqz v13, :cond_3

    .line 65
    .line 66
    instance-of v7, v13, Ljava/lang/String;

    .line 67
    .line 68
    if-nez v7, :cond_3

    .line 69
    .line 70
    instance-of v7, v13, Ljava/lang/Long;

    .line 71
    .line 72
    if-nez v7, :cond_3

    .line 73
    .line 74
    instance-of v7, v13, Ljava/lang/Double;

    .line 75
    .line 76
    if-nez v7, :cond_3

    .line 77
    .line 78
    invoke-virtual {v0}, LB1/a;->V0()Lcom/google/android/gms/measurement/internal/zznp;

    .line 79
    .line 80
    .line 81
    invoke-static {v13}, Lcom/google/android/gms/measurement/internal/zznp;->E1(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    if-eqz v5, :cond_2

    .line 86
    .line 87
    invoke-virtual {v0}, LB1/a;->V0()Lcom/google/android/gms/measurement/internal/zznp;

    .line 88
    .line 89
    .line 90
    const/16 v8, 0x1b

    .line 91
    .line 92
    const/4 v9, 0x0

    .line 93
    const/4 v7, 0x0

    .line 94
    const/4 v10, 0x0

    .line 95
    const/4 v11, 0x0

    .line 96
    invoke-static/range {v6 .. v11}, Lcom/google/android/gms/measurement/internal/zznp;->m1(LM2/t0;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    .line 97
    .line 98
    .line 99
    :cond_2
    invoke-virtual {v0}, LB1/a;->i()Lcom/google/android/gms/measurement/internal/zzfw;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    const-string v6, "Invalid default event parameter type. Name, value"

    .line 104
    .line 105
    iget-object v5, v5, Lcom/google/android/gms/measurement/internal/zzfw;->C:Lcom/google/android/gms/measurement/internal/zzfy;

    .line 106
    .line 107
    invoke-virtual {v5, v6, v4, v13}, Lcom/google/android/gms/measurement/internal/zzfy;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_3
    invoke-static {v4}, Lcom/google/android/gms/measurement/internal/zznp;->c2(Ljava/lang/String;)Z

    .line 112
    .line 113
    .line 114
    move-result v6

    .line 115
    if-eqz v6, :cond_4

    .line 116
    .line 117
    invoke-virtual {v0}, LB1/a;->i()Lcom/google/android/gms/measurement/internal/zzfw;

    .line 118
    .line 119
    .line 120
    move-result-object v5

    .line 121
    const-string v6, "Invalid default event parameter name. Name"

    .line 122
    .line 123
    iget-object v5, v5, Lcom/google/android/gms/measurement/internal/zzfw;->C:Lcom/google/android/gms/measurement/internal/zzfy;

    .line 124
    .line 125
    invoke-virtual {v5, v4, v6}, Lcom/google/android/gms/measurement/internal/zzfy;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_4
    if-nez v13, :cond_5

    .line 130
    .line 131
    invoke-virtual {v2, v4}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_5
    invoke-virtual {v0}, LB1/a;->V0()Lcom/google/android/gms/measurement/internal/zznp;

    .line 136
    .line 137
    .line 138
    move-result-object v6

    .line 139
    iget-object v7, v12, Lcom/google/android/gms/measurement/internal/zzhj;->y:Lcom/google/android/gms/measurement/internal/zzag;

    .line 140
    .line 141
    const/4 v8, 0x0

    .line 142
    invoke-virtual {v7, v8, v5}, Lcom/google/android/gms/measurement/internal/zzag;->Y0(Ljava/lang/String;Z)I

    .line 143
    .line 144
    .line 145
    move-result v5

    .line 146
    const-string v7, "param"

    .line 147
    .line 148
    invoke-virtual {v6, v7, v4, v5, v13}, Lcom/google/android/gms/measurement/internal/zznp;->I1(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v5

    .line 152
    if-eqz v5, :cond_1

    .line 153
    .line 154
    invoke-virtual {v0}, LB1/a;->V0()Lcom/google/android/gms/measurement/internal/zznp;

    .line 155
    .line 156
    .line 157
    move-result-object v5

    .line 158
    invoke-virtual {v5, v2, v4, v13}, Lcom/google/android/gms/measurement/internal/zznp;->q1(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    goto :goto_0

    .line 162
    :cond_6
    invoke-virtual {v0}, LB1/a;->V0()Lcom/google/android/gms/measurement/internal/zznp;

    .line 163
    .line 164
    .line 165
    iget-object v1, v12, Lcom/google/android/gms/measurement/internal/zzhj;->y:Lcom/google/android/gms/measurement/internal/zzag;

    .line 166
    .line 167
    invoke-virtual {v1}, LB1/a;->V0()Lcom/google/android/gms/measurement/internal/zznp;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    const v3, 0xc02a560

    .line 172
    .line 173
    .line 174
    invoke-virtual {v1, v3}, Lcom/google/android/gms/measurement/internal/zznp;->N1(I)Z

    .line 175
    .line 176
    .line 177
    move-result v1

    .line 178
    if-eqz v1, :cond_7

    .line 179
    .line 180
    const/16 v1, 0x64

    .line 181
    .line 182
    goto :goto_1

    .line 183
    :cond_7
    const/16 v1, 0x19

    .line 184
    .line 185
    :goto_1
    invoke-virtual {v2}, Landroid/os/BaseBundle;->size()I

    .line 186
    .line 187
    .line 188
    move-result v3

    .line 189
    if-gt v3, v1, :cond_8

    .line 190
    .line 191
    goto :goto_3

    .line 192
    :cond_8
    new-instance v3, Ljava/util/TreeSet;

    .line 193
    .line 194
    invoke-virtual {v2}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 195
    .line 196
    .line 197
    move-result-object v4

    .line 198
    invoke-direct {v3, v4}, Ljava/util/TreeSet;-><init>(Ljava/util/Collection;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v3}, Ljava/util/TreeSet;->iterator()Ljava/util/Iterator;

    .line 202
    .line 203
    .line 204
    move-result-object v3

    .line 205
    move v4, v5

    .line 206
    :cond_9
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 207
    .line 208
    .line 209
    move-result v7

    .line 210
    if-eqz v7, :cond_a

    .line 211
    .line 212
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v7

    .line 216
    check-cast v7, Ljava/lang/String;

    .line 217
    .line 218
    add-int/lit8 v4, v4, 0x1

    .line 219
    .line 220
    if-le v4, v1, :cond_9

    .line 221
    .line 222
    invoke-virtual {v2, v7}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    goto :goto_2

    .line 226
    :cond_a
    invoke-virtual {v0}, LB1/a;->V0()Lcom/google/android/gms/measurement/internal/zznp;

    .line 227
    .line 228
    .line 229
    const/16 v8, 0x1a

    .line 230
    .line 231
    const/4 v9, 0x0

    .line 232
    const/4 v7, 0x0

    .line 233
    const/4 v10, 0x0

    .line 234
    const/4 v11, 0x0

    .line 235
    invoke-static/range {v6 .. v11}, Lcom/google/android/gms/measurement/internal/zznp;->m1(LM2/t0;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v0}, LB1/a;->i()Lcom/google/android/gms/measurement/internal/zzfw;

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    const-string v3, "Too many default event parameters set. Discarding beyond event parameter limit"

    .line 243
    .line 244
    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/zzfw;->C:Lcom/google/android/gms/measurement/internal/zzfy;

    .line 245
    .line 246
    invoke-virtual {v1, v3}, Lcom/google/android/gms/measurement/internal/zzfy;->b(Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    :goto_3
    invoke-virtual {v0}, LB1/a;->U0()LM2/w;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    iget-object v0, v0, LM2/w;->R:Lcom/google/android/gms/measurement/internal/zzgj;

    .line 254
    .line 255
    invoke-virtual {v0, v2}, Lcom/google/android/gms/measurement/internal/zzgj;->b(Landroid/os/Bundle;)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v12}, Lcom/google/android/gms/measurement/internal/zzhj;->r()Lcom/google/android/gms/measurement/internal/zzkx;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    invoke-virtual {v0}, LM2/o;->W0()V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v0}, LM2/n;->a1()V

    .line 266
    .line 267
    .line 268
    invoke-virtual {v0, v5}, Lcom/google/android/gms/measurement/internal/zzkx;->p1(Z)Lcom/google/android/gms/measurement/internal/zzo;

    .line 269
    .line 270
    .line 271
    move-result-object v1

    .line 272
    new-instance v3, LB4/I;

    .line 273
    .line 274
    const/16 v4, 0x8

    .line 275
    .line 276
    invoke-direct {v3, v0, v1, v2, v4}, LB4/I;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v0, v3}, Lcom/google/android/gms/measurement/internal/zzkx;->f1(Ljava/lang/Runnable;)V

    .line 280
    .line 281
    .line 282
    return-void
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

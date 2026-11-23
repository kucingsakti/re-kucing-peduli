.class public final synthetic LN4/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq0/I;


# instance fields
.field public final synthetic a:Lv8/q;

.field public final synthetic b:Lq0/M;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Lcom/google/android/material/bottomnavigation/BottomNavigationView;

.field public final synthetic e:Lv8/r;

.field public final synthetic f:Landroidx/lifecycle/A;


# direct methods
.method public synthetic constructor <init>(Lv8/q;Lq0/M;Ljava/lang/String;Lcom/google/android/material/bottomnavigation/BottomNavigationView;Lv8/r;Landroidx/lifecycle/A;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LN4/d;->a:Lv8/q;

    iput-object p2, p0, LN4/d;->b:Lq0/M;

    iput-object p3, p0, LN4/d;->c:Ljava/lang/String;

    iput-object p4, p0, LN4/d;->d:Lcom/google/android/material/bottomnavigation/BottomNavigationView;

    iput-object p5, p0, LN4/d;->e:Lv8/r;

    iput-object p6, p0, LN4/d;->f:Landroidx/lifecycle/A;

    return-void
.end method


# virtual methods
.method public final synthetic a(Landroidx/fragment/app/b;Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public final b()V
    .locals 10

    .line 1
    const/4 v0, 0x1

    .line 2
    iget-object v1, p0, LN4/d;->a:Lv8/q;

    .line 3
    .line 4
    iget-object v2, p0, LN4/d;->b:Lq0/M;

    .line 5
    .line 6
    iget-object v3, p0, LN4/d;->d:Lcom/google/android/material/bottomnavigation/BottomNavigationView;

    .line 7
    .line 8
    iget-object v4, p0, LN4/d;->e:Lv8/r;

    .line 9
    .line 10
    iget-object v5, p0, LN4/d;->f:Landroidx/lifecycle/A;

    .line 11
    .line 12
    iget-boolean v1, v1, Lv8/q;->s:Z

    .line 13
    .line 14
    if-nez v1, :cond_5

    .line 15
    .line 16
    iget-object v1, p0, LN4/d;->c:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v1}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iget-object v6, v2, Landroidx/fragment/app/e;->d:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    iget-object v7, v2, Landroidx/fragment/app/e;->h:Lq0/a;

    .line 28
    .line 29
    const/4 v8, 0x0

    .line 30
    if-eqz v7, :cond_0

    .line 31
    .line 32
    move v7, v0

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move v7, v8

    .line 35
    :goto_0
    add-int/2addr v6, v7

    .line 36
    :goto_1
    if-ge v8, v6, :cond_4

    .line 37
    .line 38
    iget-object v7, v2, Landroidx/fragment/app/e;->d:Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 41
    .line 42
    .line 43
    move-result v7

    .line 44
    if-ne v8, v7, :cond_2

    .line 45
    .line 46
    iget-object v7, v2, Landroidx/fragment/app/e;->h:Lq0/a;

    .line 47
    .line 48
    if-eqz v7, :cond_1

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_1
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 52
    .line 53
    invoke-direct {v0}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    .line 54
    .line 55
    .line 56
    throw v0

    .line 57
    :cond_2
    iget-object v7, v2, Landroidx/fragment/app/e;->d:Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v7

    .line 63
    check-cast v7, Lq0/a;

    .line 64
    .line 65
    :goto_2
    iget-object v7, v7, Lq0/a;->i:Ljava/lang/String;

    .line 66
    .line 67
    invoke-static {v7, v1}, Lv8/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v7

    .line 71
    if-eqz v7, :cond_3

    .line 72
    .line 73
    goto :goto_3

    .line 74
    :cond_3
    add-int/2addr v8, v0

    .line 75
    goto :goto_1

    .line 76
    :cond_4
    iget v0, v4, Lv8/r;->s:I

    .line 77
    .line 78
    invoke-virtual {v3, v0}, Lcom/google/android/material/navigation/d;->setSelectedItemId(I)V

    .line 79
    .line 80
    .line 81
    :cond_5
    :goto_3
    iget-object v0, v5, Landroidx/lifecycle/A;->e:Ljava/lang/Object;

    .line 82
    .line 83
    sget-object v1, Landroidx/lifecycle/A;->k:Ljava/lang/Object;

    .line 84
    .line 85
    const/4 v2, 0x0

    .line 86
    if-eq v0, v1, :cond_6

    .line 87
    .line 88
    goto :goto_4

    .line 89
    :cond_6
    move-object v0, v2

    .line 90
    :goto_4
    check-cast v0, Ly0/B;

    .line 91
    .line 92
    if-eqz v0, :cond_10

    .line 93
    .line 94
    invoke-virtual {v0}, Ly0/B;->f()Ly0/x;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    if-nez v1, :cond_10

    .line 99
    .line 100
    invoke-virtual {v0}, Ly0/B;->h()Ly0/z;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    iget v1, v1, Ly0/x;->z:I

    .line 105
    .line 106
    iget-object v3, v0, Ly0/B;->g:Li8/h;

    .line 107
    .line 108
    invoke-virtual {v3}, Li8/h;->isEmpty()Z

    .line 109
    .line 110
    .line 111
    move-result v4

    .line 112
    if-eqz v4, :cond_7

    .line 113
    .line 114
    iget-object v3, v0, Ly0/B;->c:Ly0/z;

    .line 115
    .line 116
    goto :goto_5

    .line 117
    :cond_7
    invoke-virtual {v3}, Li8/h;->r()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    check-cast v3, Ly0/j;

    .line 122
    .line 123
    iget-object v3, v3, Ly0/j;->t:Ly0/x;

    .line 124
    .line 125
    :goto_5
    if-eqz v3, :cond_f

    .line 126
    .line 127
    invoke-virtual {v3, v1}, Ly0/x;->g(I)Ly0/e;

    .line 128
    .line 129
    .line 130
    move-result-object v4

    .line 131
    if-eqz v4, :cond_9

    .line 132
    .line 133
    iget-object v5, v4, Ly0/e;->b:Ly0/D;

    .line 134
    .line 135
    iget-object v6, v4, Ly0/e;->c:Landroid/os/Bundle;

    .line 136
    .line 137
    iget v7, v4, Ly0/e;->a:I

    .line 138
    .line 139
    if-eqz v6, :cond_8

    .line 140
    .line 141
    new-instance v8, Landroid/os/Bundle;

    .line 142
    .line 143
    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v8, v6}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 147
    .line 148
    .line 149
    goto :goto_6

    .line 150
    :cond_8
    move-object v8, v2

    .line 151
    goto :goto_6

    .line 152
    :cond_9
    move v7, v1

    .line 153
    move-object v5, v2

    .line 154
    move-object v8, v5

    .line 155
    :goto_6
    if-nez v7, :cond_b

    .line 156
    .line 157
    if-eqz v5, :cond_b

    .line 158
    .line 159
    iget v6, v5, Ly0/D;->c:I

    .line 160
    .line 161
    const/4 v9, -0x1

    .line 162
    if-ne v6, v9, :cond_a

    .line 163
    .line 164
    goto :goto_7

    .line 165
    :cond_a
    iget-boolean v1, v5, Ly0/D;->d:Z

    .line 166
    .line 167
    if-eq v6, v9, :cond_10

    .line 168
    .line 169
    invoke-virtual {v0, v6, v1}, Ly0/B;->n(IZ)Z

    .line 170
    .line 171
    .line 172
    return-void

    .line 173
    :cond_b
    :goto_7
    if-eqz v7, :cond_e

    .line 174
    .line 175
    invoke-virtual {v0, v7, v2}, Ly0/B;->c(ILy0/x;)Ly0/x;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    if-nez v2, :cond_d

    .line 180
    .line 181
    sget v2, Ly0/x;->B:I

    .line 182
    .line 183
    iget-object v0, v0, Ly0/B;->a:Landroid/content/Context;

    .line 184
    .line 185
    invoke-static {v0, v7}, Lga/d;->m(Landroid/content/Context;I)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v2

    .line 189
    const-string v5, " cannot be found from the current destination "

    .line 190
    .line 191
    if-nez v4, :cond_c

    .line 192
    .line 193
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 194
    .line 195
    new-instance v1, Ljava/lang/StringBuilder;

    .line 196
    .line 197
    const-string v4, "Navigation action/destination "

    .line 198
    .line 199
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v1

    .line 215
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    throw v0

    .line 219
    :cond_c
    const-string v4, "Navigation destination "

    .line 220
    .line 221
    const-string v6, " referenced from action "

    .line 222
    .line 223
    invoke-static {v4, v2, v6}, Landroidx/datastore/preferences/protobuf/g;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    move-result-object v2

    .line 227
    invoke-static {v0, v1}, Lga/d;->m(Landroid/content/Context;I)Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 232
    .line 233
    .line 234
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 235
    .line 236
    .line 237
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 245
    .line 246
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    throw v1

    .line 254
    :cond_d
    invoke-virtual {v0, v2, v8, v5}, Ly0/B;->m(Ly0/x;Landroid/os/Bundle;Ly0/D;)V

    .line 255
    .line 256
    .line 257
    return-void

    .line 258
    :cond_e
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 259
    .line 260
    const-string v1, "Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo"

    .line 261
    .line 262
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    throw v0

    .line 266
    :cond_f
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 267
    .line 268
    new-instance v2, Ljava/lang/StringBuilder;

    .line 269
    .line 270
    const-string v3, "No current destination found. Ensure a navigation graph has been set for NavController "

    .line 271
    .line 272
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 276
    .line 277
    .line 278
    const/16 v0, 0x2e

    .line 279
    .line 280
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 281
    .line 282
    .line 283
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    throw v1

    .line 291
    :cond_10
    return-void
    .line 292
    .line 293
.end method

.method public final synthetic c(Landroidx/fragment/app/b;Z)V
    .locals 0

    .line 1
    return-void
.end method

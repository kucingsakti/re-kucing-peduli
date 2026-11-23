.class public final synthetic Ls3/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic s:I

.field public final synthetic t:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Ls3/d;->s:I

    iput-object p1, p0, Ls3/d;->t:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, Ls3/d;->s:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ls3/d;->t:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lcom/google/android/material/textfield/TextInputLayout;

    .line 9
    .line 10
    iget-object v0, v0, Lcom/google/android/material/textfield/TextInputLayout;->v:Landroid/widget/EditText;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    iget-object v0, p0, Ls3/d;->t:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lw3/i;

    .line 19
    .line 20
    iget-object v1, v0, Lw3/i;->h:Landroid/widget/AutoCompleteTextView;

    .line 21
    .line 22
    invoke-virtual {v1}, Landroid/widget/AutoCompleteTextView;->isPopupShowing()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    invoke-virtual {v0, v1}, Lw3/i;->t(Z)V

    .line 27
    .line 28
    .line 29
    iput-boolean v1, v0, Lw3/i;->m:Z

    .line 30
    .line 31
    return-void

    .line 32
    :pswitch_1
    const/4 v0, 0x1

    .line 33
    iget-object v1, p0, Ls3/d;->t:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v1, Lw3/c;

    .line 36
    .line 37
    invoke-virtual {v1, v0}, Lw3/c;->t(Z)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :pswitch_2
    iget-object v0, p0, Ls3/d;->t:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, Lt1/u0;

    .line 44
    .line 45
    monitor-enter v0

    .line 46
    :try_start_0
    new-instance v1, LE4/a;

    .line 47
    .line 48
    const/16 v2, 0x1c

    .line 49
    .line 50
    invoke-direct {v1, v0, v2}, LE4/a;-><init>(Ljava/lang/Object;I)V

    .line 51
    .line 52
    .line 53
    invoke-static {v1}, Lv1/d;->b(Lv1/c;)Lt1/F;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {v0, v1}, Lt1/u0;->n(Lt1/F;)V

    .line 58
    .line 59
    .line 60
    monitor-exit v0

    .line 61
    return-void

    .line 62
    :catchall_0
    move-exception v1

    .line 63
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    throw v1

    .line 65
    :pswitch_3
    iget-object v0, p0, Ls3/d;->t:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v0, Lt1/r0;

    .line 68
    .line 69
    iget-object v1, v0, Lt1/r0;->a:Ljava/security/SecureRandom;

    .line 70
    .line 71
    const/16 v2, 0xdac

    .line 72
    .line 73
    invoke-virtual {v1, v2}, Ljava/util/Random;->nextInt(I)I

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    add-int/lit16 v1, v1, 0x3e8

    .line 78
    .line 79
    int-to-long v1, v1

    .line 80
    :try_start_1
    invoke-static {v1, v2}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 89
    .line 90
    .line 91
    :goto_0
    invoke-virtual {v0}, Lt1/r0;->b()V

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :cond_0
    :goto_1
    :pswitch_4
    iget-object v0, p0, Ls3/d;->t:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v0, Lt1/b;

    .line 98
    .line 99
    iget-object v1, v0, Lt1/b;->c:Ljava/util/LinkedList;

    .line 100
    .line 101
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    if-nez v2, :cond_2

    .line 106
    .line 107
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 108
    .line 109
    .line 110
    move-result v2

    .line 111
    if-eqz v2, :cond_1

    .line 112
    .line 113
    const/4 v1, 0x0

    .line 114
    goto :goto_2

    .line 115
    :cond_1
    const/4 v2, 0x0

    .line 116
    invoke-virtual {v1, v2}, Ljava/util/LinkedList;->remove(I)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    check-cast v1, Lt1/h0;

    .line 121
    .line 122
    :goto_2
    if-eqz v1, :cond_0

    .line 123
    .line 124
    invoke-virtual {v0, v1}, Lt1/b;->a(Lt1/h0;)V

    .line 125
    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_2
    return-void

    .line 129
    :pswitch_5
    iget-object v0, p0, Ls3/d;->t:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v0, LX2/d;

    .line 132
    .line 133
    const/4 v1, 0x0

    .line 134
    iput-boolean v1, v0, LX2/d;->c:Z

    .line 135
    .line 136
    iget-object v1, v0, LX2/d;->e:LG/b;

    .line 137
    .line 138
    check-cast v1, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 139
    .line 140
    iget-object v2, v1, Lcom/google/android/material/sidesheet/SideSheetBehavior;->A:Ld0/f;

    .line 141
    .line 142
    if-eqz v2, :cond_3

    .line 143
    .line 144
    invoke-virtual {v2}, Ld0/f;->g()Z

    .line 145
    .line 146
    .line 147
    move-result v2

    .line 148
    if-eqz v2, :cond_3

    .line 149
    .line 150
    iget v1, v0, LX2/d;->b:I

    .line 151
    .line 152
    invoke-virtual {v0, v1}, LX2/d;->a(I)V

    .line 153
    .line 154
    .line 155
    goto :goto_3

    .line 156
    :cond_3
    iget v2, v1, Lcom/google/android/material/sidesheet/SideSheetBehavior;->z:I

    .line 157
    .line 158
    const/4 v3, 0x2

    .line 159
    if-ne v2, v3, :cond_4

    .line 160
    .line 161
    iget v0, v0, LX2/d;->b:I

    .line 162
    .line 163
    invoke-virtual {v1, v0}, Lcom/google/android/material/sidesheet/SideSheetBehavior;->x(I)V

    .line 164
    .line 165
    .line 166
    :cond_4
    :goto_3
    return-void

    .line 167
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

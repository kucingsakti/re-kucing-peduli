.class public final LF8/W;
.super Lv8/k;
.source "SourceFile"

# interfaces
.implements Lu8/a;


# instance fields
.field public final synthetic s:I

.field public final synthetic t:LF8/X;


# direct methods
.method public synthetic constructor <init>(LF8/X;I)V
    .locals 0

    .line 1
    iput p2, p0, LF8/W;->s:I

    iput-object p1, p0, LF8/W;->t:LF8/X;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lv8/k;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 11

    .line 1
    const/4 v0, 0x2

    .line 2
    iget-object v1, p0, LF8/W;->t:LF8/X;

    .line 3
    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    iget v4, p0, LF8/W;->s:I

    .line 7
    .line 8
    packed-switch v4, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1}, LF8/k0;->k()Ljava/lang/reflect/Member;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    const-string v5, "delegate field/method "

    .line 16
    .line 17
    const-string v6, "delegate method "

    .line 18
    .line 19
    :try_start_0
    sget-object v7, LF8/k0;->z:Ljava/lang/Object;

    .line 20
    .line 21
    invoke-virtual {v1}, LF8/k0;->j()Z

    .line 22
    .line 23
    .line 24
    move-result v8

    .line 25
    const/4 v9, 0x0

    .line 26
    if-eqz v8, :cond_0

    .line 27
    .line 28
    invoke-virtual {v1}, LF8/k0;->l()LL8/K;

    .line 29
    .line 30
    .line 31
    move-result-object v8

    .line 32
    iget-object v10, v1, LF8/k0;->w:Ljava/lang/Object;

    .line 33
    .line 34
    invoke-static {v10, v8}, LC4/a;->f(Ljava/lang/Object;LL8/c;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v8

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    move-object v8, v9

    .line 40
    :goto_0
    if-eq v8, v7, :cond_1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    move-object v8, v9

    .line 44
    :goto_1
    invoke-virtual {v1}, LF8/k0;->j()Z

    .line 45
    .line 46
    .line 47
    instance-of v7, v4, Ljava/lang/reflect/AccessibleObject;

    .line 48
    .line 49
    if-eqz v7, :cond_2

    .line 50
    .line 51
    move-object v7, v4

    .line 52
    check-cast v7, Ljava/lang/reflect/AccessibleObject;

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :catch_0
    move-exception v0

    .line 56
    goto/16 :goto_5

    .line 57
    .line 58
    :cond_2
    move-object v7, v9

    .line 59
    :goto_2
    if-nez v7, :cond_3

    .line 60
    .line 61
    goto :goto_3

    .line 62
    :cond_3
    invoke-static {v1}, Lga/l;->k(LC8/b;)Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    invoke-virtual {v7, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 67
    .line 68
    .line 69
    :goto_3
    if-nez v4, :cond_4

    .line 70
    .line 71
    goto/16 :goto_4

    .line 72
    .line 73
    :cond_4
    instance-of v1, v4, Ljava/lang/reflect/Field;

    .line 74
    .line 75
    if-eqz v1, :cond_5

    .line 76
    .line 77
    check-cast v4, Ljava/lang/reflect/Field;

    .line 78
    .line 79
    invoke-virtual {v4, v8}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v9

    .line 83
    goto :goto_4

    .line 84
    :cond_5
    instance-of v1, v4, Ljava/lang/reflect/Method;

    .line 85
    .line 86
    if-eqz v1, :cond_a

    .line 87
    .line 88
    move-object v1, v4

    .line 89
    check-cast v1, Ljava/lang/reflect/Method;

    .line 90
    .line 91
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    array-length v1, v1

    .line 96
    if-eqz v1, :cond_9

    .line 97
    .line 98
    if-eq v1, v2, :cond_7

    .line 99
    .line 100
    if-ne v1, v0, :cond_6

    .line 101
    .line 102
    move-object v1, v4

    .line 103
    check-cast v1, Ljava/lang/reflect/Method;

    .line 104
    .line 105
    check-cast v4, Ljava/lang/reflect/Method;

    .line 106
    .line 107
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    aget-object v4, v4, v2

    .line 112
    .line 113
    const-string v5, "fieldOrMethod.parameterTypes[1]"

    .line 114
    .line 115
    invoke-static {v4, v5}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    invoke-static {v4}, LF8/y0;->e(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    new-array v0, v0, [Ljava/lang/Object;

    .line 123
    .line 124
    aput-object v8, v0, v3

    .line 125
    .line 126
    aput-object v4, v0, v2

    .line 127
    .line 128
    invoke-virtual {v1, v9, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v9

    .line 132
    goto :goto_4

    .line 133
    :cond_6
    new-instance v0, Ljava/lang/AssertionError;

    .line 134
    .line 135
    new-instance v1, Ljava/lang/StringBuilder;

    .line 136
    .line 137
    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    const-string v2, " should take 0, 1, or 2 parameters"

    .line 144
    .line 145
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    throw v0

    .line 156
    :cond_7
    move-object v0, v4

    .line 157
    check-cast v0, Ljava/lang/reflect/Method;

    .line 158
    .line 159
    if-nez v8, :cond_8

    .line 160
    .line 161
    check-cast v4, Ljava/lang/reflect/Method;

    .line 162
    .line 163
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    aget-object v1, v1, v3

    .line 168
    .line 169
    const-string v4, "fieldOrMethod.parameterTypes[0]"

    .line 170
    .line 171
    invoke-static {v1, v4}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    invoke-static {v1}, LF8/y0;->e(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v8

    .line 178
    :cond_8
    new-array v1, v2, [Ljava/lang/Object;

    .line 179
    .line 180
    aput-object v8, v1, v3

    .line 181
    .line 182
    invoke-virtual {v0, v9, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v9

    .line 186
    goto :goto_4

    .line 187
    :cond_9
    check-cast v4, Ljava/lang/reflect/Method;

    .line 188
    .line 189
    new-array v0, v3, [Ljava/lang/Object;

    .line 190
    .line 191
    invoke-virtual {v4, v9, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v9

    .line 195
    :goto_4
    return-object v9

    .line 196
    :cond_a
    new-instance v0, Ljava/lang/AssertionError;

    .line 197
    .line 198
    new-instance v1, Ljava/lang/StringBuilder;

    .line 199
    .line 200
    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    const-string v2, " neither field nor method"

    .line 207
    .line 208
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v1

    .line 215
    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 216
    .line 217
    .line 218
    throw v0
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 219
    :goto_5
    new-instance v1, Lkotlin/reflect/full/IllegalPropertyDelegateAccessException;

    .line 220
    .line 221
    const-string v2, "Cannot obtain the delegate of a non-accessible property. Use \"isAccessible = true\" to make the property accessible"

    .line 222
    .line 223
    invoke-direct {v1, v2, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 224
    .line 225
    .line 226
    throw v1

    .line 227
    :pswitch_0
    new-instance v0, LF8/V;

    .line 228
    .line 229
    invoke-direct {v0, v1}, LF8/V;-><init>(LF8/X;)V

    .line 230
    .line 231
    .line 232
    return-object v0

    .line 233
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

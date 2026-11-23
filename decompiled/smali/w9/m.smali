.class public final Lw9/m;
.super Lv8/k;
.source "SourceFile"

# interfaces
.implements Lu8/a;


# instance fields
.field public final synthetic s:I

.field public final synthetic t:Ljava/lang/Object;

.field public final synthetic u:Ljava/lang/Object;

.field public final synthetic v:I


# direct methods
.method public constructor <init>(LF8/m0;ILh8/d;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lw9/m;->s:I

    .line 1
    iput-object p1, p0, Lw9/m;->t:Ljava/lang/Object;

    iput p2, p0, Lw9/m;->v:I

    iput-object p3, p0, Lw9/m;->u:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lv8/k;-><init>(I)V

    return-void
.end method

.method public synthetic constructor <init>(Lw9/q;Lk9/k;II)V
    .locals 0

    .line 2
    iput p4, p0, Lw9/m;->s:I

    iput-object p1, p0, Lw9/m;->t:Ljava/lang/Object;

    iput-object p2, p0, Lw9/m;->u:Ljava/lang/Object;

    iput p3, p0, Lw9/m;->v:I

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lv8/k;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lw9/m;->s:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lw9/m;->t:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LF8/m0;

    .line 9
    .line 10
    iget-object v1, v0, LF8/m0;->b:LF8/r0;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {v1}, LF8/r0;->invoke()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Ljava/lang/reflect/Type;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v1, 0x0

    .line 22
    :goto_0
    instance-of v2, v1, Ljava/lang/Class;

    .line 23
    .line 24
    const-string v3, "{\n                      \u2026                        }"

    .line 25
    .line 26
    if-eqz v2, :cond_2

    .line 27
    .line 28
    check-cast v1, Ljava/lang/Class;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/Class;->isArray()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const-class v0, Ljava/lang/Object;

    .line 42
    .line 43
    :goto_1
    invoke-static {v0, v3}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    goto :goto_3

    .line 47
    :cond_2
    instance-of v2, v1, Ljava/lang/reflect/GenericArrayType;

    .line 48
    .line 49
    iget v4, p0, Lw9/m;->v:I

    .line 50
    .line 51
    if-eqz v2, :cond_4

    .line 52
    .line 53
    if-nez v4, :cond_3

    .line 54
    .line 55
    check-cast v1, Ljava/lang/reflect/GenericArrayType;

    .line 56
    .line 57
    invoke-interface {v1}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-static {v0, v3}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    goto :goto_3

    .line 65
    :cond_3
    new-instance v1, LF8/p0;

    .line 66
    .line 67
    new-instance v2, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    const-string v3, "Array type has been queried for a non-0th argument: "

    .line 70
    .line 71
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    const/4 v2, 0x0

    .line 82
    invoke-direct {v1, v0, v2}, LF8/p0;-><init>(Ljava/lang/String;I)V

    .line 83
    .line 84
    .line 85
    throw v1

    .line 86
    :cond_4
    instance-of v1, v1, Ljava/lang/reflect/ParameterizedType;

    .line 87
    .line 88
    if-eqz v1, :cond_7

    .line 89
    .line 90
    iget-object v0, p0, Lw9/m;->u:Ljava/lang/Object;

    .line 91
    .line 92
    invoke-interface {v0}, Lh8/d;->getValue()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    check-cast v0, Ljava/util/List;

    .line 97
    .line 98
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    check-cast v0, Ljava/lang/reflect/Type;

    .line 103
    .line 104
    instance-of v1, v0, Ljava/lang/reflect/WildcardType;

    .line 105
    .line 106
    if-nez v1, :cond_5

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_5
    check-cast v0, Ljava/lang/reflect/WildcardType;

    .line 110
    .line 111
    invoke-interface {v0}, Ljava/lang/reflect/WildcardType;->getLowerBounds()[Ljava/lang/reflect/Type;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    const-string v2, "argument.lowerBounds"

    .line 116
    .line 117
    invoke-static {v1, v2}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    invoke-static {v1}, Li8/i;->w([Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    check-cast v1, Ljava/lang/reflect/Type;

    .line 125
    .line 126
    if-nez v1, :cond_6

    .line 127
    .line 128
    invoke-interface {v0}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    const-string v1, "argument.upperBounds"

    .line 133
    .line 134
    invoke-static {v0, v1}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    invoke-static {v0}, Li8/i;->v([Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    check-cast v0, Ljava/lang/reflect/Type;

    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_6
    move-object v0, v1

    .line 145
    :goto_2
    invoke-static {v0, v3}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    :goto_3
    return-object v0

    .line 149
    :cond_7
    new-instance v1, LF8/p0;

    .line 150
    .line 151
    new-instance v2, Ljava/lang/StringBuilder;

    .line 152
    .line 153
    const-string v3, "Non-generic type has been queried for arguments: "

    .line 154
    .line 155
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    const/4 v2, 0x0

    .line 166
    invoke-direct {v1, v0, v2}, LF8/p0;-><init>(Ljava/lang/String;I)V

    .line 167
    .line 168
    .line 169
    throw v1

    .line 170
    :pswitch_0
    iget-object v0, p0, Lw9/m;->t:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast v0, Lw9/q;

    .line 173
    .line 174
    iget-object v1, v0, Lw9/q;->a:LV3/b;

    .line 175
    .line 176
    iget-object v1, v1, LV3/b;->c:Ljava/lang/Object;

    .line 177
    .line 178
    check-cast v1, LL8/j;

    .line 179
    .line 180
    invoke-virtual {v0, v1}, Lw9/q;->a(LL8/j;)LK0/q;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    if-eqz v1, :cond_8

    .line 185
    .line 186
    iget-object v0, v0, Lw9/q;->a:LV3/b;

    .line 187
    .line 188
    iget-object v0, v0, LV3/b;->a:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast v0, LI4/c;

    .line 191
    .line 192
    iget-object v0, v0, LI4/c;->e:Ljava/lang/Object;

    .line 193
    .line 194
    check-cast v0, Lw9/a;

    .line 195
    .line 196
    iget-object v2, p0, Lw9/m;->u:Ljava/lang/Object;

    .line 197
    .line 198
    check-cast v2, Lk9/k;

    .line 199
    .line 200
    iget v3, p0, Lw9/m;->v:I

    .line 201
    .line 202
    invoke-interface {v0, v1, v2, v3}, Lw9/c;->t0(LK0/q;Lk9/k;I)Ljava/util/List;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    goto :goto_4

    .line 207
    :cond_8
    const/4 v0, 0x0

    .line 208
    :goto_4
    if-nez v0, :cond_9

    .line 209
    .line 210
    sget-object v0, Li8/s;->s:Li8/s;

    .line 211
    .line 212
    :cond_9
    return-object v0

    .line 213
    :pswitch_1
    iget-object v0, p0, Lw9/m;->t:Ljava/lang/Object;

    .line 214
    .line 215
    check-cast v0, Lw9/q;

    .line 216
    .line 217
    iget-object v1, v0, Lw9/q;->a:LV3/b;

    .line 218
    .line 219
    iget-object v1, v1, LV3/b;->c:Ljava/lang/Object;

    .line 220
    .line 221
    check-cast v1, LL8/j;

    .line 222
    .line 223
    invoke-virtual {v0, v1}, Lw9/q;->a(LL8/j;)LK0/q;

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    if-eqz v1, :cond_a

    .line 228
    .line 229
    iget-object v0, v0, Lw9/q;->a:LV3/b;

    .line 230
    .line 231
    iget-object v0, v0, LV3/b;->a:Ljava/lang/Object;

    .line 232
    .line 233
    check-cast v0, LI4/c;

    .line 234
    .line 235
    iget-object v0, v0, LI4/c;->e:Ljava/lang/Object;

    .line 236
    .line 237
    check-cast v0, Lw9/a;

    .line 238
    .line 239
    iget-object v2, p0, Lw9/m;->u:Ljava/lang/Object;

    .line 240
    .line 241
    check-cast v2, Lk9/k;

    .line 242
    .line 243
    iget v3, p0, Lw9/m;->v:I

    .line 244
    .line 245
    invoke-interface {v0, v1, v2, v3}, Lw9/c;->F(LK0/q;Lk9/k;I)Ljava/util/List;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    check-cast v0, Ljava/lang/Iterable;

    .line 250
    .line 251
    invoke-static {v0}, Li8/k;->s0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    goto :goto_5

    .line 256
    :cond_a
    const/4 v0, 0x0

    .line 257
    :goto_5
    if-nez v0, :cond_b

    .line 258
    .line 259
    sget-object v0, Li8/s;->s:Li8/s;

    .line 260
    .line 261
    :cond_b
    return-object v0

    .line 262
    nop

    .line 263
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

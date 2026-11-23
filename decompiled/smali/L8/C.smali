.class public final LL8/C;
.super Lv8/k;
.source "SourceFile"

# interfaces
.implements Lu8/b;


# instance fields
.field public final synthetic s:I

.field public final synthetic t:Lo4/r;


# direct methods
.method public synthetic constructor <init>(Lo4/r;I)V
    .locals 0

    .line 1
    iput p2, p0, LL8/C;->s:I

    iput-object p1, p0, LL8/C;->t:Lo4/r;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lv8/k;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, LL8/C;->s:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lj9/c;

    .line 7
    .line 8
    const-string v0, "fqName"

    .line 9
    .line 10
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    new-instance v0, LK8/k;

    .line 14
    .line 15
    iget-object v1, p0, LL8/C;->t:Lo4/r;

    .line 16
    .line 17
    iget-object v1, v1, Lo4/r;->u:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, LL8/y;

    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    invoke-direct {v0, v1, p1, v2}, LK8/k;-><init>(LL8/y;Lj9/c;I)V

    .line 23
    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_0
    check-cast p1, LL8/A;

    .line 27
    .line 28
    const-string v0, "<name for destructuring parameter 0>"

    .line 29
    .line 30
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    iget-object v0, p1, LL8/A;->a:Lj9/b;

    .line 34
    .line 35
    iget-boolean v1, v0, Lj9/b;->c:Z

    .line 36
    .line 37
    if-nez v1, :cond_2

    .line 38
    .line 39
    invoke-virtual {v0}, Lj9/b;->f()Lj9/b;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    iget-object p1, p1, LL8/A;->b:Ljava/util/List;

    .line 44
    .line 45
    iget-object v2, p0, LL8/C;->t:Lo4/r;

    .line 46
    .line 47
    if-eqz v1, :cond_0

    .line 48
    .line 49
    move-object v3, p1

    .line 50
    check-cast v3, Ljava/lang/Iterable;

    .line 51
    .line 52
    invoke-static {v3}, Li8/k;->P(Ljava/lang/Iterable;)Ljava/util/List;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    invoke-virtual {v2, v1, v3}, Lo4/r;->l(Lj9/b;Ljava/util/List;)LL8/e;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    :goto_0
    move-object v5, v1

    .line 61
    goto :goto_1

    .line 62
    :cond_0
    iget-object v1, v2, Lo4/r;->v:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v1, Lz9/e;

    .line 65
    .line 66
    invoke-virtual {v0}, Lj9/b;->g()Lj9/c;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    const-string v4, "classId.packageFqName"

    .line 71
    .line 72
    invoke-static {v3, v4}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1, v3}, Lz9/e;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    check-cast v1, LL8/f;

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :goto_1
    iget-object v1, v0, Lj9/b;->b:Lj9/c;

    .line 83
    .line 84
    invoke-virtual {v1}, Lj9/c;->e()Lj9/c;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    invoke-virtual {v1}, Lj9/c;->d()Z

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    xor-int/lit8 v7, v1, 0x1

    .line 93
    .line 94
    new-instance v3, LL8/B;

    .line 95
    .line 96
    iget-object v1, v2, Lo4/r;->t:Ljava/lang/Object;

    .line 97
    .line 98
    move-object v4, v1

    .line 99
    check-cast v4, Lz9/l;

    .line 100
    .line 101
    invoke-virtual {v0}, Lj9/b;->i()Lj9/f;

    .line 102
    .line 103
    .line 104
    move-result-object v6

    .line 105
    const-string v0, "classId.shortClassName"

    .line 106
    .line 107
    invoke-static {v6, v0}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    invoke-static {p1}, Li8/k;->V(Ljava/util/List;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    check-cast p1, Ljava/lang/Integer;

    .line 115
    .line 116
    if-eqz p1, :cond_1

    .line 117
    .line 118
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 119
    .line 120
    .line 121
    move-result p1

    .line 122
    :goto_2
    move v8, p1

    .line 123
    goto :goto_3

    .line 124
    :cond_1
    const/4 p1, 0x0

    .line 125
    goto :goto_2

    .line 126
    :goto_3
    invoke-direct/range {v3 .. v8}, LL8/B;-><init>(Lz9/l;LL8/f;Lj9/f;ZI)V

    .line 127
    .line 128
    .line 129
    return-object v3

    .line 130
    :cond_2
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 131
    .line 132
    new-instance v1, Ljava/lang/StringBuilder;

    .line 133
    .line 134
    const-string v2, "Unresolved local class: "

    .line 135
    .line 136
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    throw p1

    .line 150
    nop

    .line 151
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
.end method

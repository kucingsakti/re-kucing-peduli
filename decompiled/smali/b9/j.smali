.class public final Lb9/j;
.super Lv8/k;
.source "SourceFile"

# interfaces
.implements Lu8/b;


# instance fields
.field public final synthetic s:I

.field public final synthetic t:Ljava/lang/String;

.field public final synthetic u:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 1
    iput p2, p0, Lb9/j;->s:I

    iput-object p1, p0, Lb9/j;->t:Ljava/lang/String;

    iput-object p3, p0, Lb9/j;->u:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lv8/k;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    const/4 v0, 0x4

    .line 2
    const/4 v1, 0x3

    .line 3
    sget-object v2, Lh8/m;->a:Lh8/m;

    .line 4
    .line 5
    iget-object v3, p0, Lb9/j;->u:Ljava/lang/String;

    .line 6
    .line 7
    const/4 v4, 0x2

    .line 8
    iget-object v5, p0, Lb9/j;->t:Ljava/lang/String;

    .line 9
    .line 10
    const-string v6, "$this$function"

    .line 11
    .line 12
    const/4 v7, 0x0

    .line 13
    const/4 v8, 0x1

    .line 14
    iget v9, p0, Lb9/j;->s:I

    .line 15
    .line 16
    packed-switch v9, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    check-cast p1, Lb9/n;

    .line 20
    .line 21
    invoke-static {p1, v6}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    new-array v0, v8, [Lb9/e;

    .line 25
    .line 26
    sget-object v1, Lb9/k;->a:Lb9/e;

    .line 27
    .line 28
    aput-object v1, v0, v7

    .line 29
    .line 30
    invoke-virtual {p1, v5, v0}, Lb9/n;->a(Ljava/lang/String;[Lb9/e;)V

    .line 31
    .line 32
    .line 33
    new-array v0, v4, [Lb9/e;

    .line 34
    .line 35
    sget-object v1, Lb9/k;->b:Lb9/e;

    .line 36
    .line 37
    aput-object v1, v0, v7

    .line 38
    .line 39
    sget-object v1, Lb9/k;->c:Lb9/e;

    .line 40
    .line 41
    aput-object v1, v0, v8

    .line 42
    .line 43
    invoke-virtual {p1, v3, v0}, Lb9/n;->b(Ljava/lang/String;[Lb9/e;)V

    .line 44
    .line 45
    .line 46
    return-object v2

    .line 47
    :pswitch_0
    check-cast p1, Lb9/n;

    .line 48
    .line 49
    invoke-static {p1, v6}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    sget-object v0, Lb9/k;->c:Lb9/e;

    .line 53
    .line 54
    new-array v1, v8, [Lb9/e;

    .line 55
    .line 56
    aput-object v0, v1, v7

    .line 57
    .line 58
    invoke-virtual {p1, v5, v1}, Lb9/n;->a(Ljava/lang/String;[Lb9/e;)V

    .line 59
    .line 60
    .line 61
    new-array v1, v4, [Lb9/e;

    .line 62
    .line 63
    sget-object v4, Lb9/k;->b:Lb9/e;

    .line 64
    .line 65
    aput-object v4, v1, v7

    .line 66
    .line 67
    aput-object v0, v1, v8

    .line 68
    .line 69
    invoke-virtual {p1, v3, v1}, Lb9/n;->b(Ljava/lang/String;[Lb9/e;)V

    .line 70
    .line 71
    .line 72
    return-object v2

    .line 73
    :pswitch_1
    check-cast p1, Lb9/n;

    .line 74
    .line 75
    invoke-static {p1, v6}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    sget-object v6, Lb9/k;->b:Lb9/e;

    .line 79
    .line 80
    new-array v9, v8, [Lb9/e;

    .line 81
    .line 82
    aput-object v6, v9, v7

    .line 83
    .line 84
    invoke-virtual {p1, v5, v9}, Lb9/n;->a(Ljava/lang/String;[Lb9/e;)V

    .line 85
    .line 86
    .line 87
    sget-object v9, Lb9/k;->c:Lb9/e;

    .line 88
    .line 89
    new-array v10, v8, [Lb9/e;

    .line 90
    .line 91
    aput-object v9, v10, v7

    .line 92
    .line 93
    invoke-virtual {p1, v5, v10}, Lb9/n;->a(Ljava/lang/String;[Lb9/e;)V

    .line 94
    .line 95
    .line 96
    sget-object v10, Lb9/k;->a:Lb9/e;

    .line 97
    .line 98
    new-array v0, v0, [Lb9/e;

    .line 99
    .line 100
    aput-object v6, v0, v7

    .line 101
    .line 102
    aput-object v9, v0, v8

    .line 103
    .line 104
    aput-object v9, v0, v4

    .line 105
    .line 106
    aput-object v10, v0, v1

    .line 107
    .line 108
    invoke-virtual {p1, v3, v0}, Lb9/n;->a(Ljava/lang/String;[Lb9/e;)V

    .line 109
    .line 110
    .line 111
    new-array v0, v8, [Lb9/e;

    .line 112
    .line 113
    aput-object v10, v0, v7

    .line 114
    .line 115
    invoke-virtual {p1, v5, v0}, Lb9/n;->b(Ljava/lang/String;[Lb9/e;)V

    .line 116
    .line 117
    .line 118
    return-object v2

    .line 119
    :pswitch_2
    check-cast p1, Lb9/n;

    .line 120
    .line 121
    invoke-static {p1, v6}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    sget-object v6, Lb9/k;->b:Lb9/e;

    .line 125
    .line 126
    new-array v9, v8, [Lb9/e;

    .line 127
    .line 128
    aput-object v6, v9, v7

    .line 129
    .line 130
    invoke-virtual {p1, v5, v9}, Lb9/n;->a(Ljava/lang/String;[Lb9/e;)V

    .line 131
    .line 132
    .line 133
    sget-object v9, Lb9/k;->a:Lb9/e;

    .line 134
    .line 135
    new-array v0, v0, [Lb9/e;

    .line 136
    .line 137
    aput-object v6, v0, v7

    .line 138
    .line 139
    aput-object v6, v0, v8

    .line 140
    .line 141
    sget-object v6, Lb9/k;->c:Lb9/e;

    .line 142
    .line 143
    aput-object v6, v0, v4

    .line 144
    .line 145
    aput-object v9, v0, v1

    .line 146
    .line 147
    invoke-virtual {p1, v3, v0}, Lb9/n;->a(Ljava/lang/String;[Lb9/e;)V

    .line 148
    .line 149
    .line 150
    new-array v0, v8, [Lb9/e;

    .line 151
    .line 152
    aput-object v9, v0, v7

    .line 153
    .line 154
    invoke-virtual {p1, v5, v0}, Lb9/n;->b(Ljava/lang/String;[Lb9/e;)V

    .line 155
    .line 156
    .line 157
    return-object v2

    .line 158
    :pswitch_3
    check-cast p1, Lb9/n;

    .line 159
    .line 160
    invoke-static {p1, v6}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    sget-object v0, Lb9/k;->b:Lb9/e;

    .line 164
    .line 165
    new-array v6, v8, [Lb9/e;

    .line 166
    .line 167
    aput-object v0, v6, v7

    .line 168
    .line 169
    invoke-virtual {p1, v5, v6}, Lb9/n;->a(Ljava/lang/String;[Lb9/e;)V

    .line 170
    .line 171
    .line 172
    new-array v1, v1, [Lb9/e;

    .line 173
    .line 174
    aput-object v0, v1, v7

    .line 175
    .line 176
    aput-object v0, v1, v8

    .line 177
    .line 178
    aput-object v0, v1, v4

    .line 179
    .line 180
    invoke-virtual {p1, v3, v1}, Lb9/n;->a(Ljava/lang/String;[Lb9/e;)V

    .line 181
    .line 182
    .line 183
    new-array v1, v8, [Lb9/e;

    .line 184
    .line 185
    aput-object v0, v1, v7

    .line 186
    .line 187
    invoke-virtual {p1, v5, v1}, Lb9/n;->b(Ljava/lang/String;[Lb9/e;)V

    .line 188
    .line 189
    .line 190
    return-object v2

    .line 191
    :pswitch_4
    check-cast p1, Lb9/n;

    .line 192
    .line 193
    invoke-static {p1, v6}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    sget-object v6, Lb9/k;->b:Lb9/e;

    .line 197
    .line 198
    new-array v9, v8, [Lb9/e;

    .line 199
    .line 200
    aput-object v6, v9, v7

    .line 201
    .line 202
    invoke-virtual {p1, v5, v9}, Lb9/n;->a(Ljava/lang/String;[Lb9/e;)V

    .line 203
    .line 204
    .line 205
    sget-object v9, Lb9/k;->a:Lb9/e;

    .line 206
    .line 207
    new-array v0, v0, [Lb9/e;

    .line 208
    .line 209
    aput-object v6, v0, v7

    .line 210
    .line 211
    aput-object v6, v0, v8

    .line 212
    .line 213
    aput-object v9, v0, v4

    .line 214
    .line 215
    aput-object v9, v0, v1

    .line 216
    .line 217
    invoke-virtual {p1, v3, v0}, Lb9/n;->a(Ljava/lang/String;[Lb9/e;)V

    .line 218
    .line 219
    .line 220
    new-array v0, v8, [Lb9/e;

    .line 221
    .line 222
    aput-object v9, v0, v7

    .line 223
    .line 224
    invoke-virtual {p1, v5, v0}, Lb9/n;->b(Ljava/lang/String;[Lb9/e;)V

    .line 225
    .line 226
    .line 227
    return-object v2

    .line 228
    nop

    .line 229
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.class public final LJ9/a;
.super LJ9/l;
.source "SourceFile"


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/io/Serializable;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/io/Serializable;I)V
    .locals 0

    .line 1
    iput p3, p0, LJ9/a;->b:I

    iput-object p1, p0, LJ9/a;->c:Ljava/lang/Object;

    iput-object p2, p0, LJ9/a;->d:Ljava/io/Serializable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lv8/t;Lu8/b;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, LJ9/a;->b:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LJ9/a;->c:Ljava/lang/Object;

    check-cast p2, Lv8/k;

    iput-object p2, p0, LJ9/a;->d:Ljava/io/Serializable;

    return-void
.end method


# virtual methods
.method public c(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget v0, p0, LJ9/a;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    check-cast p1, LL8/c;

    .line 8
    .line 9
    const-string v0, "current"

    .line 10
    .line 11
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, LJ9/a;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Lv8/t;

    .line 17
    .line 18
    iget-object v1, v0, Lv8/t;->s:Ljava/lang/Object;

    .line 19
    .line 20
    if-nez v1, :cond_0

    .line 21
    .line 22
    iget-object v1, p0, LJ9/a;->d:Ljava/io/Serializable;

    .line 23
    .line 24
    check-cast v1, Lv8/k;

    .line 25
    .line 26
    invoke-interface {v1, p1}, Lu8/b;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Ljava/lang/Boolean;

    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_0

    .line 37
    .line 38
    iput-object p1, v0, Lv8/t;->s:Ljava/lang/Object;

    .line 39
    .line 40
    :cond_0
    return-void

    .line 41
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method public final d(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    iget v0, p0, LJ9/a;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, LL8/c;

    .line 7
    .line 8
    const-string v0, "current"

    .line 9
    .line 10
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, LJ9/a;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p1, Lv8/t;

    .line 16
    .line 17
    iget-object p1, p1, Lv8/t;->s:Ljava/lang/Object;

    .line 18
    .line 19
    if-nez p1, :cond_0

    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 p1, 0x0

    .line 24
    :goto_0
    return p1

    .line 25
    :pswitch_0
    check-cast p1, LL8/e;

    .line 26
    .line 27
    const-string v0, "javaClassDescriptor"

    .line 28
    .line 29
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, LJ9/a;->c:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {p1, v0}, Loa/b;->n(LL8/e;Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    sget-object v0, LK8/p;->b:Ljava/util/LinkedHashSet;

    .line 41
    .line 42
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-object v1, p0, LJ9/a;->d:Ljava/io/Serializable;

    .line 47
    .line 48
    check-cast v1, Lv8/t;

    .line 49
    .line 50
    if-eqz v0, :cond_1

    .line 51
    .line 52
    sget-object p1, LK8/j;->s:LK8/j;

    .line 53
    .line 54
    iput-object p1, v1, Lv8/t;->s:Ljava/lang/Object;

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_1
    sget-object v0, LK8/p;->c:Ljava/util/LinkedHashSet;

    .line 58
    .line 59
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-eqz v0, :cond_2

    .line 64
    .line 65
    sget-object p1, LK8/j;->t:LK8/j;

    .line 66
    .line 67
    iput-object p1, v1, Lv8/t;->s:Ljava/lang/Object;

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    sget-object v0, LK8/p;->a:Ljava/util/LinkedHashSet;

    .line 71
    .line 72
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    if-eqz p1, :cond_3

    .line 77
    .line 78
    sget-object p1, LK8/j;->v:LK8/j;

    .line 79
    .line 80
    iput-object p1, v1, Lv8/t;->s:Ljava/lang/Object;

    .line 81
    .line 82
    :cond_3
    :goto_1
    iget-object p1, v1, Lv8/t;->s:Ljava/lang/Object;

    .line 83
    .line 84
    if-nez p1, :cond_4

    .line 85
    .line 86
    const/4 p1, 0x1

    .line 87
    goto :goto_2

    .line 88
    :cond_4
    const/4 p1, 0x0

    .line 89
    :goto_2
    return p1

    .line 90
    :pswitch_1
    iget-object v0, p0, LJ9/a;->c:Ljava/lang/Object;

    .line 91
    .line 92
    invoke-interface {v0, p1}, Lu8/b;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    check-cast p1, Ljava/lang/Boolean;

    .line 97
    .line 98
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    iget-object v0, p0, LJ9/a;->d:Ljava/io/Serializable;

    .line 103
    .line 104
    check-cast v0, [Z

    .line 105
    .line 106
    const/4 v1, 0x1

    .line 107
    const/4 v2, 0x0

    .line 108
    if-eqz p1, :cond_5

    .line 109
    .line 110
    aput-boolean v1, v0, v2

    .line 111
    .line 112
    :cond_5
    aget-boolean p1, v0, v2

    .line 113
    .line 114
    xor-int/2addr p1, v1

    .line 115
    return p1

    .line 116
    nop

    .line 117
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
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
.end method

.method public final k()Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, LJ9/a;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LJ9/a;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lv8/t;

    .line 9
    .line 10
    iget-object v0, v0, Lv8/t;->s:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, LL8/c;

    .line 13
    .line 14
    return-object v0

    .line 15
    :pswitch_0
    iget-object v0, p0, LJ9/a;->d:Ljava/io/Serializable;

    .line 16
    .line 17
    check-cast v0, Lv8/t;

    .line 18
    .line 19
    iget-object v0, v0, Lv8/t;->s:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, LK8/j;

    .line 22
    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    sget-object v0, LK8/j;->u:LK8/j;

    .line 26
    .line 27
    :cond_0
    return-object v0

    .line 28
    :pswitch_1
    iget-object v0, p0, LJ9/a;->d:Ljava/io/Serializable;

    .line 29
    .line 30
    check-cast v0, [Z

    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    aget-boolean v0, v0, v1

    .line 34
    .line 35
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    return-object v0

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
.end method

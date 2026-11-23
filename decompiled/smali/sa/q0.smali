.class public final enum Lsa/q0;
.super Lsa/e1;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const-string v0, "AttributeName"

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    invoke-direct {p0, v0, v1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 6
    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
.end method


# virtual methods
.method public final i(Lsa/N;Lsa/a;)V
    .locals 6

    .line 1
    sget-object v0, Lsa/e1;->H0:[C

    .line 2
    .line 3
    invoke-virtual {p2, v0}, Lsa/a;->k([C)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p1, Lsa/N;->k:Lsa/M;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    const v3, 0xfffd

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v2, v3}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const/4 v2, 0x1

    .line 21
    iput-boolean v2, v1, Lsa/M;->f:Z

    .line 22
    .line 23
    iget-object v3, v1, Lsa/M;->e:Ljava/lang/String;

    .line 24
    .line 25
    const/4 v4, 0x0

    .line 26
    iget-object v5, v1, Lsa/M;->d:Ljava/lang/StringBuilder;

    .line 27
    .line 28
    if-eqz v3, :cond_0

    .line 29
    .line 30
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    iput-object v4, v1, Lsa/M;->e:Ljava/lang/String;

    .line 34
    .line 35
    :cond_0
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->length()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-nez v3, :cond_1

    .line 40
    .line 41
    iput-object v0, v1, Lsa/M;->e:Ljava/lang/String;

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    :goto_0
    invoke-virtual {p2}, Lsa/a;->e()C

    .line 48
    .line 49
    .line 50
    move-result p2

    .line 51
    const/16 v0, 0x9

    .line 52
    .line 53
    if-eq p2, v0, :cond_7

    .line 54
    .line 55
    const/16 v0, 0xa

    .line 56
    .line 57
    if-eq p2, v0, :cond_7

    .line 58
    .line 59
    const/16 v0, 0xc

    .line 60
    .line 61
    if-eq p2, v0, :cond_7

    .line 62
    .line 63
    const/16 v0, 0xd

    .line 64
    .line 65
    if-eq p2, v0, :cond_7

    .line 66
    .line 67
    const/16 v0, 0x20

    .line 68
    .line 69
    if-eq p2, v0, :cond_7

    .line 70
    .line 71
    const/16 v0, 0x22

    .line 72
    .line 73
    if-eq p2, v0, :cond_5

    .line 74
    .line 75
    const/16 v0, 0x27

    .line 76
    .line 77
    if-eq p2, v0, :cond_5

    .line 78
    .line 79
    const/16 v0, 0x2f

    .line 80
    .line 81
    if-eq p2, v0, :cond_4

    .line 82
    .line 83
    sget-object v0, Lsa/e1;->s:Lsa/Z;

    .line 84
    .line 85
    const v1, 0xffff

    .line 86
    .line 87
    .line 88
    if-eq p2, v1, :cond_3

    .line 89
    .line 90
    packed-switch p2, :pswitch_data_0

    .line 91
    .line 92
    .line 93
    iget-object p1, p1, Lsa/N;->k:Lsa/M;

    .line 94
    .line 95
    iput-boolean v2, p1, Lsa/M;->f:Z

    .line 96
    .line 97
    iget-object v0, p1, Lsa/M;->e:Ljava/lang/String;

    .line 98
    .line 99
    iget-object v1, p1, Lsa/M;->d:Ljava/lang/StringBuilder;

    .line 100
    .line 101
    if-eqz v0, :cond_2

    .line 102
    .line 103
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    iput-object v4, p1, Lsa/M;->e:Ljava/lang/String;

    .line 107
    .line 108
    :cond_2
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    return-void

    .line 112
    :pswitch_0
    invoke-virtual {p1}, Lsa/N;->k()V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1, v0}, Lsa/N;->o(Lsa/e1;)V

    .line 116
    .line 117
    .line 118
    return-void

    .line 119
    :pswitch_1
    sget-object p2, Lsa/e1;->c0:Lsa/s0;

    .line 120
    .line 121
    invoke-virtual {p1, p2}, Lsa/N;->o(Lsa/e1;)V

    .line 122
    .line 123
    .line 124
    return-void

    .line 125
    :cond_3
    invoke-virtual {p1, p0}, Lsa/N;->l(Lsa/e1;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p1, v0}, Lsa/N;->o(Lsa/e1;)V

    .line 129
    .line 130
    .line 131
    return-void

    .line 132
    :cond_4
    sget-object p2, Lsa/e1;->h0:Lsa/y0;

    .line 133
    .line 134
    invoke-virtual {p1, p2}, Lsa/N;->o(Lsa/e1;)V

    .line 135
    .line 136
    .line 137
    return-void

    .line 138
    :cond_5
    :pswitch_2
    invoke-virtual {p1, p0}, Lsa/N;->m(Lsa/e1;)V

    .line 139
    .line 140
    .line 141
    iget-object p1, p1, Lsa/N;->k:Lsa/M;

    .line 142
    .line 143
    iput-boolean v2, p1, Lsa/M;->f:Z

    .line 144
    .line 145
    iget-object v0, p1, Lsa/M;->e:Ljava/lang/String;

    .line 146
    .line 147
    iget-object v1, p1, Lsa/M;->d:Ljava/lang/StringBuilder;

    .line 148
    .line 149
    if-eqz v0, :cond_6

    .line 150
    .line 151
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    iput-object v4, p1, Lsa/M;->e:Ljava/lang/String;

    .line 155
    .line 156
    :cond_6
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    return-void

    .line 160
    :cond_7
    sget-object p2, Lsa/e1;->b0:Lsa/r0;

    .line 161
    .line 162
    invoke-virtual {p1, p2}, Lsa/N;->o(Lsa/e1;)V

    .line 163
    .line 164
    .line 165
    return-void

    .line 166
    nop

    .line 167
    :pswitch_data_0
    .packed-switch 0x3c
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
.end method

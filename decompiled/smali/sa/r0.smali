.class public final enum Lsa/r0;
.super Lsa/e1;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const-string v0, "AfterAttributeName"

    .line 2
    .line 3
    const/16 v1, 0x23

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
    invoke-virtual {p2}, Lsa/a;->e()C

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sget-object v1, Lsa/e1;->a0:Lsa/q0;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v0, :cond_5

    .line 10
    .line 11
    const/16 v4, 0x20

    .line 12
    .line 13
    if-eq v0, v4, :cond_4

    .line 14
    .line 15
    const/16 v4, 0x22

    .line 16
    .line 17
    if-eq v0, v4, :cond_2

    .line 18
    .line 19
    const/16 v4, 0x27

    .line 20
    .line 21
    if-eq v0, v4, :cond_2

    .line 22
    .line 23
    const/16 v4, 0x2f

    .line 24
    .line 25
    if-eq v0, v4, :cond_1

    .line 26
    .line 27
    sget-object v4, Lsa/e1;->s:Lsa/Z;

    .line 28
    .line 29
    const v5, 0xffff

    .line 30
    .line 31
    .line 32
    if-eq v0, v5, :cond_0

    .line 33
    .line 34
    const/16 v5, 0x9

    .line 35
    .line 36
    if-eq v0, v5, :cond_4

    .line 37
    .line 38
    const/16 v5, 0xa

    .line 39
    .line 40
    if-eq v0, v5, :cond_4

    .line 41
    .line 42
    const/16 v5, 0xc

    .line 43
    .line 44
    if-eq v0, v5, :cond_4

    .line 45
    .line 46
    const/16 v5, 0xd

    .line 47
    .line 48
    if-eq v0, v5, :cond_4

    .line 49
    .line 50
    packed-switch v0, :pswitch_data_0

    .line 51
    .line 52
    .line 53
    iget-object v0, p1, Lsa/N;->k:Lsa/M;

    .line 54
    .line 55
    invoke-virtual {v0}, Lsa/M;->z()V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p2}, Lsa/a;->y()V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, v1}, Lsa/N;->o(Lsa/e1;)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :pswitch_0
    invoke-virtual {p1}, Lsa/N;->k()V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1, v4}, Lsa/N;->o(Lsa/e1;)V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :pswitch_1
    sget-object p2, Lsa/e1;->c0:Lsa/s0;

    .line 73
    .line 74
    invoke-virtual {p1, p2}, Lsa/N;->o(Lsa/e1;)V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :cond_0
    invoke-virtual {p1, p0}, Lsa/N;->l(Lsa/e1;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1, v4}, Lsa/N;->o(Lsa/e1;)V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :cond_1
    sget-object p2, Lsa/e1;->h0:Lsa/y0;

    .line 86
    .line 87
    invoke-virtual {p1, p2}, Lsa/N;->o(Lsa/e1;)V

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :cond_2
    :pswitch_2
    invoke-virtual {p1, p0}, Lsa/N;->m(Lsa/e1;)V

    .line 92
    .line 93
    .line 94
    iget-object p2, p1, Lsa/N;->k:Lsa/M;

    .line 95
    .line 96
    invoke-virtual {p2}, Lsa/M;->z()V

    .line 97
    .line 98
    .line 99
    iget-object p2, p1, Lsa/N;->k:Lsa/M;

    .line 100
    .line 101
    iput-boolean v3, p2, Lsa/M;->f:Z

    .line 102
    .line 103
    iget-object v3, p2, Lsa/M;->e:Ljava/lang/String;

    .line 104
    .line 105
    iget-object v4, p2, Lsa/M;->d:Ljava/lang/StringBuilder;

    .line 106
    .line 107
    if-eqz v3, :cond_3

    .line 108
    .line 109
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    iput-object v2, p2, Lsa/M;->e:Ljava/lang/String;

    .line 113
    .line 114
    :cond_3
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {p1, v1}, Lsa/N;->o(Lsa/e1;)V

    .line 118
    .line 119
    .line 120
    :cond_4
    return-void

    .line 121
    :cond_5
    invoke-virtual {p1, p0}, Lsa/N;->m(Lsa/e1;)V

    .line 122
    .line 123
    .line 124
    iget-object p2, p1, Lsa/N;->k:Lsa/M;

    .line 125
    .line 126
    iput-boolean v3, p2, Lsa/M;->f:Z

    .line 127
    .line 128
    iget-object v0, p2, Lsa/M;->e:Ljava/lang/String;

    .line 129
    .line 130
    iget-object v3, p2, Lsa/M;->d:Ljava/lang/StringBuilder;

    .line 131
    .line 132
    if-eqz v0, :cond_6

    .line 133
    .line 134
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    iput-object v2, p2, Lsa/M;->e:Ljava/lang/String;

    .line 138
    .line 139
    :cond_6
    const p2, 0xfffd

    .line 140
    .line 141
    .line 142
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {p1, v1}, Lsa/N;->o(Lsa/e1;)V

    .line 146
    .line 147
    .line 148
    return-void

    .line 149
    :pswitch_data_0
    .packed-switch 0x3c
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method

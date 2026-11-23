.class public final enum Lsa/p0;
.super Lsa/e1;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const-string v0, "BeforeAttributeName"

    .line 2
    .line 3
    const/16 v1, 0x21

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
    .locals 4

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
    if-eqz v0, :cond_5

    .line 8
    .line 9
    const/16 v2, 0x20

    .line 10
    .line 11
    if-eq v0, v2, :cond_4

    .line 12
    .line 13
    const/16 v2, 0x22

    .line 14
    .line 15
    if-eq v0, v2, :cond_2

    .line 16
    .line 17
    const/16 v2, 0x27

    .line 18
    .line 19
    if-eq v0, v2, :cond_2

    .line 20
    .line 21
    const/16 v2, 0x2f

    .line 22
    .line 23
    if-eq v0, v2, :cond_1

    .line 24
    .line 25
    sget-object v2, Lsa/e1;->s:Lsa/Z;

    .line 26
    .line 27
    const v3, 0xffff

    .line 28
    .line 29
    .line 30
    if-eq v0, v3, :cond_0

    .line 31
    .line 32
    const/16 v3, 0x9

    .line 33
    .line 34
    if-eq v0, v3, :cond_4

    .line 35
    .line 36
    const/16 v3, 0xa

    .line 37
    .line 38
    if-eq v0, v3, :cond_4

    .line 39
    .line 40
    const/16 v3, 0xc

    .line 41
    .line 42
    if-eq v0, v3, :cond_4

    .line 43
    .line 44
    const/16 v3, 0xd

    .line 45
    .line 46
    if-eq v0, v3, :cond_4

    .line 47
    .line 48
    packed-switch v0, :pswitch_data_0

    .line 49
    .line 50
    .line 51
    iget-object v0, p1, Lsa/N;->k:Lsa/M;

    .line 52
    .line 53
    invoke-virtual {v0}, Lsa/M;->z()V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p2}, Lsa/a;->y()V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1, v1}, Lsa/N;->o(Lsa/e1;)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :pswitch_0
    invoke-virtual {p2}, Lsa/a;->y()V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, p0}, Lsa/N;->m(Lsa/e1;)V

    .line 67
    .line 68
    .line 69
    :pswitch_1
    invoke-virtual {p1}, Lsa/N;->k()V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1, v2}, Lsa/N;->o(Lsa/e1;)V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :cond_0
    invoke-virtual {p1, p0}, Lsa/N;->l(Lsa/e1;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1, v2}, Lsa/N;->o(Lsa/e1;)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :cond_1
    sget-object p2, Lsa/e1;->h0:Lsa/y0;

    .line 84
    .line 85
    invoke-virtual {p1, p2}, Lsa/N;->o(Lsa/e1;)V

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :cond_2
    :pswitch_2
    invoke-virtual {p1, p0}, Lsa/N;->m(Lsa/e1;)V

    .line 90
    .line 91
    .line 92
    iget-object p2, p1, Lsa/N;->k:Lsa/M;

    .line 93
    .line 94
    invoke-virtual {p2}, Lsa/M;->z()V

    .line 95
    .line 96
    .line 97
    iget-object p2, p1, Lsa/N;->k:Lsa/M;

    .line 98
    .line 99
    const/4 v2, 0x1

    .line 100
    iput-boolean v2, p2, Lsa/M;->f:Z

    .line 101
    .line 102
    iget-object v2, p2, Lsa/M;->e:Ljava/lang/String;

    .line 103
    .line 104
    iget-object v3, p2, Lsa/M;->d:Ljava/lang/StringBuilder;

    .line 105
    .line 106
    if-eqz v2, :cond_3

    .line 107
    .line 108
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    const/4 v2, 0x0

    .line 112
    iput-object v2, p2, Lsa/M;->e:Ljava/lang/String;

    .line 113
    .line 114
    :cond_3
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

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
    invoke-virtual {p2}, Lsa/a;->y()V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p1, p0}, Lsa/N;->m(Lsa/e1;)V

    .line 125
    .line 126
    .line 127
    iget-object p2, p1, Lsa/N;->k:Lsa/M;

    .line 128
    .line 129
    invoke-virtual {p2}, Lsa/M;->z()V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p1, v1}, Lsa/N;->o(Lsa/e1;)V

    .line 133
    .line 134
    .line 135
    return-void

    .line 136
    nop

    .line 137
    :pswitch_data_0
    .packed-switch 0x3c
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
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
.end method

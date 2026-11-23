.class public final synthetic LB6/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LB6/h;


# direct methods
.method public synthetic constructor <init>(LB6/h;I)V
    .locals 0

    .line 1
    iput p2, p0, LB6/c;->a:I

    iput-object p1, p0, LB6/c;->b:LB6/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget v0, p0, LB6/c;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Landroidx/activity/result/ActivityResult;

    .line 7
    .line 8
    iget-object p1, p0, LB6/c;->b:LB6/h;

    .line 9
    .line 10
    invoke-virtual {p1}, LB6/h;->g0()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    iget-object v0, p1, LB6/h;->v0:LB6/b;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    new-instance v2, Ljava/util/ArrayList;

    .line 22
    .line 23
    iget-object p1, p1, LB6/h;->u0:LB6/i;

    .line 24
    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    iget-object p1, p1, LB6/i;->i:Ljava/util/LinkedHashSet;

    .line 28
    .line 29
    invoke-direct {v2, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v2}, LB6/b;->q(Ljava/util/List;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const-string p1, "pb"

    .line 37
    .line 38
    invoke-static {p1}, Lv8/i;->n(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw v1

    .line 42
    :cond_1
    const-string p1, "task"

    .line 43
    .line 44
    invoke-static {p1}, Lv8/i;->n(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw v1

    .line 48
    :cond_2
    :goto_0
    return-void

    .line 49
    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    .line 50
    .line 51
    iget-object v0, p0, LB6/c;->b:LB6/h;

    .line 52
    .line 53
    new-instance v1, LB6/g;

    .line 54
    .line 55
    const/4 v2, 0x1

    .line 56
    invoke-direct {v1, v0, p1, v2}, LB6/g;-><init>(LB6/h;Ljava/lang/Boolean;I)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v1}, LB6/h;->i0(Lu8/a;)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :pswitch_1
    check-cast p1, Landroidx/activity/result/ActivityResult;

    .line 64
    .line 65
    iget-object p1, p0, LB6/c;->b:LB6/h;

    .line 66
    .line 67
    new-instance v0, LB6/f;

    .line 68
    .line 69
    const/4 v1, 0x6

    .line 70
    invoke-direct {v0, p1, v1}, LB6/f;-><init>(LB6/h;I)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1, v0}, LB6/h;->i0(Lu8/a;)V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :pswitch_2
    check-cast p1, Landroidx/activity/result/ActivityResult;

    .line 78
    .line 79
    iget-object p1, p0, LB6/c;->b:LB6/h;

    .line 80
    .line 81
    new-instance v0, LB6/f;

    .line 82
    .line 83
    const/4 v1, 0x4

    .line 84
    invoke-direct {v0, p1, v1}, LB6/f;-><init>(LB6/h;I)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1, v0}, LB6/h;->i0(Lu8/a;)V

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :pswitch_3
    check-cast p1, Landroidx/activity/result/ActivityResult;

    .line 92
    .line 93
    iget-object p1, p0, LB6/c;->b:LB6/h;

    .line 94
    .line 95
    new-instance v0, LB6/f;

    .line 96
    .line 97
    const/4 v1, 0x5

    .line 98
    invoke-direct {v0, p1, v1}, LB6/f;-><init>(LB6/h;I)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1, v0}, LB6/h;->i0(Lu8/a;)V

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :pswitch_4
    check-cast p1, Landroidx/activity/result/ActivityResult;

    .line 106
    .line 107
    iget-object p1, p0, LB6/c;->b:LB6/h;

    .line 108
    .line 109
    new-instance v0, LB6/f;

    .line 110
    .line 111
    const/16 v1, 0x8

    .line 112
    .line 113
    invoke-direct {v0, p1, v1}, LB6/f;-><init>(LB6/h;I)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p1, v0}, LB6/h;->i0(Lu8/a;)V

    .line 117
    .line 118
    .line 119
    return-void

    .line 120
    :pswitch_5
    check-cast p1, Landroidx/activity/result/ActivityResult;

    .line 121
    .line 122
    iget-object p1, p0, LB6/c;->b:LB6/h;

    .line 123
    .line 124
    new-instance v0, LB6/f;

    .line 125
    .line 126
    const/4 v1, 0x7

    .line 127
    invoke-direct {v0, p1, v1}, LB6/f;-><init>(LB6/h;I)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1, v0}, LB6/h;->i0(Lu8/a;)V

    .line 131
    .line 132
    .line 133
    return-void

    .line 134
    :pswitch_6
    check-cast p1, Ljava/lang/Boolean;

    .line 135
    .line 136
    iget-object v0, p0, LB6/c;->b:LB6/h;

    .line 137
    .line 138
    new-instance v1, LB6/g;

    .line 139
    .line 140
    const/4 v2, 0x0

    .line 141
    invoke-direct {v1, v0, p1, v2}, LB6/g;-><init>(LB6/h;Ljava/lang/Boolean;I)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v0, v1}, LB6/h;->i0(Lu8/a;)V

    .line 145
    .line 146
    .line 147
    return-void

    .line 148
    :pswitch_7
    check-cast p1, Ljava/util/Map;

    .line 149
    .line 150
    iget-object v0, p0, LB6/c;->b:LB6/h;

    .line 151
    .line 152
    new-instance v1, LA9/A;

    .line 153
    .line 154
    const/4 v2, 0x1

    .line 155
    invoke-direct {v1, v0, v2, p1}, LA9/A;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v0, v1}, LB6/h;->i0(Lu8/a;)V

    .line 159
    .line 160
    .line 161
    return-void

    .line 162
    nop

    .line 163
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

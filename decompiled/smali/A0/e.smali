.class public final synthetic LA0/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/q;


# instance fields
.field public final synthetic s:I

.field public final synthetic t:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, LA0/e;->s:I

    iput-object p1, p0, LA0/e;->t:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onStateChanged(Landroidx/lifecycle/s;Landroidx/lifecycle/m;)V
    .locals 6

    .line 1
    iget v0, p0, LA0/e;->s:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LA0/e;->t:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Ly0/B;

    .line 9
    .line 10
    const-string v0, "this$0"

    .line 11
    .line 12
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p2}, Landroidx/lifecycle/m;->f()Landroidx/lifecycle/n;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p1, Ly0/B;->q:Landroidx/lifecycle/n;

    .line 20
    .line 21
    iget-object v0, p1, Ly0/B;->c:Ly0/z;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    iget-object p1, p1, Ly0/B;->g:Li8/h;

    .line 26
    .line 27
    invoke-static {p1}, Li8/k;->t0(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, Ly0/j;

    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p2}, Landroidx/lifecycle/m;->f()Landroidx/lifecycle/n;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    iput-object v1, v0, Ly0/j;->v:Landroidx/lifecycle/n;

    .line 55
    .line 56
    invoke-virtual {v0}, Ly0/j;->f()V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    return-void

    .line 61
    :pswitch_0
    iget-object p1, p0, LA0/e;->t:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast p1, LN0/e;

    .line 64
    .line 65
    const-string v0, "this$0"

    .line 66
    .line 67
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    sget-object v0, Landroidx/lifecycle/m;->ON_START:Landroidx/lifecycle/m;

    .line 71
    .line 72
    if-ne p2, v0, :cond_1

    .line 73
    .line 74
    const/4 p2, 0x1

    .line 75
    iput-boolean p2, p1, LN0/e;->c:Z

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_1
    sget-object v0, Landroidx/lifecycle/m;->ON_STOP:Landroidx/lifecycle/m;

    .line 79
    .line 80
    if-ne p2, v0, :cond_2

    .line 81
    .line 82
    const/4 p2, 0x0

    .line 83
    iput-boolean p2, p1, LN0/e;->c:Z

    .line 84
    .line 85
    :cond_2
    :goto_1
    return-void

    .line 86
    :pswitch_1
    iget-object v0, p0, LA0/e;->t:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v0, LA0/g;

    .line 89
    .line 90
    const-string v1, "this$0"

    .line 91
    .line 92
    invoke-static {v0, v1}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    sget-object v1, Landroidx/lifecycle/m;->ON_DESTROY:Landroidx/lifecycle/m;

    .line 96
    .line 97
    if-ne p2, v1, :cond_6

    .line 98
    .line 99
    move-object p2, p1

    .line 100
    check-cast p2, Landroidx/fragment/app/b;

    .line 101
    .line 102
    invoke-virtual {v0}, Ly0/O;->b()Ly0/l;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    iget-object v1, v1, Ly0/l;->f:LP0/d;

    .line 107
    .line 108
    iget-object v1, v1, LP0/d;->t:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v1, LQ9/m;

    .line 111
    .line 112
    check-cast v1, LQ9/t;

    .line 113
    .line 114
    invoke-virtual {v1}, LQ9/t;->f()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    check-cast v1, Ljava/lang/Iterable;

    .line 119
    .line 120
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    const/4 v2, 0x0

    .line 125
    :cond_3
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 126
    .line 127
    .line 128
    move-result v3

    .line 129
    if-eqz v3, :cond_4

    .line 130
    .line 131
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    move-object v4, v3

    .line 136
    check-cast v4, Ly0/j;

    .line 137
    .line 138
    iget-object v4, v4, Ly0/j;->x:Ljava/lang/String;

    .line 139
    .line 140
    iget-object v5, p2, Landroidx/fragment/app/b;->T:Ljava/lang/String;

    .line 141
    .line 142
    invoke-static {v4, v5}, Lv8/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v4

    .line 146
    if-eqz v4, :cond_3

    .line 147
    .line 148
    move-object v2, v3

    .line 149
    goto :goto_2

    .line 150
    :cond_4
    check-cast v2, Ly0/j;

    .line 151
    .line 152
    if-eqz v2, :cond_6

    .line 153
    .line 154
    invoke-static {}, LA0/g;->n()Z

    .line 155
    .line 156
    .line 157
    move-result p2

    .line 158
    if-eqz p2, :cond_5

    .line 159
    .line 160
    invoke-virtual {v2}, Ly0/j;->toString()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    :cond_5
    invoke-virtual {v0}, Ly0/O;->b()Ly0/l;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    invoke-virtual {p1, v2}, Ly0/l;->b(Ly0/j;)V

    .line 171
    .line 172
    .line 173
    :cond_6
    return-void

    .line 174
    nop

    .line 175
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

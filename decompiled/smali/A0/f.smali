.class public final synthetic LA0/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq0/O;


# instance fields
.field public final synthetic s:Ly0/l;

.field public final synthetic t:LA0/g;


# direct methods
.method public synthetic constructor <init>(Ly0/l;LA0/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA0/f;->s:Ly0/l;

    iput-object p2, p0, LA0/f;->t:LA0/g;

    return-void
.end method


# virtual methods
.method public final b(Landroidx/fragment/app/e;Landroidx/fragment/app/b;)V
    .locals 5

    .line 1
    iget-object v0, p0, LA0/f;->s:Ly0/l;

    .line 2
    .line 3
    iget-object v1, p0, LA0/f;->t:LA0/g;

    .line 4
    .line 5
    const-string v2, "this$0"

    .line 6
    .line 7
    invoke-static {v1, v2}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string v2, "<anonymous parameter 0>"

    .line 11
    .line 12
    invoke-static {p1, v2}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string p1, "fragment"

    .line 16
    .line 17
    invoke-static {p2, p1}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iget-object p1, v0, Ly0/l;->e:LP0/d;

    .line 21
    .line 22
    iget-object p1, p1, LP0/d;->t:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p1, LQ9/m;

    .line 25
    .line 26
    check-cast p1, LQ9/t;

    .line 27
    .line 28
    invoke-virtual {p1}, LQ9/t;->f()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    check-cast p1, Ljava/util/List;

    .line 33
    .line 34
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    invoke-interface {p1, v2}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    :cond_0
    invoke-interface {p1}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-eqz v2, :cond_1

    .line 47
    .line 48
    invoke-interface {p1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    move-object v3, v2

    .line 53
    check-cast v3, Ly0/j;

    .line 54
    .line 55
    iget-object v3, v3, Ly0/j;->x:Ljava/lang/String;

    .line 56
    .line 57
    iget-object v4, p2, Landroidx/fragment/app/b;->T:Ljava/lang/String;

    .line 58
    .line 59
    invoke-static {v3, v4}, Lv8/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    if-eqz v3, :cond_0

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    const/4 v2, 0x0

    .line 67
    :goto_0
    check-cast v2, Ly0/j;

    .line 68
    .line 69
    invoke-static {}, LA0/g;->n()Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    if-eqz p1, :cond_2

    .line 74
    .line 75
    invoke-virtual {p2}, Landroidx/fragment/app/b;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    invoke-static {v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    iget-object p1, v1, LA0/g;->d:Landroidx/fragment/app/e;

    .line 82
    .line 83
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    :cond_2
    if-eqz v2, :cond_3

    .line 87
    .line 88
    new-instance p1, LA0/k;

    .line 89
    .line 90
    invoke-direct {p1, v1, p2, v2}, LA0/k;-><init>(LA0/g;Landroidx/fragment/app/b;Ly0/j;)V

    .line 91
    .line 92
    .line 93
    new-instance v3, LA0/p;

    .line 94
    .line 95
    const/4 v4, 0x0

    .line 96
    invoke-direct {v3, p1, v4}, LA0/p;-><init>(Lv8/k;I)V

    .line 97
    .line 98
    .line 99
    iget-object p1, p2, Landroidx/fragment/app/b;->n0:Landroidx/lifecycle/A;

    .line 100
    .line 101
    invoke-virtual {p1, p2, v3}, Landroidx/lifecycle/A;->d(Landroidx/lifecycle/s;Landroidx/lifecycle/B;)V

    .line 102
    .line 103
    .line 104
    iget-object p1, p2, Landroidx/fragment/app/b;->l0:Landroidx/lifecycle/u;

    .line 105
    .line 106
    iget-object v3, v1, LA0/g;->h:LA0/e;

    .line 107
    .line 108
    invoke-virtual {p1, v3}, Landroidx/lifecycle/u;->a(Landroidx/lifecycle/r;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v1, p2, v2, v0}, LA0/g;->l(Landroidx/fragment/app/b;Ly0/j;Ly0/l;)V

    .line 112
    .line 113
    .line 114
    :cond_3
    return-void
    .line 115
    .line 116
    .line 117
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
.end method

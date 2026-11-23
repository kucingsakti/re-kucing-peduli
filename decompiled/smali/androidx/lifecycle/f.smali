.class public final Landroidx/lifecycle/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/q;


# instance fields
.field public final synthetic s:I

.field public final t:Ljava/lang/Object;

.field public final u:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/r;)V
    .locals 2

    const/4 v0, 0x2

    iput v0, p0, Landroidx/lifecycle/f;->s:I

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Landroidx/lifecycle/f;->t:Ljava/lang/Object;

    .line 7
    sget-object v0, Landroidx/lifecycle/d;->c:Landroidx/lifecycle/d;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    .line 8
    iget-object v1, v0, Landroidx/lifecycle/d;->a:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/lifecycle/b;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 9
    invoke-virtual {v0, p1, v1}, Landroidx/lifecycle/d;->a(Ljava/lang/Class;[Ljava/lang/reflect/Method;)Landroidx/lifecycle/b;

    move-result-object v1

    .line 10
    :goto_0
    iput-object v1, p0, Landroidx/lifecycle/f;->u:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lb1/e;Lb1/f;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Landroidx/lifecycle/f;->s:I

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/lifecycle/f;->u:Ljava/lang/Object;

    iput-object p2, p0, Landroidx/lifecycle/f;->t:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/lifecycle/f;->s:I

    iput-object p1, p0, Landroidx/lifecycle/f;->t:Ljava/lang/Object;

    iput-object p3, p0, Landroidx/lifecycle/f;->u:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ll0/h;Landroidx/lifecycle/q;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Landroidx/lifecycle/f;->s:I

    const-string v0, "defaultLifecycleObserver"

    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Landroidx/lifecycle/f;->t:Ljava/lang/Object;

    .line 4
    iput-object p2, p0, Landroidx/lifecycle/f;->u:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final onStateChanged(Landroidx/lifecycle/s;Landroidx/lifecycle/m;)V
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/f;->u:Ljava/lang/Object;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/lifecycle/f;->t:Ljava/lang/Object;

    .line 4
    .line 5
    iget v2, p0, Landroidx/lifecycle/f;->s:I

    .line 6
    .line 7
    packed-switch v2, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v2, Landroidx/lifecycle/m;->ON_DESTROY:Landroidx/lifecycle/m;

    .line 11
    .line 12
    if-ne p2, v2, :cond_0

    .line 13
    .line 14
    check-cast v1, Landroid/os/Handler;

    .line 15
    .line 16
    check-cast v0, LA1/c;

    .line 17
    .line 18
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 19
    .line 20
    .line 21
    invoke-interface {p1}, Landroidx/lifecycle/s;->g()Landroidx/lifecycle/u;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1, p0}, Landroidx/lifecycle/u;->f(Landroidx/lifecycle/r;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void

    .line 29
    :pswitch_0
    check-cast v0, Lb1/e;

    .line 30
    .line 31
    iget-object p2, v0, Lb1/e;->e:Lq0/M;

    .line 32
    .line 33
    invoke-virtual {p2}, Landroidx/fragment/app/e;->P()Z

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    if-eqz p2, :cond_1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    invoke-interface {p1}, Landroidx/lifecycle/s;->g()Landroidx/lifecycle/u;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p1, p0}, Landroidx/lifecycle/u;->f(Landroidx/lifecycle/r;)V

    .line 45
    .line 46
    .line 47
    check-cast v1, Lb1/f;

    .line 48
    .line 49
    iget-object p1, v1, Landroidx/recyclerview/widget/RecyclerView$a;->s:Landroid/view/View;

    .line 50
    .line 51
    check-cast p1, Landroid/widget/FrameLayout;

    .line 52
    .line 53
    sget-object p2, LU/U;->a:Ljava/util/WeakHashMap;

    .line 54
    .line 55
    invoke-virtual {p1}, Landroid/view/View;->isAttachedToWindow()Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    if-eqz p1, :cond_2

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Lb1/e;->q(Lb1/f;)V

    .line 62
    .line 63
    .line 64
    :cond_2
    :goto_0
    return-void

    .line 65
    :pswitch_1
    check-cast v0, Landroidx/lifecycle/b;

    .line 66
    .line 67
    iget-object v0, v0, Landroidx/lifecycle/b;->a:Ljava/util/HashMap;

    .line 68
    .line 69
    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    check-cast v2, Ljava/util/List;

    .line 74
    .line 75
    check-cast v1, Landroidx/lifecycle/r;

    .line 76
    .line 77
    invoke-static {v2, p1, p2, v1}, Landroidx/lifecycle/b;->a(Ljava/util/List;Landroidx/lifecycle/s;Landroidx/lifecycle/m;Landroidx/lifecycle/r;)V

    .line 78
    .line 79
    .line 80
    sget-object v2, Landroidx/lifecycle/m;->ON_ANY:Landroidx/lifecycle/m;

    .line 81
    .line 82
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    check-cast v0, Ljava/util/List;

    .line 87
    .line 88
    invoke-static {v0, p1, p2, v1}, Landroidx/lifecycle/b;->a(Ljava/util/List;Landroidx/lifecycle/s;Landroidx/lifecycle/m;Landroidx/lifecycle/r;)V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :pswitch_2
    sget-object p1, Landroidx/lifecycle/m;->ON_START:Landroidx/lifecycle/m;

    .line 93
    .line 94
    if-ne p2, p1, :cond_3

    .line 95
    .line 96
    check-cast v1, Landroidx/lifecycle/u;

    .line 97
    .line 98
    invoke-virtual {v1, p0}, Landroidx/lifecycle/u;->f(Landroidx/lifecycle/r;)V

    .line 99
    .line 100
    .line 101
    check-cast v0, LN0/e;

    .line 102
    .line 103
    invoke-virtual {v0}, LN0/e;->g()V

    .line 104
    .line 105
    .line 106
    :cond_3
    return-void

    .line 107
    :pswitch_3
    sget-object v2, Landroidx/lifecycle/e;->a:[I

    .line 108
    .line 109
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    aget v2, v2, v3

    .line 114
    .line 115
    check-cast v1, Ll0/h;

    .line 116
    .line 117
    packed-switch v2, :pswitch_data_1

    .line 118
    .line 119
    .line 120
    goto :goto_2

    .line 121
    :pswitch_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 122
    .line 123
    const-string p2, "ON_ANY must not been send by anybody"

    .line 124
    .line 125
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    throw p1

    .line 129
    :pswitch_5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    goto :goto_2

    .line 133
    :pswitch_6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    goto :goto_2

    .line 137
    :pswitch_7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    goto :goto_2

    .line 141
    :pswitch_8
    iget-object v2, v1, Ll0/h;->t:Landroidx/emoji2/text/EmojiCompatInitializer;

    .line 142
    .line 143
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 144
    .line 145
    const/16 v3, 0x1c

    .line 146
    .line 147
    if-lt v2, v3, :cond_4

    .line 148
    .line 149
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    invoke-static {v2}, Ll0/a;->a(Landroid/os/Looper;)Landroid/os/Handler;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    goto :goto_1

    .line 158
    :cond_4
    new-instance v2, Landroid/os/Handler;

    .line 159
    .line 160
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 161
    .line 162
    .line 163
    move-result-object v3

    .line 164
    invoke-direct {v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 165
    .line 166
    .line 167
    :goto_1
    new-instance v3, LB4/h;

    .line 168
    .line 169
    const/4 v4, 0x3

    .line 170
    invoke-direct {v3, v4}, LB4/h;-><init>(I)V

    .line 171
    .line 172
    .line 173
    const-wide/16 v4, 0x1f4

    .line 174
    .line 175
    invoke-virtual {v2, v3, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 176
    .line 177
    .line 178
    iget-object v2, v1, Ll0/h;->s:Landroidx/lifecycle/u;

    .line 179
    .line 180
    invoke-virtual {v2, v1}, Landroidx/lifecycle/u;->f(Landroidx/lifecycle/r;)V

    .line 181
    .line 182
    .line 183
    goto :goto_2

    .line 184
    :pswitch_9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    goto :goto_2

    .line 188
    :pswitch_a
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    :goto_2
    check-cast v0, Landroidx/lifecycle/q;

    .line 192
    .line 193
    if-eqz v0, :cond_5

    .line 194
    .line 195
    invoke-interface {v0, p1, p2}, Landroidx/lifecycle/q;->onStateChanged(Landroidx/lifecycle/s;Landroidx/lifecycle/m;)V

    .line 196
    .line 197
    .line 198
    :cond_5
    return-void

    .line 199
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

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
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
    .end packed-switch
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

.class public final LC0/p;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, LC0/p;->a:I

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Landroid/os/Looper;I)V
    .locals 0

    .line 2
    iput p3, p0, LC0/p;->a:I

    iput-object p1, p0, LC0/p;->b:Ljava/lang/Object;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method

.method public constructor <init>(Lm8/i;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, LC0/p;->a:I

    .line 3
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 4
    iput-object p1, p0, LC0/p;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 10

    .line 1
    iget v0, p0, LC0/p;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p1, Landroid/os/Message;->what:I

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    if-eq v0, v1, :cond_0

    .line 10
    .line 11
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object p1, p0, LC0/p;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p1, Lx0/b;

    .line 18
    .line 19
    :cond_1
    iget-object v0, p1, Lx0/b;->b:Ljava/util/HashMap;

    .line 20
    .line 21
    monitor-enter v0

    .line 22
    :try_start_0
    iget-object v1, p1, Lx0/b;->d:Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-gtz v1, :cond_2

    .line 29
    .line 30
    monitor-exit v0

    .line 31
    :goto_0
    return-void

    .line 32
    :catchall_0
    move-exception p1

    .line 33
    goto :goto_3

    .line 34
    :cond_2
    new-array v2, v1, [Lo1/r;

    .line 35
    .line 36
    iget-object v3, p1, Lx0/b;->d:Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    iget-object v3, p1, Lx0/b;->d:Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 44
    .line 45
    .line 46
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    const/4 v0, 0x0

    .line 48
    move v3, v0

    .line 49
    :goto_1
    if-ge v3, v1, :cond_1

    .line 50
    .line 51
    aget-object v4, v2, v3

    .line 52
    .line 53
    iget-object v5, v4, Lo1/r;->u:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v5, Ljava/util/ArrayList;

    .line 56
    .line 57
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    move v6, v0

    .line 62
    :goto_2
    if-ge v6, v5, :cond_3

    .line 63
    .line 64
    iget-object v7, v4, Lo1/r;->u:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v7, Ljava/util/ArrayList;

    .line 67
    .line 68
    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v7

    .line 72
    check-cast v7, Lx0/a;

    .line 73
    .line 74
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    iget-object v7, v7, Lx0/a;->b:Lu1/c;

    .line 78
    .line 79
    iget-object v8, p1, Lx0/b;->a:Landroid/content/Context;

    .line 80
    .line 81
    iget-object v9, v4, Lo1/r;->t:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v9, Landroid/content/Intent;

    .line 84
    .line 85
    invoke-virtual {v7, v8, v9}, Lu1/c;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V

    .line 86
    .line 87
    .line 88
    add-int/lit8 v6, v6, 0x1

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :goto_3
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 95
    throw p1

    .line 96
    :pswitch_0
    const-string v0, "msg"

    .line 97
    .line 98
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    iget v0, p1, Landroid/os/Message;->what:I

    .line 102
    .line 103
    const/4 v1, 0x3

    .line 104
    if-ne v0, v1, :cond_6

    .line 105
    .line 106
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    if-eqz p1, :cond_4

    .line 111
    .line 112
    const-string v0, "SessionUpdateExtra"

    .line 113
    .line 114
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    if-nez p1, :cond_5

    .line 119
    .line 120
    :cond_4
    const-string p1, ""

    .line 121
    .line 122
    :cond_5
    iget-object v0, p0, LC0/p;->b:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v0, Lm8/i;

    .line 125
    .line 126
    invoke-static {v0}, LN9/z;->b(Lm8/i;)LS9/e;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    new-instance v2, Ls4/O;

    .line 131
    .line 132
    const/4 v3, 0x0

    .line 133
    invoke-direct {v2, p1, v3}, Ls4/O;-><init>(Ljava/lang/String;Lm8/d;)V

    .line 134
    .line 135
    .line 136
    invoke-static {v0, v3, v2, v1}, LN9/z;->n(LN9/y;Lm8/a;Lu8/c;I)LN9/p0;

    .line 137
    .line 138
    .line 139
    goto :goto_4

    .line 140
    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 141
    .line 142
    const-string v1, "Received unexpected event from the SessionLifecycleService: "

    .line 143
    .line 144
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    const-string v1, "SessionLifecycleClient"

    .line 155
    .line 156
    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 157
    .line 158
    .line 159
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 160
    .line 161
    .line 162
    :goto_4
    return-void

    .line 163
    :pswitch_1
    iget v0, p1, Landroid/os/Message;->what:I

    .line 164
    .line 165
    const/4 v1, -0x3

    .line 166
    if-eq v0, v1, :cond_8

    .line 167
    .line 168
    const/4 v1, -0x2

    .line 169
    if-eq v0, v1, :cond_8

    .line 170
    .line 171
    const/4 v1, -0x1

    .line 172
    if-eq v0, v1, :cond_8

    .line 173
    .line 174
    const/4 v1, 0x1

    .line 175
    if-eq v0, v1, :cond_7

    .line 176
    .line 177
    goto :goto_5

    .line 178
    :cond_7
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast p1, Landroid/content/DialogInterface;

    .line 181
    .line 182
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 183
    .line 184
    .line 185
    goto :goto_5

    .line 186
    :cond_8
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 187
    .line 188
    check-cast v0, Landroid/content/DialogInterface$OnClickListener;

    .line 189
    .line 190
    iget-object v1, p0, LC0/p;->b:Ljava/lang/Object;

    .line 191
    .line 192
    check-cast v1, Ljava/lang/ref/WeakReference;

    .line 193
    .line 194
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    check-cast v1, Landroid/content/DialogInterface;

    .line 199
    .line 200
    iget p1, p1, Landroid/os/Message;->what:I

    .line 201
    .line 202
    invoke-interface {v0, v1, p1}, Landroid/content/DialogInterface$OnClickListener;->onClick(Landroid/content/DialogInterface;I)V

    .line 203
    .line 204
    .line 205
    :goto_5
    return-void

    .line 206
    :pswitch_2
    iget p1, p1, Landroid/os/Message;->what:I

    .line 207
    .line 208
    const/4 v0, 0x1

    .line 209
    if-eq p1, v0, :cond_9

    .line 210
    .line 211
    goto :goto_6

    .line 212
    :cond_9
    iget-object p1, p0, LC0/p;->b:Ljava/lang/Object;

    .line 213
    .line 214
    check-cast p1, LC0/r;

    .line 215
    .line 216
    iget-object v0, p1, LC0/r;->u0:LC0/v;

    .line 217
    .line 218
    iget-object v0, v0, LC0/v;->g:Landroidx/preference/PreferenceScreen;

    .line 219
    .line 220
    if-eqz v0, :cond_a

    .line 221
    .line 222
    iget-object p1, p1, LC0/r;->v0:Landroidx/recyclerview/widget/RecyclerView;

    .line 223
    .line 224
    new-instance v1, LC0/t;

    .line 225
    .line 226
    invoke-direct {v1, v0}, LC0/t;-><init>(Landroidx/preference/PreferenceGroup;)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/s;)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v0}, Landroidx/preference/PreferenceGroup;->o()V

    .line 233
    .line 234
    .line 235
    :cond_a
    :goto_6
    return-void

    .line 236
    nop

    .line 237
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

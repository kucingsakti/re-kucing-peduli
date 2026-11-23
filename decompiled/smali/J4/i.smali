.class public final synthetic LJ4/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic s:I

.field public final synthetic t:Lcom/kcstream/cing/fragment/TabsDownloadsFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/kcstream/cing/fragment/TabsDownloadsFragment;I)V
    .locals 0

    .line 1
    iput p2, p0, LJ4/i;->s:I

    iput-object p1, p0, LJ4/i;->t:Lcom/kcstream/cing/fragment/TabsDownloadsFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    .line 1
    iget v0, p0, LJ4/i;->s:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p2, p0, LJ4/i;->t:Lcom/kcstream/cing/fragment/TabsDownloadsFragment;

    .line 7
    .line 8
    const-string v0, "this$0"

    .line 9
    .line 10
    invoke-static {p2, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p2, Lcom/kcstream/cing/fragment/TabsDownloadsFragment;->x0:Ljava/io/File;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-static {v0}, Ls8/h;->B(Ljava/io/File;)V

    .line 18
    .line 19
    .line 20
    iget-object p2, p2, Lcom/kcstream/cing/fragment/TabsDownloadsFragment;->u0:LCa/c;

    .line 21
    .line 22
    if-eqz p2, :cond_0

    .line 23
    .line 24
    iget-object v0, p2, LCa/c;->i:Ljava/util/List;

    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p2}, LCa/c;->q()V

    .line 30
    .line 31
    .line 32
    :cond_0
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    const-string p1, "path"

    .line 37
    .line 38
    invoke-static {p1}, Lv8/i;->n(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const/4 p1, 0x0

    .line 42
    throw p1

    .line 43
    :pswitch_0
    const-string p1, "this$0"

    .line 44
    .line 45
    iget-object v0, p0, LJ4/i;->t:Lcom/kcstream/cing/fragment/TabsDownloadsFragment;

    .line 46
    .line 47
    invoke-static {v0, p1}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    iget-object p1, v0, Lcom/kcstream/cing/fragment/TabsDownloadsFragment;->v0:Ljava/util/ArrayList;

    .line 51
    .line 52
    const/4 v1, 0x1

    .line 53
    if-eqz p2, :cond_6

    .line 54
    .line 55
    if-eq p2, v1, :cond_4

    .line 56
    .line 57
    const/4 v2, 0x2

    .line 58
    if-eq p2, v2, :cond_2

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 62
    .line 63
    .line 64
    move-result p2

    .line 65
    if-le p2, v1, :cond_3

    .line 66
    .line 67
    new-instance p2, LF8/f;

    .line 68
    .line 69
    const/16 v1, 0xb

    .line 70
    .line 71
    invoke-direct {p2, v1}, LF8/f;-><init>(I)V

    .line 72
    .line 73
    .line 74
    invoke-static {p1, p2}, Li8/p;->I(Ljava/util/List;Ljava/util/Comparator;)V

    .line 75
    .line 76
    .line 77
    :cond_3
    iget-object p1, v0, Lcom/kcstream/cing/fragment/TabsDownloadsFragment;->u0:LCa/c;

    .line 78
    .line 79
    if-eqz p1, :cond_8

    .line 80
    .line 81
    invoke-virtual {p1}, LCa/c;->q()V

    .line 82
    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_4
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 86
    .line 87
    .line 88
    move-result p2

    .line 89
    if-le p2, v1, :cond_5

    .line 90
    .line 91
    new-instance p2, LF8/f;

    .line 92
    .line 93
    const/16 v1, 0xa

    .line 94
    .line 95
    invoke-direct {p2, v1}, LF8/f;-><init>(I)V

    .line 96
    .line 97
    .line 98
    invoke-static {p1, p2}, Li8/p;->I(Ljava/util/List;Ljava/util/Comparator;)V

    .line 99
    .line 100
    .line 101
    :cond_5
    iget-object p1, v0, Lcom/kcstream/cing/fragment/TabsDownloadsFragment;->u0:LCa/c;

    .line 102
    .line 103
    if-eqz p1, :cond_8

    .line 104
    .line 105
    invoke-virtual {p1}, LCa/c;->q()V

    .line 106
    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_6
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 110
    .line 111
    .line 112
    move-result p2

    .line 113
    if-le p2, v1, :cond_7

    .line 114
    .line 115
    new-instance p2, LF8/f;

    .line 116
    .line 117
    const/16 v1, 0x9

    .line 118
    .line 119
    invoke-direct {p2, v1}, LF8/f;-><init>(I)V

    .line 120
    .line 121
    .line 122
    invoke-static {p1, p2}, Li8/p;->I(Ljava/util/List;Ljava/util/Comparator;)V

    .line 123
    .line 124
    .line 125
    :cond_7
    iget-object p1, v0, Lcom/kcstream/cing/fragment/TabsDownloadsFragment;->u0:LCa/c;

    .line 126
    .line 127
    if-eqz p1, :cond_8

    .line 128
    .line 129
    invoke-virtual {p1}, LCa/c;->q()V

    .line 130
    .line 131
    .line 132
    :cond_8
    :goto_0
    return-void

    .line 133
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

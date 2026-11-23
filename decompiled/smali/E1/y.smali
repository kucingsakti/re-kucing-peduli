.class public final LE1/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE1/s;
.implements LM1/a;


# instance fields
.field public final synthetic s:I

.field public final t:Landroid/content/res/Resources;


# direct methods
.method public synthetic constructor <init>(Landroid/content/res/Resources;I)V
    .locals 0

    .line 1
    iput p2, p0, LE1/y;->s:I

    iput-object p1, p0, LE1/y;->t:Landroid/content/res/Resources;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public D(LE1/x;)LE1/r;
    .locals 3

    .line 1
    iget v0, p0, LE1/y;->s:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, LE1/b;

    .line 7
    .line 8
    const-class v1, Landroid/net/Uri;

    .line 9
    .line 10
    const-class v2, Ljava/io/InputStream;

    .line 11
    .line 12
    invoke-virtual {p1, v1, v2}, LE1/x;->b(Ljava/lang/Class;Ljava/lang/Class;)LE1/r;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iget-object v1, p0, LE1/y;->t:Landroid/content/res/Resources;

    .line 17
    .line 18
    invoke-direct {v0, v1, p1}, LE1/b;-><init>(Landroid/content/res/Resources;LE1/r;)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :pswitch_0
    new-instance v0, LE1/b;

    .line 23
    .line 24
    const-class v1, Landroid/net/Uri;

    .line 25
    .line 26
    const-class v2, Landroid/content/res/AssetFileDescriptor;

    .line 27
    .line 28
    invoke-virtual {p1, v1, v2}, LE1/x;->b(Ljava/lang/Class;Ljava/lang/Class;)LE1/r;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iget-object v1, p0, LE1/y;->t:Landroid/content/res/Resources;

    .line 33
    .line 34
    invoke-direct {v0, v1, p1}, LE1/b;-><init>(Landroid/content/res/Resources;LE1/r;)V

    .line 35
    .line 36
    .line 37
    return-object v0

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 40
    .line 41
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

.method public a(LA1/F;Ly1/h;)LA1/F;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return-object p1

    .line 5
    :cond_0
    new-instance p2, LH1/d;

    .line 6
    .line 7
    iget-object v0, p0, LE1/y;->t:Landroid/content/res/Resources;

    .line 8
    .line 9
    invoke-direct {p2, v0, p1}, LH1/d;-><init>(Landroid/content/res/Resources;LA1/F;)V

    .line 10
    .line 11
    .line 12
    return-object p2
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
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
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
.end method

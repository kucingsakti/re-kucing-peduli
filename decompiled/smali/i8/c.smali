.class public final Li8/c;
.super Li8/d;
.source "SourceFile"

# interfaces
.implements Ljava/util/RandomAccess;


# instance fields
.field public final synthetic s:I

.field public t:I

.field public u:I

.field public final v:Ljava/util/List;


# direct methods
.method public constructor <init>(Li8/d;II)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Li8/c;->s:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Li8/c;->v:Ljava/util/List;

    iput p2, p0, Li8/c;->t:I

    .line 3
    invoke-virtual {p1}, Li8/d;->e()I

    move-result p1

    .line 4
    invoke-static {p2, p3, p1}, Ls3/a;->c(III)V

    sub-int/2addr p3, p2

    .line 5
    iput p3, p0, Li8/c;->u:I

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Li8/c;->s:I

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object p1, p0, Li8/c;->v:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final e()I
    .locals 1

    .line 1
    iget v0, p0, Li8/c;->s:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, Li8/c;->u:I

    .line 7
    .line 8
    return v0

    .line 9
    :pswitch_0
    iget v0, p0, Li8/c;->u:I

    .line 10
    .line 11
    return v0

    .line 12
    nop

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final get(I)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Li8/c;->s:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, Li8/c;->u:I

    .line 7
    .line 8
    if-ltz p1, :cond_0

    .line 9
    .line 10
    if-ge p1, v0, :cond_0

    .line 11
    .line 12
    iget v0, p0, Li8/c;->t:I

    .line 13
    .line 14
    add-int/2addr v0, p1

    .line 15
    iget-object p1, p0, Li8/c;->v:Ljava/util/List;

    .line 16
    .line 17
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1

    .line 22
    :cond_0
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    .line 23
    .line 24
    const-string v2, "index: "

    .line 25
    .line 26
    const-string v3, ", size: "

    .line 27
    .line 28
    invoke-static {v2, p1, v3, v0}, Landroidx/datastore/preferences/protobuf/g;->h(Ljava/lang/String;ILjava/lang/String;I)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-direct {v1, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw v1

    .line 36
    :pswitch_0
    iget v0, p0, Li8/c;->u:I

    .line 37
    .line 38
    if-ltz p1, :cond_1

    .line 39
    .line 40
    if-ge p1, v0, :cond_1

    .line 41
    .line 42
    iget v0, p0, Li8/c;->t:I

    .line 43
    .line 44
    add-int/2addr v0, p1

    .line 45
    iget-object p1, p0, Li8/c;->v:Ljava/util/List;

    .line 46
    .line 47
    check-cast p1, Li8/d;

    .line 48
    .line 49
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    return-object p1

    .line 54
    :cond_1
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    .line 55
    .line 56
    const-string v2, "index: "

    .line 57
    .line 58
    const-string v3, ", size: "

    .line 59
    .line 60
    invoke-static {v2, p1, v3, v0}, Landroidx/datastore/preferences/protobuf/g;->h(Ljava/lang/String;ILjava/lang/String;I)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-direct {v1, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw v1

    .line 68
    nop

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

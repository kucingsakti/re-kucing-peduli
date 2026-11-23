.class public final Ld9/d;
.super LB1/a;
.source "SourceFile"


# instance fields
.field public final synthetic t:I

.field public final synthetic u:Ld9/c;


# direct methods
.method public synthetic constructor <init>(Ld9/c;I)V
    .locals 0

    .line 1
    iput p2, p0, Ld9/d;->t:I

    iput-object p1, p0, Ld9/d;->u:Ld9/c;

    const/4 p1, 0x5

    invoke-direct {p0, p1}, LB1/a;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final T0([Ljava/lang/String;)V
    .locals 1

    .line 1
    iget v0, p0, Ld9/d;->t:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Ld9/d;->u:Ld9/c;

    .line 9
    .line 10
    iget-object v0, v0, Ld9/c;->t:Ld9/e;

    .line 11
    .line 12
    iput-object p1, v0, Ld9/e;->e:[Ljava/lang/String;

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 16
    .line 17
    const-string v0, "Argument for @NotNull parameter \'data\' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2.visitEnd must not be null"

    .line 18
    .line 19
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw p1

    .line 23
    :pswitch_0
    if-eqz p1, :cond_1

    .line 24
    .line 25
    iget-object v0, p0, Ld9/d;->u:Ld9/c;

    .line 26
    .line 27
    iget-object v0, v0, Ld9/c;->t:Ld9/e;

    .line 28
    .line 29
    iput-object p1, v0, Ld9/e;->d:[Ljava/lang/String;

    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 33
    .line 34
    const-string v0, "Argument for @NotNull parameter \'data\' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1.visitEnd must not be null"

    .line 35
    .line 36
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw p1

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.class public final LF8/h;
.super LF8/t0;
.source "SourceFile"


# instance fields
.field public final t:Ljava/lang/reflect/Constructor;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Constructor;)V
    .locals 1

    .line 1
    const-string v0, "constructor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LF8/h;->t:Ljava/lang/reflect/Constructor;

    .line 10
    .line 11
    return-void
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
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method


# virtual methods
.method public final d()Ljava/lang/String;
    .locals 5

    .line 1
    iget-object v0, p0, LF8/h;->t:Ljava/lang/reflect/Constructor;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "constructor.parameterTypes"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    sget-object v1, LF8/b;->w:LF8/b;

    .line 13
    .line 14
    const-string v2, "<init>("

    .line 15
    .line 16
    const-string v3, ")V"

    .line 17
    .line 18
    const/16 v4, 0x18

    .line 19
    .line 20
    invoke-static {v0, v2, v3, v1, v4}, Li8/i;->A([Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Lu8/b;I)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    return-object v0
    .line 25
    .line 26
.end method

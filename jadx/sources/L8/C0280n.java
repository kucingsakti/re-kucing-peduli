package L8;

/* JADX INFO: renamed from: L8.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0280n {
    public final e0 a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2818b;

    public C0280n(e0 e0Var, int i10) {
        this.f2818b = i10;
        p210v8.i.f(e0Var, "delegate");
        this.a = e0Var;
    }

    /* JADX WARN: Code duplicated, block: B:130:0x0272 A[ADDED_TO_REGION, LOOP:1: B:130:0x0272->B:142:0x02a3, LOOP_START, PHI: r9
      0x0272: PHI (r9v2 L8.j) = (r9v0 L8.j), (r9v3 L8.j) binds: [B:128:0x026f, B:142:0x02a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:131:0x0274  */
    /* JADX WARN: Code duplicated, block: B:133:0x0277  */
    /* JADX WARN: Code duplicated, block: B:142:0x02a3 A[LOOP:1: B:130:0x0272->B:142:0x02a3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:153:0x02a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:154:0x027b A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [L8.j] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r8v0, types: [L8.j, L8.m] */
    /* JADX WARN: Type inference failed for: r8v6, types: [L8.j] */
    /* JADX WARN: Type inference failed for: r8v7, types: [L8.j] */
    /* JADX WARN: Type inference failed for: r8v9, types: [L8.j] */
    public final boolean a(N n10, InterfaceC0279m interfaceC0279m, InterfaceC0276j interfaceC0276j) {
        InterfaceC0271e interfaceC0271e;
        switch (this.f2818b) {
            case 0:
                if (interfaceC0276j == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1", "isVisible"));
                }
                if (p124m9.e.s(interfaceC0279m) && p124m9.e.f(interfaceC0276j) != N.f2800t) {
                    return AbstractC0281o.d(interfaceC0279m, interfaceC0276j);
                }
                if (interfaceC0279m instanceof InterfaceC0275i) {
                    ((InterfaceC0275i) interfaceC0279m).v();
                }
                while (interfaceC0279m != 0) {
                    interfaceC0279m = interfaceC0279m.v();
                    if (((interfaceC0279m instanceof InterfaceC0271e) && !p124m9.e.l(interfaceC0279m)) || (interfaceC0279m instanceof D)) {
                        if (interfaceC0279m != 0) {
                            while (interfaceC0276j != null) {
                                if (interfaceC0279m != interfaceC0276j) {
                                    if (interfaceC0276j instanceof D) {
                                        interfaceC0276j = interfaceC0276j.v();
                                    } else if ((interfaceC0279m instanceof D) || !((O8.E) ((D) interfaceC0279m)).f3634w.equals(((O8.E) ((D) interfaceC0276j)).f3634w) || !p124m9.e.d(interfaceC0276j).equals(p124m9.e.d(interfaceC0279m))) {
                                    }
                                }
                                return true;
                            }
                        }
                        return false;
                    }
                }
                if (interfaceC0279m != 0) {
                    while (interfaceC0276j != null) {
                        if (interfaceC0279m != interfaceC0276j) {
                            if (interfaceC0276j instanceof D) {
                                interfaceC0276j = interfaceC0276j.v();
                            } else if (interfaceC0279m instanceof D) {
                            }
                        }
                        return true;
                    }
                }
                return false;
            case 1:
                if (interfaceC0276j == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2", "isVisible"));
                }
                if (AbstractC0281o.a.a(n10, interfaceC0279m, interfaceC0276j)) {
                    if (n10 == AbstractC0281o.f2828l) {
                        return true;
                    }
                    if (n10 != AbstractC0281o.f2827k) {
                        p124m9.e.i(interfaceC0279m, InterfaceC0271e.class, true);
                    }
                }
                return false;
            case 2:
                if (interfaceC0276j == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3", "isVisible"));
                }
                InterfaceC0271e interfaceC0271e2 = (InterfaceC0271e) p124m9.e.i(interfaceC0279m, InterfaceC0271e.class, true);
                InterfaceC0271e interfaceC0271e3 = (InterfaceC0271e) p124m9.e.i(interfaceC0276j, InterfaceC0271e.class, false);
                if (interfaceC0271e3 != null) {
                    if (interfaceC0271e2 != null && p124m9.e.l(interfaceC0271e2) && (interfaceC0271e = (InterfaceC0271e) p124m9.e.i(interfaceC0271e2, InterfaceC0271e.class, true)) != null && p124m9.e.r(interfaceC0271e3.p(), interfaceC0271e.c())) {
                        return true;
                    }
                    ?? T9 = interfaceC0279m instanceof InterfaceC0269c ? p124m9.e.t((InterfaceC0269c) interfaceC0279m) : interfaceC0279m;
                    InterfaceC0271e interfaceC0271e4 = (InterfaceC0271e) p124m9.e.i(T9, InterfaceC0271e.class, true);
                    if (interfaceC0271e4 != null) {
                        if (p124m9.e.r(interfaceC0271e3.p(), interfaceC0271e4.c()) && n10 != AbstractC0281o.f2829m) {
                            if (!(T9 instanceof InterfaceC0269c) || (T9 instanceof InterfaceC0275i) || n10 == AbstractC0281o.f2828l) {
                                return true;
                            }
                            if (n10 != AbstractC0281o.f2827k && n10 != null) {
                                n10.getType();
                                throw null;
                            }
                        }
                        return a(n10, interfaceC0279m, interfaceC0271e3.v());
                    }
                }
                return false;
            case 3:
                if (interfaceC0276j == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4", "isVisible"));
                }
                if (!p124m9.e.d(interfaceC0276j).J(p124m9.e.d(interfaceC0279m))) {
                    return false;
                }
                AbstractC0281o.f2830n.getClass();
                return true;
            case 4:
                if (interfaceC0276j != null) {
                    return true;
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$5", "isVisible"));
            case 5:
                if (interfaceC0276j == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$6", "isVisible"));
                }
                throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
            case 6:
                if (interfaceC0276j == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$7", "isVisible"));
                }
                throw new IllegalStateException("Visibility is unknown yet");
            case 7:
                if (interfaceC0276j != null) {
                    return false;
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$8", "isVisible"));
            case 8:
                if (interfaceC0276j != null) {
                    return false;
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$9", "isVisible"));
            case 9:
                if (interfaceC0276j != null) {
                    return U8.o.c(interfaceC0279m, interfaceC0276j);
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1", "isVisible"));
            case 10:
                if (interfaceC0276j != null) {
                    return U8.o.b(n10, interfaceC0279m, interfaceC0276j);
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$2", "isVisible"));
            default:
                if (interfaceC0276j != null) {
                    return U8.o.b(n10, interfaceC0279m, interfaceC0276j);
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$3", "isVisible"));
        }
    }

    public final String toString() {
        return this.a.d();
    }
}

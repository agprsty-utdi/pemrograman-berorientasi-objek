package sepuluh;

public class Child extends Parent implements MRequires, MProvides {
  private final MProvides mixin;

  public Child(int value) {
    super(value);
    this.mixin = new Mixin(this);
  }

  public void func() {
    mixin.func();
  }
}

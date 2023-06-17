package sepuluh;

public class Mixin implements MProvides {
  private final MRequires parent;

  public Mixin(MRequires parent) {
    this.parent = parent;
  }

  public void func() {
    System.out.println("Nilai dari method func: " + parent.getValue());
  }
}

public final class Range<C extends Comparable> extends RangeGwtSerializationDependencies
    implements Predicate<C>, Serializable {

  static class LowerBoundFn implements Function<Range, Cut> {
    static final LowerBoundFn INSTANCE = new LowerBoundFn();

    @Override
    public Cut apply(Range range) {
      return range.lowerBound;
    }
  }
